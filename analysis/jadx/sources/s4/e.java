package s4;

import O3.F;
import O3.InterfaceC0331w;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.os.Looper;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import com.google.android.gms.internal.measurement.C0772a4;
import com.google.android.gms.internal.measurement.C0827l3;
import com.google.android.gms.internal.measurement.C0837n3;
import com.google.android.gms.internal.measurement.C0866t3;
import com.google.android.gms.internal.measurement.C0896z3;
import com.google.android.gms.internal.measurement.L3;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.s4;
import d2.d0;
import java.util.List;
import r.C1548G;
import r.O;

/* JADX INFO: loaded from: classes.dex */
public class e implements C2.f, E3.c, E3.e, O0.o, InterfaceC0331w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static e f16469r;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16478q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ e f16470s = new e(13);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ e f16471t = new e(14);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ e f16472u = new e(15);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ e f16473v = new e(16);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ e f16474w = new e(17);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ e f16475x = new e(18);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ e f16476y = new e(19);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ e f16477z = new e(20);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ e f16460A = new e(21);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ e f16461B = new e(22);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ e f16462C = new e(23);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ e f16463D = new e(24);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ e f16464E = new e(25);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ e f16465F = new e(26);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ e f16466G = new e(27);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ e f16467H = new e(28);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ e f16468I = new e(29);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [E1.w.<clinit>():void, E3.f.<clinit>():void, F1.c.<init>():void, G1.e.<init>(android.text.method.KeyListener):void, O3.t0.<init>(O3.N0):void, com.google.android.gms.internal.measurement.n2.j(android.content.Context):E1.w, com.google.android.material.textfield.TextInputLayout.f(boolean):s4.g, com.google.android.material.textfield.TextInputLayout.onRtlPropertiesChanged(int):void, k3.c.<init>(int):void, s4.e.<clinit>():void, s4.j.<init>():void, s4.k.<init>():void] */
    public /* synthetic */ e(int i) {
        this.f16478q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Typeface g(String str, O0.j jVar, int i) {
        if (i == 0 && kotlin.jvm.internal.m.a(jVar, O0.j.f4281s) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), jVar.f4284q, i == 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C2.f
    public boolean a() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // E3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public E3.d b(android.content.Context r3, java.lang.String r4, E3.c r5) {
        /*
            r2 = this;
            E3.d r0 = new E3.d
            r0.<init>()
            int r1 = r5.c(r3, r4)
            r0.f1697a = r1
            r1 = 1
            int r3 = r5.f(r3, r4, r1)
            r0.f1698b = r3
            int r4 = r0.f1697a
            if (r4 != 0) goto L1b
            r4 = 0
            if (r3 != 0) goto L1b
            r1 = r4
            goto L1e
        L1b:
            if (r4 < r3) goto L1e
            r1 = -1
        L1e:
            r0.f1699c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.e.b(android.content.Context, java.lang.String, E3.c):E3.d");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E3.c
    public int c(Context context, String str) {
        return E3.f.a(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O0.o
    public Typeface d(O0.l lVar, O0.j jVar, int i) {
        lVar.getClass();
        return g("sans-serif", jVar, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O0.o
    public Typeface e(O0.j jVar, int i) {
        return g(null, jVar, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E3.c
    public int f(Context context, String str, boolean z5) {
        return E3.f.d(context, str, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Signature[] h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0331w
    public Object zza() {
        switch (this.f16478q) {
            case 13:
                return new Boolean(((Boolean) C0866t3.f11041a.b()).booleanValue());
            case 14:
                return new Boolean(((Boolean) C0896z3.f11128a.b()).booleanValue());
            case 15:
                return new Boolean(((Boolean) L3.f10664a.b()).booleanValue());
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                List list = F.f4412a;
                Y3.f10777r.get();
                Boolean bool = (Boolean) C0772a4.f10793c.b();
                bool.getClass();
                return bool;
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                List list2 = F.f4412a;
                Boolean bool2 = (Boolean) s4.f11032b.b();
                bool2.getClass();
                return bool2;
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                List list3 = F.f4412a;
                C0827l3.f10898r.get();
                return (String) C0837n3.f10957e.b();
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                List list4 = F.f4412a;
                C0827l3.f10898r.get();
                return Integer.valueOf((int) ((Long) C0837n3.f10969l0.b()).longValue());
            case 20:
                List list5 = F.f4412a;
                C0827l3.f10898r.get();
                return Integer.valueOf((int) ((Long) C0837n3.f10967k0.b()).longValue());
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                List list6 = F.f4412a;
                C0827l3.f10898r.get();
                return Integer.valueOf((int) ((Long) C0837n3.f10980r.b()).longValue());
            case 22:
                List list7 = F.f4412a;
                C0827l3.f10898r.get();
                return (String) C0837n3.f10972n.b();
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                List list8 = F.f4412a;
                C0827l3.f10898r.get();
                return (String) C0837n3.f10936N.b();
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                List list9 = F.f4412a;
                C0827l3.f10898r.get();
                Long l7 = (Long) C0837n3.f10923A.b();
                l7.getClass();
                return l7;
            case 25:
                List list10 = F.f4412a;
                C0827l3.f10898r.get();
                Long l8 = (Long) C0837n3.f10932J.b();
                l8.getClass();
                return l8;
            case 26:
                List list11 = F.f4412a;
                C0827l3.f10898r.get();
                return Integer.valueOf((int) ((Long) C0837n3.f10933K.b()).longValue());
            case 27:
                List list12 = F.f4412a;
                C0827l3.f10898r.get();
                return Integer.valueOf((int) ((Long) C0837n3.f10937O.b()).longValue());
            case 28:
                List list13 = F.f4412a;
                C0827l3.f10898r.get();
                Long l9 = (Long) C0837n3.f10940R.b();
                l9.getClass();
                return l9;
            default:
                List list14 = F.f4412a;
                C0827l3.f10898r.get();
                Long l10 = (Long) C0837n3.f10931I.b();
                l10.getClass();
                return l10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public e() {
        this.f16478q = 10;
        new d0(16);
        long[] jArr = O.f16162a;
        new C1548G();
    }

    @Override // C2.f
    public void shutdown() {
    }
}
