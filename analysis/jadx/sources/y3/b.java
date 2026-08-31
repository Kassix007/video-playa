package Y3;

import A1.i;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new i(23);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f8230A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f8231B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f8232C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Locale f8233D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public CharSequence f8234E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public CharSequence f8235F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f8236G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f8237H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Integer f8238I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Boolean f8239J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Integer f8240K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Integer f8241L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Integer f8242M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Integer f8243N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Integer f8244O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Integer f8245P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Integer f8246Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Integer f8247R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Integer f8248S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Boolean f8249T;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f8251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f8252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f8253t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f8254u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f8255v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f8256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f8257x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8258y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f8259z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8250q);
        parcel.writeSerializable(this.f8251r);
        parcel.writeSerializable(this.f8252s);
        parcel.writeSerializable(this.f8253t);
        parcel.writeSerializable(this.f8254u);
        parcel.writeSerializable(this.f8255v);
        parcel.writeSerializable(this.f8256w);
        parcel.writeSerializable(this.f8257x);
        parcel.writeInt(this.f8258y);
        parcel.writeString(this.f8259z);
        parcel.writeInt(this.f8230A);
        parcel.writeInt(this.f8231B);
        parcel.writeInt(this.f8232C);
        CharSequence charSequence = this.f8234E;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f8235F;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f8236G);
        parcel.writeSerializable(this.f8238I);
        parcel.writeSerializable(this.f8240K);
        parcel.writeSerializable(this.f8241L);
        parcel.writeSerializable(this.f8242M);
        parcel.writeSerializable(this.f8243N);
        parcel.writeSerializable(this.f8244O);
        parcel.writeSerializable(this.f8245P);
        parcel.writeSerializable(this.f8248S);
        parcel.writeSerializable(this.f8246Q);
        parcel.writeSerializable(this.f8247R);
        parcel.writeSerializable(this.f8239J);
        parcel.writeSerializable(this.f8233D);
        parcel.writeSerializable(this.f8249T);
    }
}
