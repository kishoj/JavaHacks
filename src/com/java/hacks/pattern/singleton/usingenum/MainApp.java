package com.java.hacks.pattern.singleton.usingenum;

public class MainApp {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Singleton instance1 = Singleton.INSTANCE;
		Singleton instance2 = Singleton.getInstance();
		Singleton instance3 = Singleton.INSTANCE;
		Singleton instance4 = Singleton.getInstance();
		Singleton instance5 = Singleton.INSTANCE.getInstance();
		
		if (instance1.equals(instance2) && instance1.equals(instance3) && instance1.equals(instance4) && instance1.equals(instance5)) {
			System.out.println("Singleton property is valid");
			
			System.out.println("Instance 1: " + instance1.hashCode());
			System.out.println("Instance 2: " + instance2.hashCode());
			System.out.println("Instance 3: " + instance3.hashCode());
			System.out.println("Instance 4: " + instance4.hashCode());
			System.out.println("Instance 5: " + instance5.hashCode());
		}
		
		Singleton.INSTANCE.method();
	}

}
