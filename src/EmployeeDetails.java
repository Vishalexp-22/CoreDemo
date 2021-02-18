import java.util.Scanner;
public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name = null;
		int basic,hra,da,pf,net;
		System.out.println("Enter Employee no. from 1-4");
		int EmployeeDetails=sc.nextInt();
		
		switch(EmployeeDetails)
		{
		case 1:
			System.out.println("Enter Employee's Name");
			 name=sc.next();
			System.out.println("Enter Basic");
			 basic=sc.nextInt();
			System.out.println("Enter HRA");
			 hra=sc.nextInt();
			System.out.println("Enter DA");
			 da=sc.nextInt();
			System.out.println("Enter Provident Fund");
			 pf=sc.nextInt();
			 net=(basic+hra+da)-pf;
			 System.out.println("Employee Name is "+name+" and net salary is "+net);
			 break;
		case 2:
			System.out.println("Enter Employee's Name");
			 name=sc.next();
			System.out.println("Enter Basic");
			 basic=sc.nextInt();
			System.out.println("Enter HRA");
			 hra=sc.nextInt();
			System.out.println("Enter DA");
			 da=sc.nextInt();
			System.out.println("Enter Provident Fund");
			 pf=sc.nextInt();
			 net=(basic+hra+da)-pf;
			 System.out.println("Employee Name is "+name+" and net salary is "+net);
			 break;
		case 3:
			System.out.println("Enter Employee's Name");
			name=sc.next();
			System.out.println("Enter Basic");
			 basic=sc.nextInt();
			System.out.println("Enter HRA");
			 hra=sc.nextInt();
			System.out.println("Enter DA");
			 da=sc.nextInt();
			System.out.println("Enter Provident Fund");
			 pf=sc.nextInt();
			 net=(basic+hra+da)-pf;
			 System.out.println("Employee Name is "+name+" and net salary is "+net);
			 break;
		case 4:
			name=sc.next();
			System.out.println("Enter Basic");
			 basic=sc.nextInt();
			System.out.println("Enter HRA");
			 hra=sc.nextInt();
			System.out.println("Enter DA");
			 da=sc.nextInt();
			System.out.println("Enter Provident Fund");
			 pf=sc.nextInt();
			 net=(basic+hra+da)-pf;
			 System.out.println("Employee Name is "+name+" and net salary is "+net);
			 break;
		default:
			System.out.println("Wrong choice");
			break;
		}
		
		
		
	}

}
