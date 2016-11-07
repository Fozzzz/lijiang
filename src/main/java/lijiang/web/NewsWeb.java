package lijiang.web;

import lijiang.dao.NewsDao;
import lijiang.entity.News;
import lijiang.entity.Page;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/7.
 */
@Controller
@RequestMapping("/news")
public class NewsWeb {
    @Autowired
    private NewsDao newsDao;
    @RequestMapping("/getLimit")
    public String getLimit(Page page, Model model){
        model.addAttribute("page",page);
        return "test";
    }

    @RequestMapping("/getOne")
    public String getOne(News news,Page page, Model model){
        news=newsDao.getById(news.getN_id());
        List<News> newsList=new ArrayList<News>();
        newsList.add(news);
        page.setList(newsList);
        model.addAttribute("page",page);
        return "test";
    }

}
