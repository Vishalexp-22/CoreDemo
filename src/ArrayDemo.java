import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		int age[]= {24,54,18,78,42,87};
		Scanner sc=new Scanner(System.in);
		System.out.println("Print array using loop");
		for(int i=0;i< age.length;i++)
		{
			System.out.println(age[i]);
		}
	}

}
