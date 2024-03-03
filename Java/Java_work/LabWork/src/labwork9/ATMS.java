package labwork9;

import java.util.Scanner;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class ATMS {
	public double queryBalance;
	public int selectItem;
	
	public ATMS() {
		queryBalance = 0;
		selectItem = -1;
	}
	
	public void Deposit(){
		System.out.println("please enter the deposit amount:");
		Scanner sc = new Scanner(System.in);
		double deposit = sc.nextDouble();
		
		if(deposit < 0) {
			System.out.println("the deposit cannot < 0");
			return;
		}	
		
		queryBalance += deposit;
	}
	
	public void Withdrawal(){
		System.out.println("please enter the withdrawal amount:");
		Scanner sc = new Scanner(System.in);
		double withdrawal = sc.nextDouble();
		
		if(withdrawal < 0) {
			System.out.println("the withdrawal cannot < 0");
			return;
		}
		if(withdrawal > queryBalance)
		{
			System.out.println("the withdrawal cannot > banalce");
			return;
		}
		queryBalance -= withdrawal;
			
	}
	
	public void QueryBalance() {
		System.out.println("balance:"+queryBalance);
	}

	public void Menu()
	{
		System.out.println("Please select your transcation:");
		System.out.println("1: Deposit");
		System.out.println("2: Withdrawal");
		System.out.println("3: Query Balance");
		System.out.println("enter -1 to end the program");
		
		Scanner sc = new Scanner(System.in);
		selectItem = sc.nextInt();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMS atm = new ATMS();
		atm.Menu();
		while(atm.selectItem != -1) {
		if(atm.selectItem == 1)
			atm.Deposit();
		else if(atm.selectItem == 2)
			atm.Withdrawal();
		else if(atm.selectItem == 3)
			atm.QueryBalance();
		atm.Menu();
		}
		
		System.out.println("end successfully");
	}
}
