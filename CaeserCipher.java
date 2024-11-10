public class CaeserCipher
{
    public static void main(String [] args)
    {
        System.out.println(shiftLetters("nsqsdkvpyboxcsmc"));
    }

    public static String shiftLetters(String basicText)
    {
        String encodedText = "";
        for(int i = 0; i<basicText.length(); i++)
        {
            encodedText += (char)(basicText.charAt(i)+10);
        }
        return encodedText;
    }
}