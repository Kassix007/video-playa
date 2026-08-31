package d2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: d2.O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0968O extends C1.c {
    public static final Parcelable.Creator<C0968O> CREATOR = new C1.b(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Parcelable f12006s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0968O(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f12006s = parcel.readParcelable(classLoader == null ? AbstractC0960G.class.getClassLoader() : classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f12006s, 0);
    }
}
