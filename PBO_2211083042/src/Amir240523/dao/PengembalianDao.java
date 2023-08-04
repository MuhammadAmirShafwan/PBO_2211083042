/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Amir240523.dao;
import Amir240523.model.Pengembalian;
import java.sql.*;
import java.util.List;
/**
 *
 * @author ASUS iD
 */
public interface PengembalianDao {
    void insert(Pengembalian pengembalian) throws SQLException;
    void update(Pengembalian pengembalian) throws SQLException;
    void delete(Pengembalian pengembalian) throws SQLException;
    Pengembalian getPengembalian(String nobp, String kodebuku, String tglPinjam) throws SQLException;
    public List<Pengembalian> getAll() throws SQLException;
    int selisihTanggal (String tgl1, String tgl2) throws SQLException;
}
