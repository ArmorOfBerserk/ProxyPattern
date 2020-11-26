package controller;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import model.Main;
import proxy.Proxy;
import proxy.SubjectInterface;

import java.util.ArrayList;

public class Controller {

    public FlowPane flowPane;
    ArrayList<ImageviewProxy> gallery;

    public void initialize(){
        gallery = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            gallery.add(new ImageviewProxy(new Proxy(Main.trovaUrl("res/pkm" + i + ".png"))));
        }

        gallery.forEach(caricatore -> {
            flowPane.getChildren().add(caricatore);
  /*          istruzione1;
            istruzione2;*/
        });


    }

    private class ImageviewProxy extends ImageView{

        SubjectInterface soggetto;


        public ImageviewProxy(SubjectInterface soggetto) {
            super();
            if ( soggetto instanceof Proxy ){
                Image proxy = new Image(Main.trovaUrl("res/proxy.png"), 175,175, true,true);
                this.soggetto = soggetto;
                this.setImage(proxy);

                this.setOnMouseClicked(event -> this.setImage(soggetto.loadImage()));
            }

            else{
                this.soggetto = soggetto;
                this.setImage(soggetto.loadImage());
            }


        }
    }
}


