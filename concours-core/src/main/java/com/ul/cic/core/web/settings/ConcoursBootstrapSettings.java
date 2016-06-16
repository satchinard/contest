package com.ul.cic.core.web.settings;

import de.agilecoders.wicket.core.settings.IBootstrapSettings;
import de.agilecoders.wicket.core.settings.ThemeProvider;
import de.agilecoders.wicket.themes.markup.html.bootswatch.BootswatchTheme;
import de.agilecoders.wicket.themes.markup.html.bootswatch.BootswatchThemeProvider;

/**
 *
 * @author cagecfi
 */
public abstract class ConcoursBootstrapSettings implements IBootstrapSettings {

    @Override
    public ThemeProvider getThemeProvider() {
        return new BootswatchThemeProvider(BootswatchTheme.Cerulean);
    }

}
