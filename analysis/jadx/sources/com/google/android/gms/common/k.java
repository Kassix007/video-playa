package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class k extends I3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f10351b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f10351b = eVar;
        this.f10350a = context.getApplicationContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i7 = f.f10342a;
        e eVar = this.f10351b;
        Context context = this.f10350a;
        int iC = eVar.c(context, i7);
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            eVar.g(context, iC, eVar.b(context, iC, 0, "n"));
        }
    }
}
