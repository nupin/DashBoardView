package com.yodlee.dashboard.integration.model;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the bugs database table.
 * 
 */
@Entity
@Table(name="bugs")
@NamedQuery(name="Bug.findAll", query="SELECT b FROM Bug b")
public class Bug implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bug_id", unique=true, nullable=false)
	private int bugId;

	@Column(length=20)
	private String alias;

	@Lob
	@Column(name="bug_file_loc", nullable=false)
	private String bugFileLoc;

	@Column(name="bug_severity", nullable=false, length=64)
	private String bugSeverity;

	@Column(name="bug_status", nullable=false, length=64)
	private String bugStatus;

	@Column(name="cclist_accessible", nullable=false)
	private byte cclistAccessible;

	@Column(name="cf_5x_changelist", nullable=false, length=64)
	private String cf5xChangelist;

	@Column(name="cf_811_changelist", nullable=false, length=255)
	private String cf811Changelist;

	@Column(name="cf_89_changelist", nullable=false, length=255)
	private String cf89Changelist;

	@Column(name="cf_90_changelist", nullable=false, length=255)
	private String cf90Changelist;

	@Column(name="cf_901_changelist", nullable=false, length=255)
	private String cf901Changelist;

	@Column(name="cf_902_changelist", nullable=false, length=255)
	private String cf902Changelist;

	@Column(name="cf_903_changelist", nullable=false, length=255)
	private String cf903Changelist;

	@Column(name="cf_91_changelist", nullable=false, length=255)
	private String cf91Changelist;

	@Column(name="cf_91_changelist_1", nullable=false, length=255)
	private String cf91Changelist1;

	@Column(name="cf_92_changelist", nullable=false, length=255)
	private String cf92Changelist;

	@Column(name="cf_93_changelist", nullable=false, length=255)
	private String cf93Changelist;

	@Column(name="cf_94_changelist", nullable=false, length=255)
	private String cf94Changelist;

	@Column(name="cf_95_changelist", nullable=false, length=255)
	private String cf95Changelist;

	@Column(name="cf_96_changelist", nullable=false, length=255)
	private String cf96Changelist;

	@Column(name="cf_97_changelist", nullable=false, length=255)
	private String cf97Changelist;

	@Column(name="cf_agent_status", length=255)
	private String cfAgentStatus;

	@Column(name="cf_agent_type", length=255)
	private String cfAgentType;

	@Column(name="cf_agent_version", nullable=false, length=255)
	private String cfAgentVersion;

	@Column(name="cf_agents", nullable=false, length=255)
	private String cfAgents;

	@Column(name="cf_analyst", nullable=false, length=255)
	private String cfAnalyst;

	@Column(name="cf_backend_frontend", nullable=false, length=64)
	private String cfBackendFrontend;

	@Column(name="cf_branch_found", nullable=false, length=64)
	private String cfBranchFound;

	@Column(name="cf_bug_complexity", nullable=false, length=255)
	private String cfBugComplexity;

	@Column(name="cf_bug_complexity1", nullable=false, length=64)
	private String cfBugComplexity1;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cf_bug_fixed_on")
	private Date cfBugFixedOn;

	@Column(name="cf_bugtype", nullable=false, length=64)
	private String cfBugtype;

	@Column(name="cf_build_components", nullable=false, length=255)
	private String cfBuildComponents;

	@Column(name="cf_build_fixed", nullable=false, length=64)
	private String cfBuildFixed;

	@Column(name="cf_build_fixed_new", nullable=false, length=255)
	private String cfBuildFixedNew;

	@Column(name="cf_build_found", nullable=false, length=64)
	private String cfBuildFound;

	@Column(name="cf_build_found_new", nullable=false, length=255)
	private String cfBuildFoundNew;

	@Column(name="cf_business", nullable=false, length=64)
	private String cfBusiness;

	@Column(name="cf_category", nullable=false, length=64)
	private String cfCategory;

	@Column(name="cf_cf_902_changelist", nullable=false, length=255)
	private String cfCf902Changelist;

	@Column(name="cf_changelist_no", nullable=false, length=255)
	private String cfChangelistNo;

	@Column(name="cf_choose_from", nullable=false, length=64)
	private String cfChooseFrom;

	@Column(name="cf_cobrand_bug_id", nullable=false, length=255)
	private String cfCobrandBugId;

	@Column(name="cf_cobrand_changelist", nullable=false, length=255)
	private String cfCobrandChangelist;

	@Column(name="cf_code_review_comments", nullable=false, length=255)
	private String cfCodeReviewComments;

	@Lob
	@Column(name="cf_code_review_comments_gen", nullable=false)
	private String cfCodeReviewCommentsGen;

	@Column(name="cf_code_reviewer", nullable=false, length=255)
	private String cfCodeReviewer;

	@Column(name="cf_comments_release_notes", nullable=false, length=255)
	private String cfCommentsReleaseNotes;

	@Column(name="cf_configuration_changes", nullable=false, length=64)
	private String cfConfigurationChanges;

	@Column(name="cf_customer", nullable=false, length=64)
	private String cfCustomer;

	@Column(name="cf_customer_note", nullable=false, length=255)
	private String cfCustomerNote;

	@Column(name="cf_department", nullable=false, length=64)
	private String cfDepartment;

	@Column(name="cf_documentation_changes", nullable=false, length=64)
	private String cfDocumentationChanges;

	@Column(name="cf_environment", nullable=false, length=64)
	private String cfEnvironment;

	@Column(name="cf_err_postfix_no", nullable=false, length=255)
	private String cfErrPostfixNo;

	@Column(name="cf_err_prefix_no", nullable=false, length=255)
	private String cfErrPrefixNo;

	@Column(name="cf_errorcode", nullable=false, length=255)
	private String cfErrorcode;

	@Column(name="cf_feature", nullable=false, length=255)
	private String cfFeature;

	@Column(name="cf_fidelity_asp", nullable=false, length=255)
	private String cfFidelityAsp;

	@Column(name="cf_fixed_release", nullable=false, length=64)
	private String cfFixedRelease;

	@Column(name="cf_idle_time", nullable=false, length=255)
	private String cfIdleTime;

	@Column(name="cf_impact", nullable=false, length=255)
	private String cfImpact;

	@Column(name="cf_is_automation", nullable=false, length=64)
	private String cfIsAutomation;

	@Column(name="cf_is_regression", nullable=false, length=64)
	private String cfIsRegression;

	@Column(name="cf_mem_site_acc_id", nullable=false, length=255)
	private String cfMemSiteAccId;

	@Column(name="cf_memitem", nullable=false, length=255)
	private String cfMemitem;

	@Column(name="cf_mentor", nullable=false, length=255)
	private String cfMentor;

	@Column(name="cf_oldbugzilla_id", nullable=false, length=255)
	private String cfOldbugzillaId;

	@Column(name="cf_p4_label", nullable=false, length=255)
	private String cfP4Label;

	@Column(name="cf_patch_build_fixed", nullable=false, length=255)
	private String cfPatchBuildFixed;

	@Column(name="cf_patches_build_fixed", nullable=false, length=64)
	private String cfPatchesBuildFixed;

	@Column(name="cf_plan", nullable=false, length=64)
	private String cfPlan;

	@Column(name="cf_portfolio", nullable=false, length=64)
	private String cfPortfolio;

	@Column(name="cf_public", nullable=false, length=64)
	private String cfPublic;

	@Column(name="cf_qa_browser_details", nullable=false, length=255)
	private String cfQaBrowserDetails;

	@Column(name="cf_qe_rca", nullable=false, length=255)
	private String cfQeRca;

	@Column(name="cf_rca", nullable=false, length=64)
	private String cfRca;

	@Column(name="cf_rca_dev", nullable=false, length=64)
	private String cfRcaDev;

	@Column(name="cf_rca_qe", nullable=false, length=64)
	private String cfRcaQe;

	@Column(name="cf_rca_reopened", nullable=false, length=64)
	private String cfRcaReopened;

	@Column(name="cf_rca_reopened_dev", nullable=false, length=64)
	private String cfRcaReopenedDev;

	@Column(name="cf_rca_reopened_qe", nullable=false, length=64)
	private String cfRcaReopenedQe;

	@Column(name="cf_rca_wid", nullable=false, length=64)
	private String cfRcaWid;

	@Column(name="cf_readme", nullable=false, length=255)
	private String cfReadme;

	@Column(name="cf_recomented_action", nullable=false, length=255)
	private String cfRecomentedAction;

	@Column(name="cf_release_found", nullable=false, length=64)
	private String cfReleaseFound;

	@Column(name="cf_release_notes", nullable=false, length=64)
	private String cfReleaseNotes;

	@Column(name="cf_remedy_id", nullable=false, length=255)
	private String cfRemedyId;

	@Column(name="cf_resolution1", nullable=false, length=64)
	private String cfResolution1;

	@Column(name="cf_resolution2", nullable=false, length=64)
	private String cfResolution2;

	@Column(name="cf_resolution3", nullable=false, length=64)
	private String cfResolution3;

	@Column(name="cf_reviewer", nullable=false, length=255)
	private String cfReviewer;

	@Column(name="cf_root_cause", length=255)
	private String cfRootCause;

	@Column(name="cf_service_request_id", nullable=false, length=255)
	private String cfServiceRequestId;

	@Column(name="cf_sharepoint_link", nullable=false, length=255)
	private String cfSharepointLink;

	@Column(name="cf_site_id", nullable=false, length=255)
	private String cfSiteId;

	@Column(name="cf_sla_type", nullable=false, length=64)
	private String cfSlaType;

	@Column(name="cf_story_id", nullable=false, length=255)
	private String cfStoryId;

	@Column(name="cf_sub_brand", nullable=false, length=255)
	private String cfSubBrand;

	@Column(name="cf_suminfo", nullable=false, length=255)
	private String cfSuminfo;

	@Column(name="cf_tea__disposition", nullable=false, length=64)
	private String cfTea_Disposition;

	@Column(name="cf_tea_cause", nullable=false, length=64)
	private String cfTeaCause;

	@Column(name="cf_tea_disposition", length=255)
	private String cfTeaDisposition;

	@Column(name="cf_tea_evaluation", nullable=false, length=64)
	private String cfTeaEvaluation;

	@Column(name="cf_tea_manager", length=255)
	private String cfTeaManager;

	@Column(name="cf_test_case_id", nullable=false, length=255)
	private String cfTestCaseId;

	@Column(name="cf_triage_indicator", nullable=false, length=255)
	private String cfTriageIndicator;

	@Column(name="cf_triage_indicator1", nullable=false, length=64)
	private String cfTriageIndicator1;

	@Column(name="cf_username", nullable=false, length=255)
	private String cfUsername;

	@Column(name="cf_workflow", nullable=false, length=64)
	private String cfWorkflow;

	@Column(name="cf_workflow_status", nullable=false, length=64)
	private String cfWorkflowStatus;

	@Column(name="component_id", nullable=false)
	private short componentId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_ts")
	private Date creationTs;

	@Temporal(TemporalType.TIMESTAMP)
	private Date deadline;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="delta_ts", nullable=false)
	private Date deltaTs;

	@Column(name="estimated_time", nullable=false, precision=10, scale=2)
	private BigDecimal estimatedTime;

	@Column(nullable=false)
	private byte everconfirmed;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastdiffed;

	@Column(name="op_sys", nullable=false, length=64)
	private String opSys;

	@Column(nullable=false, length=64)
	private String priority;

	@Column(name="product_id", nullable=false)
	private short productId;

	@Column(name="remaining_time", nullable=false, precision=10, scale=2)
	private BigDecimal remainingTime;

	@Column(name="rep_platform", nullable=false, length=64)
	private String repPlatform;

	@Column(name="reporter_accessible", nullable=false)
	private byte reporterAccessible;

	@Column(nullable=false, length=64)
	private String resolution;

	@Column(name="short_desc", nullable=false, length=255)
	private String shortDesc;

	@Lob
	@Column(name="status_whiteboard", nullable=false)
	private String statusWhiteboard;

	@Column(name="target_milestone", nullable=false, length=20)
	private String targetMilestone;

	@Column(nullable=false, length=64)
	private String version;

	@Column(nullable=false)
	private int votes;

	//bi-directional many-to-many association to Keyworddef
	@ManyToMany(mappedBy="bugs")
	private List<Keyworddef> keyworddefs;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="assigned_to", nullable=false)
	private Profile profile1;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="qa_contact")
	private Profile profile2;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="reporter", nullable=false)
	private Profile profile3;

	//bi-directional many-to-one association to BugsActivity
	@OneToMany(mappedBy="bug")
	private List<BugsActivity> bugsActivities;

	public Bug() {
	}

	public int getBugId() {
		return this.bugId;
	}

	public void setBugId(int bugId) {
		this.bugId = bugId;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getBugFileLoc() {
		return this.bugFileLoc;
	}

	public void setBugFileLoc(String bugFileLoc) {
		this.bugFileLoc = bugFileLoc;
	}

	public String getBugSeverity() {
		return this.bugSeverity;
	}

	public void setBugSeverity(String bugSeverity) {
		this.bugSeverity = bugSeverity;
	}

	public String getBugStatus() {
		return this.bugStatus;
	}

	public void setBugStatus(String bugStatus) {
		this.bugStatus = bugStatus;
	}

	public byte getCclistAccessible() {
		return this.cclistAccessible;
	}

	public void setCclistAccessible(byte cclistAccessible) {
		this.cclistAccessible = cclistAccessible;
	}

	public String getCf5xChangelist() {
		return this.cf5xChangelist;
	}

	public void setCf5xChangelist(String cf5xChangelist) {
		this.cf5xChangelist = cf5xChangelist;
	}

	public String getCf811Changelist() {
		return this.cf811Changelist;
	}

	public void setCf811Changelist(String cf811Changelist) {
		this.cf811Changelist = cf811Changelist;
	}

	public String getCf89Changelist() {
		return this.cf89Changelist;
	}

	public void setCf89Changelist(String cf89Changelist) {
		this.cf89Changelist = cf89Changelist;
	}

	public String getCf90Changelist() {
		return this.cf90Changelist;
	}

	public void setCf90Changelist(String cf90Changelist) {
		this.cf90Changelist = cf90Changelist;
	}

	public String getCf901Changelist() {
		return this.cf901Changelist;
	}

	public void setCf901Changelist(String cf901Changelist) {
		this.cf901Changelist = cf901Changelist;
	}

	public String getCf902Changelist() {
		return this.cf902Changelist;
	}

	public void setCf902Changelist(String cf902Changelist) {
		this.cf902Changelist = cf902Changelist;
	}

	public String getCf903Changelist() {
		return this.cf903Changelist;
	}

	public void setCf903Changelist(String cf903Changelist) {
		this.cf903Changelist = cf903Changelist;
	}

	public String getCf91Changelist() {
		return this.cf91Changelist;
	}

	public void setCf91Changelist(String cf91Changelist) {
		this.cf91Changelist = cf91Changelist;
	}

	public String getCf91Changelist1() {
		return this.cf91Changelist1;
	}

	public void setCf91Changelist1(String cf91Changelist1) {
		this.cf91Changelist1 = cf91Changelist1;
	}

	public String getCf92Changelist() {
		return this.cf92Changelist;
	}

	public void setCf92Changelist(String cf92Changelist) {
		this.cf92Changelist = cf92Changelist;
	}

	public String getCf93Changelist() {
		return this.cf93Changelist;
	}

	public void setCf93Changelist(String cf93Changelist) {
		this.cf93Changelist = cf93Changelist;
	}

	public String getCf94Changelist() {
		return this.cf94Changelist;
	}

	public void setCf94Changelist(String cf94Changelist) {
		this.cf94Changelist = cf94Changelist;
	}

	public String getCf95Changelist() {
		return this.cf95Changelist;
	}

	public void setCf95Changelist(String cf95Changelist) {
		this.cf95Changelist = cf95Changelist;
	}

	public String getCf96Changelist() {
		return this.cf96Changelist;
	}

	public void setCf96Changelist(String cf96Changelist) {
		this.cf96Changelist = cf96Changelist;
	}

	public String getCf97Changelist() {
		return this.cf97Changelist;
	}

	public void setCf97Changelist(String cf97Changelist) {
		this.cf97Changelist = cf97Changelist;
	}

	public String getCfAgentStatus() {
		return this.cfAgentStatus;
	}

	public void setCfAgentStatus(String cfAgentStatus) {
		this.cfAgentStatus = cfAgentStatus;
	}

	public String getCfAgentType() {
		return this.cfAgentType;
	}

	public void setCfAgentType(String cfAgentType) {
		this.cfAgentType = cfAgentType;
	}

	public String getCfAgentVersion() {
		return this.cfAgentVersion;
	}

	public void setCfAgentVersion(String cfAgentVersion) {
		this.cfAgentVersion = cfAgentVersion;
	}

	public String getCfAgents() {
		return this.cfAgents;
	}

	public void setCfAgents(String cfAgents) {
		this.cfAgents = cfAgents;
	}

	public String getCfAnalyst() {
		return this.cfAnalyst;
	}

	public void setCfAnalyst(String cfAnalyst) {
		this.cfAnalyst = cfAnalyst;
	}

	public String getCfBackendFrontend() {
		return this.cfBackendFrontend;
	}

	public void setCfBackendFrontend(String cfBackendFrontend) {
		this.cfBackendFrontend = cfBackendFrontend;
	}

	public String getCfBranchFound() {
		return this.cfBranchFound;
	}

	public void setCfBranchFound(String cfBranchFound) {
		this.cfBranchFound = cfBranchFound;
	}

	public String getCfBugComplexity() {
		return this.cfBugComplexity;
	}

	public void setCfBugComplexity(String cfBugComplexity) {
		this.cfBugComplexity = cfBugComplexity;
	}

	public String getCfBugComplexity1() {
		return this.cfBugComplexity1;
	}

	public void setCfBugComplexity1(String cfBugComplexity1) {
		this.cfBugComplexity1 = cfBugComplexity1;
	}

	public Date getCfBugFixedOn() {
		return this.cfBugFixedOn;
	}

	public void setCfBugFixedOn(Date cfBugFixedOn) {
		this.cfBugFixedOn = cfBugFixedOn;
	}

	public String getCfBugtype() {
		return this.cfBugtype;
	}

	public void setCfBugtype(String cfBugtype) {
		this.cfBugtype = cfBugtype;
	}

	public String getCfBuildComponents() {
		return this.cfBuildComponents;
	}

	public void setCfBuildComponents(String cfBuildComponents) {
		this.cfBuildComponents = cfBuildComponents;
	}

	public String getCfBuildFixed() {
		return this.cfBuildFixed;
	}

	public void setCfBuildFixed(String cfBuildFixed) {
		this.cfBuildFixed = cfBuildFixed;
	}

	public String getCfBuildFixedNew() {
		return this.cfBuildFixedNew;
	}

	public void setCfBuildFixedNew(String cfBuildFixedNew) {
		this.cfBuildFixedNew = cfBuildFixedNew;
	}

	public String getCfBuildFound() {
		return this.cfBuildFound;
	}

	public void setCfBuildFound(String cfBuildFound) {
		this.cfBuildFound = cfBuildFound;
	}

	public String getCfBuildFoundNew() {
		return this.cfBuildFoundNew;
	}

	public void setCfBuildFoundNew(String cfBuildFoundNew) {
		this.cfBuildFoundNew = cfBuildFoundNew;
	}

	public String getCfBusiness() {
		return this.cfBusiness;
	}

	public void setCfBusiness(String cfBusiness) {
		this.cfBusiness = cfBusiness;
	}

	public String getCfCategory() {
		return this.cfCategory;
	}

	public void setCfCategory(String cfCategory) {
		this.cfCategory = cfCategory;
	}

	public String getCfCf902Changelist() {
		return this.cfCf902Changelist;
	}

	public void setCfCf902Changelist(String cfCf902Changelist) {
		this.cfCf902Changelist = cfCf902Changelist;
	}

	public String getCfChangelistNo() {
		return this.cfChangelistNo;
	}

	public void setCfChangelistNo(String cfChangelistNo) {
		this.cfChangelistNo = cfChangelistNo;
	}

	public String getCfChooseFrom() {
		return this.cfChooseFrom;
	}

	public void setCfChooseFrom(String cfChooseFrom) {
		this.cfChooseFrom = cfChooseFrom;
	}

	public String getCfCobrandBugId() {
		return this.cfCobrandBugId;
	}

	public void setCfCobrandBugId(String cfCobrandBugId) {
		this.cfCobrandBugId = cfCobrandBugId;
	}

	public String getCfCobrandChangelist() {
		return this.cfCobrandChangelist;
	}

	public void setCfCobrandChangelist(String cfCobrandChangelist) {
		this.cfCobrandChangelist = cfCobrandChangelist;
	}

	public String getCfCodeReviewComments() {
		return this.cfCodeReviewComments;
	}

	public void setCfCodeReviewComments(String cfCodeReviewComments) {
		this.cfCodeReviewComments = cfCodeReviewComments;
	}

	public String getCfCodeReviewCommentsGen() {
		return this.cfCodeReviewCommentsGen;
	}

	public void setCfCodeReviewCommentsGen(String cfCodeReviewCommentsGen) {
		this.cfCodeReviewCommentsGen = cfCodeReviewCommentsGen;
	}

	public String getCfCodeReviewer() {
		return this.cfCodeReviewer;
	}

	public void setCfCodeReviewer(String cfCodeReviewer) {
		this.cfCodeReviewer = cfCodeReviewer;
	}

	public String getCfCommentsReleaseNotes() {
		return this.cfCommentsReleaseNotes;
	}

	public void setCfCommentsReleaseNotes(String cfCommentsReleaseNotes) {
		this.cfCommentsReleaseNotes = cfCommentsReleaseNotes;
	}

	public String getCfConfigurationChanges() {
		return this.cfConfigurationChanges;
	}

	public void setCfConfigurationChanges(String cfConfigurationChanges) {
		this.cfConfigurationChanges = cfConfigurationChanges;
	}

	public String getCfCustomer() {
		return this.cfCustomer;
	}

	public void setCfCustomer(String cfCustomer) {
		this.cfCustomer = cfCustomer;
	}

	public String getCfCustomerNote() {
		return this.cfCustomerNote;
	}

	public void setCfCustomerNote(String cfCustomerNote) {
		this.cfCustomerNote = cfCustomerNote;
	}

	public String getCfDepartment() {
		return this.cfDepartment;
	}

	public void setCfDepartment(String cfDepartment) {
		this.cfDepartment = cfDepartment;
	}

	public String getCfDocumentationChanges() {
		return this.cfDocumentationChanges;
	}

	public void setCfDocumentationChanges(String cfDocumentationChanges) {
		this.cfDocumentationChanges = cfDocumentationChanges;
	}

	public String getCfEnvironment() {
		return this.cfEnvironment;
	}

	public void setCfEnvironment(String cfEnvironment) {
		this.cfEnvironment = cfEnvironment;
	}

	public String getCfErrPostfixNo() {
		return this.cfErrPostfixNo;
	}

	public void setCfErrPostfixNo(String cfErrPostfixNo) {
		this.cfErrPostfixNo = cfErrPostfixNo;
	}

	public String getCfErrPrefixNo() {
		return this.cfErrPrefixNo;
	}

	public void setCfErrPrefixNo(String cfErrPrefixNo) {
		this.cfErrPrefixNo = cfErrPrefixNo;
	}

	public String getCfErrorcode() {
		return this.cfErrorcode;
	}

	public void setCfErrorcode(String cfErrorcode) {
		this.cfErrorcode = cfErrorcode;
	}

	public String getCfFeature() {
		return this.cfFeature;
	}

	public void setCfFeature(String cfFeature) {
		this.cfFeature = cfFeature;
	}

	public String getCfFidelityAsp() {
		return this.cfFidelityAsp;
	}

	public void setCfFidelityAsp(String cfFidelityAsp) {
		this.cfFidelityAsp = cfFidelityAsp;
	}

	public String getCfFixedRelease() {
		return this.cfFixedRelease;
	}

	public void setCfFixedRelease(String cfFixedRelease) {
		this.cfFixedRelease = cfFixedRelease;
	}

	public String getCfIdleTime() {
		return this.cfIdleTime;
	}

	public void setCfIdleTime(String cfIdleTime) {
		this.cfIdleTime = cfIdleTime;
	}

	public String getCfImpact() {
		return this.cfImpact;
	}

	public void setCfImpact(String cfImpact) {
		this.cfImpact = cfImpact;
	}

	public String getCfIsAutomation() {
		return this.cfIsAutomation;
	}

	public void setCfIsAutomation(String cfIsAutomation) {
		this.cfIsAutomation = cfIsAutomation;
	}

	public String getCfIsRegression() {
		return this.cfIsRegression;
	}

	public void setCfIsRegression(String cfIsRegression) {
		this.cfIsRegression = cfIsRegression;
	}

	public String getCfMemSiteAccId() {
		return this.cfMemSiteAccId;
	}

	public void setCfMemSiteAccId(String cfMemSiteAccId) {
		this.cfMemSiteAccId = cfMemSiteAccId;
	}

	public String getCfMemitem() {
		return this.cfMemitem;
	}

	public void setCfMemitem(String cfMemitem) {
		this.cfMemitem = cfMemitem;
	}

	public String getCfMentor() {
		return this.cfMentor;
	}

	public void setCfMentor(String cfMentor) {
		this.cfMentor = cfMentor;
	}

	public String getCfOldbugzillaId() {
		return this.cfOldbugzillaId;
	}

	public void setCfOldbugzillaId(String cfOldbugzillaId) {
		this.cfOldbugzillaId = cfOldbugzillaId;
	}

	public String getCfP4Label() {
		return this.cfP4Label;
	}

	public void setCfP4Label(String cfP4Label) {
		this.cfP4Label = cfP4Label;
	}

	public String getCfPatchBuildFixed() {
		return this.cfPatchBuildFixed;
	}

	public void setCfPatchBuildFixed(String cfPatchBuildFixed) {
		this.cfPatchBuildFixed = cfPatchBuildFixed;
	}

	public String getCfPatchesBuildFixed() {
		return this.cfPatchesBuildFixed;
	}

	public void setCfPatchesBuildFixed(String cfPatchesBuildFixed) {
		this.cfPatchesBuildFixed = cfPatchesBuildFixed;
	}

	public String getCfPlan() {
		return this.cfPlan;
	}

	public void setCfPlan(String cfPlan) {
		this.cfPlan = cfPlan;
	}

	public String getCfPortfolio() {
		return this.cfPortfolio;
	}

	public void setCfPortfolio(String cfPortfolio) {
		this.cfPortfolio = cfPortfolio;
	}

	public String getCfPublic() {
		return this.cfPublic;
	}

	public void setCfPublic(String cfPublic) {
		this.cfPublic = cfPublic;
	}

	public String getCfQaBrowserDetails() {
		return this.cfQaBrowserDetails;
	}

	public void setCfQaBrowserDetails(String cfQaBrowserDetails) {
		this.cfQaBrowserDetails = cfQaBrowserDetails;
	}

	public String getCfQeRca() {
		return this.cfQeRca;
	}

	public void setCfQeRca(String cfQeRca) {
		this.cfQeRca = cfQeRca;
	}

	public String getCfRca() {
		return this.cfRca;
	}

	public void setCfRca(String cfRca) {
		this.cfRca = cfRca;
	}

	public String getCfRcaDev() {
		return this.cfRcaDev;
	}

	public void setCfRcaDev(String cfRcaDev) {
		this.cfRcaDev = cfRcaDev;
	}

	public String getCfRcaQe() {
		return this.cfRcaQe;
	}

	public void setCfRcaQe(String cfRcaQe) {
		this.cfRcaQe = cfRcaQe;
	}

	public String getCfRcaReopened() {
		return this.cfRcaReopened;
	}

	public void setCfRcaReopened(String cfRcaReopened) {
		this.cfRcaReopened = cfRcaReopened;
	}

	public String getCfRcaReopenedDev() {
		return this.cfRcaReopenedDev;
	}

	public void setCfRcaReopenedDev(String cfRcaReopenedDev) {
		this.cfRcaReopenedDev = cfRcaReopenedDev;
	}

	public String getCfRcaReopenedQe() {
		return this.cfRcaReopenedQe;
	}

	public void setCfRcaReopenedQe(String cfRcaReopenedQe) {
		this.cfRcaReopenedQe = cfRcaReopenedQe;
	}

	public String getCfRcaWid() {
		return this.cfRcaWid;
	}

	public void setCfRcaWid(String cfRcaWid) {
		this.cfRcaWid = cfRcaWid;
	}

	public String getCfReadme() {
		return this.cfReadme;
	}

	public void setCfReadme(String cfReadme) {
		this.cfReadme = cfReadme;
	}

	public String getCfRecomentedAction() {
		return this.cfRecomentedAction;
	}

	public void setCfRecomentedAction(String cfRecomentedAction) {
		this.cfRecomentedAction = cfRecomentedAction;
	}

	public String getCfReleaseFound() {
		return this.cfReleaseFound;
	}

	public void setCfReleaseFound(String cfReleaseFound) {
		this.cfReleaseFound = cfReleaseFound;
	}

	public String getCfReleaseNotes() {
		return this.cfReleaseNotes;
	}

	public void setCfReleaseNotes(String cfReleaseNotes) {
		this.cfReleaseNotes = cfReleaseNotes;
	}

	public String getCfRemedyId() {
		return this.cfRemedyId;
	}

	public void setCfRemedyId(String cfRemedyId) {
		this.cfRemedyId = cfRemedyId;
	}

	public String getCfResolution1() {
		return this.cfResolution1;
	}

	public void setCfResolution1(String cfResolution1) {
		this.cfResolution1 = cfResolution1;
	}

	public String getCfResolution2() {
		return this.cfResolution2;
	}

	public void setCfResolution2(String cfResolution2) {
		this.cfResolution2 = cfResolution2;
	}

	public String getCfResolution3() {
		return this.cfResolution3;
	}

	public void setCfResolution3(String cfResolution3) {
		this.cfResolution3 = cfResolution3;
	}

	public String getCfReviewer() {
		return this.cfReviewer;
	}

	public void setCfReviewer(String cfReviewer) {
		this.cfReviewer = cfReviewer;
	}

	public String getCfRootCause() {
		return this.cfRootCause;
	}

	public void setCfRootCause(String cfRootCause) {
		this.cfRootCause = cfRootCause;
	}

	public String getCfServiceRequestId() {
		return this.cfServiceRequestId;
	}

	public void setCfServiceRequestId(String cfServiceRequestId) {
		this.cfServiceRequestId = cfServiceRequestId;
	}

	public String getCfSharepointLink() {
		return this.cfSharepointLink;
	}

	public void setCfSharepointLink(String cfSharepointLink) {
		this.cfSharepointLink = cfSharepointLink;
	}

	public String getCfSiteId() {
		return this.cfSiteId;
	}

	public void setCfSiteId(String cfSiteId) {
		this.cfSiteId = cfSiteId;
	}

	public String getCfSlaType() {
		return this.cfSlaType;
	}

	public void setCfSlaType(String cfSlaType) {
		this.cfSlaType = cfSlaType;
	}

	public String getCfStoryId() {
		return this.cfStoryId;
	}

	public void setCfStoryId(String cfStoryId) {
		this.cfStoryId = cfStoryId;
	}

	public String getCfSubBrand() {
		return this.cfSubBrand;
	}

	public void setCfSubBrand(String cfSubBrand) {
		this.cfSubBrand = cfSubBrand;
	}

	public String getCfSuminfo() {
		return this.cfSuminfo;
	}

	public void setCfSuminfo(String cfSuminfo) {
		this.cfSuminfo = cfSuminfo;
	}

	public String getCfTea_Disposition() {
		return this.cfTea_Disposition;
	}

	public void setCfTea_Disposition(String cfTea_Disposition) {
		this.cfTea_Disposition = cfTea_Disposition;
	}

	public String getCfTeaCause() {
		return this.cfTeaCause;
	}

	public void setCfTeaCause(String cfTeaCause) {
		this.cfTeaCause = cfTeaCause;
	}

	public String getCfTeaDisposition() {
		return this.cfTeaDisposition;
	}

	public void setCfTeaDisposition(String cfTeaDisposition) {
		this.cfTeaDisposition = cfTeaDisposition;
	}

	public String getCfTeaEvaluation() {
		return this.cfTeaEvaluation;
	}

	public void setCfTeaEvaluation(String cfTeaEvaluation) {
		this.cfTeaEvaluation = cfTeaEvaluation;
	}

	public String getCfTeaManager() {
		return this.cfTeaManager;
	}

	public void setCfTeaManager(String cfTeaManager) {
		this.cfTeaManager = cfTeaManager;
	}

	public String getCfTestCaseId() {
		return this.cfTestCaseId;
	}

	public void setCfTestCaseId(String cfTestCaseId) {
		this.cfTestCaseId = cfTestCaseId;
	}

	public String getCfTriageIndicator() {
		return this.cfTriageIndicator;
	}

	public void setCfTriageIndicator(String cfTriageIndicator) {
		this.cfTriageIndicator = cfTriageIndicator;
	}

	public String getCfTriageIndicator1() {
		return this.cfTriageIndicator1;
	}

	public void setCfTriageIndicator1(String cfTriageIndicator1) {
		this.cfTriageIndicator1 = cfTriageIndicator1;
	}

	public String getCfUsername() {
		return this.cfUsername;
	}

	public void setCfUsername(String cfUsername) {
		this.cfUsername = cfUsername;
	}

	public String getCfWorkflow() {
		return this.cfWorkflow;
	}

	public void setCfWorkflow(String cfWorkflow) {
		this.cfWorkflow = cfWorkflow;
	}

	public String getCfWorkflowStatus() {
		return this.cfWorkflowStatus;
	}

	public void setCfWorkflowStatus(String cfWorkflowStatus) {
		this.cfWorkflowStatus = cfWorkflowStatus;
	}

	public short getComponentId() {
		return this.componentId;
	}

	public void setComponentId(short componentId) {
		this.componentId = componentId;
	}

	public Date getCreationTs() {
		return this.creationTs;
	}

	public void setCreationTs(Date creationTs) {
		this.creationTs = creationTs;
	}

	public Date getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Date getDeltaTs() {
		return this.deltaTs;
	}

	public void setDeltaTs(Date deltaTs) {
		this.deltaTs = deltaTs;
	}

	public BigDecimal getEstimatedTime() {
		return this.estimatedTime;
	}

	public void setEstimatedTime(BigDecimal estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public byte getEverconfirmed() {
		return this.everconfirmed;
	}

	public void setEverconfirmed(byte everconfirmed) {
		this.everconfirmed = everconfirmed;
	}

	public Date getLastdiffed() {
		return this.lastdiffed;
	}

	public void setLastdiffed(Date lastdiffed) {
		this.lastdiffed = lastdiffed;
	}

	public String getOpSys() {
		return this.opSys;
	}

	public void setOpSys(String opSys) {
		this.opSys = opSys;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public short getProductId() {
		return this.productId;
	}

	public void setProductId(short productId) {
		this.productId = productId;
	}

	public BigDecimal getRemainingTime() {
		return this.remainingTime;
	}

	public void setRemainingTime(BigDecimal remainingTime) {
		this.remainingTime = remainingTime;
	}

	public String getRepPlatform() {
		return this.repPlatform;
	}

	public void setRepPlatform(String repPlatform) {
		this.repPlatform = repPlatform;
	}

	public byte getReporterAccessible() {
		return this.reporterAccessible;
	}

	public void setReporterAccessible(byte reporterAccessible) {
		this.reporterAccessible = reporterAccessible;
	}

	public String getResolution() {
		return this.resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getShortDesc() {
		return this.shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getStatusWhiteboard() {
		return this.statusWhiteboard;
	}

	public void setStatusWhiteboard(String statusWhiteboard) {
		this.statusWhiteboard = statusWhiteboard;
	}

	public String getTargetMilestone() {
		return this.targetMilestone;
	}

	public void setTargetMilestone(String targetMilestone) {
		this.targetMilestone = targetMilestone;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getVotes() {
		return this.votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public List<Keyworddef> getKeyworddefs() {
		return this.keyworddefs;
	}

	public void setKeyworddefs(List<Keyworddef> keyworddefs) {
		this.keyworddefs = keyworddefs;
	}

	public Profile getProfile1() {
		return this.profile1;
	}

	public void setProfile1(Profile profile1) {
		this.profile1 = profile1;
	}

	public Profile getProfile2() {
		return this.profile2;
	}

	public void setProfile2(Profile profile2) {
		this.profile2 = profile2;
	}

	public Profile getProfile3() {
		return this.profile3;
	}

	public void setProfile3(Profile profile3) {
		this.profile3 = profile3;
	}

	public List<BugsActivity> getBugsActivities() {
		return this.bugsActivities;
	}

	public void setBugsActivities(List<BugsActivity> bugsActivities) {
		this.bugsActivities = bugsActivities;
	}

	public BugsActivity addBugsActivity(BugsActivity bugsActivity) {
		getBugsActivities().add(bugsActivity);
		bugsActivity.setBug(this);

		return bugsActivity;
	}

	public BugsActivity removeBugsActivity(BugsActivity bugsActivity) {
		getBugsActivities().remove(bugsActivity);
		bugsActivity.setBug(null);

		return bugsActivity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		result = prime * result
				+ ((bugFileLoc == null) ? 0 : bugFileLoc.hashCode());
		result = prime * result + bugId;
		result = prime * result
				+ ((bugSeverity == null) ? 0 : bugSeverity.hashCode());
		result = prime * result
				+ ((bugStatus == null) ? 0 : bugStatus.hashCode());
		result = prime * result + cclistAccessible;
		result = prime * result
				+ ((cf5xChangelist == null) ? 0 : cf5xChangelist.hashCode());
		result = prime * result
				+ ((cf811Changelist == null) ? 0 : cf811Changelist.hashCode());
		result = prime * result
				+ ((cf89Changelist == null) ? 0 : cf89Changelist.hashCode());
		result = prime * result
				+ ((cf901Changelist == null) ? 0 : cf901Changelist.hashCode());
		result = prime * result
				+ ((cf902Changelist == null) ? 0 : cf902Changelist.hashCode());
		result = prime * result
				+ ((cf903Changelist == null) ? 0 : cf903Changelist.hashCode());
		result = prime * result
				+ ((cf90Changelist == null) ? 0 : cf90Changelist.hashCode());
		result = prime * result
				+ ((cf91Changelist == null) ? 0 : cf91Changelist.hashCode());
		result = prime * result
				+ ((cf91Changelist1 == null) ? 0 : cf91Changelist1.hashCode());
		result = prime * result
				+ ((cf92Changelist == null) ? 0 : cf92Changelist.hashCode());
		result = prime * result
				+ ((cf93Changelist == null) ? 0 : cf93Changelist.hashCode());
		result = prime * result
				+ ((cf94Changelist == null) ? 0 : cf94Changelist.hashCode());
		result = prime * result
				+ ((cf95Changelist == null) ? 0 : cf95Changelist.hashCode());
		result = prime * result
				+ ((cf96Changelist == null) ? 0 : cf96Changelist.hashCode());
		result = prime * result
				+ ((cf97Changelist == null) ? 0 : cf97Changelist.hashCode());
		result = prime * result
				+ ((cfAgentStatus == null) ? 0 : cfAgentStatus.hashCode());
		result = prime * result
				+ ((cfAgentType == null) ? 0 : cfAgentType.hashCode());
		result = prime * result
				+ ((cfAgentVersion == null) ? 0 : cfAgentVersion.hashCode());
		result = prime * result
				+ ((cfAgents == null) ? 0 : cfAgents.hashCode());
		result = prime * result
				+ ((cfAnalyst == null) ? 0 : cfAnalyst.hashCode());
		result = prime
				* result
				+ ((cfBackendFrontend == null) ? 0 : cfBackendFrontend
						.hashCode());
		result = prime * result
				+ ((cfBranchFound == null) ? 0 : cfBranchFound.hashCode());
		result = prime * result
				+ ((cfBugComplexity == null) ? 0 : cfBugComplexity.hashCode());
		result = prime
				* result
				+ ((cfBugComplexity1 == null) ? 0 : cfBugComplexity1.hashCode());
		result = prime * result
				+ ((cfBugFixedOn == null) ? 0 : cfBugFixedOn.hashCode());
		result = prime * result
				+ ((cfBugtype == null) ? 0 : cfBugtype.hashCode());
		result = prime
				* result
				+ ((cfBuildComponents == null) ? 0 : cfBuildComponents
						.hashCode());
		result = prime * result
				+ ((cfBuildFixed == null) ? 0 : cfBuildFixed.hashCode());
		result = prime * result
				+ ((cfBuildFixedNew == null) ? 0 : cfBuildFixedNew.hashCode());
		result = prime * result
				+ ((cfBuildFound == null) ? 0 : cfBuildFound.hashCode());
		result = prime * result
				+ ((cfBuildFoundNew == null) ? 0 : cfBuildFoundNew.hashCode());
		result = prime * result
				+ ((cfBusiness == null) ? 0 : cfBusiness.hashCode());
		result = prime * result
				+ ((cfCategory == null) ? 0 : cfCategory.hashCode());
		result = prime
				* result
				+ ((cfCf902Changelist == null) ? 0 : cfCf902Changelist
						.hashCode());
		result = prime * result
				+ ((cfChangelistNo == null) ? 0 : cfChangelistNo.hashCode());
		result = prime * result
				+ ((cfChooseFrom == null) ? 0 : cfChooseFrom.hashCode());
		result = prime * result
				+ ((cfCobrandBugId == null) ? 0 : cfCobrandBugId.hashCode());
		result = prime
				* result
				+ ((cfCobrandChangelist == null) ? 0 : cfCobrandChangelist
						.hashCode());
		result = prime
				* result
				+ ((cfCodeReviewComments == null) ? 0 : cfCodeReviewComments
						.hashCode());
		result = prime
				* result
				+ ((cfCodeReviewCommentsGen == null) ? 0
						: cfCodeReviewCommentsGen.hashCode());
		result = prime * result
				+ ((cfCodeReviewer == null) ? 0 : cfCodeReviewer.hashCode());
		result = prime
				* result
				+ ((cfCommentsReleaseNotes == null) ? 0
						: cfCommentsReleaseNotes.hashCode());
		result = prime
				* result
				+ ((cfConfigurationChanges == null) ? 0
						: cfConfigurationChanges.hashCode());
		result = prime * result
				+ ((cfCustomer == null) ? 0 : cfCustomer.hashCode());
		result = prime * result
				+ ((cfCustomerNote == null) ? 0 : cfCustomerNote.hashCode());
		result = prime * result
				+ ((cfDepartment == null) ? 0 : cfDepartment.hashCode());
		result = prime
				* result
				+ ((cfDocumentationChanges == null) ? 0
						: cfDocumentationChanges.hashCode());
		result = prime * result
				+ ((cfEnvironment == null) ? 0 : cfEnvironment.hashCode());
		result = prime * result
				+ ((cfErrPostfixNo == null) ? 0 : cfErrPostfixNo.hashCode());
		result = prime * result
				+ ((cfErrPrefixNo == null) ? 0 : cfErrPrefixNo.hashCode());
		result = prime * result
				+ ((cfErrorcode == null) ? 0 : cfErrorcode.hashCode());
		result = prime * result
				+ ((cfFeature == null) ? 0 : cfFeature.hashCode());
		result = prime * result
				+ ((cfFidelityAsp == null) ? 0 : cfFidelityAsp.hashCode());
		result = prime * result
				+ ((cfFixedRelease == null) ? 0 : cfFixedRelease.hashCode());
		result = prime * result
				+ ((cfIdleTime == null) ? 0 : cfIdleTime.hashCode());
		result = prime * result
				+ ((cfImpact == null) ? 0 : cfImpact.hashCode());
		result = prime * result
				+ ((cfIsAutomation == null) ? 0 : cfIsAutomation.hashCode());
		result = prime * result
				+ ((cfIsRegression == null) ? 0 : cfIsRegression.hashCode());
		result = prime * result
				+ ((cfMemSiteAccId == null) ? 0 : cfMemSiteAccId.hashCode());
		result = prime * result
				+ ((cfMemitem == null) ? 0 : cfMemitem.hashCode());
		result = prime * result
				+ ((cfMentor == null) ? 0 : cfMentor.hashCode());
		result = prime * result
				+ ((cfOldbugzillaId == null) ? 0 : cfOldbugzillaId.hashCode());
		result = prime * result
				+ ((cfP4Label == null) ? 0 : cfP4Label.hashCode());
		result = prime
				* result
				+ ((cfPatchBuildFixed == null) ? 0 : cfPatchBuildFixed
						.hashCode());
		result = prime
				* result
				+ ((cfPatchesBuildFixed == null) ? 0 : cfPatchesBuildFixed
						.hashCode());
		result = prime * result + ((cfPlan == null) ? 0 : cfPlan.hashCode());
		result = prime * result
				+ ((cfPortfolio == null) ? 0 : cfPortfolio.hashCode());
		result = prime * result
				+ ((cfPublic == null) ? 0 : cfPublic.hashCode());
		result = prime
				* result
				+ ((cfQaBrowserDetails == null) ? 0 : cfQaBrowserDetails
						.hashCode());
		result = prime * result + ((cfQeRca == null) ? 0 : cfQeRca.hashCode());
		result = prime * result + ((cfRca == null) ? 0 : cfRca.hashCode());
		result = prime * result
				+ ((cfRcaDev == null) ? 0 : cfRcaDev.hashCode());
		result = prime * result + ((cfRcaQe == null) ? 0 : cfRcaQe.hashCode());
		result = prime * result
				+ ((cfRcaReopened == null) ? 0 : cfRcaReopened.hashCode());
		result = prime
				* result
				+ ((cfRcaReopenedDev == null) ? 0 : cfRcaReopenedDev.hashCode());
		result = prime * result
				+ ((cfRcaReopenedQe == null) ? 0 : cfRcaReopenedQe.hashCode());
		result = prime * result
				+ ((cfRcaWid == null) ? 0 : cfRcaWid.hashCode());
		result = prime * result
				+ ((cfReadme == null) ? 0 : cfReadme.hashCode());
		result = prime
				* result
				+ ((cfRecomentedAction == null) ? 0 : cfRecomentedAction
						.hashCode());
		result = prime * result
				+ ((cfReleaseFound == null) ? 0 : cfReleaseFound.hashCode());
		result = prime * result
				+ ((cfReleaseNotes == null) ? 0 : cfReleaseNotes.hashCode());
		result = prime * result
				+ ((cfRemedyId == null) ? 0 : cfRemedyId.hashCode());
		result = prime * result
				+ ((cfResolution1 == null) ? 0 : cfResolution1.hashCode());
		result = prime * result
				+ ((cfResolution2 == null) ? 0 : cfResolution2.hashCode());
		result = prime * result
				+ ((cfResolution3 == null) ? 0 : cfResolution3.hashCode());
		result = prime * result
				+ ((cfReviewer == null) ? 0 : cfReviewer.hashCode());
		result = prime * result
				+ ((cfRootCause == null) ? 0 : cfRootCause.hashCode());
		result = prime
				* result
				+ ((cfServiceRequestId == null) ? 0 : cfServiceRequestId
						.hashCode());
		result = prime
				* result
				+ ((cfSharepointLink == null) ? 0 : cfSharepointLink.hashCode());
		result = prime * result
				+ ((cfSiteId == null) ? 0 : cfSiteId.hashCode());
		result = prime * result
				+ ((cfSlaType == null) ? 0 : cfSlaType.hashCode());
		result = prime * result
				+ ((cfStoryId == null) ? 0 : cfStoryId.hashCode());
		result = prime * result
				+ ((cfSubBrand == null) ? 0 : cfSubBrand.hashCode());
		result = prime * result
				+ ((cfSuminfo == null) ? 0 : cfSuminfo.hashCode());
		result = prime * result
				+ ((cfTeaCause == null) ? 0 : cfTeaCause.hashCode());
		result = prime
				* result
				+ ((cfTeaDisposition == null) ? 0 : cfTeaDisposition.hashCode());
		result = prime * result
				+ ((cfTeaEvaluation == null) ? 0 : cfTeaEvaluation.hashCode());
		result = prime * result
				+ ((cfTeaManager == null) ? 0 : cfTeaManager.hashCode());
		result = prime
				* result
				+ ((cfTea_Disposition == null) ? 0 : cfTea_Disposition
						.hashCode());
		result = prime * result
				+ ((cfTestCaseId == null) ? 0 : cfTestCaseId.hashCode());
		result = prime
				* result
				+ ((cfTriageIndicator == null) ? 0 : cfTriageIndicator
						.hashCode());
		result = prime
				* result
				+ ((cfTriageIndicator1 == null) ? 0 : cfTriageIndicator1
						.hashCode());
		result = prime * result
				+ ((cfUsername == null) ? 0 : cfUsername.hashCode());
		result = prime * result
				+ ((cfWorkflow == null) ? 0 : cfWorkflow.hashCode());
		result = prime
				* result
				+ ((cfWorkflowStatus == null) ? 0 : cfWorkflowStatus.hashCode());
		result = prime * result + componentId;
		result = prime * result
				+ ((creationTs == null) ? 0 : creationTs.hashCode());
		result = prime * result
				+ ((deadline == null) ? 0 : deadline.hashCode());
		result = prime * result + ((deltaTs == null) ? 0 : deltaTs.hashCode());
		result = prime * result
				+ ((estimatedTime == null) ? 0 : estimatedTime.hashCode());
		result = prime * result + everconfirmed;
		result = prime * result
				+ ((lastdiffed == null) ? 0 : lastdiffed.hashCode());
		result = prime * result + ((opSys == null) ? 0 : opSys.hashCode());
		result = prime * result
				+ ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + productId;
		result = prime * result
				+ ((remainingTime == null) ? 0 : remainingTime.hashCode());
		result = prime * result
				+ ((repPlatform == null) ? 0 : repPlatform.hashCode());
		result = prime * result + reporterAccessible;
		result = prime * result
				+ ((resolution == null) ? 0 : resolution.hashCode());
		result = prime * result
				+ ((shortDesc == null) ? 0 : shortDesc.hashCode());
		result = prime
				* result
				+ ((statusWhiteboard == null) ? 0 : statusWhiteboard.hashCode());
		result = prime * result
				+ ((targetMilestone == null) ? 0 : targetMilestone.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		result = prime * result + votes;
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
		Bug other = (Bug) obj;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
			return false;
		if (bugFileLoc == null) {
			if (other.bugFileLoc != null)
				return false;
		} else if (!bugFileLoc.equals(other.bugFileLoc))
			return false;
		if (bugId != other.bugId)
			return false;
		if (bugSeverity == null) {
			if (other.bugSeverity != null)
				return false;
		} else if (!bugSeverity.equals(other.bugSeverity))
			return false;
		if (bugStatus == null) {
			if (other.bugStatus != null)
				return false;
		} else if (!bugStatus.equals(other.bugStatus))
			return false;
		if (cclistAccessible != other.cclistAccessible)
			return false;
		if (cf5xChangelist == null) {
			if (other.cf5xChangelist != null)
				return false;
		} else if (!cf5xChangelist.equals(other.cf5xChangelist))
			return false;
		if (cf811Changelist == null) {
			if (other.cf811Changelist != null)
				return false;
		} else if (!cf811Changelist.equals(other.cf811Changelist))
			return false;
		if (cf89Changelist == null) {
			if (other.cf89Changelist != null)
				return false;
		} else if (!cf89Changelist.equals(other.cf89Changelist))
			return false;
		if (cf901Changelist == null) {
			if (other.cf901Changelist != null)
				return false;
		} else if (!cf901Changelist.equals(other.cf901Changelist))
			return false;
		if (cf902Changelist == null) {
			if (other.cf902Changelist != null)
				return false;
		} else if (!cf902Changelist.equals(other.cf902Changelist))
			return false;
		if (cf903Changelist == null) {
			if (other.cf903Changelist != null)
				return false;
		} else if (!cf903Changelist.equals(other.cf903Changelist))
			return false;
		if (cf90Changelist == null) {
			if (other.cf90Changelist != null)
				return false;
		} else if (!cf90Changelist.equals(other.cf90Changelist))
			return false;
		if (cf91Changelist == null) {
			if (other.cf91Changelist != null)
				return false;
		} else if (!cf91Changelist.equals(other.cf91Changelist))
			return false;
		if (cf91Changelist1 == null) {
			if (other.cf91Changelist1 != null)
				return false;
		} else if (!cf91Changelist1.equals(other.cf91Changelist1))
			return false;
		if (cf92Changelist == null) {
			if (other.cf92Changelist != null)
				return false;
		} else if (!cf92Changelist.equals(other.cf92Changelist))
			return false;
		if (cf93Changelist == null) {
			if (other.cf93Changelist != null)
				return false;
		} else if (!cf93Changelist.equals(other.cf93Changelist))
			return false;
		if (cf94Changelist == null) {
			if (other.cf94Changelist != null)
				return false;
		} else if (!cf94Changelist.equals(other.cf94Changelist))
			return false;
		if (cf95Changelist == null) {
			if (other.cf95Changelist != null)
				return false;
		} else if (!cf95Changelist.equals(other.cf95Changelist))
			return false;
		if (cf96Changelist == null) {
			if (other.cf96Changelist != null)
				return false;
		} else if (!cf96Changelist.equals(other.cf96Changelist))
			return false;
		if (cf97Changelist == null) {
			if (other.cf97Changelist != null)
				return false;
		} else if (!cf97Changelist.equals(other.cf97Changelist))
			return false;
		if (cfAgentStatus == null) {
			if (other.cfAgentStatus != null)
				return false;
		} else if (!cfAgentStatus.equals(other.cfAgentStatus))
			return false;
		if (cfAgentType == null) {
			if (other.cfAgentType != null)
				return false;
		} else if (!cfAgentType.equals(other.cfAgentType))
			return false;
		if (cfAgentVersion == null) {
			if (other.cfAgentVersion != null)
				return false;
		} else if (!cfAgentVersion.equals(other.cfAgentVersion))
			return false;
		if (cfAgents == null) {
			if (other.cfAgents != null)
				return false;
		} else if (!cfAgents.equals(other.cfAgents))
			return false;
		if (cfAnalyst == null) {
			if (other.cfAnalyst != null)
				return false;
		} else if (!cfAnalyst.equals(other.cfAnalyst))
			return false;
		if (cfBackendFrontend == null) {
			if (other.cfBackendFrontend != null)
				return false;
		} else if (!cfBackendFrontend.equals(other.cfBackendFrontend))
			return false;
		if (cfBranchFound == null) {
			if (other.cfBranchFound != null)
				return false;
		} else if (!cfBranchFound.equals(other.cfBranchFound))
			return false;
		if (cfBugComplexity == null) {
			if (other.cfBugComplexity != null)
				return false;
		} else if (!cfBugComplexity.equals(other.cfBugComplexity))
			return false;
		if (cfBugComplexity1 == null) {
			if (other.cfBugComplexity1 != null)
				return false;
		} else if (!cfBugComplexity1.equals(other.cfBugComplexity1))
			return false;
		if (cfBugFixedOn == null) {
			if (other.cfBugFixedOn != null)
				return false;
		} else if (!cfBugFixedOn.equals(other.cfBugFixedOn))
			return false;
		if (cfBugtype == null) {
			if (other.cfBugtype != null)
				return false;
		} else if (!cfBugtype.equals(other.cfBugtype))
			return false;
		if (cfBuildComponents == null) {
			if (other.cfBuildComponents != null)
				return false;
		} else if (!cfBuildComponents.equals(other.cfBuildComponents))
			return false;
		if (cfBuildFixed == null) {
			if (other.cfBuildFixed != null)
				return false;
		} else if (!cfBuildFixed.equals(other.cfBuildFixed))
			return false;
		if (cfBuildFixedNew == null) {
			if (other.cfBuildFixedNew != null)
				return false;
		} else if (!cfBuildFixedNew.equals(other.cfBuildFixedNew))
			return false;
		if (cfBuildFound == null) {
			if (other.cfBuildFound != null)
				return false;
		} else if (!cfBuildFound.equals(other.cfBuildFound))
			return false;
		if (cfBuildFoundNew == null) {
			if (other.cfBuildFoundNew != null)
				return false;
		} else if (!cfBuildFoundNew.equals(other.cfBuildFoundNew))
			return false;
		if (cfBusiness == null) {
			if (other.cfBusiness != null)
				return false;
		} else if (!cfBusiness.equals(other.cfBusiness))
			return false;
		if (cfCategory == null) {
			if (other.cfCategory != null)
				return false;
		} else if (!cfCategory.equals(other.cfCategory))
			return false;
		if (cfCf902Changelist == null) {
			if (other.cfCf902Changelist != null)
				return false;
		} else if (!cfCf902Changelist.equals(other.cfCf902Changelist))
			return false;
		if (cfChangelistNo == null) {
			if (other.cfChangelistNo != null)
				return false;
		} else if (!cfChangelistNo.equals(other.cfChangelistNo))
			return false;
		if (cfChooseFrom == null) {
			if (other.cfChooseFrom != null)
				return false;
		} else if (!cfChooseFrom.equals(other.cfChooseFrom))
			return false;
		if (cfCobrandBugId == null) {
			if (other.cfCobrandBugId != null)
				return false;
		} else if (!cfCobrandBugId.equals(other.cfCobrandBugId))
			return false;
		if (cfCobrandChangelist == null) {
			if (other.cfCobrandChangelist != null)
				return false;
		} else if (!cfCobrandChangelist.equals(other.cfCobrandChangelist))
			return false;
		if (cfCodeReviewComments == null) {
			if (other.cfCodeReviewComments != null)
				return false;
		} else if (!cfCodeReviewComments.equals(other.cfCodeReviewComments))
			return false;
		if (cfCodeReviewCommentsGen == null) {
			if (other.cfCodeReviewCommentsGen != null)
				return false;
		} else if (!cfCodeReviewCommentsGen
				.equals(other.cfCodeReviewCommentsGen))
			return false;
		if (cfCodeReviewer == null) {
			if (other.cfCodeReviewer != null)
				return false;
		} else if (!cfCodeReviewer.equals(other.cfCodeReviewer))
			return false;
		if (cfCommentsReleaseNotes == null) {
			if (other.cfCommentsReleaseNotes != null)
				return false;
		} else if (!cfCommentsReleaseNotes.equals(other.cfCommentsReleaseNotes))
			return false;
		if (cfConfigurationChanges == null) {
			if (other.cfConfigurationChanges != null)
				return false;
		} else if (!cfConfigurationChanges.equals(other.cfConfigurationChanges))
			return false;
		if (cfCustomer == null) {
			if (other.cfCustomer != null)
				return false;
		} else if (!cfCustomer.equals(other.cfCustomer))
			return false;
		if (cfCustomerNote == null) {
			if (other.cfCustomerNote != null)
				return false;
		} else if (!cfCustomerNote.equals(other.cfCustomerNote))
			return false;
		if (cfDepartment == null) {
			if (other.cfDepartment != null)
				return false;
		} else if (!cfDepartment.equals(other.cfDepartment))
			return false;
		if (cfDocumentationChanges == null) {
			if (other.cfDocumentationChanges != null)
				return false;
		} else if (!cfDocumentationChanges.equals(other.cfDocumentationChanges))
			return false;
		if (cfEnvironment == null) {
			if (other.cfEnvironment != null)
				return false;
		} else if (!cfEnvironment.equals(other.cfEnvironment))
			return false;
		if (cfErrPostfixNo == null) {
			if (other.cfErrPostfixNo != null)
				return false;
		} else if (!cfErrPostfixNo.equals(other.cfErrPostfixNo))
			return false;
		if (cfErrPrefixNo == null) {
			if (other.cfErrPrefixNo != null)
				return false;
		} else if (!cfErrPrefixNo.equals(other.cfErrPrefixNo))
			return false;
		if (cfErrorcode == null) {
			if (other.cfErrorcode != null)
				return false;
		} else if (!cfErrorcode.equals(other.cfErrorcode))
			return false;
		if (cfFeature == null) {
			if (other.cfFeature != null)
				return false;
		} else if (!cfFeature.equals(other.cfFeature))
			return false;
		if (cfFidelityAsp == null) {
			if (other.cfFidelityAsp != null)
				return false;
		} else if (!cfFidelityAsp.equals(other.cfFidelityAsp))
			return false;
		if (cfFixedRelease == null) {
			if (other.cfFixedRelease != null)
				return false;
		} else if (!cfFixedRelease.equals(other.cfFixedRelease))
			return false;
		if (cfIdleTime == null) {
			if (other.cfIdleTime != null)
				return false;
		} else if (!cfIdleTime.equals(other.cfIdleTime))
			return false;
		if (cfImpact == null) {
			if (other.cfImpact != null)
				return false;
		} else if (!cfImpact.equals(other.cfImpact))
			return false;
		if (cfIsAutomation == null) {
			if (other.cfIsAutomation != null)
				return false;
		} else if (!cfIsAutomation.equals(other.cfIsAutomation))
			return false;
		if (cfIsRegression == null) {
			if (other.cfIsRegression != null)
				return false;
		} else if (!cfIsRegression.equals(other.cfIsRegression))
			return false;
		if (cfMemSiteAccId == null) {
			if (other.cfMemSiteAccId != null)
				return false;
		} else if (!cfMemSiteAccId.equals(other.cfMemSiteAccId))
			return false;
		if (cfMemitem == null) {
			if (other.cfMemitem != null)
				return false;
		} else if (!cfMemitem.equals(other.cfMemitem))
			return false;
		if (cfMentor == null) {
			if (other.cfMentor != null)
				return false;
		} else if (!cfMentor.equals(other.cfMentor))
			return false;
		if (cfOldbugzillaId == null) {
			if (other.cfOldbugzillaId != null)
				return false;
		} else if (!cfOldbugzillaId.equals(other.cfOldbugzillaId))
			return false;
		if (cfP4Label == null) {
			if (other.cfP4Label != null)
				return false;
		} else if (!cfP4Label.equals(other.cfP4Label))
			return false;
		if (cfPatchBuildFixed == null) {
			if (other.cfPatchBuildFixed != null)
				return false;
		} else if (!cfPatchBuildFixed.equals(other.cfPatchBuildFixed))
			return false;
		if (cfPatchesBuildFixed == null) {
			if (other.cfPatchesBuildFixed != null)
				return false;
		} else if (!cfPatchesBuildFixed.equals(other.cfPatchesBuildFixed))
			return false;
		if (cfPlan == null) {
			if (other.cfPlan != null)
				return false;
		} else if (!cfPlan.equals(other.cfPlan))
			return false;
		if (cfPortfolio == null) {
			if (other.cfPortfolio != null)
				return false;
		} else if (!cfPortfolio.equals(other.cfPortfolio))
			return false;
		if (cfPublic == null) {
			if (other.cfPublic != null)
				return false;
		} else if (!cfPublic.equals(other.cfPublic))
			return false;
		if (cfQaBrowserDetails == null) {
			if (other.cfQaBrowserDetails != null)
				return false;
		} else if (!cfQaBrowserDetails.equals(other.cfQaBrowserDetails))
			return false;
		if (cfQeRca == null) {
			if (other.cfQeRca != null)
				return false;
		} else if (!cfQeRca.equals(other.cfQeRca))
			return false;
		if (cfRca == null) {
			if (other.cfRca != null)
				return false;
		} else if (!cfRca.equals(other.cfRca))
			return false;
		if (cfRcaDev == null) {
			if (other.cfRcaDev != null)
				return false;
		} else if (!cfRcaDev.equals(other.cfRcaDev))
			return false;
		if (cfRcaQe == null) {
			if (other.cfRcaQe != null)
				return false;
		} else if (!cfRcaQe.equals(other.cfRcaQe))
			return false;
		if (cfRcaReopened == null) {
			if (other.cfRcaReopened != null)
				return false;
		} else if (!cfRcaReopened.equals(other.cfRcaReopened))
			return false;
		if (cfRcaReopenedDev == null) {
			if (other.cfRcaReopenedDev != null)
				return false;
		} else if (!cfRcaReopenedDev.equals(other.cfRcaReopenedDev))
			return false;
		if (cfRcaReopenedQe == null) {
			if (other.cfRcaReopenedQe != null)
				return false;
		} else if (!cfRcaReopenedQe.equals(other.cfRcaReopenedQe))
			return false;
		if (cfRcaWid == null) {
			if (other.cfRcaWid != null)
				return false;
		} else if (!cfRcaWid.equals(other.cfRcaWid))
			return false;
		if (cfReadme == null) {
			if (other.cfReadme != null)
				return false;
		} else if (!cfReadme.equals(other.cfReadme))
			return false;
		if (cfRecomentedAction == null) {
			if (other.cfRecomentedAction != null)
				return false;
		} else if (!cfRecomentedAction.equals(other.cfRecomentedAction))
			return false;
		if (cfReleaseFound == null) {
			if (other.cfReleaseFound != null)
				return false;
		} else if (!cfReleaseFound.equals(other.cfReleaseFound))
			return false;
		if (cfReleaseNotes == null) {
			if (other.cfReleaseNotes != null)
				return false;
		} else if (!cfReleaseNotes.equals(other.cfReleaseNotes))
			return false;
		if (cfRemedyId == null) {
			if (other.cfRemedyId != null)
				return false;
		} else if (!cfRemedyId.equals(other.cfRemedyId))
			return false;
		if (cfResolution1 == null) {
			if (other.cfResolution1 != null)
				return false;
		} else if (!cfResolution1.equals(other.cfResolution1))
			return false;
		if (cfResolution2 == null) {
			if (other.cfResolution2 != null)
				return false;
		} else if (!cfResolution2.equals(other.cfResolution2))
			return false;
		if (cfResolution3 == null) {
			if (other.cfResolution3 != null)
				return false;
		} else if (!cfResolution3.equals(other.cfResolution3))
			return false;
		if (cfReviewer == null) {
			if (other.cfReviewer != null)
				return false;
		} else if (!cfReviewer.equals(other.cfReviewer))
			return false;
		if (cfRootCause == null) {
			if (other.cfRootCause != null)
				return false;
		} else if (!cfRootCause.equals(other.cfRootCause))
			return false;
		if (cfServiceRequestId == null) {
			if (other.cfServiceRequestId != null)
				return false;
		} else if (!cfServiceRequestId.equals(other.cfServiceRequestId))
			return false;
		if (cfSharepointLink == null) {
			if (other.cfSharepointLink != null)
				return false;
		} else if (!cfSharepointLink.equals(other.cfSharepointLink))
			return false;
		if (cfSiteId == null) {
			if (other.cfSiteId != null)
				return false;
		} else if (!cfSiteId.equals(other.cfSiteId))
			return false;
		if (cfSlaType == null) {
			if (other.cfSlaType != null)
				return false;
		} else if (!cfSlaType.equals(other.cfSlaType))
			return false;
		if (cfStoryId == null) {
			if (other.cfStoryId != null)
				return false;
		} else if (!cfStoryId.equals(other.cfStoryId))
			return false;
		if (cfSubBrand == null) {
			if (other.cfSubBrand != null)
				return false;
		} else if (!cfSubBrand.equals(other.cfSubBrand))
			return false;
		if (cfSuminfo == null) {
			if (other.cfSuminfo != null)
				return false;
		} else if (!cfSuminfo.equals(other.cfSuminfo))
			return false;
		if (cfTeaCause == null) {
			if (other.cfTeaCause != null)
				return false;
		} else if (!cfTeaCause.equals(other.cfTeaCause))
			return false;
		if (cfTeaDisposition == null) {
			if (other.cfTeaDisposition != null)
				return false;
		} else if (!cfTeaDisposition.equals(other.cfTeaDisposition))
			return false;
		if (cfTeaEvaluation == null) {
			if (other.cfTeaEvaluation != null)
				return false;
		} else if (!cfTeaEvaluation.equals(other.cfTeaEvaluation))
			return false;
		if (cfTeaManager == null) {
			if (other.cfTeaManager != null)
				return false;
		} else if (!cfTeaManager.equals(other.cfTeaManager))
			return false;
		if (cfTea_Disposition == null) {
			if (other.cfTea_Disposition != null)
				return false;
		} else if (!cfTea_Disposition.equals(other.cfTea_Disposition))
			return false;
		if (cfTestCaseId == null) {
			if (other.cfTestCaseId != null)
				return false;
		} else if (!cfTestCaseId.equals(other.cfTestCaseId))
			return false;
		if (cfTriageIndicator == null) {
			if (other.cfTriageIndicator != null)
				return false;
		} else if (!cfTriageIndicator.equals(other.cfTriageIndicator))
			return false;
		if (cfTriageIndicator1 == null) {
			if (other.cfTriageIndicator1 != null)
				return false;
		} else if (!cfTriageIndicator1.equals(other.cfTriageIndicator1))
			return false;
		if (cfUsername == null) {
			if (other.cfUsername != null)
				return false;
		} else if (!cfUsername.equals(other.cfUsername))
			return false;
		if (cfWorkflow == null) {
			if (other.cfWorkflow != null)
				return false;
		} else if (!cfWorkflow.equals(other.cfWorkflow))
			return false;
		if (cfWorkflowStatus == null) {
			if (other.cfWorkflowStatus != null)
				return false;
		} else if (!cfWorkflowStatus.equals(other.cfWorkflowStatus))
			return false;
		if (componentId != other.componentId)
			return false;
		if (creationTs == null) {
			if (other.creationTs != null)
				return false;
		} else if (!creationTs.equals(other.creationTs))
			return false;
		if (deadline == null) {
			if (other.deadline != null)
				return false;
		} else if (!deadline.equals(other.deadline))
			return false;
		if (deltaTs == null) {
			if (other.deltaTs != null)
				return false;
		} else if (!deltaTs.equals(other.deltaTs))
			return false;
		if (estimatedTime == null) {
			if (other.estimatedTime != null)
				return false;
		} else if (!estimatedTime.equals(other.estimatedTime))
			return false;
		if (everconfirmed != other.everconfirmed)
			return false;
		if (lastdiffed == null) {
			if (other.lastdiffed != null)
				return false;
		} else if (!lastdiffed.equals(other.lastdiffed))
			return false;
		if (opSys == null) {
			if (other.opSys != null)
				return false;
		} else if (!opSys.equals(other.opSys))
			return false;
		if (priority == null) {
			if (other.priority != null)
				return false;
		} else if (!priority.equals(other.priority))
			return false;
		if (productId != other.productId)
			return false;
		if (remainingTime == null) {
			if (other.remainingTime != null)
				return false;
		} else if (!remainingTime.equals(other.remainingTime))
			return false;
		if (repPlatform == null) {
			if (other.repPlatform != null)
				return false;
		} else if (!repPlatform.equals(other.repPlatform))
			return false;
		if (reporterAccessible != other.reporterAccessible)
			return false;
		if (resolution == null) {
			if (other.resolution != null)
				return false;
		} else if (!resolution.equals(other.resolution))
			return false;
		if (shortDesc == null) {
			if (other.shortDesc != null)
				return false;
		} else if (!shortDesc.equals(other.shortDesc))
			return false;
		if (statusWhiteboard == null) {
			if (other.statusWhiteboard != null)
				return false;
		} else if (!statusWhiteboard.equals(other.statusWhiteboard))
			return false;
		if (targetMilestone == null) {
			if (other.targetMilestone != null)
				return false;
		} else if (!targetMilestone.equals(other.targetMilestone))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		if (votes != other.votes)
			return false;
		return true;
	}
	
	
}