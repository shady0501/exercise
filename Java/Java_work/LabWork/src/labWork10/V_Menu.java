package labWork10;

import java.util.Scanner;

public class V_Menu {
	private float money = 0;
	private int selectItem = 1;
	
	public void menu() {
		while(selectItem != -1) {
			System.out.println("Please select your transcation:");
			System.out.println("1: Deposit");
			System.out.println("2: Withdrawal");
			System.out.println("3: Query Balance");
			System.out.println("enter -1 to end the program");
			
			Scanner sc = new Scanner(System.in);
			selectItem = sc.nextInt();
		}
	}
	
	public void input() {
		C_Transaction tran = new C_Transaction();
		
		if(selectItem == 1) {
			System.out.println("输入存款金额：");
			Scanner sc = new Scanner (System.in);
			money = sc.nextFloat();
			tran.Deposit(money);
		}
		else if(selectItem == 2) {
			System.out.println("输入取款金额：");
			Scanner sc = new Scanner (System.in);
			money = sc.nextFloat();
			tran.Withdrawal(money);
		}
		else if(selectItem == 3)
			tran.GetBalance();
	}
	
	public static void main(String args[]) {
		V_Menu me = new V_Menu();
		me.menu();
		me.input();
	}
}
