package com.ideata.jdbc;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

import com.ideata.jdbc.DataSource;

public class DataSource {
	private static DataSource datasource;
	private BasicDataSource ds;

	public DataSource() throws IOException, SQLException, PropertyVetoException {
		ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("admin");
		ds.setUrl("jdbc:mysql://localhost/skfdb");
//		ds.setUrl("jdbc:mysql://trackingdb.cccccc30.ap-south-1.rds.amazonaws.com/skfdb_13?zeroDateTimeBehavior=convertToNull");
		ds.setMinIdle(5);
		ds.setMaxIdle(20);
		ds.setMaxOpenPreparedStatements(180);

	}

	public static DataSource getInstance() throws IOException, SQLException, PropertyVetoException {
		if (datasource == null) {
			datasource = new DataSource();
			return datasource;
		} else {
			return datasource;
		}
	}

	public Connection getConnection() throws SQLException {
		return this.ds.getConnection();
	}
	
}
