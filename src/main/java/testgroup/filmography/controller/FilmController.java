package testgroup.filmography.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import testgroup.filmography.model.Film;


@Controller
public class FilmController {
    private static Film film;


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView allFilms(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("films");
        modelAndView.addObject("film",film);
        return modelAndView;
    }

    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public ModelAndView editPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }


}
