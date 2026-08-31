package r5;

import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import q5.InterfaceC1524c;
import s5.g;

/* JADX INFO: renamed from: r5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1581b extends g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.e f16361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1524c f16362s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1581b(B5.e eVar, InterfaceC1524c interfaceC1524c, InterfaceC1524c interfaceC1524c2) {
        super(interfaceC1524c);
        this.f16361r = eVar;
        this.f16362s = interfaceC1524c2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f16360q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f16360q = 2;
            AbstractC1362a.e(obj);
            return obj;
        }
        this.f16360q = 1;
        AbstractC1362a.e(obj);
        B5.e eVar = this.f16361r;
        m.c(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        B.b(2, eVar);
        return eVar.invoke(this.f16362s, this);
    }
}
