<%-- 
    Document   : SinhVien
    Created on : Aug 20, 2020, 4:31:43 PM
    Author     : User
--%>

<%@page import="DAO.SinhVienDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="entity.SinhVien"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <%-- <jsp:useBean id="a" class="DAO.SinhVienDao" scope="request"></jsp:useBean>--%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--<c:forEach items="${a.listSV}" var="item">
        
        Mã sinh viên: ${item.MaSV}
        <br>
    </c:forEach>--%>
        <table border="1" style="width:100%">
			<thead>
				<tr>
					<th>No.</th>
					<th>Mã sinh viên</th>
					<th>Tên sinh viên</th>
					<th>Giới tính</th>
                                        <th>Ngày sinh</th>
                                        <th>Quê quán</th>
                                        <th>Số TCTL</th>
                                        <th>Số TC nợ</th>
                                        <th>Điểm trung bình</th>
                                        <th>Mã lớp</th>                                                          
                    
				</tr>
			</thead>
			<tbody>
				<% SinhVienDao sv=new SinhVienDao();
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
                                %>
			</tbody>
		</table>
        
    </body>
</html>
