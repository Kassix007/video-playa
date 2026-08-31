package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultHeartBeatController f11773b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(DefaultHeartBeatController defaultHeartBeatController, int i) {
        this.f11772a = i;
        this.f11773b = defaultHeartBeatController;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.heartbeatinfo.DefaultHeartBeatController.d(com.google.firebase.heartbeatinfo.DefaultHeartBeatController):java.lang.Void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11772a) {
            case 0:
                return this.f11773b.lambda$getHeartBeatsHeader$1();
            default:
                return this.f11773b.lambda$registerHeartBeat$0();
        }
    }
}
