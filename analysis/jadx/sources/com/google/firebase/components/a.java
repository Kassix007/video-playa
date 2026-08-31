package com.google.firebase.components;

import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11729b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(int i, Object obj) {
        this.f11728a = i;
        this.f11729b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f11728a) {
            case 0:
                return Component.lambda$of$2(this.f11729b, componentContainer);
            case 1:
                return Component.lambda$intoSet$4(this.f11729b, componentContainer);
            case 2:
                return Component.lambda$intoSet$3(this.f11729b, componentContainer);
            case 3:
                return Component.lambda$of$0(this.f11729b, componentContainer);
            case 4:
                return Component.lambda$of$1(this.f11729b, componentContainer);
            default:
                return DefaultHeartBeatController.lambda$component$3((Qualified) this.f11729b, componentContainer);
        }
    }
}
