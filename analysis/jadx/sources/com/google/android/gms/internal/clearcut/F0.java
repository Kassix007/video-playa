package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.measurement.T1;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10418a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(Handler handler, int i) {
        super(handler);
        this.f10418a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z5) {
        switch (this.f10418a) {
            case 0:
                E0.f10410e.set(true);
                break;
            default:
                T1.i.incrementAndGet();
                break;
        }
    }
}
