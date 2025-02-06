import java.util.Scanner;
class Calculator
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num 1 : ");
		float num1 = sc.nextFloat();
		System.out.print("Enter num 2 : ");
		float num2 = sc.nextFloat();
		
		System.out.print("Enter the operator : ");
		char op = sc.next().charAt(0);

		float otp = (op=='+')?(num1+num2):
			((op=='-')?(num1-num2):
			((op=='*')?(num1*num2):
			((op=='/')?(num1/num2):
			((op=='%')?(num1%num2):
			(0.000001f)))));

		String output = num1+ " "+op+" "+num2+" = "+otp;
		
		if(!(otp==0.000001f))
			System.out.println(output);
			
	}
}

