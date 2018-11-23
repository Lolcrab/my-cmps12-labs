package lab1;

import java.util.Scanner;

public class Sequence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String startSeq = new String(sc.nextLine());
		String[] divInt = startSeq.split("\\s+");
		int[] intSeq = new int[divInt.length];
		for (int i = 0; i < divInt.length; i++) {
			intSeq[i] = Integer.parseInt(divInt[i]);
		}
		int less3;
		do {
			less3 = sc.nextInt() - 3;
			//System.out.println(less3);
		} while (less3 < 0);
		
		if (less3 == 0) {
			System.out.print(intSeq[0]);
			for (int i = 1; i < divInt.length; i++)
				System.out.print(" "+intSeq[i]);
			System.exit(0);
		}
		int firstOp = intSeq[1] - intSeq[0];
		int secOp = intSeq [2] - intSeq[1];
		
		int[] extend = new int[less3];
		System.out.print(intSeq[0]);
		for (int i = 1; i < divInt.length; i++)
			System.out.print(" "+intSeq[i]);
		extend[0] = intSeq[2] + firstOp;
		System.out.print(" " +extend[0]);
		for (int i = 1; i < less3; i++) {
			extend[i] = extend[i-1] + secOp;
			System.out.print(" " + extend[i]);
			i++;
			if (i == less3)
				System.exit(0);
			extend[i] = extend[i-1] + firstOp;
			System.out.print(" " + extend[i]);
		}
	}

}
