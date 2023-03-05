package Baitap;

import java.util.Scanner;

public class Bài2 {

	public static void main(String[] args) {
		int a;
		 Scanner sc = new Scanner(System.in); 
			System. out. print("Nhập số nguyên a:");
			a=sc.nextInt();
		
		if (a%2==0) {
			System.out.println("a là số chẵn");
		} 
		else {
			  System.out.println("a là số lẻ");
		}

	}
}