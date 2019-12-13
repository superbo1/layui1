package springboot.layui.control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @GetMapping("/Hello")
    public String test(){
        return "popups";
    }

    @GetMapping("/from")
    public String tes1(){
        return "from";
    }
}
