package cn.lcp.auth.feign.service.fallback;

import cn.lcp.auth.feign.service.AuthFeignService;
import org.springframework.stereotype.Component;

@Component
public class AuthFeignServiceFallbackImpl implements AuthFeignService {

    @Override
    public String hello(String name) {
        return "hello " + name + ", this is template-auth, but request error";
    }
}
