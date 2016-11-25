package elements;

import elements.Number;

public class CForm {
    public Number numbers[];
    public Line[] horLines;
    public Line[] verLines;
    public int iterator;
    
    public CForm() {
    	numbers = new Number[81];
    	horLines = new Line[8];
    	verLines = new Line[8];
    	iterator = 0;
    }
    
    public CForm build() {
    	CForm cform = new CForm();
    	Number singleNum = new Number();
    	
    	cform.numbers = new Number[81];
    	cform.iterator = 0;
    	
    	for ( cform.iterator = 0; cform.iterator <= 80; cform.iterator ++ ) {
    		cform.numbers[cform.iterator] = singleNum.build(cform.iterator);
    	}
    	
    	for ( cform.iterator = 0; cform.iterator <= 80; cform.iterator ++ ) {
    		
    	}
    	
    	return cform;
    }
    
    public void printCForm(CForm cform) {
    	for ( cform.iterator = 0; cform.iterator <= 80; cform.iterator ++ ) {
    		System.out.print(cform.numbers[cform.iterator].value);
    		if ( (cform.iterator+1) % 9 == 0 && cform.iterator != 0 ) {
    			System.out.println();
    		}
    	}
    	
    	System.out.println("\r\n输出了一个" + cform.iterator / 9 + "乘" + cform.iterator / 9 + "的表格。");
    }
}
