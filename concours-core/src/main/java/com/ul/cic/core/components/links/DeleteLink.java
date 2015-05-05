/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.core.components.links;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

/**
 *
 * @author cagecfi
 */
public abstract class DeleteLink<T> extends Link<T> {

    public DeleteLink(String id) {
        super(id);
        this.init();
    }

    public DeleteLink(String id, IModel<T> model) {
        super(id, model);
        this.init();
    }

    private void init() {
        this.add(new AttributeModifier("onclick",
                new Model<>("javascript: return confirm('Voulez-vous vraiment supprimer ?');")));
    }

}
