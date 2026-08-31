package m;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: m.W0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1287W0 extends C1.c {
    public static final Parcelable.Creator<C1287W0> CREATOR = new C1.b(7);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14725t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1287W0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f14724s = parcel.readInt();
        this.f14725t = parcel.readInt() != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f14724s);
        parcel.writeInt(this.f14725t ? 1 : 0);
    }
}
