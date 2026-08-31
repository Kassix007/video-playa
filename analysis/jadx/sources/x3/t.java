package x3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC1915a {
    public static final Parcelable.Creator<t> CREATOR = new com.google.android.material.datepicker.p(21);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18514q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final IBinder f18515r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.google.android.gms.common.b f18516s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f18517t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f18518u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(int i, IBinder iBinder, com.google.android.gms.common.b bVar, boolean z5, boolean z6) {
        this.f18514q = i;
        this.f18515r = iBinder;
        this.f18516s = bVar;
        this.f18517t = z5;
        this.f18518u = z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        Object m4;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            if (!this.f18516s.equals(tVar.f18516s)) {
                return false;
            }
            Object m7 = null;
            IBinder iBinder = this.f18515r;
            if (iBinder == null) {
                m4 = null;
            } else {
                int i = AbstractBinderC1889a.f18416d;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                m4 = iInterfaceQueryLocalInterface instanceof InterfaceC1897i ? (InterfaceC1897i) iInterfaceQueryLocalInterface : new M(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = tVar.f18515r;
            if (iBinder2 != null) {
                int i7 = AbstractBinderC1889a.f18416d;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                m7 = iInterfaceQueryLocalInterface2 instanceof InterfaceC1897i ? (InterfaceC1897i) iInterfaceQueryLocalInterface2 : new M(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!AbstractC1887A.j(m4, m7)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = AbstractC0836n2.Y(parcel, 20293);
        AbstractC0836n2.b0(parcel, 1, 4);
        parcel.writeInt(this.f18514q);
        AbstractC0836n2.S(parcel, 2, this.f18515r);
        AbstractC0836n2.U(parcel, 3, this.f18516s, i);
        AbstractC0836n2.b0(parcel, 4, 4);
        parcel.writeInt(this.f18517t ? 1 : 0);
        AbstractC0836n2.b0(parcel, 5, 4);
        parcel.writeInt(this.f18518u ? 1 : 0);
        AbstractC0836n2.a0(parcel, iY);
    }
}
