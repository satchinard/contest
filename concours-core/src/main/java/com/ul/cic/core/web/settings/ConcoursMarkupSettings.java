/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.core.web.settings;

import com.ul.cic.core.constantes.ConcoursApplicationConstantes;
import org.apache.wicket.settings.IMarkupSettings;

/**
 *
 * @author cagecfi
 */
public abstract class ConcoursMarkupSettings implements IMarkupSettings {

    @Override
    public boolean getAutomaticLinking() {
        return false;
    }

    @Override
    public boolean getCompressWhitespace() {
        return true;
    }

    @Override
    public String getDefaultAfterDisabledLink() {
        return null;
    }

    @Override
    public String getDefaultBeforeDisabledLink() {
        return null;
    }

    @Override
    public String getDefaultMarkupEncoding() {
        return ConcoursApplicationConstantes.DEFAULT_ENCODING;
    }

    @Override
    public boolean getStripComments() {
        return true;
    }

    @Override
    public boolean getStripWicketTags() {
        return true;
    }

    @Override
    public boolean getThrowExceptionOnMissingXmlDeclaration() {
        return true;
    }

}
