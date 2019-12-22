package design_pattern.abstract_factory.creator;

import design_pattern.abstract_factory.product.button.Button;
import design_pattern.abstract_factory.product.button.MacButton;
import design_pattern.abstract_factory.product.theme.MacTheme;
import design_pattern.abstract_factory.product.theme.Theme;

public class MacAppFactory implements AppFactory {
    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public Theme getThem() {
        return new MacTheme();
    }
}
