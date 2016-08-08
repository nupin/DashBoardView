package com.yodlee.dashboard.presentation.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class DashBoardAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { DashBoardAppConfig.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
 
}


//public class DashBoardAppInitializer implements WebApplicationInitializer{
//
//	@Override
//	public void onStartup(ServletContext container) throws ServletException {
//		
//		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(DashBoardAppConfig.class);
//        ctx.setServletContext(container);
// 
//        ServletRegistration.Dynamic servlet = container.addServlet(
//                "dispatcher", new DispatcherServlet(ctx));
// 
//        servlet.setLoadOnStartup(1);
//        servlet.addMapping("/");
//		
//	}
//
//}
