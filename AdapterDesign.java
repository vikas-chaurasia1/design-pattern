package com.example.demo.design;

class LegacyPrinter{
    public void printLegacy(){
        System.out.println("printing value using legacy");
    }
}

interface Printer{
    public void modernPrinter();
}

class AdapterClass implements Printer{
    private final LegacyPrinter legacyPrinter;

    AdapterClass(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void modernPrinter(){
        legacyPrinter.printLegacy();
    }
}

public class Adapter {
    public static void main(String[] args){
        System.out.println("Adapter design pattern");
        LegacyPrinter legacyPrinter=new LegacyPrinter();

        Printer printer=new AdapterClass(legacyPrinter);
        client(printer);
    }

    public static void client(Printer printer){
        printer.modernPrinter();
    }
}
