package com.example.jppas.email;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailAdd2 { 
    public static void main(String[] args) {
    	List<String>emailList=new ArrayList<>();
    	Scanner sc=new Scanner (System.in);
    	while(true) {
    	System.out.println("Enter the Valid Email Id :");
    	String email=sc.nextLine();
    	if(!emailList.contains(email)) {
    		emailList.add(email);
    		
    	if(email.indexOf("@")>0) {
    		String []str1 =email.split("@");
    		String part1=str1[0];
    		String domainName = str1[1];
    		
    		if(domainName.indexOf(".")>0) {
    			String domaninExtension =domainName.substring(domainName.indexOf(".")+1,domainName.length());
    			if(domaninExtension.length()>0)
    				System.out.println("Valid email");
    			else
    				System.out.println("Invalid email");
    		}
    		else
    			System.out.println("Invalid email");	
    	}
    	else {
    		System.out.println("Invalid email Addresss");
    			}
    		}else {
    			System.out.println("Already Added Email Id.......");
    		}
    	}
    }
}
 
