package com.molly.api;

import com.molly.dto.CollectionDTO;
import com.molly.service.impl.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/blogs/news")
public class NewsAPI {
    @Autowired
    private CollectionService collectionService;

    @GetMapping
    public ResponseEntity<List<CollectionDTO>> findAllNews(){
        int page =1;
        int limt = 10;
        Pageable pageable = PageRequest.of(page,limt);
        return new ResponseEntity<>(collectionService.findAll(pageable), HttpStatus.OK);
    }
}
