package q5;

import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: q5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1522a implements InterfaceC1527f {
    private final InterfaceC1528g key;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1522a(InterfaceC1528g interfaceC1528g) {
        this.key = interfaceC1528g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public <R> R fold(R r3, B5.e operation) {
        m.e(operation, "operation");
        return (R) operation.invoke(r3, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public InterfaceC1527f get(InterfaceC1528g interfaceC1528g) {
        return E3.h.A(this, interfaceC1528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1527f
    public InterfaceC1528g getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public InterfaceC1529h minusKey(InterfaceC1528g interfaceC1528g) {
        return E3.h.I(this, interfaceC1528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public InterfaceC1529h plus(InterfaceC1529h interfaceC1529h) {
        return E3.h.L(this, interfaceC1529h);
    }
}
