package day5;

import java.util.*;

class Homework05{
	public static void main(String[] args) {
		
		//1
		Scanner input = new Scanner(System.in);
		System.out.print("�����뵱ǰ���϶�:");
		double fahrenheit = input.nextDouble();
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.print("��ǰ���϶ȣ�" + celsius + "\t��ǰ���϶ȣ�" + fahrenheit);
		//2
		System.out.print("\n������һ������:");
		int inputNum = input.nextInt();
		double encAlg = (inputNum * 10 + 5) / 2 + 3.14159;
		System.out.print("���ܽ����" + (int)encAlg);
		//3
		System.out.print("\n�����û���:");
		String userName = input.next();
		System.out.print("��������:");
		String userPassword = input.next();
		if ("admin".equals(userName)) {
			if ("123".equals(userPassword)) {
				System.out.print("��¼�ɹ�");
			} else if (!("123".equals(userPassword))) {
				System.out.println("�������");
			}
		} else if (!("admin".equals(userName))) {
			System.out.println("�û�������");
		}



		/*
		switch (userName) {
			case "admin" :
				System.out.print("��������:");
				String userPassword = input.next();
				switch (userPassword) {
					case "123" :
						System.out.print("��¼�ɹ�");
						break;
					default :
						System.out.print("��¼�������");
				}
				break;
			default :
				System.out.print("��¼�û�������");
		}
		*/
		//4-1
		System.out.print("\n�����������ĳɼ�:");
		double score = input.nextDouble();
		if (100 == score) {
			System.out.print("�ʼǱ�����");
		} else if (90 <= score) {
			System.out.print("�ƶ�Ӳ��");
		} else if (60 <= score) {
			System.out.print("���");
		} else if (60 > score) {
			System.out.print("�´�Ŭ��");
		}
		
		//4-2
		switch ((int)score) {
			case 100:
				System.out.print("�ʼǱ�����");
				break;
			case 90:
			case 91:
			case 92:
			case 93:
			case 94:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
				System.out.print("�ƶ�Ӳ��");
				break;
			case 60:
			case 61:
			case 62:
			case 63:
			case 64:
			case 65:
			case 66:
			case 67:
			case 68:
			case 69:
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
			case 80:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
				System.out.print("���");
				break;
			default:
				System.out.print("�´�Ŭ��");
			
		}
	}
}