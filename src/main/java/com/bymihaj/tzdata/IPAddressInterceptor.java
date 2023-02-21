package com.bymihaj.tzdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class IPAddressInterceptor implements HandlerInterceptor {

    private final static Logger log = LoggerFactory.getLogger(IPAddressInterceptor.class);
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        String ipAddress = request.getHeader("X-Forward-For");

        if(ipAddress== null){

            ipAddress = request.getRemoteAddr();
        }

        log.info(ipAddress + " " + request.getRequestURI());
        return true;
    }
}
