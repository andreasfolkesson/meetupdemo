package demo.mvc;

import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

/**
 * Created by andfo on 17/05/15
 */
@Controller
@RequestMapping("/")
public class DemoController {
    @RequestMapping
    public String hello(final ModelMap model) {
        model.put("dayofweek", LocalDate.now().getDayOfWeek().toString());
        return "index";
    }
}
