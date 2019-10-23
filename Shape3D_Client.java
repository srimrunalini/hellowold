package shapes;

class Shape3D { 
    public double getArea(){  return 0.0;}; 
    public double getVolume(){  return 0.0;}; 
    public String toString(){ return " ";}; 
    public boolean equals(Object obj){ return false;}; 
}

// Class SquarePyramid. extends Shape3D 
// Represents a pyramid with a square as its base. 
 class SquarePyramid extends Shape3D { 
    private double length; 
    private double height;

    public SquarePyramid() { 
        length = 0; 
        height = 0; 
    } 
    public SquarePyramid(double l, double h) { 
        length = l; 
        height = h; 
    }

    public double getLength() { 
        return length; 
    }

    public double getHeight() { 
        return height; 
    }

    public double getArea() { 
             return length * (length + Math.sqrt(length * length + 4 * height * height)); 
    }

    public double getVolume() { 
          return  length * length * height / 3.0; 
          
    }

    public String toString() { 
        return "For this square pyramid the base has the length = " + length + " and the height = " + height; 
    }

    public boolean equals(Object obj) { 
        if (obj instanceof SquarePyramid) { 
            SquarePyramid other = (SquarePyramid) obj; 
            return length == other.length && height == other.height; 
        } 
        else 
            return false; 
    } 
}

// Class Sphere. extends Shape3D 
// Represents a perfect sphere.

 class Sphere extends Shape3D { 
    private double radius;

    public Sphere() { 
        radius = 0; 
    }

    public Sphere(double r) { 
        radius = r; 
    }

    public double getRadius() { 
        return radius; 
    }

    public double getArea() { 
        return  4 * Math.PI * Math.pow(radius, 2); 
    }

    public double getVolume() { 
        return  4.0 * Math.PI * Math.pow(radius, 3) / 3.0; 
    }

    public String toString() { 
        return "The radius of this sphere = " + radius; 
    }

    public boolean equals(Object obj) { 
       // write code here use instance of operator
    	return true;
    	
    		
    } 
}

// Class RectangularPrism. extends Shape3D 
// Represents a three-dimensional rectangular shape.

 class RectangularPrism extends Shape3D { 
    private double length; 
    private double width; 
    private double height;

    public RectangularPrism() { 
      // write code here 
    }

    public RectangularPrism(double l, double w, double h) { 
      System.out.print(2 * (length * width + width * height + length * height));
    }

       public double getLength() { 
      return   length * width * height; 
    }

    public double getWidth() { 
       // write code here 
    	return width;
    }
    

     public double getHeight() { 
        return height; 
    }

    public double getArea() { 
        // write code here 
    	return length*width;
    	
    }

    public double getVolume() { 
       // write code here 
    	return length*width*height;
    }

    public String toString() { 
        return "For this rectangular prism the base has the length = " + length + " and the width = " + width + "\nThe height of the prism = " + height; 
    }

    public boolean equals(Object obj) { 
       // write code here use instance of operator
    	return true;
    	
    } 
}

// Class Cube, subclass of RectangularPrism 
// Represents a perfect cube.

 class Cube extends RectangularPrism { 
    public Cube() { 
    // write code here 
    }

    public Cube(double size) { 
    // write code here 
    }

    public String toString() { 
        return "For this cube all sides = " + super.getLength(); 
    } 
}



//Client to test them all! 
public class Shape3D_Client { 
    public static final int MAX = 6; 
    public static void main(String[] args) { 
        Shape3D[] shapes = new Shape3D[MAX]; 
// create all objects with respective consturctors
// display 
        System.out.println("Square Pyramid");
        SquarePyramid sp=new SquarePyramid(73,97);
        System.out.println(sp.getArea());
        System.out.println(sp.getHeight());
        System.out.println(sp.getLength());
        System.out.println(sp.getVolume());

        System.out.println("Sphere");    
        Sphere mb=new Sphere(83);
        System.out.println(mb.getArea());
        System.out.println(mb.getRadius());
        System.out.println(mb.getVolume());


       
    } 
}