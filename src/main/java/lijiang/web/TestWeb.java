package lijiang.web;

import lijiang.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/11/7.
 */
@Controller
public class TestWeb {
    @Autowired
    private TestService testService;
    @RequestMapping("/test")
    public String test(){
        testService.test();
        return "test";
    }
}
