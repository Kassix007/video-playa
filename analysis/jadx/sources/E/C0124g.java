package E;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: E.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0124g implements Parcelable {
    public static final Parcelable.Creator<C0124g> CREATOR = new C0123f();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1564q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0124g(int i) {
        this.f1564q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0124g) && this.f1564q == ((C0124g) obj).f1564q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f1564q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return C0.S.o(new StringBuilder("DefaultLazyKey(index="), this.f1564q, ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1564q);
    }
}
