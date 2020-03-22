package com.company;

public class Main {

    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("Basic" , "Sasuage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon, " , 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils" , 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        HealthyBurger healthyBurger1 = new HealthyBurger("Beef",8);
        healthyBurger1.addHamburgerAddition1("Spinat",2);
        System.out.println("Total Price is " + healthyBurger1.itemizeHamburger());

        HealthyBurger healthyBurger2 = new HealthyBurger("kase",3);
        healthyBurger1.addHamburgerAddition2("egg",1);
        System.out.println("Total Price is " + healthyBurger2.itemizeHamburger());

        HealthyBurger healthyBurger3 = new HealthyBurger("kase",3);
        healthyBurger1.addHamburgerAddition3("egg",1);
        System.out.println("Total Price is " + healthyBurger3.itemizeHamburger());
    }
}
