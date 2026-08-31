package e3;

import M5.InterfaceC0261w;
import P.W;
import android.content.Context;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class v extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Throwable f12627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f12630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f12631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f12632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ W f12633w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar, Context context, p pVar, W w3, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f12630t = uVar;
        this.f12631u = context;
        this.f12632v = pVar;
        this.f12633w = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new v(this.f12630t, this.f12631u, this.f12632v, this.f12633w, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r2 == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00b6 -> B:43:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00ec -> B:16:0x0034). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r5.a r7 = r5.EnumC1580a.f16356q
            int r0 = r14.f12629s
            r8 = 0
            r9 = 0
            r10 = 1
            r11 = 2
            if (r0 == 0) goto L2f
            if (r0 == r10) goto L26
            if (r0 != r11) goto L1e
            int r1 = r14.f12628r
            java.lang.Throwable r0 = r14.f12627q
            m5.AbstractC1362a.e(r15)     // Catch: java.lang.Throwable -> L19
            r12 = r0
            r0 = r15
            goto Lb7
        L19:
            r0 = move-exception
            r13 = r1
        L1b:
            r1 = r0
            goto Lec
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L26:
            int r0 = r14.f12628r
            java.lang.Throwable r1 = r14.f12627q
            m5.AbstractC1362a.e(r15)
            r2 = r15
            goto L64
        L2f:
            m5.AbstractC1362a.e(r15)
            r0 = r8
            r1 = r9
        L34:
            P.W r2 = r14.f12633w
            java.lang.Object r2 = r2.getValue()
            e3.o r2 = (e3.o) r2
            P.C r2 = r2.f12609u
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Lf0
            if (r0 == 0) goto L6c
            e3.u r2 = r14.f12630t
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            kotlin.jvm.internal.m.b(r1)
            r14.f12627q = r1
            r14.f12628r = r0
            r14.f12629s = r10
            r2.invoke(r3, r1, r14)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            if (r2 != r7) goto L64
            goto Lb5
        L64:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lf0
        L6c:
            r13 = r0
            r12 = r1
            android.content.Context r0 = r14.f12631u     // Catch: java.lang.Throwable -> Le9
            e3.p r1 = r14.f12632v     // Catch: java.lang.Throwable -> Le9
            java.lang.String r2 = "fonts/"
            boolean r3 = J5.m.U0(r2)     // Catch: java.lang.Throwable -> Le9
            if (r3 == 0) goto L7c
            r3 = r9
            goto L8d
        L7c:
            r3 = 47
            boolean r3 = J5.m.M0(r2, r3)     // Catch: java.lang.Throwable -> Le9
            if (r3 == 0) goto L86
        L84:
            r3 = r2
            goto L8d
        L86:
            java.lang.String r3 = "/"
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> Le9
            goto L84
        L8d:
            java.lang.String r2 = ".ttf"
            java.lang.String r4 = "."
            boolean r5 = J5.m.U0(r2)     // Catch: java.lang.Throwable -> Le9
            if (r5 == 0) goto L98
            goto L9e
        L98:
            boolean r5 = J5.t.G0(r2, r4, r8)     // Catch: java.lang.Throwable -> Le9
            if (r5 == 0) goto La0
        L9e:
            r4 = r2
            goto La5
        La0:
            java.lang.String r2 = r4.concat(r2)     // Catch: java.lang.Throwable -> Le9
            goto L9e
        La5:
            java.lang.String r5 = "__LottieInternalDefaultCacheKey__"
            r14.f12627q = r12     // Catch: java.lang.Throwable -> Le9
            r14.f12628r = r13     // Catch: java.lang.Throwable -> Le9
            r14.f12629s = r11     // Catch: java.lang.Throwable -> Le9
            r2 = 0
            r6 = r14
            java.lang.Object r0 = E3.h.k(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Le9
            if (r0 != r7) goto Lb6
        Lb5:
            return r7
        Lb6:
            r1 = r13
        Lb7:
            a3.k r0 = (a3.C0632k) r0     // Catch: java.lang.Throwable -> L19
            P.W r2 = r14.f12633w     // Catch: java.lang.Throwable -> L19
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L19
            e3.o r2 = (e3.o) r2     // Catch: java.lang.Throwable -> L19
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "composition"
            kotlin.jvm.internal.m.e(r0, r3)     // Catch: java.lang.Throwable -> Le6
            P.C r3 = r2.f12608t     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Le6
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Le6
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Le6
            if (r3 == 0) goto Ld7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            goto Le2
        Ld7:
            P.f0 r3 = r2.f12606r     // Catch: java.lang.Throwable -> Le6
            r3.setValue(r0)     // Catch: java.lang.Throwable -> Le6
            M5.m r3 = r2.f12605q     // Catch: java.lang.Throwable -> Le6
            r3.N(r0)     // Catch: java.lang.Throwable -> Le6
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
        Le2:
            r0 = r1
            r1 = r12
            goto L34
        Le6:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le6
            throw r0     // Catch: java.lang.Throwable -> L19
        Le9:
            r0 = move-exception
            goto L1b
        Lec:
            int r0 = r13 + 1
            goto L34
        Lf0:
            P.W r0 = r14.f12633w
            java.lang.Object r0 = r0.getValue()
            e3.o r0 = (e3.o) r0
            P.C r0 = r0.f12608t
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L139
            if (r1 == 0) goto L139
            P.W r0 = r14.f12633w
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            e3.o r2 = (e3.o) r2
            monitor-enter(r2)
            P.C r0 = r2.f12608t     // Catch: java.lang.Throwable -> L136
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L136
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L136
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L136
            if (r0 == 0) goto L122
            monitor-exit(r2)
            goto L139
        L122:
            P.f0 r0 = r2.f12607s     // Catch: java.lang.Throwable -> L136
            r0.setValue(r1)     // Catch: java.lang.Throwable -> L136
            M5.m r0 = r2.f12605q     // Catch: java.lang.Throwable -> L136
            r0.getClass()     // Catch: java.lang.Throwable -> L136
            M5.p r3 = new M5.p     // Catch: java.lang.Throwable -> L136
            r3.<init>(r8, r1)     // Catch: java.lang.Throwable -> L136
            r0.N(r3)     // Catch: java.lang.Throwable -> L136
            monitor-exit(r2)
            goto L139
        L136:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L136
            throw r0
        L139:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
