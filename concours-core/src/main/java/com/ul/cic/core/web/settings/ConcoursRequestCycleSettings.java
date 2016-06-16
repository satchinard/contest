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
