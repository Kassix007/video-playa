package X;

import com.google.android.gms.internal.measurement.I1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8141a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f8141a);
        sb.append(")@");
        int iHashCode = hashCode();
        I1.M(16);
        String string = Integer.toString(iHashCode, 16);
        kotlin.jvm.internal.m.d(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }
}
