public class RemoveACharFromAnArray {
    public static void main(String args[]) {
        // 1st example: You can use substring() method to remove first
        // and the last character from String in Java.
        String text = "iMac";
        String withoutFirstCharacter = text.substring(1);
        // index starts at zero
        String withoutLastCharacter = text.substring(0, text.length() - 1);

        System.out.println("Using SubString() method: ");
        System.out.println("input string: " + text);
        System.out.println("without first character: " + withoutFirstCharacter);
        System.out.println("without last character: " + withoutLastCharacter);

        // 2nd Example - You can use StringBuffer or StringBuilder to remove
        // first or last character from String in Java
        String iStore = "iCloud";
        // converting String to StringBuilder
        StringBuilder builder = new StringBuilder(iStore);

        // removing first character
        builder.deleteCharAt(0);
        System.out.println("Using StringBuilder deleteCharAt() method: ");

        System.out.println("input string: " + iStore);
        System.out.println("String after removing first character: " + builder.toString());

        // creating another StringBuilder
        builder = new StringBuilder(iStore);

        // removing last character from String
        builder.deleteCharAt(iStore.length() - 1);

        System.out.println("String after removing last character: " + builder.toString()); }
}
