package nao.cycledev.ocpjavase7.c12.localization;

<<<<<<< HEAD
=======
import java.io.UnsupportedEncodingException;
>>>>>>> 283dacc6658ad72dc6df8e25c5af15c3a9a84e16
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationTest {

<<<<<<< HEAD
    public static void resourceBundleTest(){

        Locale locale = new Locale("it", "IT");
        Locale.setDefault(locale);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("nao.cycledev.ocpjavase7.c12.localization.ResBundle", locale);

        System.out.println("Default locale: " + locale.getDefault());
        System.out.println("Word: "+ resourceBundle.getString("name") + ", price: " + resourceBundle.getObject("price"));

    }

=======
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
>>>>>>> 283dacc6658ad72dc6df8e25c5af15c3a9a84e16
}
