package nao.cycledev.ocpjavase7.c12.localization;

import java.util.ListResourceBundle;

public class RssBundle extends ListResourceBundle {

    static final Object[][] contents = {
            {"Name", "Nazar"},
            {"price", "(Integer)2456"}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
