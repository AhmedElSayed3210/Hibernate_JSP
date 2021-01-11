
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Noah
 */
public class jspMl {

    public void insertStudent(JspPojo em) {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();

        try {
            ses.beginTransaction();

            ses.save(em);
            ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }

    }

    public JspPojo select(int id) {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
        JspPojo j = new JspPojo();
        try {
            ses.beginTransaction();

            j = (JspPojo) ses.get(JspPojo.class, id);
            
         
            // ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }
        return j;
    }
    public static List<JspPojo> selectQuery(String name) {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
         List<JspPojo> lis = new ArrayList<JspPojo>();
        try {
            ses.beginTransaction();
            Criteria q=ses.createCriteria(JspPojo.class);
            q.add(Restrictions.like("name", name, MatchMode.ANYWHERE));

           lis=q.list();
            
         
            // ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }
        return lis;
    }

    public void update(JspPojo em) {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
        try {
            ses.beginTransaction();

            ses.update(em);
            ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }
    }
    
     public void delete(JspPojo j){
    
    Session ses=NewHibernateUtil.getSessionFactory().openSession();
    
        try {
            ses.beginTransaction();

           ses.delete(j);
            ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
        }finally{
        ses.close();
        }
    
    
    }
}
