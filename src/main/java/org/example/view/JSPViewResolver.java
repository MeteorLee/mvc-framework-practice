package org.example.view;

import static org.example.view.RedirectView.DEFAULT_REDIRECT_PREFIX;

public class JSPViewResolver implements ViewResolver{
    @Override
    public View resolveVies(String viewName) {
        if (viewName.startsWith(DEFAULT_REDIRECT_PREFIX)) {
            return new RedirectView(viewName);
        }

        return new JSPView(viewName + ".jsp");
    }
}
