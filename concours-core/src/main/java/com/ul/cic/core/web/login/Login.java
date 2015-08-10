/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.core.web.login;

import de.agilecoders.wicket.core.markup.html.bootstrap.form.BootstrapForm;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.EmailTextField;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;

/**
 *
 * @author cagecfi
 */
public class Login extends WebPage {

    public Login() {
        Form f = new BootstrapForm("loginForm");
        f.add(new EmailTextField("email"));
        f.add(new PasswordTextField("pwd"));
        f.add(new CheckBox("email"));
        f.add(new Button("validate"));
        add(f);
    }

}
