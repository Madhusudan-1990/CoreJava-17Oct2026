package CounterPattern;

public class LettersDigitVowelsConsonantsUpperLowerSpaceSpecial {

    private static void getCountOfLettersDigitVowelsConsonantsUpperLowerSpaceSpecial(String input) {

        char[] arr = input.toCharArray();

        int digitCount = 0;
        int letterCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int spaceCount = 0;
        int specialCaseCount = 0;

        for (int i = 0; i < arr.length; i++) {

            char ch = arr[i];

            // Category Flags
            boolean isDigit = (ch >= '0' && ch <= '9');

            boolean isUpperCase = (ch >= 'A' && ch <= 'Z');

            boolean isLowerCase = (ch >= 'a' && ch <= 'z');

            boolean isLetter = isUpperCase || isLowerCase;

            boolean isVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');

            boolean isConsonant = isLetter && !isVowel;

            boolean isSpace = (ch == ' ');

            boolean isSpecialCharacter = !isLetter && !isDigit && !isSpace;

            // Counters
            if (isDigit) {
                digitCount++;
            }

            if (isLetter) {
                letterCount++;
            }

            if (isVowel) {
                vowelCount++;
            }

            if (isConsonant) {
                consonantCount++;
            }

            if (isUpperCase) {
                upperCaseCount++;
            }

            if (isLowerCase) {
                lowerCaseCount++;
            }

            if (isSpace) {
                spaceCount++;
            }

            if (isSpecialCharacter) {
                specialCaseCount++;
            }
        }

        System.out.println("No of Digits             : " + digitCount);
        System.out.println("No of Letters            : " + letterCount);
        System.out.println("No of Vowels             : " + vowelCount);
        System.out.println("No of Consonants         : " + consonantCount);
        System.out.println("No of Uppercase Letters  : " + upperCaseCount);
        System.out.println("No of Lowercase Letters  : " + lowerCaseCount);
        System.out.println("No of Spaces             : " + spaceCount);
        System.out.println("No of Special Characters : " + specialCaseCount);
    }

    public static void main(String[] args) {

        getCountOfLettersDigitVowelsConsonantsUpperLowerSpaceSpecial("Auto@2026 Chat GPT!");
    }
}