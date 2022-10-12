package com.busraciftlik.restaurant;

import com.busraciftlik.restaurant.model.restaurant.Restaurant;


public class RestaurantSimulationDriver {
    public static void main(String[] args) {

        test();
    }

    public static void test() {
        Restaurant restaurant = new Restaurant();
        try {
            restaurant.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
