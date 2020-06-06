package com.iu.lhj3;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Data extends MyAbstractTest {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void con() throws Exception {
//		System.out.println(dataSource);
//		assertNotNull(dataSource.getConnection());
		assertNotNull(sqlSession);
	}
}
