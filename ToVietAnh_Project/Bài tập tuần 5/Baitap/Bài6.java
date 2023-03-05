package Baitap;


import java.util.Scanner;

public class Bài6 {

	public static void main(String[] args) {
		int a;
		int b=1;
		Scanner sc = new Scanner(System.in);
	     
		System. out. print("Nhập số nguyên a:");
			a=sc.nextInt();
			
		for (int i=1;i<=a;i++) {
			b*=i;
			
			}
		System. out. printf("Giai thừa của %d là: %d",a,b);		

	}

}
