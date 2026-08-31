package A;

/* JADX INFO: renamed from: A.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0007d implements InterfaceC0008e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.InterfaceC0008e
    public final void c(W0.c cVar, int i, int[] iArr, W0.l lVar, int[] iArr2) {
        switch (this.f90a) {
            case 0:
                if (lVar != W0.l.f8022q) {
                    AbstractC0012i.b(iArr, iArr2, true);
                } else {
                    AbstractC0012i.c(i, iArr, iArr2, false);
                }
                break;
            default:
                if (lVar != W0.l.f8022q) {
                    AbstractC0012i.c(i, iArr, iArr2, true);
                } else {
                    AbstractC0012i.b(iArr, iArr2, false);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f90a) {
            case 0:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
