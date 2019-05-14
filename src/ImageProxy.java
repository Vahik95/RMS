public class ImageProxy extends Image {

    public RealImage image;

    public ImageProxy(RealImage image, String filePath) {
        super(filePath);
        this.image = image;
    }
}