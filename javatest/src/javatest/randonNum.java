/*��ĿҪ��
 * ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ�
 * �����ü����������N��1��1000֮������������N��1000�������������ظ�������
 * ��ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�
 * Ȼ���ٰ���Щ����С��������
 * �����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
 * 
 * */
package javatest;
import java.util.*;

public class randonNum {
	public static void main(String[] args){

		Scanner scanner=new Scanner(System.in);
		int num= scanner.nextInt();
		//treeSet ����Ϳ�������
		TreeSet<Integer> list=new TreeSet<Integer>();
		for(int i=0;i<num;i++)
		{
			list.add(scanner.nextInt());
			
		}
		/*Iterator<Integer> it=list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}*/
		 for(Integer i:list){
	            System.out.println(i);
	        }
		}
		
	}

