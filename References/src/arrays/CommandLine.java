package arrays;
/*
 * Ŀ������(command line)
 */
public class CommandLine {

	public static void main(String[] args) {
		System.out.println("args.length=" + args.length);
		
		int argslen = args.length;
		if(argslen < 2) {
			if(argslen == 1 && args[0].equalsIgnoreCase("-help")) { // ��ҹ��� ���о��� ���ڿ�("help")�� ��
				System.out.println("CommandLine -help");
				System.out.println("\t 10 20 30 ...");
			}
			else {
				System.out.println("CommandLine Usage:");
				System.out.println("\t num [num ...]");
			}
			return;
		}
		
		int total = 0;
		for(int cnt=0; cnt < argslen; cnt++) {
			System.out.printf("args[%d][%s]\n", cnt, args[cnt]);
			int num = Integer.parseInt(args[cnt]);
			total += num;
		}
		
		System.out.println("total=" + total);
	}
}
