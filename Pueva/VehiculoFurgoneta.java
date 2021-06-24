package Pueva;

public class VehiculoFurgoneta extends Vehículo implements Girar{
private int cilindros ;

    public VehiculoFurgoneta(int cilindros, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindros = cilindros;
    }

    public int getCilindros() {
        return cilindros;
    }
    @Override
public String MostrarDatos(){
     return " Matricula " + matricula + " Marca "+marca +" Modelo "+ modelo + " Cilindros " + cilindros ; 
}
}
