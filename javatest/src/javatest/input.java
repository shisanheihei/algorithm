/*题目要求：
写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，
然后输出输入字符串中含有该字符的个数。不区分大小写。
*/

package javatest;

import java.util.Scanner;
public class input {
	 public static void main(String[] args){
	
		int num=0;
	 Scanner sc= new Scanner(System.in);
	 String str =sc.nextLine().toUpperCase();
	 String target=sc.nextLine().toUpperCase();
	 char[] arr=str.toCharArray();
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]==target.charAt(0)){
			 num++;
		 }
	 }
	 System.out.print(num);
	}

}
