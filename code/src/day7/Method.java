import java.util.*;

class Method{
	public static void sub(int a,int b) {
		System.out.print(a - b);
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ�����֣�");
		int x = input.nextInt();
		System.out.print("������ڶ������֣�");
		int y = input.nextInt();
		sub(x, y);
	}
}