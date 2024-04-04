package com.example.demoGreatings;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class GreatingsController {
    @GetMapping(path = "/ciao/{regione}")
    public GreatingsObj ciao(@RequestParam String nome,@PathVariable String regione) {
        String saluto = "Ciao " + nome + ", " + "com'è il tempo in " + regione +"?";
        return new GreatingsObj(nome,regione,saluto);
    }
}
