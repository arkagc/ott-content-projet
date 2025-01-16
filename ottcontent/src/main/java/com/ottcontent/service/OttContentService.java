package com.ottcontent.service;

import java.util.List;

import com.ottcontent.entity.OttContent;

public interface OttContentService {
	
	OttContent createContent(OttContent ottContent); //create content
	List<OttContent> findAllContent(); // find all content
	OttContent findById(long id); // find content by id
	OttContent updateContent(Long id, OttContent ottContent); // update content by id
	void deleteContent(long id); // delete content by id
}
