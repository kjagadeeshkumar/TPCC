/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.78
 * Generated at: 2018-03-29 05:00:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chatroom_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\t\t\t\t\t\t<!-- start: CHATROOM-SIDEBAR -->\r\n");
      out.write("\t\t\t<div id=\"off-sidebar\" class=\"sidebar\">\r\n");
      out.write("\t\t\t\t<div class=\"sidebar-wrapper\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-tabs nav-justified\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#off-users\" aria-controls=\"off-users\" role=\"tab\" data-toggle=\"tab\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ti-comments\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#off-favorites\" aria-controls=\"off-favorites\" role=\"tab\" data-toggle=\"tab\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ti-heart\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#off-settings\" aria-controls=\"off-settings\" role=\"tab\" data-toggle=\"tab\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ti-settings\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t\t<div role=\"tabpanel\" class=\"tab-pane active\" id=\"off-users\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"users\" toggleable active-class=\"chat-open\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"users-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"sidebar-content perfect-scrollbar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"sidebar-title\">On-line</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"media-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle-class=\"chat-open\" data-toggle-target=\"#users\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-circle status-online\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Nicole Bell</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Content Designer </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle-class=\"chat-open\" data-toggle-target=\"#users\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"user-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"label label-success\">3</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-circle status-online\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Steven Thompson</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Visual Designer </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle-class=\"chat-open\" data-toggle-target=\"#users\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-circle status-online\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Ella Patterson</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Web Editor </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle-class=\"chat-open\" data-toggle-target=\"#users\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-circle status-online\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Kenneth Ross</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Senior Designer </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"sidebar-title\">Off-line</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"media-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle-class=\"chat-open\" data-toggle-target=\"#users\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Nicole Bell</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Content Designer </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle-class=\"chat-open\" data-toggle-target=\"#users\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"user-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"label label-success\">3</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Steven Thompson</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Visual Designer </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle-class=\"chat-open\" data-toggle-target=\"#users\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Ella Patterson</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Web Editor </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle-class=\"chat-open\" data-toggle-target=\"#users\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Kenneth Ross</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Senior Designer </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle-class=\"chat-open\" data-toggle-target=\"#users\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Ella Patterson</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Web Editor </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a data-toggle-class=\"chat-open\" data-toggle-target=\"#users\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Kenneth Ross</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Senior Designer </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"user-chat\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"chat-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"sidebar-content perfect-scrollbar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"sidebar-back pull-left\" href=\"#\" data-toggle-class=\"chat-open\" data-toggle-target=\"#users\"><i class=\"ti-angle-left\"></i> <span>Back</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ol class=\"discussion\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"messages-date\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tSunday, Feb 9, 12:58\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"self\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPeter Clark\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tHi, Nicole\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNicole Bell\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tHow are you?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"other\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNicole Bell\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tHi, i am good\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"self\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPeter Clark\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tGlad to see you ;)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"messages-date\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tSunday, Feb 9, 13:10\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"other\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNicole Bell\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWhat do you think about my new Dashboard?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"messages-date\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tSunday, Feb 9, 15:28\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"other\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNicole Bell\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAlo...\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNicole Bell\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAre you there?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"self\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPeter Clark\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tHi, i am here\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNicole Bell\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tYour Dashboard is great\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"messages-date\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tFriday, Feb 7, 23:39\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"other\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNicole Bell\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tHow does the binding and digesting work in AngularJS?, Peter?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"self\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPeter Clark\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toh that's your question?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPeter Clark\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlittle reduntant, no?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPeter Clark\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tliterally we get the question daily\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"other\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNicole Bell\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tI know. I, however, am not a nerd, and want to know\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"self\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPeter Clark\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfor this type of question, wouldn't it be better to try Google?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"other\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNicole Bell\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tLucky for us :)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-avatar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"message-bar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"message-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"link icon-only\" href=\"#\"><i class=\"fa fa-camera\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"message-area\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<textarea placeholder=\"Message\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"link\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tSend\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div role=\"tabpanel\" class=\"tab-pane\" id=\"off-favorites\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"users-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sidebar-content perfect-scrollbar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"sidebar-title\">Favorites</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"media-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Nicole Bell</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Content Designer </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"user-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"label label-success\">3</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Steven Thompson</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Visual Designer </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Ella Patterson</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Web Editor </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Kenneth Ross</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Senior Designer </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Ella Patterson</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Web Editor </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"...\" src=\"\" class=\"media-object\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">Kenneth Ross</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Senior Designer </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div role=\"tabpanel\" class=\"tab-pane\" id=\"off-settings\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"sidebar-content perfect-scrollbar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"sidebar-title\">General Settings</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"media-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"padding-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"display-table-cell\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"js-switch\" checked />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"display-table-cell vertical-align-middle padding-left-10\">Enable Notifications</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"padding-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"display-table-cell\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"js-switch\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"display-table-cell vertical-align-middle padding-left-10\">Show your E-mail</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"padding-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"display-table-cell\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"js-switch\" checked />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"display-table-cell vertical-align-middle padding-left-10\">Show Offline Users</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"padding-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"display-table-cell\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"js-switch\" checked />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"display-table-cell vertical-align-middle padding-left-10\">E-mail Alerts</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"padding-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"display-table-cell\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"js-switch\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"display-table-cell vertical-align-middle padding-left-10\">SMS Alerts</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"save-options\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-settings\"></i><span>Save Changes</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- end: CHATROOM-SIDEBAR -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
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