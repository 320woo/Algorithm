import java.util.Scanner;

public class BJ1085_���簢������Ż�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int minx = 0;
		int miny = 0;
		
		//���ΰ��� ������
		if(w-x > x)minx = x;
		if(w-x < x)minx = w-x;
		if(w-x == x)minx = x;
		
		//���ΰ��� ������
		if(h-y > y)miny = y;
		if(h-y < y)miny = h-y;
		if(h-y == y)miny = y;
		
		//�� ���� �������� �� ���� ���� ���
		if(minx>miny)System.out.println(miny);
		else if(minx<miny)System.out.println(minx);
		
		//�� ���� ���� �� �ƹ��ų� ���
		else System.out.println(minx);
	}

}