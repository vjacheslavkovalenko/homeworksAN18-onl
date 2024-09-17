public class DocumentNumberProcessor {

    public static void processDocumentNumber(String documentNumber) {

        System.out.println("First two blocks: " + getFirstTwoBlocks(documentNumber));

        System.out.println("Modified document number: " + replaceLetterBlocks(documentNumber));

        System.out.println("Letters in lowercase: " + getLettersInLowercase(documentNumber));

        System.out.println("Letters in uppercase: " + getLettersInUppercase(documentNumber));

        if (containsABC(documentNumber)) {
            System.out.println("Document number contains 'abc' or 'ABC'.");
        } else {
            System.out.println("Document number does not contain 'abc' or 'ABC'.");
        }

        if (startsWithFiveFiveFive(documentNumber)) {
            System.out.println("Document number starts with '555'.");
        } else {
            System.out.println("Document number does not start with '555'.");
        }

        if (endsWithOneATwoBee(documentNumber)) {
            System.out.println("Document number ends with '1a2b'.");
        } else {
            System.out.println("Document number does not end with '1a2b'.");
        }
    }

    private static String getFirstTwoBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        return blocks[0] + "-" + blocks[1];
    }

    private static String replaceLetterBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder modifiedNumber = new StringBuilder();
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].matches("[a-zA-Z]+")) {
                modifiedNumber.append("***");
            } else {
                modifiedNumber.append(blocks[i]);
            }
            if (i < blocks.length - 1) {
                modifiedNumber.append("-");
            }
        }
        return modifiedNumber.toString();
    }

    private static String getLettersInLowercase(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder letters = new StringBuilder();
        for (int i = 1; i < blocks.length; i += 2) {
            letters.append(blocks[i].toLowerCase());
            if (i < blocks.length - 1) {
                letters.append("/");
            }
        }
        return letters.toString();
    }

    private static String getLettersInUppercase(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder letters = new StringBuilder("Letters:");
        for (int i = 1; i < blocks.length; i += 2) {
            letters.append(blocks[i].toUpperCase());
            if (i < blocks.length - 1) {
                letters.append("/");
            }
        }
        return letters.toString();
    }

    private static boolean containsABC(String documentNumber) {
        return documentNumber.toLowerCase().contains("abc");
    }

    private static boolean startsWithFiveFiveFive(String documentNumber) {
        return documentNumber.startsWith("555");
    }

    private static boolean endsWithOneATwoBee(String documentNumber) {
        return documentNumber.endsWith("1a2b");
    }
}
