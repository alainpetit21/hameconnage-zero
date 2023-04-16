package com.hameconnagezero.webapp.data.service;

import com.hameconnagezero.webapp.data.entity.Email;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EmailService {
    private final EmailRepository repository;


    public EmailService(EmailRepository repository) {
        this.repository = repository;
    }

    public Optional<Email> get(Long id) {
        return repository.findById(id);
    }

    public Email update(Email entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Email> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Email> list(Pageable pageable, Specification<Email> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }
}
