package elements;

public class Line extends CForm {
	
	//ע�⣺Line���е�Number�಻����rowNumber��rankNumber�����ԣ�
	
	public Line build() {
    	Line newLine = new Line();
    	Number singleNum = new Number();
    	
    	newLine.numbers = new Number[81];
    	newLine.iterator = 0;
    	
    	for ( newLine.iterator = 0; newLine.iterator <= 8; newLine.iterator ++ ) {
    		newLine.numbers[newLine.iterator] = singleNum.build(newLine.iterator);
    	}
    	
    	return newLine;
    }
	
	public void printLine(Line line) {
    	for ( line.iterator = 0; line.iterator <= 8; line.iterator ++ ) {
    		System.out.print(line.numbers[line.iterator].value);
    		if ( (line.iterator+1) % 9 == 0 && line.iterator != 0 ) {
    			System.out.println();
    		}
    	}
    	
    	System.out.println("\r\n�����һ��" + line.iterator / 9 + "��" + line.iterator / 9 + "�ı��");
    }
	
	public Number findNo(int serNumintheLine, Line line) {
		Number number = new Number();
		
		number = line.numbers[serNumintheLine];
		
		return number;
	}
}
