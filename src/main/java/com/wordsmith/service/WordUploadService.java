package com.wordsmith.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.wordsmith.dao.WordUploadDao;
import com.wordsmith.domain.Word;

public interface WordUploadService {
	
	
	public void uploadWord(Word word);
	

}
