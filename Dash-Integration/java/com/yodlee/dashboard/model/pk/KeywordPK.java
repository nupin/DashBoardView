package com.yodlee.dashboard.model.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

import com.yodlee.dashboard.integration.model.Keyworddef;

public class KeywordPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private int bugId;

	private short keywordid;
	

	public int getBugId() {
		return bugId;
	}

	public void setBugId(int bugId) {
		this.bugId = bugId;
	}


	public short getKeywordid() {
		return keywordid;
	}

	public void setKeywordid(short keywordid) {
		this.keywordid = keywordid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bugId;
		result = prime * result + keywordid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeywordPK other = (KeywordPK) obj;
		if (bugId != other.bugId)
			return false;
		if (keywordid != other.keywordid)
			return false;
		return true;
	}

	
}
