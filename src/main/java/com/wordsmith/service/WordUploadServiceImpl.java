package com.wordsmith.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordsmith.dao.WordUploadDao;
import com.wordsmith.domain.Word;



@Service("WordUploadService")
public class WordUploadServiceImpl  implements WordUploadService {
	

	@Autowired 
	WordUploadDao wordupldDao;

	@Override
	public void uploadWord(Word word) {
		// TODO Auto-generated method stub
		wordupldDao.uploadWord(word);
		
	}
	

}
