package ke.co.safaricom;

public class Encode {
    private int key;
    private String message;

    public Encode(String yourMessage, int yourKey) {
        this.key = yourKey;
        this.message = yourMessage;
    }

    public int getKey() {
        return this.key;
    }

