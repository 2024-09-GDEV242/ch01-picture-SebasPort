/**
 * This class represents a planet with continents, and habitants from a space view with some stars. All of the objects have multiple instances, like 
 * continents which have multiple circle and triangle instances, aswell as the stars, and persons.
 *
 * 
 * 
 * @author  Sebastian Portillo
 * @version 2016.02.29
 */
public class Picture
{
    private Square background ;
    private Circle planet;
    private Circle continent5;
    private Circle continent6;
    private Circle continent7;
    private Circle continent8;
    private Circle star;
    private Circle star2;
    private Circle star3;
    private Circle star4;
    private Circle star5;
    private Triangle tcontinent1;
    private Triangle tcontinent2;
    private Triangle tcontinent3;
    private Triangle tcontinent4;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;
    private Person person6;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        background = new Square();
        planet = new Circle();
        continent5 = new Circle();
        continent6 = new Circle();
        continent7 = new Circle();
        continent8 = new Circle();
        star = new Circle();
        star2 = new Circle();
        star3 = new Circle();
        star4 = new Circle();
        star5 = new Circle();
        tcontinent1 = new Triangle();
        tcontinent2 = new Triangle();
        tcontinent3 = new Triangle();
        tcontinent4 = new Triangle(); 
        person1 = new Person();
        person2 = new Person();
        person3= new Person();
        person4= new Person();
        person5= new Person();
        person6= new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.moveHorizontal(-320);
            background.moveVertical(-120);
            background.changeSize(550);
            background.changeColor("black");
            background.makeVisible();
            
            planet.moveHorizontal(-100);
            planet.moveVertical(-65);
            planet.changeSize(250);
            planet.changeColor("blue");
            planet.makeVisible();
            
            continent5.moveHorizontal(-80);
            continent5.moveVertical(-30);
            continent5.changeSize(68);
            continent5.changeColor("green");
            continent5.makeVisible();
            
            continent6.moveHorizontal(-0);
            continent6.moveVertical(-40);
            continent6.changeSize(68);
            continent6.changeColor("green");
            continent6.makeVisible();
            
            continent7.moveHorizontal(-60);
            continent7.moveVertical(50);
            continent7.changeSize(68);
            continent7.changeColor("green");
            continent7.makeVisible();
            
            continent8.moveHorizontal(20);
            continent8.moveVertical(60);
            continent8.changeSize(68);
            continent8.changeColor("green");
            continent8.makeVisible();
            
            star.moveHorizontal(100);
            star.moveVertical(-60);
            star.changeSize(5);
            star.changeColor("white");
            star.makeVisible();
            
            star2.moveHorizontal(250);
            star2.moveVertical(-45);
            star2.changeSize(5);
            star2.changeColor("white");
            star2.makeVisible();
            
            star3.moveHorizontal(-150);
            star3.moveVertical(80);
            star3.changeSize(10);
            star3.changeColor("white");
            star3.makeVisible();
            
            star4.moveHorizontal(-160);
            star4.moveVertical(30);
            star4.changeSize(5);
            star4.changeColor("white");
            star4.makeVisible();
            
            star5.moveHorizontal(180);
            star5.moveVertical(80);
            star5.changeSize(10);
            star5.changeColor("white");
            star5.makeVisible();
            
            tcontinent1.moveHorizontal(100);
            tcontinent1.moveVertical(-80);
            tcontinent1.changeSize(40,40);
            tcontinent1.changeColor("green");
            tcontinent1.makeVisible();
            
            tcontinent2.moveHorizontal(40);
            tcontinent2.moveVertical(-45);
            tcontinent2.changeSize(50,50);
            tcontinent2.changeColor("green");
            tcontinent2.makeVisible();
            
            tcontinent3.moveHorizontal(-30);
            tcontinent3.moveVertical(-30);
            tcontinent3.changeSize(60,70);
            tcontinent3.changeColor("green");
            tcontinent3.makeVisible();
            
            tcontinent4.moveHorizontal(70); 
            tcontinent4.moveVertical(40);
            tcontinent4.changeSize(60,70);
            tcontinent4.changeColor("green");
            tcontinent4.makeVisible();
            
            person1.moveHorizontal(20);
            person1.moveVertical(30);
            person1.changeSize(10,10);
            person1.changeColor("white");
            person1.makeVisible();
            
            person2.moveHorizontal(-100);
            person2.moveVertical(-40);
            person2.changeSize(10,10);
            person2.changeColor("white");
            person2.makeVisible();
            
            person3.moveHorizontal(-90);
            person3.moveVertical(-70);
            person3.changeSize(10,10);
            person3.changeColor("white");
            person3.makeVisible();
            
            person4.moveHorizontal(-40);
            person4.moveVertical(-60);
            person4.changeSize(10,10);
            person4.changeColor("white");
            person4.makeVisible();
            
            person5.moveHorizontal(-20);
            person5.moveVertical(-85);
            person5.changeSize(10,10);
            person5.changeColor("white");
            person5.makeVisible();
            
            person6.moveHorizontal(10);
            person6.moveVertical(30);
            person6.changeSize(10,10);
            person6.changeColor("white");
            person6.makeVisible();
            
            
        
            
            
            
            
            
            
            
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background.changeColor("white");
        planet.changeColor("back");
        star.changeColor("black");
        star2.changeColor("black");
        star3.changeColor("black");
        star4.changeColor("black");
        star5.changeColor("black");
        tcontinent1.changeColor("white");
        tcontinent2.changeColor("white");
        tcontinent3.changeColor("white");
        tcontinent4.changeColor("white");
        continent5.changeColor("white");
        continent6.changeColor("white");
        continent7.changeColor("white");
        continent8.changeColor("white");
        person1.changeColor("black");
        person2.changeColor("black");
        person3.changeColor("black");
        person4.changeColor("black");
        person5.changeColor("black");
        person6.changeColor("black");
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
     background.changeColor("black");
     planet.changeColor("blue");
     continent5.changeColor("green");
     continent6.changeColor("green");
     continent7.changeColor("green");
     continent8.changeColor("green");
     star.changeColor("white");
     star2.changeColor("white");
     star3.changeColor("white");
     star4.changeColor("white");
     star5.changeColor("white");
     tcontinent1.changeColor("green");
     tcontinent2.changeColor("green");
     tcontinent3.changeColor("green");
     tcontinent4.changeColor("green");
     person1.changeColor("white");
     person2.changeColor("white");
     person3.changeColor("white");
     person5.changeColor("white");
     person6.changeColor("white");
    }
}
