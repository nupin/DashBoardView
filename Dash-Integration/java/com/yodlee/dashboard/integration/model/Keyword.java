package com.yodlee.dashboard.integration.model;

import javax.persistence.*;

import com.yodlee.dashboard.model.pk.KeywordPK;


/**
 * The persistent class for the keywords database table.
 * 
 */
@Entity
@Table(name="keywords")
@IdClass(KeywordPK.class)
@NamedQuery(name="Keyword.findAll", query="SELECT k FROM Keyword k")
public class Keyword  {
	
	@Id
	@Column(name="bug_id", nullable=false)
	private int bugId;

	@Id
	@Column(name="keywordid", nullable=false)
	private short keywordid;
	
	//bi-directional many-to-one association to Keyworddef
	@ManyToOne
	@JoinColumn(name="keywordid", nullable=false)
	private Keyworddef keyworddef;

	public Keyword() {
	}

	public int getBugId() {
		return this.bugId;
	}

	public void setBugId(int bugId) {
		this.bugId = bugId;
	}

	public Keyworddef getKeyworddef() {
		return this.keyworddef;
	}

	public void setKeyworddef(Keyworddef keyworddef) {
		this.keyworddef = keyworddef;
	}

	public short getKeywordid() {
		return keywordid;
	}

	public void setKeywordid(short keywordid) {
		this.keywordid = keywordid;
	}

}