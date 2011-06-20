package exercise;

/*
 * This class has been 'defactored' deliberately as a starting point for practice
 */
public class Translator {
    private static final String[] DIGITS = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] TENS = {"NaN", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] TEENS = {"NaN", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    
    public String translate(final int i) {
        if (i < 10)
			return DIGITS[i];
		else if (i < 100) {
			if (i%10 == 0)
			    return TENS[i/10];
			else if (i > 20)
			    return translate(i - (i%10)) + " " + translate(i%10);
			else
			    return TEENS[i - 10];
		} else if (i < 1000) {
			if (i%100 > 0)
	        	if (i%100 < 100)
	                return translate(i/100) + " hundred and " + translate(i%100);
	            else
	                return translate(i/100) + " hundred " + translate(i%100);
	        else
	            return translate(i/100) + " hundred";
		} else if (i < 1000000) {
	        if (i%1000 > 0)
	        	if (i%1000 < 100)
	                return translate(i/1000) + " thousand and " + translate(i%1000);
	            else
	                return translate(i/1000) + " thousand " + translate(i%1000);
	        else
	            return translate(i/1000) + " thousand";
		} else if (i < 1000000000) {
			if (i%1000000 > 0)
	        	if (i%1000000 < 100)
	                return translate(i/1000000) + " million and " + translate(i%1000000);
	            else
	                return translate(i/1000000) + " million " + translate(i%1000000);
	        else
	            return translate(i/1000000) + " million";
		} else
            throw new IllegalArgumentException("I don't understand numbers bigger than " + 1000000000);
    }
}
