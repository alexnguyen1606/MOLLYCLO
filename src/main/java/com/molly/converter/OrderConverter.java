package com.molly.converter;

import com.molly.dto.OrderDTO;
import com.molly.entity.OrderEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter {
    @Autowired
    private ModelMapper modelMapper;
    public OrderDTO convertToDTO(OrderEntity entity){
        return modelMapper.map(entity,OrderDTO.class);
    }
    public OrderEntity convertToEntity(OrderDTO dto){
        return modelMapper.map(dto,OrderEntity.class);
    }
}
