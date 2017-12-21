public class Mumbling {
    public static String accum(String s) {

        

        for (int i = 0; i < length; i++) {

            for (int j = 0; j <= i; j++)
            {
                char currentChar = s.charAt(i);

                if (j == 0) {
                    result = result + Character.toUpperCase(currentChar);
                }


                else {
                    result = result + Character.toLowerCase(currentChar);
                }
            }
            result = result + "-";
        }
        System.out.println(result);
        return result.substring(0, result.length() -1 ); //don't need a hyphen (-) after d
        System.out.println("Hello");

    }
}

