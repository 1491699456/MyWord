package com.bas.jdbc;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BaseDao {

	public static Connection getConn(){
		try {
			//构建Context对象
			Context ctx=new InitialContext();
			//获取数据源
			DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/mydb");
			//返回连接对象
			return ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}






