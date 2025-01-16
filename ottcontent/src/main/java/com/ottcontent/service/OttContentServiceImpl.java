package com.ottcontent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ottcontent.entity.OttContent;
import com.ottcontent.repository.OttContentRepository;

@Service
public class OttContentServiceImpl implements OttContentService{
	
	@Autowired
	private OttContentRepository ottContentRepo;
	
	// create content
	@Override
	public OttContent createContent(OttContent ottContent) {
		return ottContentRepo.save(ottContent);
	}

	// find all content
	@Override
	public List<OttContent> findAllContent() {
		return ottContentRepo.findAll();
	}

	// find content by id
	@Override
	public OttContent findById(long id) {
		Optional<OttContent> cId = ottContentRepo.findById(id);
		return cId.get();
	}

	// delete content by id
	@Override
	public void deleteContent(long id) {
		ottContentRepo.deleteById(id);
	}

	// update content by id
	@Override
	public OttContent updateContent(Long id, OttContent ottContent) {
		Optional<OttContent> existContent = ottContentRepo.findById(id);
		if(existContent.isPresent()) {
			OttContent updateContentData = existContent.get();
			updateContentData.setContentName(ottContent.getContentName());
			updateContentData.setContentRunTime(ottContent.getContentRunTime());
			return ottContentRepo.save(updateContentData);
		}
		return null;
	}

}
