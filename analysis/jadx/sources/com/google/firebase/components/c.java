package com.google.firebase.components;

import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentRegistrar f11733b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c(ComponentRegistrar componentRegistrar, int i) {
        this.f11732a = i;
        this.f11733b = componentRegistrar;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.components.ComponentRuntime.Builder.a(com.google.firebase.components.ComponentRegistrar):com.google.firebase.components.ComponentRegistrar */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f11732a) {
            case 0:
                return ComponentRuntime.lambda$toProviders$1(this.f11733b);
            default:
                return ComponentRuntime.Builder.lambda$addComponentRegistrar$0(this.f11733b);
        }
    }
}
