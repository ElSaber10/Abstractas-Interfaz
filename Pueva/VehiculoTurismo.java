package Pueva;

public class VehiculoTurismo extends Vehículo implements Girar{
private int nPuertas;

    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
@Override
public String MostrarDatos(){
    return " Matricula " + matricula + " Marca "+marca +" Modelo "+ modelo + " Numero de Puertas " + nPuertas; 
}
}
