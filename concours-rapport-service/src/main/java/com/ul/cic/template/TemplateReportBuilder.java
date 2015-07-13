/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ul.cic.template;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;

/**
 *
 * @author cagecfi
 */
public abstract class TemplateReportBuilder extends JasperReportBuilder {

    private static StyleBuilder textStyle;
    private static StyleBuilder columnHeaderStyle;
    private static StyleBuilder titleStyle;
    private static StyleBuilder boldStyle;
    private static StyleBuilder underlinedStyle;
    private static StyleBuilder italicStyle;
    private static StyleBuilder rowStyle;
    private static StyleBuilder headerLeftStyle;
    private static StyleBuilder headerRightStyle;
    private static StyleBuilder imageStyle;
    
}
