
package com.thinkgem.jeesite.test.dao;

import com.thinkgem.jeesite.common.persistence.TreeDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 * @author
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}