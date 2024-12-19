import java.awt.Color;

public class Editor4 {

    /*
     * This program recieves an image, displays it on Canvas and morphs it into the grayscale version of the image.
     * This class uses the Editor3 class to morph the image.
     */

     public static void main(String args[]){
        Color[][] image = Runigram.read(args[0]);
        int n = Integer.parseInt(args[1]);

        Color[][] target = Runigram.grayScaled(image);
		Runigram.setCanvas(image);
		Runigram.morph(image, target, n);
     }
}
