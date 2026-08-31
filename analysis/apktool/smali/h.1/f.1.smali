.class public final Lh/f;
.super Lb/m;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface;
.implements Lh/i;


# instance fields
.field public t:Lh/y;

.field public final u:Lh/z;

.field public final v:Lh/e;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;I)V
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lh/f;->g(Landroid/content/Context;I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    const v1, 0x7f030183

    .line 7
    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    new-instance v2, Landroid/util/TypedValue;

    .line 12
    .line 13
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3, v1, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 21
    .line 22
    .line 23
    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, p2

    .line 27
    :goto_0
    invoke-direct {p0, p1, v2}, Lb/m;-><init>(Landroid/content/Context;I)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lh/z;

    .line 31
    .line 32
    invoke-direct {v2, p0}, Lh/z;-><init>(Lh/f;)V

    .line 33
    .line 34
    .line 35
    iput-object v2, p0, Lh/f;->u:Lh/z;

    .line 36
    .line 37
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez p2, :cond_1

    .line 42
    .line 43
    new-instance p2, Landroid/util/TypedValue;

    .line 44
    .line 45
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1, v1, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 53
    .line 54
    .line 55
    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    .line 56
    .line 57
    :cond_1
    move-object p1, v2

    .line 58
    check-cast p1, Lh/y;

    .line 59
    .line 60
    iput p2, p1, Lh/y;->k0:I

    .line 61
    .line 62
    invoke-virtual {v2}, Lh/l;->c()V

    .line 63
    .line 64
    .line 65
    new-instance p1, Lh/e;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {p1, p2, p0, v0}, Lh/e;-><init>(Landroid/content/Context;Lh/f;Landroid/view/Window;)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lh/f;->v:Lh/e;

    .line 79
    .line 80
    return-void
.end method

.method public static g(Landroid/content/Context;I)I
    .locals 2

    .line 1
    ushr-int/lit8 v0, p1, 0x18

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    new-instance p1, Landroid/util/TypedValue;

    .line 10
    .line 11
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const v0, 0x7f03002d

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 22
    .line 23
    .line 24
    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    .line 25
    .line 26
    return p0
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb/m;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/y;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh/y;->v()V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lh/y;->R:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v2, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v0, Lh/y;->C:Lh/t;

    .line 28
    .line 29
    iget-object p2, v0, Lh/y;->B:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Lh/t;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final dismiss()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lh/l;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lh/f;->u:Lh/z;

    .line 10
    .line 11
    invoke-static {v1, v0, p0, p1}, Lcom/google/android/gms/internal/measurement/n2;->n(Lw1/i;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final e()Lh/l;
    .locals 3

    .line 1
    iget-object v0, p0, Lh/f;->t:Lh/y;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lh/l;->q:Landroidx/room/F;

    .line 6
    .line 7
    new-instance v0, Lh/y;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2, p0, p0}, Lh/y;-><init>(Landroid/content/Context;Landroid/view/Window;Lh/i;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lh/f;->t:Lh/y;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lh/f;->t:Lh/y;

    .line 23
    .line 24
    return-object v0
.end method

.method public final f(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lh/l;->a()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lb/m;->onCreate(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lh/l;->c()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/y;

    .line 6
    .line 7
    invoke-virtual {v0}, Lh/y;->v()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lh/y;->B:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final h(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Lh/l;->l(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final i(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final invalidateOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/y;

    .line 6
    .line 7
    iget-object v1, v0, Lh/y;->E:Lh/I;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lh/y;->z()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lh/y;->E:Lh/I;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Lh/y;->A(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p1}, Lh/f;->f(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    move-object/from16 v0, p0

    .line 5
    .line 6
    iget-object v1, v0, Lh/f;->v:Lh/e;

    .line 7
    .line 8
    iget v2, v1, Lh/e;->x:I

    .line 9
    .line 10
    iget-object v3, v1, Lh/e;->b:Lh/f;

    .line 11
    .line 12
    invoke-virtual {v3, v2}, Lh/f;->setContentView(I)V

    .line 13
    .line 14
    .line 15
    iget-object v2, v1, Lh/e;->a:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v3, v1, Lh/e;->c:Landroid/view/Window;

    .line 18
    .line 19
    const v4, 0x7f090176

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const v5, 0x7f0901f7

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const v7, 0x7f09008e

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    const v9, 0x7f09006e

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    const v11, 0x7f090097

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Landroid/view/ViewGroup;

    .line 55
    .line 56
    const/high16 v11, 0x20000

    .line 57
    .line 58
    invoke-virtual {v3, v11, v11}, Landroid/view/Window;->setFlags(II)V

    .line 59
    .line 60
    .line 61
    const/16 v11, 0x8

    .line 62
    .line 63
    invoke-virtual {v4, v11}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    invoke-static {v5, v6}, Lh/e;->a(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-static {v7, v8}, Lh/e;->a(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-static {v9, v10}, Lh/e;->a(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    const v8, 0x7f09019a

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v8}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, Landroidx/core/widget/NestedScrollView;

    .line 98
    .line 99
    iput-object v8, v1, Lh/e;->p:Landroidx/core/widget/NestedScrollView;

    .line 100
    .line 101
    const/4 v9, 0x0

    .line 102
    invoke-virtual {v8, v9}, Landroid/view/View;->setFocusable(Z)V

    .line 103
    .line 104
    .line 105
    iget-object v8, v1, Lh/e;->p:Landroidx/core/widget/NestedScrollView;

    .line 106
    .line 107
    invoke-virtual {v8, v9}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    .line 108
    .line 109
    .line 110
    const v8, 0x102000b

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    check-cast v8, Landroid/widget/TextView;

    .line 118
    .line 119
    iput-object v8, v1, Lh/e;->t:Landroid/widget/TextView;

    .line 120
    .line 121
    const/4 v10, -0x1

    .line 122
    if-nez v8, :cond_0

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_0
    iget-object v12, v1, Lh/e;->e:Ljava/lang/String;

    .line 126
    .line 127
    if-eqz v12, :cond_1

    .line 128
    .line 129
    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_1
    invoke-virtual {v8, v11}, Landroid/view/View;->setVisibility(I)V

    .line 134
    .line 135
    .line 136
    iget-object v8, v1, Lh/e;->p:Landroidx/core/widget/NestedScrollView;

    .line 137
    .line 138
    iget-object v12, v1, Lh/e;->t:Landroid/widget/TextView;

    .line 139
    .line 140
    invoke-virtual {v8, v12}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 141
    .line 142
    .line 143
    iget-object v8, v1, Lh/e;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 144
    .line 145
    if-eqz v8, :cond_2

    .line 146
    .line 147
    iget-object v8, v1, Lh/e;->p:Landroidx/core/widget/NestedScrollView;

    .line 148
    .line 149
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    check-cast v8, Landroid/view/ViewGroup;

    .line 154
    .line 155
    iget-object v12, v1, Lh/e;->p:Landroidx/core/widget/NestedScrollView;

    .line 156
    .line 157
    invoke-virtual {v8, v12}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    invoke-virtual {v8, v12}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 162
    .line 163
    .line 164
    iget-object v13, v1, Lh/e;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 165
    .line 166
    new-instance v14, Landroid/view/ViewGroup$LayoutParams;

    .line 167
    .line 168
    invoke-direct {v14, v10, v10}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v8, v13, v12, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_2
    invoke-virtual {v6, v11}, Landroid/view/View;->setVisibility(I)V

    .line 176
    .line 177
    .line 178
    :goto_0
    const v8, 0x1020019

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    check-cast v8, Landroid/widget/Button;

    .line 186
    .line 187
    iput-object v8, v1, Lh/e;->g:Landroid/widget/Button;

    .line 188
    .line 189
    iget-object v12, v1, Lh/e;->D:Lcom/google/android/material/datepicker/k;

    .line 190
    .line 191
    invoke-virtual {v8, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    .line 193
    .line 194
    iget-object v8, v1, Lh/e;->h:Ljava/lang/CharSequence;

    .line 195
    .line 196
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    const/4 v13, 0x1

    .line 201
    if-eqz v8, :cond_3

    .line 202
    .line 203
    iget-object v8, v1, Lh/e;->g:Landroid/widget/Button;

    .line 204
    .line 205
    invoke-virtual {v8, v11}, Landroid/view/View;->setVisibility(I)V

    .line 206
    .line 207
    .line 208
    move v8, v9

    .line 209
    goto :goto_1

    .line 210
    :cond_3
    iget-object v8, v1, Lh/e;->g:Landroid/widget/Button;

    .line 211
    .line 212
    iget-object v14, v1, Lh/e;->h:Ljava/lang/CharSequence;

    .line 213
    .line 214
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    .line 216
    .line 217
    iget-object v8, v1, Lh/e;->g:Landroid/widget/Button;

    .line 218
    .line 219
    invoke-virtual {v8, v9}, Landroid/view/View;->setVisibility(I)V

    .line 220
    .line 221
    .line 222
    move v8, v13

    .line 223
    :goto_1
    const v14, 0x102001a

    .line 224
    .line 225
    .line 226
    invoke-virtual {v7, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    check-cast v14, Landroid/widget/Button;

    .line 231
    .line 232
    iput-object v14, v1, Lh/e;->j:Landroid/widget/Button;

    .line 233
    .line 234
    invoke-virtual {v14, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 235
    .line 236
    .line 237
    iget-object v14, v1, Lh/e;->k:Ljava/lang/CharSequence;

    .line 238
    .line 239
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 240
    .line 241
    .line 242
    move-result v14

    .line 243
    if-eqz v14, :cond_4

    .line 244
    .line 245
    iget-object v14, v1, Lh/e;->j:Landroid/widget/Button;

    .line 246
    .line 247
    invoke-virtual {v14, v11}, Landroid/view/View;->setVisibility(I)V

    .line 248
    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_4
    iget-object v14, v1, Lh/e;->j:Landroid/widget/Button;

    .line 252
    .line 253
    iget-object v15, v1, Lh/e;->k:Ljava/lang/CharSequence;

    .line 254
    .line 255
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 256
    .line 257
    .line 258
    iget-object v14, v1, Lh/e;->j:Landroid/widget/Button;

    .line 259
    .line 260
    invoke-virtual {v14, v9}, Landroid/view/View;->setVisibility(I)V

    .line 261
    .line 262
    .line 263
    or-int/lit8 v8, v8, 0x2

    .line 264
    .line 265
    :goto_2
    const v14, 0x102001b

    .line 266
    .line 267
    .line 268
    invoke-virtual {v7, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 269
    .line 270
    .line 271
    move-result-object v14

    .line 272
    check-cast v14, Landroid/widget/Button;

    .line 273
    .line 274
    iput-object v14, v1, Lh/e;->m:Landroid/widget/Button;

    .line 275
    .line 276
    invoke-virtual {v14, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 277
    .line 278
    .line 279
    iget-object v12, v1, Lh/e;->n:Ljava/lang/CharSequence;

    .line 280
    .line 281
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 282
    .line 283
    .line 284
    move-result v12

    .line 285
    if-eqz v12, :cond_5

    .line 286
    .line 287
    iget-object v12, v1, Lh/e;->m:Landroid/widget/Button;

    .line 288
    .line 289
    invoke-virtual {v12, v11}, Landroid/view/View;->setVisibility(I)V

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_5
    iget-object v12, v1, Lh/e;->m:Landroid/widget/Button;

    .line 294
    .line 295
    iget-object v14, v1, Lh/e;->n:Ljava/lang/CharSequence;

    .line 296
    .line 297
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 298
    .line 299
    .line 300
    iget-object v12, v1, Lh/e;->m:Landroid/widget/Button;

    .line 301
    .line 302
    invoke-virtual {v12, v9}, Landroid/view/View;->setVisibility(I)V

    .line 303
    .line 304
    .line 305
    or-int/lit8 v8, v8, 0x4

    .line 306
    .line 307
    :goto_3
    new-instance v12, Landroid/util/TypedValue;

    .line 308
    .line 309
    invoke-direct {v12}, Landroid/util/TypedValue;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    const v14, 0x7f03002b

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v14, v12, v13}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 320
    .line 321
    .line 322
    iget v2, v12, Landroid/util/TypedValue;->data:I

    .line 323
    .line 324
    const/4 v12, 0x2

    .line 325
    if-eqz v2, :cond_8

    .line 326
    .line 327
    const/high16 v2, 0x3f000000    # 0.5f

    .line 328
    .line 329
    if-ne v8, v13, :cond_6

    .line 330
    .line 331
    iget-object v14, v1, Lh/e;->g:Landroid/widget/Button;

    .line 332
    .line 333
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 334
    .line 335
    .line 336
    move-result-object v15

    .line 337
    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 338
    .line 339
    iput v13, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 340
    .line 341
    iput v2, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 342
    .line 343
    invoke-virtual {v14, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 344
    .line 345
    .line 346
    goto :goto_4

    .line 347
    :cond_6
    if-ne v8, v12, :cond_7

    .line 348
    .line 349
    iget-object v14, v1, Lh/e;->j:Landroid/widget/Button;

    .line 350
    .line 351
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 352
    .line 353
    .line 354
    move-result-object v15

    .line 355
    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 356
    .line 357
    iput v13, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 358
    .line 359
    iput v2, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 360
    .line 361
    invoke-virtual {v14, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 362
    .line 363
    .line 364
    goto :goto_4

    .line 365
    :cond_7
    const/4 v14, 0x4

    .line 366
    if-ne v8, v14, :cond_8

    .line 367
    .line 368
    iget-object v14, v1, Lh/e;->m:Landroid/widget/Button;

    .line 369
    .line 370
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 371
    .line 372
    .line 373
    move-result-object v15

    .line 374
    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 375
    .line 376
    iput v13, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 377
    .line 378
    iput v2, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 379
    .line 380
    invoke-virtual {v14, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 381
    .line 382
    .line 383
    :cond_8
    :goto_4
    if-eqz v8, :cond_9

    .line 384
    .line 385
    goto :goto_5

    .line 386
    :cond_9
    invoke-virtual {v7, v11}, Landroid/view/View;->setVisibility(I)V

    .line 387
    .line 388
    .line 389
    :goto_5
    iget-object v2, v1, Lh/e;->u:Landroid/view/View;

    .line 390
    .line 391
    const v8, 0x7f0901f4

    .line 392
    .line 393
    .line 394
    if-eqz v2, :cond_a

    .line 395
    .line 396
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 397
    .line 398
    const/4 v14, -0x2

    .line 399
    invoke-direct {v2, v10, v14}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 400
    .line 401
    .line 402
    iget-object v14, v1, Lh/e;->u:Landroid/view/View;

    .line 403
    .line 404
    invoke-virtual {v5, v14, v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v3, v8}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-virtual {v2, v11}, Landroid/view/View;->setVisibility(I)V

    .line 412
    .line 413
    .line 414
    goto :goto_6

    .line 415
    :cond_a
    const v2, 0x1020006

    .line 416
    .line 417
    .line 418
    invoke-virtual {v3, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    check-cast v2, Landroid/widget/ImageView;

    .line 423
    .line 424
    iput-object v2, v1, Lh/e;->r:Landroid/widget/ImageView;

    .line 425
    .line 426
    iget-object v2, v1, Lh/e;->d:Ljava/lang/CharSequence;

    .line 427
    .line 428
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    if-nez v2, :cond_c

    .line 433
    .line 434
    iget-boolean v2, v1, Lh/e;->B:Z

    .line 435
    .line 436
    if-eqz v2, :cond_c

    .line 437
    .line 438
    const v2, 0x7f09004a

    .line 439
    .line 440
    .line 441
    invoke-virtual {v3, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    check-cast v2, Landroid/widget/TextView;

    .line 446
    .line 447
    iput-object v2, v1, Lh/e;->s:Landroid/widget/TextView;

    .line 448
    .line 449
    iget-object v8, v1, Lh/e;->d:Ljava/lang/CharSequence;

    .line 450
    .line 451
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 452
    .line 453
    .line 454
    iget-object v2, v1, Lh/e;->q:Landroid/graphics/drawable/Drawable;

    .line 455
    .line 456
    if-eqz v2, :cond_b

    .line 457
    .line 458
    iget-object v8, v1, Lh/e;->r:Landroid/widget/ImageView;

    .line 459
    .line 460
    invoke-virtual {v8, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 461
    .line 462
    .line 463
    goto :goto_6

    .line 464
    :cond_b
    iget-object v2, v1, Lh/e;->s:Landroid/widget/TextView;

    .line 465
    .line 466
    iget-object v8, v1, Lh/e;->r:Landroid/widget/ImageView;

    .line 467
    .line 468
    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    .line 469
    .line 470
    .line 471
    move-result v8

    .line 472
    iget-object v14, v1, Lh/e;->r:Landroid/widget/ImageView;

    .line 473
    .line 474
    invoke-virtual {v14}, Landroid/view/View;->getPaddingTop()I

    .line 475
    .line 476
    .line 477
    move-result v14

    .line 478
    iget-object v15, v1, Lh/e;->r:Landroid/widget/ImageView;

    .line 479
    .line 480
    invoke-virtual {v15}, Landroid/view/View;->getPaddingRight()I

    .line 481
    .line 482
    .line 483
    move-result v15

    .line 484
    iget-object v12, v1, Lh/e;->r:Landroid/widget/ImageView;

    .line 485
    .line 486
    invoke-virtual {v12}, Landroid/view/View;->getPaddingBottom()I

    .line 487
    .line 488
    .line 489
    move-result v12

    .line 490
    invoke-virtual {v2, v8, v14, v15, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 491
    .line 492
    .line 493
    iget-object v2, v1, Lh/e;->r:Landroid/widget/ImageView;

    .line 494
    .line 495
    invoke-virtual {v2, v11}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 496
    .line 497
    .line 498
    goto :goto_6

    .line 499
    :cond_c
    invoke-virtual {v3, v8}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-virtual {v2, v11}, Landroid/view/View;->setVisibility(I)V

    .line 504
    .line 505
    .line 506
    iget-object v2, v1, Lh/e;->r:Landroid/widget/ImageView;

    .line 507
    .line 508
    invoke-virtual {v2, v11}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v5, v11}, Landroid/view/View;->setVisibility(I)V

    .line 512
    .line 513
    .line 514
    :goto_6
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 515
    .line 516
    .line 517
    move-result v2

    .line 518
    if-eq v2, v11, :cond_d

    .line 519
    .line 520
    move v2, v13

    .line 521
    goto :goto_7

    .line 522
    :cond_d
    move v2, v9

    .line 523
    :goto_7
    if-eqz v5, :cond_e

    .line 524
    .line 525
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 526
    .line 527
    .line 528
    move-result v4

    .line 529
    if-eq v4, v11, :cond_e

    .line 530
    .line 531
    move v4, v13

    .line 532
    goto :goto_8

    .line 533
    :cond_e
    move v4, v9

    .line 534
    :goto_8
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 535
    .line 536
    .line 537
    move-result v7

    .line 538
    if-eq v7, v11, :cond_f

    .line 539
    .line 540
    move v7, v13

    .line 541
    goto :goto_9

    .line 542
    :cond_f
    move v7, v9

    .line 543
    :goto_9
    if-nez v7, :cond_10

    .line 544
    .line 545
    const v8, 0x7f0901e4

    .line 546
    .line 547
    .line 548
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 549
    .line 550
    .line 551
    move-result-object v8

    .line 552
    if-eqz v8, :cond_10

    .line 553
    .line 554
    invoke-virtual {v8, v9}, Landroid/view/View;->setVisibility(I)V

    .line 555
    .line 556
    .line 557
    :cond_10
    if-eqz v4, :cond_14

    .line 558
    .line 559
    iget-object v8, v1, Lh/e;->p:Landroidx/core/widget/NestedScrollView;

    .line 560
    .line 561
    if-eqz v8, :cond_11

    .line 562
    .line 563
    invoke-virtual {v8, v13}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 564
    .line 565
    .line 566
    :cond_11
    iget-object v8, v1, Lh/e;->e:Ljava/lang/String;

    .line 567
    .line 568
    if-nez v8, :cond_13

    .line 569
    .line 570
    iget-object v8, v1, Lh/e;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 571
    .line 572
    if-eqz v8, :cond_12

    .line 573
    .line 574
    goto :goto_a

    .line 575
    :cond_12
    const/4 v5, 0x0

    .line 576
    goto :goto_b

    .line 577
    :cond_13
    :goto_a
    const v8, 0x7f0901f3

    .line 578
    .line 579
    .line 580
    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    :goto_b
    if-eqz v5, :cond_15

    .line 585
    .line 586
    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 587
    .line 588
    .line 589
    goto :goto_c

    .line 590
    :cond_14
    const v5, 0x7f0901e5

    .line 591
    .line 592
    .line 593
    invoke-virtual {v6, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 594
    .line 595
    .line 596
    move-result-object v5

    .line 597
    if-eqz v5, :cond_15

    .line 598
    .line 599
    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 600
    .line 601
    .line 602
    :cond_15
    :goto_c
    iget-object v5, v1, Lh/e;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 603
    .line 604
    if-eqz v5, :cond_19

    .line 605
    .line 606
    if-eqz v7, :cond_16

    .line 607
    .line 608
    if-nez v4, :cond_19

    .line 609
    .line 610
    :cond_16
    invoke-virtual {v5}, Landroid/view/View;->getPaddingLeft()I

    .line 611
    .line 612
    .line 613
    move-result v8

    .line 614
    if-eqz v4, :cond_17

    .line 615
    .line 616
    invoke-virtual {v5}, Landroid/view/View;->getPaddingTop()I

    .line 617
    .line 618
    .line 619
    move-result v11

    .line 620
    goto :goto_d

    .line 621
    :cond_17
    iget v11, v5, Landroidx/appcompat/app/AlertController$RecycleListView;->q:I

    .line 622
    .line 623
    :goto_d
    invoke-virtual {v5}, Landroid/view/View;->getPaddingRight()I

    .line 624
    .line 625
    .line 626
    move-result v12

    .line 627
    if-eqz v7, :cond_18

    .line 628
    .line 629
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 630
    .line 631
    .line 632
    move-result v14

    .line 633
    goto :goto_e

    .line 634
    :cond_18
    iget v14, v5, Landroidx/appcompat/app/AlertController$RecycleListView;->r:I

    .line 635
    .line 636
    :goto_e
    invoke-virtual {v5, v8, v11, v12, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 637
    .line 638
    .line 639
    :cond_19
    if-nez v2, :cond_1d

    .line 640
    .line 641
    iget-object v2, v1, Lh/e;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 642
    .line 643
    if-eqz v2, :cond_1a

    .line 644
    .line 645
    goto :goto_f

    .line 646
    :cond_1a
    iget-object v2, v1, Lh/e;->p:Landroidx/core/widget/NestedScrollView;

    .line 647
    .line 648
    :goto_f
    if-eqz v2, :cond_1d

    .line 649
    .line 650
    if-eqz v7, :cond_1b

    .line 651
    .line 652
    const/4 v9, 0x2

    .line 653
    :cond_1b
    or-int/2addr v4, v9

    .line 654
    const v5, 0x7f090199

    .line 655
    .line 656
    .line 657
    invoke-virtual {v3, v5}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 658
    .line 659
    .line 660
    move-result-object v5

    .line 661
    const v7, 0x7f090198

    .line 662
    .line 663
    .line 664
    invoke-virtual {v3, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 665
    .line 666
    .line 667
    move-result-object v3

    .line 668
    sget-object v7, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 669
    .line 670
    const/4 v7, 0x3

    .line 671
    invoke-static {v2, v4, v7}, Lw1/C;->b(Landroid/view/View;II)V

    .line 672
    .line 673
    .line 674
    if-eqz v5, :cond_1c

    .line 675
    .line 676
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 677
    .line 678
    .line 679
    :cond_1c
    if-eqz v3, :cond_1d

    .line 680
    .line 681
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 682
    .line 683
    .line 684
    :cond_1d
    iget-object v2, v1, Lh/e;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 685
    .line 686
    if-eqz v2, :cond_1e

    .line 687
    .line 688
    iget-object v3, v1, Lh/e;->v:Landroid/widget/ListAdapter;

    .line 689
    .line 690
    if-eqz v3, :cond_1e

    .line 691
    .line 692
    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 693
    .line 694
    .line 695
    iget v1, v1, Lh/e;->w:I

    .line 696
    .line 697
    if-le v1, v10, :cond_1e

    .line 698
    .line 699
    invoke-virtual {v2, v1, v13}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v2, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 703
    .line 704
    .line 705
    :cond_1e
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/f;->v:Lh/e;

    .line 2
    .line 3
    iget-object v0, v0, Lh/e;->p:Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->f(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/f;->v:Lh/e;

    .line 2
    .line 3
    iget-object v0, v0, Lh/e;->p:Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->f(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Lb/m;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/y;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh/y;->z()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lh/y;->E:Lh/I;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lh/I;->M:Z

    .line 19
    .line 20
    iget-object v0, v0, Lh/I;->L:Lk/j;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lk/j;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb/m;->d()V

    .line 2
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/l;->h(I)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lb/m;->d()V

    .line 4
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/l;->j(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Lb/m;->d()V

    .line 6
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh/l;->k(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    .line 2
    invoke-virtual {p0}, Lh/f;->e()Lh/l;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lh/l;->l(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 3
    invoke-virtual {p0, p1}, Lh/f;->h(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lh/f;->v:Lh/e;

    iput-object p1, v0, Lh/e;->d:Ljava/lang/CharSequence;

    .line 5
    iget-object v0, v0, Lh/e;->s:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
