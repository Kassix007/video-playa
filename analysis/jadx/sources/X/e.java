package X;

import E.C0138v;
import M.C0211h;
import P.C0371o;
import P.C0372o0;
import java.util.ArrayList;
import kotlin.jvm.internal.B;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f8136q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f8137r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f8138s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0372o0 f8139t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f8140u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(int i, boolean z5, Object obj) {
        this.f8136q = i;
        this.f8137r = z5;
        this.f8138s = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a(int i, C0371o c0371o) {
        c0371o.U(this.f8136q);
        e(c0371o);
        int iA = i | (c0371o.g(this) ? k.a(2, 0) : k.a(1, 0));
        Object obj = this.f8138s;
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        B.b(2, obj);
        Object objInvoke = ((B5.e) obj).invoke(c0371o, Integer.valueOf(iA));
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new c(2, this, e.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(int i, C0371o c0371o, Object obj) {
        c0371o.U(this.f8136q);
        e(c0371o);
        int iA = c0371o.g(this) ? k.a(2, 1) : k.a(1, 1);
        Object obj2 = this.f8138s;
        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        B.b(3, obj2);
        Object objInvoke = ((B5.f) obj2).invoke(obj, c0371o, Integer.valueOf(iA | i));
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0138v(i, 3, this, obj);
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c(Object obj, Object obj2, C0371o c0371o, int i) {
        c0371o.U(this.f8136q);
        e(c0371o);
        int iA = c0371o.g(this) ? k.a(2, 2) : k.a(1, 2);
        Object obj3 = this.f8138s;
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        B.b(4, obj3);
        Object objInvoke = ((B5.g) obj3).invoke(obj, obj2, c0371o, Integer.valueOf(iA | i));
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new d(this, obj, obj2, i, 0);
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, C0371o c0371o, int i) {
        c0371o.U(this.f8136q);
        e(c0371o);
        int iA = c0371o.g(this) ? k.a(2, 4) : k.a(1, 4);
        Object obj5 = this.f8138s;
        kotlin.jvm.internal.m.c(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        B.b(6, obj5);
        Object objInvoke = ((B5.h) obj5).invoke(obj, obj2, obj3, obj4, c0371o, Integer.valueOf(iA | i));
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0211h(this, obj, obj2, obj3, obj4, i);
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(C0371o c0371o) {
        C0372o0 c0372o0V;
        if (!this.f8137r || (c0372o0V = c0371o.v()) == null) {
            return;
        }
        c0372o0V.f5479a |= 1;
        if (k.e(this.f8139t, c0372o0V)) {
            this.f8139t = c0372o0V;
            return;
        }
        ArrayList arrayList = this.f8140u;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f8140u = arrayList2;
            arrayList2.add(c0372o0V);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (k.e((C0372o0) arrayList.get(i), c0372o0V)) {
                arrayList.set(i, c0372o0V);
                return;
            }
        }
        arrayList.add(c0372o0V);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (C0371o) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // B5.f
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b(((Number) obj3).intValue(), (C0371o) obj2, obj);
    }

    @Override // B5.g
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (C0371o) obj3, ((Number) obj4).intValue());
    }

    @Override // B5.h
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return d(obj, obj2, obj3, obj4, (C0371o) obj5, ((Number) obj6).intValue());
    }
}
