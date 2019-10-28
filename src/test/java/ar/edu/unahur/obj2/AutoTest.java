package ar.edu.unahur.obj2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    Auto peugeot;
    TipoConduccion tipoEcologico;
    TipoConduccion tipoDeportivo;
    Ecologica ecologica;
    Deportiva deportiva;



    @BeforeEach
    void setUp() {

        tipoEcologico = new Ecologica();
        peugeot = new Auto(tipoEcologico, 100, 10000);

        peugeot.avanzar(1200);
    }

    @Test
    void avanzarDEPORTIVO() {
        tipoDeportivo = new Deportiva();
        peugeot.setTipoConduccion(tipoDeportivo);
        peugeot.avanzar(125);
        assertEquals(0, peugeot.getCombustible());
    }

    @Test
    void VelocidadMAXdeportivo() {
        tipoDeportivo = new Deportiva();
        peugeot.setTipoConduccion(tipoDeportivo);
        assertEquals(180, peugeot.getVelocidadMAX());
    }

    @Test
    void consumoDEPORTIVO() {
        tipoDeportivo = new Deportiva();
        peugeot.setTipoConduccion(tipoDeportivo);
        assertEquals(5, peugeot.getConsumo());
    }

    @Test
    void Avanzar() {
        assertEquals(25, peugeot.getCombustible());
    }

    @Test
    void VelocidadMAX() {
        assertEquals(120, peugeot.getVelocidadMAX());
    }

    @Test
    void consumo() {
        assertEquals(16, peugeot.getConsumo());
    }
}