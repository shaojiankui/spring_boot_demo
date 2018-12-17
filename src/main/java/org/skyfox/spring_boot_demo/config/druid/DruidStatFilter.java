package org.skyfox.spring_boot_demo.config.druid;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

//https://blog.csdn.net/CoffeeAndIce/article/details/78707819
//配置监控器
//1、过滤不需要监控的后缀
@WebFilter(filterName="druidWebStatFilter",  
urlPatterns="/*",  
initParams={  
    @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*"),// 忽略资源  
}) 
public class DruidStatFilter extends WebStatFilter {

}
