import  java.lang.*;

interface Father{
	abstract void great();
	abstract void place();
}
interface Mother{
	abstract void food();
	abstract void things();
}


	class Interfa implements Father,Mother{
	public void great(){
		System.out.println("Hi my dear son");
	}
	public void place(){
		System.out.println("we are in German");
	}
	
	public void food(){
		System.out.println("Today we have a Bread");
	}
	public void things(){
		System.out.println("Go and buy a some things");
	}


	
	public static void main(String args[]){
		Interfa ob = new Interfa();
		ob.great();
		ob.place();
		ob.food();
		ob.things();
}}