import java.util.Scanner;
class LoanConverter
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("LOAN CALCULATOR");
		System.out.println();
		System.out.print("Enter the amount :");
		float amount = sc.nextFloat();
		System.out.println();
		System.out.print("Enter the ROI : ");
		float roi =sc.nextFloat();
		System.out.println();
		System.out.print("Enter the tenure (months) :");
		int month = sc.nextInt();
		String str =(month/12)+"."+(month%12);
		float con = Float.parseFloat(str);
		System.out.println();
		System.out.println("LOAN CALCULATOR");
		System.out.println("principal amount : "+amount);
		System.out.println("ROI : "+roi+" %");
		System.out.println("Tenure : "+month+" months");

		float intYear = amount*roi/100;
		float totalInter = intYear*con;
		System.out.println("Interest : "+totalInter);
		float outstanding = amount + totalInter;;;;;;;
		System.out.println("Total outstanding Amount :"+(outstanding));
		System.out.println("EMI : "+(outstanding/month)+ " rs");
	}
}