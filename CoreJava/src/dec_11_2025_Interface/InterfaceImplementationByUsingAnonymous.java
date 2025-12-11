package dec_11_2025_Interface;

public class InterfaceImplementationByUsingAnonymous {
	void main() {
		PrinterDemo printerDemo=new PrinterDemo();
		Printer printer=printerDemo.PrintergetPrinter();
		printer.print();
	}
}
