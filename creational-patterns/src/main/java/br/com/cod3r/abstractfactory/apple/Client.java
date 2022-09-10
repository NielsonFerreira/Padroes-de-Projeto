package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.factory.apple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;

public class Client {
	
	public static void main(String[] args) {

		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
		IPhoneFactory iPhone11Factory = new IPhone11Factory();

		System.out.println("Ordering new Iphone X...");
		System.out.println(iPhoneXFactory.orderIphone());

		System.out.println("Ordering new Iphone 11...");
		System.out.println(iPhone11Factory.orderIphone());
	}
}
