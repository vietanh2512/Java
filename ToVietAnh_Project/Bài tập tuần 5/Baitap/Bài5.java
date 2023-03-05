package Baitap;

import java.util.Scanner;

public class Bài5 {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		int sum;
		do  {
			System.out.print("Nhập số nguyên a: ");
		    a=sc.nextInt();
		    System.out.print("Nhập số nguyên b: ");
		    b=sc.nextInt();
		    System.out.print("Nhập số nguyên c: ");
		    c=sc.nextInt();
		    sum=a+b+c;
		}while(sum<=100);
	  System.out.println("Tổng các số vừa nhập là:"+sum);
	
	}

}
