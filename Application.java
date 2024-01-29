import java.lang.*;

public class Application{
		String name;
		int rollno;
	
	
		
		public	void display(){
			System.out.println(name);
			System.out.println(rollno);
	}
	public void setValue(String str, int num){
		name = str;
		rollno = num;
	}
}

class Main{
	public static void main(String[] args){
	
		Application print = new Application();
		print.setValue("Nithya", 75);
		print.display();
		
		Application viewer = new Application();
		viewer.setValue("priya",76);
		viewer.display();
	}
}

