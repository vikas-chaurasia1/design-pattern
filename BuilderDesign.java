package com.example.demo.design;

class Car{
    private String name;
    private Integer veNo;
    private String color;

    private Car(CarBuilder carBuilder){
        this.name=carBuilder.name;
        this.veNo= carBuilder.veNo;
        this.color=carBuilder.color;
    }

    public String toString(){
        return this.name+" "+this.veNo+" "+this.color;
    }

    public static class CarBuilder{
        private String name;
        private Integer veNo;
        private String color; //optional

        CarBuilder(String name,int veNo){
            this.name=name;
            this.veNo=veNo;
        }

        public CarBuilder getColor(String color){
            this.color=color;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }
}

public class BuilderDesign {
    public static void main(String[] args){
        System.out.println("builder design pattern");

        Car car=new Car.CarBuilder("Thar",12)
               .getColor("Black")
                .build();

        System.out.println(car);
    }
}
