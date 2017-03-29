package javatest;

import java.util.Scanner;

public class eightLengthArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		eightLengthArray ela=new eightLengthArray();
		ela.apartWord(str1);
		ela.apartWord(str2);
		
	}
	public void apartWord(String str){
		//考虑为空的情况
		if(str.equals("")){
			System.out.println();
		}
		else{
		//当num为8时就变为0
		int num=0;
		for(int i=0;i<str.length();i++){
		
				/*arr[index++]=str.charAt(i);*/
			System.out.print(str.charAt(i));
				if(num==7){
			
					num=0;
					System.out.println();
				}else{
					num++;
				}
				
			
		}
		for(int j=8;j>num;j--){
			System.out.print("0");
		}
		System.out.println();
	}
	}
	/*public void apartWord( String str){
		int num=0;
		int index=0;
		String[] arr=null;
		for(int i=0;i<str.length();i=i*8){
			if(i+8<=str.length()){
				for(int j=0;j<8;j++){
					arr[index]=str.charAt(i+j)+"";
				}
				index++;
			}else{
				for(int m=str.length()-1;m>i;m--){
					System.out.println(str.charAt(m));
					arr[index]=str.charAt(m)+"";
					
				}
				for(int n=str.length()-1;n<8+i;n++){
					arr[index]=0+"";
				}
				index++;
					
			}
						
		}
		for( String s:arr){
			System.out.println(arr);
		}
	}*/
	


}
