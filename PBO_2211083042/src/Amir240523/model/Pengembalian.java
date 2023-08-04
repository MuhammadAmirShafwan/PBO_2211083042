/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir240523.model;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ASUS iD
 */
public class Pengembalian {
    private String nobp;
    private String kodeBuku;
    private String tglPinjam;
    private String tglDikembalikan;
    private int terlambat;
    private Double denda;
    
    public Pengembalian(){
    
    }
    public Pengembalian (String nobp, String kodeBuku, String tglPinjam, String tglDikembalikan, int terlambat, Double denda){
        this.nobp = nobp;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglDikembalikan = tglDikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
    }

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglDikembalikan() {
        LocalDate tglDikembalikan = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String tglDikembalikanFormatted = tglDikembalikan.format(formatter);
        return tglDikembalikanFormatted;
    }

    public void setTglDikembalikan(String tglDikembalikan) {
        this.tglDikembalikan = tglDikembalikan;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public Double getDenda() {
        double denda = terlambat * 1000;
        return denda;
    }

    public void setDenda(Double denda) {
        this.denda = denda;
    }
    
}
