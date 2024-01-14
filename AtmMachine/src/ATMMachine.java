import java.util.Scanner;

class ATM {
	float balance;
	int pin = 5467;

	void main() {
		System.out.println("Enter your pin");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		if (enteredpin == pin) {
			menu();
		} else {
			System.out.println("Enter Valid Pin: ");
		}
	}

	public void menu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Check Acccount Balance");
		System.out.println("2. Withdraw money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Exit");

		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();

		if (opt == 1) {
			checkBalance();
		} else if (opt == 2) {
			withdrawMoney();
		} else if (opt == 3) {
			depositMoney();
		} else if (opt == 4) {
			return;
		}else {
			System.out.println("Enter the Valid choice");
		}
	}

	private void withdrawMoney() {
		System.out.println("Enter amount to withdraw");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if (amount > balance) {
			System.out.println("insufficient fund");
		} else {
			balance = balance - amount;
			System.out.println("Money withdraw successful");
		}
		menu();
	}

	private void checkBalance() {
		System.out.println("Balance: " + balance);
		menu();
	}

	public void depositMoney() {
		System.out.println("Enter the amout: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		balance = balance + amount;
		System.out.println("Money deposited successful");
		menu();
	}
}

public class ATMMachine {

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.main();

	}

}
