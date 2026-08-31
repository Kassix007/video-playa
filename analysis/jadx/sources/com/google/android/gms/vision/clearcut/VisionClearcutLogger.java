package com.google.android.gms.vision.clearcut;

import B0.C0040f0;
import E3.h;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.clearcut.w0;
import com.google.android.gms.internal.vision.AbstractC0899b;
import com.google.android.gms.internal.vision.C0941w0;
import com.google.android.gms.internal.vision.D;
import com.google.android.gms.internal.vision.E;
import com.google.android.gms.internal.vision.I0;
import com.google.android.gms.internal.vision.L0;
import com.google.android.gms.internal.vision.Q;
import com.google.android.gms.internal.vision.U;
import com.google.android.gms.internal.vision.Z;
import java.io.IOException;
import t3.a;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class VisionClearcutLogger {
    private final a zza;
    private boolean zzb = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public VisionClearcutLogger(@RecentlyNonNull Context context) {
        this.zza = new a(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void zza(int i, E e7) {
        U uA;
        e7.getClass();
        try {
            int iH = e7.h();
            byte[] bArr = new byte[iH];
            Q q7 = new Q(iH, bArr);
            e7.getClass();
            I0 i02 = I0.f11178c;
            i02.getClass();
            L0 l0A = i02.a(e7.getClass());
            C0941w0 c0941w0 = q7.f11224b;
            if (c0941w0 == null) {
                c0941w0 = new C0941w0(q7);
            }
            l0A.b(e7, c0941w0);
            if (q7.F() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (i < 0 || i > 3) {
                Object[] objArr = {Integer.valueOf(i)};
                if (Log.isLoggable("Vision", 4)) {
                    Log.i("Vision", String.format("Illegal event code: %d", objArr));
                    return;
                }
                return;
            }
            try {
                if (this.zzb) {
                    a aVar = this.zza;
                    aVar.getClass();
                    C0040f0 c0040f0 = new C0040f0(aVar, bArr);
                    ((w0) c0040f0.f426e).f10570s = i;
                    c0040f0.b();
                    return;
                }
                D dK = E.k();
                try {
                    U u6 = U.f11232b;
                    if (u6 == null) {
                        synchronized (U.class) {
                            try {
                                uA = U.f11232b;
                                if (uA == null) {
                                    uA = Z.a();
                                    U.f11232b = uA;
                                }
                            } finally {
                            }
                        }
                        u6 = uA;
                    }
                    dK.c(bArr, iH, u6);
                    String string = dK.toString();
                    if (Log.isLoggable("Vision", 6)) {
                        Log.e("Vision", "Would have logged:\n" + string);
                    }
                } catch (Exception e8) {
                    h.z(e8, "Parsing error", new Object[0]);
                }
            } catch (Exception e9) {
                AbstractC0899b.f11260a.q(e9);
                h.z(e9, "Failed to log", new Object[0]);
            }
        } catch (IOException e10) {
            String name = E.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e10);
        }
    }
}
