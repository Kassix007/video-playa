package q6;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f16093r;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1541j f16094q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String separator = File.separator;
        kotlin.jvm.internal.m.d(separator, "separator");
        f16093r = separator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(C1541j bytes) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        this.f16094q = bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = r6.c.a(this);
        C1541j c1541j = this.f16094q;
        if (iA == -1) {
            iA = 0;
        } else if (iA < c1541j.c() && c1541j.h(iA) == 92) {
            iA++;
        }
        int iC = c1541j.c();
        int i = iA;
        while (iA < iC) {
            if (c1541j.h(iA) == 47 || c1541j.h(iA) == 92) {
                arrayList.add(c1541j.m(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < c1541j.c()) {
            arrayList.add(c1541j.m(i, c1541j.c()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        C1541j c1541j = r6.c.f16369a;
        C1541j c1541jN = this.f16094q;
        int iJ = C1541j.j(c1541jN, c1541j);
        if (iJ == -1) {
            iJ = C1541j.j(c1541jN, r6.c.f16370b);
        }
        if (iJ != -1) {
            c1541jN = C1541j.n(c1541jN, iJ + 1, 0, 2);
        } else if (g() != null && c1541jN.c() == 2) {
            c1541jN = C1541j.f16064t;
        }
        return c1541jN.p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x c() {
        C1541j c1541j = r6.c.f16372d;
        C1541j c1541j2 = this.f16094q;
        if (kotlin.jvm.internal.m.a(c1541j2, c1541j)) {
            return null;
        }
        C1541j c1541j3 = r6.c.f16369a;
        if (kotlin.jvm.internal.m.a(c1541j2, c1541j3)) {
            return null;
        }
        C1541j prefix = r6.c.f16370b;
        if (kotlin.jvm.internal.m.a(c1541j2, prefix)) {
            return null;
        }
        C1541j suffix = r6.c.f16373e;
        c1541j2.getClass();
        kotlin.jvm.internal.m.e(suffix, "suffix");
        int iC = c1541j2.c();
        byte[] bArr = suffix.f16065q;
        if (c1541j2.k(iC - bArr.length, suffix, bArr.length) && (c1541j2.c() == 2 || c1541j2.k(c1541j2.c() - 3, c1541j3, 1) || c1541j2.k(c1541j2.c() - 3, prefix, 1))) {
            return null;
        }
        int iJ = C1541j.j(c1541j2, c1541j3);
        if (iJ == -1) {
            iJ = C1541j.j(c1541j2, prefix);
        }
        if (iJ == 2 && g() != null) {
            if (c1541j2.c() == 3) {
                return null;
            }
            return new x(C1541j.n(c1541j2, 0, 3, 1));
        }
        if (iJ == 1) {
            kotlin.jvm.internal.m.e(prefix, "prefix");
            if (c1541j2.k(0, prefix, prefix.c())) {
                return null;
            }
        }
        if (iJ != -1 || g() == null) {
            return iJ == -1 ? new x(c1541j) : iJ == 0 ? new x(C1541j.n(c1541j2, 0, 1, 1)) : new x(C1541j.n(c1541j2, 0, iJ, 1));
        }
        if (c1541j2.c() == 2) {
            return null;
        }
        return new x(C1541j.n(c1541j2, 0, 2, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x other = (x) obj;
        kotlin.jvm.internal.m.e(other, "other");
        return this.f16094q.compareTo(other.f16094q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x d(x other) {
        kotlin.jvm.internal.m.e(other, "other");
        C1541j c1541j = other.f16094q;
        int iA = r6.c.a(this);
        C1541j c1541j2 = this.f16094q;
        x xVar = iA == -1 ? null : new x(c1541j2.m(0, iA));
        int iA2 = r6.c.a(other);
        if (!kotlin.jvm.internal.m.a(xVar, iA2 != -1 ? new x(c1541j.m(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = other.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && kotlin.jvm.internal.m.a(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && c1541j2.c() == c1541j.c()) {
            return O3.D.r(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(r6.c.f16373e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (kotlin.jvm.internal.m.a(c1541j, r6.c.f16372d)) {
            return this;
        }
        C1538g c1538g = new C1538g();
        C1541j c1541jC = r6.c.c(other);
        if (c1541jC == null && (c1541jC = r6.c.c(this)) == null) {
            c1541jC = r6.c.f(f16093r);
        }
        int size = arrayListA2.size();
        for (int i7 = i; i7 < size; i7++) {
            c1538g.c0(r6.c.f16373e);
            c1538g.c0(c1541jC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            c1538g.c0((C1541j) arrayListA.get(i));
            c1538g.c0(c1541jC);
            i++;
        }
        return r6.c.d(c1538g, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x e(String child) {
        kotlin.jvm.internal.m.e(child, "child");
        C1538g c1538g = new C1538g();
        c1538g.i0(child);
        return r6.c.b(this, r6.c.d(c1538g, false), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof x) && kotlin.jvm.internal.m.a(((x) obj).f16094q, this.f16094q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Path f() {
        Path path = Paths.get(this.f16094q.p(), new String[0]);
        kotlin.jvm.internal.m.d(path, "get(...)");
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Character g() {
        C1541j c1541j = r6.c.f16369a;
        C1541j c1541j2 = this.f16094q;
        if (C1541j.f(c1541j2, c1541j) != -1 || c1541j2.c() < 2 || c1541j2.h(1) != 58) {
            return null;
        }
        char cH = (char) c1541j2.h(0);
        if (('a' > cH || cH >= '{') && ('A' > cH || cH >= '[')) {
            return null;
        }
        return Character.valueOf(cH);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16094q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final File toFile() {
        return new File(this.f16094q.p());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f16094q.p();
    }
}
