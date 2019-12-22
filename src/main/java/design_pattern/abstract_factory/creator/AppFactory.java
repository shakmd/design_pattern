/*
Summary->
This design pattern is the successor of factory method pattern

In factory method pattern, only a single type of product is created

Whereas in abstract factory pattern, a factory can return product of different parent types(class/interface etc) which
makes sense only together

Example -> If you are creating a DarkTheme and LightTheme then you may have following interface and classes:
ThemeFactory(Interface) has two method -> Background getBackground() and Contrast getContrast()
a) DarkThemFactory implements ThemeFactory b) LightThemeFactory implements LightThemeFactory

Background is a class (which has multiple concretion like WhiteBackground and BlackBackground)
Contrast is a class (which has multiple concretion like WhiteContrast and BlackContrast

Thing to NOTE -> Some type of Background only makes sense with some type of Contrast
This is where Abstract Factory kicks in
 */

package design_pattern.abstract_factory.creator;

import design_pattern.abstract_factory.product.button.Button;
import design_pattern.abstract_factory.product.theme.Theme;

public interface AppFactory {
    public Button getButton();

    public Theme getTheme();
}
