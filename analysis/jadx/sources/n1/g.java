package n1;

import a.AbstractC0597a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import r.Q;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Q2.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class f15137e;
    public static final Constructor f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Method f15138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Method f15139h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi24Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            method2 = null;
        }
        f = constructor;
        f15137e = cls;
        f15138g = method2;
        f15139h = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean U(Object obj, ByteBuffer byteBuffer, int i, int i7, boolean z5) {
        try {
            return ((Boolean) f15138g.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i7), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Typeface V(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f15137e, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f15139h.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public final Typeface s(Context context, m1.e eVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (m1.f fVar : eVar.f15020a) {
                int i7 = fVar.f;
                File fileE = AbstractC0597a.E(context);
                if (fileE != null) {
                    try {
                        if (AbstractC0597a.s(fileE, resources, i7)) {
                            try {
                                fileInputStream = new FileInputStream(fileE);
                            } catch (IOException unused2) {
                                map = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (map != null && U(objNewInstance, map, fVar.f15025e, fVar.f15022b, fVar.f15023c)) {
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileE.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return V(objNewInstance);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public final Typeface t(Context context, s1.h[] hVarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i7 = 0;
            Q q7 = new Q(0);
            int length = hVarArr.length;
            while (true) {
                if (i7 < length) {
                    s1.h hVar = hVarArr[i7];
                    Uri uri = hVar.f16439a;
                    ByteBuffer byteBufferI = (ByteBuffer) q7.get(uri);
                    if (byteBufferI == null) {
                        byteBufferI = AbstractC0597a.I(context, uri);
                        q7.put(uri, byteBufferI);
                    }
                    if (byteBufferI == null || !U(objNewInstance, byteBufferI, hVar.f16440b, hVar.f16441c, hVar.f16442d)) {
                        break;
                    }
                    i7++;
                } else {
                    Typeface typefaceV = V(objNewInstance);
                    if (typefaceV != null) {
                        return Typeface.create(typefaceV, i);
                    }
                }
            }
        }
        return null;
    }
}
