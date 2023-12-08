package proxy.ImageLoadingExample;
public class VirtualProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public VirtualProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
      if (!isSupportedFileType()) { displayFakeImage(); return; };
      if (realImage == null) realImage = new RealImage(fileName);
      realImage.display();
    }

    public boolean isSupportedFileType() {
        return fileName.endsWith(".jpg") || fileName.endsWith(".png");
    }

    public void displayFakeImage() {
        System.out.println("Displaying fake " + fileName);
    }
}