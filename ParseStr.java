package com.company.ruslan_karimov;


 class ParseStr {
    private int n1;
    private  int n2;
    public static boolean isRoman = false;

    int[] parse (String[]parts) throws NumberFormatException {

        int converted1 = new ConvertNums(parts[0]).convert();
        int converted2 = new ConvertNums(parts[2]).convert();
        boolean isDigitN1 = isDigit(parts[0]);
        boolean isDigitN2 = isDigit(parts[2]);
        boolean isRomanN1 = isRoman(parts[0], converted1);
        boolean isRomanN2 = isRoman(parts[2], converted2);
        if (!isDigitN1 && !isRomanN1) {
            throw new  NumberFormatException();
        }else if (!isDigitN2 && !isRomanN2) {
            throw new  NumberFormatException();
        }else if(!isRomanN1 && isRomanN2 || !isDigitN1 && isDigitN2){
            throw new  NumberFormatException();
        }else if(isRomanN1 && isRomanN2) {
            this.isRoman = true;
            this.n1 = converted1;
            this.n2 = converted2;
        }else{
            this.n1 = Integer.parseInt(parts[0]);
            this.n2 = Integer.parseInt(parts[2]);

        }
        int [] arr = {this.n1, this.n2};

        return arr;
    }

     private boolean isDigit(String str) throws NumberFormatException {

         try {
             int n = Integer.parseInt(str);
             return n > 0 && n < 11;
         } catch (NumberFormatException e) {
             return false;
         }
     }

     private boolean isRoman (String str, int converted) {

         boolean isRoman = false;
         if (converted > 0) {
             isRoman = true;
         }
         return isRoman;
     }
}
