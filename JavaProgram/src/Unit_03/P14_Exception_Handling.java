package Unit_03  ;
import java.util.*;
class exception{
	void basicException() {
		int b=0;
		int a=10/b;
		System.out.println(a);
		System.out.println("Done!");
	}
	void handelException() {
		try {
			int b=0;
			int a=10/b;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Done!");
		}
	}
	void multipleCatch() {
		
		try {
			int b=0;
			int a=10/b;
			System.out.println(a);
		}//child class exception came first 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " Arithmeetic!!!!");
			System.out.println("Done!");
		}catch(Exception e) {
			System.out.println(e.getMessage() + " exception!!");
		}
	}
	void inputMinsmatchException() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
		    int number=sc.nextInt();
		    System.out.println("You entered:" + number);
		} catch (InputMismatchException e) {
			System.out.println(e + " Resolved");
		}
		
		System.out.println("Done!!!!!");
	}
    void stackOverFlowError(int i) {
		try {
			while(i>0) {
	    		i++;
	    		stackOverFlowError(i);
	    	}
			//this is error cant resolved because it is not a ecption
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Other code execute!!");
    	
	}
    
    void indexOutofBoundException() {
	  try {
		int[] num= {1,2,3,4};
		System.out.println(num[10]);
	} catch (IndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
	  System.out.println("Done!!");
    }
    void nullPointerException() {
	
     }
    void useofThrow() {
    	
    }
    void useofThrow_And_Finally() {
    	
    }

}
public class P14_Exception_Handling {

	
public static void main(String args[]) {
	exception obj=new exception();
//	obj.basicException();
//	obj.handelException();
//	obj.multipleCatch();
//	obj.inputMinsmatchException();
//	obj.stackOverFlowError(2);
	obj.indexOutofBoundException();
	obj.nullPointerException();
	obj.useofThrow();  // this is a calling of useofthrow
	obj.useofThrow_And_Finally();
}
}
