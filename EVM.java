import java.util.Scanner;
class EVM
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int bjp=0,cng=0,aap=0,ss=0,nota=0;
		System.out.println();
		System.out.println("        WELOCME ");
		System.out.println();
		System.out.print("Enter the population : ");
		int population = sc.nextInt();
		for(int i = 1 ; i<= population ; i++)
		{
			System.out.println();
			System.out.println("List of parties : ");
			System.out.println("1.BJP ");
			System.out.println("2.CONGRESS ");
			System.out.println("3.AAP ");
			System.out.println("4.SHIV SENA ");
			System.out.println("5.NOTA ");

			System.out.println("Enter your vote : ");
			int otp = sc.nextInt();

			if(otp>=1&&otp<=5)
			{
					
				if(otp==1)
				{
					bjp++;
					System.out.println("ACHE DIN AYENGE");
				}
				if(otp==2)
				{
					cng++;
					System.out.println("AALU DALO SONA NIKALO");
				}
				if(otp==3)
				{
					aap++;
					System.out.println("HAME AZADI DO");
				}
				if(otp==4)
				{
					ss++;
					System.out.println("HAM HE ASLI SENA");
				}
				if(otp==5)
				{
					nota++;
					System.out.println("YOU ARE AN EDUCATED PERSON");
				}
			}
			if(!(otp>=1&&otp<=5))
			{
				i--;
				System.out.println(" INVALID INPUT ");
			}
		}
		System.out.println(bjp);
		System.out.println(cng);
		System.out.println(aap);
		System.out.println(ss);
		System.out.println(nota);
		    if(bjp>=cng && bjp>=aap && bjp>=ss && bjp>=nota)
			{
				System.out.println("BJP HAS WON THE ELECTION WITH : "+bjp+" VOTES");
				return;
			}
			if(cng>=bjp && cng>=aap && cng>=ss && cng>=nota)
			{
				System.out.println("CONGRESS HAS WON THE ELECTION WITH : "+cng+" VOTES");
				return;
			}
			if(aap>=bjp && aap>=cng && aap>=ss && aap>=nota)
			{
				System.out.println("AAP HAS WON THE ELECTION WITH : "+aap+" VOTES");
				return;
			}
			if(ss>=bjp && ss>=cng && ss>=aap && ss>=nota)
			{
				System.out.println("SHIV SENA HAS WON THE ELECTION WITH : "+ss+" VOTES");
				return;
			}
			if(nota>=bjp && nota>=cng && nota>=aap && nota>=ss)
			{
				System.out.println("NOTA HAS WON THE ELECTION WITH : "+bjp+" VOTES");
				return;
			}
	}
}
						
			
	