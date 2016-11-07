package service;

import lijiang.entity.Groups;
import lijiang.entity.News;
import lijiang.entity.Page;
import lijiang.entity.User;
import lijiang.service.NewsService;
import lijiang.service.UserService;
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
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void addTest(){
        Groups groups = new Groups();
        groups.setG_id(1);
        userService.add(new User(null,"123","123",groups));


    }

    @Test
    public void deleteTest(){
        userService.delete(2);

    }
    @Test
    public void updateTest(){
        Groups groups = new Groups();
        groups.setG_id(1);
        userService.update(new User(2,"123","124",groups));

    }

    @Test
    public void getByIdTest(){
        User user = new User();
        user.setU_name("123");
        Groups byId = userService.getByTypeLimit(user);
        System.out.println(byId);
    }

    @Test
    public void loginTest(){
        User user = new User();
        user.setU_name("123");
        user.setU_password("124");
        int login = userService.login(user);
        System.out.println(login);
    }

}
