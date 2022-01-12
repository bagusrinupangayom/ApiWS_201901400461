 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugastgl30.com.example.tugastgl30.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "daftarkaryawan")
@XmlRootElement

@NamedQueries({
    @NamedQuery(name = "DaftarKaryawan.findAll", query = "SELECT d FROM DaftarKaryawan d"),
    @NamedQuery(name = "DaftarKaryawan.findById", query = "SELECT d FROM DaftarKaryawan d WHERE d.id = :id"),
    @NamedQuery(name = "DaftarKaryawan.findByNamaDepan", query = "SELECT d FROM DaftarKaryawan d WHERE d.namaDepan = :namaDepan"),
    @NamedQuery(name = "DaftarKaryawan.findByNamaBelakang", query = "SELECT d FROM DaftarKaryawan d WHERE d.namaBelakang = :namaBelakang"),
    @NamedQuery(name = "DaftarKaryawan.findByEmail", query = "SELECT d FROM DaftarKaryawan d WHERE d.email = :email")})

public class DaftarKaryawan implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "namaDepan")
    private String namaDepan;
    @Basic(optional = false)
    @Column(name = "namaBelakang")
    private String namaBelakang;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public DaftarKaryawan() {
    }

    public DaftarKaryawan(Integer id) {
        this.id = id;
    }

    public DaftarKaryawan(Integer id, String namaDepan, String namaBelakang, String email) {
        this.id = id;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DaftarKaryawan)) {
            return false;
        }
        DaftarKaryawan other = (DaftarKaryawan) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
//        return "ti.umy.TugasAkhirDua.Daftarbuku[ id=" + id + " ]";        
        return "KaryawanId = " + getId() + "Nama Depan = "+ getNamaDepan()+"Nama Belakang = "+getNamaBelakang()+"Email = "+getEmail();
    }
    
    
    
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//    
//    @Column(name = "nama_depan")
//    private String namaDepan;
//    
//    @Column(name = "nama_belakang")
//    private String namaBelakang;
//    
//    @Column(name = "email")
//    private String email;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getNamaDepan() {
//        return namaDepan;
//    }
//
//    public void setNamaDepan(String namaDepan) {
//        this.namaDepan = namaDepan;
//    }
//
//    public String getNamaBelakang() {
//        return namaBelakang;
//    }
//
//    public void setNamaBelakang(String namaBelakang) {
//        this.namaBelakang = namaBelakang;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
    
    
    
}
