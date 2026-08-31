package q6;

import e1.C1025e;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements Closeable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t f16071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x f16072r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        t tVar;
        try {
            Class.forName("java.nio.file.Files");
            tVar = new u();
        } catch (ClassNotFoundException unused) {
            tVar = new t();
        }
        f16071q = tVar;
        String str = x.f16093r;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.m.d(property, "getProperty(...)");
        f16072r = O3.D.r(property);
        ClassLoader classLoader = r6.g.class.getClassLoader();
        kotlin.jvm.internal.m.d(classLoader, "getClassLoader(...)");
        new r6.g(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1025e G(x path) throws FileNotFoundException {
        kotlin.jvm.internal.m.e(path, "path");
        C1025e c1025eK = K(path);
        if (c1025eK != null) {
            return c1025eK;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract C1025e K(x xVar);

    public abstract s M(x xVar);

    public abstract E W(x xVar, boolean z5);

    public abstract E a(x xVar);

    public abstract G a0(x xVar);

    public abstract void b(x xVar, x xVar2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(x xVar) {
        n5.j jVar = new n5.j();
        while (xVar != null && !v(xVar)) {
            jVar.addFirst(xVar);
            xVar = xVar.c();
        }
        Iterator<E> it = jVar.iterator();
        while (it.hasNext()) {
            e((x) it.next());
        }
    }

    public abstract void e(x xVar);

    public abstract void f(x xVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(x path) {
        kotlin.jvm.internal.m.e(path, "path");
        f(path);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean v(x path) {
        kotlin.jvm.internal.m.e(path, "path");
        return K(path) != null;
    }

    public abstract List z(x xVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
