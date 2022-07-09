public interface Authenticable {

    public abstract void setPassword(int password);
    public abstract boolean authenticate(int password);

}