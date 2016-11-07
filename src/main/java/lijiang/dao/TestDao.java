package lijiang.dao;

import lijiang.entity.Test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/7.
 */
@Component
public class TestDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void add(){
        Session session = sessionFactory.getCurrentSession();
        Test test = new Test(null,"test");
        session.save(test);
    }
}
