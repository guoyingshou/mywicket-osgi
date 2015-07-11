package com.tissue.osgi.web.wicket;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends WebPage {
    private static final long serialVersionUID = 1l;

    public HomePage() {
        add(new Label("test1", "hi.x jdfajfda fda.."));
    }
}
