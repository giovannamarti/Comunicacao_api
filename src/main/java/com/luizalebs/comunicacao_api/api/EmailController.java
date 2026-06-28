package com.luizalebs.comunicacao_api.api;

import com.luizalebs.comunicacao_api.api.dto.EmailRequestDTO;
import com.luizalebs.comunicacao_api.business.service.EmailService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/email")
    public class EmailController {

        private final EmailService emailService;

        public EmailController(EmailService emailService) {
            this.emailService = emailService;
        }

        @PostMapping("/enviar")
        public ResponseEntity<String> enviarEmail(@RequestBody EmailRequestDTO dto) {


            System.out.println("DTO recebido: " + dto);

            emailService.enviarEmail(dto);

            return ResponseEntity.ok("E-mail enviado com sucesso");
        }
    }
