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

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPrazo() {
        return prazo
    }

    public boolean isConcluida() {
        return concluida;
    }

    // Setters
    /* apenas para as categorias que quero poder alterar futurarmente */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    // interface concluível
    public void concluir() {
        this.concluida = true;
    }

    // Metodo abstrato - chama class filha para mostrar detalhes
    public abstract void apresentarDetalhes();




}