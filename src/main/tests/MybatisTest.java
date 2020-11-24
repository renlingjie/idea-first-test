import com.dao.AccountDao;
import com.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MybatisTest {
    @Test
    public void run() throws IOException {
        System.out.println("github测试");
        //1、加载Mybatis的配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3、创建SqlSession对象
        SqlSession session = factory.openSession();
        //4、获取到代理对象
        AccountDao accountDao = session.getMapper(AccountDao.class);
        //5、查询所有数据
        List<Account> list = accountDao.findAll();
        for (Account account : list){
            System.out.println(account);
        }
        //6、关闭资源
        session.close();;
        in.close();
    }
    @Test
    public void run1() throws IOException {
        Account account = new Account();
        account.setMoney((double) 200);
        account.setName("兔兔");
        //1、加载Mybatis的配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3、创建SqlSession对象
        SqlSession session = factory.openSession();
        //4、获取到代理对象
        AccountDao accountDao = session.getMapper(AccountDao.class);
        //5、保存数据
        accountDao.saveAccount(account);
        //6、提交事务
        session.commit();
        //7、关闭资源
        session.close();;
        in.close();
    }
}
