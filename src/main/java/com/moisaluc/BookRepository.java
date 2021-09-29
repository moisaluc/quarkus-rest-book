package com.moisaluc;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    @ConfigProperty(name = "books.genre", defaultValue = "Sci-Fi")
    String genre;

    public List<Book> getAll() {
        return List.of(new Book(1, "Understanding Quarkus", "Antonio", 2020, genre),
                new Book(2, "Thinking in Java", "Bruce", 1998, genre));
    }

    public int countAll() {
        return getAll().size();
    }

    public Optional<Book> get(int id) {
        return getAll().stream().filter(b -> b.getId() == id).findFirst();
    }
}