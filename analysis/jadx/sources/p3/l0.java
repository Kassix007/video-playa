package p3;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends V {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.V, p3.W
    public final void j(AbstractC1446a0 abstractC1446a0) throws A0 {
        if (abstractC1446a0 instanceof k0) {
            this.i.add(abstractC1446a0);
            return;
        }
        throw new A0("Text content elements cannot contain " + abstractC1446a0 + " elements.");
    }
}
