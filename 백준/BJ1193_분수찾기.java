import java.util.Scanner;

public class BJ1193_�м�ã�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int end = 0;
		int count = 1;
		int turn = 1;
		int start = 1;

		start = start + count;

		while (true) {
			if (num == 1) {
				System.out.println(1 + "/" + 1);
				break;
			}
			turn++;
			end = start + count;
			count++;

			if (start <= num && num <= end) {
				// Ȧ���� ��, ���ʺ��� ����
				if (turn % 2 == 1) {
					System.out.println((turn - (num - start)) + "/" + (turn - (end - num)));
					break;
				}

				if (turn % 2 == 0) {
					System.out.println((turn - (end - num)) + "/" + (turn - (num - start)));
					break;
				}
				// ¦���� ��, �����ʺ��� ����
			}
			start += count;
		}
	}

}
