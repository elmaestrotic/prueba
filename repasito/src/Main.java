public class Main {
    public static void main(String[] args) {
        Avion obj1 = new Avion();
        obj1.encender();
        obj1.acelerar(180);
        obj1.volar();

        Avion obj2 = new Avion("JetFull","2020","AVIANCA",105,2);

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
