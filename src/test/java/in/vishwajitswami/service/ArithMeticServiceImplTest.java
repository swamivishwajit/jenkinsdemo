package in.vishwajitswami.service;



import static org.junit.Assert.*;
import org.junit.Test;

public class ArithMeticServiceImplTest {
	
	ArithmeticService service=new ArithmeticServiceImpl();
	
	@Test
	public void testAdd() {
		Double a=10.0;
		Double b=20.0;
		assertEquals(30.0, service.add(a, b), 10.0);
	}

}
