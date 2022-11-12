package org.onetomany.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.onetomany.config.HibernateUtil;
import org.onetomany.dao.OneToManyDao;
import org.onetomany.entity.Learner;
import org.onetomany.entity.Teacher;

public class OneToManyDaoImpl implements OneToManyDao {

	public void insert() {
		try {
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			

			Teacher tea = new Teacher();
			tea.settName("satish");
			tea.seteMail("satish@gmail.com");
			tea.setBatchCode("ANP20");
			
			Learner l1 = new Learner();
			l1.setsId(11);
			l1.setsName("Shweta");
			l1.setEducation("BE");
			l1.setPhoneNumber(11252);
			
			Learner l2 = new Learner();
			l2.setsId(12);
			l2.setsName("dhananjay");
			l2.setEducation("TE");
			l2.setPhoneNumber(98252);
			
			Learner l3 = new Learner();
			l3.setsId(13);
			l3.setsName("Nandu");
			l3.setEducation("BTech");
			l3.setPhoneNumber(30252);
			
			List<Learner> learner = new  ArrayList<Learner>();
			learner.add(l1);
			learner.add(l2);
			learner.add(l3);
			
			
			tea.setLearner(learner);
			session.save(tea);
			t.commit();
			
			System.out.println("--------------------------Done---------------------------");
			
			
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
	}

	public void read() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			TypedQuery<Teacher> query = session.createQuery("from Teacher");
			List<Teacher> all = query.getResultList();
			
			Iterator<Teacher> itr = all.iterator();
			while(itr.hasNext()) {
				Teacher t = itr.next();
				System.out.println(t.gettName() + " " + t.getBatchCode());
			
				List<Learner> l1 =t.getLearner();
				Iterator<Learner>itr1=l1.iterator();
				while(itr1.hasNext()) {
					Learner l2=itr1.next();
					System.out.println(l2.getsId()+" \n"+l2.getsName()+"\n"+l2.getEducation() +"\n"+l2.getPhoneNumber() + "\n"
							+l2.getClass());
				}

			}	
			
		}catch(HibernateException e) {
				System.out.println(e);
		}
		
	}

}
