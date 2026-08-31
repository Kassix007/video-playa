package M2;

import C0.S;
import I2.n;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f3725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.h f3727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3728d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(n nVar, boolean z5, J2.h hVar, String str) {
        this.f3725a = nVar;
        this.f3726b = z5;
        this.f3727c = hVar;
        this.f3728d = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f3725a, aVar.f3725a) && this.f3726b == aVar.f3726b && this.f3727c == aVar.f3727c && m.a(this.f3728d, aVar.f3728d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f3727c.hashCode() + k1.i.e(this.f3725a.hashCode() * 31, 31, this.f3726b)) * 31;
        String str = this.f3728d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExecuteResult(image=");
        sb.append(this.f3725a);
        sb.append(", isSampled=");
        sb.append(this.f3726b);
        sb.append(", dataSource=");
        sb.append(this.f3727c);
        sb.append(", diskCacheKey=");
        return S.p(sb, this.f3728d, ')');
    }
}
