/*
 * ��ĿҪ��
 * ���մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�������
 * ���磺����9876673
 * �����37689
 */
package javatest;
import java.util.*;

public class reverseIntNoRepeated {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String str=num+"";
		String result="";
		char[] c=str.toCharArray();
		
		List<Character> list=new ArrayList<Character>();
		for(int i=c.length-1;i>=0;i--){
		/*	System.out.println(list.contains(c[i]));*/
			if(!list.contains(c[i])){
				/*System.out.print(c[i]);*/
				list.add(c[i]);
			}
		
		}
		for(Character list1:list){
			result+=list1+"";
		}
		if(result!=""){
		System.out.println(Integer.parseInt(result));
		}
	}

}
