package I0;

import java.util.ArrayList;
import java.util.List;
import m5.C1386y;
import m5.InterfaceC1366e;

/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final o f2275A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final o f2276B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final o f2277C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final o f2278D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final o f2279E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final o f2280F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o f2281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o f2282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o f2283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final o f2284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o f2285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final o f2286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final o f2287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final o f2288y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final o f2289z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2290q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 2;
        f2281r = new o(i, 0);
        f2282s = new o(i, 1);
        f2283t = new o(i, 2);
        f2284u = new o(i, 3);
        f2285v = new o(i, 4);
        f2286w = new o(i, 5);
        f2287x = new o(i, 6);
        f2288y = new o(i, 7);
        f2289z = new o(i, 8);
        f2275A = new o(i, 9);
        f2276B = new o(i, 10);
        f2277C = new o(i, 11);
        f2278D = new o(i, 12);
        f2279E = new o(i, 13);
        f2280F = new o(i, 14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, int i7) {
        super(i);
        this.f2290q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        InterfaceC1366e interfaceC1366e;
        switch (this.f2290q) {
            case 0:
                return (d0.c) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListC0 = n5.l.C0(list);
                arrayListC0.addAll(list2);
                return arrayListC0;
            case 2:
                return (d0.k) obj;
            case 3:
                return (C1386y) obj;
            case 4:
                return (C1386y) obj;
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                return (C1386y) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 8:
                f fVar = (f) obj;
                int i = ((f) obj2).f2230a;
                return fVar;
            case 9:
                return (String) obj;
            case 10:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayListC02 = n5.l.C0(list3);
                arrayListC02.addAll(list4);
                return arrayListC02;
            case 11:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 12:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 13:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f2221a) == null) {
                    str = aVar2.f2221a;
                }
                if (aVar == null || (interfaceC1366e = aVar.f2222b) == null) {
                    interfaceC1366e = aVar2.f2222b;
                }
                return new a(str, interfaceC1366e);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
