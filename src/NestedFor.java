import java.util.Scanner;
public class NestedFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
