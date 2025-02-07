import java.util.Scanner;
class StonePaperScissorGame
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int randomNum = 0;
		for (; ; )
		{
			int num = (int)(Math.random()*10);
			if (num>=1&&num<=3)
			{
				randomNum=num;
				break;
			}
		}
		String codeOpt = null;
		if (randomNum==1)
		{
			codeOpt = "STONE";
		}
		else if (randomNum==2)
		{
			codeOpt = "PAPER";
		}
		else if (randomNum==3)
		{
			codeOpt = "SCISSOR";
		}
		System.out.println();
		System.out.println("WELCOME");
		System.out.println();

		System.out.println(" 1.STONE \n 2.PAPER \n 3.SCISSOR");
		System.out.println();
		System.out.print("Enter Option : ");
		int opt = sc.nextInt();
		String userOpt = null;
		if (opt == 1)
		{
			userOpt = "STONE";
		}
		else if (opt == 2)
		{
			userOpt = "PAPER";
		}
		else if (opt == 3)
		{
			userOpt = "SCISSOR";
		}
		else 
		{
			System.out.println("INVALID INPUT.");
			return;
		}
		System.out.println("user : "+userOpt+" Computer : "+codeOpt);
		if ((opt==1&&randomNum==1)||(opt==2&&randomNum==1)||(opt==3&&randomNum==2))
		{
			System.out.println("USER WINS");
		}
		else if ((opt==1&&randomNum==2)||(opt==2&&randomNum==3)||(opt==3&&randomNum==1))
		{
			System.out.println("COMPUTER WINS");
		}
		else
		{
			System.out.println("DRAW");
		}
	}
}

