package dsa.learning.jokesapp.controllers;

import dsa.learning.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeService jokeService;


    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getIndex(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }

}
