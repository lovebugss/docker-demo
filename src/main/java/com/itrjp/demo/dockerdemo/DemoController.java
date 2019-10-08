package com.itrjp.demo.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author renjp
 * @date 2019/9/24 17:44
 */
@RestController
public class DemoController {

    @GetMapping("/")
    public String index() {
        return "Hello Docker!!";
    }
}
