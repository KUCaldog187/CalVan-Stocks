package net.calvin.analysis;

import java.util.ArrayList;

import net.calvin.analysis.pojo.Stock;

public class AnalysisModule {
	
	public static ArrayList<Stock> getStock(String... tickers){
		
		ArrayList<Stock> stockList = new ArrayList<Stock>(); 
		for(String ticker : tickers){
			//TODO Get Stocks from Vanessa Module
		}
		return stockList;	
	}

}
