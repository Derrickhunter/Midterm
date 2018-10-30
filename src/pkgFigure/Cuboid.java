package pkgFigure;

public class Cuboid extends Rectangle{
	
	
	private SortByArea type1;
	private SortByVolume type2;
	private int iDepth;
	
	public Cuboid(int iwidth, int ilength, int idepth) {
		
		super(iwidth, ilength);
		
		this.iDepth = idepth;
	}

	public void setiDepth(int idepth) {
	
	this.iDepth = idepth;
	
	}
	
	public int getiDepth() {
		
		return this.iDepth;
	}
	
	public double volume1() {
		
		double TheVolume;
		
		TheVolume = (super.getiLength()) * (super.getiWidth()) * this.iDepth;
		
		return TheVolume;
	}
	
	
	@Override
	public double area() {
		double TheSurfaceArea;
		
		TheSurfaceArea = 2 * ((super.area()) + (super.getiWidth()*this.iDepth) + (super.getiLength() * this.iDepth));
		
		return TheSurfaceArea;
	}
	
	@Override
	public double perimeter() throws Exception{
		throw new Exception("This method isn't valid");
	}

	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

		

}
