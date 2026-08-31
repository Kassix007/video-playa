package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class L1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G4.d f10655b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public L1(Context context, G4.d dVar) {
        this.f10654a = context;
        this.f10655b = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        G4.d dVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof L1) {
            L1 l12 = (L1) obj;
            Context context = l12.f10654a;
            G4.d dVar2 = l12.f10655b;
            if (this.f10654a.equals(context) && ((dVar = this.f10655b) != null ? dVar.equals(dVar2) : dVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f10654a.hashCode() ^ 1000003;
        G4.d dVar = this.f10655b;
        return (iHashCode * 1000003) ^ (dVar == null ? 0 : dVar.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String string = this.f10654a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f10655b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        k1.i.s(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
