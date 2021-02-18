import java.util.Scanner;
import java.util.Scanner.*;
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a,b,res;
	    String op;
	   Scanner  sc=new Scanner(System.in);
	     System.out.println("Enter 2 numbers :");
	     a=sc.nextInt();
	     b=sc.nextInt();
	     System.out.println("Enter operator");
	     op=sc.next();
	     
	     switch(op)
	     {
	     case "+": res=a+b;
	     		 	System.out.println("sum is"+ res);
	     		 	break;
	     case "-": res=a-b;
	     			System.out.println("Subtract is"+ res);
	     			break;
	     case "*": res=a*b;
					System.out.println("Multiplication is"+ res);
					break;			
	     default:
	    	 System.out.println("wrong choice");
	    	 
	     }

	}

}
