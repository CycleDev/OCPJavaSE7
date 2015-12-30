package nao.cycledev.ocpjavase7.c12.localization;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationTest {

    public static void resourceBundleTest(){

        Locale locale = new Locale("it", "IT");
        Locale.setDefault(locale);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("nao.cycledev.ocpjavase7.c12.localization.RssBundle");

        System.out.println("Default locale: " + locale.getDefault());
        System.out.println("Word: "+ resourceBundle.getString("Name") + ", price: " + resourceBundle.getObject("price"));

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

        ResourceBundle resource = ResourceBundle.getBundle("ResourceBundle");
        System.out.println("Word: " + resource.getString("greeting"));

    }

    public static void test(){

        Calendar c = Calendar.getInstance();
        c.set(2010, 11, 14);                    // December 14, 2010
        // (month is 0-based)
        Date d2 = c.getTime();
        Locale locIT = new Locale("it", "IT");  // Italy
        Locale locPT = new Locale("pt");        // Portugal
        Locale locBR = new Locale("pt", "BR");  // Brazil
        Locale locIN = new Locale("hi", "IN");  // India
        Locale locJA = new Locale("ja");        // Japan
        Locale locUA = new Locale("uk");
        DateFormat dfUS = DateFormat.getInstance();
        System.out.println("US       " + dfUS.format(d2));
        DateFormat dfUSfull = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("US full  " + dfUSfull.format(d2));
        DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
        System.out.println("Italy    " + dfIT.format(d2));
        DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
        System.out.println("Portugal " + dfPT.format(d2));
        DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
        System.out.println("Brazil   " + dfBR.format(d2));
        DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
        System.out.println("India    " + dfIN.format(d2));
        DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
        System.out.println("Japan    " + dfJA.format(d2));
        DateFormat dfUA = DateFormat.getDateInstance(DateFormat.FULL, locUA);
        System.out.println("Ukraine  " + dfUA.format(d2));

    }
}
