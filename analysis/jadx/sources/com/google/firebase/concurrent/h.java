package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11766a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.firebase.concurrent.ExecutorsRegistrar.getComponents():java.util.List<com.google.firebase.components.Component<?>>, com.google.firebase.installations.FirebaseInstallationsRegistrar.getComponents():java.util.List<com.google.firebase.components.Component<?>>, com.google.firebase.platforminfo.DefaultUserAgentPublisher.component():com.google.firebase.components.Component<com.google.firebase.platforminfo.UserAgentPublisher>] */
    public /* synthetic */ h(int i) {
        this.f11766a = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.concurrent.ExecutorsRegistrar.d(com.google.firebase.components.ComponentContainer):java.util.concurrent.Executor */
    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.installations.FirebaseInstallationsRegistrar.a(com.google.firebase.components.ComponentContainer):com.google.firebase.installations.FirebaseInstallationsApi */
    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.platforminfo.DefaultUserAgentPublisher.a(com.google.firebase.components.ComponentContainer):com.google.firebase.platforminfo.UserAgentPublisher */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f11766a) {
            case 0:
                return ExecutorsRegistrar.lambda$getComponents$4(componentContainer);
            case 1:
                return ExecutorsRegistrar.lambda$getComponents$5(componentContainer);
            case 2:
                return ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
            case 3:
                return ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
            case 4:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
            default:
                return DefaultUserAgentPublisher.lambda$component$0(componentContainer);
        }
    }
}
