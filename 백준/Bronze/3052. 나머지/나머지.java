import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] input = new int[42];

		for(int k=0; k<42; k++) {
			input[k]=-1;
		}
		int num = 0;
		int count = 0;
		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			num %= 42;
			input[num] = num;
		}
		for (int j = 0; j < 42; j++) {
			if (input[j] != -1) {
				count++;
			}else;
		}
		System.out.println(count);
	}
}
