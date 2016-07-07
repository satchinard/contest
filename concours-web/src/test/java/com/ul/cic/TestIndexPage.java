/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic;

import com.ul.cic.core.web.application.ConcoursApplication;
import com.ul.cic.core.web.index.Index;
import javax.jdo.annotations.Transactional;
import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 *
 * @author cagecfi
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class TestIndexPage {

    private WicketTester tester;
    @Autowired
    private ApplicationContext ctx;
    @Autowired
    private ConcoursApplication app;

    @Before
    public void setUp() {
        tester = new WicketTester(app);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void testRenderMyPage() {
        tester.startPage(Index.class);
        tester.assertRenderedPage(Index.class);
        tester.assertComponent("repeate", RepeatingView.class);
    }
}
