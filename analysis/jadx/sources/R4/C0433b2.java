package R4;

import Z5.C0574c;
import a5.C0634a;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import n5.AbstractC1397A;

/* JADX INFO: renamed from: R4.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0433b2 implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6914q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [R4.J2.<clinit>():void, R4.M2.<clinit>():void, R4.V2.<clinit>():void, R4.Y2.<clinit>():void, R4.e2.<clinit>():void, R4.k2.<clinit>():void, R4.q2.<clinit>():void, R4.w2.<clinit>():void, W1.c.<init>(T1.d):void, Z4.G.invoke(java.lang.Object):java.lang.Object, a.a.u(android.content.Context):t2.l, a5.f.<clinit>():void, a5.i.<clinit>():void, q3.c.<clinit>():void] */
    public /* synthetic */ C0433b2(int i) {
        this.f6914q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        ServiceConfigurationError serviceConfigurationError;
        switch (this.f6914q) {
            case 0:
                return new C0574c(C3.a.A(C0473l2.f7113a));
            case 1:
                return new C0574c(C0485o2.f7147a);
            case 2:
                return new C0574c(C0437c2.f6930a);
            case 3:
                return new C0574c(C3.a.A(C0449f2.f6955a));
            case 4:
                return new C0574c(C3.a.A(C0495r1.f7177a));
            case 5:
                return new C0574c(C3.a.A(K2.f6786a));
            case 6:
                return new C0574c(C3.a.A(C0472l1.f7112a));
            case 7:
                return new C0574c(C3.a.A(Q2.f6839a));
            case 8:
                return new C0574c(W2.f6882a);
            case 9:
                return new C0574c(C3.a.A(Z2.f6908a));
            case 10:
                return new T2.b(new d6.q());
            case 11:
                return V4.b.a();
            case 12:
                return new androidx.lifecycle.a0();
            case 13:
                D2.o oVar = new D2.o(1);
                oVar.a(kotlin.jvm.internal.z.a(W1.b.class), new I5.m(23));
                return oVar.c();
            case 14:
                try {
                    return AbstractC1397A.E(I5.k.S(I5.k.Q(Arrays.asList(new T2.c()).iterator())));
                } finally {
                }
            case 15:
                try {
                    return AbstractC1397A.E(I5.k.S(I5.k.Q(Arrays.asList(new X2.a()).iterator())));
                } finally {
                }
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                X5.i iVar = X5.i.f;
                X5.f[] fVarArr = new X5.f[0];
                if (J5.m.U0("kotlin.Unit")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                if (iVar.equals(X5.i.f8194c)) {
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                X5.a aVar = new X5.a("kotlin.Unit");
                return new X5.g("kotlin.Unit", iVar, aVar.f8173b.size(), n5.k.R0(fVarArr), aVar);
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                return new C0574c(C0634a.f8934a);
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                return new C0574c(C3.a.A(a5.d.f8938a));
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                return a6.C.f9015b;
            case 20:
                return a6.v.f9047b;
            case WorkDatabaseVersions.VERSION_21 /* 21 */:
                return a6.s.f9045a;
            case 22:
                return a6.z.f9053b;
            case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                return a6.g.f9027b;
            case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 25:
                return new Handler(Looper.getMainLooper());
            case 26:
                return new d6.q();
            default:
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Z5.M.<init>():void] */
    public /* synthetic */ C0433b2(Z5.M m4) {
        this.f6914q = 16;
    }
}
