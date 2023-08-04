/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir270423.controller;

import Amir270423.view.FormBuku;
import Amir270423.model.BukuDaoImpl;
import Amir270423.model.Buku;
import Amir270423.model.BukuDao;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
/**
 *
 * @author ASUS iD
 */
public class BukuController{
    private FormBuku formBuku;
    private Buku buku;
    private BukuDao bukuDao;
    
    public BukuController(FormBuku formBuku){
        this.formBuku = formBuku;
        bukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm(){
        formBuku.getTxtKodeBuku().setText("");
        formBuku.getTxtJudul().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
        formBuku.getTxtTahun().setText("");
    }
    public void saveBuku(){
        buku = new Buku();
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setTahun(formBuku.getTxtTahun().getText());
        bukuDao.save(buku);
        JOptionPane.showMessageDialog(formBuku, "Insert Ok");
    }
    public void updateBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = new Buku();
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setTahun(formBuku.getTxtTahun().getText());
        bukuDao.update(index, buku);
        JOptionPane.showMessageDialog(formBuku, "Update Ok");
    }
    public void getBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if (buku != null){
            formBuku.getTxtKodeBuku().setText(buku.getKodeBuku());
            formBuku.getTxtJudul().setText(buku.getJudul());
            formBuku.getTxtPengarang().setText(buku.getPengarang());
            formBuku.getTxtPenerbit().setText(buku.getPenerbit());
            formBuku.getTxtTahun().setText(buku.getTahun());
           
        }
    }
    public void delete(){
        int index = formBuku.getTblBuku().getSelectedRow();
        bukuDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formBuku,"Delete Ok");
    }
    public void tampil(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formBuku.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        List<Buku> list = bukuDao.getAllBuku();
        for(Buku buku1 : list){
            Object row[] = {
                buku1.getKodeBuku(),
                buku1.getJudul(),
                buku1.getPengarang(),
                buku1.getPenerbit(),
                buku1.getTahun()
            };
            tabelModel.addRow(row);
        }
    }
}