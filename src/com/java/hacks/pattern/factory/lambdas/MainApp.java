package com.java.hacks.pattern.factory.lambdas;

public class MainApp {

	public static void main(String[] args) {
		// Using Class
		PrinterFactory.getPrinter(Api.ASPOSE).print();
		PrinterFactory.getPrinter2(Api.ASPOSE).print();		
		PrinterFactory.getPrinter(Api.LEADTOOLS).print();
		PrinterFactory.getPrinter2(Api.LEADTOOLS).print();		
		
		// Using Interface
		IPrinterFactory.getPrinter(Api.ASPOSE).print();
		IPrinterFactory.getPrinter2(Api.ASPOSE).print();		
		IPrinterFactory.getPrinter(Api.LEADTOOLS).print();
		IPrinterFactory.getPrinter2(Api.LEADTOOLS).print();
	}
	
}