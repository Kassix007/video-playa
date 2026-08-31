package M2;

import I2.y;
import M5.InterfaceC0261w;
import U2.n;
import U2.p;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.AbstractC1362a;
import m5.C1386y;
import n5.AbstractC1397A;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f3771r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U2.g f3772s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3773t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f3774u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ I2.i f3775v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ P2.a f3776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f3777x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, U2.g gVar, Object obj, n nVar, I2.i iVar, P2.a aVar, k kVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f3771r = hVar;
        this.f3772s = gVar;
        this.f3773t = obj;
        this.f3774u = nVar;
        this.f3775v = iVar;
        this.f3776w = aVar;
        this.f3777x = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new g(this.f3771r, this.f3772s, this.f3773t, this.f3774u, this.f3775v, this.f3776w, this.f3777x, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        boolean z5;
        P2.c cVar;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        int i = this.f3770q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            h hVar = this.f3771r;
            U2.g gVar = this.f3772s;
            Object obj2 = this.f3773t;
            n nVar = this.f3774u;
            I2.i iVar = this.f3775v;
            this.f3770q = 1;
            objB = h.b(hVar, gVar, obj2, nVar, iVar, this);
            if (objB == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            objB = obj;
        }
        a aVar = (a) objB;
        Y2.a aVar2 = this.f3771r.f3779b;
        synchronized (aVar2) {
            try {
                y yVar = (y) aVar2.f8198q.get();
                if (yVar == null) {
                    aVar2.a();
                } else if (aVar2.f8199r == null) {
                    Context context = yVar.f2404a.f2378a;
                    aVar2.f8199r = context;
                    context.registerComponentCallbacks(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        k3.c cVar2 = this.f3771r.f3781d;
        P2.a aVar3 = this.f3776w;
        U2.g gVar2 = this.f3772s;
        if (aVar3 == null || !gVar2.f7664h.f7629r || !aVar.f3725a.d() || (cVar = (P2.c) ((y) cVar2.f14120q).f2404a.f2380c.getValue()) == null) {
            z5 = false;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("coil#is_sampled", Boolean.valueOf(aVar.f3726b));
            String str = aVar.f3728d;
            if (str != null) {
                linkedHashMap.put("coil#disk_cache_key", str);
            }
            I2.n nVar2 = aVar.f3725a;
            Map mapF = AbstractC1397A.F(linkedHashMap);
            synchronized (cVar.f5620c) {
                long jC = nVar2.c();
                if (jC < 0) {
                    throw new IllegalStateException(("Image size must be non-negative: " + jC).toString());
                }
                cVar.f5618a.m(aVar3, nVar2, mapF, jC);
            }
            z5 = true;
        }
        I2.n nVar3 = aVar.f3725a;
        U2.g gVar3 = this.f3772s;
        J2.h hVar2 = aVar.f3727c;
        P2.a aVar4 = this.f3776w;
        if (!z5) {
            aVar4 = null;
        }
        P2.a aVar5 = aVar4;
        String str2 = aVar.f3728d;
        boolean z6 = aVar.f3726b;
        k kVar = this.f3777x;
        return new p(nVar3, gVar3, hVar2, aVar5, str2, z6, kVar != null && kVar.f3797c);
    }
}
