/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir270423.controller;
import Amir270423.view.FormPeminjaman;
import Amir270423.model.Anggota;
import Amir270423.model.PeminjamanDaoImpl;
import Amir270423.model.BukuDaoImpl;
import Amir270423.model.AnggotaDaoImpl;
import Amir270423.model.Buku;
import Amir270423.model.BukuDao;
import Amir270423.model.AnggotaDao;
import Amir270423.model.Peminjaman;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS iD
 */
public class PeminjamanController {
    private Peminjaman peminjaman;
    private PeminjamanDaoImpl peminjamanDao;
    private FormPeminjaman formPeminjaman;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
    }
    public void bersihForm(){
        formPeminjaman.getTxtTglPinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    public void isiCombo(){
        List<Anggota> listAnggota = anggotaDao.getAllAnggota();
        List<Buku> listBuku = bukuDao.getAllBuku();
        formPeminjaman.getCboAnggota().removeAllItems();
        formPeminjaman.getCboBuku().removeAllItems();
        // isi Anggota
        for(Anggota anggota : listAnggota){
            formPeminjaman.getCboAnggota().addItem(anggota.getKodeAnggota());
        }
        for(Buku buku : listBuku){
            formPeminjaman.getCboBuku().addItem(buku.getKodeBuku());
        }
    }
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPinjam(formPeminjaman.getTxtTglPinjam().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Entri Ok");
    }
    public void getPeminjaman(){
        int index = formPeminjaman. getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getCboAnggota().setSelectedItem(peminjaman.getAnggota().getKodeAnggota());
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getBuku().getKodeBuku());
            formPeminjaman.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
            formPeminjaman.getTxtTglKembali().setText(peminjaman.getTglKembali());
        }
    }
    public void updatePeminjaman(){
        int index = formPeminjaman. getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPinjam(formPeminjaman.getTxtTglPinjam().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.update(index,peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Update Ok");
    }
    public void deletePeminjaman(){
        int index = formPeminjaman. getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Delete Ok");
    }
    public void tampil(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman1 : list){
            Object row[] = {
                peminjaman1.getAnggota().getKodeAnggota(),
                peminjaman1.getBuku().getKodeBuku(),
                peminjaman1.getTglPinjam(),
                peminjaman1.getTglKembali()
            };
            tabelModel.addRow(row);
        }
    }
}
