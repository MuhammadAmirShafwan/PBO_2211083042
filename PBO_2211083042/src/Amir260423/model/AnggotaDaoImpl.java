/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir260423.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS iD
 */
public class AnggotaDaoImpl implements AnggotaDao {
    private List<Anggota> data = new ArrayList<>();
    
    @Override
    public Anggota save(Anggota anggota){
        data.add(anggota);
        return anggota;
    }
    
    @Override
    public Anggota update (int index, Anggota anggota){
        data.set(index, anggota);
        return anggota;
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
