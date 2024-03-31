public class EDMain {
    public static void main(String args[]) {

        EDCar c1 = new EDCar("Red");

        EDCar c2 = new EDCar("Blue");

        EDCar c3 = new EDCar("Yellow");

        System.out.println(c2.wheels);
        System.out.println(c3.wheels);
        //System.out.println(c2.EDCar);
        System.out.println(c2.color);
    }
}
