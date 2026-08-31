package C0;

import P5.InterfaceC0398i;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public O5.b f1094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f1096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f1097t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f1098u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r1 f1099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ O5.e f1100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f1101x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(ContentResolver contentResolver, Uri uri, r1 r1Var, O5.e eVar, Context context, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1097t = contentResolver;
        this.f1098u = uri;
        this.f1099v = r1Var;
        this.f1100w = eVar;
        this.f1101x = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        q1 q1Var = new q1(this.f1097t, this.f1098u, this.f1099v, this.f1100w, this.f1101x, interfaceC1524c);
        q1Var.f1096s = obj;
        return q1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((InterfaceC0398i) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r6.emit(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0044, B:22:0x0055, B:24:0x005d, B:14:0x002c, B:17:0x003d), top: B:31:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f1095r
            r1 = 2
            r2 = 1
            C0.r1 r3 = r10.f1099v
            android.content.ContentResolver r4 = r10.f1097t
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L30
            if (r0 == r2) goto L26
            if (r0 != r1) goto L1e
            O5.b r0 = r10.f1094q
            java.lang.Object r6 = r10.f1096s
            P5.i r6 = (P5.InterfaceC0398i) r6
            m5.AbstractC1362a.e(r11)     // Catch: java.lang.Throwable -> L1c
        L19:
            r11 = r6
            r6 = r0
            goto L44
        L1c:
            r11 = move-exception
            goto L86
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            O5.b r0 = r10.f1094q
            java.lang.Object r6 = r10.f1096s
            P5.i r6 = (P5.InterfaceC0398i) r6
            m5.AbstractC1362a.e(r11)     // Catch: java.lang.Throwable -> L1c
            goto L55
        L30:
            m5.AbstractC1362a.e(r11)
            java.lang.Object r11 = r10.f1096s
            P5.i r11 = (P5.InterfaceC0398i) r11
            android.net.Uri r0 = r10.f1098u
            r6 = 0
            r4.registerContentObserver(r0, r6, r3)
            O5.e r0 = r10.f1100w     // Catch: java.lang.Throwable -> L1c
            O5.b r6 = new O5.b     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L1c
        L44:
            r10.f1096s = r11     // Catch: java.lang.Throwable -> L1c
            r10.f1094q = r6     // Catch: java.lang.Throwable -> L1c
            r10.f1095r = r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r6.b(r10)     // Catch: java.lang.Throwable -> L1c
            if (r0 != r5) goto L51
            goto L7f
        L51:
            r9 = r6
            r6 = r11
            r11 = r0
            r0 = r9
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1c
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L80
            r0.c()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r11 = r10.f1101x     // Catch: java.lang.Throwable -> L1c
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1c
            r10.f1096s = r6     // Catch: java.lang.Throwable -> L1c
            r10.f1094q = r0     // Catch: java.lang.Throwable -> L1c
            r10.f1095r = r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r11 = r6.emit(r7, r10)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r5) goto L19
        L7f:
            return r5
        L80:
            r4.unregisterContentObserver(r3)
            m5.y r11 = m5.C1386y.f15098a
            return r11
        L86:
            r4.unregisterContentObserver(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
