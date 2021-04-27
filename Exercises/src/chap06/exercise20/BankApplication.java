package chap06.exercise20;

import java.util.Scanner;

public class BankApplication {
	static final int MAX_ACCOUNT = 100;
	private static Account[] accounts = new Account[MAX_ACCOUNT];
	private static Scanner scanner = new Scanner(System.in);
	private static int lastAccount = 0;

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			int selectNo = selectMenu();
			
			switch(selectNo) {
			case 1: // ���»���
				createAccount();
				break;
				
			case 2: // ���¸��
				accountList();
				break;
				
			case 3: // ����
				deposit();
				break;
				
			case 4: // ���
				withdraw();
				break;
			
			case 5: // ����
				run = false;
				break;
			}
		} // while
	}
	
	private static int selectMenu() {
		System.out.println("+-------------+-------------+---------+---------+---------+");
		System.out.println("| [1]���»��� | [2]���¸�� | [3]���� | [4]��� | [5]���� |");
		System.out.println("+-------------+-------------+---------+---------+---------+");
		System.out.print("����> ");
		
		// return BankApplication.scanner.nextInt();
		return scanner.nextInt();
	}
	
	private static void createAccount() {
		if(lastAccount >= BankApplication.MAX_ACCOUNT) {
			System.out.println("���¼��� �� ã���ϴ�.");
			return;
		}
		
		System.out.println("+-------------+");
		System.out.println("| [1]���»��� |");
		System.out.println("+-------------+");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		
		System.out.print("������: ");
		String owner = scanner.next();
		
		System.out.print("�Աݾ�: ");
		int balance = scanner.nextInt();

		// Account account = new Account(ano, owner, balance);
		// accounts[lastAccount++] = account;
		
		accounts[lastAccount++] = new Account(ano, owner, balance);
	}
	
	private static void accountList() {
		System.out.println("+-------------+");
		System.out.println("| [2]���¸�� |");
		System.out.println("+-------------+");

		for(int cnt = 0; cnt < lastAccount; cnt++) {
			Account account = accounts[cnt];
			System.out.printf("%10s %10s %10d\n", account.getAno(), account.getOwner(), account.getBalance());
		}
	}
	
	private static void deposit() {
		System.out.println("+---------+");
		System.out.println("| [3]���� |");
		System.out.println("+---------+");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		
		System.out.print("�Աݾ�: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account != null) {
			account.addBalance(balance);
			System.out.println("����: �ܰ�" + account.getBalance());
		}
	}
	
	private static void withdraw() {
		System.out.println("+---------+");
		System.out.println("| [4]��� |");
		System.out.println("+---------+");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		
		System.out.print("��ݾ�: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account != null) {
			account.delBalance(balance);
			System.out.println("���: �ܰ�" + account.getBalance());
		}
	}
	
	private static Account findAccount(String ano) {
		for(Account account : accounts) {
			if(ano.equals(account.getAno())) {
				return account;
			}
		}
		
		return null;
	}
}
