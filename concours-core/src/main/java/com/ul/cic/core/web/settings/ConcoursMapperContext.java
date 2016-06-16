package com.ul.cic.core.web.settings;

import org.apache.wicket.DefaultMapperContext;

/**
 *
 * @author cagecfi
 */
public class ConcoursMapperContext extends DefaultMapperContext {

    @Override
    public String getPageIdentifier() {
        return "web";
    }

    @Override
    public String getBookmarkableIdentifier() {
        return "text";
    }

}
