public class Main {

    public static void main(String[] args) {

        VeredaGT coche = new VeredaGT("11AD23", 3000, 3000);

        System.out.println(coche.status());

        coche.move();
        System.out.println(coche.status());

        coche.recharge();
        System.out.println(coche.status());

        coche.move();
        System.out.println(coche.status());

        coche.move();

        coche.recharge();

        System.out.println("El coche tiene de energía : " + coche.energyLevel());
    }
}
