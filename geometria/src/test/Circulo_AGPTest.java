package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circulo_AGPTest {
	@Test
	public void testPerimetro() {
		double PI = 3.1416;
		double radio = 7;
		double radio2=0;
		double radio3=-3;
		
		( 2*radio * PI)=  double perimetro1;
		 (2*radio2 * PI)=  double perimetro2;
		 (2*radio3 * PI)=  double perimetro3;
	}
	
	@Test
	public void testArea() {
		double PI = 3.1416;
		double radio = 7;
		double radio2=0;
		double radio3=-3;
				
		( radio*radio * PI)=  double area1;
		 (radio2*radio2 * PI)=  double area2;
		 (radio3*radio3 * PI)=  double area3;	
				
	}

}

