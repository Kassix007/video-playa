package x3;

import O3.InterfaceC0281f;
import O3.InterfaceC0331w;
import android.content.Context;
import android.graphics.Typeface;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import com.google.android.gms.internal.measurement.C0827l3;
import com.google.android.gms.internal.measurement.C0837n3;
import com.google.android.gms.internal.measurement.C0866t3;
import com.google.android.gms.internal.measurement.I3;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.s4;
import java.util.List;

/* JADX INFO: renamed from: x3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1899k implements E3.e, O0.n, O0.o, InterfaceC0281f, InterfaceC0331w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static C1899k f18483r;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18492q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18484s = new C1899k(12);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18485t = new C1899k(13);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18486u = new C1899k(14);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18487v = new C1899k(15);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18488w = new C1899k(16);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18489x = new C1899k(17);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18490y = new C1899k(18);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18491z = new C1899k(19);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18473A = new C1899k(20);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18474B = new C1899k(21);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18475C = new C1899k(22);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18476D = new C1899k(23);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18477E = new C1899k(24);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18478F = new C1899k(25);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18479G = new C1899k(26);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18480H = new C1899k(27);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18481I = new C1899k(28);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ C1899k f18482J = new C1899k(29);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [E1.D.a():void, E1.l.<init>(E1.w):void, E3.f.<clinit>():void, G1.b.<init>(android.widget.EditText, android.view.inputmethod.InputConnection, android.view.inputmethod.EditorInfo):void, J1.H.<init>():void, com.google.android.gms.internal.measurement.P1.r(android.content.Context):O0.e, k3.c.<init>(int):void, x3.k.<clinit>():void, x3.k.f():x3.k] */
    public /* synthetic */ C1899k(int i) {
        this.f18492q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Typeface c(String str, O0.j jVar, int i) {
        if (i == 0 && kotlin.jvm.internal.m.a(jVar, O0.j.f4281s) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iP = K1.p(jVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iP) : Typeface.create(str, iP);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized C1899k f() {
        try {
            if (f18483r == null) {
                f18483r = new C1899k(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18483r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g(G1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            r0 = 0
            if (r8 == 0) goto Lef
            if (r9 < 0) goto Lef
            if (r10 >= 0) goto L9
            goto Lef
        L9:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            r3 = -1
            if (r1 == r3) goto Lef
            if (r2 == r3) goto Lef
            if (r1 == r2) goto L1a
            goto Lef
        L1a:
            r4 = 1
            if (r11 == 0) goto La5
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            if (r1 < 0) goto L2c
            if (r11 >= r1) goto L2a
            goto L2c
        L2a:
            if (r9 >= 0) goto L2e
        L2c:
            r1 = r3
            goto L5d
        L2e:
            r11 = r0
        L2f:
            if (r9 != 0) goto L32
            goto L5d
        L32:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L3b
            if (r11 == 0) goto L39
            goto L2c
        L39:
            r1 = r0
            goto L5d
        L3b:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L4b
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L48
            goto L2c
        L48:
            int r9 = r9 + (-1)
            goto L2e
        L4b:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L54
            int r9 = r9 + (-1)
            goto L2f
        L54:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L5b
            goto L2c
        L5b:
            r11 = r4
            goto L2f
        L5d:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L6c
            if (r10 >= r2) goto L6a
            goto L6c
        L6a:
            if (r9 >= 0) goto L6e
        L6c:
            r10 = r3
            goto La0
        L6e:
            r11 = r0
        L6f:
            if (r9 != 0) goto L73
            r10 = r2
            goto La0
        L73:
            if (r2 < r10) goto L78
            if (r11 == 0) goto La0
            goto L6c
        L78:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L8a
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L85
            goto L6c
        L85:
            int r9 = r9 + (-1)
            int r2 = r2 + 1
            goto L6e
        L8a:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L95
            int r9 = r9 + (-1)
            int r2 = r2 + 1
            goto L6f
        L95:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L9c
            goto L6c
        L9c:
            int r2 = r2 + 1
            r11 = r4
            goto L6f
        La0:
            if (r1 == r3) goto Lef
            if (r10 != r3) goto Lb3
            goto Lef
        La5:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        Lb3:
            java.lang.Class<E1.B> r9 = E1.B.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            E1.B[] r9 = (E1.B[]) r9
            if (r9 == 0) goto Lef
            int r11 = r9.length
            if (r11 <= 0) goto Lef
            int r11 = r9.length
            r2 = r0
        Lc2:
            if (r2 >= r11) goto Ld9
            r3 = r9[r2]
            int r5 = r8.getSpanStart(r3)
            int r3 = r8.getSpanEnd(r3)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r10)
            int r2 = r2 + 1
            goto Lc2
        Ld9:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            return r4
        Lef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C1899k.g(G1.b, android.text.Editable, int, int, boolean):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0281f
    public /* synthetic */ String a(String str, String str2) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E3.e
    public E3.d b(Context context, String str, E3.c cVar) {
        int iF;
        switch (this.f18492q) {
            case 5:
                E3.d dVar = new E3.d();
                int iC = cVar.c(context, str);
                dVar.f1697a = iC;
                if (iC != 0) {
                    dVar.f1699c = -1;
                } else {
                    int iF2 = cVar.f(context, str, true);
                    dVar.f1698b = iF2;
                    if (iF2 != 0) {
                        dVar.f1699c = 1;
                    }
                }
                return dVar;
            default:
                E3.d dVar2 = new E3.d();
                int iC2 = cVar.c(context, str);
                dVar2.f1697a = iC2;
                int i = 1;
                int i7 = 0;
                if (iC2 != 0) {
                    iF = cVar.f(context, str, false);
                    dVar2.f1698b = iF;
                } else {
                    iF = cVar.f(context, str, true);
                    dVar2.f1698b = iF;
                }
                int i8 = dVar2.f1697a;
                if (i8 == 0) {
                    if (iF == 0) {
                        i = 0;
                    }
                    dVar2.f1699c = i;
                    return dVar2;
                }
                i7 = i8;
                if (i7 >= iF) {
                    i = -1;
                }
                dVar2.f1699c = i;
                return dVar2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    @Override // O0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface d(O0.l r5, O0.j r6, int r7) {
        /*
            r4 = this;
            r5.getClass()
            int r5 = r6.f4284q
            int r5 = r5 / 100
            java.lang.String r0 = "sans-serif"
            r1 = 2
            if (r5 < 0) goto L11
            if (r5 >= r1) goto L11
            java.lang.String r5 = "sans-serif-thin"
            goto L33
        L11:
            r2 = 4
            if (r1 > r5) goto L19
            if (r5 >= r2) goto L19
            java.lang.String r5 = "sans-serif-light"
            goto L33
        L19:
            if (r5 != r2) goto L1d
        L1b:
            r5 = r0
            goto L33
        L1d:
            r1 = 5
            if (r5 != r1) goto L23
            java.lang.String r5 = "sans-serif-medium"
            goto L33
        L23:
            r1 = 6
            r2 = 8
            if (r1 > r5) goto L2b
            if (r5 >= r2) goto L2b
            goto L1b
        L2b:
            if (r2 > r5) goto L1b
            r1 = 11
            if (r5 >= r1) goto L1b
            java.lang.String r5 = "sans-serif-black"
        L33:
            int r1 = r5.length()
            r2 = 0
            if (r1 != 0) goto L3b
            goto L5a
        L3b:
            android.graphics.Typeface r5 = c(r5, r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            int r3 = com.google.android.gms.internal.measurement.K1.p(r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r3)
            boolean r1 = kotlin.jvm.internal.m.a(r5, r1)
            if (r1 != 0) goto L5a
            android.graphics.Typeface r1 = c(r2, r6, r7)
            boolean r1 = kotlin.jvm.internal.m.a(r5, r1)
            if (r1 != 0) goto L5a
            r2 = r5
        L5a:
            if (r2 != 0) goto L61
            android.graphics.Typeface r5 = c(r0, r6, r7)
            return r5
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C1899k.d(O0.l, O0.j, int):android.graphics.Typeface");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O0.o
    public Typeface e(O0.j jVar, int i) {
        return c(null, jVar, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean h(CharSequence charSequence) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0331w
    public Object zza() {
        switch (this.f18492q) {
            case 13:
                return new Boolean(((Boolean) C0866t3.f11042b.b()).booleanValue());
            case 14:
                return new Boolean(((Boolean) I3.f10648a.b()).booleanValue());
            case 15:
                List list = O3.F.f4412a;
                C0827l3.f10898r.get();
                Long l7 = (Long) C0837n3.f10951b.b();
                l7.getClass();
                return l7;
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                List list2 = O3.F.f4412a;
                Boolean bool = (Boolean) s4.f11031a.b();
                bool.getClass();
                return bool;
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                List list3 = O3.F.f4412a;
                Boolean bool2 = (Boolean) g4.f10854a.b();
                bool2.getClass();
                return bool2;
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                List list4 = O3.F.f4412a;
                C0827l3.f10898r.get();
                return (String) C0837n3.f10968l.b();
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                List list5 = O3.F.f4412a;
                C0827l3.f10898r.get();
                return Integer.valueOf((int) ((Long) C0837n3.f10975o0.b()).longValue());
            case 20:
                List list6 = O3.F.f4412a;
                C0827l3.f10898r.get();
                return Integer.valueOf((int) ((Long) C0837n3.f10979q0.b()).longValue());
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                List list7 = O3.F.f4412a;
                C0827l3.f10898r.get();
                return (String) C0837n3.f10987u0.b();
            case 22:
                List list8 = O3.F.f4412a;
                C0827l3.f10898r.get();
                return (String) C0837n3.f10935M.b();
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                List list9 = O3.F.f4412a;
                C0827l3.f10898r.get();
                Long l8 = (Long) C0837n3.f10942T.b();
                l8.getClass();
                return l8;
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                List list10 = O3.F.f4412a;
                C0827l3.f10898r.get();
                Long l9 = (Long) C0837n3.f10943U.b();
                l9.getClass();
                return l9;
            case 25:
                List list11 = O3.F.f4412a;
                C0827l3.f10898r.get();
                Long l10 = (Long) C0837n3.f10934L.b();
                l10.getClass();
                return l10;
            case 26:
                List list12 = O3.F.f4412a;
                C0827l3.f10898r.get();
                return Integer.valueOf((int) ((Long) C0837n3.f10938P.b()).longValue());
            case 27:
                List list13 = O3.F.f4412a;
                C0827l3.f10898r.get();
                Long l11 = (Long) C0837n3.f10941S.b();
                l11.getClass();
                return l11;
            case 28:
                List list14 = O3.F.f4412a;
                C0827l3.f10898r.get();
                Long l12 = (Long) C0837n3.f10939Q.b();
                l12.getClass();
                return l12;
            default:
                List list15 = O3.F.f4412a;
                C0827l3.f10898r.get();
                Long l13 = (Long) C0837n3.f.b();
                l13.getClass();
                return l13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1899k(int i, int i7) {
        this.f18492q = 1;
    }
}
