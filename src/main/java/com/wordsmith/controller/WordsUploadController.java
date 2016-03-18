package com.wordsmith.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordsmith.domain.Word;
import com.wordsmith.service.WordUploadService;

@Controller
public class WordsUploadController {
	
	
	@Autowired 
	WordUploadService wordUploadService;

	
	@RequestMapping(value="/wordUpload", method = RequestMethod.GET)
	public @ResponseBody String uploadWord(@RequestParam("id") String id,@RequestParam("actualWord") String actualWord,
			@RequestParam("wordUploadedBy") String wordUploadedBy  ){
		Word word =new Word();
		word.setId(id);
		word.setActualWord(actualWord);
		word.setWordUploadedBy(wordUploadedBy);
		System.out.println("to test id"+id);
		System.out.println("to test actualWord"+actualWord);
		System.out.println("to test wordUploadedBy"+wordUploadedBy);
		wordUploadService.uploadWord(word);
	
	return "Word Uploaded !!";
	
	
	
	
	}
	
	
	   
	
	
	public void storeWords(){
		
		
	}

}
