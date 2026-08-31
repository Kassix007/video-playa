package u;

/* JADX INFO: loaded from: classes.dex */
public interface B0 {
    boolean a();

    long b(AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3);

    AbstractC1663q g(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3);

    AbstractC1663q n(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default AbstractC1663q p(AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        return n(b(abstractC1663q, abstractC1663q2, abstractC1663q3), abstractC1663q, abstractC1663q2, abstractC1663q3);
    }
}
