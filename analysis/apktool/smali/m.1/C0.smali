.class public Lm/C0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/B;


# static fields
.field public static final Q:Ljava/lang/reflect/Method;

.field public static final R:Ljava/lang/reflect/Method;


# instance fields
.field public A:Z

.field public B:I

.field public final C:I

.field public D:Lm/z0;

.field public E:Landroid/view/View;

.field public F:Landroid/widget/AdapterView$OnItemClickListener;

.field public G:Landroid/widget/AdapterView$OnItemSelectedListener;

.field public final H:Lm/y0;

.field public final I:Lm/B0;

.field public final J:Lm/A0;

.field public final K:Lm/y0;

.field public final L:Landroid/os/Handler;

.field public final M:Landroid/graphics/Rect;

.field public N:Landroid/graphics/Rect;

.field public O:Z

.field public final P:Lm/y;

.field public final q:Landroid/content/Context;

.field public r:Landroid/widget/ListAdapter;

.field public s:Lm/p0;

.field public final t:I

.field public u:I

.field public v:I

.field public w:I

.field public final x:I

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "ListPopupWindow"

    .line 2
    .line 3
    const-class v1, Landroid/widget/PopupWindow;

    .line 4
    .line 5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v3, 0x1c

    .line 8
    .line 9
    if-gt v2, v3, :cond_0

    .line 10
    .line 11
    :try_start_0
    const-string v2, "setClipToScreenEnabled"

    .line 12
    .line 13
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sput-object v2, Lm/C0;->Q:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    const-string v2, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."

    .line 27
    .line 28
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :goto_0
    :try_start_1
    const-string v2, "setEpicenterBounds"

    .line 32
    .line 33
    const-class v3, Landroid/graphics/Rect;

    .line 34
    .line 35
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lm/C0;->R:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catch_1
    const-string v1, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."

    .line 47
    .line 48
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :cond_0
    :goto_1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p4, -0x2

    .line 5
    iput p4, p0, Lm/C0;->t:I

    .line 6
    .line 7
    iput p4, p0, Lm/C0;->u:I

    .line 8
    .line 9
    const/16 p4, 0x3ea

    .line 10
    .line 11
    iput p4, p0, Lm/C0;->x:I

    .line 12
    .line 13
    const/4 p4, 0x0

    .line 14
    iput p4, p0, Lm/C0;->B:I

    .line 15
    .line 16
    const v0, 0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v0, p0, Lm/C0;->C:I

    .line 20
    .line 21
    new-instance v0, Lm/y0;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {v0, p0, v1}, Lm/y0;-><init>(Lm/C0;I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lm/C0;->H:Lm/y0;

    .line 28
    .line 29
    new-instance v0, Lm/B0;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lm/B0;-><init>(Lm/C0;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lm/C0;->I:Lm/B0;

    .line 35
    .line 36
    new-instance v0, Lm/A0;

    .line 37
    .line 38
    invoke-direct {v0, p0}, Lm/A0;-><init>(Lm/C0;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lm/C0;->J:Lm/A0;

    .line 42
    .line 43
    new-instance v0, Lm/y0;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v0, p0, v1}, Lm/y0;-><init>(Lm/C0;I)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lm/C0;->K:Lm/y0;

    .line 50
    .line 51
    new-instance v0, Landroid/graphics/Rect;

    .line 52
    .line 53
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lm/C0;->M:Landroid/graphics/Rect;

    .line 57
    .line 58
    iput-object p1, p0, Lm/C0;->q:Landroid/content/Context;

    .line 59
    .line 60
    new-instance v0, Landroid/os/Handler;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Lm/C0;->L:Landroid/os/Handler;

    .line 70
    .line 71
    sget-object v0, Lg/a;->o:[I

    .line 72
    .line 73
    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0, p4, p4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    iput v1, p0, Lm/C0;->v:I

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    invoke-virtual {v0, v1, p4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    iput v2, p0, Lm/C0;->w:I

    .line 89
    .line 90
    if-eqz v2, :cond_0

    .line 91
    .line 92
    iput-boolean v1, p0, Lm/C0;->y:Z

    .line 93
    .line 94
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 95
    .line 96
    .line 97
    new-instance v0, Lm/y;

    .line 98
    .line 99
    invoke-direct {v0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 100
    .line 101
    .line 102
    sget-object v2, Lg/a;->s:[I

    .line 103
    .line 104
    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    const/4 p3, 0x2

    .line 109
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_1

    .line 114
    .line 115
    invoke-virtual {p2, p3, p4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    invoke-virtual {v0, p3}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V

    .line 120
    .line 121
    .line 122
    :cond_1
    invoke-virtual {p2, p4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    if-eqz p3, :cond_2

    .line 127
    .line 128
    invoke-virtual {p2, p4, p4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 129
    .line 130
    .line 131
    move-result p3

    .line 132
    if-eqz p3, :cond_2

    .line 133
    .line 134
    invoke-static {p1, p3}, La/a;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    goto :goto_0

    .line 139
    :cond_2
    invoke-virtual {p2, p4}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 147
    .line 148
    .line 149
    iput-object v0, p0, Lm/C0;->P:Lm/y;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 152
    .line 153
    .line 154
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm/C0;->P:Lm/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lm/C0;->v:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()V
    .locals 13

    .line 1
    iget-object v0, p0, Lm/C0;->s:Lm/p0;

    .line 2
    .line 3
    iget-object v1, p0, Lm/C0;->q:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lm/C0;->P:Lm/y;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-boolean v0, p0, Lm/C0;->O:Z

    .line 11
    .line 12
    xor-int/2addr v0, v2

    .line 13
    invoke-virtual {p0, v1, v0}, Lm/C0;->q(Landroid/content/Context;Z)Lm/p0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lm/C0;->s:Lm/p0;

    .line 18
    .line 19
    iget-object v4, p0, Lm/C0;->r:Landroid/widget/ListAdapter;

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lm/C0;->s:Lm/p0;

    .line 25
    .line 26
    iget-object v4, p0, Lm/C0;->F:Landroid/widget/AdapterView$OnItemClickListener;

    .line 27
    .line 28
    invoke-virtual {v0, v4}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lm/C0;->s:Lm/p0;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lm/C0;->s:Lm/p0;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lm/C0;->s:Lm/p0;

    .line 42
    .line 43
    new-instance v4, Lm/v0;

    .line 44
    .line 45
    invoke-direct {v4, p0}, Lm/v0;-><init>(Lm/C0;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v4}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lm/C0;->s:Lm/p0;

    .line 52
    .line 53
    iget-object v4, p0, Lm/C0;->J:Lm/A0;

    .line 54
    .line 55
    invoke-virtual {v0, v4}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lm/C0;->G:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 59
    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    iget-object v4, p0, Lm/C0;->s:Lm/p0;

    .line 63
    .line 64
    invoke-virtual {v4, v0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    iget-object v0, p0, Lm/C0;->s:Lm/p0;

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Landroid/view/ViewGroup;

    .line 78
    .line 79
    :goto_0
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v4, p0, Lm/C0;->M:Landroid/graphics/Rect;

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 89
    .line 90
    .line 91
    iget v0, v4, Landroid/graphics/Rect;->top:I

    .line 92
    .line 93
    iget v6, v4, Landroid/graphics/Rect;->bottom:I

    .line 94
    .line 95
    add-int/2addr v6, v0

    .line 96
    iget-boolean v7, p0, Lm/C0;->y:Z

    .line 97
    .line 98
    if-nez v7, :cond_3

    .line 99
    .line 100
    neg-int v0, v0

    .line 101
    iput v0, p0, Lm/C0;->w:I

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    .line 105
    .line 106
    .line 107
    move v6, v5

    .line 108
    :cond_3
    :goto_1
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/4 v7, 0x2

    .line 113
    if-ne v0, v7, :cond_4

    .line 114
    .line 115
    move v0, v2

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move v0, v5

    .line 118
    :goto_2
    iget-object v8, p0, Lm/C0;->E:Landroid/view/View;

    .line 119
    .line 120
    iget v9, p0, Lm/C0;->w:I

    .line 121
    .line 122
    invoke-static {v3, v8, v9, v0}, Lm/w0;->a(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    iget v8, p0, Lm/C0;->t:I

    .line 127
    .line 128
    const/4 v9, -0x2

    .line 129
    const/4 v10, -0x1

    .line 130
    if-ne v8, v10, :cond_5

    .line 131
    .line 132
    add-int/2addr v0, v6

    .line 133
    goto :goto_5

    .line 134
    :cond_5
    iget v11, p0, Lm/C0;->u:I

    .line 135
    .line 136
    if-eq v11, v9, :cond_7

    .line 137
    .line 138
    const/high16 v12, 0x40000000    # 2.0f

    .line 139
    .line 140
    if-eq v11, v10, :cond_6

    .line 141
    .line 142
    invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    goto :goto_3

    .line 147
    :cond_6
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 156
    .line 157
    iget v11, v4, Landroid/graphics/Rect;->left:I

    .line 158
    .line 159
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 160
    .line 161
    add-int/2addr v11, v4

    .line 162
    sub-int/2addr v1, v11

    .line 163
    invoke-static {v1, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    goto :goto_3

    .line 168
    :cond_7
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 177
    .line 178
    iget v11, v4, Landroid/graphics/Rect;->left:I

    .line 179
    .line 180
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 181
    .line 182
    add-int/2addr v11, v4

    .line 183
    sub-int/2addr v1, v11

    .line 184
    const/high16 v4, -0x80000000

    .line 185
    .line 186
    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    :goto_3
    iget-object v4, p0, Lm/C0;->s:Lm/p0;

    .line 191
    .line 192
    invoke-virtual {v4, v1, v0}, Lm/p0;->a(II)I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-lez v0, :cond_8

    .line 197
    .line 198
    iget-object v1, p0, Lm/C0;->s:Lm/p0;

    .line 199
    .line 200
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    iget-object v4, p0, Lm/C0;->s:Lm/p0;

    .line 205
    .line 206
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    add-int/2addr v4, v1

    .line 211
    add-int/2addr v4, v6

    .line 212
    goto :goto_4

    .line 213
    :cond_8
    move v4, v5

    .line 214
    :goto_4
    add-int/2addr v0, v4

    .line 215
    :goto_5
    iget-object v1, p0, Lm/C0;->P:Lm/y;

    .line 216
    .line 217
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-ne v1, v7, :cond_9

    .line 222
    .line 223
    move v1, v2

    .line 224
    goto :goto_6

    .line 225
    :cond_9
    move v1, v5

    .line 226
    :goto_6
    iget v4, p0, Lm/C0;->x:I

    .line 227
    .line 228
    invoke-virtual {v3, v4}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_15

    .line 236
    .line 237
    iget-object v4, p0, Lm/C0;->E:Landroid/view/View;

    .line 238
    .line 239
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    if-nez v4, :cond_a

    .line 244
    .line 245
    goto/16 :goto_10

    .line 246
    .line 247
    :cond_a
    iget v4, p0, Lm/C0;->u:I

    .line 248
    .line 249
    if-ne v4, v10, :cond_b

    .line 250
    .line 251
    move v4, v10

    .line 252
    goto :goto_7

    .line 253
    :cond_b
    if-ne v4, v9, :cond_c

    .line 254
    .line 255
    iget-object v4, p0, Lm/C0;->E:Landroid/view/View;

    .line 256
    .line 257
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    :cond_c
    :goto_7
    if-ne v8, v10, :cond_11

    .line 262
    .line 263
    if-eqz v1, :cond_d

    .line 264
    .line 265
    move v8, v0

    .line 266
    goto :goto_8

    .line 267
    :cond_d
    move v8, v10

    .line 268
    :goto_8
    if-eqz v1, :cond_f

    .line 269
    .line 270
    iget v0, p0, Lm/C0;->u:I

    .line 271
    .line 272
    if-ne v0, v10, :cond_e

    .line 273
    .line 274
    move v0, v10

    .line 275
    goto :goto_9

    .line 276
    :cond_e
    move v0, v5

    .line 277
    :goto_9
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 281
    .line 282
    .line 283
    goto :goto_a

    .line 284
    :cond_f
    iget v0, p0, Lm/C0;->u:I

    .line 285
    .line 286
    if-ne v0, v10, :cond_10

    .line 287
    .line 288
    move v5, v10

    .line 289
    :cond_10
    invoke-virtual {v3, v5}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3, v10}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 293
    .line 294
    .line 295
    goto :goto_a

    .line 296
    :cond_11
    if-ne v8, v9, :cond_12

    .line 297
    .line 298
    move v8, v0

    .line 299
    :cond_12
    :goto_a
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 300
    .line 301
    .line 302
    move v0, v4

    .line 303
    iget-object v4, p0, Lm/C0;->E:Landroid/view/View;

    .line 304
    .line 305
    iget v5, p0, Lm/C0;->v:I

    .line 306
    .line 307
    iget v6, p0, Lm/C0;->w:I

    .line 308
    .line 309
    if-gez v0, :cond_13

    .line 310
    .line 311
    move v7, v10

    .line 312
    goto :goto_b

    .line 313
    :cond_13
    move v7, v0

    .line 314
    :goto_b
    if-gez v8, :cond_14

    .line 315
    .line 316
    move v8, v10

    .line 317
    :cond_14
    invoke-virtual/range {v3 .. v8}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :cond_15
    iget v1, p0, Lm/C0;->u:I

    .line 322
    .line 323
    if-ne v1, v10, :cond_16

    .line 324
    .line 325
    move v1, v10

    .line 326
    goto :goto_c

    .line 327
    :cond_16
    if-ne v1, v9, :cond_17

    .line 328
    .line 329
    iget-object v1, p0, Lm/C0;->E:Landroid/view/View;

    .line 330
    .line 331
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    :cond_17
    :goto_c
    if-ne v8, v10, :cond_18

    .line 336
    .line 337
    move v8, v10

    .line 338
    goto :goto_d

    .line 339
    :cond_18
    if-ne v8, v9, :cond_19

    .line 340
    .line 341
    move v8, v0

    .line 342
    :cond_19
    :goto_d
    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3, v8}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 346
    .line 347
    .line 348
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 349
    .line 350
    const-string v1, "ListPopupWindow"

    .line 351
    .line 352
    const/16 v4, 0x1c

    .line 353
    .line 354
    if-gt v0, v4, :cond_1a

    .line 355
    .line 356
    sget-object v0, Lm/C0;->Q:Ljava/lang/reflect/Method;

    .line 357
    .line 358
    if-eqz v0, :cond_1b

    .line 359
    .line 360
    :try_start_0
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 361
    .line 362
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    invoke-virtual {v0, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 367
    .line 368
    .line 369
    goto :goto_e

    .line 370
    :catch_0
    const-string v0, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."

    .line 371
    .line 372
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 373
    .line 374
    .line 375
    goto :goto_e

    .line 376
    :cond_1a
    invoke-static {v3, v2}, Lm/x0;->b(Landroid/widget/PopupWindow;Z)V

    .line 377
    .line 378
    .line 379
    :cond_1b
    :goto_e
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 380
    .line 381
    .line 382
    iget-object v0, p0, Lm/C0;->I:Lm/B0;

    .line 383
    .line 384
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 385
    .line 386
    .line 387
    iget-boolean v0, p0, Lm/C0;->A:Z

    .line 388
    .line 389
    if-eqz v0, :cond_1c

    .line 390
    .line 391
    iget-boolean v0, p0, Lm/C0;->z:Z

    .line 392
    .line 393
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V

    .line 394
    .line 395
    .line 396
    :cond_1c
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 397
    .line 398
    if-gt v0, v4, :cond_1d

    .line 399
    .line 400
    sget-object v0, Lm/C0;->R:Ljava/lang/reflect/Method;

    .line 401
    .line 402
    if-eqz v0, :cond_1e

    .line 403
    .line 404
    :try_start_1
    iget-object v4, p0, Lm/C0;->N:Landroid/graphics/Rect;

    .line 405
    .line 406
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 411
    .line 412
    .line 413
    goto :goto_f

    .line 414
    :catch_1
    move-exception v0

    .line 415
    const-string v4, "Could not invoke setEpicenterBounds on PopupWindow"

    .line 416
    .line 417
    invoke-static {v1, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 418
    .line 419
    .line 420
    goto :goto_f

    .line 421
    :cond_1d
    iget-object v0, p0, Lm/C0;->N:Landroid/graphics/Rect;

    .line 422
    .line 423
    invoke-static {v3, v0}, Lm/x0;->a(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    .line 424
    .line 425
    .line 426
    :cond_1e
    :goto_f
    iget-object v0, p0, Lm/C0;->E:Landroid/view/View;

    .line 427
    .line 428
    iget v1, p0, Lm/C0;->v:I

    .line 429
    .line 430
    iget v4, p0, Lm/C0;->w:I

    .line 431
    .line 432
    iget v5, p0, Lm/C0;->B:I

    .line 433
    .line 434
    invoke-virtual {v3, v0, v1, v4, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 435
    .line 436
    .line 437
    iget-object v0, p0, Lm/C0;->s:Lm/p0;

    .line 438
    .line 439
    invoke-virtual {v0, v10}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 440
    .line 441
    .line 442
    iget-boolean v0, p0, Lm/C0;->O:Z

    .line 443
    .line 444
    if-eqz v0, :cond_1f

    .line 445
    .line 446
    iget-object v0, p0, Lm/C0;->s:Lm/p0;

    .line 447
    .line 448
    invoke-virtual {v0}, Lm/p0;->isInTouchMode()Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-eqz v0, :cond_20

    .line 453
    .line 454
    :cond_1f
    iget-object v0, p0, Lm/C0;->s:Lm/p0;

    .line 455
    .line 456
    if-eqz v0, :cond_20

    .line 457
    .line 458
    invoke-virtual {v0, v2}, Lm/p0;->setListSelectionHidden(Z)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 462
    .line 463
    .line 464
    :cond_20
    iget-boolean v0, p0, Lm/C0;->O:Z

    .line 465
    .line 466
    if-nez v0, :cond_21

    .line 467
    .line 468
    iget-object v0, p0, Lm/C0;->L:Landroid/os/Handler;

    .line 469
    .line 470
    iget-object v1, p0, Lm/C0;->K:Lm/y0;

    .line 471
    .line 472
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 473
    .line 474
    .line 475
    :cond_21
    :goto_10
    return-void
.end method

.method public final d()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/C0;->P:Lm/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm/C0;->P:Lm/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lm/C0;->s:Lm/p0;

    .line 11
    .line 12
    iget-object v0, p0, Lm/C0;->L:Landroid/os/Handler;

    .line 13
    .line 14
    iget-object v1, p0, Lm/C0;->H:Lm/y0;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final e()Lm/p0;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/C0;->s:Lm/p0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/C0;->P:Lm/y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final h(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm/C0;->w:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lm/C0;->y:Z

    .line 5
    .line 6
    return-void
.end method

.method public final j(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm/C0;->v:I

    .line 2
    .line 3
    return-void
.end method

.method public final m()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/C0;->y:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lm/C0;->w:I

    .line 8
    .line 9
    return v0
.end method

.method public p(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm/C0;->D:Lm/z0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm/z0;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lm/z0;-><init>(Lm/C0;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lm/C0;->D:Lm/z0;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v1, p0, Lm/C0;->r:Landroid/widget/ListAdapter;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    iput-object p1, p0, Lm/C0;->r:Landroid/widget/ListAdapter;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lm/C0;->D:Lm/z0;

    .line 25
    .line 26
    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    iget-object p1, p0, Lm/C0;->s:Lm/p0;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Lm/C0;->r:Landroid/widget/ListAdapter;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 36
    .line 37
    .line 38
    :cond_3
    return-void
.end method

.method public q(Landroid/content/Context;Z)Lm/p0;
    .locals 1

    .line 1
    new-instance v0, Lm/p0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lm/p0;-><init>(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final r(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm/C0;->P:Lm/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lm/C0;->M:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 12
    .line 13
    .line 14
    iget v0, v1, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    add-int/2addr v0, p1

    .line 20
    iput v0, p0, Lm/C0;->u:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iput p1, p0, Lm/C0;->u:I

    .line 24
    .line 25
    return-void
.end method
