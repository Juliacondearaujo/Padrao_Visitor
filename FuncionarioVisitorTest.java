package padroescomportamentais_exercicios.visitor;

import org.junit.jupiter.api.Test;
import padroescomportamentais.visitor.Funcionario;
import padroescomportamentais.visitor.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioVisitorTest {

    @Test
    void deveExibirDeveloper() {
        Developer developer = new Developer(1, "Ana");
        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("Developer{id=1, nome='Ana'}", visitor.exibir(developer));
    }

    @Test
    void deveExibirManager() {
        Manager manager = new Manager(1, "Julia", "Desenvolvimento");

        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("Manager{id=1, nome='Julia', equipe='Desenvolvimento'}", visitor.exibir(manager));
    }



}