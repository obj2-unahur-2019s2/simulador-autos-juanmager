package ar.edu.unahur.obj2;

public class Ecologica implements TipoConduccion {

    @Override
    public int consumo() {
        return 16;
    }

    @Override
    public int velocidadMAX() {
        return 120;
    }
}
