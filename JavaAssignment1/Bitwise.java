class Bitwise {
    public static void main(String[] args) {
        int a = 10; // Binary: 00001010
        int b = 6;  // Binary: 00000110

        // Bitwise AND
        int resultAnd = a & b;
        System.out.println("Bitwise AND: " + resultAnd); // Output: 2 (Binary: 00000010)

        // Bitwise OR
        int resultOr = a | b;
        System.out.println("Bitwise OR: " + resultOr); // Output: 14 (Binary: 00001110)

        // Bitwise XOR
        int resultXor = a ^ b;
        System.out.println("Bitwise XOR: " + resultXor); // Output: 12 (Binary: 00001100)

        // Bitwise Complement
        int resultComplement = ~a;
        System.out.println("Bitwise Complement: " + resultComplement); // Output: -11 (Binary: 11110101)

        // Left Shift
        int resultLeftShift = a << 2;
        System.out.println("Left Shift: " + resultLeftShift); // Output: 40 (Binary: 00101000)

        // Right Shift
        int resultRightShift = a >> 2;
        System.out.println("Right Shift: " +  resultRightShift); // Output: 2 (Binary: 00000010)
    }
}