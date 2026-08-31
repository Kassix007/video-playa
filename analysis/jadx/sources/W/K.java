package w;

import m5.C1386y;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class K extends s5.h implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1529h f17813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s5.h f17814u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.e */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(InterfaceC1529h interfaceC1529h, B5.e eVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17813t = interfaceC1529h;
        this.f17814u = (s5.h) eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [B5.e, s5.h] */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        K k7 = new K(this.f17813t, this.f17814u, interfaceC1524c);
        k7.f17812s = obj;
        return k7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((v0.y) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:13:0x002c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x000b */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r10 != r6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        if (r10 == r6) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, v0.y] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, v0.y] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [B5.e, s5.h] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:12:0x002a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006e -> B:12:0x002a). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f17811r
            v0.g r1 = v0.EnumC1738g.f17456s
            q5.h r2 = r9.f17813t
            r3 = 3
            r4 = 2
            r5 = 1
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L36
            if (r0 == r5) goto L2e
            if (r0 == r4) goto L23
            if (r0 != r3) goto L1b
            java.lang.Object r0 = r9.f17812s
            v0.y r0 = (v0.y) r0
            m5.AbstractC1362a.e(r10)
            goto L2a
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r0 = r9.f17812s
            v0.y r0 = (v0.y) r0
            m5.AbstractC1362a.e(r10)     // Catch: java.util.concurrent.CancellationException -> L2c
        L2a:
            r10 = r0
            goto L3d
        L2c:
            r10 = move-exception
            goto L60
        L2e:
            java.lang.Object r0 = r9.f17812s
            v0.y r0 = (v0.y) r0
            m5.AbstractC1362a.e(r10)     // Catch: java.util.concurrent.CancellationException -> L2c
            goto L51
        L36:
            m5.AbstractC1362a.e(r10)
            java.lang.Object r10 = r9.f17812s
            v0.y r10 = (v0.y) r10
        L3d:
            boolean r0 = M5.AbstractC0263y.s(r2)
            if (r0 == 0) goto L72
            s5.h r0 = r9.f17814u     // Catch: java.util.concurrent.CancellationException -> L5c
            r9.f17812s = r10     // Catch: java.util.concurrent.CancellationException -> L5c
            r9.f17811r = r5     // Catch: java.util.concurrent.CancellationException -> L5c
            java.lang.Object r0 = r0.invoke(r10, r9)     // Catch: java.util.concurrent.CancellationException -> L5c
            if (r0 != r6) goto L50
            goto L70
        L50:
            r0 = r10
        L51:
            r9.f17812s = r0     // Catch: java.util.concurrent.CancellationException -> L2c
            r9.f17811r = r4     // Catch: java.util.concurrent.CancellationException -> L2c
            java.lang.Object r10 = w.AbstractC1802p0.b(r0, r1, r9)     // Catch: java.util.concurrent.CancellationException -> L2c
            if (r10 != r6) goto L2a
            goto L70
        L5c:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L60:
            boolean r7 = M5.AbstractC0263y.s(r2)
            if (r7 == 0) goto L71
            r9.f17812s = r0
            r9.f17811r = r3
            java.lang.Object r10 = w.AbstractC1802p0.b(r0, r1, r9)
            if (r10 != r6) goto L2a
        L70:
            return r6
        L71:
            throw r10
        L72:
            m5.y r10 = m5.C1386y.f15098a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w.K.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
