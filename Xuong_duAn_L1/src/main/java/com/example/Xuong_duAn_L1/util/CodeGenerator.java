package com.example.Xuong_duAn_L1.util;

import java.util.Random;

public class CodeGenerator {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generateRandomCode(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Code length must be positive");
        }
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(ALPHABET.length());
            sb.append(ALPHABET.charAt(index));
        }
        return sb.toString();
    }
}
