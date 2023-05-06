package lehieunghia.spring.layoutdialect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping("/")
    public String HomePage()
    {
        return "home";
    }
    @RequestMapping("/home")
    public String Home()
    {
        return "home";

    }

    @RequestMapping("/product")
    public String showProduct()
    {
        return "product";
    }


    @RequestMapping("/contact")
    public String showContact()
    {
        return "contact";
    }

    @RequestMapping("/about")
    public String showAbout()
    {
        return "about";
    }





}
