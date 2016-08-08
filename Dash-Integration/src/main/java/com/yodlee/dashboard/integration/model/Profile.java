package com.yodlee.dashboard.integration.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the profiles database table.
 * 
 */
@Entity
@Table(name="profiles")
@NamedQuery(name="Profile.findAll", query="SELECT p FROM Profile p")
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int userid;

	@Column(length=128)
	private String cryptpassword;

	@Column(name="disable_mail", nullable=false)
	private byte disableMail;

	@Lob
	@Column(nullable=false)
	private String disabledtext;

	@Column(name="extern_id", length=64)
	private String externId;

	@Column(name="is_enabled", nullable=false)
	private byte isEnabled;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_seen_date")
	private Date lastSeenDate;

	@Column(name="login_name", nullable=false, length=255)
	private String loginName;

	@Column(nullable=false)
	private byte mybugslink;

	@Column(nullable=false, length=255)
	private String realname;

	//bi-directional many-to-one association to Bug
	@OneToMany(mappedBy="profile1")
	private List<Bug> bugs1;

	//bi-directional many-to-one association to Bug
	@OneToMany(mappedBy="profile2")
	private List<Bug> bugs2;

	//bi-directional many-to-one association to Bug
	@OneToMany(mappedBy="profile3")
	private List<Bug> bugs3;

	//bi-directional many-to-one association to BugsActivity
	@OneToMany(mappedBy="profile")
	private List<BugsActivity> bugsActivities;

	public Profile() {
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getCryptpassword() {
		return this.cryptpassword;
	}

	public void setCryptpassword(String cryptpassword) {
		this.cryptpassword = cryptpassword;
	}

	public byte getDisableMail() {
		return this.disableMail;
	}

	public void setDisableMail(byte disableMail) {
		this.disableMail = disableMail;
	}

	public String getDisabledtext() {
		return this.disabledtext;
	}

	public void setDisabledtext(String disabledtext) {
		this.disabledtext = disabledtext;
	}

	public String getExternId() {
		return this.externId;
	}

	public void setExternId(String externId) {
		this.externId = externId;
	}

	public byte getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(byte isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Date getLastSeenDate() {
		return this.lastSeenDate;
	}

	public void setLastSeenDate(Date lastSeenDate) {
		this.lastSeenDate = lastSeenDate;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public byte getMybugslink() {
		return this.mybugslink;
	}

	public void setMybugslink(byte mybugslink) {
		this.mybugslink = mybugslink;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public List<Bug> getBugs1() {
		return this.bugs1;
	}

	public void setBugs1(List<Bug> bugs1) {
		this.bugs1 = bugs1;
	}

	public Bug addBugs1(Bug bugs1) {
		getBugs1().add(bugs1);
		bugs1.setProfile1(this);

		return bugs1;
	}

	public Bug removeBugs1(Bug bugs1) {
		getBugs1().remove(bugs1);
		bugs1.setProfile1(null);

		return bugs1;
	}

	public List<Bug> getBugs2() {
		return this.bugs2;
	}

	public void setBugs2(List<Bug> bugs2) {
		this.bugs2 = bugs2;
	}

	public Bug addBugs2(Bug bugs2) {
		getBugs2().add(bugs2);
		bugs2.setProfile2(this);

		return bugs2;
	}

	public Bug removeBugs2(Bug bugs2) {
		getBugs2().remove(bugs2);
		bugs2.setProfile2(null);

		return bugs2;
	}

	public List<Bug> getBugs3() {
		return this.bugs3;
	}

	public void setBugs3(List<Bug> bugs3) {
		this.bugs3 = bugs3;
	}

	public Bug addBugs3(Bug bugs3) {
		getBugs3().add(bugs3);
		bugs3.setProfile3(this);

		return bugs3;
	}

	public Bug removeBugs3(Bug bugs3) {
		getBugs3().remove(bugs3);
		bugs3.setProfile3(null);

		return bugs3;
	}

	public List<BugsActivity> getBugsActivities() {
		return this.bugsActivities;
	}

	public void setBugsActivities(List<BugsActivity> bugsActivities) {
		this.bugsActivities = bugsActivities;
	}

	public BugsActivity addBugsActivity(BugsActivity bugsActivity) {
		getBugsActivities().add(bugsActivity);
		bugsActivity.setProfile(this);

		return bugsActivity;
	}

	public BugsActivity removeBugsActivity(BugsActivity bugsActivity) {
		getBugsActivities().remove(bugsActivity);
		bugsActivity.setProfile(null);

		return bugsActivity;
	}

}