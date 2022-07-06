package ithillel.ua;

public class BuyingCar {

    public static void main(String[] args) {

        BuyingCarTest customer = new BuyingCarTest();
        BuyingCarTest1 car = new BuyingCarTest1();


        if (customer.age < 18) {
            System.out.println("Dear " +customer.name+ " Sorry, come via " + (18 - customer.age) );
        } else {
            System.out.println("Dear " +customer.name+ " Excellent, go to the purchase ");
            if (customer.money >= car.price) {
                System.out.println("You have money " +customer.money+ " You have enough to buy " +car.name+ "Congratulations" );
            } else {
                System.out.println("You don't have enough " +car.price+ " money ready to take out a loan ?" );
                if (customer.buyCredit) {
                    System.out.println("For simplification fixed for 3 years " + car.price / 36 + " You have enough to buy " +car.name+ "Congratulations" );
                } else {
                    System.out.println("Come later");
                }
            }
        }
    }
}
