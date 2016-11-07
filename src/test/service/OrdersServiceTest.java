package service;

import lijiang.entity.News;
import lijiang.entity.Orders;
import lijiang.entity.Page;
import lijiang.service.NewsService;
import lijiang.service.OrdersService;
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
public class OrdersServiceTest {
    @Autowired
    private OrdersService ordersService;

    @Test
    public void addTest(){
        ordersService.add(new Orders(null,2,"123","123","123",true));

    }

    @Test
    public void deleteTest(){
        ordersService.delete(1);

    }

    @Test
    public void updateTest(){
        ordersService.update(new Orders(1,3,"123","123","123",false));

    }

    @Test
    public void getByIdTest(){
        Orders byId = ordersService.getById(1);
        System.out.println(byId);
    }

    @Test
    public void getLimitTest(){
        Orders orders = new Orders();
        orders.setO_state(false);


        Page page = new Page();
        page.setCurrentPage(1);
        Page byTypeLimit = ordersService.getLimit(page, orders);
        System.out.println();
    }

    @Test
    public void getOneTest(){
        Orders orders = new Orders();
        orders.setO_idcard("123");
        orders.setO_tel("123");
        Orders one = ordersService.getOne(orders);
        System.out.println();
    }


}
