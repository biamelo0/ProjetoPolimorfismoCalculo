package PolimorfismoCalculo;

public class Principal {
	
	public static void main(String[] args) {
		Adicionar Adicionar = new Adicionar ();
		System.out.println(Adicionar.soma(10, 20));
		
		Subtrair Subtrair = new Subtrair();
		System.out.println(Subtrair.sub(10, 20));
		
		Calcular Calcular = new Calcular();
		System.out.println(Calcular.multi(10, 20));
		System.out.println(Calcular.div(10, 20));
		
		Expo Expo = new Expo();
		System.out.println(Expo.expo(10, 20));
		
	}
	
}
