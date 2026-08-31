package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: renamed from: g1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1072b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12827a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f12830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12831e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12832g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1072b(C1072b c1072b, Object obj) {
        c1072b.getClass();
        this.f12828b = c1072b.f12828b;
        b(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f13028d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        boolean z5 = false;
        Object objValueOf = null;
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            int i8 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z5 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i9 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i9 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i9 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i8 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i8;
                            }
                        }
                        i = 7;
                    }
                }
                i = i9;
            }
        }
        if (string != null && objValueOf != null) {
            C1072b c1072b = new C1072b();
            c1072b.f12828b = i;
            c1072b.f12827a = z5;
            c1072b.b(objValueOf);
            map.put(string, c1072b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Object obj) {
        switch (O.c.a(this.f12828b)) {
            case 0:
            case 7:
                this.f12829c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f12830d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f12832g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f12831e = (String) obj;
                break;
            case 5:
                this.f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f12830d = ((Float) obj).floatValue();
                break;
        }
    }
}
