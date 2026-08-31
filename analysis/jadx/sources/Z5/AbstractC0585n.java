package Z5;

/* JADX INFO: renamed from: Z5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0585n extends AbstractC0572a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V5.a f8615a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0585n(V5.a aVar) {
        this.f8615a = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public void g(Y5.a aVar, int i, Object obj) {
        j(i, obj, aVar.b(b(), i, this.f8615a, null));
    }

    public abstract void j(int i, Object obj, Object obj2);
}
