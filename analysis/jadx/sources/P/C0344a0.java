package P;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: P.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0344a0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5385a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5385a) {
            case 0:
                return new C0346b0(parcel.readFloat());
            case 1:
                return new C0348c0(parcel.readInt());
            default:
                return new C0350d0(parcel.readLong());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f5385a) {
            case 0:
                return new C0346b0[i];
            case 1:
                return new C0348c0[i];
            default:
                return new C0350d0[i];
        }
    }
}
