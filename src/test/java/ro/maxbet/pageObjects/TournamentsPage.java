package ro.maxbet.pageObjects;

import lombok.Getter;
import org.openqa.selenium.By;
import ro.maxbet.Elements.TextField;

public class TournamentsPage extends AbstractPage{
    private By tournamentsPageTitle = By.cssSelector(".base-info.ng-star-inserted > .title");

    @Getter
    TextField TournamentsPageTitle = new TextField(tournamentsPageTitle,"The title of the 'Tournaments' page");
}
