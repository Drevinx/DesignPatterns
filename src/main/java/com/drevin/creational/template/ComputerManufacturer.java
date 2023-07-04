package com.drevin.creational.template;

public abstract class ComputerManufacturer {

    public void buildComputer(){
        addProcesor();
        addHardDisk();
        addRAM();
        System.out.println("Build complete!");
    }

    public abstract void addHardDisk();
    public abstract void addRAM();
    public abstract void addProcesor();

}
