import java.lang.*;

class Father{
	char gender = 'M';
	static int age = 50;
	static void talk(){
		System.out.println("Hi daugather");
	}
}
	class Daughter extends Father{
		char gender ='F';
	}
	
	class Static{
		public static void main(String args[]){
		Daughter D = new Daughter();
		Father F = new Father();
		D.age = 18;
		System.out.println(F.age);
		
		System.out.println(F.age);
		System.out.println(D.age);
		
		Father.talk();
		System.out.println(D.gender);
	}
}
		