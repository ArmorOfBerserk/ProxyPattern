package proxy;

import javafx.scene.image.Image;

public class Subject implements SubjectInterface {

    Image test;

    public Subject(String file) {
        this.test = new Image(file,175,175,true,true);
    }

    @Override
    public Image loadImage() {
        return test;
    }
}
