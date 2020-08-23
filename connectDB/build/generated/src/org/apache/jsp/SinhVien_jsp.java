package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.SinhVienDao;
import java.util.ArrayList;
import java.util.List;
import entity.SinhVien;

public final class SinhVien_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <table border=\"1\" style=\"width:100%\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>No.</th>\n");
      out.write("\t\t\t\t\t<th>Mã sinh viên</th>\n");
      out.write("\t\t\t\t\t<th>Tên sinh viên</th>\n");
      out.write("\t\t\t\t\t<th>Giới tính</th>\n");
      out.write("                                        <th>Ngày sinh</th>\n");
      out.write("                                        <th>Quê quán</th>\n");
      out.write("                                        <th>Số TCTL</th>\n");
      out.write("                                        <th>Số TC nợ</th>\n");
      out.write("                                        <th>Điểm trung bình</th>\n");
      out.write("                                        <th>Mã lớp</th>                                                          \n");
      out.write("                    \n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\t");
 SinhVienDao sv=new SinhVienDao();
            List<SinhVien> list=sv.getListSV();
            int i=0;
        for (SinhVien s : list)
        {
            i++;
       				out.print("<tr>");
                                out.print("<td>"+i+"</td>");
                                out.print("<td>"+s.MaSV+"</td>");
				out.print("<td>"+s.TenSV+"</td>");                               
                                if(s.GioiTinh==true)
                                {
                                    out.print("<td>Nam</td>");
                                }        
                                else
                                {
                                    out.print("<td>Nữ</td>");
                                }
                                out.print("<td>"+s.NgaySinh+"</td>");
                                out.print("<td>"+s.QueQuan+"</td>");
                                out.print("<td>"+s.SoTCTL+"</td>");
                                out.print("<td>"+s.SoTCNo+"</td>");	
                                out.print("<td>"+s.DiemTB+"</td>");
                                out.print("<td>"+s.MaLop+"</td>");
                                out.print("</tr>");
                                                }
                                
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("        \n");
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
