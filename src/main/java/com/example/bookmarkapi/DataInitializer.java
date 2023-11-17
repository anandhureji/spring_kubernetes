package com.example.bookmarkapi;

import com.example.bookmarkapi.Repository.BookmarkRepository;
import com.example.bookmarkapi.domain.Bookmark;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {

        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null,"anandhu","https:/anandhu.in", Instant.now()));






    }
}
