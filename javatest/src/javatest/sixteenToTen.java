/*��ĿҪ��
 * д��һ�����򣬽���һ��ʮ�����Ƶ���ֵ�ַ������������ֵ��ʮ�����ַ�����������ͬʱ���� ��
 * */

package javatest;

import java.util.Scanner;

public class sixteenToTen {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);//��ȡ����̨������ֱ��û������Ϊֹ
	while(sc.hasNext()){
	String	str=sc.next();
	//parseInt���÷�,��һ������Ϊһ���ַ������ڶ���ΪҪ��ʲô��ʽ���н������磺16����Ҫ��16���ƽ���
	//���ص���һ������
	int num=Integer.parseInt((str.substring(2)),16);
	System.out.println(num);
	}
}
}
