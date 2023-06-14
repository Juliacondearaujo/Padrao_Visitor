package padroescomportamentais_exercicios.visitor;

public class Manager implements Funcionario {

    private int id;
    private String nome;
    private String equipe;

    public Manager(int id, String nome, String equipe) {
        this.id = id;
        this.nome = nome;
        this.equipe = equipe;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEquipe() {
        return equipe;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirManager(this);
    }

}
