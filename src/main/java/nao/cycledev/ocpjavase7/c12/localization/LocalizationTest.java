package nao.cycledev.ocpjavase7.c12.localization;

import java.io.UnsupportedEncodingException;
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

    public static void localInto(){

        System.out.printf("Default local: %s %n", Locale.getDefault().toString());
        Locale[] locales = Locale.getAvailableLocales();
        for(Locale item: locales){
            if (item.getLanguage().equals("uk"))
                System.out.printf("Locale code: %s, name: %s %n", item, item.getDisplayCountry());
        }

    }

    public static void resourcesTest(){

        Locale.setDefault(new Locale("uk", "UA"));
        Locale locale = Locale.getDefault();
        ResourceBundle resource = ResourceBundle.getBundle("ResourceBundle", locale);

        try {
            System.out.println("Word: " + new String(resource.getString("greeting").getBytes(), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
