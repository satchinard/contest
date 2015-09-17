/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.core.web.index;

import de.agilecoders.wicket.core.markup.html.bootstrap.button.BootstrapButton;
import de.agilecoders.wicket.core.markup.html.bootstrap.button.Buttons;
import de.agilecoders.wicket.core.markup.html.bootstrap.form.BootstrapForm;
import org.apache.wicket.markup.html.WebPage;

/**
 *
 * @author cagecfi
 */
public class Index extends WebPage{
    public Index(){
        BootstrapForm bsf = new BootstrapForm("test");
        bsf.add(new BootstrapButton("test1", Buttons.Type.Menu));
    }
}
