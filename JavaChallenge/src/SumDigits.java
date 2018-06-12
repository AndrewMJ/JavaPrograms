public class SumDigits {

    public static void main(String[] args) {
        String numbersString1 = "12378923254";
        String numbersString2 = "53625484376";
        String numbersString3 = "71941648682";

        String[] arr = {numbersString1,numbersString2,numbersString3};
        int sum =  SumOfArray(arr);
        System.out.println(sum);

    }

    public static int SumOfArray(String[] sumArray){
        String total = "";
        for(int i = 0; i < sumArray.length; i++){
            total +=sumArray[i];
        }
        return SumOfString(total);
    }

    public static int SumOfString(String str){
        int add = 0;
        for(int i = 0; i < str.length(); i++){
            char n = str.charAt(i);
            add += Character.getNumericValue(n);
        }


        return add;
    }
}
