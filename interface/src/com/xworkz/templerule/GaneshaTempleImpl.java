package com.xworkz.templerule;

public class GaneshaTempleImpl implements TempleRules {

	@Override
	public double openTime() {

		System.out.println("Running openTime in GaneshaTempleImpl ");
		return 9.30d;
	}

	@Override
	public double closeTime() {
		System.out.println("running closeTime in GaneshaTempleImpl");
		return 5.30d;
	}

	@Override
	public double specialEntry() {
		System.out.println("running specialEntry in GaneshaTempleImpl");
		return 500.5d;
	}

	@Override
	public String templeName() {
		System.out.println("running templeName in GaneshaTempleImpl");
		return TempleRules.GANESHA_TEMPLE;
	}

}
