//ok done
import java.util.*;
public class CoderBank {
	Scanner in = new Scanner(System.in);
	String de_name,Typeofaccount;
	long A_no,Amount; 
	int q=1;
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		CoderBank b1 = new CoderBank();
		System.out.println("\t\t-----------WELCOME TO CODER BANK---------");
		b1.values();
		b1.displaybalance();
		int i=0;
		while(i!=4)
		{
			System.out.println("\n1.Withdraw\n2.Deposit\n3.Cheack"
					+ " Balence\n4.Exit\nEnter Your Choice....");
			i=input.nextInt();
			switch(i)
			{
				case 1 : b1.withdraw();
				         break;
				case 2 : b1.deposit();
				         break;
			 	case 3 : b1.displaybalance();
				         break;
				case 4 : System.out.println("THANK YOU FOR USEING CODER BANK");
				         i=4;
	 }  }   }
	
	void values()
	{   System.out.print("Enter Depositer Name  : ");
		de_name = in.nextLine(); 
		System.out.print("Enter Account Number  : ");
		A_no = in.nextLong();
		System.out.print("Enter Type of Account : ");
		String asd =in.nextLine();
		Typeofaccount = in.nextLine();
		System.out.print("Enter initial Amount  : ");
		Amount = in.nextLong();
	}
	
	void deposit()
	{  
		System.out.print("Enter Deposit Amount  : ");
		Long d  = in.nextLong();
		Amount +=d;
		System.out.print("Your Amount Deposit Succesfulley!!!");
	}
	
	void withdraw()
	{
		System.out.print("Enter Withdraw Amount  : ");
		Long d  = in.nextLong();
		Amount -=d;
		System.out.print("Your Amount Withdraw Succesfulley!!!");
		
	}
	
	void displaybalance()
	{
		if(q==1)
		{
		System.out.print("\nDepositer Name  : "+de_name);
		System.out.print("\nAccount Number  : "+A_no);
		System.out.print("\nType of Account : "+Typeofaccount);
		++q;
		}
		System.out.print("\nAccount Balence : "+Amount+"\n");	
	}
}
