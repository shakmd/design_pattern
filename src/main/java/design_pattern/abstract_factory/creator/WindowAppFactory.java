package design_pattern.abstract_factory.creator;

import design_pattern.abstract_factory.product.button.Button;
import design_pattern.abstract_factory.product.button.WindowsButton;
import design_pattern.abstract_factory.product.theme.Theme;
import design_pattern.abstract_factory.product.theme.WindowsTheme;

public class WindowAppFactory implements AppFactory {
    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public Theme getTheme() {
        return new WindowsTheme();
    }
}
