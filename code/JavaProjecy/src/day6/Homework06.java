import java.util.*;

class Homework06{
	public static void main(String[] args) {	
		//���1---100��Χ�ڼ��ܱ�3Ҳ�ܱ�5����������Ҫ��ʹ��forѭ����whileѭ�����
		for (int i = 1; i <= 100 ;i ++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("------------");
		int i = 1;
		while (i < 100) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
			i ++;
		}
		//���z---a�е�ÿ���ַ���Ҫ��ʹ��forѭ����do whileѭ�����
		System.out.println("------------");
		for (char j = 'z' ; j >= 'a' ; j--) {
			System.out.println(j);
		}
		System.out.println("------------");
		char j = 'z';
		do {
			System.out.println(j);
			j --;
		} while (j >= 'a');
		//���2000�������е�����
		System.out.println("------------");
		int x = 0;
		while (x < 2021) {
			if (x % 100 != 0 && x % 4 == 0) {
				System.out.println(x);
			}
			x ++;
		}
		//���100  95  90  85 ...... 5�Ľ��
		System.out.println("------------");
		int y = 100;
		do {
			System.out.println(y);
			y -= 5;
		} while (y >= 5);
		//�ж�һ���ַ��Ǵ�д��ĸ��Сд��ĸ���������ַ�
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����ĸ�����֣�");
		char inputChar = input.next().charAt(0);
		if (inputChar >= 'a' && inputChar <= 'z') {
			System.out.println("Сд");
		} else if (inputChar >= 'A' && inputChar <= 'Z' ) {
			System.out.println("��д");
		} else if (inputChar >= '0' && inputChar <= '9' ) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		//��ӡ�žų˷������Ұ��ո�ʽ��ӡ(������)
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b + "*" + a + "=" + b * a + "\t");
				/*if (a == b) {
					System.out.println();
					break;
				}*/
			}
		System.out.println();
		}
	}
}