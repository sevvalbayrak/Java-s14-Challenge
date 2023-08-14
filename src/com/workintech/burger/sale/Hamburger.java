package com.workintech.burger.sale;

public class Hamburger {
    protected String name ;
    protected String meat;
    protected double price ;
    protected String breadRollType;

    protected String addition1Name;
    protected double addition1Price;
    protected String addition2Name;
    protected double addition2Price;
    protected String addition3Name;
    protected double addition3Price;
    protected String addition4Name;
    protected double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public void addHamburgerAddition1(String name, double price)
    {
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price)
    {
        this.addition2Name = name;
        this.addition2Price = price;}


    public void addHamburgerAddition3(String name, double price)
    {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price)
    {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = price;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);

        if (addition1Name != null) {
            totalPrice += addition1Price;
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        }
        if (addition2Name != null) {
            totalPrice += addition2Price;
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        }
        if (addition3Name != null) {
            totalPrice += addition3Price;
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        }
        if (addition4Name != null) {
            totalPrice += addition4Price;
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        }

        System.out.println("Total price is " + totalPrice);
        return totalPrice;
    }
}

