package swstmt;
/*
 * ���ǹ�(switch)
 * case ����:     -> case 1,2,3:
 * case ����:     -> case 'a', 'A':
 * case ���ڿ�:   -> case "abc":
 */
public class SwitchStatement2 {

	public static void main(String[] args) {
		// int num = (int)(Math.random() * 6) + 1;
		
		// int num = 0;
		int num = 1;
		// int num = 2;
		//int num = 3;
		// int num = 4;
		//int num = 5;
		//int num = 6;

		/* 
		if(num == 1) {
			System.out.println("num is 1");
			if(num == 1 || num == 2) {
				System.out.println("num is 2");
			}
		}
		*/
		
		switch(num) {
		case 1:
			System.out.println("num is 1");
		
		case 2:
			System.out.println("num is 2"); break;
			
		case 3:
			System.out.println("num is 3"); break;
			
		case 4:
			System.out.println("num is 4"); break;
			
		case 5:
			System.out.println("num is 5"); break;
			
		case 6:
			System.out.println("num is 6"); break;
			
		default: // ���� case�� �ش���� �ʴ� ���� ���
			System.out.println("num is other");
		}

	}

}
