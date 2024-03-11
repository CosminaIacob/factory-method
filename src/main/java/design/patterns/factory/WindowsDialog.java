package design.patterns.factory;

import design.patterns.buttons.Button;
import design.patterns.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
