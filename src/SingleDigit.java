import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Single digit number");
		int num=sc.nextInt();
		if (num /10<=1)
		{
			System.out.println(" single digit "+ num);
		}
		else
		{
			System.out.println("not a Single digit no." + num);
		}

	}

}
