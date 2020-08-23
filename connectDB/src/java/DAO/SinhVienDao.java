/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import context.DBcontext;
import entity.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class SinhVienDao {
    Connection conn=null;//ket noi toi sql 
    PreparedStatement ps=null;//nem cau lenh tu netbean sang sql server
    ResultSet rs=null;//nhận kết quả trả về
    public List<SinhVien> getListSV() 
    {
try{
            String query="select *from SinhVien";
            conn=new DBcontext().getConnection();//mo ket noi toi sql server
            ps=conn.prepareStatement(query);//nem cau lenh query vao sql
            rs=ps.executeQuery();//execute query va nhan ket qua tra ve
            List<SinhVien> list=new ArrayList<>();
            while(rs.next())
            {
                SinhVien sv=new SinhVien(rs.getString(1), rs.getString(2), rs.getBoolean(3), rs.getString(4), rs.getString(5), rs.getString(6),  rs.getString(7),  rs.getString(8),  rs.getString(9));
                list.add(sv);
            }
            return list;
}catch(Exception e){}
        return null;
    }
}
    

