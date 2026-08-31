package A;

/* JADX INFO: renamed from: A.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0006c implements InterfaceC0008e, InterfaceC0010g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f88b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0006c(int i) {
        this.f87a = i;
        switch (i) {
            case 1:
                this.f88b = 0;
                break;
            case 2:
                this.f88b = 0;
                break;
            case 3:
                this.f88b = 0;
                break;
            default:
                this.f88b = 0;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.InterfaceC0008e, A.InterfaceC0010g
    public final float a() {
        switch (this.f87a) {
        }
        return this.f88b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.InterfaceC0010g
    public final void b(W0.c cVar, int i, int[] iArr, int[] iArr2) {
        switch (this.f87a) {
            case 0:
                AbstractC0012i.a(i, iArr, iArr2, false);
                break;
            case 1:
                AbstractC0012i.d(i, iArr, iArr2, false);
                break;
            case 2:
                AbstractC0012i.e(i, iArr, iArr2, false);
                break;
            default:
                AbstractC0012i.f(i, iArr, iArr2, false);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.InterfaceC0008e
    public final void c(W0.c cVar, int i, int[] iArr, W0.l lVar, int[] iArr2) {
        switch (this.f87a) {
            case 0:
                if (lVar != W0.l.f8022q) {
                    AbstractC0012i.a(i, iArr, iArr2, true);
                } else {
                    AbstractC0012i.a(i, iArr, iArr2, false);
                }
                break;
            case 1:
                if (lVar != W0.l.f8022q) {
                    AbstractC0012i.d(i, iArr, iArr2, true);
                } else {
                    AbstractC0012i.d(i, iArr, iArr2, false);
                }
                break;
            case 2:
                if (lVar != W0.l.f8022q) {
                    AbstractC0012i.e(i, iArr, iArr2, true);
                } else {
                    AbstractC0012i.e(i, iArr, iArr2, false);
                }
                break;
            default:
                if (lVar != W0.l.f8022q) {
                    AbstractC0012i.f(i, iArr, iArr2, true);
                } else {
                    AbstractC0012i.f(i, iArr, iArr2, false);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f87a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
