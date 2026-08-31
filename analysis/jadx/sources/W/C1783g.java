package w;

import M5.AbstractC0260v;
import M5.C0247h;
import com.google.android.gms.internal.measurement.I1;

/* JADX INFO: renamed from: w.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1783g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G.a f17969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0247h f17970b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1783g(G.a aVar, C0247h c0247h) {
        this.f17969a = aVar;
        this.f17970b = c0247h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C0247h c0247h = this.f17970b;
        if (c0247h.f3858u.get(AbstractC0260v.f3890q) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        I1.M(16);
        String string = Integer.toString(iHashCode, 16);
        kotlin.jvm.internal.m.d(string, "toString(...)");
        sb.append(string);
        sb.append("(currentBounds()=");
        sb.append(this.f17969a.invoke());
        sb.append(", continuation=");
        sb.append(c0247h);
        sb.append(')');
        return sb.toString();
    }
}
