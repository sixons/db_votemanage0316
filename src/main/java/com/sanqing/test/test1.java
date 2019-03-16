package com.sanqing.test;

import com.sanqing.daoImpl.VoteDAOImpl;
import org.junit.Test;

/**
 *
 */
public class test1 {
    @Test
    public void test1(){
        VoteDAOImpl voteDAO = new VoteDAOImpl();
        int countByChannel = voteDAO.findCountByChannel(3);
        System.out.println(countByChannel);
    }
}
