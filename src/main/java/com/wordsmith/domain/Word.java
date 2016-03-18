package com.wordsmith.domain;

import java.io.Serializable;

public class Word implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String actualWord;
	private String wordUploadedBy;
	public String getActualWord() {
		return actualWord;
	}

	public String getWordUploadedBy() {
		return wordUploadedBy;
	}

	public void setWordUploadedBy(String wordUploadedBy) {
		this.wordUploadedBy = wordUploadedBy;
	}

	public void setActualWord(String actualWord) {
		this.actualWord = actualWord;
	}

	public Word() {}

    public Word(String id) {
        this.id = id;
        
    }
	/*private String actualWord;
    private String wordInsertedByPronouncer;
    private String levelOfDifficulty;
	private String isLocked;
    private String isApproved;*/
    
   /* String getIsLocked() {
		return isLocked;
	}
	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}
	public String getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}
*/
    
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/*public String getActualWord() {
		return actualWord;
	}
	public void setActualWord(String actualWord) {
		this.actualWord = actualWord;
	}
	public String getWordInsertedByPronouncer() {
		return wordInsertedByPronouncer;
	}
	public void setWordInsertedByPronouncer(String wordInsertedByPronouncer) {
		this.wordInsertedByPronouncer = wordInsertedByPronouncer;
	}
	public Word() {}

    public Word(String id, String actualWord, String wordInsertedByPronouncer,
    		String levelOfDifficulty, String isLocked, String isApproved) {
        this.id = id;
        this.actualWord = actualWord;
        this.wordInsertedByPronouncer = wordInsertedByPronouncer;
        this.levelOfDifficulty=levelOfDifficulty;
        this.isLocked= isLocked;
        this.isApproved = isApproved;
    }
	@Override
    public String toString() {
        return String.format(
                "Customer[id=%s, actualWord='%s', wordInsertedByPronouncer='%s', "
                + "levelOfDifficulty='%s',isLocked='%s',isApproved='%s',]",
                id, actualWord, wordInsertedByPronouncer, levelOfDifficulty, isLocked, isApproved);
    }
	
*/}
