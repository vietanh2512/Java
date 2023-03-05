package Baitap;

import java.util.Scanner;

public class Bài8 {

	public static void main(String[] args) {
		int n;
		float tbc,b=0,c;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.print("Nhập số phần tử có trong dãy số: ");	
		    n=sc.nextInt();
		} while (n<0);
		System.out.println("Nhập các số vào trong dãy số ");
		for (int i=1;i<=n;i++) {
			System.out.print("Nhập số thứ"+i+":");
			c=sc.nextFloat();
			b+=c;
			
		}
		tbc=(float)b/n;
		System.out.printf("Trung bình cộng các số là:%.2f",tbc);
			
		  
		
		
	

	}

}
