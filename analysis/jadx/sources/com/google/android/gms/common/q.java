package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import x3.AbstractC1887A;
import x3.x;
import x3.y;
import x3.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f10360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f10361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile z f10362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f10363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f10364e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new m(0, n.J("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new m(1, n.J("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f10360a = new m(2, n.J("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f10361b = new m(3, n.J("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f10363d = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static t a(String str, o oVar, boolean z5, boolean z6) {
        try {
            b();
            AbstractC1887A.g(f10364e);
            try {
                z zVar = f10362c;
                D3.b bVar = new D3.b(f10364e.getPackageManager());
                x xVar = (x) zVar;
                Parcel parcelK = xVar.K();
                int i = J3.a.f2805a;
                boolean z7 = true;
                parcelK.writeInt(1);
                int iY = AbstractC0836n2.Y(parcelK, 20293);
                AbstractC0836n2.V(parcelK, 1, str);
                AbstractC0836n2.S(parcelK, 2, oVar);
                AbstractC0836n2.b0(parcelK, 3, 4);
                parcelK.writeInt(z5 ? 1 : 0);
                AbstractC0836n2.b0(parcelK, 4, 4);
                parcelK.writeInt(z6 ? 1 : 0);
                AbstractC0836n2.a0(parcelK, iY);
                J3.a.c(parcelK, bVar);
                Parcel parcelI = xVar.I(parcelK, 5);
                if (parcelI.readInt() == 0) {
                    z7 = false;
                }
                parcelI.recycle();
                return z7 ? t.f10370d : new s(new l(z5, str, oVar));
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return new t(false, "module call", e7);
            }
        } catch (E3.b e8) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            return new t(false, "module init: ".concat(String.valueOf(e8.getMessage())), e8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b() {
        z xVar;
        if (f10362c != null) {
            return;
        }
        AbstractC1887A.g(f10364e);
        synchronized (f10363d) {
            try {
                if (f10362c == null) {
                    IBinder iBinderB = E3.f.c(f10364e, E3.f.f1702d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = y.f18525d;
                    if (iBinderB == null) {
                        xVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        xVar = iInterfaceQueryLocalInterface instanceof z ? (z) iInterfaceQueryLocalInterface : new x(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
                    }
                    f10362c = xVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
