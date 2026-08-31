package E3;

import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes.dex */
public final class i extends PathClassLoader {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z5) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z5);
    }
}
