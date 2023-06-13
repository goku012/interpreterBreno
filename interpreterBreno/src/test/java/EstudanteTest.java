import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstudanteTest {

    @Test
    void deveCalcularMediaComFormula() {
        Estudante estudante = new Estudante();
        estudante.setNota1(7.5);
        estudante.setNota2(8.0);

        assertEquals(6.6, estudante.calcularMedia(), 0.01);
    }

}