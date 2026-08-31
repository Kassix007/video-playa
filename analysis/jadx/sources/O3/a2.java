package O3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.List;
import x3.AbstractC1887A;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends AbstractC1915a {
    public static final Parcelable.Creator<a2> CREATOR = new A1.i(18);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f4708A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f4709B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f4710C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f4711D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f4712E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Boolean f4713F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final long f4714G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final List f4715H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final String f4716I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final String f4717J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final String f4718K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f4719L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final long f4720M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f4721N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final String f4722O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f4723P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final long f4724Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final String f4725R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final String f4726S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final long f4727T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f4728U;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f4729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f4730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f4731s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f4732t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f4733u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f4734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f4735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f4736x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f4737y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f4738z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a2(String str, String str2, String str3, long j, String str4, long j7, long j8, String str5, boolean z5, boolean z6, String str6, long j9, int i, boolean z7, boolean z8, Boolean bool, long j10, List list, String str7, String str8, String str9, boolean z9, long j11, int i7, String str10, int i8, long j12, String str11, String str12, long j13, int i9) {
        AbstractC1887A.d(str);
        this.f4729q = str;
        this.f4730r = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f4731s = str3;
        this.f4738z = j;
        this.f4732t = str4;
        this.f4733u = j7;
        this.f4734v = j8;
        this.f4735w = str5;
        this.f4736x = z5;
        this.f4737y = z6;
        this.f4708A = str6;
        this.f4709B = j9;
        this.f4710C = i;
        this.f4711D = z7;
        this.f4712E = z8;
        this.f4713F = bool;
        this.f4714G = j10;
        this.f4715H = list;
        this.f4716I = str7;
        this.f4717J = str8;
        this.f4718K = str9;
        this.f4719L = z9;
        this.f4720M = j11;
        this.f4721N = i7;
        this.f4722O = str10;
        this.f4723P = i8;
        this.f4724Q = j12;
        this.f4725R = str11;
        this.f4726S = str12;
        this.f4727T = j13;
        this.f4728U = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.V(parcel, 2, this.f4729q);
        AbstractC0836n2.V(parcel, 3, this.f4730r);
        AbstractC0836n2.V(parcel, 4, this.f4731s);
        AbstractC0836n2.V(parcel, 5, this.f4732t);
        AbstractC0836n2.b0(parcel, 6, 8);
        parcel.writeLong(this.f4733u);
        AbstractC0836n2.b0(parcel, 7, 8);
        parcel.writeLong(this.f4734v);
        AbstractC0836n2.V(parcel, 8, this.f4735w);
        AbstractC0836n2.b0(parcel, 9, 4);
        parcel.writeInt(this.f4736x ? 1 : 0);
        AbstractC0836n2.b0(parcel, 10, 4);
        parcel.writeInt(this.f4737y ? 1 : 0);
        AbstractC0836n2.b0(parcel, 11, 8);
        parcel.writeLong(this.f4738z);
        AbstractC0836n2.V(parcel, 12, this.f4708A);
        AbstractC0836n2.b0(parcel, 14, 8);
        parcel.writeLong(this.f4709B);
        AbstractC0836n2.b0(parcel, 15, 4);
        parcel.writeInt(this.f4710C);
        AbstractC0836n2.b0(parcel, 16, 4);
        parcel.writeInt(this.f4711D ? 1 : 0);
        AbstractC0836n2.b0(parcel, 18, 4);
        parcel.writeInt(this.f4712E ? 1 : 0);
        Boolean bool = this.f4713F;
        if (bool != null) {
            AbstractC0836n2.b0(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        AbstractC0836n2.b0(parcel, 22, 8);
        parcel.writeLong(this.f4714G);
        List<String> list = this.f4715H;
        if (list != null) {
            int iY2 = AbstractC0836n2.Y(parcel, 23);
            parcel.writeStringList(list);
            AbstractC0836n2.a0(parcel, iY2);
        }
        AbstractC0836n2.V(parcel, 25, this.f4716I);
        AbstractC0836n2.V(parcel, 26, this.f4717J);
        AbstractC0836n2.V(parcel, 27, this.f4718K);
        AbstractC0836n2.b0(parcel, 28, 4);
        parcel.writeInt(this.f4719L ? 1 : 0);
        AbstractC0836n2.b0(parcel, 29, 8);
        parcel.writeLong(this.f4720M);
        AbstractC0836n2.b0(parcel, 30, 4);
        parcel.writeInt(this.f4721N);
        AbstractC0836n2.V(parcel, 31, this.f4722O);
        AbstractC0836n2.b0(parcel, 32, 4);
        parcel.writeInt(this.f4723P);
        AbstractC0836n2.b0(parcel, 34, 8);
        parcel.writeLong(this.f4724Q);
        AbstractC0836n2.V(parcel, 35, this.f4725R);
        AbstractC0836n2.V(parcel, 36, this.f4726S);
        AbstractC0836n2.b0(parcel, 37, 8);
        parcel.writeLong(this.f4727T);
        AbstractC0836n2.b0(parcel, 38, 4);
        parcel.writeInt(this.f4728U);
        AbstractC0836n2.a0(parcel, iY);
    }

    public a2(String str, String str2, String str3, String str4, long j, long j7, String str5, boolean z5, boolean z6, long j8, String str6, long j9, int i, boolean z7, boolean z8, Boolean bool, long j10, ArrayList arrayList, String str7, String str8, String str9, boolean z9, long j11, int i7, String str10, int i8, long j12, String str11, String str12, long j13, int i9) {
        this.f4729q = str;
        this.f4730r = str2;
        this.f4731s = str3;
        this.f4738z = j8;
        this.f4732t = str4;
        this.f4733u = j;
        this.f4734v = j7;
        this.f4735w = str5;
        this.f4736x = z5;
        this.f4737y = z6;
        this.f4708A = str6;
        this.f4709B = j9;
        this.f4710C = i;
        this.f4711D = z7;
        this.f4712E = z8;
        this.f4713F = bool;
        this.f4714G = j10;
        this.f4715H = arrayList;
        this.f4716I = str7;
        this.f4717J = str8;
        this.f4718K = str9;
        this.f4719L = z9;
        this.f4720M = j11;
        this.f4721N = i7;
        this.f4722O = str10;
        this.f4723P = i8;
        this.f4724Q = j12;
        this.f4725R = str11;
        this.f4726S = str12;
        this.f4727T = j13;
        this.f4728U = i9;
    }
}
