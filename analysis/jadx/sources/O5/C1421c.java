package o5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: o5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1421c extends F1.c implements Iterator, C5.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15445u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1421c(C1423e map, int i) {
        this.f15445u = i;
        m.e(map, "map");
        this.f1944t = map;
        this.f1942r = -1;
        this.f1943s = map.f15460x;
        e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15445u) {
            case 0:
                b();
                int i = this.f1941q;
                C1423e c1423e = (C1423e) this.f1944t;
                if (i >= c1423e.f15458v) {
                    throw new NoSuchElementException();
                }
                this.f1941q = i + 1;
                this.f1942r = i;
                C1422d c1422d = new C1422d(c1423e, i);
                e();
                return c1422d;
            case 1:
                b();
                int i7 = this.f1941q;
                C1423e c1423e2 = (C1423e) this.f1944t;
                if (i7 >= c1423e2.f15458v) {
                    throw new NoSuchElementException();
                }
                this.f1941q = i7 + 1;
                this.f1942r = i7;
                Object obj = c1423e2.f15453q[i7];
                e();
                return obj;
            default:
                b();
                int i8 = this.f1941q;
                C1423e c1423e3 = (C1423e) this.f1944t;
                if (i8 >= c1423e3.f15458v) {
                    throw new NoSuchElementException();
                }
                this.f1941q = i8 + 1;
                this.f1942r = i8;
                Object[] objArr = c1423e3.f15454r;
                m.b(objArr);
                Object obj2 = objArr[this.f1942r];
                e();
                return obj2;
        }
    }
}
