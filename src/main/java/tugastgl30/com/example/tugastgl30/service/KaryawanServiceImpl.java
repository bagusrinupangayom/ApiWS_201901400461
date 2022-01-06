/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugastgl30.com.example.tugastgl30.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tugastgl30.com.example.tugastgl30.model.DaftarKaryawan;
import tugastgl30.com.example.tugastgl30.repository.KaryawanRepository;

/**
 *
 * @author ASUS
 */
@Service
public class KaryawanServiceImpl implements KaryawanService {

    @Autowired
    private KaryawanRepository karyawanrepository;
    
    @Override
    public List<DaftarKaryawan> getAllKaryawan() {
        return karyawanrepository.findAll();
        
    }

    @Override
    public void saveKaryawan(DaftarKaryawan daftarkaryawan) {
        this.karyawanrepository.save(daftarkaryawan);
    }

    @Override
    public DaftarKaryawan getDaftarKaryawanById(long id) {
        Optional<DaftarKaryawan> optional = karyawanrepository.findById(id);
        DaftarKaryawan daftarkaryawan = null;
        if (optional.isPresent()){
            daftarkaryawan = optional.get();
        }else{
            throw new RuntimeException("DaftarKaryawan not found for id :: "+id);
        }
        return daftarkaryawan;
    }

    @Override
    public void deleteKaryawanById(long id) {
        this.karyawanrepository.deleteById(id);
         
    }
    
}
