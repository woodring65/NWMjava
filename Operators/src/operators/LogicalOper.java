package operators;
/*
 *  ��������(!, ||, &&)
 *  ������(!) : �ݴ�, true -> false, false -> true
 *  ����(||)  : OR,  A or B,  A �̰ų� B. A�� B�߿� �ϳ��� ���̸� ��
 *  ����(&&)  : AND, A and B, A �̰� B,   A�� B�� ��� ���̾�� ��
 */
public class LogicalOper {

	public static void main(String[] args) {
		
		// ������
		boolean play = true;
		System.out.println("play=" + play);
		
		play = !play;
		System.out.println("play=" + play);

		play = !play;
		System.out.println("play=" + play);
		
		// ����, ����
		boolean t = true;
		boolean f = false;
		boolean or = t || f;
		boolean or1 = f || f;
		boolean and = t && f;
		boolean and1 = t && t;
		
		System.out.printf("t(%b) or f(%b) = (%b)%n", t, f, or);
		System.out.printf("f(%b) or f(%b) = (%b)%n", f, f, or1);
		System.out.printf("t(%b) and f(%b) = (%b)%n", t, f, and);
		System.out.printf("t(%b) and t(%b) = (%b)%n", t, t, and1);
	}
}
