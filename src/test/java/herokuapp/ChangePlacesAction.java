package herokuapp;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ChangePlacesAction {
    @Test
    void performDragAndDropWithActions() {

            open("https://the-internet.herokuapp.com/drag_and_drop");

            SelenideElement source = $("#column-a");
            SelenideElement target = $("#column-b");

            actions().dragAndDrop(source, target).perform();

            source.shouldHave(text("B"));
            target.shouldHave(text("A"));
        }
}
