package n1;

import a.AbstractC0597a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class f extends Q2.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Class f15134e = null;
    public static Constructor f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f15135g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Method f15136h = null;
    public static boolean i = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean U(Object obj, String str, int i7, boolean z5) throws NoSuchMethodException {
        V();
        try {
            return ((Boolean) f15135g.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void V() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (i) {
            return;
        }
        i = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            method = null;
            cls = null;
            method2 = null;
        }
        f = constructor;
        f15134e = cls;
        f15135g = method2;
        f15136h = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public Typeface s(Context context, m1.e eVar, Resources resources, int i7) throws NoSuchMethodException {
        V();
        try {
            Object objNewInstance = f.newInstance(null);
            for (m1.f fVar : eVar.f15020a) {
                File fileE = AbstractC0597a.E(context);
                if (fileE == null) {
                    return null;
                }
                try {
                    if (!AbstractC0597a.s(fileE, resources, fVar.f)) {
                        return null;
                    }
                    if (!U(objNewInstance, fileE.getPath(), fVar.f15022b, fVar.f15023c)) {
                        return null;
                    }
                    fileE.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileE.delete();
                }
            }
            V();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f15134e, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f15136h.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public Typeface t(Context context, s1.h[] hVarArr, int i7) {
        String str;
        if (hVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(y(hVarArr, i7).f16439a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceV = v(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceV;
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
