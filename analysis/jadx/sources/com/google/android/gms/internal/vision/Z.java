package com.google.android.gms.internal.vision;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f11251a = Logger.getLogger(Q.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f11252b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static U a() {
        String str;
        ClassLoader classLoader = Z.class.getClassLoader();
        if (U.class.equals(U.class)) {
            str = f11252b;
        } else {
            if (!U.class.getPackage().equals(Z.class.getPackage())) {
                throw new IllegalArgumentException(U.class.getName());
            }
            str = U.class.getPackage().getName() + ".BlazeGenerated" + U.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    C0.S.t(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (InstantiationException e9) {
                throw new IllegalStateException(e9);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new Z[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e11) {
                        Level level = Level.SEVERE;
                        String simpleName = U.class.getSimpleName();
                        f11251a.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e11);
                    }
                }
                if (arrayList.size() == 1) {
                    return (U) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (U) U.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(e12);
                } catch (NoSuchMethodException e13) {
                    throw new IllegalStateException(e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(e14);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }
}
