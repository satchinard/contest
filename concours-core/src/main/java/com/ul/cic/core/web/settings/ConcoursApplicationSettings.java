/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.core.web.settings;

import org.apache.wicket.Page;
import org.apache.wicket.application.IClassResolver;
import org.apache.wicket.feedback.IFeedbackMessageFilter;
import org.apache.wicket.settings.IApplicationSettings;
import org.apache.wicket.util.lang.Bytes;

/**
 *
 * @author cagecfi
 */
public abstract class ConcoursApplicationSettings implements IApplicationSettings {

    @Override
    public Class<? extends Page> getAccessDeniedPage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IClassResolver getClassResolver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bytes getDefaultMaximumUploadSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<? extends Page> getInternalErrorPage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<? extends Page> getPageExpiredErrorPage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isUploadProgressUpdatesEnabled() {
        return true;
    }

    @Override
    public IFeedbackMessageFilter getFeedbackMessageCleanupFilter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
