package J1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new A1.i(7);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f2563A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f2564B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Bundle f2565C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f2566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f2567r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f2568s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2569t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f2570u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f2571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f2572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f2573x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f2574y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Bundle f2575z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public M(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        this.f2566q = abstractComponentCallbacksC0185q.getClass().getName();
        this.f2567r = abstractComponentCallbacksC0185q.f2722u;
        this.f2568s = abstractComponentCallbacksC0185q.f2685C;
        this.f2569t = abstractComponentCallbacksC0185q.f2694L;
        this.f2570u = abstractComponentCallbacksC0185q.f2695M;
        this.f2571v = abstractComponentCallbacksC0185q.f2696N;
        this.f2572w = abstractComponentCallbacksC0185q.f2699Q;
        this.f2573x = abstractComponentCallbacksC0185q.f2684B;
        this.f2574y = abstractComponentCallbacksC0185q.f2698P;
        this.f2575z = abstractComponentCallbacksC0185q.f2723v;
        this.f2563A = abstractComponentCallbacksC0185q.f2697O;
        this.f2564B = abstractComponentCallbacksC0185q.f2710b0.ordinal();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2566q);
        sb.append(" (");
        sb.append(this.f2567r);
        sb.append(")}:");
        if (this.f2568s) {
            sb.append(" fromLayout");
        }
        int i = this.f2570u;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f2571v;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f2572w) {
            sb.append(" retainInstance");
        }
        if (this.f2573x) {
            sb.append(" removing");
        }
        if (this.f2574y) {
            sb.append(" detached");
        }
        if (this.f2563A) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2566q);
        parcel.writeString(this.f2567r);
        parcel.writeInt(this.f2568s ? 1 : 0);
        parcel.writeInt(this.f2569t);
        parcel.writeInt(this.f2570u);
        parcel.writeString(this.f2571v);
        parcel.writeInt(this.f2572w ? 1 : 0);
        parcel.writeInt(this.f2573x ? 1 : 0);
        parcel.writeInt(this.f2574y ? 1 : 0);
        parcel.writeBundle(this.f2575z);
        parcel.writeInt(this.f2563A ? 1 : 0);
        parcel.writeBundle(this.f2565C);
        parcel.writeInt(this.f2564B);
    }

    public M(Parcel parcel) {
        this.f2566q = parcel.readString();
        this.f2567r = parcel.readString();
        this.f2568s = parcel.readInt() != 0;
        this.f2569t = parcel.readInt();
        this.f2570u = parcel.readInt();
        this.f2571v = parcel.readString();
        this.f2572w = parcel.readInt() != 0;
        this.f2573x = parcel.readInt() != 0;
        this.f2574y = parcel.readInt() != 0;
        this.f2575z = parcel.readBundle();
        this.f2563A = parcel.readInt() != 0;
        this.f2565C = parcel.readBundle();
        this.f2564B = parcel.readInt();
    }
}
