public class Product2 {

    static boolean isPalindrome(String str){
        int indexA = 0;
        int indexB = str.length()-1;

        while( indexA < indexB){

            if(str.charAt(indexA) != str.charAt(indexB)){
                return false;
            }
            indexA++;
            indexB--;
        }


        return true;
    }
}
