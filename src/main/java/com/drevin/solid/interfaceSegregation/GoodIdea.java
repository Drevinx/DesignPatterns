package com.drevin.solid.interfaceSegregation;

public class GoodIdea {
}

class JustAPrinter implements Printer
{
    public void Print(Document d)
    {

    }
}

class Photocopier implements Printer, IScanner
{
    public void Print(Document d) throws Exception
    {
        throw new Exception();
    }

    public void Scan(Document d) throws Exception
    {
        throw new Exception();
    }
}

class MultiFunctionMachine implements MultiFunctionDevice
{
    // compose this out of several modules
    private Printer printer;
    private IScanner scanner;

    public MultiFunctionMachine(Printer printer, IScanner scanner)
    {
        this.printer = printer;
        this.scanner = scanner;
    }

    public void Print(Document d) throws Exception
    {
        printer.Print(d);
    }

    public void Scan(Document d) throws Exception
    {
        scanner.Scan(d);
    }
}
