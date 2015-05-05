/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.core.web.settings;

import com.ul.cic.core.constantes.ConcoursApplicationConstantes;
import org.apache.wicket.settings.IRequestCycleSettings;

/**
 *
 * @author cagecfi
 */
public abstract class ConcoursRequestCycleSettings implements IRequestCycleSettings {

    @Override
    public String getResponseRequestEncoding() {
        return ConcoursApplicationConstantes.DEFAULT_ENCODING;
    }

}
