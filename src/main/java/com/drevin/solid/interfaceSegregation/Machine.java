package com.drevin.solid.interfaceSegregation;

class Document
{
}
public interface Machine {
    void print(Document d);
    void fax(Document d) throws Exception;
    void scan(Document d) throws Exception;
}

// Interface Segregation
interface Printer
{
    void Print(Document d) throws Exception;
}

interface IScanner
{
    void Scan(Document d) throws Exception;
}

interface MultiFunctionDevice extends Printer, IScanner //
{

}
