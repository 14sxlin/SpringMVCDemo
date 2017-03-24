package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller     // 声明为控制器
@RequestMapping({"/","/homepage"})
public class HomeController {

    @RequestMapping(method = RequestMethod.GET) // 处理 "/" 的请求
    public String home(){
        return "home";      // 视图名为 home
    }

}
