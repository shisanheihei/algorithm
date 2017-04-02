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
/*map的遍历的一种方式
 * map的keySet()方法返回值是Map中key值的集合
 * entrySet()的返回值也是返回一个Set集合，此集合的类型为Map.Entry。
 * Map.Entry是Map声明的一个内部接口，此接口为泛型，定义为Entry<K,V>。
 * 它表示Map中的一个实体（一个key-value对）。接口中有getKey(),getValue方法。
 * */
	
	for(Map.Entry<Integer, Integer> kset:tmap.entrySet()){
		System.out.println(kset.getKey()+" "+kset.getValue());
	}
}
}
