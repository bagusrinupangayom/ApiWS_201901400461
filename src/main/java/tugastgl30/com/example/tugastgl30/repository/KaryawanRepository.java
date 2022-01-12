/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tugastgl30.com.example.tugastgl30.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tugastgl30.com.example.tugastgl30.model.DaftarKaryawan;

/**
 *
 * @author ASUS
 */
@Repository
public interface KaryawanRepository extends JpaRepository<DaftarKaryawan, Integer> {
    
}
