package com.minho.practice04_if;

/*
12o34�� ���ڰ� �ƴմϴ�.
*/
public class Practice04_12 {

	public static void main(String[] args) {

		{
			// 1~100������ ������ ���� �� answer�� �����Ѵ�.
			int answer = (int)(Math.random()*100)+1;
			int input = 0; // ������Է��� ������ ����
			int count = 0; // �õ�Ƚ���� �������� ����
			// ȭ������ ���� ������Է��� �ޱ� ���ؼ� ScannerŬ���� ��� 
			java.util.Scanner s = new java.util.Scanner(System.in);
			do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			input = s.nextInt(); // �Է¹��� ���� ���� input�� �����Ѵ�.
			
			if(input>answer) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			} else if(input<answer) {
				System.out.println("�� ū���� �Է��ϼ���");
			} else if(input==answer) {
				System.out.println("������ϴ�");
				System.out.println("�õ� ȸ����" + count +"���Դϴ�.");
				break;
			}
			
			} while(true); // ���ѹݺ���
	
		} // end of main

	}

}