package org.skyfox.spring_boot_demo.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
	@Autowired
	private MyInterceptor authorizationInterceptor;
	@Autowired
	private AccessTokenVerifyInterceptor accessInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(authorizationInterceptor).addPathPatterns("/**");
        registry.addInterceptor(accessInterceptor).addPathPatterns("/**");
        
        super.addInterceptors(registry);
    }
}
