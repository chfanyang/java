package day5;

import java.util.*;

class IfTest {


	public static void main(String[] args) {
		/*
		Scanner inputScore = new Scanner(System.in);
		System.out.print("������ɼ���");
		int score = inputScore.nextInt();
		if (score > 95 ) {
			System.out.print("����");
		}
		
		if (score <= 95 ) {
			System.out.print("�ͷ�");
		}
	}
*/

		Scanner inputNum = new Scanner(System.in);
		System.out.print("�������һ������");
		int oneNum = inputNum.nextInt();	
		System.out.print("������ڶ�������");	
		int twoNum = inputNum.nextInt();
		int sum = oneNum + twoNum;
		if (sum % 2 == 0) {
			System.out.println("ż��");
		} else if (sum % 2 == 1) {
			System.out.println("����");
		}
/*
		int num = inputNum.nextInt();
		if (num % 2 == 0) {
			System.out.println("ż��");
		} else if (num % 2 == 1) {
			System.out.println("����");
		}
		
		if (num % 18 == 0) {
			System.out.println("18�ı���");
		} else if (num % 18 != 0) {
			System.out.println("����18�ı���");
		}
		
		if (num >= 100 && num < 1000 ) {
			System.out.println("����λ����");
		} else {
			System.out.println("������λ����");
		}
	*/
	}
}
