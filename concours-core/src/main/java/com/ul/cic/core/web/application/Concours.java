/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.core.web.application;

import com.ul.cic.core.web.login.Login;
import org.apache.wicket.Page;
import org.apache.wicket.RuntimeConfigurationType;
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

    @Override
    public String getMimeType(String fileName) {
        return super.getMimeType(fileName); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setConfigurationType(RuntimeConfigurationType configurationType) {
        super.setConfigurationType(configurationType); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    public <P extends Page> void mountPackage(String path, Class<P> pageClass) {
        super.mountPackage(path, pageClass); //To change body of generated methods, choose Tools | Templates.
    }

}
