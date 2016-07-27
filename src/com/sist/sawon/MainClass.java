package com.sist.sawon;
import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<sawonVO> list=new ArrayList();
		sawonVO vo=new sawonVO();
		
		vo.setSabun(1);
		vo.setName("전도정");
		vo.setJop("대리");
		vo.setDname("영업부");
		vo.setLoc("서울");
		vo.setPay(3200);
		list.add(vo);
		
		vo=new sawonVO();
		vo.setSabun(2);
		vo.setName("성개");
		vo.setJop("사원");
		vo.setDname("기획부");
		vo.setLoc("독도");
		vo.setPay(2600);
		list.add(vo);
		
		vo=new sawonVO();
		vo.setSabun(3);
		vo.setName("정몽주");
		vo.setJop("과장");
		vo.setDname("개발부");
		vo.setLoc("부산");
		vo.setPay(4000);
		list.add(vo);
		
		System.out.println();
		for(sawonVO v : list){
			System.out.println(v.getSabun()+" "+v.getName()+" "+v.getJop()+" "+v.getDname()+" "+v.getLoc()+" "+v.getPay());
		}
	}
}
