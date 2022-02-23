package automovil;

import automovil.AutoMovil;

public class Main {
    public static void main(String[] args) {
        AutoMovil obj1 = new AutoMovil();
        obj1.arrancar();
        System.out.println(obj1.acelerar(100));
        System.out.println("El vehículo está girando a la: "+obj1.girar(1));
        obj1.reversar();
        obj1.frenar();
    }



}
