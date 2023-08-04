/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Amir260423.controller;

import Amir260423.model.Anggota;
import Amir260423.model.AnggotaDao;
import Amir260423.model.AnggotaDaoImpl;
import Amir260423.view.FormAnggota;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AnggotaController {

    private FormAnggota formAnggota;
    private AnggotaDao anggotaDao;

    public AnggotaController(FormAnggota formAnggota) {
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImpl();
    }

    public void saveAnggota() {
        Anggota anggota = new Anggota();
        anggota.setNobp(formAnggota.getTxtNobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Insert Ok");
    }

    public void tampil() {
        DefaultTableModel tabelModel = (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAllAnggota();

        for (Anggota anggota : list) {
            Object row[] = {anggota.getNobp(), anggota.getNama(), anggota.getAlamat()};
            tabelModel.addRow(row);
        }
    }
}

