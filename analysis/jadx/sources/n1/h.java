package n1;

import a.AbstractC0597a;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h extends f {
    public final Class j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Constructor f15140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f15141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f15142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Method f15143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f15144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f15145p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h() throws NoSuchMethodException {
        Method methodA0;
        Constructor<?> constructor;
        Method methodZ;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodZ = Z(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodA0 = a0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e7.getClass().getName()), e7);
            methodA0 = null;
            constructor = null;
            methodZ = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.j = cls;
        this.f15140k = constructor;
        this.f15141l = methodZ;
        this.f15142m = method;
        this.f15143n = method2;
        this.f15144o = method3;
        this.f15145p = methodA0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Method Z(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean W(Context context, Object obj, String str, int i, int i7, int i8, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f15141l.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i7), Integer.valueOf(i8), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Typeface X(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.j, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f15145p.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean Y(Object obj) {
        try {
            return ((Boolean) this.f15143n.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Method a0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n1.f, Q2.g
    public final Typeface s(Context context, m1.e eVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f15141l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.s(context, eVar, resources, i);
        }
        try {
            objNewInstance = this.f15140k.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            m1.f[] fVarArr = eVar.f15020a;
            int length = fVarArr.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    m1.f fVar = fVarArr[i7];
                    Context context2 = context;
                    if (W(context2, objNewInstance, fVar.f15021a, fVar.f15025e, fVar.f15022b, fVar.f15023c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f15024d))) {
                        i7++;
                        context = context2;
                    } else {
                        try {
                            this.f15144o.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (Y(objNewInstance)) {
                    return X(objNewInstance);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:82:0x0087 */
    @Override // n1.f, Q2.g
    public final Typeface t(Context context, s1.h[] hVarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceX;
        boolean zBooleanValue;
        if (hVarArr.length >= 1) {
            Method method = this.f15141l;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (s1.h hVar : hVarArr) {
                        if (hVar.f16443e == 0) {
                            Uri uri = hVar.f16439a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC0597a.I(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f15140k.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = hVarArr.length;
                        int i7 = 0;
                        boolean z5 = false;
                        while (true) {
                            Method method2 = this.f15144o;
                            if (i7 < length) {
                                s1.h hVar2 = hVarArr[i7];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(hVar2.f16439a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f15142m.invoke(objNewInstance, byteBuffer, Integer.valueOf(hVar2.f16440b), null, Integer.valueOf(hVar2.f16441c), Integer.valueOf(hVar2.f16442d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z5 = true;
                                }
                                i7++;
                                z5 = z5;
                            } else if (!z5) {
                                method2.invoke(objNewInstance, null);
                            } else if (Y(objNewInstance) && (typefaceX = X(objNewInstance)) != null) {
                                return Typeface.create(typefaceX, i);
                            }
                        }
                    }
                } else {
                    s1.h hVarY = y(hVarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarY.f16439a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(hVarY.f16441c).setItalic(hVarY.f16442d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public final Typeface w(Context context, Resources resources, int i, String str, int i7) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f15141l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.w(context, resources, i, str, i7);
        }
        try {
            objNewInstance = this.f15140k.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!W(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f15144o.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (Y(objNewInstance)) {
                return X(objNewInstance);
            }
        }
        return null;
    }
}
