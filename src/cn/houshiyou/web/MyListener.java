package cn.houshiyou.web;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0){
		
	}
	@Override
    public void contextInitialized(ServletContextEvent arg0) {
        ServletContext context = arg0.getServletContext();
        Map<String, Integer> ipMap = new LinkedHashMap<String, Integer>();
        context.setAttribute("ipMap", ipMap);
    }
}
