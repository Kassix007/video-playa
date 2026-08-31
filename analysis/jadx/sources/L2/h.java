package L2;

import I2.n;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f3257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.h f3259c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(n nVar, boolean z5, J2.h hVar) {
        this.f3257a = nVar;
        this.f3258b = z5;
        this.f3259c = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return m.a(this.f3257a, hVar.f3257a) && this.f3258b == hVar.f3258b && this.f3259c == hVar.f3259c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3259c.hashCode() + k1.i.e(this.f3257a.hashCode() * 31, 31, this.f3258b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ImageFetchResult(image=" + this.f3257a + ", isSampled=" + this.f3258b + ", dataSource=" + this.f3259c + ')';
    }
}
