package com.wordsmith.dao;

import org.springframework.stereotype.Repository;

import com.wordsmith.domain.Word;

@Repository ("WordUploadDao")
public class WordUploadDaoImpl implements WordUploadDao {

	@Override
	public void uploadWord(Word word) {
		// -- Call the DB stuff to save
		System.out.println(" WordUploadDaoImpl word");
		//System.out.println("in WordUploadDaoImpl word getId"+word.getId());
	}

}
