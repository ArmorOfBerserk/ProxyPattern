package proxy;

import javafx.scene.image.Image;

public class Proxy implements SubjectInterface {


    SubjectInterface soggetto;
    String pathImgLoad;

    //PER METTERE TUTTO NELLE TONDE BASTA FARE NOMEVAR.ARGS E POI CHIAMO LE FUNZIONI CHE MI SERVONO

    public Proxy(String path) {
        soggetto = null;

        this.pathImgLoad = path;
    }

    @Override
    public Image loadImage() {
        if (soggetto == null) {
            soggetto = new Subject(pathImgLoad);
        }

        return soggetto.loadImage();
    }
}
