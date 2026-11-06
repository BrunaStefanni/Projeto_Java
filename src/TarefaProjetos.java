// Class filha
/* Herança em Tarefa e implentação para interface concluivel */

public class TarefaProjetos extends Tarefa implements Concluivel {

    public TarefaProjetos(int id, String nome, String prazo) {
        super(id, nome, "Projetos", prazo);
    }

    @Override
    public void concluir() {
        super.concluir();
    }

}