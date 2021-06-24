package Pueva;

public class Principal {

    public static void main(String[] args) {
        Vehículo misVehiculos[]= new Vehículo [13];  
        
        misVehiculos[0]= new Vehículo("HGD12", "TOYOTA","COROLLA");
        
        misVehiculos[1]= new VehiculoTurismo(4, "GGIR5", "HONDA", "CRV");
        misVehiculos[2] = new VehiculoDeportivo(4, "GGIR44", "AUDI", "P500");
        misVehiculos[3] = new VehiculoFurgoneta(6, "KHGR44", "MERCEDES", "VOLTEOR");
        misVehiculos[4] = new VehiculoTurismo(6, "KHGR44", "MERCEDES", "VOLTEOR");
        misVehiculos[5] = new VehiculoDeportivo(6, "KHGR44", "MERCEDES", "VOLTEOR");
        misVehiculos[6] = new VehiculoFurgoneta(6, "KHGR44", "MERCEDES", "VOLTEOR");
        misVehiculos[7] = new VehiculoTurismo(6, "KHGR44", "MERCEDES", "VOLTEOR");
        misVehiculos[8] = new VehiculoDeportivo(6, "KHGR44", "MERCEDES", "VOLTEOR");
        misVehiculos[9] = new VehiculoFurgoneta(6, "KHGR44", "MERCEDES", "VOLTEOR");
        misVehiculos[10] = new VehiculoTurismo(6, "KHGR44", "MERCEDES", "VOLTEOR");
        misVehiculos[11] = new VehiculoDeportivo(6, "KHGR44", "MERCEDES", "VOLTEOR");
        misVehiculos[12] = new VehiculoFurgoneta(6, "KHGR44", "MERCEDES", "320i");
        
        for(Vehículo Vehiculos: misVehiculos){
            System.out.println(Vehiculos.MostrarDatos());
        }
    }
    
    
}
