package com.google.android.gms.vision.clearcut;

import C3.c;
import E3.h;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.internal.vision.C;
import com.google.android.gms.internal.vision.C0905e;
import com.google.android.gms.internal.vision.C0907f;
import com.google.android.gms.internal.vision.C0923n;
import com.google.android.gms.internal.vision.C0925o;
import com.google.android.gms.internal.vision.C0936u;
import com.google.android.gms.internal.vision.C0938v;
import com.google.android.gms.internal.vision.C0942x;
import com.google.android.gms.internal.vision.C0944y;
import com.google.android.gms.internal.vision.D;
import com.google.android.gms.internal.vision.E;
import com.google.android.gms.internal.vision.a1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class LogUtils {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static E zza(long j, int i, String str, String str2, List<C> list, a1 a1Var) {
        C0936u c0936uL = C0938v.l();
        C0923n c0923nM = C0925o.m();
        if (c0923nM.f11264s) {
            c0923nM.d();
            c0923nM.f11264s = false;
        }
        C0925o.k((C0925o) c0923nM.f11263r, str2);
        if (c0923nM.f11264s) {
            c0923nM.d();
            c0923nM.f11264s = false;
        }
        C0925o.j((C0925o) c0923nM.f11263r, j);
        long j7 = i;
        if (c0923nM.f11264s) {
            c0923nM.d();
            c0923nM.f11264s = false;
        }
        C0925o.n((C0925o) c0923nM.f11263r, j7);
        if (c0923nM.f11264s) {
            c0923nM.d();
            c0923nM.f11264s = false;
        }
        C0925o.l((C0925o) c0923nM.f11263r, list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((C0925o) c0923nM.f());
        if (c0936uL.f11264s) {
            c0936uL.d();
            c0936uL.f11264s = false;
        }
        C0938v.k((C0938v) c0936uL.f11263r, arrayList);
        C0942x c0942xK = C0944y.k();
        long j8 = a1Var.f11256r;
        if (c0942xK.f11264s) {
            c0942xK.d();
            c0942xK.f11264s = false;
        }
        C0944y.l((C0944y) c0942xK.f11263r, j8);
        long j9 = a1Var.f11255q;
        if (c0942xK.f11264s) {
            c0942xK.d();
            c0942xK.f11264s = false;
        }
        C0944y.j((C0944y) c0942xK.f11263r, j9);
        long j10 = a1Var.f11257s;
        if (c0942xK.f11264s) {
            c0942xK.d();
            c0942xK.f11264s = false;
        }
        C0944y.m((C0944y) c0942xK.f11263r, j10);
        long j11 = a1Var.f11258t;
        if (c0942xK.f11264s) {
            c0942xK.d();
            c0942xK.f11264s = false;
        }
        C0944y.n((C0944y) c0942xK.f11263r, j11);
        C0944y c0944y = (C0944y) c0942xK.f();
        if (c0936uL.f11264s) {
            c0936uL.d();
            c0936uL.f11264s = false;
        }
        C0938v.j((C0938v) c0936uL.f11263r, c0944y);
        C0938v c0938v = (C0938v) c0936uL.f();
        D dK = E.k();
        if (dK.f11264s) {
            dK.d();
            dK.f11264s = false;
        }
        E.j((E) dK.f11263r, c0938v);
        return (E) dK.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String zzb(Context context) {
        try {
            return c.a(context).a(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e7) {
            h.z(e7, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static C0907f zza(Context context) {
        C0905e c0905eK = C0907f.k();
        String packageName = context.getPackageName();
        if (c0905eK.f11264s) {
            c0905eK.d();
            c0905eK.f11264s = false;
        }
        C0907f.j((C0907f) c0905eK.f11263r, packageName);
        String strZzb = zzb(context);
        if (strZzb != null) {
            if (c0905eK.f11264s) {
                c0905eK.d();
                c0905eK.f11264s = false;
            }
            C0907f.m((C0907f) c0905eK.f11263r, strZzb);
        }
        return (C0907f) c0905eK.f();
    }
}
