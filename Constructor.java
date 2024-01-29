import java.lang.*;

public class Constructor{
	
	int mark;
	int rollno;
	
	Constructor( int num, int marks){
		System.out.println("Hi i am Constructor");
		rollno = num;
		mark = marks;
	}
	
}
class Pub{

public static void main(String args[]){
	Constructor C = new Constructor(75, 10);
	System.out.println(C.mark);
	System.out.println(C.rollno);
}
}