package com.digit.hibernateServlet.model;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.digit.hibernateServlet.bean.AadharDetails;
import com.digit.hibernateServlet.controller.updatecontroller;


public class HibernateManager 
{
	private Session session;
    public HibernateManager()
    {
   	 Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
   	 ServiceRegistryBuilder builder =new ServiceRegistryBuilder().applySettings(configuration.getProperties());
   	 SessionFactory sessionFactory=configuration.buildSessionFactory(builder.buildServiceRegistry());
   	 session= sessionFactory.openSession();
   	 System.out.println("Connected to pf");
    }
    public boolean  saveObj(AadharDetails a1)
    {
   	 Transaction tran = session.beginTransaction();
   	 session.save(a1);
   	 tran.commit();
   	 System.out.println("object saved");
   	 return true;
   
    }
//    public void readall()
//    {
//   	 Transaction tran = session.beginTransaction();
//   	 
//   	 org.hibernate.Query q= session.createQuery("From Student");
//   	 List li =q.list();
//   	 Iterator itr = li.iterator();
//   	 while(itr.hasNext())
//   	 {
//   		 Student s=(Student)itr.next();
//   		 System.out.println(s.getName()+""+s.getRoll());
//   	 }
//   	 tran.commit();
//    }
//    public void readspecific(String name)
//    {
//   	 session.beginTransaction();
//		 Student s=(Student)session.get(Student.class,name);
//		 System.out.println(s.getName()+""+s.getRoll());
//
//    }
    public AadharDetails selectspecific(int aadhar_id) 
    {
   	 Transaction transaction=session.beginTransaction();
   	 org.hibernate.Query query=session.createQuery("from  AadharDetails where aadhar_id=:id ");
  	  query.setParameter("id",aadhar_id);
  	  List list=query.list();
  	  Iterator itr = list.iterator();
  	  AadharDetails a = null;
  	  while(itr.hasNext()==true)
  	  {
//  		  AadharDetails s=(AadharDetails)itr.next();
//  		 // System.out.println("ID:",s.getId());
//  		  System.out.println("Name:"+s.getName());
//  		  System.out.println("ID:"+s.getAadhar_id());
//  		  System.out.println("Father name:"+s.getFather_name());
//  		  System.out.println("Mother name:"+s.getMother_name());
//  		  System.out.println("Date of Birth:"+s.getDob());
//  		  System.out.println("Address:"+s.getAddress());
//  		  System.out.println("City:"+s.getCity());
//  		  System.out.println("Pincode"+s.getPincode());
               	     
  		  a=(AadharDetails) itr.next();

  	  }
	 transaction.commit();
	return a;
    }
    public boolean update(String name,String address,int aadhar_id)
    {
     Transaction transaction=session.beginTransaction();
     AadharDetails a=(AadharDetails)session.get(AadharDetails.class,aadhar_id);
  	  a.setName(name);
  	  a.setAddress(address);

  	 session.update(a);
  	System.out.println("Name update succes");
	 transaction.commit();
	 return true;
    }
    public boolean delete(int aadhar_id)
    {
     Transaction transaction=session.beginTransaction();
     AadharDetails s=(AadharDetails)session.get(AadharDetails.class,aadhar_id);
  	  
  	 session.delete(s);
  	System.out.println("Name delete succes");
	 transaction.commit();
	 return true;
    }
}
