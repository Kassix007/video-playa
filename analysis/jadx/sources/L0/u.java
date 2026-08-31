package L0;

import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import i0.C1130b;
import j0.AbstractC1145B;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final u f3177A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final u f3178B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final u f3179C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final u f3180D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final u f3181E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final u f3182F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final u f3183G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final u f3184H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final u f3185I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final u f3186J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final u f3187K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final u f3188L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final u f3189M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final u f3190N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final u f3191O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final u f3192P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final u f3193Q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f3194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f3195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u f3196t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final u f3197u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f3198v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u f3199w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final u f3200x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final u f3201y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final u f3202z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3203q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 2;
        f3194r = new u(i, 0);
        f3195s = new u(i, 1);
        f3196t = new u(i, 2);
        f3197u = new u(i, 3);
        f3198v = new u(i, 4);
        f3199w = new u(i, 5);
        f3200x = new u(i, 6);
        f3201y = new u(i, 7);
        f3202z = new u(i, 8);
        f3177A = new u(i, 9);
        f3178B = new u(i, 10);
        f3179C = new u(i, 11);
        f3180D = new u(i, 12);
        f3181E = new u(i, 13);
        f3182F = new u(i, 14);
        f3183G = new u(i, 15);
        f3184H = new u(i, 16);
        f3185I = new u(i, 17);
        f3186J = new u(i, 18);
        f3187K = new u(i, 19);
        f3188L = new u(i, 20);
        f3189M = new u(i, 21);
        f3190N = new u(i, 22);
        f3191O = new u(i, 23);
        f3192P = new u(i, 24);
        f3193Q = new u(i, 25);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, int i7) {
        super(i);
        this.f3203q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        EnumC0194f enumC0194f;
        Object objA;
        int i = 0;
        switch (this.f3203q) {
            case 0:
                C0192d c0192d = (C0192d) obj2;
                String str = c0192d.f3106r;
                Z.m mVar = w.f3206a;
                return AbstractC0836n2.d(str, w.a(c0192d.f3105q, w.f3206a, (Z.b) obj));
            case 1:
                Z.b bVar = (Z.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i < size) {
                    arrayList.add(w.a((C0191c) list.get(i), w.f3207b, bVar));
                    i++;
                }
                return arrayList;
            case 2:
                Z.b bVar2 = (Z.b) obj;
                C0191c c0191c = (C0191c) obj2;
                Object obj3 = c0191c.f3101a;
                if (obj3 instanceof q) {
                    enumC0194f = EnumC0194f.f3110q;
                } else if (obj3 instanceof y) {
                    enumC0194f = EnumC0194f.f3111r;
                } else if (obj3 instanceof H) {
                    enumC0194f = EnumC0194f.f3112s;
                } else if (obj3 instanceof G) {
                    enumC0194f = EnumC0194f.f3113t;
                } else if (obj3 instanceof i) {
                    enumC0194f = EnumC0194f.f3114u;
                } else if (obj3 instanceof C0196h) {
                    enumC0194f = EnumC0194f.f3115v;
                } else {
                    if (!(obj3 instanceof A)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC0194f = EnumC0194f.f3116w;
                }
                switch (enumC0194f.ordinal()) {
                    case 0:
                        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objA = w.a((q) obj3, w.f3211g, bVar2);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objA = w.a((y) obj3, w.f3212h, bVar2);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objA = w.a((H) obj3, w.f3208c, bVar2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objA = w.a((G) obj3, w.f3209d, bVar2);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objA = w.a((i) obj3, w.f3210e, bVar2);
                        break;
                    case 5:
                        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objA = w.a((C0196h) obj3, w.f, bVar2);
                        break;
                    case 6:
                        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objA = ((A) obj3).f3070a;
                        Z.m mVar2 = w.f3206a;
                        break;
                    default:
                        throw new C2.e();
                }
                return AbstractC0836n2.d(enumC0194f, objA, Integer.valueOf(c0191c.f3102b), Integer.valueOf(c0191c.f3103c), c0191c.f3104d);
            case 3:
                return Float.valueOf(((V0.a) obj2).f7918a);
            case 4:
                C0196h c0196h = (C0196h) obj2;
                String str2 = c0196h.f3118a;
                Z.m mVar3 = w.f3206a;
                return AbstractC0836n2.d(str2, w.a(c0196h.f3119b, w.i, (Z.b) obj));
            case 5:
                long j = ((j0.o) obj2).f13724a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(AbstractC1145B.v(j));
            case 6:
                return Integer.valueOf(((O0.j) obj2).f4284q);
            case 7:
                V0.i iVar = (V0.i) obj2;
                V0.f fVar = new V0.f(iVar.f7931a);
                Z.m mVar4 = w.f3206a;
                return AbstractC0836n2.d(fVar, new V0.h(iVar.f7932b), new V0.g());
            case 8:
                i iVar2 = (i) obj2;
                String str3 = iVar2.f3120a;
                Z.m mVar5 = w.f3206a;
                return AbstractC0836n2.d(str3, w.a(iVar2.f3121b, w.i, (Z.b) obj));
            case 9:
                Z.b bVar3 = (Z.b) obj;
                List list2 = ((R0.b) obj2).f6692q;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i < size2) {
                    arrayList2.add(w.a((R0.a) list2.get(i), w.f3222t, bVar3));
                    i++;
                }
                return arrayList2;
            case 10:
                return ((R0.a) obj2).f6690a.toLanguageTag();
            case 11:
                long j7 = ((C1130b) obj2).f13520a;
                if (C1130b.b(j7, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float fValueOf = Float.valueOf(Float.intBitsToFloat((int) (j7 >> 32)));
                Z.m mVar6 = w.f3206a;
                return AbstractC0836n2.d(fValueOf, Float.valueOf(Float.intBitsToFloat((int) (j7 & 4294967295L))));
            case 12:
                Z.b bVar4 = (Z.b) obj;
                q qVar = (q) obj2;
                V0.k kVar = new V0.k(qVar.f3166a);
                Z.m mVar7 = w.f3206a;
                V0.m mVar8 = new V0.m(qVar.f3167b);
                Object objA2 = w.a(new W0.n(qVar.f3168c), w.f3219q, bVar4);
                V0.r rVar = qVar.f3169d;
                V0.r rVar2 = V0.r.f7947c;
                Object objA3 = w.a(rVar, w.f3214l, bVar4);
                Object objA4 = w.a(qVar.f3170e, x.f3224a, bVar4);
                V0.i iVar3 = qVar.f;
                V0.i iVar4 = V0.i.f7930c;
                return AbstractC0836n2.d(kVar, mVar8, objA2, objA3, objA4, w.a(iVar3, w.f3223u, bVar4), w.a(new V0.e(qVar.f3171g), x.f3225b, bVar4), new V0.d(qVar.f3172h), w.a(qVar.i, x.f3226c, bVar4));
            case 13:
                Z.b bVar5 = (Z.b) obj;
                j0.D d5 = (j0.D) obj2;
                return AbstractC0836n2.d(w.a(new j0.o(d5.f13678a), w.f3218p, bVar5), w.a(new C1130b(d5.f13679b), w.f3220r, bVar5), Float.valueOf(d5.f13680c));
            case 14:
                Z.b bVar6 = (Z.b) obj;
                y yVar = (y) obj2;
                j0.o oVar = new j0.o(yVar.f3227a.a());
                v vVar = w.f3218p;
                Object objA5 = w.a(oVar, vVar, bVar6);
                W0.n nVar = new W0.n(yVar.f3228b);
                v vVar2 = w.f3219q;
                Object objA6 = w.a(nVar, vVar2, bVar6);
                O0.j jVar = yVar.f3229c;
                O0.j jVar2 = O0.j.f4280r;
                Object objA7 = w.a(jVar, w.f3215m, bVar6);
                O0.h hVar = yVar.f3230d;
                O0.i iVar5 = yVar.f3231e;
                String str4 = yVar.f3232g;
                Object objA8 = w.a(new W0.n(yVar.f3233h), vVar2, bVar6);
                Object objA9 = w.a(yVar.i, w.f3216n, bVar6);
                Object objA10 = w.a(yVar.j, w.f3213k, bVar6);
                R0.b bVar7 = yVar.f3234k;
                R0.b bVar8 = R0.b.f6691s;
                Object objA11 = w.a(bVar7, w.f3221s, bVar6);
                Object objA12 = w.a(new j0.o(yVar.f3235l), vVar, bVar6);
                Object objA13 = w.a(yVar.f3236m, w.j, bVar6);
                j0.D d7 = yVar.f3237n;
                j0.D d8 = j0.D.f13677d;
                return AbstractC0836n2.d(objA5, objA6, objA7, hVar, iVar5, -1, str4, objA8, objA9, objA10, objA11, objA12, objA13, w.a(d7, w.f3217o, bVar6));
            case 15:
                return Integer.valueOf(((V0.l) obj2).f7939a);
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                V0.q qVar2 = (V0.q) obj2;
                return AbstractC0836n2.d(Float.valueOf(qVar2.f7945a), Float.valueOf(qVar2.f7946b));
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                Z.b bVar9 = (Z.b) obj;
                V0.r rVar3 = (V0.r) obj2;
                W0.n nVar2 = new W0.n(rVar3.f7948a);
                v vVar3 = w.f3219q;
                return AbstractC0836n2.d(w.a(nVar2, vVar3, bVar9), w.a(new W0.n(rVar3.f7949b), vVar3, bVar9));
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                Z.b bVar10 = (Z.b) obj;
                D d9 = (D) obj2;
                y yVar2 = d9.f3083a;
                Z.m mVar9 = w.f3212h;
                return AbstractC0836n2.d(w.a(yVar2, mVar9, bVar10), w.a(d9.f3084b, mVar9, bVar10), w.a(d9.f3085c, mVar9, bVar10), w.a(d9.f3086d, mVar9, bVar10));
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                long j8 = ((E) obj2).f3089a;
                int i7 = E.f3088c;
                Integer numValueOf = Integer.valueOf((int) (j8 >> 32));
                Z.m mVar10 = w.f3206a;
                return AbstractC0836n2.d(numValueOf, Integer.valueOf((int) (j8 & 4294967295L)));
            case 20:
                long j9 = ((W0.n) obj2).f8028a;
                if (W0.n.a(j9, W0.n.f8027c)) {
                    return Boolean.FALSE;
                }
                Float fValueOf2 = Float.valueOf(W0.n.c(j9));
                Z.m mVar11 = w.f3206a;
                return AbstractC0836n2.d(fValueOf2, new W0.o(W0.n.b(j9)));
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                String str5 = ((G) obj2).f3094a;
                Z.m mVar12 = w.f3206a;
                return str5;
            case 22:
                String str6 = ((H) obj2).f3095a;
                Z.m mVar13 = w.f3206a;
                return str6;
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                return Integer.valueOf(((V0.e) obj2).f7924a);
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                Boolean boolValueOf = Boolean.valueOf(((s) obj2).f3175a);
                Z.m mVar14 = w.f3206a;
                return AbstractC0836n2.d(boolValueOf, new C0195g());
            default:
                V0.t tVar = (V0.t) obj2;
                V0.s sVar = new V0.s(tVar.f7953a);
                Z.m mVar15 = w.f3206a;
                return AbstractC0836n2.d(sVar, Boolean.valueOf(tVar.f7954b));
        }
    }
}
