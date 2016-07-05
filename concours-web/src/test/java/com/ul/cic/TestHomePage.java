package com.ul.cic;

import com.ul.cic.core.web.application.ConcoursApplication;
import com.ul.cic.core.web.index.Index;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestHomePage {

    private WicketTester tester;

    @Before
    public void setUp() {
        tester = new WicketTester(new ConcoursApplication());
    }

    @Test
    public void homepageRendersSuccessfully() {
        //start and render the test page
        tester.startPage(Index.class);
        //assert rendered page class
        tester.assertRenderedPage(Index.class);
    }
}
