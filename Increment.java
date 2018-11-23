package lab1;

import java.util.Scanner;

public class Increment {
	
	/*public static int[] plusOne(int[] input) {
		int[] more = new int[input.length + 1];
		System.arraycopy(input, 0, more, 0, input.length);
		input = more;
		return input;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int smol = 0;
		int hueg = 0;
		int[] incre = new int[2];
		
		int i = 0;
		do {
			incre[i] = sc.nextInt();
			smol = incre[i];
			if (smol < hueg && i != 0)
				break;
			
			//expand array
			int[] more = new int[incre.length + 1];
			System.arraycopy(incre, 0, more, 0, incre.length);
			incre = more;
			
			i++;
			//System.out.println("smol = " + smol + ", hueg  = " + hueg + ", i = " + i);
			incre[i] = sc.nextInt();
			hueg = incre[i];
			if (smol > hueg)
				break;
			i++;
			//System.out.println("smol = " + smol + ", hueg  = " + hueg + ", i = " + i);
			
			//expand array
			int[] moreNi = new int[incre.length + 1];
			System.arraycopy(incre, 0, moreNi, 0, incre.length);
			incre = moreNi;
			
		}while (smol <= hueg);
		
		if (hueg < 0) {
			System.out.println("0.00");
			System.exit(0);
		}
		
		int[] increMents = new int[i-1];
		for (int n = 0; n < (i-1); n++) {
			increMents[n] = incre[n+1] - incre[n];
		}
		
		double sum = 0;
		for (int n = 0; n < increMents.length; n++) {
			sum += increMents[n];
		}
		
		System.out.println(sum);
		System.out.println(i-1);
		double avg = sum / (i-1);
		System.out.println(avg);
		System.out.printf("%.2f", avg);
		
		//for (i = 0; i < incre.length; i++)
			//System.out.println(incre[i]);
			
	}

}
