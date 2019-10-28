package ar.edu.unahur.obj2;

public class Auto  {

    TipoConduccion tipoConduccion;
    private int combustible;
    private int kilometraje;


    public Auto(TipoConduccion tipoConduccion, int combustible, int kilometraje) {
        this.tipoConduccion = tipoConduccion;
        this.combustible = combustible;
        this.kilometraje = kilometraje;
    }

    public void avanzar(int recorridoKM){
        int kmPosibles = this.getCombustible() / tipoConduccion.consumo();
        int combustibleNecesario = recorridoKM / tipoConduccion.consumo();
        if(this.getCombustible() >= combustibleNecesario) {
            this.combustible -= recorridoKM / tipoConduccion.consumo();
            this.kilometraje += recorridoKM;
        }
        else{

            this.combustible = 0;
            this.kilometraje += kmPosibles;
            throw new RuntimeException("Se ha quedado sin combustible para seguir");

        }
    }

    public TipoConduccion getTipoConduccion() {
        return tipoConduccion;
    }

    public void setTipoConduccion(TipoConduccion tipoConduccion) {
        this.tipoConduccion = tipoConduccion;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getConsumo() {
        return tipoConduccion.consumo();
    }

    public int getVelocidadMAX(){
        return tipoConduccion.velocidadMAX();
    }


}
