package lijiang.service;

import lijiang.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/7.
 */
@Component
public class TestService {
    @Autowired
    private TestDao testDao;
    public void test() {
        testDao.add();
    }
}
