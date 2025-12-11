package dec_11_2025_Interface;

public class PrinterDemo {
	public  Printer PrintergetPrinter() {
		return new Printer() {
			@Override
			public void print() {
				IO.println("Functional interface Printer which contains a print() method");
			}
		};
	}
}
