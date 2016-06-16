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
