package nao.cycledev.ocpjavase7.c12.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationTest {

    public static void resourceBundleTest(){

        Locale locale = new Locale("it", "IT");
        Locale.setDefault(locale);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("nao.cycledev.ocpjavase7.c12.localization.ResBundle", locale);

        System.out.println("Default locale: " + locale.getDefault());
        System.out.println("Word: "+ resourceBundle.getString("name") + ", price: " + resourceBundle.getObject("price"));

    }

}
