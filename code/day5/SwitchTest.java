import java.util.*;

class SwitchTest {
	public static void  main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������Σ�");
		String rank = input.next();
		
		switch (rank) {
			case "��һ��":
				System.out.println("100w");
				break;
			case "�ڶ���":
				System.out.println("50w");
				break;
			case "������":
				System.out.println("10w");
				break;
			default:
				System.out.println("лл����");
				break;
		} 
	}
}	