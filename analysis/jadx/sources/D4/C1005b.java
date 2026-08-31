package d4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: d4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1005b extends C1.c {
    public static final Parcelable.Creator<C1005b> CREATOR = new C1.b(3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12272s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1005b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C1005b.class.getClassLoader();
        }
        this.f12272s = parcel.readInt() == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f12272s ? 1 : 0);
    }
}
