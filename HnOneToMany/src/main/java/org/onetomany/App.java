package org.onetomany;

import java.util.Scanner;

import org.onetomany.daoimpl.OneToManyDaoImpl;



public class App 
{
	static Scanner sc = new Scanner(System.in);
	static OneToManyDaoImpl dao = new OneToManyDaoImpl();
	public static void main(String[]args) {
		char a;
		do {
			System.out.println("----------Customer Management---------");
			System.out.println(" 1.Read \n 2.Insert  \n 3.Exit");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1 :  dao.read();
				break;
				
			case 2 : dao.insert();
				break;
				
			case 3 : System.exit(0);
				break;
				
			default : System.out.println("-----You Entered wrong Input----");
			}
			System.out.println("Do You Want To Continue?: Y/N");
			 a = sc.next().charAt(0);
		}while(a == 'Y' || a == 'y');
		System.out.println("--------Thank You!------");
	}

}
