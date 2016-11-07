package lijiang.service;

import lijiang.dao.NewsDao;
import lijiang.entity.News;
import lijiang.entity.Page;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/11/7.
 */
@Component
public class NewsService {
    @Autowired
    private NewsDao newsDao;

    public void add(News news){
       newsDao.add(news);
    }

    public void delete(int n_id){
        newsDao.delete(n_id);
    }

    public void update(News news){
        newsDao.update(news);
    }

    public News getById(Integer n_id){
       return newsDao.getById(n_id);
    }

    public Page getByTypeLimit(Page page, News news){
        List<News> list = newsDao.getByTypeLimit(page, news);
        page.setList(list);
        int totalNumber = newsDao.getTotalNumber(page, news);
        page.setTotalNumber(totalNumber);
        page.init();
        return page;
    }


}
