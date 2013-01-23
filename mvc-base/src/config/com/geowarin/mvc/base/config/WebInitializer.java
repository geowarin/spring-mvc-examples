package com.geowarin.mvc.base.config;


import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;

/**
 * http://static.springsource.org/spring-framework/docs/3.2.0.RELEASE/spring-framework-reference/html/mvc.html#mvc-container-config
 * 
 * @author Geoffroy Warin (https://github.com/geowarin)
 *
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	@Override
	protected void registerDispatcherServlet(ServletContext servletContext) {
		super.registerDispatcherServlet(servletContext);
		
		// SiteMesh
		FilterRegistration.Dynamic siteMeshFilter = servletContext.addFilter("sitemesh", new SiteMeshFilter());
		siteMeshFilter.addMappingForUrlPatterns(null, false, "*");
		
		// Encoding filter for user input
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
//		characterEncodingFilter.setForceEncoding(true);
		FilterRegistration.Dynamic securityFilter = servletContext.addFilter("encodingFilter", characterEncodingFilter);
		securityFilter.addMappingForUrlPatterns(null, false, "/*");
	}
}
