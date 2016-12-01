package elements;

public class Line extends CForm {
	
	//注意：Line类中的Number类不存在rowNumber和rankNumber的属性！
	
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
    	
    	System.out.println("\r\n输出了一个" + line.iterator / 9 + "乘" + line.iterator / 9 + "的表格。");
    }
	
	public Number findNo(int serNumintheLine, Line line) {
		Number number = new Number();
		
		number = line.numbers[serNumintheLine];
		
		return number;
	}
}
