package com.lec.practice04_if;

/*
12o34�� ���ڰ� �ƴմϴ�.
*/
public class Practice04_13 {

	public static void main(String[] args) {

		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// �ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ�
		// �ϳ��� �о �˻��Ѵ�.
		for (int i = 0; i < value.length(); i++) {
			
			ch=value.charAt(i);
			
			System.out.println(ch);
			
			
		}
		if (isNumber) {
			System.out.println(value + "�� �����Դϴ�.");
		} else {
			System.out.println(value + "�� ���ڰ� �ƴմϴ�.");
		}

	} // end of main
}

