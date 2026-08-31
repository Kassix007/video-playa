package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import x3.AbstractC1887A;
import y3.AbstractC1915a;

/* JADX INFO: renamed from: O3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0278e extends AbstractC1915a {
    public static final Parcelable.Creator<C0278e> CREATOR = new A1.i(9);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0328v f4829A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f4830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f4831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public V1 f4832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f4833t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4834u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f4835v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0328v f4836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f4837x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0328v f4838y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f4839z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0278e(C0278e c0278e) {
        AbstractC1887A.g(c0278e);
        this.f4830q = c0278e.f4830q;
        this.f4831r = c0278e.f4831r;
        this.f4832s = c0278e.f4832s;
        this.f4833t = c0278e.f4833t;
        this.f4834u = c0278e.f4834u;
        this.f4835v = c0278e.f4835v;
        this.f4836w = c0278e.f4836w;
        this.f4837x = c0278e.f4837x;
        this.f4838y = c0278e.f4838y;
        this.f4839z = c0278e.f4839z;
        this.f4829A = c0278e.f4829A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.V(parcel, 2, this.f4830q);
        AbstractC0836n2.V(parcel, 3, this.f4831r);
        AbstractC0836n2.U(parcel, 4, this.f4832s, i);
        long j = this.f4833t;
        AbstractC0836n2.b0(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z5 = this.f4834u;
        AbstractC0836n2.b0(parcel, 6, 4);
        parcel.writeInt(z5 ? 1 : 0);
        AbstractC0836n2.V(parcel, 7, this.f4835v);
        AbstractC0836n2.U(parcel, 8, this.f4836w, i);
        long j7 = this.f4837x;
        AbstractC0836n2.b0(parcel, 9, 8);
        parcel.writeLong(j7);
        AbstractC0836n2.U(parcel, 10, this.f4838y, i);
        AbstractC0836n2.b0(parcel, 11, 8);
        parcel.writeLong(this.f4839z);
        AbstractC0836n2.U(parcel, 12, this.f4829A, i);
        AbstractC0836n2.a0(parcel, iY);
    }

    public C0278e(String str, String str2, V1 v12, long j, boolean z5, String str3, C0328v c0328v, long j7, C0328v c0328v2, long j8, C0328v c0328v3) {
        this.f4830q = str;
        this.f4831r = str2;
        this.f4832s = v12;
        this.f4833t = j;
        this.f4834u = z5;
        this.f4835v = str3;
        this.f4836w = c0328v;
        this.f4837x = j7;
        this.f4838y = c0328v2;
        this.f4839z = j8;
        this.f4829A = c0328v3;
    }
}
