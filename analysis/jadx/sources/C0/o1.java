package C0;

import M5.AbstractC0263y;
import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import P.C0345b;
import P.C0379s0;
import P.C0383u0;
import P.C0385v0;
import android.view.View;
import androidx.lifecycle.InterfaceC0660x;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1076q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1077r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f1078s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0385v0 f1079t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0660x f1080u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p1 f1081v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ View f1082w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(kotlin.jvm.internal.y yVar, C0385v0 c0385v0, InterfaceC0660x interfaceC0660x, p1 p1Var, View view, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1078s = yVar;
        this.f1079t = c0385v0;
        this.f1080u = interfaceC0660x;
        this.f1081v = p1Var;
        this.f1082w = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        o1 o1Var = new o1(this.f1078s, this.f1079t, this.f1080u, this.f1081v, this.f1082w, interfaceC1524c);
        o1Var.f1077r = obj;
        return o1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o1) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0086 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x000a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:8:0x0017 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [M5.b0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [M5.b0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [M5.b0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? T3 = this.f1076q;
        p1 p1Var = this.f1081v;
        InterfaceC0660x interfaceC0660x = this.f1080u;
        C1386y c1386y = C1386y.f15098a;
        try {
            if (T3 == 0) {
                AbstractC1362a.e(obj);
                InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f1077r;
                try {
                    K0 k02 = (K0) this.f1078s.f14268q;
                    if (k02 != null) {
                        P5.P pA = s1.a(this.f1082w.getContext().getApplicationContext());
                        k02.f886q.f(((Number) pA.getValue()).floatValue());
                        T3 = AbstractC0263y.t(interfaceC0261w, null, null, new n1(pA, k02, null), 3);
                    } else {
                        T3 = 0;
                    }
                    C0385v0 c0385v0 = this.f1079t;
                    this.f1077r = T3;
                    this.f1076q = 1;
                    Object objB = AbstractC0263y.B(c0385v0.f5554a, new C0379s0(c0385v0, new C0383u0(c0385v0, null), C0345b.o(getContext()), null), this);
                    EnumC1580a enumC1580a = EnumC1580a.f16356q;
                    if (objB != enumC1580a) {
                        objB = c1386y;
                    }
                    if (objB != enumC1580a) {
                        objB = c1386y;
                    }
                    if (objB == enumC1580a) {
                        return enumC1580a;
                    }
                } catch (Throwable th) {
                    th = th;
                    T3 = 0;
                    if (T3 != 0) {
                        T3.a(null);
                    }
                    interfaceC0660x.getLifecycle().c(p1Var);
                    throw th;
                }
            } else {
                if (T3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                T3 = (InterfaceC0241b0) this.f1077r;
                AbstractC1362a.e(obj);
            }
            if (T3 != 0) {
                T3.a(null);
            }
            interfaceC0660x.getLifecycle().c(p1Var);
            return c1386y;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
