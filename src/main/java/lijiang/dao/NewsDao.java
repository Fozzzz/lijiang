package lijiang.dao;

import lijiang.entity.News;
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

    public List<News> getByTypeLimit(Page page, News news){
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from News n where n.n_type=:n_type").setParameter("n_type", news.getN_type());
        query.setFirstResult(page.getCurrentNumber());
        query.setMaxResults(page.getPageNumber());
        List<News> list = query.list();
        return list;
    }

    public int getTotalNumber(Page page, News news){
        Session session=sessionFactory.getCurrentSession();
        Query query = session.createQuery("select count(n.n_id) from News n where n.n_type=:n_type").setParameter("n_type", news.getN_type());
        query.setFirstResult(page.getCurrentNumber());
        query.setMaxResults(page.getPageNumber());

        return ((Long) query.getSingleResult()).intValue();
    }

}
