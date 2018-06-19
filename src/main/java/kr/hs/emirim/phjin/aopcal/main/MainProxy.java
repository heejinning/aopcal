package kr.hs.emirim.phjin.aopcal.main;

import kr.hs.emirim.phjin.aopcal.cal.ExeTimeCalculator;
import kr.hs.emirim.phjin.aopcal.cal.ImpCalculator;

public class MainProxy {

	public static void main(String[] args) {
		int num=20;
		ExeTimeCalculator ttcal1 = new ExeTimeCalculator(new ImpCalculator());
		System.out.println(ttcal1.factorial(num));
		
		ExeTimeCalculator ttcal2 = new ExeTimeCalculator(new ImpCalculator());
		System.out.println(ttcal2.factorial(num));
	}
}
