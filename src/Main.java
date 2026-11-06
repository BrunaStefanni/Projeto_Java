import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GestorTarefas gestor = new GestorTarefas();

        // Menu
        System.out.println("==============================");
        System.out.println("  Projeto - Planner Pessoal   ");
        System.out.println("==============================");

        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Consultar todas as tarefas");
        System.out.println("3. Consultar por categoria");
        System.out.println("4. Marcar tarefa como concluída");
        System.out.println("5. Eliminar tarefa");
        System.out.println("6. Guardar tarefas");
        System.out.println("0. Sair");

        System.out.print("Selecione uma opção: ");

        int opcao = scanner.nextInt();

        scanner.close();
    }
}
