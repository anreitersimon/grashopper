/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2013-12-17 19:00:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userLogged_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/header_template.jsp", Long.valueOf(1387306746000L));
    _jspx_dependants.put("/footer_template.jsp", Long.valueOf(1386604537000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
String activePage = (String)request.getParameter("activePage"); 
      out.write("\n");
      out.write("\n");
      out.write("     <!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Grashopper</title>\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/style.css\" />\n");
      out.write("  <!-- modernizr enables HTML5 elements and feature detects -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/modernizr-1.5.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div id=\"main\">\n");
      out.write("    <header>\n");
      out.write("      <div id=\"logo\">\n");
      out.write("        <div id=\"logo_text\">\n");
      out.write("          <!-- class=\"logo_colour\", allows you to change the colour of the text -->\n");
      out.write("          <h1><a href=\"index.jsp\"> Grashopper </a></h1>\n");
      out.write("          <h2>Mit einem Sprung zum besten Urlaub.</h2>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <nav>\n");
      out.write("        <div id=\"menu_container\">\n");
      out.write("          <ul class=\"sf-menu\" id=\"nav\">\n");
      out.write("\n");
      out.write("            ");
if(activePage!=null && activePage.equals("index")) {
      out.write(" \n");
      out.write("            \t <li><a href=\"index.jsp\"  class=\"highlighted\">Home</a></li>\n");
      out.write("            ");
}
            else{ 
      out.write("\n");
      out.write("             \t<li><a href=\"index.jsp\"  >Home</a></li>\n");
      out.write("            ");
} 
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
if(activePage!=null && activePage.equals("Registrierung")) {
      out.write(" \n");
      out.write("            \t<li><a href=\"Registrierung.jsp\" class=\"highlighted\">Registrierung</a></li>\n");
      out.write("            ");
}
            else{ 
      out.write("\n");
      out.write("             \t<li><a href=\"Registrierung.jsp\" >Registrierung</a></li>\n");
      out.write("            ");
} 
      out.write('\n');
      out.write("\n");
      out.write("            \n");
      out.write("            ");
if(activePage!=null && activePage.equals("Hotellieransicht")) {
      out.write(" \n");
      out.write("            \t  <li><a href=\"Hotellieransicht\" class=\"highlighted\" >Hotellier Ansicht</a></li>\n");
      out.write("            ");
}
            else{ 
      out.write("\n");
      out.write("             \t <li><a href=\"Hotellieransicht\" >Hotellier Ansicht</a></li>\n");
      out.write("            ");
} 
      out.write('\n');
      out.write(' ');
      out.write("\n");
      out.write("            \n");
      out.write("            ");
if(activePage!=null && activePage.equals("TVBAnsicht")) {
      out.write(" \n");
      out.write("            \t  <li><a href=\"TVBAnsicht\" class=\"highlighted\" >TVB-Ansicht</a></li>\n");
      out.write("            ");
}
            else{ 
      out.write("\n");
      out.write("             \t <li><a href=\"TVBAnsicht\" >TVB-Ansicht</a></li>\n");
      out.write("            ");
} 
      out.write('\n');
      out.write(' ');
      out.write("\n");
      out.write("            \n");
      out.write("            ");
if(activePage!=null && activePage.equals("Hotelsuche")) {
      out.write(" \n");
      out.write("            \t  <li><a href=\"Hotelsuche.jsp\"  >Hotelsuche</a></li>\n");
      out.write("            ");
}
            else{ 
      out.write("\n");
      out.write("             \t <li><a href=\"Hotelsuche.jsp\"  >Hotelsuche</a></li>\n");
      out.write("            ");
} 
      out.write('\n');
      out.write(' ');
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <li><a href=\"#\">Dokumentation</a>\n");
      out.write("              <ul>\n");
      out.write("                <li><a href=\"Projektplanung.pdf\" target=\"_blank\" >Projekt Planung</a></li>\n");
      out.write("                <li><a href=\"#\">Projekt Details</a>\n");
      out.write("                  <ul>\n");
      out.write("                    <li><a href=\"Usecase_Diagramm.png\">Use Case Diagramm</a></li>\n");
      out.write("                    <li><a href=\"Anforderungsanalyse.pdf\">Anforderungsanalyse</a></li>\n");
      out.write("\n");
      out.write("                    <li><a href=\"designmodell.pdf\">Designmodell</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\">Präsentationen</a>\n");
      out.write("                  <ul>\n");
      out.write("                    <li><a href=\"Presentation1.pdf\">Präsentation 1</a></li>\n");
      out.write("                    <li><a href=\"Presentation2.pdf\">Präsentation 2</a></li>\n");
      out.write("                    <li><a href=\"Presentation3.pdf\">Präsentation 3</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\">JDoc</a></li>\n");
      out.write("              </ul>\n");
      out.write(" ");
      out.write("\n");
      out.write("            \n");
      out.write("            ");
if(activePage!=null && activePage.equals("Teammitglieder")) {
      out.write(" \n");
      out.write("            \t  <li><a href=\"Teammitglieder.jsp\" class=\"highlighted\" >Team Mitglieder</a></li>\n");
      out.write("            ");
}
            else{ 
      out.write("\n");
      out.write("             \t <li><a href=\"Teammitglieder.jsp\" >Team Mitglieder</a></li>\n");
      out.write("            ");
} 
      out.write('\n');
      out.write(' ');
      out.write("\n");
      out.write("            \n");
      out.write("             </ul> \n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("     \n");
      out.write("    </header>\n");
      out.write("    <div id=\"site_content\">\n");
      out.write("      <div id=\"sidebar_container\">\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("     \t\t");

     		String username=(String)session.getAttribute("username");
			if (username==null) {
			
      out.write("\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "LoginForm.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t");

			} else { 
      out.write("\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "LogoutForm.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t");
}
			
      out.write("\n");
      out.write("   \t\t \n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("          <h2>Useful Links</h2>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"https://docs.google.com/spreadsheet/ccc?key=0AmtJOQ9DhchzdHJyaGRUaFpfZE9ydktJZmpzSjI2ZVE#gid=0\">Projekt Tagebuch</a></li>\n");
      out.write("            <li><a href=\"https://github.com/swe2013hotel2/grashopper\">GitHub</a></li>\n");
      out.write("            <li><a href=\"https://cewebs.cs.univie.ac.at/SWE/ws13/index.php?t=uebung\">Cewebs</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("    \n");
      out.write("      ");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"content\">\n");
      out.write("      \n");
      out.write("        <h2>Welcome ");
      out.print( session.getAttribute("username") );
      out.write("\t</h2>\n");
      out.write("    \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write(" ");
      out.write("\n");
      out.write(" </div>\n");
      out.write("    <footer>\n");
      out.write("      <p>Copyright &copy; scenic_photo | <a href=\"http://www.css3templates.co.uk\">design from css3templates.co.uk</a></p>\n");
      out.write("      <p><h6><a href=\"#\">Sitemap</a>   <a href=\"#\">Impressum</a></h6></p>\n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("  <p>&nbsp;</p>\n");
      out.write("  <!-- javascript at the bottom for fast page loading -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.easing-sooper.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.sooperfish.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function() {\n");
      out.write("      $('ul.sf-menu').sooperfish();\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
