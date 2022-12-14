package toolsqa.designpattern.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;
import static toolsqa.designpattern.utils.Helpers.*;

public class OpenTheBrowser implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        configProperties();
        actor.attemptsTo(
                Open.url(properties.getProperty("url"))
        );
    }

    public static OpenTheBrowser on(){
        return new OpenTheBrowser();
    }
}
