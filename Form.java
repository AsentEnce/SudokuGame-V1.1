package form;

import number.Number;

public class Form {
    Number numbers[];
    int iterator;
    
    public Form() {
    	numbers = new Number[81];
    	iterator = 0;
    }
    
    public Form buildForm() {
    	Form newForm = new Form();
    	Number singleNumber = new Number();
    	
    	for ( newForm.iterator = 0; newForm.iterator <= 80; newForm.iterator ++ ) {
    		newForm.numbers[newForm.iterator] = singleNumber.newNum(newForm.iterator);
    	}
    	
    	return newForm;
    }
    
    public void printForm(Form form) {
    	Number printNumber = new Number();
    	for ( form.iterator = 0; form.iterator <= 80; form.iterator ++ ) {
    		printNumber = form.numbers[iterator];
    		System.out.print(printNumber.value);
    		if ( form.iterator % 8 == 0 && form.iterator != 0 ) {
    			System.out.println();
    		}
    	}
    	
    	System.out.println("\r\nÊä³öÁËÒ»¸ö" + form.iterator / 9 + "³Ë" + form.iterator % 9 + "µÄ½á¹û¡£");
    }
}
