package com.fd.javaspringemail.repositories.email;

import com.fd.javaspringemail.models.Email;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends CrudRepository<Email, Long> {
}
