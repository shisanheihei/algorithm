/*��ĿҪ��
д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���
Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
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
