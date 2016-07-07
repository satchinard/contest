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

    @Override
    public void onUnbound(String string) {

    }

}
