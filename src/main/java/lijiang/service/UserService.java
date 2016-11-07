package lijiang.service;


import lijiang.dao.UserDao;
import lijiang.entity.Groups;


import lijiang.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/11/7.
 */
@Component
public class UserService {
    @Autowired
    private UserDao userDao;

    public void add(User user){
        userDao.add(user);
    }

    public void delete(int u_id){
        userDao.delete(u_id);
    }

    public void update(User user){
        userDao.update(user);
    }
    public int login(User user){
      return   userDao.login(user);
    }

    public Groups getByTypeLimit(User user){
       return userDao.getByTypeLimit(user).getGroups();
    }

}
