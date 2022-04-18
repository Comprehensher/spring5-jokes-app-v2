package guru.springframework.norrisChuck.controllers;

import guru.springframework.norrisChuck.services.ChuckNorrisQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckController {
    public final ChuckNorrisQuoteService ChuckQuote;
    @Autowired
    public ChuckController(ChuckNorrisQuoteService ChuckVal) {
        this.ChuckQuote = ChuckVal;
    }

    @RequestMapping({"/", ""})
    public String sayQuote(Model model) {
        model.addAttribute("quote", ChuckQuote.getQuote());
        return "index";
    }
}
