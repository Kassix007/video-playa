package Q;

import P.D0;
import P.InterfaceC0347c;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6475b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I(int i, int i7) {
        this.f6474a = i;
        this.f6475b = i7;
    }

    public abstract void a(J j, InterfaceC0347c interfaceC0347c, D0 d02, X.j jVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strC = kotlin.jvm.internal.z.a(getClass()).c();
        return strC == null ? "" : strC;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(int, int):void (m)] (LINE:2) call: Q.I.<init>(int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ I(int i, int i7, int i8) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i7);
    }
}
