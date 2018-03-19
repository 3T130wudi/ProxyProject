package util;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import entity.Users;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {


    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        //首先进入的方法
        System.out.println("preHandle");
        //return false表示拦截，不向下执行
        //return true表示放行
        System.out.println(request.getServletPath());
        HttpSession session = request.getSession();

        Users u=(Users)session.getAttribute("user");
        if(u!=null){
            return true;
        }else{
            return false;
        }

    }
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {


        System.out.println("afterCompletion");




    }
}

