package com.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	@Autowired
	private MyDataSource ds;
	
	public List<BoardVO> boardAllData(){
		List<BoardVO> list=new ArrayList<BoardVO>();
		
		try{
			Connection conn=ds.getConn();
			String sql="SELECT no,name,regdate FROM board";
			
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				BoardVO vo=new BoardVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setRegdate(rs.getDate(3));
				list.add(vo);
			}
			rs.close();
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		return list;
	}
}















































