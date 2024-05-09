class Validate {
    public boolean isName(String name) {
        boolean isDigitFound = false;
        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                isDigitFound = true;
            }
        }
        if (isDigitFound == true)
            return false;
        else
            return true;

    }
}

class CheckString {
    public static void main(String[] arg) {
        String s = "He3455llo4";
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                System.out.println(c);
            }

        }

        Validate validate = new Validate();
        System.out.println(validate.isName("Mukilan"));
        System.out.println(validate.isName("Vishnu Pr5asad"));
    }
}