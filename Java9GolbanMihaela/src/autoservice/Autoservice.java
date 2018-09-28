package autoservice;

/*

 */
public class Autoservice {

    public static void main(String[] args) {
        //5.a Create 3 instances of cars having different names, colors, speed, renting price and sale price
        Car m1 = new Car();
        m1.setColor(Car.Color.YELLOW);
        m1.setName("Lamborghini");
        m1.setSpeed((short) 250);
        m1.setRentPrice(2500);
        m1.setSalePrice(150000);

        Car m2 = new Car();
        m2.setColor(Car.Color.BLACK);
        m2.setName("Mercedes");
        m2.setSpeed((short) 240);
        m2.setRentPrice(250);
        m2.setSalePrice(100000);

        Car m3 = new Car();
        m3.setColor(Car.Color.GRAY);
        m3.setName("Logan");
        m3.setSpeed((short) 180);
        m3.setRentPrice(15);
        m3.setSalePrice(12000);

        // 5.c Display all informations about all cars calling the method displayAutoservice() 
        Autoservice autoSRL = new Autoservice();
        autoSRL.displayAutoservice(m1);
        autoSRL.displayAutoservice(m2);
        autoSRL.displayAutoservice(m3);

        //  5.d Increase speed of first car with 10
        m1.increaseSpeed((short) 10);

        //  5.e Decrease speed of second car with 10
        m2.decreaseSpeed((short) 10);

        //  5.f Increase renting price of third car with 15 and decrease its sale price with 1200
        m3.setRentPrice(m3.getRentPrice() + 15);
        m3.setSalePrice(m3.getSalePrice() - 1200);

        //5.g Display all informations about all cars calling the method displayAutoservice()
        System.out.println("AUTOSERVICE");
        autoSRL.displayAutoservice(m1);
        autoSRL.displayAutoservice(m2);
        autoSRL.displayAutoservice(m3);

    }
    // 5.b. Create a private method in Autoservice, methid named "void displayAutoservice()" that display all information about all cars in format:

    /*
        Car name: ......
        Car color: ......
        Car speed: ....
        Car renting price: ....
        Car sale price: ......
     */
    private void displayAutoservice(Car carToDisplay) {
        System.out.println("Car name: " + carToDisplay.getName());
        System.out.println("Car color: " + carToDisplay.getColor());
        System.out.println("Car speed: " + carToDisplay.getSpeed());
        System.out.println("Car renting price: " + carToDisplay.getRentPrice());
        System.out.println("Car sale price: " + carToDisplay.getSalePrice());
    }
}
