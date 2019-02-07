 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String str = "";
        for(int x = 0; x < numberOfStars; x++){  
                str += "*";
        }
        return str;
    }
    
    public static String getTriangle(int numberOfRows) {
        String star = "";
        for(int i = 1; i <= numberOfRows; i++){
            for(int j = 1; j <= i; j++){
                if(j <= i){
                    star += "*";
                }
            }
            star += "\n";
        }
     return star;
}

    public static String getSmallTriangle() {
         String star = "";
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                if(j <= i){
                    star += "*";
                }
            }
            star += "\n";
        }
     return star;
    }

    public static String getLargeTriangle() {
         String star = "";
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                if(j <= i){
                    star += "*";
                }
            }
            star += "\n";
        }
     return star;
    }
}
