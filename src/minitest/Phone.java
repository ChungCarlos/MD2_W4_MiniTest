package minitest;

public abstract class Phone{
    public abstract void display(Type type);
    public abstract void insertPhone(Contact contact);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String newPhone);
}
