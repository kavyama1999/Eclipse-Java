package com.xworkz.templerule;

public class TempleAdmin {

	private TempleRules templerules;

	public TempleAdmin(TempleRules templerules) {
		this.templerules = templerules;
	}

	public void templeAdmin() {
		if (templerules != null) {

			double db = templerules.closeTime();
			System.out.println("Closing Time:" + db);
		} else {
			System.out.println("Close time is not mentioned");
		}

	}

	public void temple() {
		if (templerules != null) {
			double tm = templerules.openTime();
			System.out.println("open Time:" + tm);
		} else {
			System.out.println("Open time is not mentioned");
		}
	}

	public void temples() {
		if (templerules != null) {
			double bl = templerules.specialEntry();
			System.out.println("Specisl Entry fess:" + bl);
		}

		else {
			System.out.println("Special entry fees not metioned");
		}
	}

//	***********************************************************

}

//if(metrorules.cleaness()&& metrorules.excessLaguage())
