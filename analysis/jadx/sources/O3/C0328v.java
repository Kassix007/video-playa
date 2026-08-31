package O3;

import android.os.Parcel;
import android.os.Parcelable;
import x3.AbstractC1887A;
import y3.AbstractC1915a;

/* JADX INFO: renamed from: O3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0328v extends AbstractC1915a {
    public static final Parcelable.Creator<C0328v> CREATOR = new A1.i(12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f5091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0325u f5092r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5093s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f5094t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0328v(C0328v c0328v, long j) {
        AbstractC1887A.g(c0328v);
        this.f5091q = c0328v.f5091q;
        this.f5092r = c0328v.f5092r;
        this.f5093s = c0328v.f5093s;
        this.f5094t = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strValueOf = String.valueOf(this.f5092r);
        String str = this.f5093s;
        int length = String.valueOf(str).length();
        String str2 = this.f5091q;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        k1.i.s(sb, "origin=", str, ",name=", str2);
        return k1.i.k(sb, ",params=", strValueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        A1.i.a(this, parcel, i);
    }

    public C0328v(String str, C0325u c0325u, String str2, long j) {
        this.f5091q = str;
        this.f5092r = c0325u;
        this.f5093s = str2;
        this.f5094t = j;
    }
}
