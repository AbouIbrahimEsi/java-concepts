package dz.learnjava.genericsCourse;

public class User implements Comparable<User>, Cloneable{

    @Override
    public int compareTo(User o) {
        return 0;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
