package com.dayang.newmedia.newscommand.db.model;

import java.io.IOException;

import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.core.NestedIOException;

public class CheckMyBatis extends SqlSessionFactoryBean{
	@Override
	protected SqlSessionFactory buildSqlSessionFactory() throws IOException {
		// TODO Auto-generated method stub
		try {
			return super.buildSqlSessionFactory();
		} catch (NestedIOException e) {
			System.out.println(e.getMessage());
			throw new NestedIOException("Failed to parse mapping resource:", e);
		} finally{
			ErrorContext.instance().reset();
		}
	}
}
