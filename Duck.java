public class Duck extends Animals{
    public Duck(String name) {
        super(name);
    }
    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public boolean walk() {
        return true;
    }
}
