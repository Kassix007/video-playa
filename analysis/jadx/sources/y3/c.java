package Y3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.gms.internal.measurement.I1;
import com.wnapp.smspariaz.R;
import java.io.IOException;
import java.util.Locale;
import l4.m;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f8260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8264e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f8265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f8266h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8267k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(Context context, b bVar) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        b bVar2 = new b();
        bVar2.f8258y = 255;
        bVar2.f8230A = -2;
        bVar2.f8231B = -2;
        bVar2.f8232C = -2;
        bVar2.f8239J = Boolean.TRUE;
        this.f8261b = bVar2;
        int i = bVar.f8250q;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = attributeSetAsAttributeSet;
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e7) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e7);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayG = m.g(context, attributeSet, V3.a.f7975a, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f8262c = typedArrayG.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f8263d = typedArrayG.getDimensionPixelSize(14, -1);
        this.f8264e = typedArrayG.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f8265g = typedArrayG.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayG.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f8266h = typedArrayG.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f8267k = typedArrayG.getInt(24, 1);
        b bVar3 = this.f8261b;
        int i7 = bVar.f8258y;
        bVar3.f8258y = i7 == -2 ? 255 : i7;
        int i8 = bVar.f8230A;
        if (i8 != -2) {
            bVar3.f8230A = i8;
        } else if (typedArrayG.hasValue(23)) {
            this.f8261b.f8230A = typedArrayG.getInt(23, 0);
        } else {
            this.f8261b.f8230A = -1;
        }
        String str = bVar.f8259z;
        if (str != null) {
            this.f8261b.f8259z = str;
        } else if (typedArrayG.hasValue(7)) {
            this.f8261b.f8259z = typedArrayG.getString(7);
        }
        b bVar4 = this.f8261b;
        bVar4.f8234E = bVar.f8234E;
        CharSequence charSequence = bVar.f8235F;
        bVar4.f8235F = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar5 = this.f8261b;
        int i9 = bVar.f8236G;
        bVar5.f8236G = i9 == 0 ? R.plurals.mtrl_badge_content_description : i9;
        int i10 = bVar.f8237H;
        bVar5.f8237H = i10 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i10;
        Boolean bool = bVar.f8239J;
        bVar5.f8239J = Boolean.valueOf(bool == null || bool.booleanValue());
        b bVar6 = this.f8261b;
        int i11 = bVar.f8231B;
        bVar6.f8231B = i11 == -2 ? typedArrayG.getInt(21, -2) : i11;
        b bVar7 = this.f8261b;
        int i12 = bVar.f8232C;
        bVar7.f8232C = i12 == -2 ? typedArrayG.getInt(22, -2) : i12;
        b bVar8 = this.f8261b;
        Integer num = bVar.f8254u;
        bVar8.f8254u = Integer.valueOf(num == null ? typedArrayG.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        b bVar9 = this.f8261b;
        Integer num2 = bVar.f8255v;
        bVar9.f8255v = Integer.valueOf(num2 == null ? typedArrayG.getResourceId(6, 0) : num2.intValue());
        b bVar10 = this.f8261b;
        Integer num3 = bVar.f8256w;
        bVar10.f8256w = Integer.valueOf(num3 == null ? typedArrayG.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        b bVar11 = this.f8261b;
        Integer num4 = bVar.f8257x;
        bVar11.f8257x = Integer.valueOf(num4 == null ? typedArrayG.getResourceId(16, 0) : num4.intValue());
        b bVar12 = this.f8261b;
        Integer num5 = bVar.f8251r;
        bVar12.f8251r = Integer.valueOf(num5 == null ? I1.Z(context, typedArrayG, 1).getDefaultColor() : num5.intValue());
        b bVar13 = this.f8261b;
        Integer num6 = bVar.f8253t;
        bVar13.f8253t = Integer.valueOf(num6 == null ? typedArrayG.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = bVar.f8252s;
        if (num7 != null) {
            this.f8261b.f8252s = num7;
        } else if (typedArrayG.hasValue(9)) {
            this.f8261b.f8252s = Integer.valueOf(I1.Z(context, typedArrayG, 9).getDefaultColor());
        } else {
            int iIntValue = this.f8261b.f8253t.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, V3.a.f7971D);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListZ = I1.Z(context, typedArrayObtainStyledAttributes, 3);
            I1.Z(context, typedArrayObtainStyledAttributes, 4);
            I1.Z(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i13 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i13, 0);
            typedArrayObtainStyledAttributes.getString(i13);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            I1.Z(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, V3.a.f7991t);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f8261b.f8252s = Integer.valueOf(colorStateListZ.getDefaultColor());
        }
        b bVar14 = this.f8261b;
        Integer num8 = bVar.f8238I;
        bVar14.f8238I = Integer.valueOf(num8 == null ? typedArrayG.getInt(2, 8388661) : num8.intValue());
        b bVar15 = this.f8261b;
        Integer num9 = bVar.f8240K;
        bVar15.f8240K = Integer.valueOf(num9 == null ? typedArrayG.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        b bVar16 = this.f8261b;
        Integer num10 = bVar.f8241L;
        bVar16.f8241L = Integer.valueOf(num10 == null ? typedArrayG.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        b bVar17 = this.f8261b;
        Integer num11 = bVar.f8242M;
        bVar17.f8242M = Integer.valueOf(num11 == null ? typedArrayG.getDimensionPixelOffset(18, 0) : num11.intValue());
        b bVar18 = this.f8261b;
        Integer num12 = bVar.f8243N;
        bVar18.f8243N = Integer.valueOf(num12 == null ? typedArrayG.getDimensionPixelOffset(25, 0) : num12.intValue());
        b bVar19 = this.f8261b;
        Integer num13 = bVar.f8244O;
        bVar19.f8244O = Integer.valueOf(num13 == null ? typedArrayG.getDimensionPixelOffset(19, bVar19.f8242M.intValue()) : num13.intValue());
        b bVar20 = this.f8261b;
        Integer num14 = bVar.f8245P;
        bVar20.f8245P = Integer.valueOf(num14 == null ? typedArrayG.getDimensionPixelOffset(26, bVar20.f8243N.intValue()) : num14.intValue());
        b bVar21 = this.f8261b;
        Integer num15 = bVar.f8248S;
        bVar21.f8248S = Integer.valueOf(num15 == null ? typedArrayG.getDimensionPixelOffset(20, 0) : num15.intValue());
        b bVar22 = this.f8261b;
        Integer num16 = bVar.f8246Q;
        bVar22.f8246Q = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        b bVar23 = this.f8261b;
        Integer num17 = bVar.f8247R;
        bVar23.f8247R = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        b bVar24 = this.f8261b;
        Boolean bool2 = bVar.f8249T;
        bVar24.f8249T = Boolean.valueOf(bool2 == null ? typedArrayG.getBoolean(0, false) : bool2.booleanValue());
        typedArrayG.recycle();
        Locale locale = bVar.f8233D;
        if (locale == null) {
            this.f8261b.f8233D = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f8261b.f8233D = locale;
        }
        this.f8260a = bVar;
    }
}
