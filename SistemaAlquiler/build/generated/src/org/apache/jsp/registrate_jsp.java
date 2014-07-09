package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            \r\n");
      out.write("            #aid{\r\n");
      out.write("                width:150px;\r\n");
      out.write("                height:50px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core CSS -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"css/freelancer.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Fonts -->\r\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid fondoGris\">\r\n");
      out.write("            <div class=\"row-fluid  div-titulo\">\r\n");
      out.write("                <h3 class=\"span6\">Registrar nuevo usuario </h3>\r\n");
      out.write("  </div> \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("                <h4 class=\"span6\">Escoja el tipo de usuario que es: </h4>\r\n");
      out.write("                <br><br>\r\n");
      out.write("            <div class=\"row-fluid formulario\">\r\n");
      out.write("                <c:url var=\"url\" value=\"/registrate.html\" />\r\n");
      out.write("                <form:form id=\"frmDatosAlumno\" modelAttribute=\"tipo_cliente\"   method=\"post\"  action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  cssClass=\"form-horizontal\">\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("                        <legend></legend>\r\n");
      out.write("                                                        <table border=\"2\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>Cliente</th>\r\n");
      out.write("                                            <th>Arrendatario</th>\r\n");
      out.write("                                            \r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td><br>Usuario que busca una habitación para alquilar <br><br><img src=\"img/cliente.jpg\" width=\"329\" height=\"209\" alt=\"arrendatario\"/>\r\n");
      out.write("                                            </td>\r\n");
      out.write("                                            <td><br>Es aquel usuario que alquila habitaciones<br><br><img src=\"img/arrendatario.jpg\" width=\"329\" height=\"209\" alt=\"arrendatario\"/>\r\n");
      out.write("                                            </td>\r\n");
      out.write("                                        \r\n");
      out.write("\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td></td>\r\n");
      out.write("                                            <td></td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                        <div class=\"row-fluid \"> \r\n");
      out.write("                            <div class=\"span12 form-actions\">   \r\n");
      out.write("                                <div class=\"control-group\">\r\n");
      out.write("                                    <div class=\"controls\">\r\n");
      out.write("                                        <!--<inpiente\"> &;-->\r\n");
      out.write("                                        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp;\r\n");
      out.write("                                        <a class=\"btn btn-info fa-input right\" href=\"registrar_cliente.jsp\" id=\"aid\" text-align:center> Cliente </a> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp;;\r\n");
      out.write("                                        <a class=\"btn btn-info fa-input right\" href=\"registro_arrendatario.jsp\" id=\"aid\" text-align:center> Arrendatario </a> <td>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp;\r\n");
      out.write("                                        <a class=\"btn btn-info fa-input right\" href=\"inicio.jsp\"> Regresar al inicio </a>  \r\n");
      out.write("                                    </div> \r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </fieldset> \r\n");
      out.write("                </form:form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    <footer class=\"text-center\">\r\n");
      out.write("        <div class=\"footer-below\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        Copyright &copy; 2014 - @Karla @Meli\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("</html>\r\n");
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
