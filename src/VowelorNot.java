import java.util.Scanner;

public class VowelorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a vowel");
		char a= sc.next().charAt(0);
		if(a=='a' ||a=='A'|| a=='e'||a=='E'||a=='i'||a=='o'||a=='u')
		{
			System.out.println("Vowel");
		}
		else
			System.out.println("Noooooo");
	}

}
