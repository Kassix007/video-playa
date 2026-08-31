package androidx.room;

import M5.AbstractC0257s;
import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import P5.H;
import P5.InterfaceC0398i;
import java.util.Map;
import java.util.concurrent.Callable;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: androidx.room.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0667e extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9721q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f9723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f9724t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0398i f9725u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String[] f9726v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Callable f9727w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667e(boolean z5, w wVar, InterfaceC0398i interfaceC0398i, String[] strArr, Callable callable, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f9723s = z5;
        this.f9724t = wVar;
        this.f9725u = interfaceC0398i;
        this.f9726v = strArr;
        this.f9727w = callable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C0667e c0667e = new C0667e(this.f9723s, this.f9724t, this.f9725u, this.f9726v, this.f9727w, interfaceC1524c);
        c0667e.f9722r = obj;
        return c0667e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0667e) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC0257s abstractC0257s;
        int i = this.f9721q;
        C1386y c1386y = C1386y.f15098a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return c1386y;
        }
        AbstractC1362a.e(obj);
        InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f9722r;
        O5.e eVarE = l6.d.e(-1, null, 6);
        C0666d c0666d = new C0666d(this.f9726v, eVarE, 0);
        eVarE.j(c1386y);
        if (interfaceC0261w.d().get(E.f9702q) != null) {
            throw new ClassCastException();
        }
        boolean z5 = this.f9723s;
        w wVar = this.f9724t;
        if (z5) {
            Map<String, Object> backingFieldMap = wVar.getBackingFieldMap();
            Object objK = backingFieldMap.get("TransactionDispatcher");
            if (objK == null) {
                objK = AbstractC0263y.k(wVar.getTransactionExecutor());
                backingFieldMap.put("TransactionDispatcher", objK);
            }
            abstractC0257s = (AbstractC0257s) objK;
        } else {
            Map<String, Object> backingFieldMap2 = wVar.getBackingFieldMap();
            Object objK2 = backingFieldMap2.get("QueryDispatcher");
            if (objK2 == null) {
                objK2 = AbstractC0263y.k(wVar.getQueryExecutor());
                backingFieldMap2.put("QueryDispatcher", objK2);
            }
            abstractC0257s = (AbstractC0257s) objK2;
        }
        AbstractC0257s abstractC0257s2 = abstractC0257s;
        O5.e eVarE2 = l6.d.e(0, null, 7);
        AbstractC0263y.t(interfaceC0261w, abstractC0257s2, null, new C0665c(this.f9724t, c0666d, eVarE, this.f9727w, eVarE2, null), 2);
        this.f9721q = 1;
        Object objH = H.h(this.f9725u, eVarE2, true, this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (objH != enumC1580a) {
            objH = c1386y;
        }
        return objH == enumC1580a ? enumC1580a : c1386y;
    }
}
