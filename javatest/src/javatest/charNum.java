/*
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。
 * 不在范围内的不作统计。
 */
package javatest;
import java.util.ArrayList;
import java.util.Scanner;
//对应的就是的就是一个char的值，但它表示的是有符号的类型，所以表示的范围是-128~127
public class charNum {
	public static void main(String[] args) {
		int num=0;
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> list=new ArrayList<Character>();
			String str=sc.nextLine();
			for(int i=0;i<str.length();i++){
				if( str.charAt(i)>0&&str.charAt(i)<127){
				if(!list.contains(str.charAt(i))){
					num++;
					list.add(str.charAt(i));
					
				}
			}
			}
			
		System.out.println(num);
	}

}
