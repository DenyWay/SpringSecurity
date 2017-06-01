/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.denyway.learning.springsecurity.dao;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import ru.denyway.learning.springsecurity.service.HibernateUtil;
import ru.denyway.springsecurity.entity.SecurityUsers;

/**
 *
 * @author DenyWay
 */
public class UserDAO {
    
    @Autowired
    private SessionFactory sessionFactory;

    public SecurityUsers getUser(String login) {
        SecurityUsers user = null;
        Session session = null;
               
        try {           
            session = HibernateUtil.getSessionFactory().openSession();
            
            //session.createQuery(login)
            Criteria userCriteria = session.createCriteria(SecurityUsers.class);
            userCriteria.add(Restrictions.eq("login", login));
            user = (SecurityUsers) userCriteria.uniqueResult();

        } catch (HibernateException ex) {
            return null;    
        } finally {  
            if (session != null && session.isOpen()) {
                try {
                    session.close();
                } catch (HibernateException e) {
                        //log.error("Error while closing session");
                }
            }           
        }
        return user;
    }
}
