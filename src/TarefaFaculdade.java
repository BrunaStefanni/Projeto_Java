// Class filha
/* Herança em Tarefa e implentação para interface concluivel */

public class TarefaFaculdade extends Tarefa implements Concluivel {

    public TarefaFaculdade(int id, String nome, String prazo) {
        super(id, nome, "Faculdade", prazo);
    }

    @Override
    public void concluir() {
        super.concluir();
    }
    
    @Override
    public void apresentarDetalhes() {
        System.out.println("Categoria: Faculdade");
        System.out.println("Nome: " + getNome());
    }



}
