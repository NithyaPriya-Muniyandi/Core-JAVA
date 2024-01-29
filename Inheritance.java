import java.lang.*;

public class Inheritance{
	int noLegs = 4;
	
	public static void eat(){
		System.out.println("Yes I can Eat");
	}
	public static void walk(){
		System.out.println("Yes I can Walk");
	}
}

class Dog extends Inheritance{
	
	boolean canBark = true;
	public static void eat(){
	System.out.println("Dog can bark");
	}
	int noLegs = 5;
}

class Cat extends Inheritance{
	String sound = "Mewo";
}

class Call{
	public static void main(String args[]){
	Dog obj = new Dog();
		System.out.println(obj.canBark);
		System.out.println(obj.noLegs);
		obj.eat();
		obj.walk();
	Cat C = new Cat();
	System.out.println(C.sound);
	

}
}