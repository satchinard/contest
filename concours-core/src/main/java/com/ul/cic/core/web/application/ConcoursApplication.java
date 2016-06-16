package com.ul.cic.core.web.application;

import com.ul.cic.core.web.index.Index;
import com.ul.cic.core.web.settings.ConcoursMapperContext;
import com.ul.cic.core.web.settings.ConcoursSessionListener;
import de.agilecoders.wicket.core.Bootstrap;
import org.apache.wicket.Page;
import org.apache.wicket.core.request.mapper.IMapperContext;
import org.apache.wicket.markup.html.pages.BrowserInfoForm.ClientPropertiesBean;
import org.apache.wicket.protocol.http.ClientProperties;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.lang.Bytes;

/**
 *
 * @author cagecfi
 */
public class ConcoursApplication extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return Index.class;
//        return Login.class;
    }

    @Override
    protected void init() {

//        super.init();
//        setConfigurationType(RuntimeConfigurationType.DEPLOYMENT);
        // url encryption
//        setRootRequestMapper(new CryptoMapper(getRootRequestMapper(), this));
        // debug settings
        getDebugSettings().setAjaxDebugModeEnabled(true);
        getDebugSettings().setOutputMarkupContainerClassName(false);

        // page settings
        getPageSettings().setRecreateMountedPagesAfterExpiry(true);
        getPageSettings().setVersionPagesByDefault(false);

        // security settings
        getSecuritySettings().setEnforceMounts(true);

        // store settings
        getStoreSettings().setMaxSizePerSession(Bytes.kilobytes(512));
        getStoreSettings().setInmemoryCacheSize(10);

        // markup settings
        getMarkupSettings().setStripWicketTags(true);
        getMarkupSettings().setStripComments(true);
        getMarkupSettings().setCompressWhitespace(true);

        // mounting application
//        mountPackage("concours", Login.class);
        ConcoursSessionListener listener = new ConcoursSessionListener();
        get().getSessionListeners().add(listener);

        // bootstrap settings
        Bootstrap.install(this);

        ClientProperties cp = new ClientProperties();
        ClientPropertiesBean cpb = new ClientPropertiesBean();

    }

    @Override
    protected IMapperContext newMapperContext() {
        return new ConcoursMapperContext();
    }

}
