



public class NumberUtilities {
    
    public static String getRange(int stop) {
        String range ="";
        for(int x = 0; x < stop; x++){
            range = range + Integer.toString(x);
        }
        
        return range;
           
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for(int x = start; x < stop; x++){
            range = range + Integer.toString(x);
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for(int x = start; x < stop; x+= step){
            range = range + Integer.toString(x);
        }
        return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        String range = "";
        for(int x = start; x < stop; x++){
            if(x % 2 == 0){
                range = range + Integer.toString(x);
            }
        }
        return range;
    }


    public static String getOddNumbers(int start, int stop) {
        String range = "";
        for(int x = start; x < stop; x++){
            if(x % 2 != 0){
                range = range + Integer.toString(x);
            }
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String range = "";
        for(int x = start; x <= stop; x++){
           Double y = Math.pow(x, exponent);
           int z = y.intValue();
                range = range + Integer.toString(z);
        }
        return range;
    }
    
   
}
