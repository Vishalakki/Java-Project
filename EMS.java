//package EmpoyleeMangmentSystem;

import java.util.*;

interface client
{
	void emp1();
	void emp2();
	void emp3();
	void output1();
	void output2();
	void output3();
}
 class me implements client
{
	 int ID1,ID2,ID3;
	 String Name1,Name2,Name3;
	 int no1,no2,no3;
	 double sal1,sal2,sal3;
	
	 public void emp1()
	{
		 ID1 = 111;
		 Name1 = "AAAA";
		 no1 = 1234567890;
		 sal1 = 20000.45;
	}
	 public void output1()
		{
			System.out.println("ID : "+ID1);
			System.out.println("Name : "+Name1);
			System.out.println("Contact Number : "+no1);
			System.out.println("Salary : "+sal1);
		}
	 public void emp2()
		{
			 ID2 = 222;
			 Name2 = "BBBB";
			 no2 = 1234567890;
			 sal2 = 22000.85;
		}
	 public void output2()
	 {
			System.out.println("ID : "+ID2);
			System.out.println("Name : "+Name2);
			System.out.println("Contact Number : "+no2);
			System.out.println("Salary : "+sal2);
		}
	 public void emp3()
		{
			 ID3 = 333;
			 Name3 = "CCCC";
			 no3 = 1234567890;
			 sal3 = 25000.48;
		}
	public void output3()
	{
		System.out.println("ID : "+ID3);
		System.out.println("Name : "+Name3);
		System.out.println("Contact Number : "+no3);
		System.out.println("Salary : "+sal3);
	}
}
public class EMS 
{
	public static void main(String[] args) 
	{
	Scanner cc = new Scanner(System.in);
		System.out.println("Enter userid");
		int qa = cc.nextInt();
		 
			{
				if(qa==7410)
				{
					client c = new me();
					c.emp1();
					c.output1();
				}
				else if(qa==8520)
				{
					client c = new me();
					c.emp2();
					c.output2();
				}
				else if(qa==9630)
				{
					client c = new me();
					c.emp3();
					c.output3();
				}
				else if(qa==4444)
				{
					client c = new me();
					System.out.println("Emp1");
					c.emp1();
					c.output1();
					System.out.println();
					System.out.println("Emp2");
					c.emp2();
					c.output2();
					System.out.println();
					System.out.println("Emp3");
					c.emp3();
					c.output3();
				}
				else 
				{
					System.out.println("Enter Carete ID");
				}
			} 
		}		
}
