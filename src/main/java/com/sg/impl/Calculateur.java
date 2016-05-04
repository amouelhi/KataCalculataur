package com.sg.impl;

public class Calculateur {
	
	public int calculateSum(String value) throws Exception{
		String[] numbers = value.split(",|\n");
		
		if(isEmptyStr(value)){
		return 0;
		}
		
		if(value.length() == 1){
			return getIntValue(value);
		}else{
		return getSomme(numbers);
		}
	}
	
	private boolean isEmptyStr(String str){
		return str.isEmpty();
	}
	private int getIntValue(String strInput){
		return Integer.parseInt(strInput);
	}
	
	private int getSomme(String[] numbers) throws Exception{
	    int sum =0;
		for(String value: numbers){
			int val= getIntValue(value);
			if(val<0){
				throw new Exception("Negative input");
			}else{
				if(val > 1000)
					continue;
			sum+=val;
			}
		}
		return sum;
	}

}
