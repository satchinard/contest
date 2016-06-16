package com.ul.cic.core.web.settings;

import org.apache.wicket.authentication.IAuthenticationStrategy;
import org.apache.wicket.authorization.IAuthorizationStrategy;
import org.apache.wicket.authorization.IUnauthorizedComponentInstantiationListener;
import org.apache.wicket.settings.ISecuritySettings;
import org.apache.wicket.util.crypt.ICryptFactory;

/**
 *
 * @author cagecfi
 */
public abstract class ConcoursSecuritySettings implements ISecuritySettings {

    @Override
    public IAuthorizationStrategy getAuthorizationStrategy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IAuthenticationStrategy getAuthenticationStrategy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ICryptFactory getCryptFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getEnforceMounts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IUnauthorizedComponentInstantiationListener getUnauthorizedComponentInstantiationListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
