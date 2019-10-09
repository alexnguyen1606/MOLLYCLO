package com.molly.converter;

import com.molly.dto.RoleDTO;
import com.molly.entity.RoleEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter {
    @Autowired
    private ModelMapper modelMapper;
    public RoleDTO convertToDTO(RoleEntity entity){
        return modelMapper.map(entity,RoleDTO.class);
    }
    public RoleEntity convertToEntity(RoleDTO dto){
        return modelMapper.map(dto,RoleEntity.class);
    }
}
