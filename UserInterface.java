package atm;
 import java.util.Scanner; 
   public class UserInterface {
     private static int status;
	public static void main(String[] args) {
	    AtmOperationImpl impl= new  AtmOperationImpl();
		try(Scanner scan =new Scanner(System.in)){
		int atmnumber=123456;
		int atmpin=123;
		
		System.out.println("WELLCOME TO ATM MACHINE");
		System.out.println("ENTER THE ATM NUMBER");
		int atmnum2 =scan.nextInt();
		System.out.println("ENTER THE ATM PIN");
		int atmpin2=scan.nextInt();
		if(atmnumber==atmnum2 && atmpin==atmpin2)
		{  while(true) {
			System.out.println();
			System.out.println(" 1.viewAvailable\n 2.withdrawAmount\n 3.DepositAmount\n 4.viewMinistament\n 5.Exit")	;
			System.out.println(" Enter your choice:");
			int ch=scan.nextInt();
			if(ch==1) {
				impl.viewBalance();
			}  
			else if(ch==2) {
				System.out.println("Enter the amount to withdraw ");
				double withdrawamount=scan.nextDouble();
				impl.withdrawAmount(withdrawamount);
			}
			else if(ch==3) {
				System.out.println("Enter the amount to deposit \n");
				double depositAmount=scan.nextDouble();
				impl.depositAmount(depositAmount);
			}	
			else if(ch==4) {
				impl.viewMiniStatement();
			}
			else if(ch==5) {
				System.out.println("collect your ATM card \n Thank You \n");
				
			}	
		}
		}
		else {
			System.out.println("INCORRECT ATM NUMBER OR PIN");	
		}
	}
   }
   }
		


