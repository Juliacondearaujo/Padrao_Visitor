package padroescomportamentais_exercicios.visitor;

public class FuncionarioVisitor implements Visitor {

    public String exibir(Funcionario funcionario) {
        return funcionario.aceitar(this);
    }

    @Override
    public String exibirManager(Manager manager) {
        return "Manager{" +
                "id=" + manager.getId() +
                ", nome='" + manager.getNome() + '\'' +
                ", equipe='" + manager.getEquipe() +'\'' +
                '}';
    }

    @Override
    public String exibirDeveloper(Developer developer) {
        return "Developer{" +
                "id=" + developer.getId() +
                ", nome='" + developer.getNome() + '\'' +
                '}';
    }


}
