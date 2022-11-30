import java.util.Scanner;  
public class ATMInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		//declare and initialize balance, withdraw, and deposit  
		      int balance = 0, withdraw, deposit;  
		          
		      Scanner sc = new Scanner(System.in);  
		          
		        while(true)  
		        {  
		            System.out.println("ATM");  
		            System.out.println("Choose 1 for Withdraw");  
		            System.out.println("Choose 2 for Deposit");  
		            System.out.println("Choose 3 for Check Balance");  
		            System.out.println("Choose 4 for EXIT");  
		            System.out.print("Choose the operation you want to perform:");  
		              
		            //get choice from user  
		            int choice = sc.nextInt();  
		            switch(choice)  
		            {  
		                case 1:  
		        System.out.print("Please enter money to be withdrawn:");  
		                      
		        //get the withdrawl money from user  
		        withdraw = sc.nextInt();  
		                      
		        //check whether the balance is greater than or equal to the withdrawal amount  
		        if(balance >= withdraw)  
		        {  
		            //remove the withdrawal amount from the total balance  
		            balance = balance - withdraw;  
		            System.out.println("Please collect your money");  
		        }  
		        else  
		        {  
		            //show custom error message   
		            System.out.println("Insufficient Balance");  
		        }  
		        System.out.println("");  
		        break;  
		   
		                case 2:  
		                      
		        System.out.print("Please enter money to be deposited:");  
		                      
		        //get deposit amount from the user  
		        deposit = sc.nextInt();  
		                      
		        //add the deposit amount to the total balance  
		        balance = balance + deposit;  
		        System.out.println("Your Money has been successfully depsited");  
		        System.out.println("");  
		        break;  
		   
		                case 3:  
		        //displaying the total balance of the user  
		        System.out.println("Your Balance : "+balance);  
		        System.out.println("");  
		        break;  
		   
		                case 4:  
		        //exit from the menu
		        System.out.println("Thank You!");
		        System.exit(0);
		 
		            }  
		        }  
		    }  
		
	}


