package gradle.cucumber;

public class Ghost {
    private boolean weakened;
    private boolean body;

    public Ghost(boolean b) {
        weakened = b;
        body = true;
    }

    public boolean isWeakened() {
        return weakened;
    }

    public boolean hasBody() {
        return body;
    }

    public void body(boolean state){
        body = state;
    }
}
