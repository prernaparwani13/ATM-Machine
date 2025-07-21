package ATMMachine;
import java.util.*;

class ATM{
	int Bal;
	int PIN=5674;
	Scanner sc=new Scanner(System.in);
	public void checkpin() {
		System.out.println("Enter your pin");
		int enteredpin=sc.nextInt();
		if(enteredpin==PIN) {
			menu();
		}else {
			System.out.println("Enter valid pin");
			menu();
		}
	}
	public void menu(){
		System.out.println("Enter your choice");
		System.out.println("1.Check A/C Balance");
		System.out.println("2.Withdraw Money");
		System.out.println("3.Deposit Money");
		System.out.println("4.Exit");
		
		int opt=sc.nextInt();
		if(opt==1) {
			checkBalance();
		}
		else if(opt==2) {
			withdrawMoney();
		}
		else if(opt==3) {
			depositMoney();
		}
		else if(opt==4) {
			return;
		}
		else {
			System.out.println("Enter a valid choice");
		}
	}
	public void checkBalance() {
		System.out.println("Balance" +Bal);
		menu();
	}
	public void withdrawMoney() {
		System.out.println("Enter Amount to Withdraw");
		int amount=sc.nextInt();
		if(amount>Bal) {
			System.out.println("Insufficient Balance");
		}else {
			Bal=Bal-amount;
			System.out.println("Money Withdraw Successfully");
		}
		menu();
	}
	public void depositMoney() {
		System.out.println("Enter the Amount");
		int amount=sc.nextInt();
		Bal=+amount;
		System.out.println("Money Deposit Successfully");
		menu();
	}
}
public class ATMMachine {
	public static void main(String[]args) {
		ATM obj=new ATM();
		obj.checkpin();
	}
}
