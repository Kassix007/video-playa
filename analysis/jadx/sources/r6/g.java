package r6;

import O3.D;
import a.AbstractC0597a;
import e1.C1025e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1371j;
import m5.C1376o;
import n5.q;
import q6.E;
import q6.G;
import q6.l;
import q6.s;
import q6.t;
import q6.x;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x f16379v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ClassLoader f16380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f16381t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1376o f16382u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String str = x.f16093r;
        f16379v = D.r("/");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(ClassLoader classLoader) {
        t systemFileSystem = l.f16071q;
        m.e(systemFileSystem, "systemFileSystem");
        this.f16380s = classLoader;
        this.f16381t = systemFileSystem;
        this.f16382u = AbstractC1362a.d(new I2.d(20, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final C1025e K(x path) {
        m.e(path, "path");
        if (!f.a(path)) {
            return null;
        }
        x xVar = f16379v;
        xVar.getClass();
        String strP = c.b(xVar, path, true).d(xVar).f16094q.p();
        for (C1371j c1371j : (List) this.f16382u.getValue()) {
            C1025e c1025eK = ((l) c1371j.f15080q).K(((x) c1371j.f15081r).e(strP));
            if (c1025eK != null) {
                return c1025eK;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final s M(x xVar) throws FileNotFoundException {
        if (!f.a(xVar)) {
            throw new FileNotFoundException("file not found: " + xVar);
        }
        x xVar2 = f16379v;
        xVar2.getClass();
        String strP = c.b(xVar2, xVar, true).d(xVar2).f16094q.p();
        for (C1371j c1371j : (List) this.f16382u.getValue()) {
            try {
                return ((l) c1371j.f15080q).M(((x) c1371j.f15081r).e(strP));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + xVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final E W(x file, boolean z5) throws IOException {
        m.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final E a(x file) throws IOException {
        m.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final G a0(x file) throws IOException {
        m.e(file, "file");
        if (!f.a(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        x xVar = f16379v;
        xVar.getClass();
        URL resource = this.f16380s.getResource(c.b(xVar, file, false).d(xVar).f16094q.p());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        m.d(inputStream, "getInputStream(...)");
        return AbstractC0597a.R(inputStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final void b(x source, x target) throws IOException {
        m.e(source, "source");
        m.e(target, "target");
        throw new IOException(this + " is read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final void e(x dir) throws IOException {
        m.e(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final void f(x path) throws IOException {
        m.e(path, "path");
        throw new IOException(this + " is read-only");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.l
    public final List z(x xVar) throws FileNotFoundException {
        x xVar2 = f16379v;
        xVar2.getClass();
        String strP = c.b(xVar2, xVar, true).d(xVar2).f16094q.p();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z5 = false;
        for (C1371j c1371j : (List) this.f16382u.getValue()) {
            l lVar = (l) c1371j.f15080q;
            x xVar3 = (x) c1371j.f15081r;
            try {
                List listZ = lVar.z(xVar3.e(strP));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listZ) {
                    if (f.a((x) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(n5.m.c0(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    x xVar4 = (x) obj2;
                    m.e(xVar4, "<this>");
                    String strReplace = J5.m.a1(xVar4.f16094q.p(), xVar3.f16094q.p()).replace('\\', '/');
                    m.d(strReplace, "replace(...)");
                    arrayList2.add(xVar2.e(strReplace));
                }
                q.e0(linkedHashSet, arrayList2);
                z5 = true;
            } catch (IOException unused) {
            }
        }
        if (z5) {
            return n5.l.B0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + xVar);
    }
}
