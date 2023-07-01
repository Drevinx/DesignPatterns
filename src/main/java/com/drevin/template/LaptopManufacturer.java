package com.drevin.template;

public class LaptopManufacturer extends ComputerManufacturer {
    @Override
    public void addHardDisk() {
        System.out.println("LAptop get HDD");
    }

    @Override
    public void addRAM() {
        System.out.println("Laptop get RAM");
    }

    @Override
    public void addProcesor() {
        System.out.println("Laptop get Procesor");
    }
}
