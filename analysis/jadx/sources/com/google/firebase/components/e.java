package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f11738s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f11736q = i;
        this.f11738s = obj;
        this.f11737r = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11736q) {
            case 0:
                ((OptionalProvider) this.f11738s).set((Provider) this.f11737r);
                break;
            case 1:
                ((LazySet) this.f11738s).add((Provider) this.f11737r);
                break;
            default:
                EventBus.lambda$publish$0((Map.Entry) this.f11738s, (Event) this.f11737r);
                break;
        }
    }
}
