package guru.springframework.demo.controller;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @Autowired
    private ChuckNorrisQuotes quotesService;

    @RequestMapping("/")
    public String getQuote(Model model){
        model.addAttribute("joke", quotesService.getRandomQuote());
        return "chucknorris";
    }
}
