package com.molly.converter;

import com.molly.dto.ProductDTO;
import com.molly.dto.UserDTO;
import com.molly.entity.ProductEntity;
import com.molly.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    @Autowired
    private ModelMapper modelMapper;
    public UserDTO convertToDTO(UserEntity entity){
        return modelMapper.map(entity,UserDTO.class);
    }
    public UserEntity covertToEntity(UserDTO dto){
        return modelMapper.map(dto,UserEntity.class);
    }
}
