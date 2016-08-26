package com.yodlee.dashboard.integration.dao.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yodlee.dashboard.integration.dao.AbstractDao;
import com.yodlee.dashboard.integration.dao.BugsDao;
import com.yodlee.dashboard.integration.model.Bug;

@Repository("bugDao")
public class BugDaoImpl extends AbstractDao<Integer,Bug> implements BugsDao {

	public Bug findById(int bugId) {
		Bug bug = getByKey(bugId);
		if(bug != null){
			initializeCollection(bug.getBugsActivities());
		}
		return bug;
	}

//	public List<Bug> getAllClosedBugs(String customer , Date fromDate , Date toDate ){
////		List<Bug> bug = getEntityManager().createQuery("");
//		EntityManager em = getEntityManager();
//		CriteriaBuilder qb = em.getCriteriaBuilder();
//		Root<Bug> bug = qb.createQuery().from(Bug.class);
//		
//		List<Predicate> predicates = new ArrayList<Predicate>();
//		predicates.add(bug.equal(bug.get(arg0), arg1));
//		
//		return null ;
//	}
	
	@SuppressWarnings("unchecked")
	public List<Bug> getAllClosedBugs(String customer , Date fromDate , Date toDate ){
	
		List<Bug> bugList = getEntityManager().createQuery("select b.bugId , p.loginName  , p.realname ,b.cfCustomer , b.cfWorkflowStatus , "
				+ "b.cfBugtype , p.userid , b.cfAgents , b.cfBugComplexity1 , b.estimatedTime, ba.bugWhen from Bug b, BugsActivity ba, Profile p "
				+ "where b.bugId=ba.bug.bugId and ba.profile.userid=p.userid and ba.added='CS' and ba.removed='IAE' and ba.bugWhen>= :fromDate and ba.bugWhen<= :toDate "
				+ "and b.cfBugtype='Bug' order by b.cfCustomer" ).setParameter("fromDate", fromDate).setParameter("toDate", toDate).getResultList();	
	
		
		return bugList ;
	}
	
	@SuppressWarnings("unchecked")
	public List<Bug> getAllNewBugs(String customer , Date fromDate , Date toDate){
		List<Bug> bugList = getEntityManager().createQuery("select distinct b.bugId , b.creationTs , b.deltaTs , b.cfAgents , b.cfSuminfo , b.statusWhiteboard , k.name as keywords,"
				+ "b.deadline , b.cfDepartment , b.cfCustomer , b.cfWorkflowStatus , b.cfIdleTime , b.cfCustomer from Bug b , Keyword ki, Keyworddef k where "
				+ "b.bugId = ki.bugId and ki.keywordid = k.id and b.cfBugtype='Bug' and b.cfBackendFrontend not in ('Preventive Fixes') and "
				+ "b.cfBackendFrontend in ('Customer', 'VIP', 'Forum') and b.creationTs >=:fromDate and b.creationTs <=:toDate and b.componentId in "
				+ "(1599,1697,1881,1931,1963,2187,2427,3215,3217,3439)").setParameter("fromDate", fromDate).setParameter("toDate", toDate).getResultList();
		
		System.out.println("--------->"+bugList.size());
		
		return bugList ;
	}
	
//	public void getReopenedBugs(String customer , Date fromDate , Date toDate){
//		
//	}
//	
//	public void getReopenedBugs(String customer , Date fromDate , Date toDate){
//		
//	}
	
	
	public List<Bug> findAllBugs() {
		// TODO Auto-generated method stub
		return null;
	}

	 //An alternative to Hibernate.initialize()
    protected void initializeCollection(Collection<?> collection) {
        if(collection == null) {
            return;
        }
        collection.iterator().hasNext();
    }
	
}
