/*
 * ��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ���ACSII�뷶Χ��(0~127)��
 * ���ڷ�Χ�ڵĲ���ͳ�ơ�
 */
package javatest;
import java.util.ArrayList;
import java.util.Scanner;
//��Ӧ�ľ��ǵľ���һ��char��ֵ��������ʾ�����з��ŵ����ͣ����Ա�ʾ�ķ�Χ��-128~127
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
