/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir240523.controller;
import Amir240523.view.FormPeminjaman;
import Amir240523.view.FormPengembalian;
import Amir240523.model.Buku;
import Amir240523.model.Anggota;
import Amir240523.model.Pengembalian;
import Amir240523.model.Peminjaman;
import Amir240523.dao.AnggotaDao;
import Amir240523.dao.PengembalianDaoImpl;
import Amir240523.dao.BukuDaoImpl;
import Amir240523.dao.PeminjamanDaoImpl;
import Amir240523.dao.PengembalianDao;
import Amir240523.dao.AnggotaDaoImpl;
import Amir240523.dao.PeminjamanDao;
import Amir240523.dao.BukuDao;
import Amir240523.database.DatabaseHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS iD
 */
public class PengembalianController {
   FormPengembalian formPengembalian;
   FormPeminjaman formPeminjaman;
   Pengembalian pengembalian;
   Peminjaman peminjaman;
   PeminjamanDao peminjamanDao;
   AnggotaDao anggotaDao;
   BukuDao bukuDao;
   Connection connection;
   PengembalianDao pengembalianDao;
   
  public PengembalianController(FormPengembalian formPengembalian){
       try {
           this.formPengembalian = formPengembalian;
           connection = DatabaseHelper.getConnection();
           peminjamanDao = new PeminjamanDaoImpl(connection);
           anggotaDao = new AnggotaDaoImpl(connection);
           bukuDao = new BukuDaoImpl(connection);
           pengembalianDao = new PengembalianDaoImpl(connection);
       } catch (SQLException ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
  public void clearForm(){
      formPengembalian.getTxtDenda().setText("");
      formPengembalian.getTxtTerlambat().setText("");
      formPengembalian.getTxtTglDikembalikan().setText("");
      formPengembalian.getTxtTglPinjam().setText("");
  } 
  
  public void isiComboAnggota(){
       try {
           formPengembalian.getCboNobp().removeAllItems();
           List<Anggota> list = anggotaDao.getAll();
           for (Anggota anggota : list){
               formPengembalian.getCboNobp().addItem(anggota.getNobp()+"-"+anggota.getNama());
           }
       } catch (SQLException ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void isiComboBuku(){
       try {
           formPengembalian.getCboKodeBuku().removeAllItems();
           List<Buku> list =bukuDao.getAll();
           for (Buku buku : list){
               formPengembalian.getCboKodeBuku().addItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
           }
       } catch (SQLException ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void insert(){
       try {
           pengembalian = new Pengembalian();
           pengembalian.setNobp(formPengembalian.getCboNobp().getSelectedItem().toString().split("-") [0]);
           pengembalian.setKodeBuku(formPengembalian.getCboKodeBuku().getSelectedItem().toString().split("-") [0]);
           pengembalian.setTglPinjam(formPengembalian.getTxtTglPinjam().getText());
           pengembalian.setTglDikembalikan(formPengembalian.getTxtTglDikembalikan().getText());
           pengembalian.setTerlambat(Integer.parseInt(formPengembalian.getTxtTerlambat().getText()));
           pengembalian.setDenda(Double.parseDouble(formPengembalian.getTxtDenda().getText()));
           pengembalianDao.insert(pengembalian);
           JOptionPane.showMessageDialog(formPengembalian, "Pengembalian Ok");
       } catch (SQLException ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void update(){
       try {
           pengembalian.setNobp(formPengembalian.getCboNobp().getSelectedItem().toString().split("-") [0]);
           pengembalian.setKodeBuku(formPengembalian.getCboKodeBuku().getSelectedItem().toString().split("-") [0]);
           pengembalian.setTglPinjam(formPengembalian.getTxtTglPinjam().getText());
           pengembalian.setTglDikembalikan(formPengembalian.getTxtTglDikembalikan().getText());
           pengembalian.setTerlambat(Integer.parseInt(formPengembalian.getTxtTerlambat().getText()));
           pengembalian.setDenda(Double.parseDouble(formPengembalian.getTxtDenda().getText()));
           pengembalianDao.update(pengembalian);
           JOptionPane.showMessageDialog(formPengembalian, "Pengembalian Ok");
       } catch (SQLException ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
  public void tampilTabelPengembalian() {
    try {
        DefaultTableModel tabelModel = (DefaultTableModel) formPengembalian.getTabelPengembalian().getModel();
        tabelModel.setRowCount(0);
        List<Pengembalian> list = pengembalianDao.getAll();
        for (Pengembalian p : list) {
            Anggota anggota = anggotaDao.getAnggota(p.getNobp());
            Buku buku = bukuDao.getBuku(p.getKodeBuku());
            Peminjaman peminjaman = peminjamanDao.getPeminjaman(p.getNobp(), p.getKodeBuku(),p.getTglPinjam());
            Object[] row = {
                anggota.getNobp(),
                anggota.getNama(),
                buku.getKodeBuku(),
                buku.getJudulBuku(),
                p.getTglPinjam(),
                peminjaman.getTglKembali(),
                p.getTglDikembalikan(),
                p.getTerlambat(),
                p.getDenda()
            };
            tabelModel.addRow(row);
        }
    } catch (SQLException ex) {
        Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public void getPengembalian(){
       try {
           pengembalian = new Pengembalian();
           String kodeAnggota = formPengembalian.getTabelPengembalian().getValueAt(formPengembalian.getTabelPengembalian()
                   .getSelectedRow(),0).toString();
           String kodeBuku = formPengembalian.getTabelPengembalian().getValueAt(formPengembalian.getTabelPengembalian()
                   .getSelectedRow(),2).toString();
           String tglPinjam = formPengembalian.getTabelPengembalian().getValueAt(formPengembalian.getTabelPengembalian()
                   .getSelectedRow(),4).toString();
           Peminjaman peminjaman = peminjamanDao.getPeminjaman(kodeAnggota, kodeBuku, tglPinjam);
            Anggota anggota = anggotaDao.getAnggota(peminjaman.getNobp());
           formPengembalian.getCboNobp().setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
           Buku buku = bukuDao.getBuku(peminjaman.getKodeBuku());
           formPengembalian.getCboKodeBuku().setSelectedItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
           formPengembalian.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
           formPengembalian.getTxtTglDikembalikan().setText(pengembalian.getTglDikembalikan());
           int terlambat = pengembalianDao.selisihTanggal(pengembalian.getTglDikembalikan(), peminjaman.getTglKembali());
           pengembalian.setTerlambat(terlambat);
           formPengembalian.getTxtTerlambat().setText(""+terlambat);
           formPengembalian.getTxtDenda().setText(""+pengembalian.getDenda());
                   } catch (SQLException ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
  }
}
 
