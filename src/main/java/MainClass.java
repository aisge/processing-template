import processing.core.PApplet;
import processing.sound.SoundFile;

public class MainClass extends PApplet {
    public static void main(String[] args) {
        PApplet.main("MainClass", args);
    }

    public void settings() {
        size(640, 480);
    }

    public void setup() {
        frameRate(30);

        // Sound-Demo
        SoundFile file;
        file = new SoundFile(this, "ok.wav");
        file.play();
    }

    public void draw() {

    }
}
