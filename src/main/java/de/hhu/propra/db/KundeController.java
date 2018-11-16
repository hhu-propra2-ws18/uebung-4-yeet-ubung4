package de.hhu.propra.db;

import de.hhu.propra.db.data.KundeRepository;
import de.hhu.propra.db.entities.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class KundeController{
    @Autowired
    KundeRepository kunden;

    @GetMapping("/")
    public String index(Model model) {
        List<Kunde> all = kunden.findAll();
        model.addAttribute("kunden", all);
        return "index";
    }
}
