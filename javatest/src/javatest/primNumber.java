/*
 * ��ĿҪ��
 * ����:����һ�������������մ�С�����˳�����������������������
 * ����180����������Ϊ2 2 3 3 5 �����һ��������ҲҪ�пո�
 * 
��ϸ������

�����ӿ�˵����
public String getResult(long ulDataInput)
���������
long ulDataInput�������������
����ֵ��
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
