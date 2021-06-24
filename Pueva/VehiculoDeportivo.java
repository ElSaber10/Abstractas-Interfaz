package Pueva;

public class VehiculoDeportivo extends Vehículo implements Girar{
private int carga;

    public VehiculoDeportivo(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
@Override
public String MostrarDatos(){
    return " Matricula " + matricula + " Marca "+marca +" Modelo "+ modelo + " Carga " + carga; 
}
}
