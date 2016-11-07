package lijiang.dao;

import lijiang.entity.Groups;
import lijiang.entity.User;
import lijiang.entity.Page;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/11/7.
 */
@Component
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void add(User user){

          sessionFactory.getCurrentSession().save(user);
    }

    public void delete(int n_id){
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, n_id);
        session.delete(user);
    }

    public void update(User user){
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    public int login(User user){
        Session session=sessionFactory.getCurrentSession();
        Query query = session.createQuery("select count(u.u_name) from User u where u.u_name=:u_name and u.u_password=:u_password");
        query.setParameter("u_password",user.getU_password());
        query.setParameter("u_name",user.getU_name());
        return (Integer) query.getSingleResult();

    }

    public User getByTypeLimit(User user){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from User u  inner join  fetch u.groups where u.u_name=:u_name");
        query.setParameter("u_name",user.getU_name());
        return (User) query.getSingleResult();
    }



}
