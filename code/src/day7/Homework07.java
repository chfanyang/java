import java.util.*;

class Homework07{

	//��дһ���������ж�һ��������������ż��
	public static String parity(int a) {
		if (a  %2 == 0) {
			return a + "��ż��";
		}
		return a + "������";
	}
	//��дһ���������������ڵõ�ÿ����������
	public static String toDo(String a) {
		switch (a) {
			case "����һ" :
			case "���ڶ�" :
			case "������" :
			case "������" :
			case "������" :
				return "�Ͽ�";
			case "������" :
				return "��Ϣ";
			case "������" :
				return "��ϰ";
		}
		return "�������";
	}
	public static void divisibleNumber() {
		int i = 100;
		
		do {
			if (i % 19 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 200);
	}
	//�ж�һ�����������ꡢ���ꡢ���껹������
	public static String judgingAge(int a) {
		if (a < 0 && a > 150) {
			return "���䲻�Ϸ�";
		}
		if (a < 16) {
			return "����";
		}
		if (a < 35) {
			return "����";
		}
		if (a < 60) {
			return "����";
		}
		return "����";
	}
	//�ж�һ���ɼ������ض�Ӧ�ĵȼ�A��B��C
	public static char scor(int a) {
		if (a >= 100) {
			return 'A';
		}	
		if (a >= 80) {
			return 'B';
		}
			return 'C';
	}
	//�����������֣����ض�Ӧ������
	public static String week(String a) {
		switch (a) {
		case "1":
			return "����" + a;
		case "2":
			return "����" + a;
		case "3":
			return "����" + a;
		case "4":
			return "����" + a;
		case "5":
			return "����" + a;
		case "6":
			return "����" + a;
		case "7":
			return "����" + a;
		}
		return "�������";
	}
	//�ж�һ�������������0����õ�1�����С��0��õ�-1������õ�0
	public static int positiveAndNegative(int a) {
		if (a > 0) {
			return 1;
		}
		if (a < 0) {
			return -1;
		}
		return 0;
	}
	//���������е�ֵ���л���
	public static String exchangeValue(int i, int j) {
		System.out.println("i:" + i + "j:" +j);
		i = i + j;
		j = i - j;
		i = i - j;
		return "i:" + i + "j:" +j;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//��дһ���������ж�һ��������������ż��
		System.out.print("������һ�������ж��Ƿ���ż��:");
		System.out.println(parity(input.nextInt()));
		//��дһ���������������ڵõ�ÿ����������
		System.out.print("���������ڼ�:");
		System.out.println(toDo(input.next()));
		//���100---200��Χ�������ܱ�19��������
		divisibleNumber();
		//�ж�һ�����������ꡢ���ꡢ���껹������
		System.out.print("����������:");
		System.out.println(judgingAge(input.nextInt()));
		//�ж�һ���ɼ������ض�Ӧ�ĵȼ�A��B��C
		System.out.print("������ɼ�:");
		System.out.println(scor(input.nextInt()));
		//�����������֣����ض�Ӧ������
		System.out.print("������1~7:");
		System.out.println(week(input.next()));
		//�ж�һ�������������0����õ�1�����С��0��õ�-1������õ�0
		System.out.print("������һ�����ж�����:");
		System.out.println( positiveAndNegative(input.nextInt()));
		//���������е�ֵ���л���
		System.out.print("��������������:");
		System.out.println(exchangeValue(input.nextInt(),input.nextInt()));
		//1.��main��������ɣ��ж�һ�����Ƿ���ˮ�ɻ���
		System.out.print("������һ�������ж���ˮ�ɻ���:"); 
		int num = input.nextInt();
		int one = num % 10;
		int oneDigitCube = one * one * one;
		int ten = num / 10 % 10;
		int tensOfCubes = ten * ten * ten;
		int hundreds = num / 100;
		int hundredsOfCubes = hundreds * hundreds * hundreds;
		if (num > 1000 || num < 100) {
			System.out.print("������λ����");
			return;
		} 
		if (hundredsOfCubes + tensOfCubes + oneDigitCube == num) {
			System.out.println("��ˮ�ɻ���");
			return;
		} 
		System.out.println("����ˮ�ɻ���");
	}
}
