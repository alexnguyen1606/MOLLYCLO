package com.molly.repository;

import com.molly.entity.CollectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionRepository  extends JpaRepository<CollectionEntity,Integer> {
}
