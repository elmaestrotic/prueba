package automovil;
//vió?
public class AutoMovil {
    //Atributos
    String color, marca, modelo;
    int motor;//número de caballos de fuerza del motor

    //Métodos
    void arrancar(){
        System.out.println("Vehículo encendido");
    }
    String acelerar(int km){
       km*=3;//km =km *3

     return "El vehículo se desplaza a "+ km + " por hora";

    }




    String girar(int dir){
      return  (dir==1?"Derecha":"Izquierda");

    }
    void frenar(){
        System.out.println("El vehículo se ha detenido");
    }
    void reversar(){
        System.out.println("Dale pa' tra..tratra..tra..");
    }

}
