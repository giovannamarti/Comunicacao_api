package com.luizalebs.comunicacao_api.business.service;



import com.luizalebs.comunicacao_api.api.dto.EmailRequestDTO;
import com.luizalebs.comunicacao_api.infraestructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient emailClient;


    public void enviarEmail(EmailRequestDTO dto) {
        emailClient.enviarEmail(dto);
    }

}