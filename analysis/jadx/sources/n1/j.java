package n1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Q2.g {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Font U(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iW = W(fontStyle, font.getStyle());
        for (int i7 = 1; i7 < fontFamily.getSize(); i7++) {
            Font font2 = fontFamily.getFont(i7);
            int iW2 = W(fontStyle, font2.getStyle());
            if (iW2 < iW) {
                font = font2;
                iW = iW2;
            }
        }
        return font;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static FontFamily V(s1.h[] hVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (s1.h hVar : hVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(hVar.f16439a, "r", null);
            } catch (IOException e7) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(hVar.f16441c).setSlant(hVar.f16442d ? 1 : 0).setTtcIndex(hVar.f16440b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int W(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public final Typeface s(Context context, m1.e eVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (m1.f fVar : eVar.f15020a) {
                try {
                    Font fontBuild = new Font.Builder(resources, fVar.f).setWeight(fVar.f15022b).setSlant(fVar.f15023c ? 1 : 0).setTtcIndex(fVar.f15025e).setFontVariationSettings(fVar.f15024d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(U(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public final Typeface t(Context context, s1.h[] hVarArr, int i) {
        try {
            FontFamily fontFamilyV = V(hVarArr, context.getContentResolver());
            if (fontFamilyV == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyV).setStyle(U(fontFamilyV, i).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public final Typeface u(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyV = V((s1.h[]) list.get(0), contentResolver);
            if (fontFamilyV == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyV);
            for (int i7 = 1; i7 < list.size(); i7++) {
                FontFamily fontFamilyV2 = V((s1.h[]) list.get(i7), contentResolver);
                if (fontFamilyV2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyV2);
                }
            }
            return customFallbackBuilder.setStyle(U(fontFamilyV, i).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public final Typeface v(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public final Typeface w(Context context, Resources resources, int i, String str, int i7) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q2.g
    public final s1.h y(s1.h[] hVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
