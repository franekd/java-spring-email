package com.fd.javaspringemail.repositories.email;

import com.fd.javaspringemail.models.Attachment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentRepository extends CrudRepository<Attachment,Long>{
}
