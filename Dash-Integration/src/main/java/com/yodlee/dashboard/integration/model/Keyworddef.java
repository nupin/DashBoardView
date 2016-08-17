package com.yodlee.dashboard.integration.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the keyworddefs database table.
 * 
 */
@Entity
@Table(name="keyworddefs")
@NamedQuery(name="Keyworddef.findAll", query="SELECT k FROM Keyworddef k")
public class Keyworddef implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", unique=true, nullable=false)
	private short keyworddefsId;

	@Lob
	@Column(nullable=false)
	private String description;

	@Column(nullable=false, length=64)
	private String name;

	//bi-directional many-to-many association to Bug
	@ManyToMany
	@JoinTable(
		name="keywords"
		, joinColumns={
			@JoinColumn(name="keywordid", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="bug_id", nullable=false)
			}
		)
	private List<Bug> bugs;

	//bi-directional many-to-one association to Keyword
	@OneToMany(mappedBy="keyworddef")
	private List<Keyword> keywords;

	public Keyworddef() {
	}

	public short getkeyworddefsId() {
		return this.keyworddefsId;
	}

	public void setkeyworddefsId(short keyworddefsId) {
		this.keyworddefsId = keyworddefsId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Bug> getBugs() {
		return this.bugs;
	}

	public void setBugs(List<Bug> bugs) {
		this.bugs = bugs;
	}

	public List<Keyword> getKeywords() {
		return this.keywords;
	}

	public void setKeywords(List<Keyword> keywords) {
		this.keywords = keywords;
	}

	public Keyword addKeyword(Keyword keyword) {
		getKeywords().add(keyword);
		keyword.setKeyworddef(this);

		return keyword;
	}

	public Keyword removeKeyword(Keyword keyword) {
		getKeywords().remove(keyword);
		keyword.setKeyworddef(null);

		return keyword;
	}

}