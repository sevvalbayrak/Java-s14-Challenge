package com.workintech.burger.sale;

public class DeluxeBurger extends Hamburger{
    private String cips;

    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        super.addHamburgerAddition1(name, price);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        super.addHamburgerAddition2(name, price);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        super.addHamburgerAddition3(name, price);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        super.addHamburgerAddition4(name, price);
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Cannot add additional items to a deluxe burger");
        return super.itemizeHamburger();
    }
}
