
public class DefaultMethode {

	public static void main(String[] args) {
		Laptop lt = new Laptop();
		lt.ausgeben();
		Bildschirm.ansehen();
		Tastatur.tippen();

	}

}

class Laptop implements Bildschirm, Tastatur{
	public void ausgeben(){
		System.out.println("Laptop");
		Bildschirm.super.ausgeben();
		Tastatur.super.ausgeben();
		
	}
}

//@FunctionalInterface      // falsch, da kein SAM-Typ
interface Bildschirm{
	default void ausgeben(){
		System.out.println("Bildschirm");
	}
	static void ansehen(){
		System.out.println("wysiwyg");
	}
}

interface Tastatur{
	default void ausgeben(){
		System.out.println("Tastatur");
	}
	static void tippen(){
		System.out.println("abcdef");
	}
	
}