/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.78
 * Generated at: 2018-03-29 05:00:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.authentication;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<!--<![endif]-->\r\n");
      out.write("\t<!-- start: HEAD -->\r\n");
      out.write("\t<!-- start: HEAD -->\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<title>Portal | Login  </title>\r\n");
      out.write("\t\t<!-- start: META -->\r\n");
      out.write("\t\t<!--[if IE]><meta http-equiv='X-UA-Compatible' content=\"IE=edge,IE=9,IE=8,chrome=1\" /><![endif]-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("\t\t<meta content=\"\" name=\"description\" />\r\n");
      out.write("\t\t<meta content=\"\" name=\"author\" />\r\n");
      out.write("\t\t<!-- end: META -->\r\n");
      out.write("\t\t\r\n");
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
      out.write("\t\t\r\n");
      out.write("\t\t<!-- start: SITE-INTRO CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/plugins.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/themes/theme-1.css\" id=\"skin_color\" />\r\n");
      out.write("\t\t<!-- end: SITE-INTRO CSS -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->\r\n");
      out.write("\t\t<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.error {\r\n");
      out.write("\tpadding: 15px;\r\n");
      out.write("\tmargin-bottom: 20px;\r\n");
      out.write("\tborder: 1px solid transparent;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\tcolor: #a94442;\r\n");
      out.write("\tbackground-color: #f2dede;\r\n");
      out.write("\tborder-color: #ebccd1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".msg {\r\n");
      out.write("\tpadding: 15px;\r\n");
      out.write("\tmargin-bottom: 20px;\r\n");
      out.write("\tborder: 1px solid transparent;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\tcolor: #31708f;\r\n");
      out.write("\tbackground-color: #d9edf7;\r\n");
      out.write("\tborder-color: #bce8f1;\r\n");
      out.write("}\r\n");
      out.write(".req{\r\n");
      out.write("color: red; float: right; display:none;\r\n");
      out.write("}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t\t<SCRIPT type=\"text/javascript\">\r\n");
      out.write("\t\t\twindow.history.forward();\r\n");
      out.write("\t\t\tfunction noBack() { window.history.forward(); }\r\n");
      out.write("\t\t</SCRIPT>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<!-- end: HEAD -->\r\n");
      out.write("\t<!-- start: BODY -->\r\n");
      out.write("\t<body class=\"login\" onload='document.loginForm.username.focus(); noBack();'  onpageshow=\"if (event.persisted) noBack();\" onunload=\"\">\r\n");
      out.write("\t\t\t<br/><br/>\r\n");
      out.write("\t\t<!-- start: LOGIN -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"main-login col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4\">\r\n");
      out.write("\t\t\t\t<div class=\"logo margin-top-30\">\r\n");
      out.write("\t\t\t\t\t<img src=\"assets/images/logo.png\" alt=\"LOGO\" width=\"110px\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- start: LOGIN BOX -->\r\n");
      out.write("\t\t\t\t<div class=\"box-login\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form name='loginForm' class=\"form-login\" action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" method='POST' \r\n");
      out.write("\t\t\t\t\tonsubmit=\"return checkValidate()\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<legend>\r\n");
      out.write("\t\t\t\t\t\t\t\tSign in to your account\r\n");
      out.write("\t\t\t\t\t\t\t</legend>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\tPlease enter your name and password to log in.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Username\" id=\"username\" maxlength=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-user\"></i> </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"req\" id=\"username-error\">username is required.</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group form-actions\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control password\" name=\"password\" placeholder=\"Password\" id=\"password\" maxlength=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-lock\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"forgot\" id=\"showhide\" data-val='1'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span id='eye' class=\"glyphicon glyphicon-eye-open\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a> </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"req\" id=\"password-error\">password is required.</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-actions\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"checkbox clip-check check-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"remember\" value=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"remember\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tRemember me on this computer\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tLogin <i class=\"fa fa-arrow-circle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"new-account\"><!--\r\n");
      out.write("\t\t\t\t\t\t\t\tNew account create\r\n");
      out.write("\t\t\t\t\t\t\t-->Did you forget your password?<a class=\"\" href=\"forget.htm\" onclick=\"this.parentNode.submit()\"> Reset password</a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t<!-- start: COPYRIGHT -->\r\n");
      out.write("\t\t\t\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t\t\t\t&copy; <span class=\"current-year\"></span><span class=\"text-bold text-uppercase\"> Portal</span>. <span>All rights reserved</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- end: COPYRIGHT -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- end: LOGIN BOX -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end: LOGIN -->\r\n");
      out.write("\t\t<!-- start: MAIN JAVASCRIPTS -->\r\n");
      out.write("\t\t<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"vendor/modernizr/modernizr.js\"></script>\r\n");
      out.write("\t\t<script src=\"vendor/jquery-cookie/jquery.cookie.js\"></script>\r\n");
      out.write("\t\t<script src=\"vendor/perfect-scrollbar/perfect-scrollbar.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"vendor/switchery/switchery.min.js\"></script>\r\n");
      out.write("\t\t<!-- end: MAIN JAVASCRIPTS -->\r\n");
      out.write("\t\t<!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->\r\n");
      out.write("\t\t<script src=\"vendor/jquery-validation/jquery.validate.min.js\"></script>\r\n");
      out.write("\t\t<!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->\r\n");
      out.write("\t\t<!-- start: SITE-INTRO JAVASCRIPTS -->\r\n");
      out.write("\t\t<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\t\t<!-- start: JavaScript Event Handlers for this page -->\r\n");
      out.write("\t\t<script src=\"assets/js/login.js\"></script>\r\n");
      out.write("\t\t<script src=\"resources/js/sha256.js\"></script>\r\n");
      out.write("\t\t<!-- end: JavaScript Event Handlers for this page -->\r\n");
      out.write("\t\t<!-- end: SITE-INTRO JAVASCRIPTS -->\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\tfunction checkValidate(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif($('#username').val()==''){\r\n");
      out.write("\t\t\t\t$('#username-error').show();\r\n");
      out.write("\t\t\t\t$('#username').css('border-color', 'red');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}else if($('#password').val()==''){\r\n");
      out.write("\t\t\t\t$('#password-error').show();\r\n");
      out.write("\t\t\t\t$('#password').css('border-color', 'red');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t$('#password').val(Sha256.hash($('#password').val()));\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$( \"#username\" ).click(function() {\r\n");
      out.write("\t\t $('#username-error').hide();\r\n");
      out.write("\t\t $('#username').css('border-color', '#e6e8e8'); \r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$( \"#password\" ).click(function() {\r\n");
      out.write("\t\t $('#password-error').hide();\r\n");
      out.write("\t\t $('#password').css('border-color', '#e6e8e8');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("         $(\"#showhide\").click(function() \r\n");
      out.write("         {\r\n");
      out.write("            if ($(this).data('val') == \"1\") \r\n");
      out.write("            {\r\n");
      out.write("               $(\"#password\").prop('type','text');\r\n");
      out.write("               $(\"#eye\").attr(\"class\",\"glyphicon glyphicon-eye-close\");\r\n");
      out.write("               $(this).data('val','0');\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("            {\r\n");
      out.write("               $(\"#password\").prop('type', 'password');\r\n");
      out.write("               $(\"#eye\").attr(\"class\",\"glyphicon glyphicon-eye-open\");\r\n");
      out.write("               $(this).data('val','1');\r\n");
      out.write("            }\r\n");
      out.write("         });\r\n");
      out.write("      });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#remember').change(function() {\r\n");
      out.write("\t\t var user =$('#username').val();\r\n");
      out.write("\t\t var pass = $('#password').val();\r\n");
      out.write("\t\t  if ($(this).is(':checked')) {\r\n");
      out.write("\t\t    if(user == ''){\r\n");
      out.write("\t\t    \t$('#username-error').show();\r\n");
      out.write("\t\t\t\t$('#username').css('border-color', 'red');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t    }else{\r\n");
      out.write("\t\t    \tif (typeof(Storage) !== \"undefined\") {\r\n");
      out.write("\t\t\t    \tlocalStorage.setItem(\"remname\", user);\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    if(pass == ''){\r\n");
      out.write("\t\t    \t$('#password-error').show();\r\n");
      out.write("\t\t\t\t$('#password').css('border-color', 'red');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t    }else{\r\n");
      out.write("\t\t    \tif (typeof(Storage) !== \"undefined\") {\r\n");
      out.write("\t\t\t    \tlocalStorage.setItem(\"remcode\", pass );\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t    }\r\n");
      out.write("\r\n");
      out.write("\t\t  } else {\r\n");
      out.write("\t\t    localStorage.removeItem(\"remname\");\r\n");
      out.write("\t\t    localStorage.removeItem(\"remcode\");\t\t    \r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\tvar remname=localStorage.getItem(\"remname\");\r\n");
      out.write("\t\t\tvar remcode=localStorage.getItem(\"remcode\");\r\n");
      out.write("\t\t\tif(remname != null && remcode != null){\r\n");
      out.write("\t\t\t\t$(\"#remember\").prop( \"checked\", true );\r\n");
      out.write("\t\t\t\t$('#username').val(remname);\r\n");
      out.write("\t\t\t\t$('#password').val(remcode);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/jsp/authentication/login.jsp(86,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty error}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div class=\"error\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/jsp/authentication/login.jsp(89,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty msg}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div class=\"msg\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/jsp/authentication/login.jsp(95,55) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("./login_Authenticate.htm");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}