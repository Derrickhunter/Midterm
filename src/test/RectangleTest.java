package test;

import java.util.ArrayList;
import java.util.Collections;

import pkgFigure.Rectangle;



class RectangleTest {
	
	@Test
	public void areaTest1() {
		
		double testArea;
		
		Rectangle shape = new Rectangle(3,10);
		
		testArea = shape.area();
		
		System.out.println("The width is: "+shape.getiWidth()+" meters");
		System.out.println("The length is: "+shape.getiLength()+" meters");
		System.out.println("The area of the rectangle is:  "+testArea+" square meters" );
		System.out.println("\n");
		
	}
	
	
	@Test
	public void perimeterTest1() throws Exception {
		
		double testPerimeter;
		
		Rectangle type = new Rectangle(10,10);
		
		testPerimeter = type.perimeter();
		
		System.out.println("The width is: "+type.getiWidth()+" meters");
		System.out.println("The length is: "+type.getiLength()+" meters");
		System.out.println("The perimeter of the rectangle is:  "+testPerimeter+" meters" );
		System.out.println("\n\n");
		
	}

	@Test
	public void rectangleTest1() {
		
ArrayList<Rectangle> areaSort = new ArrayList<Rectangle>();
		
		areaSort.add(new Rectangle(5,3));
		areaSort.add(new Rectangle(10,3));
		areaSort.add(new Rectangle(2,3));
		areaSort.add(new Rectangle(7,3));
		
		Collections.sort(areaSort);
		
		System.out.println("The area sort is:   ");
		
		int index = 0;
		
		for(Rectangle x : areaSort)
		{
			System.out.println((index++)+":  "+x.area()+" square meters");
		}
	}

}


