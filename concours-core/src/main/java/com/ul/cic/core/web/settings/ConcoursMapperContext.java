/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
