package cn.oz.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by HimuraKenShin on 2018/7/29.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromeClientOne(String name) {
        return "sorry " + name + "，服务正在休假中，feign什么也做不了！";
    }
}
