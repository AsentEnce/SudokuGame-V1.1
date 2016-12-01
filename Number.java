package elements;

import java.util.Random;

public class Number {
    public int value;
    public int serNum;
    public int rowNum;
    public int rankNum;
    public int serNumintheHorLine;
    public int serNumintheVerLine;
    
    public Number() {
    	value = 0;
    	serNum = 0;
    	rowNum = 0;
    	rankNum = 0;
    	serNumintheHorLine = 0;
    	serNumintheVerLine = 0;
    }
    
    public Number build(int serNum) {
    	Number newNum = new Number();
    	Random random = new Random();
    	
    	do {
    	    newNum.value = random.nextInt(10);
    	} while ( newNum.value == 0 );
    	
    	newNum.serNum = serNum;
    	newNum.rowNum = serNum / 9;
    	newNum.rankNum = serNum % 9;
    	newNum.serNumintheHorLine = newNum.rankNum;
    	newNum.serNumintheVerLine = newNum.rowNum;
    	
    	return newNum;
    }
    
    public void printNumInfo(Number number) {
    	System.out.println("该数字的值为" + number.value + "。");
    	System.out.println("它位于第" + (number.rowNum + 1) + "行第" + (number.rankNum + 1) + "列。");
    }
    
}
