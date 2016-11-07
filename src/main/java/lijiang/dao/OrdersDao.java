package lijiang.dao;

import lijiang.entity.Orders;
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
public class OrdersDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void add(Orders orders){
        sessionFactory.getCurrentSession().save(orders);
    }

    public void delete(int o_id){
        Session session = sessionFactory.getCurrentSession();
        Orders orders = session.get(Orders.class, o_id);
        session.delete(orders);
    }

    public void update(Orders orders){
        sessionFactory.getCurrentSession().saveOrUpdate(orders);
    }

    public Orders getById(Integer o_id){
        Session session=sessionFactory.getCurrentSession();
        return session.get(Orders.class,o_id);
    }

    public List<Orders> getLimit(Page page){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Orders o");
        query.setFirstResult(page.getCurrentNumber());
        query.setMaxResults(page.getPageNumber());
        List<Orders> list = query.list();
        return list;
    }

    public int getTotalNumber(Page page){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select count(o_id) from Orders o");
        query.setFirstResult(page.getCurrentNumber());
        query.setMaxResults(page.getPageNumber());
        return ((Long) query.getSingleResult()).intValue();
    }
    public Orders getOne(Orders orders){
        Session session=sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Orders o where o.o_idcard=:o_idcard and o.o_tel=:o_tel");
        query.setParameter("o_idcard",orders.getO_idcard());
        query.setParameter("o_tel",orders.getO_tel());
        return (Orders) query.getSingleResult();

    }
}
