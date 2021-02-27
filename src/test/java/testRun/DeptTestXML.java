package testRun;

import com.wxc.dao.DeptDao;
import com.wxc.entity.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DeptTestXML {
    @Test
    public void testMybatis(){
        SqlSession sqlSession = null;
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = sqlSessionFactory.openSession();
            DeptDao mapper = sqlSession.getMapper(DeptDao.class);
            List<Dept> all = mapper.findAll();
            all.forEach(System.out::println);
            System.out.println("-----------------------------华丽的分割线---------------------------");
            Dept deptByid = mapper.findByid(2);
            System.out.println(deptByid);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }
}
