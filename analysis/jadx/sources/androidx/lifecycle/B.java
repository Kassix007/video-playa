package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f9475a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f9476b = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Constructor constructor, InterfaceC0659w interfaceC0659w) {
        try {
            kotlin.jvm.internal.m.b(constructor.newInstance(interfaceC0659w));
            throw new ClassCastException();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0141 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.Class r13) {
        /*
            java.util.HashMap r0 = androidx.lifecycle.B.f9475a
            java.lang.Object r1 = r0.get(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lf
            int r13 = r1.intValue()
            return r13
        Lf:
            java.lang.String r1 = r13.getCanonicalName()
            r2 = 1
            if (r1 != 0) goto L18
            goto L148
        L18:
            r1 = 0
            java.lang.Package r3 = r13.getPackage()     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            java.lang.String r4 = r13.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            if (r3 == 0) goto L28
            java.lang.String r3 = r3.getName()     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            goto L2a
        L28:
            java.lang.String r3 = ""
        L2a:
            kotlin.jvm.internal.m.b(r3)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            if (r5 != 0) goto L34
            goto L45
        L34:
            kotlin.jvm.internal.m.b(r4)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            int r5 = r5 + r2
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            java.lang.String r5 = "substring(...)"
            kotlin.jvm.internal.m.d(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
        L45:
            kotlin.jvm.internal.m.b(r4)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            java.lang.String r5 = "."
            java.lang.String r6 = "_"
            java.lang.String r4 = J5.t.E0(r4, r5, r6)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            java.lang.String r5 = "_LifecycleAdapter"
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            if (r5 != 0) goto L5d
            goto L71
        L5d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            r5.<init>()     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            r5.append(r3)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            r3 = 46
            r5.append(r3)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            r5.append(r4)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            java.lang.String r4 = r5.toString()     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
        L71:
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            java.lang.Class[] r4 = new java.lang.Class[]{r13}     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            boolean r4 = r3.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            if (r4 != 0) goto L8f
            r3.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L87 java.lang.ClassNotFoundException -> L8e
            goto L8f
        L87:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r13)
            throw r0
        L8e:
            r3 = r1
        L8f:
            r4 = 2
            java.util.HashMap r5 = androidx.lifecycle.B.f9476b
            if (r3 == 0) goto L9e
            java.util.List r1 = com.google.android.gms.internal.measurement.AbstractC0836n2.z(r3)
            r5.put(r13, r1)
        L9b:
            r2 = r4
            goto L148
        L9e:
            androidx.lifecycle.d r3 = androidx.lifecycle.C0641d.f9534c
            java.util.HashMap r6 = r3.f9536b
            java.lang.Object r7 = r6.get(r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r8 = 0
            if (r7 == 0) goto Lb0
            boolean r3 = r7.booleanValue()
            goto Ld2
        Lb0:
            java.lang.reflect.Method[] r7 = r13.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> L150
            int r9 = r7.length
            r10 = r8
        Lb6:
            if (r10 >= r9) goto Lcc
            r11 = r7[r10]
            java.lang.Class<androidx.lifecycle.L> r12 = androidx.lifecycle.L.class
            java.lang.annotation.Annotation r11 = r11.getAnnotation(r12)
            androidx.lifecycle.L r11 = (androidx.lifecycle.L) r11
            if (r11 == 0) goto Lc9
            r3.a(r13, r7)
            r3 = r2
            goto Ld2
        Lc9:
            int r10 = r10 + 1
            goto Lb6
        Lcc:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r6.put(r13, r3)
            r3 = r8
        Ld2:
            if (r3 == 0) goto Ld6
            goto L148
        Ld6:
            java.lang.Class r3 = r13.getSuperclass()
            java.lang.Class<androidx.lifecycle.w> r6 = androidx.lifecycle.InterfaceC0659w.class
            if (r3 == 0) goto Le6
            boolean r7 = r6.isAssignableFrom(r3)
            if (r7 == 0) goto Le6
            r7 = r2
            goto Le7
        Le6:
            r7 = r8
        Le7:
            if (r7 == 0) goto L101
            kotlin.jvm.internal.m.b(r3)
            int r1 = b(r3)
            if (r1 != r2) goto Lf3
            goto L148
        Lf3:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.Object r3 = r5.get(r3)
            kotlin.jvm.internal.m.b(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            r1.<init>(r3)
        L101:
            java.lang.Class[] r3 = r13.getInterfaces()
            kotlin.jvm.internal.b r3 = kotlin.jvm.internal.m.h(r3)
        L109:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L141
            java.lang.Object r7 = r3.next()
            java.lang.Class r7 = (java.lang.Class) r7
            if (r7 == 0) goto L11f
            boolean r9 = r6.isAssignableFrom(r7)
            if (r9 == 0) goto L11f
            r9 = r2
            goto L120
        L11f:
            r9 = r8
        L120:
            if (r9 != 0) goto L123
            goto L109
        L123:
            kotlin.jvm.internal.m.b(r7)
            int r9 = b(r7)
            if (r9 != r2) goto L12d
            goto L148
        L12d:
            if (r1 != 0) goto L134
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L134:
            java.lang.Object r7 = r5.get(r7)
            kotlin.jvm.internal.m.b(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            r1.addAll(r7)
            goto L109
        L141:
            if (r1 == 0) goto L148
            r5.put(r13, r1)
            goto L9b
        L148:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r13, r1)
            return r2
        L150:
            r13 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r0.<init>(r1, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.B.b(java.lang.Class):int");
    }
}
