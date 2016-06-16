package com.ul.cic.core.web.index;

import de.agilecoders.wicket.core.markup.html.bootstrap.button.BootstrapButton;
import de.agilecoders.wicket.core.markup.html.bootstrap.button.Buttons;
import de.agilecoders.wicket.core.markup.html.bootstrap.form.BootstrapForm;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.apache.wicket.extensions.markup.html.form.palette.Palette;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.util.ListModel;

/**
 *
 * @author cagecfi
 */
public class Index extends WebPage {

    public Index() {
        BootstrapForm bsf = new BootstrapForm("test");
        bsf.add(new BootstrapButton("test1", Buttons.Type.Menu));

//        Bootstrap.install(this.getApplication());
        add(bsf);

        List<String> firstList = Arrays.asList("Ada", "Senu", "ATCHINARD",
                "MESSANH", "KANLIH", "Hi!", "Koffi", "Koumah", "Alain");
        final List<String> secondList = new LinkedList<String>();

        IChoiceRenderer<String> rdrer = new IChoiceRenderer<String>() {

            @Override
            public Object getDisplayValue(String t) {
                return t;
            }

            @Override
            public String getIdValue(String t, int i) {
                return t;
            }
        };

        Palette<String> pString = new Palette<>("palette",
                new ListModel<>(firstList), rdrer, 5, true);
        pString.setOutputMarkupId(true);
        pString.clearOriginalDestination();

        pString.setModel(new AbstractReadOnlyModel<Collection<? extends String>>() {

            @Override
            public Collection<? extends String> getObject() {
                return secondList;
            }
        });

        Form f = new Form("testForm");
        f.add(pString);

        add(f);

        RepeatingView rv = new RepeatingView("repeate");
        rv.add(new Label(rv.newChildId(), Model.of("Abalo")));
        rv.add(new Label(rv.newChildId(), Model.of("Abalo")));
        rv.add(new Label(rv.newChildId(), Model.of("Abalo")));
        rv.add(new Label(rv.newChildId(), Model.of("Abalo")));
        rv.add(new Label(rv.newChildId(), Model.of("Abalo")));

        add(rv);

    }
}
