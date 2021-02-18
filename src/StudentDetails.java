import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name = null,course=null;
		int phy ,chem,bio,math,eng;
		int res;
		System.out.println("Enter Students Roll Number between 1-5");
		int roll=sc.nextInt();
		
		
		
		switch(roll)
		{
		case 1:
			
				System.out.println("Enter Students Name");
				 name=sc.next();
				System.out.println("Enter Course");
				 course=sc.next();
				System.out.println("Enter Marks scored in physics");
				 phy=sc.nextInt();
				System.out.println("Enter Marks scored in chemistry");
				 chem=sc.nextInt();
				System.out.println("Enter Marks scored in Bio");
				bio=sc.nextInt();
				System.out.println("Enter Marks scored in Mathematics");
				 math=sc.nextInt();
				System.out.println("Enter Marks scored in English");
				 eng=sc.nextInt();
				 res=((phy+chem+math+bio+eng));
				 if((int)res>=200)
				 {
					 System.out.println("Name: "+name);
					 System.out.println("Roll number "+roll+ " has Passed with "+res+" marks");
					 System.out.println("Course: "+course);
				 }
				 else
				 {
					 System.out.println("Fail");
				 }
				 break;
				 
		case 2:
			System.out.println("Enter Students Name");
			 name=sc.next();
			System.out.println("Enter Course");
			 course=sc.next();
			System.out.println("Enter Marks scored in physics");
			 phy=sc.nextInt();
			System.out.println("Enter Marks scored in chemistry");
			 chem=sc.nextInt();
			System.out.println("Enter Marks scored in Bio");
			bio=sc.nextInt();
			System.out.println("Enter Marks scored in Mathematics");
			 math=sc.nextInt();
			System.out.println("Enter Marks scored in English");
			 eng=sc.nextInt();
			 res=((phy+chem+math+bio+eng));
			 if(res>=200)
			 {
				 System.out.println("Name: "+name);
				 System.out.println("Roll number "+roll+ " has Passed with "+res+" marks");
				 System.out.println("Course: "+course);
				 
			 }
			 else
			 {
				 System.out.println("Fail");
			 }
			 break;
			 
		case 3:
			System.out.println("Enter Students Name");
			 name=sc.next();
			System.out.println("Enter Course");
			 course=sc.next();
			System.out.println("Enter Marks scored in physics");
			 phy=sc.nextInt();
			System.out.println("Enter Marks scored in chemistry");
			 chem=sc.nextInt();
			System.out.println("Enter Marks scored in Bio");
			bio=sc.nextInt();
			System.out.println("Enter Marks scored in Mathematics");
			 math=sc.nextInt();
			System.out.println("Enter Marks scored in English");
			 eng=sc.nextInt();
			 res=((phy+chem+math+bio+eng));
			 if(res>=200)
			 {
				 System.out.println("Name: "+name);
				 System.out.println("Roll number "+roll+ " has Passed with "+res+" marks");
				 System.out.println("Course: "+course);
				 
			 }
			 else
			 {
				 System.out.println("Fail");
			 }
			 break;
			 
		case 4:
			System.out.println("Enter Students Name");
			 name=sc.next();
			System.out.println("Enter Course");
			 course=sc.next();
			System.out.println("Enter Marks scored in physics");
			 phy=sc.nextInt();
			System.out.println("Enter Marks scored in chemistry");
			 chem=sc.nextInt();
			System.out.println("Enter Marks scored in Bio");
			bio=sc.nextInt();
			System.out.println("Enter Marks scored in Mathematics");
			 math=sc.nextInt();
			System.out.println("Enter Marks scored in English");
			 eng=sc.nextInt();
			 res=((phy+chem+math+bio+eng));
			 if(res>=200)
			 {
				 System.out.println("Name: "+name);
				 System.out.println("Roll number "+roll+ " has Passed with "+res+" marks");
				 System.out.println("Course: "+course);
			 }
			 else
			 {
				 System.out.println("Fail");
			 }
			 break;
			 
		case 5:
			System.out.println("Enter Students Name");
			 name=sc.next();
			System.out.println("Enter Course");
			 course=sc.next();
			System.out.println("Enter Marks scored in physics");
			 phy=sc.nextInt();
			System.out.println("Enter Marks scored in chemistry");
			 chem=sc.nextInt();
			System.out.println("Enter Marks scored in Bio");
			bio=sc.nextInt();
			System.out.println("Enter Marks scored in Mathematics");
			 math=sc.nextInt();
			System.out.println("Enter Marks scored in English");
			 eng=sc.nextInt();
			 res=((phy+chem+math+bio+eng));
			 if(res>=200)
			 {
				 System.out.println("Name: "+name);
				 System.out.println("Roll number "+roll+ " has Passed with "+res+" marks");
				 System.out.println("Course: "+course);
			 }
			 else
			 {
				 System.out.println("Fail");
			 }
			 break;
			 
		default:
			System.out.println("wrong choice");
			break;
			
		
	
			
		}
	}

}
