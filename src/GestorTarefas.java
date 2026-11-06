// Class responsável por gerir as tarefas

import java.util.ArrayList; // Onde vamos guardar os objetos - tarefas
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GestorTarefas {

    private ArrayList<Tarefa> tarefas;
    private File arquivo;

    // Construtor
    public GestorTarefas() {
        tarefas = new ArrayList<>();
        arquivo = new File("tarefas.txt"); // é onde vou guardar minhas tarefas
        carregarTarefas();
    }

    // Gerar próximo ID
    public int gerarProximoId() {
        int maiorId = 0;

        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() > maiorId) {
                maiorId = tarefa.getId();
            }
        }

        return maiorId + 1;
    }

    // Adicionar tarefa
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    // Consultar todas as tarefas
    public void consultarTarefas() {

        if (tarefas.isEmpty()) {
            System.out.println("Ainda não existem tarefas.");
            return;
        }

        for (Tarefa tarefa : tarefas) {
            System.out.println("-------------------------");
            System.out.println("ID: " + tarefa.getId());

            tarefa.apresentarDetalhes();

            System.out.println("Prazo: " + tarefa.getPrazo());

            if (tarefa.isConcluida()) {
                System.out.println("Estado: Concluída");
            } else {
                System.out.println("Estado: Pendente");
            }
        }
    }

    // Consultar por categoria
    public void consultarPorCategoria(String categoria) {

        boolean encontrada = false;

        for (Tarefa tarefa : tarefas) {

            if (tarefa.getCategoria().equalsIgnoreCase(categoria)) {

                System.out.println("-------------------------");
                System.out.println("ID: " + tarefa.getId());
                tarefa.apresentarDetalhes();
                System.out.println("Prazo: " + tarefa.getPrazo());
                System.out.println("Concluída: " + tarefa.isConcluida());

                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("Não existem tarefas nesta categoria.");
        }
    }

    // Marcar tarefa como concluída
    public void concluirTarefa(int id) {

        for (Tarefa tarefa : tarefas) {

            if (tarefa.getId() == id) {
                tarefa.concluir();
                System.out.println("Tarefa concluída com sucesso!");
                return;
            }
        }

        System.out.println("Tarefa não encontrada.");
    }

    // Eliminar tarefa
    public void eliminarTarefa(int id) {

        for (int i = 0; i < tarefas.size(); i++) {

            if (tarefas.get(i).getId() == id) {
                tarefas.remove(i);
                System.out.println("Tarefa eliminada com sucesso!");
                return;
            }
        }

        System.out.println("Tarefa não encontrada.");
    }

    // Guardar tarefas no ficheiro
    public void guardarTarefas() {

        try (PrintWriter escritor =
                     new PrintWriter(new FileWriter(arquivo))) {

            for (Tarefa tarefa : tarefas) {

                escritor.println(
                        tarefa.getId() + ";" +
                                tarefa.getCategoria() + ";" +
                                tarefa.getNome() + ";" +
                                tarefa.getPrazo() + ";" +
                                tarefa.isConcluida()
                );
            }

            System.out.println("Tarefas guardadas com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao guardar as tarefas.");
        }
    }

    // Carregar tarefas do ficheiro
    public void carregarTarefas() {

        if (!arquivo.exists()) {
            return;
        }

        try (Scanner leitor = new Scanner(arquivo)) {

            while (leitor.hasNextLine()) {

                String linha = leitor.nextLine();
                String[] dados = linha.split(";", -1);

                if (dados.length != 5) {
                    continue;
                }

                int id = Integer.parseInt(dados[0]);
                String categoria = dados[1];
                String nome = dados[2];
                String prazo = dados[3];
                boolean concluida = Boolean.parseBoolean(dados[4]);

                Tarefa tarefa = null;

                switch (categoria) {

                    case "Faculdade":
                        tarefa = new TarefaFaculdade(id, nome, prazo);
                        break;

                    case "Projetos":
                        tarefa = new TarefaProjetos(id, nome, prazo);
                        break;

                    case "Pessoal":
                        tarefa = new TarefaPessoal(id, nome, prazo);
                        break;

                    case "Treino":
                        tarefa = new TarefaTreino(id, nome, prazo);
                        break;
                }

                if (tarefa != null) {

                    if (concluida) {
                        tarefa.concluir();
                    }

                    tarefas.add(tarefa);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado.");
        } catch (NumberFormatException e) {
            System.out.println("Erro nos dados guardados.");
        }
    }

}
