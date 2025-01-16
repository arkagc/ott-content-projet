package com.ottcontent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ottcontent.entity.OttContent;

@Repository
public interface OttContentRepository extends JpaRepository<OttContent, Long>{

}
