public class Strings {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i=0; i<n/2; i++) {
            
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String str) {
        int x=0, y=0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)=='N') {
                y++;
            } else if (str.charAt(i)=='S') {
                y--;
            } else if (str.charAt(i)=='E') {
                x++;
            } else {
                x--;
            }
        }

        return (float) Math.sqrt(x*x + y*y);

    }

    public static String compare(String str) {
        String str1 = "Hey";
        String str2 = "Hey";
        String str3 = new String("Hey");
        String result = new String();
        if (str1==str2) {
            result = "str1 and str2 are equal";
        } else {
            result = "str1 and str2 are not equal";
        }

        if (str1==str3) {
            result = "str1 and str3 are equal";
        } else {
            result = "str1 and str3 are not equal";
        }

        return result;
    }

    public static String largestStringLexico(String strArr[]) {
        String result = strArr[0];

        for (int i=1; i<strArr.length; i++) {
            if (strArr[i].compareTo(result)>0) {
                result = strArr[i];
            }
        }

        return result;
    }
    
    public static String Compression(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i=0; i<str.length(); i++) {
            Integer count = 1;

            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));

            if (count>1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    
    public static void StringBuilders() {
        StringBuilder sb = new StringBuilder("");

        for (char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println("Length of StringBuilder is "+ sb.length());
    }

    public static String Uppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i=1; i<str.length(); i++) {
            if (str.charAt(i)==' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();        
    }
    public static void main(String[] args) {
        String fruits[] = {"Mango", "Banana", "Apple"};

        System.out.println(largestStringLexico(fruits));
        // System.out.println(isPalindrome(str));
        // System.out.print(getShortestPath(str));
    }
}
