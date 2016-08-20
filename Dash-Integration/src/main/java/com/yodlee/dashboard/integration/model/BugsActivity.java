package com.yodlee.dashboard.integration.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the bugs_activity database table.
 * 
 */
@Entity
@Table(name="bugs_activity")
@NamedQuery(name="BugsActivity.findAll", query="SELECT b FROM BugsActivity b")
public class BugsActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String added;

	@Column(name="attach_id")
	private int attachId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="bug_when", nullable=false)
	private Date bugWhen;

	@Column(name="comment_id")
	private int commentId;

	@Column(nullable=false)
	private int fieldid;

	@Column(length=255)
	private String removed;

//	@Column(name="who", nullable=false , insertable = false, updatable = false)
//	private int who;
//	
//	@Column(name="bug_id", nullable=false , insertable = false, updatable = false)
//	private int bugId;
	
//	public int getWho() {
//		return who;
//	}
//
//	public void setWho(int who) {
//		this.who = who;
//	}
//
//	public int getBugId() {
//		return bugId;
//	}
//
//	public void setBugId(int bugId) {
//		this.bugId = bugId;
//	}

	//bi-directional many-to-one association to Bug
	@ManyToOne
	@JoinColumn(name="bug_id", nullable=false)
	private Bug bug;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="who", nullable=false)
	private Profile profile;

	public BugsActivity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdded() {
		return this.added;
	}

	public void setAdded(String added) {
		this.added = added;
	}

	public int getAttachId() {
		return this.attachId;
	}

	public void setAttachId(int attachId) {
		this.attachId = attachId;
	}

	public Date getBugWhen() {
		return this.bugWhen;
	}

	public void setBugWhen(Date bugWhen) {
		this.bugWhen = bugWhen;
	}

	public int getCommentId() {
		return this.commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getFieldid() {
		return this.fieldid;
	}

	public void setFieldid(int fieldid) {
		this.fieldid = fieldid;
	}

	public String getRemoved() {
		return this.removed;
	}

	public void setRemoved(String removed) {
		this.removed = removed;
	}

	public Bug getBug() {
		return this.bug;
	}

	public void setBug(Bug bug) {
		this.bug = bug;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}