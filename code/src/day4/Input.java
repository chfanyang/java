import java.util.*;

class Input {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������");
		String name = input.next();
		System.out.print("���䣺");
		int age = input.nextInt();
		System.out.print("��ߣ�");
		double hight = input.nextDouble();
		System.out.print("������");
		System.out.print("����" + name + ";����" + age + ";���" + hight);
	}
}