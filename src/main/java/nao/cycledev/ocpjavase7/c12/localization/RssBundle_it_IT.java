package nao.cycledev.ocpjavase7.c12.localization;

import java.util.ListResourceBundle;

public class RssBundle_it_IT extends ListResourceBundle {

    static final Object[][] contents = {
            {"Name", "Che Bella Giornata"},
            {"price", 3000}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
