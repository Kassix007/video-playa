package q2;

/* JADX INFO: renamed from: q2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1514s extends AbstractC1510o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15999a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1509n f16000b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1514s() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.InterfaceC1507l
    public final void d(AbstractC1509n abstractC1509n) {
        switch (this.f15999a) {
            case 0:
                this.f16000b.z();
                abstractC1509n.x(this);
                break;
            default:
                C1496a c1496a = (C1496a) this.f16000b;
                int i = c1496a.f15931S - 1;
                c1496a.f15931S = i;
                if (i == 0) {
                    c1496a.f15932T = false;
                    c1496a.m();
                }
                abstractC1509n.x(this);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1510o, q2.InterfaceC1507l
    public void f(AbstractC1509n abstractC1509n) {
        switch (this.f15999a) {
            case 1:
                C1496a c1496a = (C1496a) this.f16000b;
                if (!c1496a.f15932T) {
                    c1496a.G();
                    c1496a.f15932T = true;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1514s(AbstractC1509n abstractC1509n) {
        this.f16000b = abstractC1509n;
    }
}
