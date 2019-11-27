package mybatisDemo;


import java.io.IOException;

import java.io.Reader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class test {
	
	public static void main(String[] args) {

//		boats b = new boats();
//		b.setbid(2);
//		b.setbname("ll");
//		b.setcolor("y");
		
	
		//List<boats>boatAns= new ArrayList<boats>();
		List<sailor>sailorAns= new ArrayList<sailor>();
		SqlSession sqlSession = MybatisUtil.getSqlSession();
	
		 
		 
		 //sqlSession.insert("boatsID.insertToBoats",b);
        
		//boatAns = sqlSession.selectList("boatsID.getAllFromBoats");
		sailorAns = sqlSession.selectList("sailorID.getAllSailors");
//         for(boats boats : boatAns) {
//        	 System.out.println(boats.toString());
//         }
         for(sailor sailor : sailorAns) {
        	 System.out.println(sailor.toString());
         }
         
         
         
         MybatisUtil.closeSqlSession();

          
		// TODO Auto-generated method stub
	
	

	}
}