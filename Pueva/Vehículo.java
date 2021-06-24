package Pueva;

public class Vehículo implements Girar{
protected String matricula;
protected String marca;
protected String modelo;
protected String girar;
    public Vehículo(String matricula, String marca, String modelo) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        
        
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public String MostrarDatos(){
        return " Matricula " + matricula + " Marca "+marca +" Modelo "+ modelo + " Girar Izquierda " + girar; 
    }

    @Override
    public void girarIzquierda() {
        girar ="ya giro a la izquierda";
    }

}
