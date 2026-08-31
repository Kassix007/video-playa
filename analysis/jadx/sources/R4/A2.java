package R4;

import M5.InterfaceC0261w;
import com.web2native.MainActivity;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class A2 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MainActivity f6727q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f6728r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f6729s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6730t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f6731u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MainActivity f6732v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f6733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f6734x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(String str, MainActivity mainActivity, String str2, String str3, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6731u = str;
        this.f6732v = mainActivity;
        this.f6733w = str2;
        this.f6734x = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new A2(this.f6731u, this.f6732v, this.f6733w, this.f6734x, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A2) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: Exception -> 0x0019, TRY_LEAVE, TryCatch #0 {Exception -> 0x0019, blocks: (B:7:0x0015, B:25:0x0068, B:27:0x006c, B:40:0x00ac, B:13:0x0024, B:19:0x003f, B:21:0x0043, B:16:0x002b, B:28:0x0072, B:30:0x007b, B:32:0x0082, B:35:0x008a, B:38:0x0093), top: B:45:0x0009, inners: #1 }] */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = "the error is "
            int r1 = r10.f6730t
            r2 = 2
            r3 = 0
            r4 = 1
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L28
            if (r1 == r4) goto L24
            if (r1 != r2) goto L1c
            java.lang.String r1 = r10.f6729s
            java.lang.String r2 = r10.f6728r
            com.web2native.MainActivity r3 = r10.f6727q
            m5.AbstractC1362a.e(r11)     // Catch: java.lang.Exception -> L19
            goto L68
        L19:
            r11 = move-exception
            goto Lbe
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            m5.AbstractC1362a.e(r11)     // Catch: java.lang.Exception -> L19
            goto L3f
        L28:
            m5.AbstractC1362a.e(r11)
            java.lang.String r11 = r10.f6731u     // Catch: java.lang.Exception -> L19
            r10.f6730t = r4     // Catch: java.lang.Exception -> L19
            T5.e r1 = M5.H.f3811a     // Catch: java.lang.Exception -> L19
            T5.d r1 = T5.d.f7468q     // Catch: java.lang.Exception -> L19
            R4.C2 r6 = new R4.C2     // Catch: java.lang.Exception -> L19
            r6.<init>(r11, r3)     // Catch: java.lang.Exception -> L19
            java.lang.Object r11 = M5.AbstractC0263y.B(r1, r6, r10)     // Catch: java.lang.Exception -> L19
            if (r11 != r5) goto L3f
            goto L64
        L3f:
            byte[] r11 = (byte[]) r11     // Catch: java.lang.Exception -> L19
            if (r11 == 0) goto Ld1
            com.web2native.MainActivity r1 = r10.f6732v     // Catch: java.lang.Exception -> L19
            java.lang.String r6 = r10.f6733w     // Catch: java.lang.Exception -> L19
            java.lang.String r7 = r10.f6734x     // Catch: java.lang.Exception -> L19
            java.lang.String r8 = R4.V.f(r1, r6)     // Catch: java.lang.Exception -> L19
            r10.f6727q = r1     // Catch: java.lang.Exception -> L19
            r10.f6728r = r6     // Catch: java.lang.Exception -> L19
            r10.f6729s = r7     // Catch: java.lang.Exception -> L19
            r10.f6730t = r2     // Catch: java.lang.Exception -> L19
            T5.e r2 = M5.H.f3811a     // Catch: java.lang.Exception -> L19
            T5.d r2 = T5.d.f7468q     // Catch: java.lang.Exception -> L19
            R4.D2 r9 = new R4.D2     // Catch: java.lang.Exception -> L19
            r9.<init>(r1, r8, r11, r3)     // Catch: java.lang.Exception -> L19
            java.lang.Object r11 = M5.AbstractC0263y.B(r2, r9, r10)     // Catch: java.lang.Exception -> L19
            if (r11 != r5) goto L65
        L64:
            return r5
        L65:
            r3 = r1
            r2 = r6
            r1 = r7
        L68:
            java.io.File r11 = (java.io.File) r11     // Catch: java.lang.Exception -> L19
            if (r11 == 0) goto Ld1
            java.lang.String r5 = "com.wnapp.smspariaz.provider"
            android.net.Uri r11 = androidx.core.content.FileProvider.d(r3, r5, r11)     // Catch: java.lang.Exception -> L19
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Exception -> L88
            java.lang.String r6 = "android.intent.action.SEND"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L88
            if (r1 == 0) goto L8a
            boolean r6 = J5.m.U0(r1)     // Catch: java.lang.Exception -> L88
            r6 = r6 ^ r4
            if (r6 != r4) goto L8a
            java.lang.String r6 = "android.intent.extra.TEXT"
            r5.putExtra(r6, r1)     // Catch: java.lang.Exception -> L88
            goto L8a
        L88:
            r11 = move-exception
            goto Lac
        L8a:
            java.lang.String r1 = "android.intent.extra.STREAM"
            r5.putExtra(r1, r11)     // Catch: java.lang.Exception -> L88
            if (r2 != 0) goto L93
        */
        //  java.lang.String r2 = "*/*"
        /*
        L93:
            java.lang.String r11 = D5.a.w(r2)     // Catch: java.lang.Exception -> L88
            r5.setType(r11)     // Catch: java.lang.Exception -> L88
            r5.addFlags(r4)     // Catch: java.lang.Exception -> L88
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r11)     // Catch: java.lang.Exception -> L88
            java.lang.String r11 = "Share File"
            android.content.Intent r11 = android.content.Intent.createChooser(r5, r11)     // Catch: java.lang.Exception -> L88
            r3.startActivity(r11)     // Catch: java.lang.Exception -> L88
            goto Ld1
        Lac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L19
            r1.<init>(r0)     // Catch: java.lang.Exception -> L19
            r1.append(r11)     // Catch: java.lang.Exception -> L19
            java.lang.String r11 = r1.toString()     // Catch: java.lang.Exception -> L19
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Exception -> L19
            r0.println(r11)     // Catch: java.lang.Exception -> L19
            goto Ld1
        Lbe:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "the error = "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.io.PrintStream r0 = java.lang.System.out
            r0.print(r11)
        Ld1:
            m5.y r11 = m5.C1386y.f15098a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.A2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
