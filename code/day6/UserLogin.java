import java.util.*;

class UserLogin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("�������û�����");
			String userName = input.next();
			System.out.print("���������룺");
			String userPasswd = input.next();
			if ("admin".equals(userName) && "123".equals(userPasswd)) {
				System.out.print("��½�ɹ�");
				break;
			}
			System.out.println("��¼ʧ�������ԣ�");
		}
	}
}