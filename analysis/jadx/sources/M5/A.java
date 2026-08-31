package M5;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f3804a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property;
        C c7;
        int i = R5.u.f7270a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            T5.e eVar = H.f3811a;
            N5.f fVar = R5.n.f7261a;
            N5.f fVar2 = fVar.f4044t;
            c7 = fVar;
            if (fVar == null) {
                c7 = RunnableC0264z.f3909x;
            }
        } else {
            c7 = RunnableC0264z.f3909x;
        }
        f3804a = c7;
    }
}
