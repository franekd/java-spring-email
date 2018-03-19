package com.fd.javaspringemail.converters;

import com.fd.javaspringemail.dto.EmailDTO;
import com.fd.javaspringemail.models.Email;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EmailToEmailDTO implements Converter<Email, EmailDTO>{

    @Override
    public EmailDTO convert(Email email) {
        if(email == null)
            return null;

        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setTo(email.getReciver());
        emailDTO.setSubject(email.getSubject());
        emailDTO.setContent(email.getContent());

        return emailDTO;
    }
}
