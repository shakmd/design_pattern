package design_pattern.abstract_factory.creator;

import design_pattern.abstract_factory.product.button.Button;
import design_pattern.abstract_factory.product.button.LinuxButton;
import design_pattern.abstract_factory.product.theme.LinuxTheme;
import design_pattern.abstract_factory.product.theme.Theme;

public class LinuxAppFactory implements AppFactory {
    @Override
    public Button getButton() {
        return new LinuxButton();
    }

    @Override
    public Theme getThem() {
        return new LinuxTheme();
    }
}
