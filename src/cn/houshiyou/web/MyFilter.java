package cn.houshiyou.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{
    
    private FilterConfig filterConfig;
    
    @Override
    public void destroy() {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        ServletContext context = filterConfig.getServletContext();
        Map<String, Integer> ipMap1 = (Map<String, Integer>) context.getAttribute("ipMap");
        Map<String, Integer> init1 = new HashMap<String, Integer>();
        init1.put("", 0);
        Map<String, Integer> ipMap = (ipMap1==null)? init1 :ipMap1;
        String ip1 = request.getRemoteAddr();
        String ip  = (ip1==null)?"":ip1;
        Integer count1 = ipMap.get(ip);
        Integer count = (ipMap.get(ip)==null)?0:count1;
       
        if(ipMap.containsKey(ip)){
            ipMap.put(ip,count+1);
        }else{
            ipMap.put(ip,1);
        }
        context.setAttribute("ipMap", ipMap);
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }
}
