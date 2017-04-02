/*
 * 题目要求：
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子
 * （如180的质数因子为2 2 3 3 5 ）最后一个数后面也要有空格
 * 
详细描述：

函数接口说明：
public String getResult(long ulDataInput)
输入参数：
long ulDataInput：输入的正整数
返回值：
String
 */
package javatest;
import java.util.*;
public class primNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		/*System.out.println(num);*/
		primNumber pn=new primNumber();
		System.out.println(pn.getResult(num));
		
	
	}
	public String getResult(long ulDataInput){
		String str="";
		while(ulDataInput!=1){
			for(int i=2;i<=ulDataInput;i++){
				if(ulDataInput%i==0){
					str+=i+" ";
					ulDataInput=ulDataInput/i;
					break;
				}
			}
		}
		return str;
	}

}
