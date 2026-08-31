package h2;

import P.AbstractC0366l0;

/* JADX INFO: renamed from: h2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1121a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0366l0 f13442a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if ((r1 instanceof P.AbstractC0366l0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r1 = (P.AbstractC0366l0) r1;
     */
    static {
        /*
            r0 = 0
            java.lang.Class<g2.e> r1 = g2.e.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L2e
            kotlin.jvm.internal.m.b(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalSavedStateRegistryOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "getAnnotations(...)"
            kotlin.jvm.internal.m.d(r2, r3)     // Catch: java.lang.Throwable -> L2e
            int r3 = r2.length     // Catch: java.lang.Throwable -> L2e
            r4 = 0
        L21:
            if (r4 >= r3) goto L30
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L2e
            boolean r5 = r5 instanceof m5.InterfaceC1364c     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L2b
        L29:
            r1 = r0
            goto L3f
        L2b:
            int r4 = r4 + 1
            goto L21
        L2e:
            r1 = move-exception
            goto L3b
        L30:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r1 instanceof P.AbstractC0366l0     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L29
            P.l0 r1 = (P.AbstractC0366l0) r1     // Catch: java.lang.Throwable -> L2e
            goto L3f
        L3b:
            m5.l r1 = m5.AbstractC1362a.b(r1)
        L3f:
            boolean r2 = r1 instanceof m5.C1373l
            if (r2 == 0) goto L44
            goto L45
        L44:
            r0 = r1
        L45:
            P.l0 r0 = (P.AbstractC0366l0) r0
            if (r0 != 0) goto L56
            R4.b2 r0 = new R4.b2
            r1 = 24
            r0.<init>(r1)
            P.T0 r1 = new P.T0
            r1.<init>(r0)
            r0 = r1
        L56:
            h2.AbstractC1121a.f13442a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.AbstractC1121a.<clinit>():void");
    }
}
