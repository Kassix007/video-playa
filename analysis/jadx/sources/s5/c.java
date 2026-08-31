package s5;

import kotlin.jvm.internal.m;
import q5.C1525d;
import q5.InterfaceC1524c;
import q5.InterfaceC1526e;
import q5.InterfaceC1527f;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {
    private final InterfaceC1529h _context;
    private transient InterfaceC1524c<Object> intercepted;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(InterfaceC1524c interfaceC1524c, InterfaceC1529h interfaceC1529h) {
        super(interfaceC1524c);
        this._context = interfaceC1529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public InterfaceC1529h getContext() {
        InterfaceC1529h interfaceC1529h = this._context;
        m.b(interfaceC1529h);
        return interfaceC1529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1524c<Object> intercepted() {
        InterfaceC1524c interfaceC1524cInterceptContinuation = this.intercepted;
        if (interfaceC1524cInterceptContinuation == null) {
            InterfaceC1526e interfaceC1526e = (InterfaceC1526e) getContext().get(C1525d.f16021q);
            if (interfaceC1526e == null || (interfaceC1524cInterceptContinuation = interfaceC1526e.interceptContinuation(this)) == null) {
                interfaceC1524cInterceptContinuation = this;
            }
            this.intercepted = interfaceC1524cInterceptContinuation;
        }
        return interfaceC1524cInterceptContinuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public void releaseIntercepted() {
        InterfaceC1524c<Object> interfaceC1524c = this.intercepted;
        if (interfaceC1524c != null && interfaceC1524c != this) {
            InterfaceC1527f interfaceC1527f = getContext().get(C1525d.f16021q);
            m.b(interfaceC1527f);
            ((InterfaceC1526e) interfaceC1527f).releaseInterceptedContinuation(interfaceC1524c);
        }
        this.intercepted = b.f16561q;
    }

    public c(InterfaceC1524c interfaceC1524c) {
        this(interfaceC1524c, interfaceC1524c != null ? interfaceC1524c.getContext() : null);
    }
}
