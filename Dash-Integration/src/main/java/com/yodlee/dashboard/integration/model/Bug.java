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

}