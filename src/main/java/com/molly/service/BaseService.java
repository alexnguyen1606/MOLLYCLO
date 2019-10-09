package com.molly.service;

import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll(Pageable pageable);
}
