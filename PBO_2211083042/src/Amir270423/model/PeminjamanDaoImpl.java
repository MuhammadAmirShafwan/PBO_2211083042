/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir270423.model;
import java.util.*;
/**
 *
 * @author ASUS iD
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
     List<Peminjaman> data = new ArrayList<>();
    
     public PeminjamanDaoImpl(){
         AnggotaDao daoAnggota = new AnggotaDaoImpl();
         BukuDao daoBuku = new BukuDaoImpl();
         data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"27-02-2023","28-02-2023"));
         data.add(new Peminjaman(daoAnggota.getAnggota(1),daoBuku.getBuku(1),"12-03-2022","17-03-2022"));
     }
    @Override
    public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    
    @Override
    public void update (int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    
    @Override
    public void delete (int index){
        data.remove(index);
    }
    @Override
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    
    @Override
    public List<Peminjaman> getAllPeminjaman(){
        return data;
    }
}
