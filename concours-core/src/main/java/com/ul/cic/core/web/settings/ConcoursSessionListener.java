/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.core.web.settings;

import org.apache.wicket.ISessionListener;
import org.apache.wicket.Session;

/**
 *
 * @author cagecfi
 */
public class ConcoursSessionListener implements ISessionListener {

    @Override
    public void onCreated(Session sn) {
        sn.getClientInfo();
    }

}
