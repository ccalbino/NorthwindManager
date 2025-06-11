package com.pluralsight.ui;

import com.pluralsight.models.Employee;

public class UserInterface {

    private Employee currentEmployee;
    private Console console;

    public UserInterface(){
        this.console = new Console();
    }


    public  void display(){
        System.out.println("Welcome to the Northwind Manager!");
        currentEmployee = loginUser();
        System.out.println("Welcome, " + this.currentEmployee.getFirstName() + "!");


        showHomeMenu();
    }


    private Employee loginUser(){
        String s = console.promptForString("Just hit enter to login as Christian", true);
        Employee e = new Employee(1, "Christian", "Albino");
        return e;
    }

    private void showHomeMenu(){

        System.out.println("Home Menu here");



        String[] menuOptions = {
                "list product categories",
                "List all products",
                "List products by category",
                "List products by price",
                "List all suppliers",
                "List products by supplier",
                "Exit"
        };

        int userChoice = console.promptForOption(menuOptions);
        switch (userChoice){
            case 1:
                listCategoriesAll();
                break;
            case 2:
                listProductsAll();
                break;
            case 3:
                listProductsByCategory();
                break;
            case 4:
                listProductsByPrice();
                break;
            case 5:
                listSuppliersAll();
                break;
            case 6:
                listProductBySupplier();
                break;
            case 7:
                System.exit(0);




        }

    }

    private void listProductBySupplier() {
    }

    private void listSuppliersAll() {
    }

    private void listProductsByPrice() {
    }

    private void listProductsByCategory() {
    }

    private void listProductsAll() {
    }

    private void listCategoriesAll() {
    }
}
