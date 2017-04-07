package com.sabel.koenig.zeit;

public class Testklasse {


	public static void main(String[] args) {
		
		StundenMinuten sm1 = new StundenMinuten(50, 12);
		StundenMinuten sm2 = new StundenMinuten(50, 12);
		
		System.out.println(sm1.getMinuten());
		System.out.println(sm1.getSekunden());
		
		
		Tage t = new Tage(12);
		System.out.println(t.getMinuten());
		System.out.println(t.getSekunden());
		
		System.out.println(t.toString());
		System.out.println(sm1.toString());
		if (sm1.equals(sm2)) {
			System.out.println("sm1 ist gleich sm2");
		} else {
			System.out.println("sm1 ist ungleich sm2");
		}
		
		System.out.println(sm1.hashCode());
		
		Zeit zeit = new Tage(3);
		System.out.println(zeit.getSekunden());
		System.out.println(zeit.getMinuten());
		
		zeit = new StundenMinuten(50, 12);
		System.out.println(zeit.getSekunden());
		System.out.println(zeit.getMinuten());
	}
}
