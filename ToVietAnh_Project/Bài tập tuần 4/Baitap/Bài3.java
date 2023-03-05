package Baitap;

import java.util.Scanner;

public class Bài3 {

	public static void main(String[] args) {
	String ten;
	int namsinh;
		
	    Scanner sc = new Scanner(System.in); 
		System. out. print("Nhập Tên của bạn:");
		ten=sc.nextLine();
		System. out. print("Nhập năm sinh của bạn:");
	    namsinh=sc.nextInt();
		int tuoi=2023-namsinh;
	    if (tuoi<16) {
			System. out. printf("Bạn %s ở độ tuổi vị thành niên",ten);
			}
		else if (tuoi>=16 && tuoi<18) {
			System. out. printf("Bạn %s ở độ tuổi trưởng thành",ten);
			
		}
		else if (tuoi>=18) {
			System. out. printf("Bạn %s đã già",ten);
		}
	}
	
}


