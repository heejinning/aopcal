package kr.hs.emirim.phjin.aopcal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import kr.hs.emirim.phjin.aopcal.aspect.ExeTimeAspect2;
import kr.hs.emirim.phjin.aopcal.cal.Calculator;
import kr.hs.emirim.phjin.aopcal.cal.ImpCalculator;
import kr.hs.emirim.phjin.aopcal.cal.RecCalculator;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
	
	@Bean
	public ExeTimeAspect2 exeTimeAspect() {
		return new ExeTimeAspect2();
	}
	@Bean 
	public Calculator impCal() {
		return new ImpCalculator();
	}

	@Bean 
	public Calculator reCal() {
		return new RecCalculator();
	}
}
	
	
