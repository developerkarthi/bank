package democalculator;
import java.util.*;

public class newdemo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insert Your Card : ");
		String card = in.next();
		System.out.print("Enter Your PIN : ");
		int pin = in.nextInt();
		int pass =1234;
		if(pin==pass)
		{
			long amount = 10000; 
			while(true)
			{
			System.out.print("\t--- Enter your Choise ---\n\n1.Change PIN    \t2.CASH withdraw\n3.Blance Enquery\t4.Add adhorNumber\n  : ");
			int option = in.nextInt();
			switch(option)
			{
			case 1 : System.out.print("Enter old pin : ");
			         int cpin = in.nextInt();
			         System.out.print("Enter new pin : ");
			         int npin = in.nextInt();
			         System.out.print("ReEnter  pin  : ");
			         int Npin = in.nextInt();
			         if((pin==cpin)&&(npin==Npin))
			         {
			        	 pass =npin;
			        	 System.out.println("Successfully pin changed...!");
			         }
			         else
			         {
			        	 System.out.println("\n You are Enter Wrong pin...!");
			         }
			         break;
			case 2 : System.out.print("Enter the Number of Amount : ");
	                 int wamount = in.nextInt();
	                 if(amount>0)
	                 {
	                	if((amount-wamount)>=0)
	                	{
	                		amount-=wamount;
	                		System.out.print("You are get the amount !");
	                		
	                	}
	                	else
	                	{
	                		System.out.print("You are amount in not withdraw");
	                	}
	                	 
	                 }
	                 else
	                 {
	                	 System.out.print("You are not in money");
	                 }
	                 break;
			case 3 : System.out.print("Yout current blance amount : "+amount);
			         break;
			case 4 : System.out.print("Enter the yout athere number : ");
                     long aa = in.nextInt();
                     System.out.print("Enter your phone number : ");
                     long pa = in.nextInt();
                     System.out.print("Successfully added yout athere number");
                     break;
           default : System.out.println("You enter worng choice");
                
			}
				
			}
			
			
			
			
		}
		
		

	}

}
