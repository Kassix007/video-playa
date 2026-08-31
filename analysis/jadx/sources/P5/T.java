package P5;

import Q5.AbstractC0422b;
import Q5.AbstractC0423c;
import Q5.AbstractC0424d;
import java.util.concurrent.atomic.AtomicReference;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0424d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f6380a = new AtomicReference(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.AbstractC0424d
    public final boolean a(AbstractC0422b abstractC0422b) {
        AtomicReference atomicReference = this.f6380a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(H.f6354b);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.AbstractC0424d
    public final InterfaceC1524c[] b(AbstractC0422b abstractC0422b) {
        this.f6380a.set(null);
        return AbstractC0423c.f6603a;
    }
}
