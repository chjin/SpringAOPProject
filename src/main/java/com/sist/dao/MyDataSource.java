package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDataSource {
	private Connection conn;
	private String driver;
	private String url;
	private String username;
	private String password;
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void init(){
		try{
			Class.forName(driver);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	public void getConnection(){
		try{
			conn=DriverManager.getConnection(url,username,password);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	public void disConnection(){
		try{
			if(conn !=null)
				conn.close();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}


























