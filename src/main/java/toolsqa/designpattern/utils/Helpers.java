package toolsqa.designpattern.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WithByLocator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Helpers {

    public static Properties properties;

    public static void configProperties(){
        properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/data/data.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static WebElementFacade getRandomElement(Actor actor, Target target) {
        List<WebElementFacade> listElements = target.resolveAllFor(actor);
        int position = (int) (Math.random()*listElements.size());
        return listElements.get(position);
    }
}
