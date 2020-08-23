/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author User
 */
public class SinhVien {
    public String MaSV;
    public Boolean GioiTinh;
    public String TenSV;
    public String NgaySinh;
    public String QueQuan;
    public String SoTCTL;
    public String SoTCNo;
    public String DiemTB;
    public String MaLop;
    public SinhVien()
    {
    }
   public SinhVien(String MaSV,String TenSV,Boolean GioiTinh,String NgaySinh,String QueQuan,String SoTCTL,String SoTCNo,String DiemTB,String MaLop)
   {{
       this.MaSV=MaSV;
       this.TenSV=TenSV;
       this.GioiTinh=GioiTinh;
       this.NgaySinh=NgaySinh;
       this.QueQuan=QueQuan;
       this.SoTCTL=SoTCTL;
       this.SoTCNo=SoTCNo;
       this.DiemTB=DiemTB;
       this.MaLop=MaLop;
   }}

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getSoTCTL() {
        return SoTCTL;
    }

    public void setSoTCTL(String SoTCTL) {
        this.SoTCTL = SoTCTL;
    }

    public String getSoTCNo() {
        return SoTCNo;
    }

    public void setSoTCNo(String SoTCNo) {
        this.SoTCNo = SoTCNo;
    }

    public String getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(String DiemTB) {
        this.DiemTB = DiemTB;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }
}
