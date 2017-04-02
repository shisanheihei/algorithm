/*
 * 题目要求：
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
 * 如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 */
package javatest;
import java.util.*;
public class TobeInteger {
	//可以直接使用math的round(1)的方法
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double num=sc.nextFloat();
	num=num+0.5;//先加0.5，然后就取正。
	int result=(int) (num/1);
	System.out.println(result);
}
}
