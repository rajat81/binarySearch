package com.google.rajatswnt;
import java.util.*;

public class StringCompression {
    public int compress(char[] chars) {
        int charCount = 0;
        char prevChar = '\n';
        boolean countFlag = false;

        for(int i = 0; i< chars.length; i++) {
            if(chars[i] == prevChar) {
                if(countFlag) {
                    if(charCount < 9) {
                        chars[i - 1 - charCount] = String.valueOf(++charCount).charAt(0);
                        prevChar = chars[i];
                    } else {
                        charCount = 0;
                        prevChar = '\n';
                        countFlag = false;
                    }
                } else {
                    countFlag = true;
                    chars[i] = String.valueOf(++charCount).charAt(0);
                }
            } else {
                prevChar = chars[i];
                charCount = 1;
                countFlag = false;
            }
        }

        return charCount;
    }
}
