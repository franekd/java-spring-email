package com.fd.javaspringemail.services.mail;

import com.fd.javaspringemail.dto.EmailDTO;

public interface EmailService {
    void sendEmail(EmailDTO email);
}
