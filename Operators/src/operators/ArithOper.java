package operators;
/*
 * ���������(+, -, *, /, %)
 *   - ���ϱ� : +
 *   - ���� : -
 *   - ���ϱ� : *(�ƽ��͸���ũ)
 *   - ������ : /(������)
 *   - ������ : % 
 */
public class ArithOper {

	public static void main(String[] args) {
		// ���ڿ�(+)
		String str1 = "hello";
		String str2 = "world";
		String str3 = str1 + " " + str2 + "!!!";
		System.out.println(str3);
		
		String str4 = str3 + 99;
		System.out.println(str4);
		
		
		// ���ϱ�
		int a = 10;
		int b = 20;
		int c = a + b;
		
		System.out.printf("a(%d)(%x) + b(%d)(%x) = c(%d)(%x)\n", a, a, b, b, c, c);
		
		// ����
		int d = c - 10;
		int e = d - a;
		int f;
		f = d + e - b;
		System.out.println("d=" + d);
		System.out.println("e=" + e);
		System.out.println("f=" + f);
		
		// ���ϱ�
		int gg = 8 * 8;
		int g1 = gg * 1;
		int g2 = gg * 2;
		int g3 = gg * -1;
		
		System.out.println("gg=" + gg);
		System.out.println("g1=" + g1);
		System.out.println("g2=" + g2);
		System.out.println("g3=" + g3);
		
		// ������
		int d1 = g2 / 2;
		int d2 = g2 / 3; // ������ �������� �Ҽ������ϸ� ������.
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		
		// ������
		int n1 = g2 / 3;       // 3���� ���� ��
		int n2 = g2 - n1 * 3;  // 3���� ���� ������: n1*3 -> x, g2 - x 
		int n3 = g2 % 3;       // 3���� ���� ������ ��(0,1,2)
		System.out.println("��: n1=" + n1);
		System.out.println("������: n2=" + n2);
		System.out.println("������: n3=" + n3);
		
		// ��������� �켱����(������ �����ڴ� ���ʿ��� ���������� ���)
		int p1 = 100 * 2 / 3 % 5;
		System.out.println("�����ڿ켱����: p1=" + p1);
		

		// ��������� �켱����(���� ������)
		int p2 = 100 + 2 - 3 * 5;
		System.out.println("�����ڿ켱����: p2=" + p2);
		
		// ��������� �켱����(��ȣ)
		int p3 = 100 + (2 - 3) * 5;
		System.out.println("�����ڿ켱����: p3=" + p3);
		
		// ��������� �켱����(��ȣ)
		int p4 = (100 + (2 - 3)) * 5;
		System.out.println("�����ڿ켱����: p4=" + p4);
		
		// �Ҵ翬����(=)
		int x1, x2;
		int x3 = x2 = x1 = 6;
		System.out.printf("x1(%d), x2(%d), x3(%d)%n", x1, x2, x3);
		

		// �Ҵ翬����(=)
		// int y1 = 1;
		// int y2 = 2;
		int y1 = 1, y2 = 2;
		int y3 = y2 = y1 = 6;
		System.out.printf("y1(%d), y2(%d), y3(%d)%n", y1, y2, y3);
		
		// ��ȣ������(sign: +, -)
		int s1 = -1;
		int s2 = +2;
		int s3 = -y3; 
		int s4 = y3 * -1; 
		System.out.printf("s1(%d), s2(%d), [ s3(%d) ���� s4(%d) ]%n", s1, s2, s3, s4);
		
		// ��ȣ������(short)
		// short�� ��ȣ�����ڸ� ���� int�� ����ȯ�� �߻��Ѵ�.
		// �׷��Ƿ� int Ÿ������ ���� �Ҵ��ϰų� short�� ���� Ÿ�Ժ�ȯ�� �ؾ� �Ѵ�.
		short sh1 = 99;
		// short sh2 = -sh1; // Type mismatch: cannot convert from int to short
		int sh2 = -sh1;      // short�� int�� �Ҵ�
		short sh3 = (short)-sh1; // ���� Ÿ�� �ɽ���
		
		System.out.printf("*** sh1(%d) sh2(%d) sh3(%d)%n", sh1, sh2, sh3);
		
		// ����������(++) : 1�� ����
		int pp = 0;
		++pp;  // 1����(pp = pp + 1)
		System.out.println(pp);
		
		pp++; // 1����(pp = pp + 1)
		System.out.println(pp);
		
		System.out.println(++pp);
		System.out.println(pp++);  // ���� �� ����

		System.out.println(pp);

		// ���ҿ�����( --) : 1�� ����
		int mm = 0;
		--mm;  // 1����(mm = mm - 1)
		System.out.println("���ҿ�����:" + mm);
		
		mm--; // 1����(mm = mm - 1)
		System.out.println(mm);
		
		System.out.println(--mm);
		System.out.println(mm--);  // ���� �� ����

		System.out.println(mm);
		
		System.out.printf("pp(%d), mm(%d)\n",  pp, mm);
		int pp1 = pp++ + --mm; // pp1(4) + (-5) -> pp1(-1) -> pp(5) 
		//int pp1 = pp+++--mm; // pp1(4) + (-5) -> pp1(-1) -> pp(5) 
		System.out.printf("pp(%d), mm(%d), pp1(%d)\n",  pp, mm, pp1);
	}
}
