.class public abstract Ln4/e;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Ll/z;


# static fields
.field public static final V:[I

.field public static final W:[I


# instance fields
.field public A:Landroid/content/res/ColorStateList;

.field public final B:Landroid/content/res/ColorStateList;

.field public C:I

.field public D:I

.field public E:Z

.field public F:Landroid/graphics/drawable/Drawable;

.field public G:Landroid/content/res/ColorStateList;

.field public H:I

.field public final I:Landroid/util/SparseArray;

.field public J:I

.field public K:I

.field public L:I

.field public M:Z

.field public N:I

.field public O:I

.field public P:I

.field public Q:Ls4/k;

.field public R:Z

.field public S:Landroid/content/res/ColorStateList;

.field public T:Ln4/g;

.field public U:Ll/l;

.field public final q:Lq2/a;

.field public final r:Lcom/google/android/material/datepicker/k;

.field public final s:Lv1/c;

.field public final t:Landroid/util/SparseArray;

.field public u:I

.field public v:[Ln4/c;

.field public w:I

.field public x:I

.field public y:Landroid/content/res/ColorStateList;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a0

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Ln4/e;->V:[I

    .line 9
    .line 10
    const v0, -0x101009e

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Ln4/e;->W:[I

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lv1/c;

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    invoke-direct {p1, v0}, Lv1/c;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ln4/e;->s:Lv1/c;

    .line 11
    .line 12
    new-instance p1, Landroid/util/SparseArray;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Landroid/util/SparseArray;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Ln4/e;->t:Landroid/util/SparseArray;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput p1, p0, Ln4/e;->w:I

    .line 21
    .line 22
    iput p1, p0, Ln4/e;->x:I

    .line 23
    .line 24
    new-instance v1, Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Landroid/util/SparseArray;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Ln4/e;->I:Landroid/util/SparseArray;

    .line 30
    .line 31
    const/4 v0, -0x1

    .line 32
    iput v0, p0, Ln4/e;->J:I

    .line 33
    .line 34
    iput v0, p0, Ln4/e;->K:I

    .line 35
    .line 36
    iput v0, p0, Ln4/e;->L:I

    .line 37
    .line 38
    iput-boolean p1, p0, Ln4/e;->R:Z

    .line 39
    .line 40
    invoke-virtual {p0}, Ln4/e;->c()Landroid/content/res/ColorStateList;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Ln4/e;->B:Landroid/content/res/ColorStateList;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    iput-object p1, p0, Ln4/e;->q:Lq2/a;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance v0, Lq2/a;

    .line 57
    .line 58
    invoke-direct {v0}, Lq2/a;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Ln4/e;->q:Lq2/a;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Lq2/a;->L(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const v2, 0x7f0a0029

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const v2, 0x7f03036d

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v2, v1}, LC3/a;->M(Landroid/content/Context;II)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    int-to-long v1, p1

    .line 89
    invoke-virtual {v0, v1, v2}, Lq2/a;->J(J)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const v1, 0x7f03037a

    .line 97
    .line 98
    .line 99
    sget-object v2, LW3/a;->b:LL1/a;

    .line 100
    .line 101
    invoke-static {p1, v1, v2}, LC3/a;->N(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {v0, p1}, Lq2/a;->K(Landroid/animation/TimeInterpolator;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, Ll4/k;

    .line 109
    .line 110
    invoke-direct {p1}, Lq2/n;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p1}, Lq2/a;->I(Lq2/n;)V

    .line 114
    .line 115
    .line 116
    :goto_0
    new-instance p1, Lcom/google/android/material/datepicker/k;

    .line 117
    .line 118
    move-object v0, p0

    .line 119
    check-cast v0, Lb4/b;

    .line 120
    .line 121
    const/4 v1, 0x4

    .line 122
    invoke-direct {p1, v1, v0}, Lcom/google/android/material/datepicker/k;-><init>(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iput-object p1, p0, Ln4/e;->r:Lcom/google/android/material/datepicker/k;

    .line 126
    .line 127
    sget-object p1, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 128
    .line 129
    const/4 p1, 0x1

    .line 130
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method private getNewItem()Ln4/c;
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/e;->s:Lv1/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv1/c;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ln4/c;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lb4/a;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Ln4/c;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_0
    return-object v0
.end method

.method private setBadgeIfNeeded(Ln4/c;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Ln4/e;->I:Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, LY3/a;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ln4/c;->setBadge(LY3/a;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ll/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln4/e;->U:Ll/l;

    .line 2
    .line 3
    return-void
.end method

.method public final b()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    array-length v3, v0

    .line 11
    move v4, v2

    .line 12
    :goto_0
    if-ge v4, v3, :cond_1

    .line 13
    .line 14
    aget-object v5, v0, v4

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    iget-object v6, p0, Ln4/e;->s:Lv1/c;

    .line 19
    .line 20
    invoke-virtual {v6, v5}, Lv1/c;->c(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    iget-object v6, v5, Ln4/c;->D:Landroid/widget/ImageView;

    .line 24
    .line 25
    invoke-virtual {v5, v6}, Ln4/c;->i(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, v5, Ln4/c;->J:Ll/n;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    iput v6, v5, Ln4/c;->P:F

    .line 32
    .line 33
    iput-boolean v2, v5, Ln4/c;->q:Z

    .line 34
    .line 35
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v0, p0, Ln4/e;->U:Ll/l;

    .line 39
    .line 40
    iget-object v0, v0, Ll/l;->f:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    iput v2, p0, Ln4/e;->w:I

    .line 49
    .line 50
    iput v2, p0, Ln4/e;->x:I

    .line 51
    .line 52
    iput-object v1, p0, Ln4/e;->v:[Ln4/c;

    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    new-instance v0, Ljava/util/HashSet;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 58
    .line 59
    .line 60
    move v1, v2

    .line 61
    :goto_1
    iget-object v3, p0, Ln4/e;->U:Ll/l;

    .line 62
    .line 63
    iget-object v3, v3, Ll/l;->f:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-ge v1, v3, :cond_3

    .line 70
    .line 71
    iget-object v3, p0, Ln4/e;->U:Ll/l;

    .line 72
    .line 73
    invoke-virtual {v3, v1}, Ll/l;->getItem(I)Landroid/view/MenuItem;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    move v1, v2

    .line 92
    :goto_2
    iget-object v3, p0, Ln4/e;->I:Landroid/util/SparseArray;

    .line 93
    .line 94
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-ge v1, v4, :cond_5

    .line 99
    .line 100
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-nez v5, :cond_4

    .line 113
    .line 114
    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->delete(I)V

    .line 115
    .line 116
    .line 117
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_5
    iget-object v0, p0, Ln4/e;->U:Ll/l;

    .line 121
    .line 122
    iget-object v0, v0, Ll/l;->f:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    new-array v0, v0, [Ln4/c;

    .line 129
    .line 130
    iput-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 131
    .line 132
    iget v0, p0, Ln4/e;->u:I

    .line 133
    .line 134
    iget-object v1, p0, Ln4/e;->U:Ll/l;

    .line 135
    .line 136
    invoke-virtual {v1}, Ll/l;->l()Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    const/4 v3, -0x1

    .line 145
    const/4 v4, 0x1

    .line 146
    if-ne v0, v3, :cond_6

    .line 147
    .line 148
    const/4 v0, 0x3

    .line 149
    if-le v1, v0, :cond_7

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_6
    if-nez v0, :cond_7

    .line 153
    .line 154
    :goto_3
    move v0, v4

    .line 155
    goto :goto_4

    .line 156
    :cond_7
    move v0, v2

    .line 157
    :goto_4
    move v1, v2

    .line 158
    :goto_5
    iget-object v5, p0, Ln4/e;->U:Ll/l;

    .line 159
    .line 160
    iget-object v5, v5, Ll/l;->f:Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-ge v1, v5, :cond_d

    .line 167
    .line 168
    iget-object v5, p0, Ln4/e;->T:Ln4/g;

    .line 169
    .line 170
    iput-boolean v4, v5, Ln4/g;->r:Z

    .line 171
    .line 172
    iget-object v5, p0, Ln4/e;->U:Ll/l;

    .line 173
    .line 174
    invoke-virtual {v5, v1}, Ll/l;->getItem(I)Landroid/view/MenuItem;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-interface {v5, v4}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    .line 179
    .line 180
    .line 181
    iget-object v5, p0, Ln4/e;->T:Ln4/g;

    .line 182
    .line 183
    iput-boolean v2, v5, Ln4/g;->r:Z

    .line 184
    .line 185
    invoke-direct {p0}, Ln4/e;->getNewItem()Ln4/c;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    iget-object v6, p0, Ln4/e;->v:[Ln4/c;

    .line 190
    .line 191
    aput-object v5, v6, v1

    .line 192
    .line 193
    iget-object v6, p0, Ln4/e;->y:Landroid/content/res/ColorStateList;

    .line 194
    .line 195
    invoke-virtual {v5, v6}, Ln4/c;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 196
    .line 197
    .line 198
    iget v6, p0, Ln4/e;->z:I

    .line 199
    .line 200
    invoke-virtual {v5, v6}, Ln4/c;->setIconSize(I)V

    .line 201
    .line 202
    .line 203
    iget-object v6, p0, Ln4/e;->B:Landroid/content/res/ColorStateList;

    .line 204
    .line 205
    invoke-virtual {v5, v6}, Ln4/c;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 206
    .line 207
    .line 208
    iget v6, p0, Ln4/e;->C:I

    .line 209
    .line 210
    invoke-virtual {v5, v6}, Ln4/c;->setTextAppearanceInactive(I)V

    .line 211
    .line 212
    .line 213
    iget v6, p0, Ln4/e;->D:I

    .line 214
    .line 215
    invoke-virtual {v5, v6}, Ln4/c;->setTextAppearanceActive(I)V

    .line 216
    .line 217
    .line 218
    iget-boolean v6, p0, Ln4/e;->E:Z

    .line 219
    .line 220
    invoke-virtual {v5, v6}, Ln4/c;->setTextAppearanceActiveBoldEnabled(Z)V

    .line 221
    .line 222
    .line 223
    iget-object v6, p0, Ln4/e;->A:Landroid/content/res/ColorStateList;

    .line 224
    .line 225
    invoke-virtual {v5, v6}, Ln4/c;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 226
    .line 227
    .line 228
    iget v6, p0, Ln4/e;->J:I

    .line 229
    .line 230
    if-eq v6, v3, :cond_8

    .line 231
    .line 232
    invoke-virtual {v5, v6}, Ln4/c;->setItemPaddingTop(I)V

    .line 233
    .line 234
    .line 235
    :cond_8
    iget v6, p0, Ln4/e;->K:I

    .line 236
    .line 237
    if-eq v6, v3, :cond_9

    .line 238
    .line 239
    invoke-virtual {v5, v6}, Ln4/c;->setItemPaddingBottom(I)V

    .line 240
    .line 241
    .line 242
    :cond_9
    iget v6, p0, Ln4/e;->L:I

    .line 243
    .line 244
    if-eq v6, v3, :cond_a

    .line 245
    .line 246
    invoke-virtual {v5, v6}, Ln4/c;->setActiveIndicatorLabelPadding(I)V

    .line 247
    .line 248
    .line 249
    :cond_a
    iget v6, p0, Ln4/e;->N:I

    .line 250
    .line 251
    invoke-virtual {v5, v6}, Ln4/c;->setActiveIndicatorWidth(I)V

    .line 252
    .line 253
    .line 254
    iget v6, p0, Ln4/e;->O:I

    .line 255
    .line 256
    invoke-virtual {v5, v6}, Ln4/c;->setActiveIndicatorHeight(I)V

    .line 257
    .line 258
    .line 259
    iget v6, p0, Ln4/e;->P:I

    .line 260
    .line 261
    invoke-virtual {v5, v6}, Ln4/c;->setActiveIndicatorMarginHorizontal(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Ln4/e;->d()Ls4/g;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    invoke-virtual {v5, v6}, Ln4/c;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 269
    .line 270
    .line 271
    iget-boolean v6, p0, Ln4/e;->R:Z

    .line 272
    .line 273
    invoke-virtual {v5, v6}, Ln4/c;->setActiveIndicatorResizeable(Z)V

    .line 274
    .line 275
    .line 276
    iget-boolean v6, p0, Ln4/e;->M:Z

    .line 277
    .line 278
    invoke-virtual {v5, v6}, Ln4/c;->setActiveIndicatorEnabled(Z)V

    .line 279
    .line 280
    .line 281
    iget-object v6, p0, Ln4/e;->F:Landroid/graphics/drawable/Drawable;

    .line 282
    .line 283
    if-eqz v6, :cond_b

    .line 284
    .line 285
    invoke-virtual {v5, v6}, Ln4/c;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 286
    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_b
    iget v6, p0, Ln4/e;->H:I

    .line 290
    .line 291
    invoke-virtual {v5, v6}, Ln4/c;->setItemBackground(I)V

    .line 292
    .line 293
    .line 294
    :goto_6
    iget-object v6, p0, Ln4/e;->G:Landroid/content/res/ColorStateList;

    .line 295
    .line 296
    invoke-virtual {v5, v6}, Ln4/c;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v5, v0}, Ln4/c;->setShifting(Z)V

    .line 300
    .line 301
    .line 302
    iget v6, p0, Ln4/e;->u:I

    .line 303
    .line 304
    invoke-virtual {v5, v6}, Ln4/c;->setLabelVisibilityMode(I)V

    .line 305
    .line 306
    .line 307
    iget-object v6, p0, Ln4/e;->U:Ll/l;

    .line 308
    .line 309
    invoke-virtual {v6, v1}, Ll/l;->getItem(I)Landroid/view/MenuItem;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    check-cast v6, Ll/n;

    .line 314
    .line 315
    invoke-virtual {v5, v6}, Ln4/c;->b(Ll/n;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5, v1}, Ln4/c;->setItemPosition(I)V

    .line 319
    .line 320
    .line 321
    iget v6, v6, Ll/n;->a:I

    .line 322
    .line 323
    iget-object v7, p0, Ln4/e;->t:Landroid/util/SparseArray;

    .line 324
    .line 325
    invoke-virtual {v7, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    check-cast v7, Landroid/view/View$OnTouchListener;

    .line 330
    .line 331
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 332
    .line 333
    .line 334
    iget-object v7, p0, Ln4/e;->r:Lcom/google/android/material/datepicker/k;

    .line 335
    .line 336
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 337
    .line 338
    .line 339
    iget v7, p0, Ln4/e;->w:I

    .line 340
    .line 341
    if-eqz v7, :cond_c

    .line 342
    .line 343
    if-ne v6, v7, :cond_c

    .line 344
    .line 345
    iput v1, p0, Ln4/e;->x:I

    .line 346
    .line 347
    :cond_c
    invoke-direct {p0, v5}, Ln4/e;->setBadgeIfNeeded(Ln4/c;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 351
    .line 352
    .line 353
    add-int/lit8 v1, v1, 0x1

    .line 354
    .line 355
    goto/16 :goto_5

    .line 356
    .line 357
    :cond_d
    iget-object v0, p0, Ln4/e;->U:Ll/l;

    .line 358
    .line 359
    iget-object v0, v0, Ll/l;->f:Ljava/util/ArrayList;

    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    sub-int/2addr v0, v4

    .line 366
    iget v1, p0, Ln4/e;->x:I

    .line 367
    .line 368
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    iput v0, p0, Ln4/e;->x:I

    .line 373
    .line 374
    iget-object v1, p0, Ln4/e;->U:Ll/l;

    .line 375
    .line 376
    invoke-virtual {v1, v0}, Ll/l;->getItem(I)Landroid/view/MenuItem;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-interface {v0, v4}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 381
    .line 382
    .line 383
    return-void
.end method

.method public final c()Landroid/content/res/ColorStateList;
    .locals 7

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x1010038

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    .line 30
    .line 31
    invoke-static {v1, v2}, Lk1/c;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const v4, 0x7f030117

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v4, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    :goto_0
    const/4 v0, 0x0

    .line 53
    return-object v0

    .line 54
    :cond_1
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    new-instance v3, Landroid/content/res/ColorStateList;

    .line 61
    .line 62
    sget-object v4, Ln4/e;->V:[I

    .line 63
    .line 64
    sget-object v5, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    .line 65
    .line 66
    sget-object v6, Ln4/e;->W:[I

    .line 67
    .line 68
    filled-new-array {v6, v4, v5}, [[I

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v1, v6, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    filled-new-array {v1, v0, v2}, [I

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-direct {v3, v4, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 81
    .line 82
    .line 83
    return-object v3
.end method

.method public final d()Ls4/g;
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/e;->Q:Ls4/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ln4/e;->S:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ls4/g;

    .line 10
    .line 11
    iget-object v1, p0, Ln4/e;->Q:Ls4/k;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ls4/g;-><init>(Ls4/k;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ln4/e;->S:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ls4/g;->k(Landroid/content/res/ColorStateList;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return-object v0
.end method

.method public getActiveIndicatorLabelPadding()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/e;->L:I

    .line 2
    .line 3
    return v0
.end method

.method public getBadgeDrawables()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "LY3/a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ln4/e;->I:Landroid/util/SparseArray;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/e;->y:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/e;->S:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemActiveIndicatorEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ln4/e;->M:Z

    .line 2
    .line 3
    return v0
.end method

.method public getItemActiveIndicatorHeight()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/e;->O:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemActiveIndicatorMarginHorizontal()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/e;->P:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemActiveIndicatorShapeAppearance()Ls4/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/e;->Q:Ls4/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemActiveIndicatorWidth()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/e;->N:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget-object v0, v0, v1

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, Ln4/e;->F:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    return-object v0
.end method

.method public getItemBackgroundRes()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Ln4/e;->H:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemIconSize()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/e;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemPaddingBottom()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/e;->K:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemPaddingTop()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/e;->J:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemRippleColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/e;->G:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemTextAppearanceActive()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/e;->D:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemTextAppearanceInactive()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/e;->C:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/e;->A:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLabelVisibilityMode()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/e;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public getMenu()Ll/l;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/e;->U:Ll/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSelectedItemId()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/e;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public getSelectedItemPosition()I
    .locals 1

    .line 1
    iget v0, p0, Ln4/e;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public getWindowAnimations()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ln4/e;->U:Ll/l;

    .line 5
    .line 6
    invoke-virtual {v0}, Ll/l;->l()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-static {v1, v0, v1}, LI2/l;->a(III)LI2/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, LI2/l;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public setActiveIndicatorLabelPadding(I)V
    .locals 4

    .line 1
    iput p1, p0, Ln4/e;->L:I

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setActiveIndicatorLabelPadding(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ln4/e;->y:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ln4/e;->S:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object p1, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    invoke-virtual {p0}, Ln4/e;->d()Ls4/g;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v2, v3}, Ln4/c;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorEnabled(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Ln4/e;->M:Z

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setActiveIndicatorEnabled(Z)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorHeight(I)V
    .locals 4

    .line 1
    iput p1, p0, Ln4/e;->O:I

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setActiveIndicatorHeight(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorMarginHorizontal(I)V
    .locals 4

    .line 1
    iput p1, p0, Ln4/e;->P:I

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setActiveIndicatorMarginHorizontal(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorResizeable(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Ln4/e;->R:Z

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setActiveIndicatorResizeable(Z)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorShapeAppearance(Ls4/k;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ln4/e;->Q:Ls4/k;

    .line 2
    .line 3
    iget-object p1, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    invoke-virtual {p0}, Ln4/e;->d()Ls4/g;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v2, v3}, Ln4/c;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorWidth(I)V
    .locals 4

    .line 1
    iput p1, p0, Ln4/e;->N:I

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setActiveIndicatorWidth(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ln4/e;->F:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemBackgroundRes(I)V
    .locals 4

    .line 1
    iput p1, p0, Ln4/e;->H:I

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setItemBackground(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 4

    .line 1
    iput p1, p0, Ln4/e;->z:I

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setIconSize(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemPaddingBottom(I)V
    .locals 4

    .line 1
    iput p1, p0, Ln4/e;->K:I

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setItemPaddingBottom(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemPaddingTop(I)V
    .locals 4

    .line 1
    iput p1, p0, Ln4/e;->J:I

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setItemPaddingTop(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ln4/e;->G:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemTextAppearanceActive(I)V
    .locals 5

    .line 1
    iput p1, p0, Ln4/e;->D:I

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setTextAppearanceActive(I)V

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, Ln4/e;->A:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ln4/c;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-void
.end method

.method public setItemTextAppearanceActiveBoldEnabled(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Ln4/e;->E:Z

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setTextAppearanceActiveBoldEnabled(Z)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setItemTextAppearanceInactive(I)V
    .locals 5

    .line 1
    iput p1, p0, Ln4/e;->C:I

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setTextAppearanceInactive(I)V

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, Ln4/e;->A:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ln4/c;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 1
    iput-object p1, p0, Ln4/e;->A:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object v0, p0, Ln4/e;->v:[Ln4/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ln4/c;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Ln4/e;->u:I

    .line 2
    .line 3
    return-void
.end method

.method public setPresenter(Ln4/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln4/e;->T:Ln4/g;

    .line 2
    .line 3
    return-void
.end method
