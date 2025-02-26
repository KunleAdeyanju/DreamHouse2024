package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        // actually my moon
        sun = new Circle();
        sun.changeColor("gray");
        sun.moveHorizontal(580);
        sun.moveVertical(-35);
        sun.changeSize(170);
        sun.makeVisible();

        // lava moat
        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(-125);
        sun.moveVertical(175);
        sun.changeSize(900);
        sun.makeVisible();

        // mid-tower left
        wall = new Square();
        wall.changeColor("blue");
        wall.moveVertical(250);
        wall.moveHorizontal(125);
        wall.changeSize(150);
        wall.makeVisible();

        // mid-tower right
        wall = new Square();
        wall.changeColor("blue");
        wall.moveVertical(250);
        wall.moveHorizontal(275);
        wall.changeSize(150);
        wall.makeVisible();

        // third square appeared up top
        // castle left tower lower
        wall = new Square();
        wall.changeColor("blue");
        wall.moveVertical(250);
        wall.moveHorizontal(-25);
        wall.changeSize(150);
        wall.makeVisible();

        // 4th square appeared up top
        // castle left tower upper
        wall = new Square();
        wall.changeColor("blue");
        wall.moveVertical(100);
        wall.moveHorizontal(-25);
        wall.changeSize(150);
        wall.makeVisible();

        // 5th square
        // castle right tower lower
        wall = new Square();
        wall.changeColor("blue");
        wall.moveVertical(250);
        wall.moveHorizontal(425);
        wall.changeSize(150);
        wall.makeVisible();

        // 5th square
        // castle right tower upper
        wall = new Square();
        wall.changeColor("blue");
        wall.moveVertical(100);
        wall.moveHorizontal(425);
        wall.changeSize(150);
        wall.makeVisible();

        // castle notch left 1
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(5);
        window.moveVertical(100);
        window.makeVisible();

        // castle notch left 2
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(65);
        window.moveVertical(100);
        window.makeVisible();

        // castle notch right 1
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(455);
        window.moveVertical(100);
        window.makeVisible();

        // castle notch right 2
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(515);
        window.moveVertical(100);
        window.makeVisible();

        // right castle window upper right
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(485);
        window.moveVertical(170);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("magenta");
        roof.changeSize(20, 30);
        roof.moveHorizontal(510);
        roof.moveVertical(185);
        roof.makeVisible();

        // right castle window upper lower
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(485);
        window.moveVertical(270);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("magenta");
        roof.changeSize(20, 30);
        roof.moveHorizontal(510);
        roof.moveVertical(285);
        roof.makeVisible();

        // left castle window upper lower
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(35);
        window.moveVertical(270);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("magenta");
        roof.changeSize(20, 30);
        roof.moveHorizontal(60);
        roof.moveVertical(285);
        roof.makeVisible();

        // left castle window upper lower
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(35);
        window.moveVertical(170);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("magenta");
        roof.changeSize(20, 30);
        roof.moveHorizontal(60);
        roof.moveVertical(185);
        roof.makeVisible();

        // draw bridge door left
        wall = new Square();
        wall.changeColor("green");
        wall.moveVertical(345);
        wall.moveHorizontal(225);
        wall.changeSize(55);
        wall.makeVisible();

        // draw bridge door right
        wall = new Square();
        wall.changeColor("green");
        wall.moveVertical(345);
        wall.moveHorizontal(280);
        wall.changeSize(55);
        wall.makeVisible();

        // Castles still need roofs
        roof = new Triangle();
        roof.changeSize(50, 300);
        roof.moveHorizontal(285);
        roof.moveVertical(235);
        roof.makeVisible();

        // left middle window
        sun = new Circle();
        sun.changeColor("magenta");
        sun.moveHorizontal(200);
        sun.moveVertical(270);
        sun.changeSize(35);
        sun.makeVisible();

        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(167);
        window.moveVertical(286);
        window.changeSize(22);
        window.makeVisible();

        // right middle window
        sun = new Circle();
        sun.changeColor("magenta");
        sun.moveHorizontal(395);
        sun.moveVertical(270);
        sun.changeSize(35);
        sun.makeVisible();

        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(362);
        window.moveVertical(286);
        window.changeSize(22);
        window.makeVisible();

        // bridges
        wall = new Square();
        wall.changeColor("gray");
        wall.moveVertical(400);
        wall.moveHorizontal(250);
        wall.changeSize(60);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("gray");
        wall.moveVertical(460);
        wall.moveHorizontal(250);
        wall.changeSize(60);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("gray");
        wall.moveVertical(520);
        wall.moveHorizontal(250);
        wall.changeSize(60);
        wall.makeVisible();


    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
