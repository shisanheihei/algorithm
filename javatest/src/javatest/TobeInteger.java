/*
 * ��ĿҪ��
 * д��һ�����򣬽���һ����������ֵ���������ֵ�Ľ�������ֵ��
 * ���С�������ֵ���ڵ���5,����ȡ����С��5��������ȡ����
 */
package javatest;
import java.util.*;
public class TobeInteger {
	//����ֱ��ʹ��math��round(1)�ķ���
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double num=sc.nextFloat();
	num=num+0.5;//�ȼ�0.5��Ȼ���ȡ����
	int result=(int) (num/1);
	System.out.println(result);
}
}
