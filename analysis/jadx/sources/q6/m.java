package q6;

import e1.C1025e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f16073s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(l delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f16073s = delegate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final C1025e K(x path) {
        kotlin.jvm.internal.m.e(path, "path");
        C1025e c1025eK = this.f16073s.K(path);
        if (c1025eK == null) {
            return null;
        }
        x xVar = (x) c1025eK.f12514d;
        if (xVar == null) {
            return c1025eK;
        }
        boolean z5 = c1025eK.f12512b;
        boolean z6 = c1025eK.f12513c;
        Long l7 = (Long) c1025eK.f12515e;
        Long l8 = (Long) c1025eK.f;
        Long l9 = (Long) c1025eK.f12516g;
        Long l10 = (Long) c1025eK.f12517h;
        Map extras = (Map) c1025eK.i;
        kotlin.jvm.internal.m.e(extras, "extras");
        return new C1025e(z5, z6, xVar, l7, l8, l9, l10, extras);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final s M(x xVar) {
        return this.f16073s.M(xVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public E W(x file, boolean z5) {
        kotlin.jvm.internal.m.e(file, "file");
        return this.f16073s.W(file, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final E a(x file) {
        kotlin.jvm.internal.m.e(file, "file");
        return this.f16073s.a(file);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final G a0(x file) {
        kotlin.jvm.internal.m.e(file, "file");
        return this.f16073s.a0(file);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final void b(x source, x target) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(target, "target");
        this.f16073s.b(source, target);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16073s.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final void e(x dir) {
        kotlin.jvm.internal.m.e(dir, "dir");
        this.f16073s.e(dir);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final void f(x path) {
        kotlin.jvm.internal.m.e(path, "path");
        this.f16073s.f(path);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return kotlin.jvm.internal.z.a(getClass()).c() + '(' + this.f16073s + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final List z(x xVar) {
        List<x> listZ = this.f16073s.z(xVar);
        ArrayList arrayList = new ArrayList();
        for (x path : listZ) {
            kotlin.jvm.internal.m.e(path, "path");
            arrayList.add(path);
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }
}
