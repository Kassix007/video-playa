package P5;

import M5.InterfaceC0261w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m5.C1386y;
import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: renamed from: P5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0393d extends Q5.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6392v = AtomicIntegerFieldUpdater.newUpdater(C0393d.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final O5.v f6393t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f6394u;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r7v0 O5.v)
  (r8v0 boolean)
  (wrap:q5.i:0x0003: SGET  A[WRAPPED] (LINE:2) q5.i.q q5.i)
  (-3 int)
  (wrap:O5.a:0x0001: SGET  A[WRAPPED] (LINE:1) O5.a.q O5.a)
 A[MD:(O5.v, boolean, q5.h, int, O5.a):void (m)] (LINE:2) call: P5.d.<init>(O5.v, boolean, q5.h, int, O5.a):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0393d(O5.v vVar, boolean z5) {
        this(vVar, z5, C1530i.f16022q, -3, O5.a.f5206q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.g
    public final String b() {
        return "channel=" + this.f6393t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.g
    public final Object c(O5.t tVar, InterfaceC1524c interfaceC1524c) throws Throwable {
        Object objH = H.h(new Q5.B(tVar), this.f6393t, this.f6394u, interfaceC1524c);
        return objH == EnumC1580a.f16356q ? objH : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.g, P5.InterfaceC0397h
    public final Object collect(InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c) throws Throwable {
        int i = this.f6614r;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (i == -3) {
            boolean z5 = this.f6394u;
            if (z5 && f6392v.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objH = H.h(interfaceC0398i, this.f6393t, z5, interfaceC1524c);
            if (objH == enumC1580a) {
                return objH;
            }
        } else {
            Object objCollect = super.collect(interfaceC0398i, interfaceC1524c);
            if (objCollect == enumC1580a) {
                return objCollect;
            }
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.g
    public final Q5.g d(InterfaceC1529h interfaceC1529h, int i, O5.a aVar) {
        return new C0393d(this.f6393t, this.f6394u, interfaceC1529h, i, aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.g
    public final InterfaceC0397h e() {
        return new C0393d(this.f6393t, this.f6394u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.g
    public final O5.v f(InterfaceC0261w interfaceC0261w) {
        if (this.f6394u && f6392v.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f6614r == -3 ? this.f6393t : super.f(interfaceC0261w);
    }

    public C0393d(O5.v vVar, boolean z5, InterfaceC1529h interfaceC1529h, int i, O5.a aVar) {
        super(interfaceC1529h, i, aVar);
        this.f6393t = vVar;
        this.f6394u = z5;
    }
}
