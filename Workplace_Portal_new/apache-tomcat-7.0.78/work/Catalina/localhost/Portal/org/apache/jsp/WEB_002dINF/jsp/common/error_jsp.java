/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.78
 * Generated at: 2018-03-29 05:12:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- Template Name: Clip-Two - Responsive Admin Template build with Twitter Bootstrap 3.x | Author: ClipTheme -->\r\n");
      out.write("<!--[if IE 8]><html class=\"ie8\" lang=\"en\"><![endif]-->\r\n");
      out.write("<!--[if IE 9]><html class=\"ie9\" lang=\"en\"><![endif]-->\r\n");
      out.write("<!--[if !IE]><!-->\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<!--<![endif]-->\r\n");
      out.write("\t<!-- start: HEAD -->\r\n");
      out.write("\t<!-- start: HEAD -->\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Oops! That page couldn't be found.</title>\r\n");
      out.write("\t\t<!-- start: META -->\r\n");
      out.write("\t\t<!--[if IE]><meta http-equiv='X-UA-Compatible' content=\"IE=edge,IE=9,IE=8,chrome=1\" /><![endif]-->\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("\t\t<meta content=\"\" name=\"description\" />\r\n");
      out.write("\t\t<meta content=\"\" name=\"author\" />\r\n");
      out.write("\t\t<!-- end: META -->\r\n");
      out.write("\t\t<!-- start: GOOGLE FONTS -->\r\n");
      out.write("\t\t<link href=\"http://fonts.googleapis.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<!-- end: GOOGLE FONTS -->\r\n");
      out.write("\t\t<!-- start: MAIN CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"vendor/fontawesome/css/font-awesome.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"vendor/themify-icons/themify-icons.min.css\">\r\n");
      out.write("\t\t<link href=\"vendor/animate.css/animate.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"vendor/perfect-scrollbar/perfect-scrollbar.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"vendor/switchery/switchery.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<!-- end: MAIN CSS -->\r\n");
      out.write("\t\t<!-- start: CLIP-TWO CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/plugins.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/themes/theme-1.css\" id=\"skin_color\" />\r\n");
      out.write("\t\t<!-- end: CLIP-TWO CSS -->\r\n");
      out.write("\t\t<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->\r\n");
      out.write("\t\t<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<!-- end: HEAD -->\r\n");
      out.write("\t<!-- start: BODY -->\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<br/><br/><br/><br/>\r\n");
      out.write("\t\t<!-- start: 404 -->\r\n");
      out.write("\t\t<div class=\"error-full-page\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-12 page-error animated shake\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"error-number text-azure\">\r\n");
      out.write("\t\t\t\t\t\t\t404\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"error-details col-sm-6 col-sm-offset-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Oops! You are stuck at 404</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\tUnfortunately the page you were looking for could not be found.\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\tIt may be temporarily unavailable, moved or no longer exist.\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\tCheck the URL you entered for any mistakes and try again.\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"login.htm\" class=\"btn btn-red btn-return\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tReturn home\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end: 404 -->\r\n");
      out.write("\t\t<!-- start: MAIN JAVASCRIPTS -->\r\n");
      out.write("\t\t<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"vendor/modernizr/modernizr.js\"></script>\r\n");
      out.write("\t\t<script src=\"vendor/jquery-cookie/jquery.cookie.js\"></script>\r\n");
      out.write("\t\t<script src=\"vendor/perfect-scrollbar/perfect-scrollbar.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"vendor/switchery/switchery.min.js\"></script>\r\n");
      out.write("\t\t<!-- end: MAIN JAVASCRIPTS -->\r\n");
      out.write("\t\t<!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->\r\n");
      out.write("\t\t<!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->\r\n");
      out.write("\t\t<!-- start: CLIP-TWO JAVASCRIPTS -->\r\n");
      out.write("\t\t<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\t\t<!-- start: JavaScript Event Handlers for this page -->\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tjQuery(document).ready(function() {\r\n");
      out.write("\t\t\t\tMain.init();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<!-- end: JavaScript Event Handlers for this page -->\r\n");
      out.write("\t\t<!-- end: CLIP-TWO JAVASCRIPTS -->\r\n");
      out.write("\t</body>\r\n");
      out.write("\t<!-- end: BODY -->\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
