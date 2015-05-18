package net.calvin.analysis.test;

import static org.junit.Assert.*;
import net.calvin.analysis.AnalysisModule;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnalysisModuleTest {

	String ticker;
	
	@Before
	public void init() throws Exception {
		System.out.println("Setting up ...");
		ticker = "AAPL";
	}

	@After
	public void destroy() throws Exception {
		System.out.println("Tearing down ...");
		ticker = null;
	}

	@Test
	public void testGetStockReturnNotNull() {
		assertNotNull(AnalysisModule.getStock(ticker));
	}
	
	@Test
	public void testGetStockReturnNotEmpty() {
		assertTrue(AnalysisModule.getStock(ticker).size() > 0);
	}
	

}
