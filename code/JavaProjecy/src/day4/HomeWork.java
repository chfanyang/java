import java.util.Scanner;
class HomeWork {
	public static void main(String[] args) {
		//1.�ж�һ�����Ƿ�����λ������
		Scanner inputNum = new Scanner(System.in);
		System.out.print("������һ�����֣�");
		int num = inputNum.nextInt();
		if (num > 10000 && num < 100000) {
			for (int i = 0; i < 5; i++) {
				System.out.println(num % 10);
				num /= 10;
			}
		} else {
			System.out.print("���ִ���");
		}
		//�ж�һ�����Ƿ���ˮ�ɻ���
		Scanner inputNarNum = new Scanner(System.in);
		System.out.print("������һ����λ���֣�");
		int narNum = inputNarNum.nextInt();
		if (narNum > 0 && narNum < 300) {
			int narNumDigits = narNum % 10;
			int narNumTens = narNum / 10 % 10;
			int narNumHundreds  = narNum / 100 % 10;
		boolean narNumBool = narNum == narNumDigits * narNumDigits * narNumDigits + 
				narNumTens * narNumTens * narNumTens + 
				narNumHundreds * narNumHundreds * narNumHundreds;
			System.out.println(narNumBool ? narNum + "��ˮ�ɻ���" :narNum + "����ˮ�ɻ���");
		}
	}
}