package org.hyperledger.fabric.sdk.security.random;

import java.security.SecureRandom;

public class SecureRandomFactory {

    private SecureRandomFactory() {}

    public static SecureRandom getSecureRandom() {
        return CachedSecureRandomHolder.instance;
    }

    private static class CachedSecureRandomHolder {
        public static SecureRandom instance = new SecureRandom();

        private CachedSecureRandomHolder() {}
    }
}
