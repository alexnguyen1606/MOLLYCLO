package com.molly.converter;

import com.molly.dto.CollectionDTO;
import com.molly.entity.CollectionEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CollectionConverter {
    @Autowired
    private ModelMapper modelMapper;



    public CollectionDTO ConvertToDTO(CollectionEntity entity){
        CollectionDTO dto = modelMapper.map(entity,CollectionDTO.class);
        return dto;
    }
    public CollectionEntity ConvertToEntity(CollectionDTO dto){
        CollectionEntity entity = modelMapper.map(dto,CollectionEntity.class);
        return entity;
    }
}
