package com.company;
class RLE {

    public static void compressor(String str){
        char char_courant;
        char char_precedent;
        String resultat = "";
        int compteur = 1;

        for (int i = 1 ;i < str.length(); i++ ){
            char_courant = str.charAt(i);
            char_precedent = str.charAt(i-1);

            if (char_courant == char_precedent){
                compteur ++;
            }else{
                if (compteur==1){
                    resultat = resultat + char_precedent;
                }else{
                    resultat = resultat + compteur + char_precedent;
                }
                compteur = 1;
            }
            if ( i == str.length()-1){
                if (compteur==1){
                    resultat = resultat + char_courant;
                }else {
                    resultat = resultat + compteur + char_courant;
                }
            }
        }
        System.out.println(resultat);
    }
    public static void decompressor(String str){
        char char_courant;
        char char_suivant;
        String resultat = "";

        for (int i = 0 ;i < str.length(); i++ ){
            char_courant = str.charAt(i);
            char_suivant = str.charAt(i-1);
            if(isNum(char_courant)){
                resultat = resultat + Integer.parseInt(String.valueOf(char_courant))* char_suivant ;
            }
        }
        System.out.println(resultat);
    }
    public static boolean isNum(char str){
        try{
            Integer.parseInt(String.valueOf(str));
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public static void main(String[] args) {
        compressor("boommm");

    }
}
