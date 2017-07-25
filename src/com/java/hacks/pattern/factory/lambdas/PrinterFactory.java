package com.java.hacks.pattern.factory.lambdas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PrinterFactory {

	public static Printer getPrinter(Api api) {
		Map<Api, Supplier<Printer>> map = new HashMap<>();
		map.put(Api.ASPOSE, AsposePrinter::new);
		map.put(Api.LEADTOOLS, LeadToolsPrinter::new);
		return map.get(api).get();
	}

	public static Printer getPrinter2(Api api) {
		Map<Api, Printer> map2 = new HashMap<>();
		map2.put(Api.ASPOSE, () -> System.out.println("Using Lambdas --> Printed using ASPOSE API."));
		map2.put(Api.LEADTOOLS, () -> System.out.println("Using Lambdas --> Printed using LEADTOOLS API."));
		return map2.get(api);
	}
}
