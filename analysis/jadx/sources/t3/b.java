package t3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.material.datepicker.p;
import java.util.Arrays;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1915a {
    public static final Parcelable.Creator<b> CREATOR = new p(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f16728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f16729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f16730s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(long j, long j7, boolean z5) {
        this.f16728q = z5;
        this.f16729r = j;
        this.f16730s = j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f16728q == bVar.f16728q && this.f16729r == bVar.f16729r && this.f16730s == bVar.f16730s) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f16728q), Long.valueOf(this.f16729r), Long.valueOf(this.f16730s)});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f16728q + ",collectForDebugStartTimeMillis: " + this.f16729r + ",collectForDebugExpiryTimeMillis: " + this.f16730s + "]";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f16728q ? 1 : 0);
        AbstractC0836n2.b0(parcel, 2, 8);
        parcel.writeLong(this.f16730s);
        AbstractC0836n2.b0(parcel, 3, 8);
        parcel.writeLong(this.f16729r);
        AbstractC0836n2.a0(parcel, iY);
    }
}
