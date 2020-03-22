package com.company;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthExtra1Price;

    private String healthyExtra2Name;
    private double healthExtra2Price;

    public HealthyBurger( String meat, double price ) {
        super("Super healthy", meat, price, "Brown rye");

    }
    public void addHealthAddition1 ( String name , double price) {

        this.healthExtra1Price = healthExtra1Price;
        this.healthyExtra1Name = healthyExtra1Name;
    }

    public void addHealthAddition2 ( String name , double price) {

        this.healthExtra2Price = healthExtra2Price;
        this.healthyExtra2Name = healthyExtra2Name;
    }

    @Override
    public double itemizeHamburger() {
       double hamburgerPrice = super.itemizeHamburger();
       if(this.healthyExtra1Name != null){
           hamburgerPrice += this.healthExtra1Price;
           System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthExtra1Price);
       }

        if(this.healthyExtra2Name != null){
            hamburgerPrice += this.healthExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthExtra2Price);
        }
        return hamburgerPrice;
    }
}
