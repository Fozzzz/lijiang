package service;

import junit.framework.Assert;
import lijiang.entity.News;
import lijiang.entity.Page;
import lijiang.service.NewsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/11/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
public class NewsServiceTest {
    @Autowired
    private NewsService newsService;

    @Test
    public void addTest(){
        newsService.add(new News(null,"123","123","123","123","123","123"));

    }

    @Test
    public void deleteTest(){
        newsService.delete(2);

    }
    @Test
    public void updateTest(){
        newsService.update(new News(1,"123","123","123","123","123","123"));

    }

    @Test
    public void getByIdTest(){
        News byId = newsService.getById(1);
        System.out.println(byId);
    }

    @Test
    public void getByTypeLimitTest(){
        News news = new News();
        news.setN_type("123");
        Page page = new Page();
        page.setCurrentPage(1);
        Page byTypeLimit = newsService.getByTypeLimit(page, news);
        System.out.println();
    }

}
