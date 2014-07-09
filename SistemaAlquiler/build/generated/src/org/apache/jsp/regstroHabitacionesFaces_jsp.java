package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regstroHabitacionesFaces_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_validateRegex_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_id_actionListener;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputText_value_validatorMessage_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_message_rendered_id_for_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_validateRegex_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_id_actionListener = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_inputText_value_validatorMessage_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_message_rendered_id_for_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_validateRegex_pattern_nobody.release();
    _jspx_tagPool_h_outputText_value_nobody.release();
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_h_commandButton_value_id_actionListener.release();
    _jspx_tagPool_h_inputText_value_validatorMessage_id.release();
    _jspx_tagPool_h_form_id.release();
    _jspx_tagPool_h_message_rendered_id_for_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    _jspx_th_f_view_0.setJspId("id7");
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("    <html>\r\n");
        out.write("        <head>\r\n");
        out.write("\r\n");
        out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\r\n");
        out.write("            <meta charset=\"utf-8\"/>\r\n");
        out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"/>\r\n");
        out.write("            <meta name=\"description\" content=\"\"/>\r\n");
        out.write("            <meta name=\"author\" content=\"\"/>\r\n");
        out.write("\r\n");
        out.write("            <!-- Bootstrap Core CSS -->\r\n");
        out.write("            <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
        out.write("            <link href=\"css/freelancer.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
        out.write("\r\n");
        out.write("            <!-- Fonts -->\r\n");
        out.write("            <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
        out.write("            <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'/>\r\n");
        out.write("            <meta charset=\"utf-8\"/>\r\n");
        out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\r\n");
        out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\r\n");
        out.write("            <!-- Bootstrap -->\r\n");
        out.write("            <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\r\n");
        out.write("            <title>JSP Page</title>\r\n");
        out.write("        </head>\r\n");
        out.write("        <body>\r\n");
        out.write("            <div class=\"container-fluid fondoGris\">\r\n");
        out.write("                <div class=\"row-fluid  div-titulo\">\r\n");
        out.write("                    <h3 class=\"span6\">Registrar Habitación </h3>\r\n");
        out.write("                    <div class=\"span6\"> <a  href=\"listarAlumnos.html\" class=\" btn btn-info fa-input pull-right\">Volver a Listado</a>   </div> \r\n");
        out.write("                </div>\r\n");
        out.write("                <div class=\"row-fluid formulario\">\r\n");
        out.write("                  \r\n");
        out.write("                        <fieldset>\r\n");
        out.write("                            <legend><h4>Datos Habitación</h4></legend>\r\n");
        out.write("                            ");
        if (_jspx_meth_h_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            </body>\r\n");
        out.write("\r\n");
        out.write("                            <footer class=\"text-center\">\r\n");
        out.write("                                <div class=\"footer-below\">\r\n");
        out.write("                                    <div class=\"container\">\r\n");
        out.write("                                        <div class=\"row\">\r\n");
        out.write("                                            <div class=\"col-lg-12\">\r\n");
        out.write("                                                Copyright  2014 - @Karla @Meli\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </footer>\r\n");
        out.write("                            </html>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      return true;
    }
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.FormTag.class) : new com.sun.faces.taglib.html_basic.FormTag();
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_form_0.setJspId("id47");
    _jspx_th_h_form_0.setId("frmRegistro");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_form_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                \r\n");
        out.write("                                <div class=\"span6\">\r\n");
        out.write("                                <div class=\"control-group\">\r\n");
        out.write("                                ");
        if (_jspx_meth_h_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                <div>\r\n");
        out.write("                                ");
        if (_jspx_meth_h_outputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                                ");
        if (_jspx_meth_h_inputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                 ");
        if (_jspx_meth_h_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div>  \r\n");
        out.write("                                \r\n");
        out.write("                                <div class=\"control-group\">\r\n");
        out.write("                                <div>\r\n");
        out.write("                                ");
        if (_jspx_meth_h_outputText_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                                ");
        if (_jspx_meth_h_inputText_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_h_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div> \r\n");
        out.write("                                \r\n");
        out.write("                                 <div class=\"control-group\">                                \r\n");
        out.write("                                <div>\r\n");
        out.write("                                ");
        if (_jspx_meth_h_outputText_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                                ");
        if (_jspx_meth_h_inputText_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_h_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </div> \r\n");
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"span6\">\r\n");
        out.write("                                    tr\r\n");
        out.write("                                    \r\n");
        out.write("                                </div>\r\n");
        out.write("                                \r\n");
        out.write("<!--                                <p:outputLabel value=\"Características\"/>\r\n");
        out.write("                                <p:inputText id=\"txtNombre\" />\r\n");
        out.write("\r\n");
        out.write("                                <p:outputLabel value=\"Sexo\"/>\r\n");
        out.write("                                <p:selectOneMenu id=\"cmbText\" >\r\n");
        out.write("                                    \r\n");
        out.write("                                </p:selectOneMenu>-->\r\n");
        out.write("\r\n");
        out.write("                               \r\n");
        out.write("                                ");
        if (_jspx_meth_h_commandButton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_id.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form_id.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.MessageTag.class) : new com.sun.faces.taglib.html_basic.MessageTag();
    _jspx_th_h_message_0.setPageContext(_jspx_page_context);
    _jspx_th_h_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_message_0.setJspId("id51");
    _jspx_th_h_message_0.setId("msgForm");
    _jspx_th_h_message_0.setFor(org.apache.jasper.runtime.PageContextImpl.getValueExpression("btnEnviar", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_message_0.setRendered(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    int _jspx_eval_h_message_0 = _jspx_th_h_message_0.doStartTag();
    if (_jspx_th_h_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_message_rendered_id_for_nobody.reuse(_jspx_th_h_message_0);
      return true;
    }
    _jspx_tagPool_h_message_rendered_id_for_nobody.reuse(_jspx_th_h_message_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_0.setJspId("id54");
    _jspx_th_h_outputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Dirección", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_0 = _jspx_th_h_outputText_0.doStartTag();
    if (_jspx_th_h_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
    return false;
  }

  private boolean _jspx_meth_h_inputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_0.setJspId("id57");
    _jspx_th_h_inputText_0.setId("direccion");
    _jspx_th_h_inputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{registroHabitacionBean.habitacionDTO.direccion}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_0.setValidatorMessage(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Ingrese solo texto", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_inputText_0 = _jspx_th_h_inputText_0.doStartTag();
    if (_jspx_eval_h_inputText_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_inputText_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_inputText_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_inputText_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_f_validateRegex_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_inputText_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_h_inputText_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_inputText_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_inputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_validatorMessage_id.reuse(_jspx_th_h_inputText_0);
      return true;
    }
    _jspx_tagPool_h_inputText_value_validatorMessage_id.reuse(_jspx_th_h_inputText_0);
    return false;
  }

  private boolean _jspx_meth_f_validateRegex_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_inputText_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:validateRegex
    com.sun.faces.taglib.jsf_core.RegexValidatorTag _jspx_th_f_validateRegex_0 = (com.sun.faces.taglib.jsf_core.RegexValidatorTag) _jspx_tagPool_f_validateRegex_pattern_nobody.get(com.sun.faces.taglib.jsf_core.RegexValidatorTag.class);
    _jspx_th_f_validateRegex_0.setPageContext(_jspx_page_context);
    _jspx_th_f_validateRegex_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_inputText_0);
    _jspx_th_f_validateRegex_0.setPattern(org.apache.jasper.runtime.PageContextImpl.getValueExpression("^[a-zA-Z]*", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_f_validateRegex_0 = _jspx_th_f_validateRegex_0.doStartTag();
    if (_jspx_th_f_validateRegex_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_validateRegex_pattern_nobody.reuse(_jspx_th_f_validateRegex_0);
      return true;
    }
    _jspx_tagPool_f_validateRegex_pattern_nobody.reuse(_jspx_th_f_validateRegex_0);
    return false;
  }

  private boolean _jspx_meth_h_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.MessageTag.class) : new com.sun.faces.taglib.html_basic.MessageTag();
    _jspx_th_h_message_1.setPageContext(_jspx_page_context);
    _jspx_th_h_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_message_1.setJspId("id62");
    _jspx_th_h_message_1.setId("msg1");
    _jspx_th_h_message_1.setFor(org.apache.jasper.runtime.PageContextImpl.getValueExpression("direccion", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_message_1.setRendered(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    int _jspx_eval_h_message_1 = _jspx_th_h_message_1.doStartTag();
    if (_jspx_th_h_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_message_rendered_id_for_nobody.reuse(_jspx_th_h_message_1);
      return true;
    }
    _jspx_tagPool_h_message_rendered_id_for_nobody.reuse(_jspx_th_h_message_1);
    return false;
  }

  private boolean _jspx_meth_h_outputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_1.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_1.setJspId("id67");
    _jspx_th_h_outputText_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Características", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_1 = _jspx_th_h_outputText_1.doStartTag();
    if (_jspx_th_h_outputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_1);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_1);
    return false;
  }

  private boolean _jspx_meth_h_inputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_1.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_1.setJspId("id70");
    _jspx_th_h_inputText_1.setId("caracteristicas");
    _jspx_th_h_inputText_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{registroHabitacionBean.habitacionDTO.caracteristicas}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_1.setValidatorMessage(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Ingrese solo texto", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_inputText_1 = _jspx_th_h_inputText_1.doStartTag();
    if (_jspx_eval_h_inputText_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_inputText_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_inputText_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_inputText_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_f_validateRegex_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_inputText_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_h_inputText_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_inputText_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_inputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_validatorMessage_id.reuse(_jspx_th_h_inputText_1);
      return true;
    }
    _jspx_tagPool_h_inputText_value_validatorMessage_id.reuse(_jspx_th_h_inputText_1);
    return false;
  }

  private boolean _jspx_meth_f_validateRegex_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_inputText_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:validateRegex
    com.sun.faces.taglib.jsf_core.RegexValidatorTag _jspx_th_f_validateRegex_1 = (com.sun.faces.taglib.jsf_core.RegexValidatorTag) _jspx_tagPool_f_validateRegex_pattern_nobody.get(com.sun.faces.taglib.jsf_core.RegexValidatorTag.class);
    _jspx_th_f_validateRegex_1.setPageContext(_jspx_page_context);
    _jspx_th_f_validateRegex_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_inputText_1);
    _jspx_th_f_validateRegex_1.setPattern(org.apache.jasper.runtime.PageContextImpl.getValueExpression("^[a-zA-Z]*", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_f_validateRegex_1 = _jspx_th_f_validateRegex_1.doStartTag();
    if (_jspx_th_f_validateRegex_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_validateRegex_pattern_nobody.reuse(_jspx_th_f_validateRegex_1);
      return true;
    }
    _jspx_tagPool_f_validateRegex_pattern_nobody.reuse(_jspx_th_f_validateRegex_1);
    return false;
  }

  private boolean _jspx_meth_h_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.MessageTag.class) : new com.sun.faces.taglib.html_basic.MessageTag();
    _jspx_th_h_message_2.setPageContext(_jspx_page_context);
    _jspx_th_h_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_message_2.setJspId("id75");
    _jspx_th_h_message_2.setId("msg2");
    _jspx_th_h_message_2.setFor(org.apache.jasper.runtime.PageContextImpl.getValueExpression("caracteristicas", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_message_2.setRendered(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    int _jspx_eval_h_message_2 = _jspx_th_h_message_2.doStartTag();
    if (_jspx_th_h_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_message_rendered_id_for_nobody.reuse(_jspx_th_h_message_2);
      return true;
    }
    _jspx_tagPool_h_message_rendered_id_for_nobody.reuse(_jspx_th_h_message_2);
    return false;
  }

  private boolean _jspx_meth_h_outputText_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_2.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_2.setJspId("id80");
    _jspx_th_h_outputText_2.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Restricción", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_2 = _jspx_th_h_outputText_2.doStartTag();
    if (_jspx_th_h_outputText_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_2);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_2);
    return false;
  }

  private boolean _jspx_meth_h_inputText_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_2.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_2.setJspId("id83");
    _jspx_th_h_inputText_2.setId("restriccion");
    _jspx_th_h_inputText_2.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{registroHabitacionBean.habitacionDTO.restricciones}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_2.setValidatorMessage(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Ingrese solo texto", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_inputText_2 = _jspx_th_h_inputText_2.doStartTag();
    if (_jspx_eval_h_inputText_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_inputText_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_inputText_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_inputText_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_f_validateRegex_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_inputText_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_h_inputText_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_inputText_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_inputText_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_validatorMessage_id.reuse(_jspx_th_h_inputText_2);
      return true;
    }
    _jspx_tagPool_h_inputText_value_validatorMessage_id.reuse(_jspx_th_h_inputText_2);
    return false;
  }

  private boolean _jspx_meth_f_validateRegex_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_inputText_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:validateRegex
    com.sun.faces.taglib.jsf_core.RegexValidatorTag _jspx_th_f_validateRegex_2 = (com.sun.faces.taglib.jsf_core.RegexValidatorTag) _jspx_tagPool_f_validateRegex_pattern_nobody.get(com.sun.faces.taglib.jsf_core.RegexValidatorTag.class);
    _jspx_th_f_validateRegex_2.setPageContext(_jspx_page_context);
    _jspx_th_f_validateRegex_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_inputText_2);
    _jspx_th_f_validateRegex_2.setPattern(org.apache.jasper.runtime.PageContextImpl.getValueExpression("^[a-zA-Z]*", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_f_validateRegex_2 = _jspx_th_f_validateRegex_2.doStartTag();
    if (_jspx_th_f_validateRegex_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_validateRegex_pattern_nobody.reuse(_jspx_th_f_validateRegex_2);
      return true;
    }
    _jspx_tagPool_f_validateRegex_pattern_nobody.reuse(_jspx_th_f_validateRegex_2);
    return false;
  }

  private boolean _jspx_meth_h_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.MessageTag.class) : new com.sun.faces.taglib.html_basic.MessageTag();
    _jspx_th_h_message_3.setPageContext(_jspx_page_context);
    _jspx_th_h_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_message_3.setJspId("id88");
    _jspx_th_h_message_3.setId("msg3");
    _jspx_th_h_message_3.setFor(org.apache.jasper.runtime.PageContextImpl.getValueExpression("restriccion", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_message_3.setRendered(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    int _jspx_eval_h_message_3 = _jspx_th_h_message_3.doStartTag();
    if (_jspx_th_h_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_message_rendered_id_for_nobody.reuse(_jspx_th_h_message_3);
      return true;
    }
    _jspx_tagPool_h_message_rendered_id_for_nobody.reuse(_jspx_th_h_message_3);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_0.setJspId("id100");
    _jspx_th_h_commandButton_0.setId("btnEnviar");
    _jspx_th_h_commandButton_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Enviar", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_0.setActionListener(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{registroHabitacionBean.enviarRegistro()}", (PageContext)_jspx_page_context, null, void.class, new Class[] {javax.faces.event.ActionEvent.class}));
    int _jspx_eval_h_commandButton_0 = _jspx_th_h_commandButton_0.doStartTag();
    if (_jspx_eval_h_commandButton_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_commandButton_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_commandButton_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_commandButton_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_h_commandButton_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_commandButton_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_id_actionListener.reuse(_jspx_th_h_commandButton_0);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_id_actionListener.reuse(_jspx_th_h_commandButton_0);
    return false;
  }
}
