package tugastgl30.com.example.tugastgl30.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import tugastgl30.com.example.tugastgl30.model.DaftarKaryawan;
import tugastgl30.com.example.tugastgl30.service.KaryawanService;

/**
 *
 * @author ASUS
 */


@RestController
@CrossOrigin
@RequestMapping("/karyawan")
//@Controller
public class KaryawanController {
    
//    @Autowired
//    private KaryawanService karyawanService;
    @Autowired
    KaryawanService karyawanService;
    
     @GetMapping
    public List<DaftarKaryawan>getAllKaryawan(){
        return karyawanService.getAllKaryawan();
    }
    
//    @GetMapping("/")
//    public String viewHomePage(Model model){
//        model.addAttribute("listKaryawan", karyawanService.getAllKaryawan());
//        return "index";
//    }
    
    @PostMapping
    @ResponseStatus
    public DaftarKaryawan addKaryawan(@RequestBody DaftarKaryawan karyawan){
        return karyawanService.addKaryawan(karyawan);
    }
    
    @GetMapping("/{id}")
    public DaftarKaryawan getKaryawanById(@PathVariable("id") int KaryawanId){
        return karyawanService.getKaryawanById(KaryawanId);
    }
    
    @PutMapping("/updateKaryawan")
    public ResponseEntity<String> updateKaryawan(@RequestBody DaftarKaryawan karyawan){
        try{
            karyawanService.updateKaryawan(karyawan);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteKaryawan(@PathVariable int id){
        try{
            karyawanService.deleteKaryawanById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     
        }
    }
 
    
    
//    @GetMapping("/showNewKaryawanForm")
//    public String showNewKaryawanForm(Model model){
//        DaftarKaryawan daftarkaryawan = new DaftarKaryawan();
//        model.addAttribute("daftarkaryawan", daftarkaryawan);
//        return "new_karyawan";
//    }
//    
//    @PostMapping("/saveKaryawan")
//    public String saveKaryawan(@ModelAttribute("daftarkaryawan") DaftarKaryawan daftarkarayawan){
//        karyawanService.saveKaryawan(daftarkarayawan);
//        return "redirect:/";
//    }
//    
//    @GetMapping("/showFormForUpdate/{id}")
//    public String showFormForUpdate(@PathVariable (value = "id") long id, Model model){
//        
//        DaftarKaryawan daftarkaryawan = karyawanService.getDaftarKaryawanById(id);
//        model.addAttribute("daftarkaryawan", daftarkaryawan);
//        return "update_karyawan";
//        
//    }
//    
//    @GetMapping("/deleteKaryawan/{id}")
//    public String deleteKaryawan(@PathVariable (value = "id") long id){
//        this.karyawanService.deleteKaryawanById(id);
//        return "redirect:/";
//    }
    
}
