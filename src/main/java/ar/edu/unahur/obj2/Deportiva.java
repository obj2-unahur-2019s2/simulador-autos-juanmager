package ar.edu.unahur.obj2;

public class Deportiva implements TipoConduccion {

    @Override
    public int consumo() {
        return 5;
    }

    @Override
    public int velocidadMAX() {
        return 180;
    }
}
