package factorymethod.pseu;

public class WebDialog extends Dialog {
    public Button createButton() {
        return new HTMLButton();
    }
}
