package cn.sboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 码农
 */
@RestController
public class TestController {
    @RequestMapping("hello")
    public String Hello(){
        return "hello springboot";
    }
}
