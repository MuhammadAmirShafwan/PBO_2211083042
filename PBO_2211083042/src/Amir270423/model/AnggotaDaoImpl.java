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
public class AnggotaDaoImpl implements AnggotaDao {
    List<Anggota> data = new ArrayList<>();
    
    public AnggotaDaoImpl(){
        data.add(new Anggota("1008","Ali","Padang","L"));
        data.add(new Anggota("1017","Ana","Padang","P"));
    }
    @Override
    public void save(Anggota anggota){
        data.add(anggota);
    }
    
    @Override
    public void update (int index, Anggota anggota){
        data.set(index, anggota);
    }
    
    @Override
    public void delete (int index){
        data.remove(index);
    }
    @Override
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    
    @Override
    public List<Anggota> getAllAnggota(){
        return data;
    }
}
