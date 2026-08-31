package androidx.work;

import androidx.lifecycle.G;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class OperationImpl implements Operation {
    private final I4.b future;
    private final G state;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OperationImpl(G state, I4.b future) {
        m.e(state, "state");
        m.e(future, "future");
        this.state = state;
        this.future = future;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.Operation
    public I4.b getResult() {
        return this.future;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.Operation
    public G getState() {
        return this.state;
    }
}
