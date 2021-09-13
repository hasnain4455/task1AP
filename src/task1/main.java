package task1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main is written here
		System.out.println("Enter your account Number: ");
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		if(n<=0) {
			System.out.println("Invalid Account Number:\n");
		}
		else {
			Account obj1=new Account("Hasnain","Islamabd","1234",1111,2000,"11/11/11");
			System.out.println("1) Check Balance:");
			System.out.println("2) Deposit Amount:");
			System.out.println("3) Withdraw Amount:");
			System.out.println("4) Transfer Amount:");
			System.out.println("5) Calculate Zakat:");
			System.out.println("Enter your choice: ");
			Scanner inp1=new Scanner(System.in);
			int nn=inp1.nextInt();
			if(nn<=0) {
				System.out.println("Invalid Choice.\n");
			}
			else {
				if(nn==1) {
					obj1.checkBalance();
				}
				if(nn==2) {
					obj1.makeDeposit();
				}
				if(nn==3) {
					obj1.makeWithdrawal();
				}
				if(nn==4) {
					obj1.tansferAmount();
				}
				if(nn==5) {
					obj1.calculateZakat();
				}
				
			}
		}
	}
	
}
