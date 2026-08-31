package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class SynchronizedStartStopTokensImpl implements StartStopTokens {
    private final StartStopTokens delegate;
    private final Object lock;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SynchronizedStartStopTokensImpl(StartStopTokens delegate) {
        m.e(delegate, "delegate");
        this.delegate = delegate;
        this.lock = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.StartStopTokens
    public boolean contains(WorkGenerationalId id) {
        boolean zContains;
        m.e(id, "id");
        synchronized (this.lock) {
            zContains = this.delegate.contains(id);
        }
        return zContains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken remove(WorkGenerationalId id) {
        StartStopToken startStopTokenRemove;
        m.e(id, "id");
        synchronized (this.lock) {
            startStopTokenRemove = this.delegate.remove(id);
        }
        return startStopTokenRemove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken tokenFor(WorkGenerationalId id) {
        StartStopToken startStopToken;
        m.e(id, "id");
        synchronized (this.lock) {
            startStopToken = this.delegate.tokenFor(id);
        }
        return startStopToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // androidx.work.impl.StartStopTokens
    public List<StartStopToken> remove(String workSpecId) {
        List<StartStopToken> listRemove;
        m.e(workSpecId, "workSpecId");
        synchronized (this.lock) {
            listRemove = this.delegate.remove(workSpecId);
        }
        return listRemove;
    }
}
