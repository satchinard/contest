package com.ul.cic.core.web.login;

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
        Form f = new Form("loginForm");
        f.add(new EmailTextField("email"));
        f.add(new PasswordTextField("pwd"));
        f.add(new CheckBox("email"));
        f.add(new Button("validate"));
        add(f);
    }

}
