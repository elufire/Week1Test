public class Encode {

    public static void main (String [] args){
        encodeString("Errors in strategy cannot be correct through tactical maneuvers");
    }

    public static void encodeString(String precodeString){

        char [] alphabet = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        String alpha = " abcdefghijklmnopqrstuvwxyz";
        int temp;
        char [] charArray =  precodeString.toLowerCase().toCharArray();

        for(int i=0; i <charArray.length;i++){
          /*
            Character tempChar = new Character(charArray[i]);
            if(tempChar.equals(" ")){
                System.out.print(" ");
            }
            */

            temp = alpha.indexOf(charArray[i]);

            System.out.print(alphabet[27-temp]);


        }
        System.out.println(" ");
    }
}
