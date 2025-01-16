package com.ottcontent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ottcontent.entity.OttContent;
import com.ottcontent.service.OttContentService;

@RestController
@RequestMapping("/api/content")
public class OttContentController {
	
	@Autowired
	private OttContentService ottContentService;

	// create content
	// url: http://localhost:9091/api/content
	// method: POST
	@PostMapping
	public OttContent createContent(@RequestBody OttContent ottContent) {
		OttContent createContent = ottContentService.createContent(ottContent);
		return createContent;
	}

	// get all content
	// url: http://localhost:9091/api/content		
	// method: GET
	@GetMapping
	public List<OttContent> getAllContent(){
		List<OttContent> findAllContent = ottContentService.findAllContent();
		return findAllContent;
	}
	
	// get content by id
	// url: http://localhost:9091/api/content/id	
	// method: GET
	@GetMapping("/{id}")
	public OttContent findByIdContent(@PathVariable long id) {
		OttContent findById = ottContentService.findById(id);
		return findById;
	}
	
	// update content by id
	// url: http://localhost:9091/api/content/id	
	// method: PUT
	@PutMapping("/{id}")
	public OttContent updateContent(@PathVariable long id, @RequestBody OttContent ottContent) {
		OttContent updateContentData = ottContentService.updateContent(id, ottContent);
		return updateContentData;
	}
	
	// delete content by id
	// url: http://localhost:9091/api/content/id	
	// method: DELETE
	@DeleteMapping("/{id}")
	public void deleteContent(@PathVariable long id) {
		ottContentService.deleteContent(id);
	}
}
