import java.lang.*;

abstract class Computer{
	
	abstract void turnOn();
	
	abstract void turnOff();
	
}

class HP extends Computer{
	
	void turnOn(){
		System.out.println("Turning On");
	}
	void turnOff(){
		System.out.println("Turning Off");
	}
}

class Abstraction{
	public static void main(String args[]){
	HP H = new HP();
	H.turnOn();
	H.turnOff();
	System.out.println("Without Error");
}
}
