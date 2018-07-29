package cn.oz.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by HimuraKenShin on 2018/7/29.
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/sayhi",method = RequestMethod.GET)
    String sayHiFromeClientOne(@RequestParam(value = "name", required = false, defaultValue = "UnNames")String name);
}
