# Musik Genre Verwaltung

Ein Spring Boot Projekt mit Thymeleaf und MySQL zur Verwaltung von Musik-Genres.

---

## Starten

1. MySQL starten
2. Projekt in IntelliJ öffnen
3. `application.properties` konfigurieren
4. `Main` Klasse starten
5. Browser öffnen -> `http://localhost:8080`

---

## URLs

| Seite | URL |
|---|---|
| Startseite | `http://localhost:8080/` |
| Genres verwalten | `http://localhost:8080/genre/manage` |
| Neues Genre | `http://localhost:8080/genre/add` |
| Genre bearbeiten | `http://localhost:8080/genre/edit/{id}` |
| Genre loeschen | `http://localhost:8080/genre/delete/{id}` |

> `{id}` mit der echten ID ersetzen, z.B. `/genre/edit/1`

---

## Datenbank

**Tabellenname:** `g_gerne`

| Spalte | Typ |
|---|---|
| id | INT (AUTO_INCREMENT) |
| name | VARCHAR(255) |
| popularity | INT |
| average_tempo | FLOAT |
| ursprung | VARCHAR(255) |
| listeners_pro_monat | VARCHAR(255) |

---

## Technologien

- Java 17+
- Spring Boot
- Thymeleaf
- MySQL
- Jakarta Persistence (JPA)