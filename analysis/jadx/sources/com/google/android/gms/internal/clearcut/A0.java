package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class A0 implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f10376c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public A0(IBinder iBinder) {
        this.f10376c = iBinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10376c;
    }
}
