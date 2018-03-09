package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.RecipeService;
import guru.springframework.spring5recipeapp.repositories.CategoryRepository;
import guru.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private RecipeService recipeService;

/*
    @Autowired
    private CategoryRepository categoryRepository;
*/



    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", this.recipeService.getRecipes());


//        System.out.println("Id cat founded " + this.categoryRepository.findByDescription("Mexican").get().getId() );

        //System.out.println("Prova mess 121212 dfdsfs dsfsdfds dfssdf");
        return "index";
    }

}
