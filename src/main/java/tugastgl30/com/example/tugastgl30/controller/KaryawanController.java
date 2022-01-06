package tugastgl30.com.example.tugastgl30.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tugastgl30.com.example.tugastgl30.model.DaftarKaryawan;
import tugastgl30.com.example.tugastgl30.service.KaryawanService;

/**
 *
 * @author ASUS
 */
@Controller
public class KaryawanController {
    
    @Autowired
    private KaryawanService karyawanService;
    
    
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listKaryawan", karyawanService.getAllKaryawan());
        return "index";
    }
    
    @GetMapping("/showNewKaryawanForm")
    public String showNewKaryawanForm(Model model){
        DaftarKaryawan daftarkaryawan = new DaftarKaryawan();
        model.addAttribute("daftarkaryawan", daftarkaryawan);
        return "new_karyawan";
    }
    
    @PostMapping("/saveKaryawan")
    public String saveKaryawan(@ModelAttribute("daftarkaryawan") DaftarKaryawan daftarkarayawan){
        karyawanService.saveKaryawan(daftarkarayawan);
        return "redirect:/";
    }
    
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable (value = "id") long id, Model model){
        
        DaftarKaryawan daftarkaryawan = karyawanService.getDaftarKaryawanById(id);
        model.addAttribute("daftarkaryawan", daftarkaryawan);
        return "update_karyawan";
        
    }
    
    @GetMapping("/deleteKaryawan/{id}")
    public String deleteKaryawan(@PathVariable (value = "id") long id){
        this.karyawanService.deleteKaryawanById(id);
        return "redirect:/";
    }
    
}
