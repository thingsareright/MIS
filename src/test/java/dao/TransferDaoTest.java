package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TransferDaoTest {
    @Autowired
    TransferDao transferDao;

    @Test
    public void testAddTransfer(){
        transferDao.addTransferRecord(100002,11001,11002);
    }
}
