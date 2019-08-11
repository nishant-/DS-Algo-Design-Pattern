package util;

public final class Tuple<T, U> {

    private T t;
    private U u;

    private Tuple(T t, U u) {
        this.t = t;
        this.u = u;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj instanceof Tuple) {
            final boolean b = this.t.equals(((Tuple) obj).t) && this.u.equals(((Tuple) obj).u);
            return b;
        }
        return false;
    }

    public static <T, U> Tuple of(T t, U u) {
        return new Tuple(t, u);
    }

    @Override
    public String toString() {
        return "(" + t.toString() + "," + u.toString() + ")";
    }
}
