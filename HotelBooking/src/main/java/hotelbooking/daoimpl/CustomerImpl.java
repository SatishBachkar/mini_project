package hotelbooking.daoimpl;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hotelbooking.config.HibernateUtil;
import hotelbooking.dao.CustomerDao;
import hotelbooking.entity.CustomerData;

public class CustomerImpl implements CustomerDao {

	static Scanner sc = new Scanner(System.in);
	public void getCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Enter Your Customer Id :");
			int id = sc.nextInt();
			sc.nextLine();
			CustomerData customer = session.get(CustomerData.class,id);
			System.out.println("--------------Customer Details-----------");
			System.out.println(customer.getCustId()+" "+customer.getName()+" "+customer.getAdreass()+" "
					+customer.getAadharNumber()+" "+customer.getContactNumber()+" "+ customer.getNoOfRooms()+" " +customer.getNoOfDays());
			
			
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
	}

	public void addCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			System.out.println("Enter Customer Name:");
			String name = sc.nextLine();
			System.out.println("Enter Customer Address:");
			String address = sc.nextLine();
			System.out.println("Enter Customer Aadhar:");
			Long aadhar = sc.nextLong();
			System.out.println("Enter Customer Contact number:");
			Long number = sc.nextLong();
			System.out.println("Enter No of Rooms:");
			int room = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter No of Days:");
			int day = sc.nextInt();
			sc.nextLine();
			
			CustomerData cust = new CustomerData();
			cust.setName(name);
			cust.setAdreass(address);
			cust.setAadharNumber(aadhar);
			cust.setContactNumber(number);
			cust.setNoOfRooms(room);
			cust.setNoOfDays(day);
			
			session.save(cust);
			t.commit();
			System.out.println("-------Data Inserted Successfully-------");
			
			
			
		}catch(HibernateException e) {
			
		}
		
	}

	public void deleteCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			
			System.out.println("Enter Your Customer Id:");
			int id = sc.nextInt();
			sc.nextLine();
			CustomerData cd2 = session.get(CustomerData.class,id);
			session.delete(cd2);
			transaction.commit();
			System.out.println("---------------Deleted Successfully---------");
			
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
	}
	

}
