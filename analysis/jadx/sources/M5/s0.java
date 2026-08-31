package M5;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3883a = new ThreadLocal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static S a() {
        ThreadLocal threadLocal = f3883a;
        S s6 = (S) threadLocal.get();
        if (s6 != null) {
            return s6;
        }
        C0243d c0243d = new C0243d(Thread.currentThread());
        threadLocal.set(c0243d);
        return c0243d;
    }
}
