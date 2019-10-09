package com.molly.service.impl;

import com.molly.converter.CollectionConverter;
import com.molly.dto.CollectionDTO;
import com.molly.repository.CollectionRepository;
import com.molly.service.ICollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CollectionService implements ICollectionService {
    @Autowired
    private CollectionConverter convertter;
    @Autowired
    private CollectionRepository collectionRepository;
    @Override
    public List<CollectionDTO> findAll(Pageable pageable) {
        return collectionRepository.findAll(pageable).stream().map(item -> convertter.ConvertToDTO(item))
                .collect(Collectors.toList());
    }
}
