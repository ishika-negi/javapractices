/**
 * Demonstrates secure chat/message exchange between two users.
 */
public class ChatDemo {
    public static void main(String[] args) {
        try {
            // Create users Alice and Bob
            User alice = new User("Alice");
            User bob = new User("Bob");

            // Display public keys (simulate sharing for encryption)
            System.out.println("Alice's public key (Base64): " + alice.getPublicKeyBase64());
            System.out.println("Bob's public key (Base64): " + bob.getPublicKeyBase64());

            // Alice sends Bob a secret message
            String messageFromAlice = "Hello Bob, this is Alice!";
            String encryptedForBob = CryptoUtils.encrypt(messageFromAlice, bob.getPublicKey());
            System.out.println("\nAlice sends encrypted message to Bob: " + encryptedForBob);

            // Bob decrypts Alice's message
            String decryptedByBob = CryptoUtils.decrypt(encryptedForBob, bob.getPrivateKey());
            System.out.println("Bob decrypts and reads: " + decryptedByBob);

            // Bob replies to Alice
            String messageFromBob = "Hi Alice, nice to hear from you!";
            String encryptedForAlice = CryptoUtils.encrypt(messageFromBob, alice.getPublicKey());
            System.out.println("\nBob sends encrypted message to Alice: " + encryptedForAlice);

            // Alice decrypts Bob's message
            String decryptedByAlice = CryptoUtils.decrypt(encryptedForAlice, alice.getPrivateKey());
            System.out.println("Alice decrypts and reads: " + decryptedByAlice);

        } catch (Exception e) {
            System.err.println("Error during chat: " + e.getMessage());
            e.printStackTrace();
        }
    }
}