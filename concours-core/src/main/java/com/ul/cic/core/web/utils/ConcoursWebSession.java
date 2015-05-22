/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.core.web.utils;

import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;

/**
 *
 * @author cagecfi
 */
public class ConcoursWebSession extends WebSession{

    public ConcoursWebSession(Request request) {
        super(request);
    }
    
}
