package cn.oz.web.controller;

import cn.oz.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HimuraKenShin on 2018/7/29.
 */
@RestController
public class HiController {
    @Autowired
    SayHiService sayHiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name", required = false, defaultValue = "HimuraKenShin")String name){
        return sayHiService.sayHi(name);
    }
}
