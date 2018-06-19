package kr.hs.emirim.phjin.aopcal.main;

import kr.hs.emirim.phjin.aopcal.cal.Calculator;
import kr.hs.emirim.phjin.aopcal.cal.ImpCalculator;
import kr.hs.emirim.phjin.aopcal.cal.RecCalculator;

public class MainStart {

	public static void main(String[] args) {
		Calculator cal1 = new ImpCalculator();
		long f1 = cal1.factorial(4);
		System.out.println("Imp 100 : " + f1);
		
		
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(4);
		System.out.println("Rec 100 : " + f2);
	}

}
