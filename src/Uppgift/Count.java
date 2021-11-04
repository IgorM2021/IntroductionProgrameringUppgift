package Uppgift;//klass som räknar raderna, har koll på antalet tecken och har koll på om användaren har skrivit ordet stop eller inte


public class Count {

    private int count = 0;
    private int rows = 0;
    private int words = 0;
    private String longestWord = "";

    //Skapa konstruktor Test2
    public Count() {

    }

    public boolean readLine(String line) {
        if (line.equalsIgnoreCase("stop"))
            return false;                                     //stoppa kod med inmatat ord "stop"
        if (line.isBlank())
            return true;                                      //töm rad skall inte räknas
        //  if(line.length() > longestWord.length())
        //  longestWord = line;
        rows++;                                                //räkna rader
        words++;                                                //räkna ord
        String tempWord = "";
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetterOrDigit(line.charAt(i))) {   //om ord är bokstav eller tal inbuilt java method
                count++;                                       //räkna bokstav
                tempWord += line.charAt(i);
            }
            if (Character.isWhitespace(line.charAt(i))) {      //kolla mellanslag, tab...räkna inte
                words++;
                if (tempWord.length() > longestWord.length()) {
                    longestWord = tempWord;
                }
                tempWord = "";
            }
            if(tempWord.equalsIgnoreCase("stop")){
                count-=4;         //ta bort 4 bokstav från stop ord
                words--;         //ta bort stop ord
                return false;
            }
        }
        if (tempWord.length() > longestWord.length()) {
            longestWord = tempWord;
        }
        return true;
    }
    //metoden som retunerar den längst ord
    public String longWord() {
        return longestWord;
    }
    //metoden som retunerar antal ord
    public int numberWord() {
        return words;
    }
    //metoden som retunerar antal bokstav
    public int numberLetter() {
        return count;
    }
//metoden som retunerar antal rader
    public int numberRows() {
        return rows;
    }
}
