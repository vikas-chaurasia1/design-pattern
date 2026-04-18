package com.example.demo.design;

interface Coffee{
    public int getPrice();
}

class BasicCoffee implements Coffee{
    @Override
    public int getPrice(){
        return 10;
    }
}


abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffeeDecorator;

    public CoffeeDecorator(Coffee coffee){
        this.coffeeDecorator=coffee;
    }

    @Override
    public int getPrice(){
        return coffeeDecorator.getPrice();
    }
}

class CoffeeWithSugar extends CoffeeDecorator{

    public CoffeeWithSugar(Coffee coffee){
        super(coffee);
    }

    @Override
    public int getPrice(){
        return 15+super.getPrice();
    }
}

class CoffeeWithMilk extends CoffeeDecorator{

    public CoffeeWithMilk(Coffee coffee){
        super(coffee);
    }

    @Override
    public int getPrice(){
        return 12+super.getPrice();
    }
}
public class DecoratorDesign {
    public static void main(String[] args){
        System.out.println("Decorator design pattern");

        Coffee coffee=new BasicCoffee();
        System.out.println("basic coffe price "+coffee.getPrice());

        coffee=new CoffeeWithSugar(coffee);
        System.out.println("coffe with sugar price "+coffee.getPrice());

        coffee=new CoffeeWithMilk(coffee);
        System.out.println("coffe with sugar and milk price "+coffee.getPrice());
    }
}
