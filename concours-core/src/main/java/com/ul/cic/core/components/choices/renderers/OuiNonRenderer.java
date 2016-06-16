package com.ul.cic.core.components.choices.renderers;

import org.apache.wicket.markup.html.form.IChoiceRenderer;

/**
 *
 * @author cagecfi
 */
public class OuiNonRenderer implements IChoiceRenderer<Boolean> {

    @Override
    public Object getDisplayValue(Boolean t) {
        if (t) {
            return true;
        }
        if (!t) {
            return false;
        }
        return null;
    }

    @Override
    public String getIdValue(Boolean t, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
