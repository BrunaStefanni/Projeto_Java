// Class filha
/* Herança em Tarefa e implentação para interface concluivel */

public class TarefaPessoal extends Tarefa implements Concluivel {

    public TarefaPessoal(int id, String nome, String prazo) {
        super(id, nome, "Pessoal", prazo);
    }

    @Override
    public void concluir() {
        super.concluir();
    }

    @Override
    public void apresentarDetalhes() {
        System.out.println("Categoria: Pessoal");
        System.out.println("Nome: " + getNome());
    }

}
