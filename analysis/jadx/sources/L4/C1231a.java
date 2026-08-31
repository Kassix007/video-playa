package l4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1231a extends C1.c {
    public static final Parcelable.Creator<C1231a> CREATOR = new C1.b(5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14499s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1231a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f14499s = parcel.readInt() == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f14499s ? 1 : 0);
    }
}
