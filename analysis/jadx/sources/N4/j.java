package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j extends C1.c {
    public static final Parcelable.Creator<j> CREATOR = new C1.b(8);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f15281s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15281s = parcel.readBundle(classLoader == null ? j.class.getClassLoader() : classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f15281s);
    }
}
