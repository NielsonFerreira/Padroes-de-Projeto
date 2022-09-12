package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.factory.apple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;

public class Client {
	
	public static void main(String[] args) {

		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();

		//=============== IPhone X ==================================

		System.out.println("Ordering new Iphone X...");
		System.out.println(iPhoneXFactory.orderIphone("standard"));

		System.out.println("Ordering new Iphone XS Max...");
		System.out.println(iPhoneXFactory.orderIphone("highEnd"));
		//=============== IPhone 11 ==================================

		System.out.println("Ordering new Iphone 11...");
		System.out.println(gen11Factory.orderIphone("standard"));

		System.out.println("Ordering new Iphone 11 Pro...");
		System.out.println(gen11Factory.orderIphone("highEnd"));
	}
}
