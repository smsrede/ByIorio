package com.byiorio.aula2;

public class Conversao {
	public static void main(String[] args) {
		double km = 120;
		double totalMilhas = km * 0.621371d;
		
		System.out.println(km + " km são: " + totalMilhas + " milhas");
		
		double milhas = 74;
		double totalKm = milhas / 0.621371d;
		
		System.out.println(milhas + " milhas são: " + totalKm + " quiometros");
	
	}
}
