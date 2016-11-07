package lijiang.dao;

import lijiang.entity.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/7.
 */
@Component
public class NewsDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void add(News news){
          sessionFactory.getCurrentSession().save(news);
    }

    public void delete(int n_id){
        Session session = sessionFactory.getCurrentSession();
        News news = session.get(News.class, n_id);
        session.delete(news);
    }
    public void update(News news){
        sessionFactory.getCurrentSession().saveOrUpdate(news);
    }
    public News getById(Integer n_id){
        Session session=sessionFactory.getCurrentSession();
        return session.get(News.class,n_id);
    }


}
