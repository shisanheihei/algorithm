package javatest;
import java.util.*;
public class keyRise {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num =Integer.parseInt(sc.nextLine());
	TreeMap<Integer,Integer> tmap=new TreeMap<Integer,Integer>();
/*	System.out.println(num);*/
	for(int i=0;i<num;i++){
		
		String str=sc.nextLine();
		/*System.out.println(str);*/
		String[] arr=str.split(" ");
		tmap.put(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
	}
/*map�ı�����һ�ַ�ʽ
 * map��keySet()��������ֵ��Map��keyֵ�ļ���
 * entrySet()�ķ���ֵҲ�Ƿ���һ��Set���ϣ��˼��ϵ�����ΪMap.Entry��
 * Map.Entry��Map������һ���ڲ��ӿڣ��˽ӿ�Ϊ���ͣ�����ΪEntry<K,V>��
 * ����ʾMap�е�һ��ʵ�壨һ��key-value�ԣ����ӿ�����getKey(),getValue������
 * */
	
	for(Map.Entry<Integer, Integer> kset:tmap.entrySet()){
		System.out.println(kset.getKey()+" "+kset.getValue());
	}
}
}
