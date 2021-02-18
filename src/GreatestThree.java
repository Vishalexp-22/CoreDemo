import java.util.Scanner;

public class GreatestThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first no.");
		a=sc.nextInt();
		System.out.println("Enter second no.");
		b=sc.nextInt();
		System.out.println("Enter third no.");
		c=sc.nextInt();
		
		
		if(a>b && a>c)
		{
			System.out.println("A is the greatest");
			
		}
		else if(b>c && b>a)
		{
			System.out.println("B is the greatest");
		}
		else
		{
			System.out.println("C is the greatest");
		}
		sc.close();
	}

}
