import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GestorTarefas gestor = new GestorTarefas();

        int opcao;

        do {

            System.out.println("\n==============================");
            System.out.println("  Projeto - Planner Pessoal   ");
            System.out.println("==============================");

            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Consultar todas as tarefas");
            System.out.println("3. Consultar por categoria");
            System.out.println("4. Marcar tarefa como concluída");
            System.out.println("5. Eliminar tarefa");
            System.out.println("6. Guardar tarefas");
            System.out.println("0. Sair");

            System.out.print("\nEscolhe uma opção: ");

            opcao = lerInteiro(scanner);

            switch (opcao) {

                case 1:

                    System.out.println("\n--- ADICIONAR TAREFA ---");

                    System.out.println("1. Faculdade");
                    System.out.println("2. Projetos");
                    System.out.println("3. Pessoal");
                    System.out.println("4. Treino");

                    System.out.print("Escolhe a categoria: ");

                    int categoria = lerInteiro(scanner);

                    System.out.print("Nome da tarefa: ");
                    String nome = scanner.nextLine();

                    System.out.print("Prazo (dd/mm/aaaa): ");
                    String prazo = scanner.nextLine();

                    int id = gestor.gerarProximoId();

                    Tarefa tarefa = null;

                    switch (categoria) {

                        case 1:
                            tarefa = new TarefaFaculdade(id, nome, prazo);
                            break;

                        case 2:
                            tarefa = new TarefaProjetos(id, nome, prazo);
                            break;

                        case 3:
                            tarefa = new TarefaPessoal(id, nome, prazo);
                            break;

                        case 4:
                            tarefa = new TarefaTreino(id, nome, prazo);
                            break;

                        default:
                            System.out.println("Categoria inválida.");
                    }

                    if (tarefa != null) {
                        gestor.adicionarTarefa(tarefa);
                    }

                    break;

                case 2:

                    gestor.consultarTarefas();
                    break;

                case 3:

                    System.out.println("\n--- CONSULTAR CATEGORIA ---");
                    System.out.println("1. Faculdade");
                    System.out.println("2. Projetos");
                    System.out.println("3. Pessoal");
                    System.out.println("4. Treino");

                    System.out.print("Escolhe a categoria: ");

                    int escolha = lerInteiro(scanner);

                    switch (escolha) {

                        case 1:
                            gestor.consultarPorCategoria("Faculdade");
                            break;

                        case 2:
                            gestor.consultarPorCategoria("Projetos");
                            break;

                        case 3:
                            gestor.consultarPorCategoria("Pessoal");
                            break;

                        case 4:
                            gestor.consultarPorCategoria("Treino");
                            break;

                        default:
                            System.out.println("Categoria inválida.");
                    }

                    break;

                case 4:

                    System.out.print("Indica o ID da tarefa: ");
                    int idConcluir = lerInteiro(scanner);

                    gestor.concluirTarefa(idConcluir);
                    break;

                case 5:

                    System.out.print("Indica o ID da tarefa: ");
                    int idEliminar = lerInteiro(scanner);

                    gestor.eliminarTarefa(idEliminar);
                    break;

                case 6:

                    gestor.guardarTarefas();
                    break;

                case 0:

                    gestor.guardarTarefas();

                    System.out.println("Obrigado por utilizar o MyPlanner!");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // Metodo para ler números inteiros
    public static int lerInteiro(Scanner scanner) {

        while (true) {

            try {
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.print("Introduz um número válido: ");
            }
        }
    }

}
