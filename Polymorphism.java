import java.lang.*;

public class Polymorphism{
	public static void main(String args[]){
		Method M = new Method();
		M.fun(20,30);
		M.fun(5);
		
	}
}

class Method{
	void fun(int a, int b){
		if(a>b){
			System.out.println(a);
	}else{
		System.out.println(b);
	}
	}
	void fun(int a){
		System.out.println(a);
	}
}