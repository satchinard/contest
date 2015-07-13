/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.core.web.login;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 *
 * @author cagecfi
 */
public class Login extends WebPage {

    public Login() {
    }

    public Login(IModel<?> model) {
        super(model);
    }

    public Login(PageParameters parameters) {
        super(parameters);
    }

}
