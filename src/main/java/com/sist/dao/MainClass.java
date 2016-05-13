package com.sist.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		
		BoardDAO dao=(BoardDAO)app.getBean("boardDAO");
		List<BoardVO> list=dao.boardAllData();
		for(BoardVO vo:list){
			System.out.println(vo.getNo() +" "+ vo.getName() +" "+
					vo.getRegdate().toString());
		}
	}
}




















































