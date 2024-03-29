package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class servlet_005fconfig_005fexample_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h3>ServletConfig Interface</h3>\n");
      out.write("        <div>An object of ServletConfig is created by the web container for each servlet. This object can be used to get configuration information from web.xml file.\n");
      out.write("\n");
      out.write("            If the configuration information is modified from the web.xml file, we don't need to change the servlet. So it is easier to manage the web application if any specific content is modified from time to time.\n");
      out.write("        </div>\n");
      out.write("        <h3>Advantage of ServletConfig</h3>\n");
      out.write("\n");
      out.write("        The core advantage of ServletConfig is that you don't need to edit the servlet file if information is modified from the web.xml file.\n");
      out.write("\n");
      out.write("        <b>Methods of ServletConfig interface</b>\n");
      out.write("        <ol>\n");
      out.write("            <li>public String getInitParameter(String name):Returns the parameter value for the specified parameter name.</li>\n");
      out.write("            <li>public Enumeration getInitParameterNames():Returns an enumeration of all the initialization parameter names.</li>\n");
      out.write("            <li>public String getServletName():Returns the name of the servlet.</li>\n");
      out.write("            <li>public ServletContext getServletContext():Returns an object of ServletContext.</li>\n");
      out.write("        </ol>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
