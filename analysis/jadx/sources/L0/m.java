package L0;

import C0.S;
import android.util.Log;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import i0.C1130b;
import j0.AbstractC1145B;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final m f3129A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final m f3130B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final m f3131C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final m f3132D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final m f3133E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final m f3134F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final m f3135G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final m f3136H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final m f3137I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final m f3138J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final m f3139K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final m f3140L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final m f3141M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final m f3142N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final m f3143O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final m f3144P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final m f3145Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final m f3146R;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m f3147r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m f3148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m f3149t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m f3150u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m f3151v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m f3152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final m f3153x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final m f3154y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final m f3155z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3156q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f3147r = new m(i, 0);
        f3148s = new m(i, 1);
        f3149t = new m(i, 2);
        f3150u = new m(i, 3);
        f3151v = new m(i, 4);
        f3152w = new m(i, 5);
        f3153x = new m(i, 6);
        f3154y = new m(i, 7);
        f3155z = new m(i, 8);
        f3129A = new m(i, 9);
        f3130B = new m(i, 10);
        f3131C = new m(i, 11);
        f3132D = new m(i, 12);
        f3133E = new m(i, 13);
        f3134F = new m(i, 14);
        f3135G = new m(i, 15);
        f3136H = new m(i, 16);
        f3137I = new m(i, 17);
        f3138J = new m(i, 18);
        f3139K = new m(i, 19);
        f3140L = new m(i, 20);
        f3141M = new m(i, 21);
        f3142N = new m(i, 22);
        f3143O = new m(i, 23);
        f3144P = new m(i, 24);
        f3145Q = new m(i, 25);
        f3146R = new m(i, 26);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, int i7) {
        super(i);
        this.f3156q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r11v3, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r12v9, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r3v60, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r3v69, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r4v39, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r4v42, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r5v21, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r6v45, types: [B5.c, kotlin.jvm.internal.n] */
    @Override // B5.c
    public final Object invoke(Object obj) {
        int i;
        int i7;
        int i8;
        int i9;
        long j;
        V0.t tVar;
        int i10 = 0;
        switch (this.f3156q) {
            case 0:
                n nVar = (n) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(nVar.f3158b);
                sb.append(", ");
                return S.o(sb, nVar.f3159c, ')');
            case 1:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(1);
                List list2 = (kotlin.jvm.internal.m.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((B5.c) w.f3206a.f8313s).invoke(obj2);
                Object obj3 = list.get(0);
                String str = obj3 != null ? (String) obj3 : null;
                kotlin.jvm.internal.m.b(str);
                return new C0192d(list2, str);
            case 2:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                while (i10 < size) {
                    Object obj4 = list3.get(i10);
                    C0191c c0191c = (kotlin.jvm.internal.m.a(obj4, Boolean.FALSE) || obj4 == null) ? null : (C0191c) ((B5.c) w.f3207b.f8313s).invoke(obj4);
                    kotlin.jvm.internal.m.b(c0191c);
                    arrayList.add(c0191c);
                    i10++;
                }
                return arrayList;
            case 3:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list4 = (List) obj;
                Object obj5 = list4.get(0);
                EnumC0194f enumC0194f = obj5 != null ? (EnumC0194f) obj5 : null;
                kotlin.jvm.internal.m.b(enumC0194f);
                Object obj6 = list4.get(2);
                Integer num = obj6 != null ? (Integer) obj6 : null;
                kotlin.jvm.internal.m.b(num);
                int iIntValue = num.intValue();
                Object obj7 = list4.get(3);
                Integer num2 = obj7 != null ? (Integer) obj7 : null;
                kotlin.jvm.internal.m.b(num2);
                int iIntValue2 = num2.intValue();
                Object obj8 = list4.get(4);
                String str2 = obj8 != null ? (String) obj8 : null;
                kotlin.jvm.internal.m.b(str2);
                switch (enumC0194f.ordinal()) {
                    case 0:
                        Object obj9 = list4.get(1);
                        q qVar = (kotlin.jvm.internal.m.a(obj9, Boolean.FALSE) || obj9 == null) ? null : (q) ((B5.c) w.f3211g.f8313s).invoke(obj9);
                        kotlin.jvm.internal.m.b(qVar);
                        return new C0191c(qVar, iIntValue, iIntValue2, str2);
                    case 1:
                        Object obj10 = list4.get(1);
                        y yVar = (kotlin.jvm.internal.m.a(obj10, Boolean.FALSE) || obj10 == null) ? null : (y) ((B5.c) w.f3212h.f8313s).invoke(obj10);
                        kotlin.jvm.internal.m.b(yVar);
                        return new C0191c(yVar, iIntValue, iIntValue2, str2);
                    case 2:
                        Object obj11 = list4.get(1);
                        H h4 = (kotlin.jvm.internal.m.a(obj11, Boolean.FALSE) || obj11 == null) ? null : (H) ((B5.c) w.f3208c.f8313s).invoke(obj11);
                        kotlin.jvm.internal.m.b(h4);
                        return new C0191c(h4, iIntValue, iIntValue2, str2);
                    case 3:
                        Object obj12 = list4.get(1);
                        G g7 = (kotlin.jvm.internal.m.a(obj12, Boolean.FALSE) || obj12 == null) ? null : (G) ((B5.c) w.f3209d.f8313s).invoke(obj12);
                        kotlin.jvm.internal.m.b(g7);
                        return new C0191c(g7, iIntValue, iIntValue2, str2);
                    case 4:
                        Object obj13 = list4.get(1);
                        i iVar = (kotlin.jvm.internal.m.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (i) ((B5.c) w.f3210e.f8313s).invoke(obj13);
                        kotlin.jvm.internal.m.b(iVar);
                        return new C0191c(iVar, iIntValue, iIntValue2, str2);
                    case 5:
                        Object obj14 = list4.get(1);
                        C0196h c0196h = (kotlin.jvm.internal.m.a(obj14, Boolean.FALSE) || obj14 == null) ? null : (C0196h) ((B5.c) w.f.f8313s).invoke(obj14);
                        kotlin.jvm.internal.m.b(c0196h);
                        return new C0191c(c0196h, iIntValue, iIntValue2, str2);
                    case 6:
                        Object obj15 = list4.get(1);
                        String str3 = obj15 != null ? (String) obj15 : null;
                        kotlin.jvm.internal.m.b(str3);
                        return new C0191c(new A(str3), iIntValue, iIntValue2, str2);
                    default:
                        throw new C2.e();
                }
            case 4:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new V0.a(((Float) obj).floatValue());
            case 5:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list5 = (List) obj;
                Object obj16 = list5.get(0);
                String str4 = obj16 != null ? (String) obj16 : null;
                kotlin.jvm.internal.m.b(str4);
                Object obj17 = list5.get(1);
                return new C0196h(str4, (kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (D) ((B5.c) w.i.f8313s).invoke(obj17));
            case 6:
                if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                    return new j0.o(j0.o.f13722g);
                }
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new j0.o(AbstractC1145B.b(((Integer) obj).intValue()));
            case 7:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new O0.j(((Integer) obj).intValue());
            case 8:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj18 = list6.get(0);
                V0.f fVar = obj18 != null ? (V0.f) obj18 : null;
                kotlin.jvm.internal.m.b(fVar);
                float f = fVar.f7928a;
                Object obj19 = list6.get(1);
                V0.h hVar = obj19 != null ? (V0.h) obj19 : null;
                kotlin.jvm.internal.m.b(hVar);
                int i11 = hVar.f7929a;
                Object obj20 = list6.get(2);
                kotlin.jvm.internal.m.b(obj20 != null ? (V0.g) obj20 : null);
                return new V0.i(i11, f);
            case 9:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list7 = (List) obj;
                Object obj21 = list7.get(0);
                String str5 = obj21 != null ? (String) obj21 : null;
                kotlin.jvm.internal.m.b(str5);
                Object obj22 = list7.get(1);
                return new i(str5, (kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (D) ((B5.c) w.i.f8313s).invoke(obj22));
            case 10:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list8.size());
                int size2 = list8.size();
                while (i10 < size2) {
                    Object obj23 = list8.get(i10);
                    R0.a aVar = (kotlin.jvm.internal.m.a(obj23, Boolean.FALSE) || obj23 == null) ? null : (R0.a) ((B5.c) w.f3222t.f8313s).invoke(obj23);
                    kotlin.jvm.internal.m.b(aVar);
                    arrayList2.add(aVar);
                    i10++;
                }
                return new R0.b(arrayList2);
            case 11:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj;
                R0.c.f6694a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str6);
                if (kotlin.jvm.internal.m.a(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str6 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new R0.a(localeForLanguageTag);
            case 12:
                if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                    return new C1130b(9205357640488583168L);
                }
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj24 = list9.get(0);
                Float f7 = obj24 != null ? (Float) obj24 : null;
                kotlin.jvm.internal.m.b(f7);
                float fFloatValue = f7.floatValue();
                Object obj25 = list9.get(1);
                Float f8 = obj25 != null ? (Float) obj25 : null;
                kotlin.jvm.internal.m.b(f8);
                return new C1130b((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f8.floatValue())) & 4294967295L));
            case 13:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj26 = list10.get(0);
                V0.k kVar = obj26 != null ? (V0.k) obj26 : null;
                kotlin.jvm.internal.m.b(kVar);
                int i12 = kVar.f7936a;
                Object obj27 = list10.get(1);
                V0.m mVar = obj27 != null ? (V0.m) obj27 : null;
                kotlin.jvm.internal.m.b(mVar);
                int i13 = mVar.f7940a;
                Object obj28 = list10.get(2);
                W0.o[] oVarArr = W0.n.f8026b;
                v vVar = w.f3219q;
                Boolean bool = Boolean.FALSE;
                W0.n nVar2 = ((kotlin.jvm.internal.m.a(obj28, bool) && vVar == null) || obj28 == null) ? null : (W0.n) vVar.f3205r.invoke(obj28);
                kotlin.jvm.internal.m.b(nVar2);
                long j7 = nVar2.f8028a;
                Object obj29 = list10.get(3);
                V0.r rVar = V0.r.f7947c;
                V0.r rVar2 = (kotlin.jvm.internal.m.a(obj29, bool) || obj29 == null) ? null : (V0.r) ((B5.c) w.f3214l.f8313s).invoke(obj29);
                Object obj30 = list10.get(4);
                s sVar = (kotlin.jvm.internal.m.a(obj30, bool) || obj30 == null) ? null : (s) ((B5.c) x.f3224a.f8313s).invoke(obj30);
                Object obj31 = list10.get(5);
                V0.i iVar2 = V0.i.f7930c;
                V0.i iVar3 = (kotlin.jvm.internal.m.a(obj31, bool) || obj31 == null) ? null : (V0.i) ((B5.c) w.f3223u.f8313s).invoke(obj31);
                Object obj32 = list10.get(6);
                V0.e eVar = (kotlin.jvm.internal.m.a(obj32, bool) || obj32 == null) ? null : (V0.e) ((B5.c) x.f3225b.f8313s).invoke(obj32);
                kotlin.jvm.internal.m.b(eVar);
                int i14 = eVar.f7924a;
                Object obj33 = list10.get(7);
                V0.d dVar = obj33 != null ? (V0.d) obj33 : null;
                kotlin.jvm.internal.m.b(dVar);
                int i15 = dVar.f7922a;
                Object obj34 = list10.get(8);
                Z.m mVar2 = x.f3226c;
                if (kotlin.jvm.internal.m.a(obj34, bool) || obj34 == null) {
                    i = i12;
                    i7 = i15;
                    i8 = i14;
                    i9 = i13;
                    j = j7;
                    tVar = null;
                } else {
                    i = i12;
                    i7 = i15;
                    i8 = i14;
                    i9 = i13;
                    j = j7;
                    tVar = (V0.t) ((B5.c) mVar2.f8313s).invoke(obj34);
                }
                return new q(i, i9, j, rVar2, sVar, iVar3, i8, i7, tVar);
            case 14:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                Object obj35 = list11.get(0);
                int i16 = j0.o.f13723h;
                v vVar2 = w.f3218p;
                Boolean bool2 = Boolean.FALSE;
                j0.o oVar = ((kotlin.jvm.internal.m.a(obj35, bool2) && vVar2 == null) || obj35 == null) ? null : (j0.o) vVar2.f3205r.invoke(obj35);
                kotlin.jvm.internal.m.b(oVar);
                long j8 = oVar.f13724a;
                Object obj36 = list11.get(1);
                v vVar3 = w.f3220r;
                C1130b c1130b = ((kotlin.jvm.internal.m.a(obj36, bool2) && vVar3 == null) || obj36 == null) ? null : (C1130b) vVar3.f3205r.invoke(obj36);
                kotlin.jvm.internal.m.b(c1130b);
                long j9 = c1130b.f13520a;
                Object obj37 = list11.get(2);
                Float f9 = obj37 != null ? (Float) obj37 : null;
                kotlin.jvm.internal.m.b(f9);
                return new j0.D(f9.floatValue(), j8, j9);
            case 15:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list12 = (List) obj;
                Object obj38 = list12.get(0);
                int i17 = j0.o.f13723h;
                v vVar4 = w.f3218p;
                Boolean bool3 = Boolean.FALSE;
                j0.o oVar2 = ((kotlin.jvm.internal.m.a(obj38, bool3) && vVar4 == null) || obj38 == null) ? null : (j0.o) vVar4.f3205r.invoke(obj38);
                kotlin.jvm.internal.m.b(oVar2);
                long j10 = oVar2.f13724a;
                Object obj39 = list12.get(1);
                W0.o[] oVarArr2 = W0.n.f8026b;
                v vVar5 = w.f3219q;
                W0.n nVar3 = ((kotlin.jvm.internal.m.a(obj39, bool3) && vVar5 == null) || obj39 == null) ? null : (W0.n) vVar5.f3205r.invoke(obj39);
                kotlin.jvm.internal.m.b(nVar3);
                long j11 = nVar3.f8028a;
                Object obj40 = list12.get(2);
                O0.j jVar = O0.j.f4280r;
                O0.j jVar2 = (kotlin.jvm.internal.m.a(obj40, bool3) || obj40 == null) ? null : (O0.j) ((B5.c) w.f3215m.f8313s).invoke(obj40);
                Object obj41 = list12.get(3);
                O0.h hVar2 = obj41 != null ? (O0.h) obj41 : null;
                Object obj42 = list12.get(4);
                O0.i iVar4 = obj42 != null ? (O0.i) obj42 : null;
                Object obj43 = list12.get(6);
                String str7 = obj43 != null ? (String) obj43 : null;
                Object obj44 = list12.get(7);
                W0.n nVar4 = ((kotlin.jvm.internal.m.a(obj44, bool3) && vVar5 == null) || obj44 == null) ? null : (W0.n) vVar5.f3205r.invoke(obj44);
                kotlin.jvm.internal.m.b(nVar4);
                long j12 = nVar4.f8028a;
                Object obj45 = list12.get(8);
                V0.a aVar2 = (kotlin.jvm.internal.m.a(obj45, bool3) || obj45 == null) ? null : (V0.a) ((B5.c) w.f3216n.f8313s).invoke(obj45);
                Object obj46 = list12.get(9);
                V0.q qVar2 = (kotlin.jvm.internal.m.a(obj46, bool3) || obj46 == null) ? null : (V0.q) ((B5.c) w.f3213k.f8313s).invoke(obj46);
                Object obj47 = list12.get(10);
                R0.b bVar = R0.b.f6691s;
                R0.b bVar2 = (kotlin.jvm.internal.m.a(obj47, bool3) || obj47 == null) ? null : (R0.b) ((B5.c) w.f3221s.f8313s).invoke(obj47);
                Object obj48 = list12.get(11);
                j0.o oVar3 = ((kotlin.jvm.internal.m.a(obj48, bool3) && vVar4 == null) || obj48 == null) ? null : (j0.o) vVar4.f3205r.invoke(obj48);
                kotlin.jvm.internal.m.b(oVar3);
                long j13 = oVar3.f13724a;
                Object obj49 = list12.get(12);
                V0.l lVar = (kotlin.jvm.internal.m.a(obj49, bool3) || obj49 == null) ? null : (V0.l) ((B5.c) w.j.f8313s).invoke(obj49);
                Object obj50 = list12.get(13);
                j0.D d5 = j0.D.f13677d;
                return new y(j10, j11, jVar2, hVar2, iVar4, (O0.p) null, str7, j12, aVar2, qVar2, bVar2, j13, lVar, (kotlin.jvm.internal.m.a(obj50, bool3) || obj50 == null) ? null : (j0.D) ((B5.c) w.f3217o.f8313s).invoke(obj50), 49184);
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new V0.l(((Integer) obj).intValue());
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list13 = (List) obj;
                return new V0.q(((Number) list13.get(0)).floatValue(), ((Number) list13.get(1)).floatValue());
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj51 = list14.get(0);
                W0.o[] oVarArr3 = W0.n.f8026b;
                v vVar6 = w.f3219q;
                Boolean bool4 = Boolean.FALSE;
                W0.n nVar5 = ((kotlin.jvm.internal.m.a(obj51, bool4) && vVar6 == null) || obj51 == null) ? null : (W0.n) vVar6.f3205r.invoke(obj51);
                kotlin.jvm.internal.m.b(nVar5);
                long j14 = nVar5.f8028a;
                Object obj52 = list14.get(1);
                W0.n nVar6 = ((kotlin.jvm.internal.m.a(obj52, bool4) && vVar6 == null) || obj52 == null) ? null : (W0.n) vVar6.f3205r.invoke(obj52);
                kotlin.jvm.internal.m.b(nVar6);
                return new V0.r(j14, nVar6.f8028a);
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list15 = (List) obj;
                Object obj53 = list15.get(0);
                Z.m mVar3 = w.f3212h;
                Boolean bool5 = Boolean.FALSE;
                y yVar2 = (kotlin.jvm.internal.m.a(obj53, bool5) || obj53 == null) ? null : (y) ((B5.c) mVar3.f8313s).invoke(obj53);
                Object obj54 = list15.get(1);
                y yVar3 = (kotlin.jvm.internal.m.a(obj54, bool5) || obj54 == null) ? null : (y) ((B5.c) mVar3.f8313s).invoke(obj54);
                Object obj55 = list15.get(2);
                y yVar4 = (kotlin.jvm.internal.m.a(obj55, bool5) || obj55 == null) ? null : (y) ((B5.c) mVar3.f8313s).invoke(obj55);
                Object obj56 = list15.get(3);
                return new D(yVar2, yVar3, yVar4, (kotlin.jvm.internal.m.a(obj56, bool5) || obj56 == null) ? null : (y) ((B5.c) mVar3.f8313s).invoke(obj56));
            case 20:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list16 = (List) obj;
                Object obj57 = list16.get(0);
                Integer num3 = obj57 != null ? (Integer) obj57 : null;
                kotlin.jvm.internal.m.b(num3);
                int iIntValue3 = num3.intValue();
                Object obj58 = list16.get(1);
                Integer num4 = obj58 != null ? (Integer) obj58 : null;
                kotlin.jvm.internal.m.b(num4);
                return new E(D5.a.i(iIntValue3, num4.intValue()));
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                    return new W0.n(W0.n.f8027c);
                }
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list17 = (List) obj;
                Object obj59 = list17.get(0);
                Float f10 = obj59 != null ? (Float) obj59 : null;
                kotlin.jvm.internal.m.b(f10);
                float fFloatValue2 = f10.floatValue();
                Object obj60 = list17.get(1);
                W0.o oVar4 = obj60 != null ? (W0.o) obj60 : null;
                kotlin.jvm.internal.m.b(oVar4);
                return new W0.n(AbstractC0836n2.E(oVar4.f8029a, fFloatValue2));
            case 22:
                String str8 = obj != null ? (String) obj : null;
                kotlin.jvm.internal.m.b(str8);
                return new G(str8);
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                String str9 = obj != null ? (String) obj : null;
                kotlin.jvm.internal.m.b(str9);
                return new H(str9);
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new V0.e(((Integer) obj).intValue());
            case 25:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj61 = list18.get(0);
                Boolean bool6 = obj61 != null ? (Boolean) obj61 : null;
                kotlin.jvm.internal.m.b(bool6);
                boolean zBooleanValue = bool6.booleanValue();
                Object obj62 = list18.get(1);
                kotlin.jvm.internal.m.b(obj62 != null ? (C0195g) obj62 : null);
                return new s(zBooleanValue);
            default:
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list19 = (List) obj;
                Object obj63 = list19.get(0);
                V0.s sVar2 = obj63 != null ? (V0.s) obj63 : null;
                kotlin.jvm.internal.m.b(sVar2);
                int i18 = sVar2.f7950a;
                Object obj64 = list19.get(1);
                Boolean bool7 = obj64 != null ? (Boolean) obj64 : null;
                kotlin.jvm.internal.m.b(bool7);
                return new V0.t(i18, bool7.booleanValue());
        }
    }
}
