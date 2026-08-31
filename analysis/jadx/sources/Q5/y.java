package Q5;

import M5.AbstractC0263y;
import M5.C0256q;
import P5.InterfaceC0398i;
import m5.AbstractC1374m;
import m5.C1386y;
import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class y extends s5.c implements InterfaceC0398i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0398i f6663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC1529h f6664r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC1529h f6666t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC1524c f6667u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(InterfaceC0398i interfaceC0398i, InterfaceC1529h interfaceC1529h) {
        super(w.f6661q, C1530i.f16022q);
        this.f6663q = interfaceC0398i;
        this.f6664r = interfaceC1529h;
        this.f6665s = ((Number) interfaceC1529h.fold(0, new C0256q(3, (byte) 0))).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a(InterfaceC1524c interfaceC1524c, Object obj) {
        InterfaceC1529h context = interfaceC1524c.getContext();
        AbstractC0263y.i(context);
        InterfaceC1529h interfaceC1529h = this.f6666t;
        if (interfaceC1529h != context) {
            if (interfaceC1529h instanceof u) {
                throw new IllegalStateException(J5.n.x0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((u) interfaceC1529h).f6660r + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new J5.u(2, this))).intValue() != this.f6665s) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f6664r + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f6666t = context;
        }
        this.f6667u = interfaceC1524c;
        B5.f fVar = A.f6591a;
        InterfaceC0398i interfaceC0398i = this.f6663q;
        kotlin.jvm.internal.m.c(interfaceC0398i, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = fVar.invoke(interfaceC0398i, obj, this);
        if (!kotlin.jvm.internal.m.a(objInvoke, EnumC1580a.f16356q)) {
            this.f6667u = null;
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.InterfaceC0398i
    public final Object emit(Object obj, InterfaceC1524c interfaceC1524c) {
        try {
            Object objA = a(interfaceC1524c, obj);
            return objA == EnumC1580a.f16356q ? objA : C1386y.f15098a;
        } catch (Throwable th) {
            this.f6666t = new u(th, interfaceC1524c.getContext());
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a, s5.d
    public final s5.d getCallerFrame() {
        InterfaceC1524c interfaceC1524c = this.f6667u;
        if (interfaceC1524c instanceof s5.d) {
            return (s5.d) interfaceC1524c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.c, q5.InterfaceC1524c
    public final InterfaceC1529h getContext() {
        InterfaceC1529h interfaceC1529h = this.f6666t;
        return interfaceC1529h == null ? C1530i.f16022q : interfaceC1529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = AbstractC1374m.a(obj);
        if (thA != null) {
            this.f6666t = new u(thA, getContext());
        }
        InterfaceC1524c interfaceC1524c = this.f6667u;
        if (interfaceC1524c != null) {
            interfaceC1524c.resumeWith(obj);
        }
        return EnumC1580a.f16356q;
    }
}
