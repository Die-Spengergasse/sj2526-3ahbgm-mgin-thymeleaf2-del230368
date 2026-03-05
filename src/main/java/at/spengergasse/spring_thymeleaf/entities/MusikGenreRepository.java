package at.spengergasse.spring_thymeleaf.entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MusikGenreRepository extends JpaRepository<Musik_genre, Integer> {
}