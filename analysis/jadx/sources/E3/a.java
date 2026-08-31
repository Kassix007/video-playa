package E3;

import dalvik.system.DelegateLastClassLoader;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r2v0 java.lang.String), (r1v0 java.lang.ClassLoader) A[MD:(java.lang.String, java.lang.ClassLoader):void (c)] (LINE:1) call: dalvik.system.DelegateLastClassLoader.<init>(java.lang.String, java.lang.ClassLoader):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ DelegateLastClassLoader a(ClassLoader classLoader, String str) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void b() {
    }
}
