package machine;
import java.awt.*;
import java.util.*;
import java.util.List;


public class CoffeeMachine {
    public static void main(String[] args) {
//
//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");
//
//        System.out.println("Write how many cups of coffee you will need:");
//        Scanner scanner = new Scanner(System.in);
//        int cupsNeeded = scanner.nextInt();
//        int water = cupsNeeded * 200;
//        int milk = cupsNeeded * 50;
//        int coffee = cupsNeeded * 15;
//        System.out.println("For "+ cupsNeeded + "cups of coffee you will need:");
//        System.out.println(water + " ml of water");
//        System.out.println(milk + " ml of milk");
//        System.out.println(coffee + " g of coffee beans");
//
//
//        /* The program should firstly request for water, then milk, then beans,
//         then amount of cups.
//The symbol > represents the user input. Notice that it's not the part of the input.
//
//Example 1
//Write how many ml of water the coffee machine has:
//> 300
//Write how many ml of milk the coffee machine has:
//> 65
//Write how many grams of coffee beans the coffee machine has:
//> 100
//Write how many cups of coffee you will need:
//> 1
//Yes, I can make that amount of coffee
//        */
//        Scanner scanner = new Scanner(System.in);
//        int water = 200;
//        int milk = 50;
//        int coffee = 15;
//
//        int waterInMachine;
//        int milkInMachine;
//        int coffeeInMachine;
//        int cupsCoffeeIWant;
//
//        int maxCoffees = 0;
//
//        System.out.println("Write how many ml of water the coffee machine has:");
//        waterInMachine = scanner.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        milkInMachine = scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        coffeeInMachine = scanner.nextInt();
//
//        System.out.println("Write how many cups of coffee you will need: ");
//        cupsCoffeeIWant = scanner.nextInt();
//
////        int maxCoffees1 = Math.min(waterInMachine/water, milkInMachine/milk );
////        int maxCoffees2 = Math.min(waterInMachine/water, coffeeInMachine/coffee );
////        maxCoffees = Math.min(maxCoffees1,maxCoffees2 );
//
//        List<Integer> ingList = new ArrayList<>();
//        ingList.add(waterInMachine/water);
//        ingList.add(milkInMachine/milk );
//        ingList.add(coffeeInMachine/coffee);
//
//       //   System.out.println(Collections.min(ingList));
//        maxCoffees = Collections.min(ingList);
//
////        if (waterInMachine/water > maxCoffees){
////            maxCoffees = waterInMachine/water;
////        } else if (milkInMachine/milk < maxCoffees){
////            maxCoffees = milkInMachine/milk;
////        } else {
////            maxCoffees = coffeeInMachine/coffee;
////        }
//
//        if (cupsCoffeeIWant == maxCoffees) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if ( cupsCoffeeIWant < maxCoffees){
//            System.out.println("Yes, I can make that amount of coffee (and even "+ (maxCoffees-cupsCoffeeIWant) +" more than that)");
//        } else {
//            System.out.println("No, I can make only "+ (maxCoffees) +" cup(s) of coffee");
//        }

        // For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
        //For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans.
        // It costs $7.
        //And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee.
        // It costs $6.

//        int water = 1200;
//        int milk = 540;
//        int coffee = 120;
//        int cups = 9;
//        int money = 550;
//        System.out.println("The coffee machine has:");
//        System.out.println(water + " of water");
//        System.out.println(milk + " of milk");
//        System.out.println(coffee + " of coffee beans");
//        System.out.println(cups + " of disposable cups");
//        System.out.println(money + " of money");
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Write action (buy, fill, take):");
//        String action = scanner.next();
//
//        switch (action) {
//            case "take":
//                System.out.println("I gave you $550");
//                System.out.println();
//                System.out.println("The coffee machine has:");
//                System.out.println(water + " of water");
//                System.out.println(milk + " of milk");
//                System.out.println(coffee + " of coffee beans");
//                System.out.println(cups + " of disposable cups");
//                System.out.println(0 + " of money");
//                break;
//
//            case "fill":
//                System.out.println("Write how many ml of water do you want to add:");
//                int fillWater = scanner.nextInt();
//                System.out.println("Write how many ml of milk do you want to add:");
//                int fillMilk = scanner.nextInt();
//                System.out.println("Write how many grams of coffee beans do you want to add:");
//                int fillCoffee = scanner.nextInt();
//                System.out.println("Write how many disposable cups of coffee do you want to add:");
//                int fillCups = scanner.nextInt();
//                System.out.println();
//                System.out.println("The coffee machine has:");
//                System.out.println(water + fillWater + " of water");
//                System.out.println(milk + fillMilk + " of milk");
//                System.out.println(coffee + fillCoffee + " of coffee beans");
//                System.out.println(cups + fillCups + " of disposable cups");
//                System.out.println(money + " of money");
//                break;
//
//            case "buy":
//                int espresso = 1;
//                int latte = 2;
//                int cappuccino = 3;
//
//                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
//                int option = scanner.nextInt();
//
//
//                if (option == espresso){
//                    water -= 250 ;
//                    coffee -= 16;
//                    cups -= 1;
//                    money += 4;
//                    System.out.println(water + " of water");
//                    System.out.println(milk + " of milk");
//                    System.out.println(coffee + " of coffee beans");
//                    System.out.println(cups + " of disposable cups");
//                    System.out.println(money + " of money");
//                } else if (option == latte ) {
//                    water -= 350 ;
//                    milk -= 75;
//                    coffee -= 20;
//                    cups -= 1;
//                    money += 7;
//                    System.out.println(water + " of water");
//                    System.out.println(milk + " of milk");
//                    System.out.println(coffee + " of coffee beans");
//                    System.out.println(cups + " of disposable cups");
//                    System.out.println(money + " of money");
//                } else if (option == cappuccino){
//                    water -= 200 ;
//                    milk -= 100;
//                    coffee -= 12;
//                    cups -= 1;
//                    money += 6;
//                    System.out.println(water + " of water");
//                    System.out.println(milk + " of milk");
//                    System.out.println(coffee + " of coffee beans");
//                    System.out.println(cups + " of disposable cups");
//                    System.out.println(money + " of money");
//                }   break;
//             default:
//                 break;
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cups = 9;
        int money = 550;

        Scanner scanner = new Scanner(System.in);

        boolean shouldIExit = false;

        while (!shouldIExit) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String option = scanner.next();
            switch (option) {
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffee + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println(money + " of money");
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    coffee += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups += scanner.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you " + money);
                    money -= money;
                    break;
                case "buy":


                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String choose = scanner.next();


                    if (choose.equals("1")) {
                        if (water >= 250 && coffee >= 16 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            coffee -= 16;
                            cups -= 1;
                            money += 4;
                            System.out.println();
                            break;
                        } else if (water - 250 <= 0) {
                                System.out.println("Sorry, not enough water!");
                            }  else if (coffee - 16 <= 0){
                                System.out.println("Sorry, not enough coffee!");
                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                        break;

                    } else if (choose.equals("2")) {
                        if (water >= 350 && milk >= 75 && coffee >= 20 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 350;
                            milk -= 75;
                            coffee -= 20;
                            cups -= 1;
                            money += 7;
                            System.out.println();
                            break;
                        } else if (water - 350 <= 0) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk - 75 <= 0){
                                System.out.println("Sorry, not enough milk!");
                            } else if (coffee - 20 <= 0){
                                System.out.println("Sorry, not enough coffee!");
                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                        break;

                    } else if (choose.equals("3")) {

                        if (water >= 200 && milk >= 100 && coffee >= 12 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 200;
                            milk -= 100;
                            coffee -= 12;
                            cups -= 1;
                            money += 6;
                            System.out.println();
                            break;
                        } else if (water-200<0) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milk-100<=0){
                                System.out.println("Sorry, not enough milk!");
                        } else if (coffee-12<=0){
                                System.out.println("Sorry, not enough coffee!");
                        } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                        break;

                         } else if ("back".equals(choose)){
                        break;
                    }

                case "exit":
                    shouldIExit = true;
                    default:
                        break;

                }

            }

        }
    }

