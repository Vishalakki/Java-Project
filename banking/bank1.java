package banking;

import java.util.Scanner;

public class bank1 
{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			String name = "";
			int pass_code;
			int ac_no;
			int ch;
			
			while(true)
			{
				System.out.println("\n ->|| Welcome to InBank ||<- \n");
				System.out.println("1)Create Account");
				System.out.println("2)Login Account");
				
				try
				{
					System.out.print("\n Enter Input:");
					ch = sc.nextInt();
					
					switch(ch)
					{
					case 1:
						try
						{
							System.out.println("Enter Unique UserName:");
							name = (sc.nextLine());
							System.out.println("Enter New Password:");
							pass_code = sc.nextInt();
							
							if (bankManagement1.createAccount(name, pass_code)) 
							{
								System.out.println(" Account Created Successfully!\n");
							}
							else 
							{
								System.out.println(" Account Creation Failed!\n");
							}
								
						}
						catch(Exception e)
						{
							System.out.println("  Enter Valid Data::Insertion Failed!\n");
						}
						break;
						
					case 2:
						try 
						{
							System.out.println("Enter UserName:");
							name = sc.nextLine();
							System.out.println("Enter Password:");
							pass_code = sc.nextInt();

							if (bankManagement1.loginAccount(name, pass_code)) 
							{
								System.out.println(" Logout Successfully!\n");
							}
							else 
							{
								System.out.println(" login Failed!\n");
							}
							break;
						}
						
						catch (Exception e) {
							System.out.println(" Enter Valid Data::Login Failed!\n");
						}

						break;
						
					default:
						System.out.println("Invalid Entry!\n");
						
					}
					
					if (ch == 5) {
						System.out.println("Exited Successfully!\n\n Thank You :)");
						break;
					}
				}
					catch(Exception e)
					{
						System.out.println("Enter Valid Entry!");
					}
				}
			sc.close();
			}
}
	

