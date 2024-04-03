package com.tka.practice1;

public class R {
	
	public static void main(String[] args) {
		int a[]= {11,7,3,22,-9,55};
		
		for(int i = 0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int t=a[j];
					a[j]=t;
				}
			}
			System.out.println(a[i]+" ");
			for(;i<a.length;i++) {
				
				System.out.println(a[i]+" ");
			}
		}
	}

}
