package O3;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import com.google.android.gms.internal.measurement.AbstractBinderC0882x;
import com.google.android.gms.internal.measurement.AbstractC0887y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import x3.AbstractC1887A;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends AbstractBinderC0882x implements I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T1 f4330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f4331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4332e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0(T1 t12) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        AbstractC1887A.g(t12);
        this.f4330c = t12;
        this.f4332e = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void B(a2 a2Var) {
        K(a2Var);
        M(new RunnableC0329v0(this, a2Var, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void C(a2 a2Var) {
        AbstractC1887A.d(a2Var.f4729q);
        AbstractC1887A.g(a2Var.f4716I);
        J(new RunnableC0329v0(this, a2Var, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void D(a2 a2Var, M1 m12, M m4) {
        K(a2Var);
        String str = a2Var.f4729q;
        AbstractC1887A.g(str);
        this.f4330c.c().x(new B0(this, str, m12, m4, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void E(a2 a2Var, Bundle bundle) {
        K(a2Var);
        String str = a2Var.f4729q;
        AbstractC1887A.g(str);
        M(new B0(this, bundle, str, a2Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void F(a2 a2Var) {
        AbstractC1887A.d(a2Var.f4729q);
        AbstractC1887A.g(a2Var.f4716I);
        J(new RunnableC0329v0(this, a2Var, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void H(C0328v c0328v, a2 a2Var) {
        AbstractC1887A.g(c0328v);
        K(a2Var);
        M(new RunnableC0335x0(this, (AbstractC1915a) c0328v, (Object) a2Var, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0882x
    public final boolean I(int i, Parcel parcel, Parcel parcel2) {
        boolean z5;
        List list;
        T1 t12 = this.f4330c;
        ArrayList arrayList = null;
        K j = null;
        M l7 = null;
        switch (i) {
            case 1:
                C0328v c0328v = (C0328v) AbstractC0887y.a(parcel, C0328v.CREATOR);
                a2 a2Var = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                H(c0328v, a2Var);
                parcel2.writeNoException();
                return true;
            case 2:
                V1 v12 = (V1) AbstractC0887y.a(parcel, V1.CREATOR);
                a2 a2Var2 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                e(v12, a2Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
            case 28:
            default:
                return false;
            case 4:
                a2 a2Var3 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                n(a2Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                C0328v c0328v2 = (C0328v) AbstractC0887y.a(parcel, C0328v.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                AbstractC0887y.d(parcel);
                AbstractC1887A.g(c0328v2);
                AbstractC1887A.d(string);
                L(string, true);
                M(new RunnableC0335x0(this, c0328v2, string, 2));
                parcel2.writeNoException();
                return true;
            case 6:
                a2 a2Var4 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                B(a2Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                a2 a2Var5 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                Object[] objArr = parcel.readInt() != 0;
                AbstractC0887y.d(parcel);
                K(a2Var5);
                String str = a2Var5.f4729q;
                AbstractC1887A.g(str);
                try {
                    List<W1> list2 = (List) t12.c().v(new CallableC0326u0(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (W1 w12 : list2) {
                        if (objArr != false || !Y1.M(w12.f4659c)) {
                            arrayList2.add(new V1(w12));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e7) {
                    e = e7;
                    t12.b().f4670w.d(X.w(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e8) {
                    e = e8;
                    t12.b().f4670w.d(X.w(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C0328v c0328v3 = (C0328v) AbstractC0887y.a(parcel, C0328v.CREATOR);
                String string2 = parcel.readString();
                AbstractC0887y.d(parcel);
                byte[] bArrM = m(c0328v3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrM);
                return true;
            case 10:
                long j7 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                AbstractC0887y.d(parcel);
                r(j7, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                a2 a2Var6 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                String strX = x(a2Var6);
                parcel2.writeNoException();
                parcel2.writeString(strX);
                return true;
            case 12:
                C0278e c0278e = (C0278e) AbstractC0887y.a(parcel, C0278e.CREATOR);
                a2 a2Var7 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                k(c0278e, a2Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                C0278e c0278e2 = (C0278e) AbstractC0887y.a(parcel, C0278e.CREATOR);
                AbstractC0887y.d(parcel);
                AbstractC1887A.g(c0278e2);
                AbstractC1887A.g(c0278e2.f4832s);
                AbstractC1887A.d(c0278e2.f4830q);
                L(c0278e2.f4830q, true);
                M(new I4.a(6, (Object) this, (Object) new C0278e(c0278e2), false));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = AbstractC0887y.f11126a;
                z5 = parcel.readInt() != 0;
                a2 a2Var8 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                List listT = t(string6, string7, z5, a2Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listT);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = AbstractC0887y.f11126a;
                z5 = parcel.readInt() != 0;
                AbstractC0887y.d(parcel);
                List listI = i(string8, string9, string10, z5);
                parcel2.writeNoException();
                parcel2.writeTypedList(listI);
                return true;
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                a2 a2Var9 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                List listZ = z(string11, string12, a2Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZ);
                return true;
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                AbstractC0887y.d(parcel);
                List listV = v(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listV);
                return true;
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                a2 a2Var10 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                l(a2Var10);
                parcel2.writeNoException();
                return true;
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                Bundle bundle = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                a2 a2Var11 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                E(a2Var11, bundle);
                parcel2.writeNoException();
                return true;
            case 20:
                a2 a2Var12 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                F(a2Var12);
                parcel2.writeNoException();
                return true;
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                a2 a2Var13 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                C0290i c0290iG = g(a2Var13);
                parcel2.writeNoException();
                if (c0290iG == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                c0290iG.writeToParcel(parcel2, 1);
                return true;
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                a2 a2Var14 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                AbstractC0887y.d(parcel);
                K(a2Var14);
                String str2 = a2Var14.f4729q;
                AbstractC1887A.g(str2);
                if (!t12.d0().y(null, F.f4409Y0)) {
                    try {
                        list = (List) t12.c().v(new CallableC0341z0(this, a2Var14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e9) {
                        t12.b().f4670w.d(X.w(str2), e9, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) t12.c().w(new CallableC0341z0(this, a2Var14, bundle2, 0)).get(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                        t12.b().f4670w.d(X.w(str2), e10, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                a2 a2Var15 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                s(a2Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                a2 a2Var16 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                C(a2Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                a2 a2Var17 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                AbstractC0887y.d(parcel);
                q(a2Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                a2 a2Var18 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                M1 m12 = (M1) AbstractC0887y.a(parcel, M1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    l7 = iInterfaceQueryLocalInterface instanceof M ? (M) iInterfaceQueryLocalInterface : new L(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 2);
                }
                AbstractC0887y.d(parcel);
                D(a2Var18, m12, l7);
                parcel2.writeNoException();
                return true;
            case 30:
                a2 a2Var19 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                C0275d c0275d = (C0275d) AbstractC0887y.a(parcel, C0275d.CREATOR);
                AbstractC0887y.d(parcel);
                p(a2Var19, c0275d);
                parcel2.writeNoException();
                return true;
            case 31:
                a2 a2Var20 = (a2) AbstractC0887y.a(parcel, a2.CREATOR);
                Bundle bundle3 = (Bundle) AbstractC0887y.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    j = iInterfaceQueryLocalInterface2 instanceof K ? (K) iInterfaceQueryLocalInterface2 : new J(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 2);
                }
                AbstractC0887y.d(parcel);
                y(a2Var20, bundle3, j);
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J(Runnable runnable) {
        T1 t12 = this.f4330c;
        if (t12.c().u()) {
            runnable.run();
        } else {
            t12.c().z(runnable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K(a2 a2Var) {
        AbstractC1887A.g(a2Var);
        String str = a2Var.f4729q;
        AbstractC1887A.d(str);
        L(str, false);
        this.f4330c.j0().s(a2Var.f4730r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L(String str, boolean z5) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        T1 t12 = this.f4330c;
        if (zIsEmpty) {
            t12.b().f4670w.b("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z5) {
            try {
                if (this.f4331d == null) {
                    boolean z6 = true;
                    if (!"com.google.android.gms".equals(this.f4332e) && !B3.b.c(t12.f4582B.f5072q, Binder.getCallingUid()) && !com.google.android.gms.common.i.a(t12.f4582B.f5072q).b(Binder.getCallingUid())) {
                        z6 = false;
                    }
                    this.f4331d = Boolean.valueOf(z6);
                }
                if (this.f4331d.booleanValue()) {
                    return;
                }
            } catch (SecurityException e7) {
                t12.b().f4670w.c(X.w(str), "Measurement Service called with invalid calling package. appId");
                throw e7;
            }
        }
        if (this.f4332e == null && com.google.android.gms.common.h.uidHasPackageName(t12.f4582B.f5072q, Binder.getCallingUid(), str)) {
            this.f4332e = str;
        }
        if (str.equals(this.f4332e)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M(Runnable runnable) {
        T1 t12 = this.f4330c;
        if (t12.c().u()) {
            runnable.run();
        } else {
            t12.c().x(runnable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void e(V1 v12, a2 a2Var) {
        AbstractC1887A.g(v12);
        K(a2Var);
        M(new RunnableC0335x0(this, (AbstractC1915a) v12, (Object) a2Var, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final C0290i g(a2 a2Var) {
        K(a2Var);
        String str = a2Var.f4729q;
        AbstractC1887A.d(str);
        T1 t12 = this.f4330c;
        try {
            return (C0290i) t12.c().w(new CallableC0326u0(this, a2Var, 1)).get(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            t12.b().f4670w.d(X.w(str), e7, "Failed to get consent. appId");
            return new C0290i(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final List i(String str, String str2, String str3, boolean z5) {
        L(str, true);
        T1 t12 = this.f4330c;
        try {
            List<W1> list = (List) t12.c().v(new CallableC0338y0(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (W1 w12 : list) {
                if (z5 || !Y1.M(w12.f4659c)) {
                    arrayList.add(new V1(w12));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            t12.b().f4670w.d(X.w(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e8) {
            e = e8;
            t12.b().f4670w.d(X.w(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void k(C0278e c0278e, a2 a2Var) {
        AbstractC1887A.g(c0278e);
        AbstractC1887A.g(c0278e.f4832s);
        K(a2Var);
        C0278e c0278e2 = new C0278e(c0278e);
        c0278e2.f4830q = a2Var.f4729q;
        M(new RunnableC0335x0(this, (AbstractC1915a) c0278e2, (Object) a2Var, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void l(a2 a2Var) {
        String str = a2Var.f4729q;
        AbstractC1887A.d(str);
        L(str, false);
        M(new RunnableC0329v0(this, a2Var, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final byte[] m(C0328v c0328v, String str) {
        AbstractC1887A.d(str);
        AbstractC1887A.g(c0328v);
        L(str, true);
        T1 t12 = this.f4330c;
        V v6 = t12.b().f4665D;
        C0323t0 c0323t0 = t12.f4582B;
        Q q7 = c0323t0.f5081z;
        String str2 = c0328v.f5091q;
        v6.c(q7.a(str2), "Log and bundle. event");
        t12.e().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) t12.c().w(new G3.b(this, c0328v, str)).get();
            if (bArr == null) {
                t12.b().f4670w.c(X.w(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            t12.e().getClass();
            t12.b().f4665D.e("Log and bundle processed. event, size, time_ms", c0323t0.f5081z.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e7) {
            e = e7;
            t12.b().f4670w.e("Failed to log and bundle. appId, event, error", X.w(str), c0323t0.f5081z.a(str2), e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            t12.b().f4670w.e("Failed to log and bundle. appId, event, error", X.w(str), c0323t0.f5081z.a(str2), e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void n(a2 a2Var) {
        K(a2Var);
        M(new RunnableC0329v0(this, a2Var, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void p(a2 a2Var, C0275d c0275d) {
        K(a2Var);
        M(new RunnableC0335x0((Object) this, a2Var, (Object) c0275d, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void q(a2 a2Var) {
        K(a2Var);
        M(new RunnableC0329v0(this, a2Var, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void r(long j, String str, String str2, String str3) {
        M(new RunnableC0332w0(this, str2, str3, str, j, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void s(a2 a2Var) {
        AbstractC1887A.d(a2Var.f4729q);
        AbstractC1887A.g(a2Var.f4716I);
        J(new RunnableC0329v0(this, a2Var, 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final List t(String str, String str2, boolean z5, a2 a2Var) {
        K(a2Var);
        String str3 = a2Var.f4729q;
        AbstractC1887A.g(str3);
        T1 t12 = this.f4330c;
        try {
            List<W1> list = (List) t12.c().v(new CallableC0338y0(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (W1 w12 : list) {
                if (z5 || !Y1.M(w12.f4659c)) {
                    arrayList.add(new V1(w12));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            t12.b().f4670w.d(X.w(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e8) {
            e = e8;
            t12.b().f4670w.d(X.w(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final List v(String str, String str2, String str3) {
        L(str, true);
        T1 t12 = this.f4330c;
        try {
            return (List) t12.c().v(new CallableC0338y0(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e7) {
            t12.b().f4670w.c(e7, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final String x(a2 a2Var) {
        K(a2Var);
        T1 t12 = this.f4330c;
        try {
            return (String) t12.c().v(new CallableC0326u0(t12, a2Var)).get(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            t12.b().f4670w.d(X.w(a2Var.f4729q), e7, "Failed to get app instance id. appId");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final void y(a2 a2Var, Bundle bundle, K k7) {
        K(a2Var);
        String str = a2Var.f4729q;
        AbstractC1887A.g(str);
        this.f4330c.c().x(new A0(this, a2Var, bundle, k7, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.I
    public final List z(String str, String str2, a2 a2Var) {
        K(a2Var);
        String str3 = a2Var.f4729q;
        AbstractC1887A.g(str3);
        T1 t12 = this.f4330c;
        try {
            return (List) t12.c().v(new CallableC0338y0(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e7) {
            t12.b().f4670w.c(e7, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }
}
