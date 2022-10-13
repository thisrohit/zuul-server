package org.springframework.cloud.springcloudstarternetflixzuul;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PostFilter extends ZuulFilter{

	private static Logger log = LoggerFactory.getLogger(PreFilter.class); 
	
	public boolean shouldFilter() {
		return true;
	}

	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest response = ctx.getRequest();
		
		log.info("PostFilter: " + String.format("%s response to %s", response.getMethod(), response.getRequestURI().toString()));
		return null;
	}

	@Override
	public String filterType() {
		return "PostFilter";
	}

	@Override
	public int filterOrder() {
		return 01;
	}

}
