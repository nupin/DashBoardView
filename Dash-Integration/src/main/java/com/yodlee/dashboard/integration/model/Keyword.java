package com.yodlee.dashboard.integration.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the keywords database table.
 * 
 */
@Entity
@Table(name="keywords")
@NamedQuery(name="Keyword.findAll", query="SELECT k FROM Keyword k")
public class Keyword implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="bug_id", nullable=false)
	private int bugId;

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

}