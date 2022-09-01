//package calculator;
import java.util.Scanner;

class calculator 
{

    public static void main(String[] args) 
    {
        {
            String a = " ";
            Scanner s = new Scanner(System.in);
            System.out.print("Enter your Name: ");
            a = s.nextLine();
            System.out.println("Hi " + a);
            System.out.println("Select Opretor");
            System.out.println("1. Arithmatic");
            System.out.println("2. Bitwisw");

            {
                int op;
                Scanner sc = new Scanner(System.in);
                System.out.print("Select OP: ");
                op = s.nextInt();

                {
                    if (op == 1)
                    {
                        System.out.println("    1. Arithmatic");
                        System.out.println("1. Add");
                        System.out.println("2. sub");
                        System.out.println("3. mul");
                        System.out.println("4. div");
                        System.out.println("5. Modulo");
                        System.out.println("\nPlease Select Number");

                        int dp;
                        Scanner aa = new Scanner(System.in);
                        System.out.print("Select OP: ");
                        dp = s.nextInt();

                        {
                            int num1, num2;
                            Scanner SC = new Scanner(System.in);
                            System.out.print("\nEnter two number \n");
                            System.out.print("1st no: ");
                            num1 = s.nextInt();
                            System.out.print("2nd no: ");
                            num2 = s.nextInt();

                            {
                                if (op == 1) {
                                    op = (num1 + num2);
                                    System.out.print("Addition of two no : ");
                                } else if (op == 2) {
                                    op = (num1 - num2);
                                    System.out.print("Sub of two no : ");
                                } else if (op == 3) {
                                    op = (num1 * num2);
                                    System.out.print("mul of two no : ");
                                } else if (op == 4) {
                                    op = (num1 / num2);
                                    System.out.print("div of two no : ");
                                } else if (op == 5) {
                                    op = (num1 % num2);
                                    System.out.print("modulo of two no : ");
                                } else {
                                    System.out.print("Wrong no. Please Enter correct no.");
                                }
                            }
                            System.out.println(op);
                        }
                    }

                    else if (op == 2) 
                    {
                        System.out.println("     2. Bitwise");
                        System.out.println("1. AND");
                        System.out.println("2. OR");
                        System.out.println("3. XOR");
                        System.out.println("4. Complement");

                        {
                            int dp = ' ';
                            Scanner aa = new Scanner(System.in);
                            System.out.print("Select OP: ");
                            dp = s.nextInt();

                            {
                                int num1, num2;
                                Scanner SC = new Scanner(System.in);
                                System.out.print("\nEnter two number \n");
                                System.out.print("1st no: ");
                                num1 = s.nextInt();
                                System.out.print("2nd no: ");
                                num2 = s.nextInt();

                                {
                                    if (dp == 1) {
                                        dp = (num1 & num2);
                                        System.out.print("AND two no : ");
                                    } else if (dp == 2) {
                                        dp = (num1 | num2);
                                        System.out.print("OR two no : ");
                                    } else if (dp == 3) {
                                        dp = (num1 ^ num2);
                                        System.out.print("XOR two no : ");
                                    } else {
                                        System.out.print("Wrong no.");
                                    }
                                }
                                System.out.print(dp);
                                System.out.println("      !!! THANK TOU !!!");
                            }
                        }
                    }

                    else 
                    {
                        System.out.println("   Wrong No.");
                    }
                }
            }
        }
    }
}
