package number;

import java.util.Random;
import form.Form;

public class Number {
    public int value;
    public int serNum;
    public int rowNum;
    public int rankNum;
    
    public Number() {
    	value = 0;
    	serNum = 0;
    	rowNum = 0;
    	rankNum = 0;
    }
    
    public Number newNum(int serNumber) {
    	Number newNumber = new Number();
    	Random random = new Random();
    	newNumber.value = 0;
    	
    	do {
    	    newNumber.value = random.nextInt(10);
    	} while ( newNumber.value == 0 );
    	
    	newNumber.serNum = serNumber;
    	newNumber.rowNum = newNumber.serNum / 9;
    	newNumber.rankNum = newNumber.serNum % 9;
    	
    	return newNumber;
    }
    
    public int value(Number number) {
    	return number.value;
    }
    
//    public Number findNumber(Form form, int serNumber) {
//    	
//    }
    
    public void printNumInfo(Number number) {
    	System.out.println("�����ֵ�ֵ��" + number.value + "��");
    	System.out.println("��λ�ڱ��ĵ�" + number.serNum /9 + "�е�" + number.serNum % 9 + "�С�");
    }
}
