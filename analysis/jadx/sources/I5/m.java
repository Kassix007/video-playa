package I5;

import C0.S;
import D.u;
import M5.AbstractC0257s;
import P.F;
import T1.r;
import U1.C0530a;
import U4.f0;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.X;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import java.util.Map;
import m5.C1386y;
import n5.AbstractC1397A;
import q5.InterfaceC1527f;
import t.C1613l;
import t.z;
import u.AbstractC1644d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2441q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [M5.s.<clinit>():void, N5.d.invoke(java.lang.Object):java.lang.Object, R4.b2.invoke():java.lang.Object, R4.k1.<init>(com.web2native.MainActivity, com.web2native.MainActivity):void, T1.u.<init>(android.content.Context):void, T1.z.d(java.util.List, T1.w):void, W1.j.k(T1.p, android.os.Bundle, T1.w):void, W1.j.l(int, boolean, boolean):boolean, b.j.d(java.lang.String):void, com.google.android.gms.internal.measurement.K1.b(Z.c, X.e, P.o, int):void, l6.d.f(T1.u, T1.r, c0.m, c0.e, B5.c, B5.c, B5.c, B5.c, P.o, int):void, l6.d.g(T1.u, java.lang.String, c0.m, c0.e, B5.c, B5.c, B5.c, B5.c, B5.c, P.o, int):void, n5.A.u(T1.p):I5.i] */
    public /* synthetic */ m(int i) {
        this.f2441q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object it) {
        int i = this.f2441q;
        C1386y c1386y = C1386y.f15098a;
        z = false;
        boolean z5 = false;
        switch (i) {
            case 0:
                kotlin.jvm.internal.m.e(it, "it");
                return Integer.valueOf(E5.c.f1751a.a(2147418112) + 65536);
            case 1:
                return Boolean.valueOf(it == null);
            case 2:
                return Boolean.valueOf(((Character) it).charValue() == '-');
            case 3:
                return Boolean.valueOf(((Character) it).charValue() == '-');
            case 4:
                char cCharValue = ((Character) it).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 5:
                return Boolean.valueOf(((Character) it).charValue() == ':');
            case 6:
                return Boolean.valueOf(((Character) it).charValue() == ':');
            case 7:
                char cCharValue2 = ((Character) it).charValue();
                if ('0' <= cCharValue2 && cCharValue2 < ':') {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 8:
                InterfaceC1527f interfaceC1527f = (InterfaceC1527f) it;
                if (interfaceC1527f instanceof AbstractC0257s) {
                    return (AbstractC0257s) interfaceC1527f;
                }
                return null;
            case 9:
                a6.h Json = (a6.h) it;
                kotlin.jvm.internal.m.e(Json, "$this$Json");
                Json.f9029b = true;
                return c1386y;
            case 10:
                a6.h Json2 = (a6.h) it;
                kotlin.jvm.internal.m.e(Json2, "$this$Json");
                Json2.f9029b = true;
                return c1386y;
            case 11:
                Context it2 = (Context) it;
                kotlin.jvm.internal.m.e(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 12:
                Context it3 = (Context) it;
                kotlin.jvm.internal.m.e(it3, "it");
                if (it3 instanceof ContextWrapper) {
                    return ((ContextWrapper) it3).getBaseContext();
                }
                return null;
            case 13:
                kotlin.jvm.internal.m.e((P1.c) it, "$this$initializer");
                return new T1.i();
            case 14:
                T1.p it4 = (T1.p) it;
                kotlin.jvm.internal.m.e(it4, "it");
                return it4.f7405s;
            case 15:
                T1.p it5 = (T1.p) it;
                kotlin.jvm.internal.m.e(it5, "it");
                if (!(it5 instanceof r)) {
                    return null;
                }
                u uVar = ((r) it5).f7413v;
                return uVar.n(uVar.f1289b);
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                return new C0530a(X.b((P1.c) it));
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                return z.a(AbstractC1644d.p(700, 6, null));
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                T1.p pVar = ((T1.d) ((C1613l) it).c()).f7354r;
                kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i7 = T1.p.f7402u;
                for (T1.p pVar2 : AbstractC1397A.u((U1.h) pVar)) {
                    if (pVar2 instanceof U1.h) {
                        ((U1.h) pVar2).getClass();
                    } else if (pVar2 instanceof U1.f) {
                        ((U1.f) pVar2).getClass();
                    }
                }
                return null;
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                return z.b(AbstractC1644d.p(700, 6, null));
            case 20:
                return ((T1.d) it).f7358v;
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                ((Boolean) it).getClass();
                return c1386y;
            case 22:
                F DisposableEffect = (F) it;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                return new f0(z ? 1 : 0);
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                P1.c initializer = (P1.c) it;
                kotlin.jvm.internal.m.e(initializer, "$this$initializer");
                return new W1.b(X.b(initializer));
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                T1.p destination = (T1.p) it;
                kotlin.jvm.internal.m.e(destination, "destination");
                r rVar = destination.f7405s;
                if (rVar == null || rVar.f7413v.f1289b != destination.f7404r.f8091a) {
                    return null;
                }
                return rVar;
            case 25:
                T1.p destination2 = (T1.p) it;
                kotlin.jvm.internal.m.e(destination2, "destination");
                r rVar2 = destination2.f7405s;
                if (rVar2 == null || rVar2.f7413v.f1289b != destination2.f7404r.f8091a) {
                    return null;
                }
                return rVar2;
            case 26:
                T1.p it6 = (T1.p) it;
                kotlin.jvm.internal.m.e(it6, "it");
                return Integer.valueOf(it6.f7404r.f8091a);
            case 27:
                Map.Entry entry = (Map.Entry) it;
                kotlin.jvm.internal.m.e(entry, "<destruct>");
                return "       " + ((String) entry.getKey()) + ": " + ((String) entry.getValue());
            case 28:
                Map.Entry entry2 = (Map.Entry) it;
                kotlin.jvm.internal.m.e(entry2, "<destruct>");
                return "       " + ((String) entry2.getKey()) + ": " + ((String) entry2.getValue());
            default:
                String it7 = (String) it;
                kotlin.jvm.internal.m.e(it7, "it");
                return S.w("    ", J5.m.n1(it7).toString());
        }
    }
}
