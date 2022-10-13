package org.springframework.cloud.springcloudstarternetflixzuul;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class ErrorFilter extends ZuulFilter {
	private static Logger log = LoggerFactory.getLogger(PreFilter.class); 
	

	public boolean shouldFilter() {
		return true;
	}

	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		
		log.info("RouteFilter: " + String.format("%s request to %s", request.getMethod(), request.getRequestURI().toString()));
		return null;
	}

	@Override
	public String filterType() {
		return "ErrorFilter";
	}

	@Override
	public int filterOrder() {
		return 01;
	}

}
