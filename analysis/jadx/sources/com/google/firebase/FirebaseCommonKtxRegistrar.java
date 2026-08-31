package com.google.firebase;

import M5.AbstractC0257s;
import M5.AbstractC0263y;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component componentBuild = Component.builder(Qualified.qualified(Background.class, AbstractC0257s.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Background.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: create(Lcom/google/firebase/components/ComponentContainer;)Ljava/lang/Object; */
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC0257s create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Background.class, Executor.class));
                m.d(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0263y.k((Executor) obj);
            }
        }).build();
        m.d(componentBuild, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component componentBuild2 = Component.builder(Qualified.qualified(Lightweight.class, AbstractC0257s.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Lightweight.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: create(Lcom/google/firebase/components/ComponentContainer;)Ljava/lang/Object; */
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC0257s create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Lightweight.class, Executor.class));
                m.d(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0263y.k((Executor) obj);
            }
        }).build();
        m.d(componentBuild2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component componentBuild3 = Component.builder(Qualified.qualified(Blocking.class, AbstractC0257s.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Blocking.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: create(Lcom/google/firebase/components/ComponentContainer;)Ljava/lang/Object; */
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC0257s create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Blocking.class, Executor.class));
                m.d(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0263y.k((Executor) obj);
            }
        }).build();
        m.d(componentBuild3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component componentBuild4 = Component.builder(Qualified.qualified(UiThread.class, AbstractC0257s.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(UiThread.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: create(Lcom/google/firebase/components/ComponentContainer;)Ljava/lang/Object; */
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC0257s create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(UiThread.class, Executor.class));
                m.d(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0263y.k((Executor) obj);
            }
        }).build();
        m.d(componentBuild4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return AbstractC0836n2.A(componentBuild, componentBuild2, componentBuild3, componentBuild4);
    }
}
