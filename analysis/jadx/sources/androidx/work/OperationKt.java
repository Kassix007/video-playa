package androidx.work;

import Q2.g;
import R4.h3;
import a.AbstractC0597a;
import androidx.concurrent.futures.k;
import androidx.concurrent.futures.l;
import androidx.lifecycle.J;
import androidx.work.Operation;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import m5.C1386y;
import q5.InterfaceC1524c;
import s5.e;

/* JADX INFO: loaded from: classes.dex */
public final class OperationKt {

    /* JADX INFO: renamed from: androidx.work.OperationKt$await$1, reason: invalid class name */
    @e(c = "androidx.work.OperationKt", f = "Operation.kt", l = {36}, m = "await")
    public static final class AnonymousClass1 extends s5.c {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AnonymousClass1(InterfaceC1524c<? super AnonymousClass1> interfaceC1524c) {
            super(interfaceC1524c);
        }

        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationKt.await(null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object await(androidx.work.Operation r4, q5.InterfaceC1524c<? super androidx.work.Operation.State.SUCCESS> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof androidx.work.OperationKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.OperationKt$await$1 r0 = new androidx.work.OperationKt$await$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            m5.AbstractC1362a.e(r5)
            goto L44
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            m5.AbstractC1362a.e(r5)
            I4.b r4 = r4.getResult()
            java.lang.String r5 = "result"
            kotlin.jvm.internal.m.d(r4, r5)
            r0.label = r2
            java.lang.Object r5 = a.AbstractC0597a.f(r4, r0)
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r5 != r4) goto L44
            return r4
        L44:
            java.lang.String r4 = "result.await()"
            kotlin.jvm.internal.m.d(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final Object await$$forInline(Operation operation, InterfaceC1524c<? super Operation.State.SUCCESS> interfaceC1524c) throws Throwable {
        I4.b result = operation.getResult();
        m.d(result, "result");
        Object objF = AbstractC0597a.f(result, interfaceC1524c);
        m.d(objF, "result.await()");
        return objF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Operation launchOperation(final Tracer tracer, final String label, final Executor executor, final B5.a block) {
        m.e(tracer, "tracer");
        m.e(label, "label");
        m.e(executor, "executor");
        m.e(block, "block");
        final J j = new J(Operation.IN_PROGRESS);
        return new OperationImpl(j, g.E(new l() { // from class: androidx.work.d
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.concurrent.futures.l
            public final Object b(k kVar) {
                return OperationKt.launchOperation$lambda$2(executor, tracer, label, block, j, kVar);
            }
        }));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C1386y launchOperation$lambda$2(Executor executor, Tracer tracer, String str, B5.a aVar, J j, k completer) {
        m.e(completer, "completer");
        executor.execute(new h3(tracer, str, aVar, j, completer));
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchOperation$lambda$2$lambda$1(Tracer tracer, String str, B5.a aVar, J j, k kVar) {
        boolean zIsEnabled = tracer.isEnabled();
        if (zIsEnabled) {
            try {
                tracer.beginSection(str);
            } finally {
                if (zIsEnabled) {
                    tracer.endSection();
                }
            }
        }
        try {
            aVar.invoke();
            Operation.State.SUCCESS success = Operation.SUCCESS;
            j.i(success);
            kVar.a(success);
        } catch (Throwable th) {
            j.i(new Operation.State.FAILURE(th));
            kVar.b(th);
        }
    }
}
