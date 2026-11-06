public abstract class Tarefa {

    // Estrutura de Classes
    private int id;
    private String nome;
    private String categoria;
    private String prazo;
    private boolean concluida; //Para aprov ou repro

    // Construtor - Cria a Tarefa
    public Tarefa(int id, String nome, String categoria, String prazo) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.prazo = prazo;
        this.concluida = false; // Todas as tarefas iniciam pendentes
    }

}