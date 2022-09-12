package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;

public class Client {
	
	public static void main(String[] args) {

		//=============== IPhone X ==================================

		System.out.println("Ordering new Iphone X...");
		System.out.println(IPhoneFactory.orderIphone("X", "standard"));

		System.out.println("Ordering new Iphone XS Max...");
		System.out.println(IPhoneFactory.orderIphone("X", "highEnd"));
		//=============== IPhone 11 ==================================

		System.out.println("Ordering new Iphone 11...");
		System.out.println(IPhoneFactory.orderIphone("11", "standard"));

		System.out.println("Ordering new Iphone 11 Pro...");
		System.out.println(IPhoneFactory.orderIphone("11", "highEnd"));
	}
}
