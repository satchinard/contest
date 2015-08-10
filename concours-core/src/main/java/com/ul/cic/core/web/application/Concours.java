/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.core.web.application;

import com.ul.cic.core.web.login.Login;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 *
 * @author cagecfi
 */
public class Concours extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return Login.class;
    }

}
