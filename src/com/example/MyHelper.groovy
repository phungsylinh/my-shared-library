// src/com/example/MyHelper.groovy
package com.example

class MyHelper {
    static String generateRandomString(int length) {
        def random = new Random()
        def buffer = new StringBuffer()
        for (int i = 0; i < length; i++) {
            buffer.append(random.nextInt(26) + 'a')
        }
        return buffer.toString()
    }
}
