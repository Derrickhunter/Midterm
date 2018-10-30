package pkgFigure;

import java.util.Comparator;

public class SortByVolume implements Comparator<Cuboid> {
	
	SortByVolume(){
		
	}

	@Override
	public int compare(Cuboid volume1, Cuboid volume2) {
		if(volume1.volume() > volume2.volume()) {
			return 1;
		}
		
		else if(volume1.volume() < volume2.volume()) {
			return -1;
		}
		
		return 0;
	}

}
