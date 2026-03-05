package at.spengergasse.spring_thymeleaf.controllers;

import at.spengergasse.spring_thymeleaf.entities.Musik_genre;
import at.spengergasse.spring_thymeleaf.entities.MusikGenreRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/genre")
public class MusikGenreController {

    private final MusikGenreRepository repository;

    public MusikGenreController(MusikGenreRepository repository) {
        this.repository = repository;
    }

    // --- Verwaltungsseite (Liste + Edit/Delete) ---
    @GetMapping("/manage")
    public String manageGenres(Model model) {
        model.addAttribute("genres", repository.findAll());
        return "manage_genre";
    }

    // --- Neues Genre ---
    @GetMapping("/add")
    public String addGenreForm(Model model) {
        model.addAttribute("genre", new Musik_genre());
        return "add_genre";
    }

    @PostMapping("/add")
    public String saveGenre(@ModelAttribute("genre") Musik_genre genre) {
        repository.save(genre);
        return "redirect:/genre/manage";
    }

    // --- Bearbeiten ---
    @GetMapping("/edit/{id}")
    public String editGenreForm(@PathVariable int id, Model model) {
        Musik_genre genre = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid ID:" + id));
        model.addAttribute("genre", genre);
        return "edit_genre";
    }

    @PostMapping("/update/{id}")
    public String updateGenre(@PathVariable int id, @ModelAttribute("genre") Musik_genre genre) {
        genre.setId(id);
        repository.save(genre);
        return "redirect:/genre/manage";
    }

    // --- Löschen ---
    @GetMapping("/delete/{id}")
    public String deleteGenre(@PathVariable int id) {
        repository.deleteById(id);
        return "redirect:/genre/manage";
    }
}