package com.luizalebs.comunicacao_api.api.dto;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EmailRequestDTO {
    private String emailDestinatario;
    private String assunto;
    private String mensagem;



}
