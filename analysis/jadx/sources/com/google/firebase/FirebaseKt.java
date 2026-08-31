package com.google.firebase;

import M5.AbstractC0257s;
import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseKt {

    /* JADX INFO: renamed from: com.google.firebase.FirebaseKt$coroutineDispatcher$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements ComponentFactory {
        public static final AnonymousClass1<T> INSTANCE = new AnonymousClass1<>();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: create(Lcom/google/firebase/components/ComponentContainer;)Ljava/lang/Object; */
        @Override // com.google.firebase.components.ComponentFactory
        public final AbstractC0257s create(ComponentContainer componentContainer) {
            m.j();
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FirebaseApp app(Firebase firebase, String name) {
        m.e(firebase, "<this>");
        m.e(name, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(name);
        m.d(firebaseApp, "getInstance(name)");
        return firebaseApp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final <T extends Annotation> Component<AbstractC0257s> coroutineDispatcher() {
        m.j();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FirebaseApp getApp(Firebase firebase) {
        m.e(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        m.d(firebaseApp, "getInstance()");
        return firebaseApp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FirebaseOptions getOptions(Firebase firebase) {
        m.e(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        m.d(options, "Firebase.app.options");
        return options;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        m.e(firebase, "<this>");
        m.e(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions options) {
        m.e(firebase, "<this>");
        m.e(context, "context");
        m.e(options, "options");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, options);
        m.d(firebaseAppInitializeApp, "initializeApp(context, options)");
        return firebaseAppInitializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions options, String name) {
        m.e(firebase, "<this>");
        m.e(context, "context");
        m.e(options, "options");
        m.e(name, "name");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, options, name);
        m.d(firebaseAppInitializeApp, "initializeApp(context, options, name)");
        return firebaseAppInitializeApp;
    }
}
