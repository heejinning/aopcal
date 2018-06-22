package kr.hs.emirim.phjin.aopcal.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.emirim.phjin.aopcal.cal.Calculator;

public class MainXmlAspect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:aopAspect.xml");
		Calculator impcal = ctx.getBean("impCal", Calculator.class);
		long fiveFact1 = impcal.factorial(5);
		System.out.println("impCal.factorial(5) = "+fiveFact1);
		
		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long fiveFact2 = recCal.factorial(5);
		System.out.println("impCal.factorial(5) = "+fiveFact2);
	}
}
