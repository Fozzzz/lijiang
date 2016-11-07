package lijiang.service;

import lijiang.dao.OrdersDao;

import lijiang.entity.Orders;
import lijiang.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/11/7.
 */
@Component
public class OrdersService {
    @Autowired
    private OrdersDao ordersDao;

    public void add(Orders orders){
       ordersDao.add(orders);
    }

    public void delete(int o_id){
        ordersDao.delete(o_id);
    }

    public void update(Orders orders){
        ordersDao.update(orders);
    }

    public Orders getById(Integer o_id){
       return ordersDao.getById(o_id);
    }

    public Page getLimit(Page page, Orders orders){
        List<Orders> list = ordersDao.getLimit(page);
        page.setList(list);
        int totalNumber = ordersDao.getTotalNumber(page);
        page.setTotalNumber(totalNumber);
        page.init();
        return page;
    }

    public Orders getOne(Orders orders){
        return ordersDao.getOne(orders);
    }

}
