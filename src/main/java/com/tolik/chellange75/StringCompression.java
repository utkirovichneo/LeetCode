package com.tolik.chellange75;

public class StringCompression {

    public int compress(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length) {
            char c = chars[read];
            int count = 0;
                while(read < chars.length && chars[read] == c) {
                    read++;
                    count++;
                }

                chars[write] = c;
                write++;
                if(count > 1) {
                    for(char c1 : String.valueOf(count).toCharArray()) {
                        chars[write] = c1;
                        write++;
                    }
                }
        }
        return write;
    }
}
