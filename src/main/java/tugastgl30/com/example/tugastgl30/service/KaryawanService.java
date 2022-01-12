/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tugastgl30.com.example.tugastgl30.service;

import java.util.List;
import tugastgl30.com.example.tugastgl30.model.DaftarKaryawan;

/**
 *
 * @author ASUS
 */
public interface KaryawanService {
    List<DaftarKaryawan> getAllKaryawan();
//    void saveKaryawan(DaftarKaryawan daftarkaryawan);
//    DaftarKaryawan getDaftarKaryawanById(long id);
//    void deleteKaryawanById(long id);
    
    DaftarKaryawan addKaryawan(DaftarKaryawan karyawan);
    DaftarKaryawan getKaryawanById(int KaryawanId);
    void updateKaryawan(DaftarKaryawan karyawan);
    void deleteKaryawanById(int bookId);
    
}


