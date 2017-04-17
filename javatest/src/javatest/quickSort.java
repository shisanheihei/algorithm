/*给定一个数组进行排序排序*/
package javatest;

public class quickSort {
	public static void main(String[] args) {
		int[] arr={1,4,2,6,2,99,4,333,45};
		int low=0;
		int hight=arr.length-1;
		int key=arr[0];
		System.out.println(hight);
		Qsort(low,hight,arr,key);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	public static int  sort(int low ,int hight, int[] arr,int key){
		while(low<hight){
			while(arr[hight]>=key&&low<hight)
			hight--;
			arr[low]=arr[hight];
			
			while(arr[low]<=key&&low<hight)
				low++;
			arr[hight]=arr[low];
		}
		arr[low]=key;
		return low;
	
	}
	
	public static void  Qsort(int low ,int hight, int[] arr,int key){
		if(low<hight){
			System.out.println(low);
			int mid=sort(low,hight,arr,key);
			
			Qsort(low,mid-1,arr, arr[low]);
			Qsort(low+1,hight,arr, arr[low+1]);
			}
		
	}
	
	

}
