package M5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends i0 implements InterfaceC0253n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f3843s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(InterfaceC0241b0 interfaceC0241b0) {
        super(true);
        boolean z5 = true;
        I(interfaceC0241b0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0.f3865r;
        InterfaceC0250k interfaceC0250k = (InterfaceC0250k) atomicReferenceFieldUpdater.get(this);
        C0251l c0251l = interfaceC0250k instanceof C0251l ? (C0251l) interfaceC0250k : null;
        if (c0251l == null) {
            z5 = false;
            break;
        }
        i0 i0VarJ = c0251l.j();
        while (!i0VarJ.C()) {
            InterfaceC0250k interfaceC0250k2 = (InterfaceC0250k) atomicReferenceFieldUpdater.get(i0VarJ);
            C0251l c0251l2 = interfaceC0250k2 instanceof C0251l ? (C0251l) interfaceC0250k2 : null;
            if (c0251l2 == null) {
                z5 = false;
                break;
            }
            i0VarJ = c0251l2.j();
        }
        this.f3843s = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public final boolean C() {
        return this.f3843s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public final boolean D() {
        return true;
    }
}
