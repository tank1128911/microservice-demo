package cn.oz.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by HimuraKenShin on 2018/7/29.
 */
@Service("sayHiService")
public class SayHiServiceImpl implements SayHiService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "onHiError")
    public String sayHi(String name) {
        if (name == null || name.length() <= 0){
            name = "UnNamed";
        }
        return restTemplate.getForObject("http://SERVICE-HI/sayhi?name=" + name, String.class);
    }

    public String onHiError(String name){
        return "Sorry " + name + " ribbon本来想和你打个招呼的，但它挂了······";
    }
}
