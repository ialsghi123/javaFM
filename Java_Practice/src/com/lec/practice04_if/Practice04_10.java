package com.lec.practice04_if;

/*
[4-11] �Ǻ���ġ(Fibonnaci) ����(���)�� ���� �� ���� ���ؼ� ���� ���� ����� ����
�� �����̴�. ���� ��� ���� �� ���� 1�� 1�̶�� �� ���� ���� 2�� �ǰ� �� ���� ����
1�� 2�� ���ؼ� 3�� �Ǿ 1,1,2,3,5,8,13,21,... �� ���� ������ ����ȴ�. 1�� 1����
�����ϴ� �Ǻ���ġ������ 10��° ���� �������� ����ϴ� ���α׷��� �ϼ��Ͻÿ�.

[������]
1,1,2,3,5,8,13,21,34,55
*/
public class Practice04_10 {

	public static void main(String[] args) {

		int num = 12345;
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			sum+=num%10;
			num=num/10;
			System.out.println("sum��:"+sum + " num��:"+num);
		}
		
		System.out.println("sum=" + sum);
	}
}
