import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * Represents a user in the secure messaging system.
 * Each user has a username and a unique RSA key pair.
 */
public class User {
    private final String username;
    private final KeyPair keyPair;

    public User(String username) throws Exception {
        this.username = username;
        this.keyPair = CryptoUtils.generateKeyPair();
    }

    public String getUsername() {
        return username;
    }

    public PublicKey getPublicKey() {
        return keyPair.getPublic();
    }

    public PrivateKey getPrivateKey() {
        return keyPair.getPrivate();
    }

    /**
     * Returns the public key as a Base64-encoded string.
     */
    public String getPublicKeyBase64() {
        return CryptoUtils.publicKeyToBase64(getPublicKey());
    }

    /**
     * Returns the private key as a Base64-encoded string.
     */
    public String getPrivateKeyBase64() {
        return CryptoUtils.privateKeyToBase64(getPrivateKey());
    }

    /**
     * Static factory for reconstructing a user from stored keys.
     */
    public static User fromKeys(String username, String base64Public, String base64Private) throws Exception {
        PublicKey pub = CryptoUtils.publicKeyFromBase64(base64Public);
        PrivateKey priv = CryptoUtils.privateKeyFromBase64(base64Private);
        return new User(username, pub, priv);
    }

    // Private constructor for fromKeys
    private User(String username, PublicKey publicKey, PrivateKey privateKey) {
        this.username = username;
        this.keyPair = new KeyPair(publicKey, privateKey);
    }
}