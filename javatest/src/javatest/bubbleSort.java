/*给定一个数组，然后进行冒泡排序*/
package javatest;

import java.util.Scanner;

public class bubbleSort {
	public static void main(String[] args) {
		int[] arr={1,2,5,7,32,7,99,2,0,4,5};
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

}
