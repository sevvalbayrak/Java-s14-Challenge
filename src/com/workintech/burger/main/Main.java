package com.workintech.burger.main;

import com.workintech.burger.sale.DeluxeBurger;
import com.workintech.burger.sale.Hamburger;
import com.workintech.burger.sale.HealthyBurger;

public class Main {
    Hamburger hamburger = new Hamburger("Basic", "chicken", 3.56,"integral");

hamburger.addHamburgerAddition1("Tomato", 0.27);

hamburger.addHamburgerAddition2("Lettuce", 0.75);

hamburger.addHamburgerAddition3("Cheese", 1.13);

hamburger.itemizeHamburger();

    HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", "chicken", 4.50,"integral");

healthyBurger.addHamburgerAddition1("Egg", 5.43);

healthyBurger.addHealthyAddition1("Lentils", 3.41);

healthyBurger.itemizeHamburger();

    DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe", "Sausage & Bacon", 19.10, "White");

deluxeBurger.addHamburgerAddition3("Should not do this", 50.53);

deluxeBurger.itemizeHamburger();
}
