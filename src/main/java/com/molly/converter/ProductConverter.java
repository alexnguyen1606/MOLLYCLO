package com.molly.converter;

import com.molly.dto.ProductDTO;
import com.molly.entity.ProductEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    @Autowired
    private ModelMapper modelMapper;
    public ProductDTO convertToDTO(ProductEntity entity){
        return modelMapper.map(entity,ProductDTO.class);
    }
    public ProductEntity convertToEntity(ProductDTO dto){
        return modelMapper.map(dto,ProductEntity.class);
    }
}
