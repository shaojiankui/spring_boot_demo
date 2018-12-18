package org.skyfox.spring_boot_demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.skyfox.spring_boot_demo.Service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
@Component
public class AccessTokenVerifyInterceptor extends HandlerInterceptorAdapter {
	@Autowired
    ValidationService validationService;
 
 
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
//       ("AccessToken executing ...");
        boolean flag = false;
//        // token
//        String accessToken = request.getParameter("token");
//        if (accessToken !=null) {
//        	 flag = true;
////            // 验证
////            ValidationModel v = validationService.verifyAccessToken(accessToken);
////            // 时间过期
//// 
////            // 用户验证
////            if (v != null) {
////                User user = userService.findById(v.getUid());
////                if(user != null) {
////                    request.setAttribute(CommonConst.PARAM_USER, user);
////                    LOG.info("AccessToken SUCCESS ...  user:" + user.getUserName() + " - " + accessToken);
////                    flag = true;
////                }
////            }
//        }
// 
//        if (!flag) {
//            response.setStatus(401);
//            response.getWriter().print("AccessToken ERROR");
//        }
        flag = true;
        return flag;
    }
}
