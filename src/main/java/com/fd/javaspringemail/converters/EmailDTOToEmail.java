package com.fd.javaspringemail.converters;

import com.fd.javaspringemail.dto.EmailDTO;
import com.fd.javaspringemail.models.Email;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EmailDTOToEmail implements Converter<EmailDTO,Email>{

    @Override
    public Email convert(EmailDTO emailDTO) {

        if(emailDTO == null)
            return null;

        final Email email = new Email();

        email.setReciver(emailDTO.getTo());
        email.setSubject(emailDTO.getSubject());
        email.setContent(emailDTO.getContent());

        return email;
    }
}
