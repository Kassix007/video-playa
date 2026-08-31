package C1;

import android.os.Parcel;
import android.os.Parcelable;
import c4.e;
import d2.C0968O;
import d4.C1005b;
import i1.g;
import l4.C1231a;
import l4.C1236f;
import m.C1287W0;
import n4.j;
import v4.y;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1161a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [C1.c.<clinit>():void] */
    public /* synthetic */ b(int i) {
        this.f1161a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1161a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f1162r;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new e(parcel, classLoader);
            case 2:
                return new C0968O(parcel, classLoader);
            case 3:
                return new C1005b(parcel, classLoader);
            case 4:
                return new g(parcel, classLoader);
            case 5:
                return new C1231a(parcel, classLoader);
            case 6:
                return new C1236f(parcel, classLoader);
            case 7:
                return new C1287W0(parcel, classLoader);
            case 8:
                return new j(parcel, classLoader);
            case 9:
                return new t4.c(parcel, classLoader);
            default:
                return new y(parcel, classLoader);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1161a) {
            case 0:
                return new c[i];
            case 1:
                return new e[i];
            case 2:
                return new C0968O[i];
            case 3:
                return new C1005b[i];
            case 4:
                return new g[i];
            case 5:
                return new C1231a[i];
            case 6:
                return new C1236f[i];
            case 7:
                return new C1287W0[i];
            case 8:
                return new j[i];
            case 9:
                return new t4.c[i];
            default:
                return new y[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1161a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f1162r;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new e(parcel, null);
            case 2:
                return new C0968O(parcel, null);
            case 3:
                return new C1005b(parcel, null);
            case 4:
                return new g(parcel, null);
            case 5:
                return new C1231a(parcel, null);
            case 6:
                return new C1236f(parcel, null);
            case 7:
                return new C1287W0(parcel, null);
            case 8:
                return new j(parcel, null);
            case 9:
                return new t4.c(parcel, null);
            default:
                return new y(parcel, null);
        }
    }
}
