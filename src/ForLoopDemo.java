import java.util.Scanner;
public class ForLoopDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter value of N");
		int n=sc.nextInt();
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

}
