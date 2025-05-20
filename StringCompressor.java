public class StringCompressor {
    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char currentChar = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar);
                compressed.append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        compressed.append(currentChar);
        compressed.append(count);
        return compressed.toString();
    }
}



//-------------------------------------------------------------------------------------------------------------------

/*public class Decompressor {
    public static String decompressString(String compressed) {
        if (compressed == null || compressed.isEmpty()) {
            return compressed;
        }
        StringBuilder decompressed = new StringBuilder();
        int length = compressed.length();
        for (int i = 0; i < length; i++) {
            char currentChar = compressed.charAt(i);
            StringBuilder countStr = new StringBuilder();
            // Read the number following the character
            while (i + 1 < length && Character.isDigit(compressed.charAt(i + 1))) {
                countStr.append(compressed.charAt(i + 1));
                i++;
            }
            int count = 1;
            if (countStr.length() > 0) {
                count = Integer.parseInt(countStr.toString());
            }
            for (int j = 0; j < count; j++) {
                decompressed.append(currentChar);
            }
        }
        return decompressed.toString();
    }
}  */