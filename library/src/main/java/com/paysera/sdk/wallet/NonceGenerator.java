package com.paysera.sdk.wallet;

import java.security.SecureRandom;
import org.apache.commons.codec.binary.Base64;

public class NonceGenerator implements NonceGeneratorInterface {
    public String generate() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bytes = new byte[256/8];
        secureRandom.nextBytes(bytes);
        return new String(Base64.encodeBase64(bytes));
    }
}
