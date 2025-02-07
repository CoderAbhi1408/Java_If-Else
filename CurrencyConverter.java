import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String [] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("       CURRENCY CONVERTER ");
		System.out.println();
		System.out.print("Enter the amount (INR) : ");

		float inr = sc.nextFloat();
		System.out.println();

		System.out.println("Enter the list of currencies : ");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		System.out.println();

		System.out.println("Enter the Currency");
		String curr = sc.next().toUpperCase();
		float otp = 0;
		
		if(curr.equals("USD"))
		{
			 otp = inr/86.52f;
			System.out.println(inr+ " INR = "+otp+" USD");
		}
		else if (curr.equals("EUR"))
		{
			otp = inr/90.28f;
			System.out.println(inr+ " INR = "+otp+" USD");
		}
		else if (curr.equals("GBP"))
		{
			otp = inr/107.66f;
			System.out.println(inr+ " INR = "+otp+" GBP");
		}
		else if (curr.equals("PKR"))
		{
			otp = inr/0.31f;
			System.out.println(inr+ " INR = "+otp+" PKR");
		}
		else 
		{
			System.out.println("INVALID INPUT");
		}
	}
}
	
