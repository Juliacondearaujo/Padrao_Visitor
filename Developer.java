package padroescomportamentais_exercicios.visitor;

public class Developer implements Funcionario {

    private int id;
    private String nome;

    public Developer(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public String aceitar(Visitor visitor) {
        return visitor.exibirDeveloper(this);
    }

}
