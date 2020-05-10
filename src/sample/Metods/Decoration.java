package sample.Metods;

import javafx.scene.layout.Pane;

public abstract class Decoration implements EasterEgg {
    private EasterEgg egg;

    public Decoration(EasterEgg egg) {
        this.egg = egg;
    }

    public void draw(Pane pane) {
        egg.draw(pane);
    }
}
