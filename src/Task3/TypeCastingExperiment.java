package Task3;

public class TypeCastingExperiment {
    public static void main(String[] args) {
        System.out.println("=== EKSPERIMEN TYPE CASTING ===");

        // 1. Implicit Casting (Widening)
        int intValue = 100;
        long longValue = intValue; // Automatic conversion
        double doubleValue = longValue; // Automatic conversion

        System.out.println("Implicit Casting:");
        System.out.println("int: " + intValue + " -> long: " + longValue + " -> double: " + doubleValue);

        // 2. Explicit Casting (Narrowing) - Tanpa Data Loss
        double preciseValue = 123.0;
        int convertedInt = (int) preciseValue;

        System.out.println("\nExplicit Casting (no data loss):");
        System.out.println("double: " + preciseValue + " -> int: " + convertedInt);

        // 3. Explicit Casting - Dengan Data Loss
        double decimalValue = 123.789;
        int truncatedInt = (int) decimalValue;

        System.out.println("\nExplicit Casting (with data loss):");
        System.out.println("double: " + decimalValue + " -> int: " + truncatedInt);

        // 4. Overflow Example
        int largeInt = 300;
        byte overflowByte = (byte) largeInt;

        System.out.println("\nOverflow Example:");
        System.out.println("int: " + largeInt + " -> byte: " + overflowByte);

        // 5. Convert long ke int dengan nilai besar
        long bigLong = 3_000_000_000L; // melebihi max int (2,147,483,647)
        int overflowInt = (int) bigLong;
        System.out.println("\nLong to Int (overflow):");
        System.out.println("long: " + bigLong + " -> int: " + overflowInt);

        // 6. Convert float ke int
        float floatValue = 123.456f;
        int intFromFloat = (int) floatValue;
        System.out.println("\nFloat to Int (truncates decimal):");
        System.out.println("float: " + floatValue + " -> int: " + intFromFloat);

        // 7. Convert double ke float
        double bigDouble = 123456789.123456789;
        float floatFromDouble = (float) bigDouble;
        System.out.println("\nDouble to Float (possible precision loss):");
        System.out.println("double: " + bigDouble + " -> float: " + floatFromDouble);
    }
}
