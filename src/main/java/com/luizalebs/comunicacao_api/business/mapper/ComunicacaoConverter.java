package com.luizalebs.comunicacao_api.business.mapper;

import com.luizalebs.comunicacao_api.api.dto.ComunicacaoInDTO;
import com.luizalebs.comunicacao_api.api.dto.ComunicacaoOutDTO;
import com.luizalebs.comunicacao_api.infraestructure.entities.ComunicacaoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;


//@Component

@Mapper(componentModel = "spring")
public interface ComunicacaoConverter {

@Mapping(source="dataHoraEnvio",target = "dataHoraEnvio" )

    ComunicacaoEntity paraEntity(ComunicacaoInDTO dto);

    ComunicacaoOutDTO paraDTO(ComunicacaoEntity entity);


}
