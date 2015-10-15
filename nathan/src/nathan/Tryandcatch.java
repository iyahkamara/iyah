package nathan;

public class Tryandcatch {
public static void main(String args[]){

try

{
	int data=80/0;
}
catch (ArithmeticException e)
		{
	System.out.println(e);
		}
System.out.println("rest of the work done");
System.out.println("the code checks for the arithmetic execption hundler BYNATHAN");
	}

}
