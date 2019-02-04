package pixLab.classes;

import java.awt.Color;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
	public static void testSteganography()
	{
		Picture source = new Picture("jesus.jpg");
		Picture message = new Picture("telletubbies.jpg");
		source.explore();
		message.explore();
		source.hidePicture(message);
		source.explore();
		source.revealPicture();
		source.explore();
		
	}
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorGull()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.explore();
	  
	  seagull.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void Final()
  {
	  Picture scary = new Picture("telletubbies.jpg");
	  Picture koda = new Picture("Koda.jpg");
	  Picture loki = new Picture("Loki.jpg");
	  Picture torino = new Picture("Torino.jpg");
	  koda.mirrorVertical();
	  koda.zeroBlue();
	  koda.zeroGreen();
	  koda.mirrorHorizontal();
	  koda.repaint();
	  koda.explore();
	  loki.mirrorVertical();
	  loki.shiftLeftRight(99);
	  loki.mirrorHorizontal();
	  loki.shiftUpDown(99);
	  loki.zeroRed();
	  loki.explore();
	  torino.mirrorVertical();
	  torino.mirrorHorizontal();
	  torino.shiftLeftRight(30);
	  torino.zeroGreen();
	  
	  torino.explore();
	  
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	 Final();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	 //testSteganography();
  }
}