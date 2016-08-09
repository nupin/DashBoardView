package com.yodlee.dashboard.model.pk;

import java.io.Serializable;

import com.yodlee.dashboard.integration.model.Keyworddef;

public class KeywordPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private int bugId;

	private Keyworddef keyworddef;

	public int getBugId() {
		return bugId;
	}

	public void setBugId(int bugId) {
		this.bugId = bugId;
	}

	public Keyworddef getKeyworddef() {
		return keyworddef;
	}

	public void setKeyworddef(Keyworddef keyworddef) {
		this.keyworddef = keyworddef;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bugId;
		result = prime * result
				+ ((keyworddef == null) ? 0 : keyworddef.hashCode());
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
		if (keyworddef == null) {
			if (other.keyworddef != null)
				return false;
		} else if (!keyworddef.equals(other.keyworddef))
			return false;
		return true;
	}

	
}
