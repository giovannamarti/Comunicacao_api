package com.luizalebs.comunicacao_api.api;

import com.luizalebs.comunicacao_api.api.dto.ComunicacaoInDTO;
import com.luizalebs.comunicacao_api.api.dto.ComunicacaoOutDTO;
import com.luizalebs.comunicacao_api.business.service.ComunicacaoService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Comunicacao", description = "Agendamento da Comunicacao")
@RestController
@RequestMapping("/comunicacao")
public class ComunicacaoController {

    private final ComunicacaoService service;

    public ComunicacaoController(ComunicacaoService service) {
        this.service = service;
    }




    @PostMapping("/agendar")

    @Operation(summary= "Agendar Comunicacao", description = "Agenda Comunicacao")
    @ApiResponse(responseCode = "200", description = "Agendamento salvo com sucesso")
    @ApiResponse(responseCode = "400", description = "Agendamento já cadastrado")
    @ApiResponse(responseCode = "500", description = "Erro de servidor")
    public ResponseEntity<ComunicacaoOutDTO> agendar(@RequestBody ComunicacaoInDTO dto)  {
        return ResponseEntity.ok(service.agendarComunicacao(dto));
    }

    @GetMapping()
    @Operation(summary= "Buscar Status de agendamento", description = "Buscar Status")
    @ApiResponse(responseCode = "200", description = "Status encontrado")
    @ApiResponse(responseCode = "404", description = "Status não encontrado")
    @ApiResponse(responseCode = "500", description = "Erro de servidor")
    public ResponseEntity<ComunicacaoOutDTO> buscarStatus(@RequestParam String emailDestinatario) {
        return ResponseEntity.ok(service.buscarStatusComunicacao(emailDestinatario));
    }

    @PatchMapping("/cancelar")
    @Operation(summary= "Cancelar agendamento", description = "Cancelar Status")
    @ApiResponse(responseCode = "200", description = "Agendamento cancelado")
    @ApiResponse(responseCode = "404", description = "Agendamento não encontrado")
    @ApiResponse(responseCode = "500", description = "Erro de servidor")
    public ResponseEntity<ComunicacaoOutDTO> cancelarStatus(@RequestParam String emailDestinatario) {
        return ResponseEntity.ok(service.alterarStatusComunicacao(emailDestinatario));
    }

}
