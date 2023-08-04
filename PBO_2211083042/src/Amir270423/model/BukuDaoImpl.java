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
public class BukuDaoImpl implements BukuDao{
    List<Buku> data = new ArrayList<>();
    
    public BukuDaoImpl(){
        data.add(new Buku("98123","Habis Gelap Terbitlah Terang","Ra. Kartini","Airlangga","2006"));
        data.add(new Buku("52789","Petualang Bolang","Udiin","Airlangga","2013"));
    }
    
    @Override
    public void save(Buku buku){
        data.add(buku);
    }
    
    @Override
    public void update (int index, Buku buku){
        data.set(index, buku);
    }
    
    @Override
    public void delete (int index){
        data.remove(index);
    }
    @Override
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    @Override
    public List<Buku> getAllBuku(){
        return data;
    }
}
