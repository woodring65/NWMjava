package forstmt;
/*
 * �ݺ���(for)
 *   - continue : ���� �������� �帧�� �̵��Ͽ� ���ǽ��� �Ǵ�
 */
public class ForStatement14 {

	public static void main(String[] args) {
		for(int cnt=1; cnt <= 10; cnt++) {
			if(cnt % 2 != 0) { // Ȧ��
				continue;
			}
			
			System.out.println(cnt); // ¦��
		}

	}

}
