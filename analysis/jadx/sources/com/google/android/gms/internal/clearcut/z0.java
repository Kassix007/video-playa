package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import x3.AbstractC1896h;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends AbstractC1896h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final int e() {
        return 11925000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return iInterfaceQueryLocalInterface instanceof A0 ? (A0) iInterfaceQueryLocalInterface : new A0(iBinder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final String u() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final String v() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
