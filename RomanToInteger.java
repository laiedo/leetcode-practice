public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        char[] source = s.toCharArray();
        for (int i = 0; i < source.length; i++) {
            switch (source[i]) {
                case 'I':
                    if (i < source.length - 1 && (source[i + 1] == 'V' || source[i + 1] == 'X')) {
                        result = result - 1;
                    } else {
                        result = result + 1;
                    }
                    break;
                case 'V':
                    result = result + 5;
                    break;
                case 'X':
                    if (i < source.length - 1 && (source[i + 1] == 'L' || source[i + 1] == 'C')) {
                        result = result - 10;
                    } else {
                        result = result + 10;
                    }
                    break;
                case 'L':
                    result = result + 50;
                    break;
                case 'C':
                    if (i < source.length - 1 && (source[i + 1] == 'D' || source[i + 1] == 'M')) {
                        result = result - 100;
                    } else {
                        result = result + 100;
                    }
                    break;
                case 'D':
                    result = result + 500;
                    break;
                case 'M':
                    result = result + 1000;
                    break;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        RomanToInteger r = new RomanToInteger();
        int result = r.romanToInt("MCMXCIV");
        System.out.print(result);
    }
}
