package x3;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import y3.AbstractC1915a;

/* JADX INFO: renamed from: x3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1895g extends AbstractC1915a {
    public static final Parcelable.Creator<C1895g> CREATOR = new com.google.android.material.datepicker.p(25);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Scope[] f18447E = new Scope[0];

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final com.google.android.gms.common.d[] f18448F = new com.google.android.gms.common.d[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f18449A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f18450B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f18451C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final String f18452D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f18455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f18456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public IBinder f18457u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Scope[] f18458v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Bundle f18459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Account f18460x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.google.android.gms.common.d[] f18461y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.google.android.gms.common.d[] f18462z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1895g(int i, int i7, int i8, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, com.google.android.gms.common.d[] dVarArr, com.google.android.gms.common.d[] dVarArr2, boolean z5, int i9, boolean z6, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f18447E : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        com.google.android.gms.common.d[] dVarArr3 = f18448F;
        com.google.android.gms.common.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f18453q = i;
        this.f18454r = i7;
        this.f18455s = i8;
        if ("com.google.android.gms".equals(str)) {
            this.f18456t = "com.google.android.gms";
        } else {
            this.f18456t = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i10 = AbstractBinderC1889a.f18416d;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC1897i m4 = iInterfaceQueryLocalInterface instanceof InterfaceC1897i ? (InterfaceC1897i) iInterfaceQueryLocalInterface : new M(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (m4 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            M m7 = (M) m4;
                            Parcel parcelI = m7.I(m7.K(), 2);
                            Account account3 = (Account) J3.a.a(parcelI, Account.CREATOR);
                            parcelI.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f18460x = account2;
        } else {
            this.f18457u = iBinder;
            this.f18460x = account;
        }
        this.f18458v = scopeArr2;
        this.f18459w = bundle2;
        this.f18461y = dVarArr4;
        this.f18462z = dVarArr3;
        this.f18449A = z5;
        this.f18450B = i9;
        this.f18451C = z6;
        this.f18452D = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.google.android.material.datepicker.p.a(this, parcel, i);
    }
}
