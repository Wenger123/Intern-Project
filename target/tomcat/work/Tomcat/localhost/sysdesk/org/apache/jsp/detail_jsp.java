/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-02-19 17:13:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Add necessary imports and styles here -->\n");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("  function toggleComments() {\n");
      out.write("    const commentsSection = document.getElementById(\"commentsSection\");\n");
      out.write("    const commentsButton = document.querySelector(\"button[onclick='toggleComments()']\");\n");
      out.write("\n");
      out.write("    if (commentsSection.style.display === \"none\" || commentsSection.style.display === \"\") {\n");
      out.write("      commentsSection.style.display = \"block\";\n");
      out.write("      commentsButton.innerHTML = \"Collapse Comment(s)\";\n");
      out.write("    } else {\n");
      out.write("      commentsSection.style.display = \"none\";\n");
      out.write("      commentsButton.innerHTML = \"Expand Comment(s)\";\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function populateContactDetails() {\n");
      out.write("    const existingContact = document.getElementById('existingContact').value;\n");
      out.write("\n");
      out.write("    // Populate details based on the selected existing contact\n");
      out.write("    switch (existingContact) {\n");
      out.write("      case 'segun oshodi':\n");
      out.write("        document.getElementById('newContactName').value = 'Segun Oshodi';\n");
      out.write("        document.getElementById('email').value = 'akeembakarey@gmail.com';\n");
      out.write("        break;\n");
      out.write("      case 'osagie agege':\n");
      out.write("        document.getElementById('newContactName').value = 'Osagie Agege';\n");
      out.write("        document.getElementById('email').value = 'ossycraig4all@gmail.com';\n");
      out.write("        document.getElementById('phone').value = '08093125933';\n");
      out.write("        break;\n");
      out.write("            // Add more cases for other contacts as needed\n");
      out.write("      default:\n");
      out.write("        break;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  function addDetails() {\n");
      out.write("    // Your existing addDetails function\n");
      out.write("  }\n");
      out.write("\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /detail.jsp(5,0) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("details");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("<div class=\"formTable\">\n");
        out.write("  ");
        out.write("<label for=\"office\" class=\"required\">Office</label>\n");
        out.write("  <select id=\"office\" name=\"office\" required>\n");
        out.write("    <option value=\"\">--Select Office--</option>\n");
        out.write("    <option value=\"abuja\">Abuja</option>\n");
        out.write("    <option value=\"apapa\">Apapa</option>\n");
        out.write("    <option value=\"calabar office\">Calabar office</option>\n");
        out.write("    <option value=\"head office lagos\">Head Office Lagos</option>\n");
        out.write("    <option value=\"ikeja\">Ikeja</option>\n");
        out.write("    <option value=\"kaduna office\">Kaduna office</option>\n");
        out.write("    <option value=\"kano office\">Kano office</option>\n");
        out.write("    <option value=\"sysserve ikoyi office\">Sysserve Ikoyi office</option>\n");
        out.write("    <option value=\"yaba\">Yaba</option>\n");
        out.write("  </select>\n");
        out.write("\n");
        out.write("  <label for=\"owner\" class=\"required\">Owner</label>\n");
        out.write("  <select id=\"owner\" name=\"owner\">\n");
        out.write("    <option value=\"\">--Select Owner--</option>\n");
        out.write("    <option value=\"abisoye mayegun\">Abisoye Mayegun</option>\n");
        out.write("    <option value=\"akeem bakare\">Akeem Bakare</option>\n");
        out.write("    <option value=\"emmanuel amadiegwu\">Emmanuel Amadiegwu</option>\n");
        out.write("    <option value=\"faith olaniran\">Faith Olaniran</option>\n");
        out.write("    <option value=\"ikechukwu ekwe\">Ikechukwu Ekwe</option>\n");
        out.write("    <option value=\"kazeem balogun\">Kazeem Balogun</option>\n");
        out.write("    <option value=\"sysdesk admin\">Sysdesk Admin</option>\n");
        out.write("  </select>\n");
        out.write("\n");
        out.write("  <br>\n");
        out.write("\n");
        out.write("  <label for=\"clientType\" class=\"required\">Client Type</label>\n");
        out.write("  <input type=\"radio\" id=\"individual\" name=\"clientType\" value=\"Individual\" checked required>\n");
        out.write("  <label for=\"individual\">Individual</label>\n");
        out.write("  <input type=\"radio\" id=\"company\" name=\"clientType\" value=\"Company\" required>\n");
        out.write("  <label for=\"company\">Company</label>\n");
        out.write("\n");
        out.write("  <label for=\"creditType\" class=\"required\">Credit Type</label>\n");
        out.write("  <select id=\"creditType\" name=\"creditType\" required>\n");
        out.write("    <option value=\"Credit Client\">Credit Client</option>\n");
        out.write("    <option value=\"Non Credit Client\">Non Credit Client</option>\n");
        out.write("  </select>\n");
        out.write("\n");
        out.write("  <label for=\"date\" class=\"required\">Date</label>\n");
        out.write("  <input type=\"text\" id=\"date\" name=\"date\" value=\"10/02/2024\" readonly required>\n");
        out.write("\n");
        out.write("  <h3>Client Details</h3>\n");
        out.write("\n");
        out.write("  <label for=\"name\" class=\"required\">Name</label>\n");
        out.write("  <select id=\"name\" name=\"name\" required>\n");
        out.write("    <option value=\"\">--Select Client--</option>\n");
        out.write("    <!-- Add client options dynamically if needed -->\n");
        out.write("    <option value=\"iamOsagie konstructs\"> IamOsagie Konstructs</option>\n");
        out.write("    <option value=\"stanbic ibtc\"> Stanbic Ibtc</option>\n");
        out.write("\n");
        out.write("  </select>\n");
        out.write("\n");
        out.write("  <div class=\"form-group\">\n");
        out.write("    <label for=\"newContactName\" class=\"required\">Contact Name</label>\n");
        out.write("    <div>\n");
        out.write("      <input type=\"text\" id=\"newContactName\" name=\"newContactName\" placeholder=\"Enter New Contact Name\">\n");
        out.write("    </div>\n");
        out.write("    <div>\n");
        out.write("      <label for=\"existingContact\" class=\"required\">Existing Contact Name</label>\n");
        out.write("      <select id=\"existingContact\" name=\"existingContact\" onchange=\"populateContactDetails()\" required>\n");
        out.write("        <option value=\"\">--Select Contact--</option>\n");
        out.write("        <option value=\"segun oshodi\"> Segun Oshodi</option>\n");
        out.write("        <option value=\"osagie agege\"> Osagie Agege</option>\n");
        out.write("        <!-- Add more contacts as needed -->\n");
        out.write("      </select>\n");
        out.write("    </div>\n");
        out.write("  </div>\n");
        out.write("\n");
        out.write("  <br>\n");
        out.write("\n");
        out.write("  <label for=\"email\" class=\"required\">Email</label>\n");
        out.write("  <input type=\"email\" id=\"email\" name=\"email\" required>\n");
        out.write("\n");
        out.write("  <label for=\"phone\" class=\"required\">Phone No</label>\n");
        out.write("  <input type=\"tel\" id=\"phone\" name=\"phone\" required>\n");
        out.write("\n");
        out.write("  <br>\n");
        out.write("\n");
        out.write("  <label for=\"remark\">Remark/Reason</label>\n");
        out.write("  <textarea id=\"remark\" name=\"remark\"></textarea>\n");
        out.write("\n");
        out.write("  <br>\n");
        out.write("\n");
        out.write("  <label for=\"comments\" class=\"required\">Comment(s)</label>\n");
        out.write("  <div id=\"commentsSection\">\n");
        out.write("    <textarea id=\"comments\" name=\"comments\" class=\"formTextField\" rows=\"6\" cols=\"50\"></textarea>\n");
        out.write("  </div>\n");
        out.write("  <button onclick=\"toggleComments()\">Collapse Comment(s)</button>\n");
        out.write("\n");
        out.write("  <br>\n");
        out.write("\n");
        out.write("  <button type=\"submit\">Submit</button>\n");
        out.write("</div>\n");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }
}
