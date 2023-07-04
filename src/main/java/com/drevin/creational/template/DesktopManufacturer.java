package com.drevin.creational.template;

public class DesktopManufacturer extends ComputerManufacturer {
    @Override
    public void addHardDisk() {
        System.out.println("Desktop get HDD");
    }

    @Override
    public void addRAM() {
        System.out.println("Desktop get RAM");
    }

    @Override
    public void addProcesor() {
        System.out.println("Desktop get Procesor");
    }
}
