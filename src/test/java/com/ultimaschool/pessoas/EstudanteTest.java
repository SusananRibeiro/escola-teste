package com.ultimaschool.pessoas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstudanteTest {
    Estudante estudante1;
    Estudante estudante2;
    Estudante estudante3;
    double[] listaNotas = {9.0, 6.0, 8.0};
    @BeforeEach
    void setUp() {
        this.estudante1 = new Estudante("Susana");
        this.estudante2 = new Estudante("Camila");
        this.estudante3 = new Estudante("Rodrigo");
    }
    @Test
    void testGetMatricula() {

    }
    @Test
    void testSetMatricula() {
    }
    @Test
    void testGetNotas() {
        Assertions.assertNotNull(estudante1.getNotas());
        Assertions.assertNotNull(estudante2.getNotas());
        Assertions.assertNotNull(estudante3.getNotas());
        estudante1.consolidarNota(1, 9.0);
        estudante2.consolidarNota(1, 9.0);
        estudante3.consolidarNota(1, 8.0);
        Assertions.assertEquals(estudante1.getNotas()[0], 6.0);
        Assertions.assertEquals(estudante2.getNotas()[0], 9.0);
        Assertions.assertEquals(estudante3.getNotas()[0], 8.0);
        estudante1.consolidarNota(2, 7.0);
        estudante2.consolidarNota(2, 6.0);
        estudante3.consolidarNota(2, 10.0);
        Assertions.assertEquals(estudante1.getNotas()[1], 7.0);
        Assertions.assertEquals(estudante2.getNotas()[1], 6.0);
        Assertions.assertEquals(estudante3.getNotas()[1], 10.0);
    }
    @Test
    void testSetNotas() {
        estudante1.setNotas(listaNotas);
        Assertions.assertEquals(estudante1.getNotas()[0], 9.0);
        Assertions.assertEquals(estudante1.getNotas()[1], 6.0);
        Assertions.assertEquals(estudante1.getNotas()[2], 8.0);
    }
    @Test
    void testConsolidarNota() {
    }
    @Test
    void testCalcularMediaFinal() {
    }
    @Test
    void testVerSituacao() {
    }
    @Test
    void testRelatorio() {
    }
    @AfterEach
    void tearDown() {
        estudante1 = null;
        estudante2 = null;
        estudante3 = null;
    }
}