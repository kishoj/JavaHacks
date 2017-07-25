package com.java.hacks.pattern.factory.lambdas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public interface IPrinterFactory {

	static Printer getPrinter(Api api) {
		final Map<Api, Supplier<Printer>> map = new HashMap<>();
		map.put(Api.ASPOSE, AsposePrinter::new);
		map.put(Api.LEADTOOLS, LeadToolsPrinter::new);
		return map.get(api).get();
	}

	static Printer getPrinter2(Api api) {
		final Map<Api, Printer> map = new HashMap<>();
		map.put(Api.ASPOSE, () -> System.out.println("Using Lambdas --> Printed using ASPOSE API."));
		map.put(Api.LEADTOOLS, () -> System.out.println("Using Lambdas --> Printed using LEADTOOLS API."));
		return map.get(api);
	}
}
