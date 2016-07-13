package de.miwoe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Grauschleier on 13.07.2016.
 */
@Controller
public class MyController {

    private static final Logger logger =
            LoggerFactory.getLogger(MyController.class);

    @RequestMapping(value = "/foo")
    public @ResponseBody String test() {
        logger.warn("foo {}", 1);
        logger.debug("bar");
        return "foo";
    }

}
