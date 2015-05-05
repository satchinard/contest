/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.core.components.choices;

import java.util.List;
import org.apache.wicket.markup.html.form.DropDownChoice;

/**
 *
 * @author cagecfi
 */
public class OuiNonDropDownChoice extends DropDownChoice<String> {

    public OuiNonDropDownChoice(String id) {
        super(id);
    }

    public OuiNonDropDownChoice(String id, List<? extends String> choices) {
        super(id, choices);
    }

}
