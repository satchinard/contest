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
public class ConcoursApplicationSettings implements IApplicationSettings {

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
        return Bytes.megabytes(5);
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
    public void setAccessDeniedPage(Class<? extends Page> type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setClassResolver(IClassResolver icr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDefaultMaximumUploadSize(Bytes bytes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setInternalErrorPage(Class<? extends Page> type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPageExpiredErrorPage(Class<? extends Page> type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUploadProgressUpdatesEnabled(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFeedbackMessageCleanupFilter(IFeedbackMessageFilter ifmf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IFeedbackMessageFilter getFeedbackMessageCleanupFilter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
