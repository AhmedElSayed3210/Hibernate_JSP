
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noah
 */
public class test {
        
    public static void main(String[] args) {
        
//        JspPojo em=new JspPojo();
//       em.setName("aaa");
//       em.setPosition("ddd3wd");
//       em.setSalary(Integer.parseInt("45"));
//       
//       jspMl ep=new jspMl();
//       ep.insertStudent(em);
//ep.select(1);

              jspMl j=new jspMl();
        
        List<JspPojo> lis=j.selectQuery("m");
        
        for (JspPojo li : lis) {
            System.out.println(lis.get(0));
        }
       

    }
    
}
