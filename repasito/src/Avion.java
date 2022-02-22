public class Avion {
    //atributos
    String marca,modelo, aerolinea;
    int capPasajeros, tipo;

    //constructor
    public Avion() {
    }

    public Avion(String marca, String modelo, String aerolinea, int capPasajeros, int tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.aerolinea = aerolinea;
        this.capPasajeros = capPasajeros;
        this.tipo = tipo;
    }

    //métodos
    void encender(){
        System.out.println("Avión encendido");
    }

    String acelerar(int km){
        km+=10;
        if (km> 150){
            System.out.println("Puede despegar");
        }else{
            System.out.println("Acelere más");
        }
        return "Avión acelerando";
    }


    void despegar(){
        System.out.println("Avión en el aire");
    }
    void volar(){
        System.out.println("Planeando..");
    }
    void aterrizar(){
        System.out.println("Avión llegando al aeropuerto");
    }

    @Override
    public String toString() {
        return "Avión{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", aerolinea='" + aerolinea + '\'' +
                ", capPasajeros=" + capPasajeros +
                ", tipo=" + tipo +
                '}';
    }
}
