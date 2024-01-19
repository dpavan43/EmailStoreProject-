package com.example.jppas.email;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailAdd{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		List<String>emailList=new ArrayList<>();
		do {
			System.out.println("Enter the Valid Email Id :");
			String email=sc.nextLine();
				if(!emailList.contains(email)) {
					System.out.println("Email Added Succesfully....");
				}else {
					System.out.println("Email already added.....");
				}
		}while(true);		
	}
}
