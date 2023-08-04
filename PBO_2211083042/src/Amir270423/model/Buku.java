/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir270423.model;

/**
 *
 * @author ASUS iD
 */
public class Buku {
    private String kodeBuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahun;
    
    public Buku (){
    
    }
    public Buku (String kodeBuku, String judul, String pengarang, String penerbit, String tahun){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    public String getKodeBuku(){
        return kodeBuku;
    }
    public String getJudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    public String getPenerbit(){
        return penerbit;
    }
    public String getTahun(){
        return tahun;
    }
    public void setKodeBuku(String kodeBuku){
        this.kodeBuku = kodeBuku;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    public void setTahun(String tahun){
        this.tahun = tahun;
    }
}
