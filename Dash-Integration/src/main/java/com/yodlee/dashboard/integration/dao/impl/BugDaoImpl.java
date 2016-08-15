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
	
		List<Bug> bugList = getEntityManager().createQuery("select b.bug_id , p.login_name  , p.realname ,b.cf_customer , b.cf_workflow_status , "
				+ "b.cf_bugtype ,ba.who , b.cf_agents ,cf_bug_complexity1,estimated_time, ba.bug_when from bugs b, bugs_activity ba, profiles p "
				+ "where ba.who=p.userid and b.bug_id=ba.bug_id and ba.added='CS' and ba.removed='IAE' and ba.bug_when>= :fromDate and ba.bug_when<= :toDate "
				+ "and b.cf_bugtype='Bug' order by b.cf_customer" ).setParameter("fromDate", fromDate).setParameter("toDate", toDate).getResultList();	
	
		
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
