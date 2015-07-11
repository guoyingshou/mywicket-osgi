package com.tissue.osgi.web.wicket;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

public class MyApplication extends WebApplication {

    public Class<? extends WebPage> getHomePage() {
        return HomePage.class;
    }

    public void init() {
        super.init();
    }

}
