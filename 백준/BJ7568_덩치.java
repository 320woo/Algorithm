import java.util.Scanner;

public class BJ7568_��ġ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[][] arr = new int[T][T];
		int[] count = new int[T];

		for (int i = 0; i < T; i++) {
			count[i] = 1;
		}

		for (int i = 0; i < T; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		for (int i = 0; i < T; i++) {
			for (int j = i+1; j < T; j++) {
				
				//A�� �� Ŭ ��� A�� ī��Ʈ�� +1
				if (arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) {
					count[j]++;
				}
				
				//B�� �� Ŭ ��� A�� ī��Ʈ�� +1
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					count[i]++;
				}

				else {
					continue;
				}
			}
		}

		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}

	}

}
