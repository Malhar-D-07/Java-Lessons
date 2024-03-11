package Pair;

public class Pair <K, V> {
    K x;
    V y;

    public K getX() {
        return this.x;
    }

    public V getY() {
        return this.y;
    }

    public void setX(K k) {
        this.x = k;
    }

    public void setY(V v) {
        this.y = v;
    }

    // We can also use static methods in Generic class.
    // Just a change is that k, v, s are declared seperately as for static object is not created
    // NOTE: Here s is the return type
    // We can also do like this
    public static <k, v, s> s doSomething(k k1, v v1, s s1) {
        System.out.println("Values are k: " + k1 + " v: " + v1);
        return s1;
    }

    // We can also do the <k, v, s> thing in non-static methods also, but no need to do it as the class
    // level handles the data types for us.
}
