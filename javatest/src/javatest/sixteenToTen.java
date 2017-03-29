/*题目要求
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 * */

package javatest;

import java.util.Scanner;

public class sixteenToTen {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);//获取输入台的输入直到没有输入为止
	while(sc.hasNext()){
	String	str=sc.next();
	//parseInt的用法,第一个参数为一个字符串，第二个为要以什么格式进行解析例如：16则是要用16进制解析
	//返回的是一个整数
	int num=Integer.parseInt((str.substring(2)),16);
	System.out.println(num);
	}
}
}
