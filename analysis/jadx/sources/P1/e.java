package P1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(c initialExtras) {
        m.e(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f5610a;
        m.e(initialExtras2, "initialExtras");
        this.f5610a.putAll(initialExtras2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P1.c
    public final Object a(b bVar) {
        return this.f5610a.get(bVar);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (wrap:P1.a:0x0000: SGET  A[WRAPPED] (LINE:6) P1.a.b P1.a) A[MD:(P1.c):void (m)] (LINE:7) call: P1.e.<init>(P1.c):void type: THIS */
    public /* synthetic */ e(int i) {
        this(a.f5609b);
    }
}
