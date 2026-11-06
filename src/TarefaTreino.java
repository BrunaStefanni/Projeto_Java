// Class filha
/* Herança em Tarefa e implentação para interface concluivel */

public class TarefaTreino extends Tarefa implements Concluivel {

    public TarefaTreino(int id, String nome, String prazo) {
        super(id, nome, "Treino", prazo);
    }

    @Override
    public void concluir() {
        super.concluir();
    }

}