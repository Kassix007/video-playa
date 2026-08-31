package kotlin.jvm.internal;

import C0.S;
import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1192a implements i, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f14249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f14250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f14251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f14252t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14253u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14254v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f14255w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1192a(int i, int i7, Class cls, Object obj, String str, String str2) {
        this.f14249q = obj;
        this.f14250r = cls;
        this.f14251s = str;
        this.f14252t = str2;
        this.f14254v = i;
        this.f14255w = i7 >> 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1192a)) {
            return false;
        }
        C1192a c1192a = (C1192a) obj;
        return this.f14253u == c1192a.f14253u && this.f14254v == c1192a.f14254v && this.f14255w == c1192a.f14255w && this.f14249q.equals(c1192a.f14249q) && this.f14250r.equals(c1192a.f14250r) && this.f14251s.equals(c1192a.f14251s) && this.f14252t.equals(c1192a.f14252t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.i
    public final int getArity() {
        return this.f14254v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((((S.h(this.f14252t, S.h(this.f14251s, (this.f14250r.hashCode() + (this.f14249q.hashCode() * 31)) * 31, 31), 31) + (this.f14253u ? 1231 : 1237)) * 31) + this.f14254v) * 31) + this.f14255w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        z.f14269a.getClass();
        return A.a(this);
    }
}
