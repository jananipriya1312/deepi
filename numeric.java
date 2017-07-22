package multiple;
public class numeric{
String str = " abc d 1234567890pqr 54897";
char[] chars = new char[str.length()];
int i = 0;
for (int j = 0; j < str.length(); j++) {
    char c = str.charAt(j);
    if (Character.isDigit(c)) {
        chars[i++] = c;
        if (j != chars.length - 1)
            continue;
    }
    if (chars[0] == '\0')
        continue;
    String num = new String(chars).trim();
    System.out.println(num);
    chars = new char[str.length()];
    i = 0;

}
}
