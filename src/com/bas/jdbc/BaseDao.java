package com.bas.jdbc;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BaseDao {

	public static Connection getConn(){
		try {
			//����Context����
			Context ctx=new InitialContext();
			//��ȡ����Դ
			DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/mydb");
			//�������Ӷ���
			return ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}






