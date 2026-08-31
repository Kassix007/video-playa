package P;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: P.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0352e0 implements Parcelable.ClassLoaderCreator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0354f0 a(Parcel parcel, ClassLoader classLoader) {
        S s6;
        if (classLoader == null) {
            classLoader = C0352e0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            s6 = S.f5374s;
        } else if (i == 1) {
            s6 = S.f5377v;
        } else {
            if (i != 2) {
                throw new IllegalStateException(C0.S.m("Unsupported MutableState policy ", " was restored", i));
            }
            s6 = S.f5375t;
        }
        return new C0354f0(value, s6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C0354f0[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
