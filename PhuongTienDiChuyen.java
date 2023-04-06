/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLA7;

/**
 *
 * @author thaih
 */
public abstract class PhuongTienDiChuyen {
    public void batDau() {
	}
	public void tangToc() {
	}
	public void dungDai(){
        }

    abstract double layVanToc();
    private String loaiPhuongTien;
    private String layTenHangSanXuat;
    private String hangSanXuat;

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}
	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	public String getLayTenHangSanXuat() {
		return layTenHangSanXuat;
	}
	public void setLayTenHangSanXuat(String layTenHangSanXuat) {
		this.layTenHangSanXuat = layTenHangSanXuat;
	}
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

}

