package design.patterns.factory;

import design.patterns.buttons.Button;
import design.patterns.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
