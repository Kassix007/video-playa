.class public abstract Lh/h;
.super Lb/l;
.source "SourceFile"

# interfaces
.implements Lh/i;


# instance fields
.field public final K:Lk3/d;

.field public final L:Landroidx/lifecycle/z;

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Lh/y;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lb/l;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LJ1/u;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LJ1/u;-><init>(Lh/h;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lk3/d;

    .line 10
    .line 11
    const/4 v2, 0x5

    .line 12
    invoke-direct {v1, v2, v0}, Lk3/d;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lh/h;->K:Lk3/d;

    .line 16
    .line 17
    new-instance v0, Landroidx/lifecycle/z;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Landroidx/lifecycle/z;-><init>(Landroidx/lifecycle/x;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lh/h;->L:Landroidx/lifecycle/z;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lh/h;->O:Z

    .line 26
    .line 27
    iget-object v0, p0, Lb/l;->t:LZ/m;

    .line 28
    .line 29
    iget-object v0, v0, LZ/m;->s:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, LZ/m;

    .line 32
    .line 33
    new-instance v1, LJ1/r;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, p0, v2}, LJ1/r;-><init>(Lh/h;I)V

    .line 37
    .line 38
    .line 39
    const-string v2, "android:support:lifecycle"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, LZ/m;->C(Ljava/lang/String;Lg2/d;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, LJ1/s;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, v1}, LJ1/s;-><init>(Lh/h;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lb/l;->h(Lv1/a;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, LJ1/s;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, p0, v1}, LJ1/s;-><init>(Lh/h;I)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lb/l;->B:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    new-instance v0, LJ1/t;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-direct {v0, p0, v1}, LJ1/t;-><init>(Lh/h;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Lb/l;->i(Ld/a;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public static m(LJ1/H;)Z
    .locals 6

    .line 1
    iget-object p0, p0, LJ1/H;->c:LE/c0;

    .line 2
    .line 3
    invoke-virtual {p0}, LE/c0;->s()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, LJ1/q;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v2, v1, LJ1/q;->I:LJ1/u;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-object v2, v2, LJ1/u;->x:Lh/h;

    .line 34
    .line 35
    :goto_1
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, LJ1/q;->h()LJ1/H;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Lh/h;->m(LJ1/H;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    or-int/2addr v0, v2

    .line 46
    :cond_3
    iget-object v2, v1, LJ1/q;->d0:LJ1/P;

    .line 47
    .line 48
    sget-object v3, Landroidx/lifecycle/p;->t:Landroidx/lifecycle/p;

    .line 49
    .line 50
    sget-object v4, Landroidx/lifecycle/p;->s:Landroidx/lifecycle/p;

    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    invoke-virtual {v2}, LJ1/P;->g()V

    .line 56
    .line 57
    .line 58
    iget-object v2, v2, LJ1/P;->t:Landroidx/lifecycle/z;

    .line 59
    .line 60
    iget-object v2, v2, Landroidx/lifecycle/z;->d:Landroidx/lifecycle/p;

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-ltz v2, :cond_4

    .line 67
    .line 68
    iget-object v0, v1, LJ1/q;->d0:LJ1/P;

    .line 69
    .line 70
    iget-object v0, v0, LJ1/P;->t:Landroidx/lifecycle/z;

    .line 71
    .line 72
    invoke-virtual {v0, v4}, Landroidx/lifecycle/z;->h(Landroidx/lifecycle/p;)V

    .line 73
    .line 74
    .line 75
    move v0, v5

    .line 76
    :cond_4
    iget-object v2, v1, LJ1/q;->c0:Landroidx/lifecycle/z;

    .line 77
    .line 78
    iget-object v2, v2, Landroidx/lifecycle/z;->d:Landroidx/lifecycle/p;

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-ltz v2, :cond_0

    .line 85
    .line 86
    iget-object v0, v1, LJ1/q;->c0:Landroidx/lifecycle/z;

    .line 87
    .line 88
    invoke-virtual {v0, v4}, Landroidx/lifecycle/z;->h(Landroidx/lifecycle/p;)V

    .line 89
    .line 90
    .line 91
    move v0, v5

    .line 92
    goto :goto_0

    .line 93
    :cond_5
    return v0
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lb/l;->j()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

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

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/y;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lh/y;->f0:Z

    .line 9
    .line 10
    iget v2, v0, Lh/y;->j0:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v2, Lh/l;->r:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1, v2}, Lh/y;->B(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Lh/l;->b(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_7

    .line 28
    .line 29
    invoke-static {p1}, Lh/l;->b(Landroid/content/Context;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    .line 38
    const/16 v3, 0x21

    .line 39
    .line 40
    if-lt v2, v3, :cond_2

    .line 41
    .line 42
    sget-boolean v2, Lh/l;->v:Z

    .line 43
    .line 44
    if-nez v2, :cond_7

    .line 45
    .line 46
    sget-object v2, Lh/l;->q:Landroidx/room/F;

    .line 47
    .line 48
    new-instance v3, Lb2/f;

    .line 49
    .line 50
    const/4 v4, 0x2

    .line 51
    invoke-direct {v3, p1, v4}, Lb2/f;-><init>(Landroid/content/Context;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v3}, Landroidx/room/F;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_2
    sget-object v2, Lh/l;->y:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v2

    .line 61
    :try_start_0
    sget-object v3, Lh/l;->s:Lr1/e;

    .line 62
    .line 63
    if-nez v3, :cond_5

    .line 64
    .line 65
    sget-object v3, Lh/l;->t:Lr1/e;

    .line 66
    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, Lk1/c;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v3}, Lr1/e;->a(Ljava/lang/String;)Lr1/e;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    sput-object v3, Lh/l;->t:Lr1/e;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    :goto_1
    sget-object v3, Lh/l;->t:Lr1/e;

    .line 83
    .line 84
    iget-object v3, v3, Lr1/e;->a:Lr1/f;

    .line 85
    .line 86
    iget-object v3, v3, Lr1/f;->a:Landroid/os/LocaleList;

    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/os/LocaleList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_4

    .line 93
    .line 94
    monitor-exit v2

    .line 95
    goto :goto_4

    .line 96
    :cond_4
    sget-object v3, Lh/l;->t:Lr1/e;

    .line 97
    .line 98
    sput-object v3, Lh/l;->s:Lr1/e;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    sget-object v4, Lh/l;->t:Lr1/e;

    .line 102
    .line 103
    invoke-virtual {v3, v4}, Lr1/e;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-nez v3, :cond_6

    .line 108
    .line 109
    sget-object v3, Lh/l;->s:Lr1/e;

    .line 110
    .line 111
    sput-object v3, Lh/l;->t:Lr1/e;

    .line 112
    .line 113
    iget-object v3, v3, Lr1/e;->a:Lr1/f;

    .line 114
    .line 115
    iget-object v3, v3, Lr1/f;->a:Landroid/os/LocaleList;

    .line 116
    .line 117
    invoke-virtual {v3}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-static {p1, v3}, Lk1/c;->f(Landroid/content/Context;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    :goto_2
    monitor-exit v2

    .line 125
    goto :goto_4

    .line 126
    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    throw p1

    .line 128
    :cond_7
    :goto_4
    invoke-static {p1}, Lh/y;->o(Landroid/content/Context;)Lr1/e;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    instance-of v3, p1, Landroid/view/ContextThemeWrapper;

    .line 133
    .line 134
    const/4 v4, 0x0

    .line 135
    const/4 v5, 0x0

    .line 136
    if-eqz v3, :cond_8

    .line 137
    .line 138
    invoke-static {p1, v0, v2, v5, v4}, Lh/y;->s(Landroid/content/Context;ILr1/e;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    :try_start_1
    move-object v6, p1

    .line 143
    check-cast v6, Landroid/view/ContextThemeWrapper;

    .line 144
    .line 145
    invoke-virtual {v6, v3}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 146
    .line 147
    .line 148
    goto/16 :goto_b

    .line 149
    .line 150
    :catch_0
    :cond_8
    instance-of v3, p1, Lk/c;

    .line 151
    .line 152
    if-eqz v3, :cond_9

    .line 153
    .line 154
    invoke-static {p1, v0, v2, v5, v4}, Lh/y;->s(Landroid/content/Context;ILr1/e;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    :try_start_2
    move-object v4, p1

    .line 159
    check-cast v4, Lk/c;

    .line 160
    .line 161
    invoke-virtual {v4, v3}, Lk/c;->a(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 162
    .line 163
    .line 164
    goto/16 :goto_b

    .line 165
    .line 166
    :catch_1
    :cond_9
    sget-boolean v3, Lh/y;->A0:Z

    .line 167
    .line 168
    if-nez v3, :cond_a

    .line 169
    .line 170
    goto/16 :goto_b

    .line 171
    .line 172
    :cond_a
    new-instance v3, Landroid/content/res/Configuration;

    .line 173
    .line 174
    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    .line 175
    .line 176
    .line 177
    const/4 v4, -0x1

    .line 178
    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 179
    .line 180
    const/4 v4, 0x0

    .line 181
    iput v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 182
    .line 183
    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 204
    .line 205
    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 206
    .line 207
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    if-nez v7, :cond_20

    .line 212
    .line 213
    new-instance v7, Landroid/content/res/Configuration;

    .line 214
    .line 215
    invoke-direct {v7}, Landroid/content/res/Configuration;-><init>()V

    .line 216
    .line 217
    .line 218
    iput v4, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 219
    .line 220
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-nez v4, :cond_b

    .line 225
    .line 226
    goto/16 :goto_5

    .line 227
    .line 228
    :cond_b
    iget v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 229
    .line 230
    iget v8, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 231
    .line 232
    cmpl-float v4, v4, v8

    .line 233
    .line 234
    if-eqz v4, :cond_c

    .line 235
    .line 236
    iput v8, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 237
    .line 238
    :cond_c
    iget v4, v3, Landroid/content/res/Configuration;->mcc:I

    .line 239
    .line 240
    iget v8, v6, Landroid/content/res/Configuration;->mcc:I

    .line 241
    .line 242
    if-eq v4, v8, :cond_d

    .line 243
    .line 244
    iput v8, v7, Landroid/content/res/Configuration;->mcc:I

    .line 245
    .line 246
    :cond_d
    iget v4, v3, Landroid/content/res/Configuration;->mnc:I

    .line 247
    .line 248
    iget v8, v6, Landroid/content/res/Configuration;->mnc:I

    .line 249
    .line 250
    if-eq v4, v8, :cond_e

    .line 251
    .line 252
    iput v8, v7, Landroid/content/res/Configuration;->mnc:I

    .line 253
    .line 254
    :cond_e
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 255
    .line 256
    invoke-static {v3, v6, v7}, Lh/r;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 257
    .line 258
    .line 259
    iget v8, v3, Landroid/content/res/Configuration;->touchscreen:I

    .line 260
    .line 261
    iget v9, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 262
    .line 263
    if-eq v8, v9, :cond_f

    .line 264
    .line 265
    iput v9, v7, Landroid/content/res/Configuration;->touchscreen:I

    .line 266
    .line 267
    :cond_f
    iget v8, v3, Landroid/content/res/Configuration;->keyboard:I

    .line 268
    .line 269
    iget v9, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 270
    .line 271
    if-eq v8, v9, :cond_10

    .line 272
    .line 273
    iput v9, v7, Landroid/content/res/Configuration;->keyboard:I

    .line 274
    .line 275
    :cond_10
    iget v8, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 276
    .line 277
    iget v9, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 278
    .line 279
    if-eq v8, v9, :cond_11

    .line 280
    .line 281
    iput v9, v7, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 282
    .line 283
    :cond_11
    iget v8, v3, Landroid/content/res/Configuration;->navigation:I

    .line 284
    .line 285
    iget v9, v6, Landroid/content/res/Configuration;->navigation:I

    .line 286
    .line 287
    if-eq v8, v9, :cond_12

    .line 288
    .line 289
    iput v9, v7, Landroid/content/res/Configuration;->navigation:I

    .line 290
    .line 291
    :cond_12
    iget v8, v3, Landroid/content/res/Configuration;->navigationHidden:I

    .line 292
    .line 293
    iget v9, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 294
    .line 295
    if-eq v8, v9, :cond_13

    .line 296
    .line 297
    iput v9, v7, Landroid/content/res/Configuration;->navigationHidden:I

    .line 298
    .line 299
    :cond_13
    iget v8, v3, Landroid/content/res/Configuration;->orientation:I

    .line 300
    .line 301
    iget v9, v6, Landroid/content/res/Configuration;->orientation:I

    .line 302
    .line 303
    if-eq v8, v9, :cond_14

    .line 304
    .line 305
    iput v9, v7, Landroid/content/res/Configuration;->orientation:I

    .line 306
    .line 307
    :cond_14
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 308
    .line 309
    and-int/lit8 v8, v8, 0xf

    .line 310
    .line 311
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 312
    .line 313
    and-int/lit8 v9, v9, 0xf

    .line 314
    .line 315
    if-eq v8, v9, :cond_15

    .line 316
    .line 317
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 318
    .line 319
    or-int/2addr v8, v9

    .line 320
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 321
    .line 322
    :cond_15
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 323
    .line 324
    and-int/lit16 v8, v8, 0xc0

    .line 325
    .line 326
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 327
    .line 328
    and-int/lit16 v9, v9, 0xc0

    .line 329
    .line 330
    if-eq v8, v9, :cond_16

    .line 331
    .line 332
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 333
    .line 334
    or-int/2addr v8, v9

    .line 335
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 336
    .line 337
    :cond_16
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 338
    .line 339
    and-int/lit8 v8, v8, 0x30

    .line 340
    .line 341
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 342
    .line 343
    and-int/lit8 v9, v9, 0x30

    .line 344
    .line 345
    if-eq v8, v9, :cond_17

    .line 346
    .line 347
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 348
    .line 349
    or-int/2addr v8, v9

    .line 350
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 351
    .line 352
    :cond_17
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 353
    .line 354
    and-int/lit16 v8, v8, 0x300

    .line 355
    .line 356
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 357
    .line 358
    and-int/lit16 v9, v9, 0x300

    .line 359
    .line 360
    if-eq v8, v9, :cond_18

    .line 361
    .line 362
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 363
    .line 364
    or-int/2addr v8, v9

    .line 365
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 366
    .line 367
    :cond_18
    const/16 v8, 0x1a

    .line 368
    .line 369
    if-lt v4, v8, :cond_1a

    .line 370
    .line 371
    invoke-static {v3}, Ld0/l;->a(Landroid/content/res/Configuration;)I

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    and-int/lit8 v4, v4, 0x3

    .line 376
    .line 377
    invoke-static {v6}, Ld0/l;->a(Landroid/content/res/Configuration;)I

    .line 378
    .line 379
    .line 380
    move-result v8

    .line 381
    and-int/lit8 v8, v8, 0x3

    .line 382
    .line 383
    if-eq v4, v8, :cond_19

    .line 384
    .line 385
    invoke-static {v7}, Ld0/l;->a(Landroid/content/res/Configuration;)I

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    invoke-static {v6}, Ld0/l;->a(Landroid/content/res/Configuration;)I

    .line 390
    .line 391
    .line 392
    move-result v8

    .line 393
    and-int/lit8 v8, v8, 0x3

    .line 394
    .line 395
    or-int/2addr v4, v8

    .line 396
    invoke-static {v7, v4}, Ld0/l;->m(Landroid/content/res/Configuration;I)V

    .line 397
    .line 398
    .line 399
    :cond_19
    invoke-static {v3}, Ld0/l;->a(Landroid/content/res/Configuration;)I

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    and-int/lit8 v4, v4, 0xc

    .line 404
    .line 405
    invoke-static {v6}, Ld0/l;->a(Landroid/content/res/Configuration;)I

    .line 406
    .line 407
    .line 408
    move-result v8

    .line 409
    and-int/lit8 v8, v8, 0xc

    .line 410
    .line 411
    if-eq v4, v8, :cond_1a

    .line 412
    .line 413
    invoke-static {v7}, Ld0/l;->a(Landroid/content/res/Configuration;)I

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    invoke-static {v6}, Ld0/l;->a(Landroid/content/res/Configuration;)I

    .line 418
    .line 419
    .line 420
    move-result v8

    .line 421
    and-int/lit8 v8, v8, 0xc

    .line 422
    .line 423
    or-int/2addr v4, v8

    .line 424
    invoke-static {v7, v4}, Ld0/l;->m(Landroid/content/res/Configuration;I)V

    .line 425
    .line 426
    .line 427
    :cond_1a
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 428
    .line 429
    and-int/lit8 v4, v4, 0xf

    .line 430
    .line 431
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 432
    .line 433
    and-int/lit8 v8, v8, 0xf

    .line 434
    .line 435
    if-eq v4, v8, :cond_1b

    .line 436
    .line 437
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 438
    .line 439
    or-int/2addr v4, v8

    .line 440
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 441
    .line 442
    :cond_1b
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 443
    .line 444
    and-int/lit8 v4, v4, 0x30

    .line 445
    .line 446
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 447
    .line 448
    and-int/lit8 v8, v8, 0x30

    .line 449
    .line 450
    if-eq v4, v8, :cond_1c

    .line 451
    .line 452
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 453
    .line 454
    or-int/2addr v4, v8

    .line 455
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 456
    .line 457
    :cond_1c
    iget v4, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 458
    .line 459
    iget v8, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 460
    .line 461
    if-eq v4, v8, :cond_1d

    .line 462
    .line 463
    iput v8, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 464
    .line 465
    :cond_1d
    iget v4, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 466
    .line 467
    iget v8, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 468
    .line 469
    if-eq v4, v8, :cond_1e

    .line 470
    .line 471
    iput v8, v7, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 472
    .line 473
    :cond_1e
    iget v4, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 474
    .line 475
    iget v8, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 476
    .line 477
    if-eq v4, v8, :cond_1f

    .line 478
    .line 479
    iput v8, v7, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 480
    .line 481
    :cond_1f
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    .line 482
    .line 483
    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 484
    .line 485
    if-eq v3, v4, :cond_21

    .line 486
    .line 487
    iput v4, v7, Landroid/content/res/Configuration;->densityDpi:I

    .line 488
    .line 489
    goto :goto_5

    .line 490
    :cond_20
    move-object v7, v5

    .line 491
    :cond_21
    :goto_5
    invoke-static {p1, v0, v2, v7, v1}, Lh/y;->s(Landroid/content/Context;ILr1/e;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    new-instance v2, Lk/c;

    .line 496
    .line 497
    const v3, 0x7f12022e

    .line 498
    .line 499
    .line 500
    invoke-direct {v2, p1, v3}, Lk/c;-><init>(Landroid/content/Context;I)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2, v0}, Lk/c;->a(Landroid/content/res/Configuration;)V

    .line 504
    .line 505
    .line 506
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 507
    .line 508
    .line 509
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_5

    .line 510
    if-eqz p1, :cond_25

    .line 511
    .line 512
    invoke-virtual {v2}, Lk/c;->getTheme()Landroid/content/res/Resources$Theme;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 517
    .line 518
    const/16 v3, 0x1d

    .line 519
    .line 520
    if-lt v0, v3, :cond_22

    .line 521
    .line 522
    invoke-static {p1}, Lm1/k;->a(Landroid/content/res/Resources$Theme;)V

    .line 523
    .line 524
    .line 525
    goto :goto_a

    .line 526
    :cond_22
    sget-object v0, Lm1/b;->e:Ljava/lang/Object;

    .line 527
    .line 528
    monitor-enter v0

    .line 529
    :try_start_4
    sget-boolean v3, Lm1/b;->g:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 530
    .line 531
    if-nez v3, :cond_23

    .line 532
    .line 533
    :try_start_5
    const-class v3, Landroid/content/res/Resources$Theme;

    .line 534
    .line 535
    const-string v4, "rebase"

    .line 536
    .line 537
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    sput-object v3, Lm1/b;->f:Ljava/lang/reflect/Method;

    .line 542
    .line 543
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 544
    .line 545
    .line 546
    goto :goto_6

    .line 547
    :catchall_1
    move-exception p1

    .line 548
    goto :goto_9

    .line 549
    :catch_2
    move-exception v3

    .line 550
    :try_start_6
    const-string v4, "ResourcesCompat"

    .line 551
    .line 552
    const-string v6, "Failed to retrieve rebase() method"

    .line 553
    .line 554
    invoke-static {v4, v6, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 555
    .line 556
    .line 557
    :goto_6
    sput-boolean v1, Lm1/b;->g:Z

    .line 558
    .line 559
    :cond_23
    sget-object v1, Lm1/b;->f:Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 560
    .line 561
    if-eqz v1, :cond_24

    .line 562
    .line 563
    :try_start_7
    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 564
    .line 565
    .line 566
    goto :goto_8

    .line 567
    :catch_3
    move-exception p1

    .line 568
    goto :goto_7

    .line 569
    :catch_4
    move-exception p1

    .line 570
    :goto_7
    :try_start_8
    const-string v1, "ResourcesCompat"

    .line 571
    .line 572
    const-string v3, "Failed to invoke rebase() method via reflection"

    .line 573
    .line 574
    invoke-static {v1, v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 575
    .line 576
    .line 577
    sput-object v5, Lm1/b;->f:Ljava/lang/reflect/Method;

    .line 578
    .line 579
    :cond_24
    :goto_8
    monitor-exit v0

    .line 580
    goto :goto_a

    .line 581
    :goto_9
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 582
    throw p1

    .line 583
    :catch_5
    :cond_25
    :goto_a
    move-object p1, v2

    .line 584
    :goto_b
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 585
    .line 586
    .line 587
    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/y;

    .line 6
    .line 7
    invoke-virtual {v0}, Lh/y;->z()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

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
    invoke-super {p0, p1}, Lk1/e;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p4, :cond_5

    .line 6
    .line 7
    array-length v1, p4

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    aget-object v1, p4, v0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sparse-switch v2, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :sswitch_0
    const-string v2, "--autofill"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v2, 0x1a

    .line 33
    .line 34
    if-lt v1, v2, :cond_5

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :sswitch_1
    const-string v2, "--contentcapture"

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    const/16 v2, 0x1d

    .line 49
    .line 50
    if-lt v1, v2, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :sswitch_2
    const-string v2, "--list-dumpables"

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :sswitch_3
    const-string v2, "--dump-dumpable"

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v2, 0x21

    .line 74
    .line 75
    if-lt v1, v2, :cond_5

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :sswitch_4
    const-string v2, "--translation"

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 88
    .line 89
    const/16 v2, 0x1f

    .line 90
    .line 91
    if-lt v1, v2, :cond_5

    .line 92
    .line 93
    :goto_0
    return-void

    .line 94
    :cond_5
    :goto_1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const-string v1, "Local FragmentActivity "

    .line 98
    .line 99
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v1, " State:"

    .line 114
    .line 115
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v2, "  "

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const-string v2, "mCreated="

    .line 139
    .line 140
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-boolean v2, p0, Lh/h;->M:Z

    .line 144
    .line 145
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 146
    .line 147
    .line 148
    const-string v2, " mResumed="

    .line 149
    .line 150
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-boolean v2, p0, Lh/h;->N:Z

    .line 154
    .line 155
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 156
    .line 157
    .line 158
    const-string v2, " mStopped="

    .line 159
    .line 160
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-boolean v2, p0, Lh/h;->O:Z

    .line 164
    .line 165
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    if-eqz v2, :cond_9

    .line 173
    .line 174
    invoke-interface {p0}, Landroidx/lifecycle/l0;->f()Landroidx/lifecycle/k0;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    const-string v3, "store"

    .line 179
    .line 180
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    sget-object v3, LP1/a;->b:LP1/a;

    .line 184
    .line 185
    const-string v4, "defaultCreationExtras"

    .line 186
    .line 187
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance v4, LE/c0;

    .line 191
    .line 192
    sget-object v5, LS1/a;->c:LJ1/J;

    .line 193
    .line 194
    invoke-direct {v4, v2, v5, v3}, LE/c0;-><init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/h0;LP1/c;)V

    .line 195
    .line 196
    .line 197
    const-class v2, LS1/a;

    .line 198
    .line 199
    invoke-static {v2}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual {v2}, Lkotlin/jvm/internal/f;->b()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    if-eqz v3, :cond_8

    .line 208
    .line 209
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 210
    .line 211
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v4, v3, v2}, LE/c0;->v(Ljava/lang/String;Lkotlin/jvm/internal/f;)Landroidx/lifecycle/f0;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    check-cast v2, LS1/a;

    .line 220
    .line 221
    iget-object v2, v2, LS1/a;->b:Lr/S;

    .line 222
    .line 223
    invoke-virtual {v2}, Lr/S;->f()I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-lez v3, :cond_9

    .line 228
    .line 229
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const-string v3, "Loaders:"

    .line 233
    .line 234
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Lr/S;->f()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-gtz v3, :cond_6

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_6
    invoke-virtual {v2, v0}, Lr/S;->g(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    if-nez p1, :cond_7

    .line 249
    .line 250
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    const-string p1, "  #"

    .line 254
    .line 255
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v0}, Lr/S;->d(I)I

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    .line 263
    .line 264
    .line 265
    const-string p1, ": "

    .line 266
    .line 267
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    const/4 p1, 0x0

    .line 271
    throw p1

    .line 272
    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    .line 273
    .line 274
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 275
    .line 276
    .line 277
    throw p1

    .line 278
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 279
    .line 280
    const-string p2, "Local and anonymous classes can not be ViewModels"

    .line 281
    .line 282
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw p1

    .line 286
    :cond_9
    :goto_2
    iget-object v0, p0, Lh/h;->K:Lk3/d;

    .line 287
    .line 288
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v0, LJ1/u;

    .line 291
    .line 292
    iget-object v0, v0, LJ1/u;->w:LJ1/H;

    .line 293
    .line 294
    invoke-virtual {v0, p1, p2, p3, p4}, LJ1/H;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    nop

    .line 299
    :sswitch_data_0
    .sparse-switch
        -0x2673d6ef -> :sswitch_4
        0x5fd0f67 -> :sswitch_3
        0x1c2b8816 -> :sswitch_2
        0x4519f64d -> :sswitch_1
        0x56b9c952 -> :sswitch_0
    .end sparse-switch
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

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

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/y;

    .line 6
    .line 7
    iget-object v1, v0, Lh/y;->F:Lk/h;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Lh/y;->z()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lk/h;

    .line 15
    .line 16
    iget-object v2, v0, Lh/y;->E:Lh/I;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Lh/I;->W()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, Lh/y;->A:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v1, v2}, Lk/h;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Lh/y;->F:Lk/h;

    .line 31
    .line 32
    :cond_1
    iget-object v0, v0, Lh/y;->F:Lk/h;

    .line 33
    .line 34
    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    sget v0, Lm/d1;->a:I

    .line 2
    .line 3
    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final invalidateOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

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

.method public final l()Lh/l;
    .locals 2

    .line 1
    iget-object v0, p0, Lh/h;->P:Lh/y;

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
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Lh/y;-><init>(Landroid/content/Context;Landroid/view/Window;Lh/i;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lh/h;->P:Lh/y;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lh/h;->P:Lh/y;

    .line 16
    .line 17
    return-object v0
.end method

.method public final n()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh/h;->K:Lk3/d;

    .line 5
    .line 6
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LJ1/u;

    .line 9
    .line 10
    iget-object v0, v0, LJ1/u;->w:LJ1/H;

    .line 11
    .line 12
    invoke-virtual {v0}, LJ1/H;->k()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lh/h;->L:Landroidx/lifecycle/z;

    .line 16
    .line 17
    sget-object v1, Landroidx/lifecycle/o;->ON_DESTROY:Landroidx/lifecycle/o;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final o(ILandroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lb/l;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p2, 0x6

    .line 10
    if-ne p1, p2, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lh/h;->K:Lk3/d;

    .line 13
    .line 14
    iget-object p1, p1, Lk3/d;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, LJ1/u;

    .line 17
    .line 18
    iget-object p1, p1, LJ1/u;->w:LJ1/H;

    .line 19
    .line 20
    invoke-virtual {p1}, LJ1/H;->i()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/h;->K:Lk3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk3/d;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lb/l;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lb/l;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lh/y;

    .line 9
    .line 10
    iget-boolean v0, p1, Lh/y;->W:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p1, Lh/y;->Q:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lh/y;->z()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Lh/y;->E:Lh/I;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, Lh/I;->t:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/high16 v2, 0x7f040000

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Lh/I;->Z(Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {}, Lm/r;->a()Lm/r;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p1, Lh/y;->A:Landroid/content/Context;

    .line 45
    .line 46
    monitor-enter v0

    .line 47
    :try_start_0
    iget-object v2, v0, Lm/r;->a:Lm/J0;

    .line 48
    .line 49
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    :try_start_1
    iget-object v3, v2, Lm/J0;->b:Ljava/util/WeakHashMap;

    .line 51
    .line 52
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lr/q;

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v1}, Lr/q;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    monitor-exit v0

    .line 68
    new-instance v0, Landroid/content/res/Configuration;

    .line 69
    .line 70
    iget-object v1, p1, Lh/y;->A:Landroid/content/Context;

    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p1, Lh/y;->i0:Landroid/content/res/Configuration;

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-virtual {p1, v0, v0}, Lh/y;->m(ZZ)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :goto_1
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    :try_start_4
    throw p1

    .line 92
    :catchall_1
    move-exception p1

    .line 93
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 94
    throw p1
.end method

.method public final onContentChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lb/l;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lh/h;->L:Landroidx/lifecycle/z;

    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/o;->ON_CREATE:Landroidx/lifecycle/o;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lh/h;->K:Lk3/d;

    .line 12
    .line 13
    iget-object p1, p1, Lk3/d;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, LJ1/u;

    .line 16
    .line 17
    iget-object p1, p1, LJ1/u;->w:LJ1/H;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, LJ1/H;->E:Z

    .line 21
    .line 22
    iput-boolean v0, p1, LJ1/H;->F:Z

    .line 23
    .line 24
    iget-object v1, p1, LJ1/H;->L:LJ1/K;

    .line 25
    .line 26
    iput-boolean v0, v1, LJ1/K;->g:Z

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p1, v0}, LJ1/H;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/h;->K:Lk3/d;

    .line 2
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    check-cast v0, LJ1/u;

    .line 3
    iget-object v0, v0, LJ1/u;->w:LJ1/H;

    .line 4
    iget-object v0, v0, LJ1/H;->f:LJ1/w;

    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, LJ1/w;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 7
    iget-object v0, p0, Lh/h;->K:Lk3/d;

    .line 8
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    check-cast v0, LJ1/u;

    .line 9
    iget-object v0, v0, LJ1/u;->w:LJ1/H;

    .line 10
    iget-object v0, v0, LJ1/H;->f:LJ1/w;

    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, p1, p2, p3}, LJ1/w;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 12
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/h;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

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

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lh/h;->o(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lh/y;

    .line 14
    .line 15
    invoke-virtual {p1}, Lh/y;->z()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, Lh/y;->E:Lh/I;

    .line 19
    .line 20
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const v1, 0x102002c

    .line 25
    .line 26
    .line 27
    if-ne p2, v1, :cond_5

    .line 28
    .line 29
    if-eqz p1, :cond_5

    .line 30
    .line 31
    iget-object p1, p1, Lh/I;->x:Lm/i0;

    .line 32
    .line 33
    check-cast p1, Lm/Y0;

    .line 34
    .line 35
    iget p1, p1, Lm/Y0;->b:I

    .line 36
    .line 37
    and-int/lit8 p1, p1, 0x4

    .line 38
    .line 39
    if-eqz p1, :cond_5

    .line 40
    .line 41
    invoke-static {p0}, Lk1/c;->d(Lh/h;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_5

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    new-instance p1, Lk1/o;

    .line 54
    .line 55
    invoke-direct {p1, p0}, Lk1/o;-><init>(Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, Lk1/c;->d(Lh/h;)Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    if-nez p2, :cond_1

    .line 63
    .line 64
    invoke-static {p0}, Lk1/c;->d(Lh/h;)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    :cond_1
    if-eqz p2, :cond_3

    .line 69
    .line 70
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-nez v1, :cond_2

    .line 75
    .line 76
    iget-object v1, p1, Lk1/o;->r:Landroid/content/Context;

    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_2
    invoke-virtual {p1, v1}, Lk1/o;->d(Landroid/content/ComponentName;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p1, Lk1/o;->q:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {p1}, Lk1/o;->g()V

    .line 95
    .line 96
    .line 97
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 102
    .line 103
    .line 104
    :goto_0
    return v0

    .line 105
    :cond_4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    .line 106
    .line 107
    .line 108
    return v0

    .line 109
    :cond_5
    const/4 p1, 0x0

    .line 110
    return p1
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lh/h;->N:Z

    .line 6
    .line 7
    iget-object v0, p0, Lh/h;->K:Lk3/d;

    .line 8
    .line 9
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LJ1/u;

    .line 12
    .line 13
    iget-object v0, v0, LJ1/u;->w:LJ1/H;

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-virtual {v0, v1}, LJ1/H;->t(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lh/h;->L:Landroidx/lifecycle/z;

    .line 20
    .line 21
    sget-object v1, Landroidx/lifecycle/o;->ON_PAUSE:Landroidx/lifecycle/o;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lh/y;

    .line 9
    .line 10
    invoke-virtual {p1}, Lh/y;->v()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onPostResume()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/h;->p()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

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
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, v0, Lh/I;->M:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/h;->K:Lk3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk3/d;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lb/l;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh/h;->K:Lk3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk3/d;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lh/h;->N:Z

    .line 11
    .line 12
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LJ1/u;

    .line 15
    .line 16
    iget-object v0, v0, LJ1/u;->w:LJ1/H;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, LJ1/H;->y(Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onStart()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh/h;->q()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/y;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Lh/y;->m(ZZ)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onStateNotSaved()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/h;->K:Lk3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk3/d;->x()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/h;->r()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

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

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2, p1}, Lh/l;->l(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final openOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh/y;

    .line 6
    .line 7
    invoke-virtual {v0}, Lh/y;->z()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh/h;->L:Landroidx/lifecycle/z;

    .line 5
    .line 6
    sget-object v1, Landroidx/lifecycle/o;->ON_RESUME:Landroidx/lifecycle/o;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lh/h;->K:Lk3/d;

    .line 12
    .line 13
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, LJ1/u;

    .line 16
    .line 17
    iget-object v0, v0, LJ1/u;->w:LJ1/H;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-boolean v1, v0, LJ1/H;->E:Z

    .line 21
    .line 22
    iput-boolean v1, v0, LJ1/H;->F:Z

    .line 23
    .line 24
    iget-object v2, v0, LJ1/H;->L:LJ1/K;

    .line 25
    .line 26
    iput-boolean v1, v2, LJ1/K;->g:Z

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-virtual {v0, v1}, LJ1/H;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final q()V
    .locals 5

    .line 1
    iget-object v0, p0, Lh/h;->K:Lk3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk3/d;->x()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LJ1/u;

    .line 9
    .line 10
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Lh/h;->O:Z

    .line 15
    .line 16
    iget-boolean v2, p0, Lh/h;->M:Z

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iput-boolean v3, p0, Lh/h;->M:Z

    .line 22
    .line 23
    iget-object v2, v0, LJ1/u;->w:LJ1/H;

    .line 24
    .line 25
    iput-boolean v1, v2, LJ1/H;->E:Z

    .line 26
    .line 27
    iput-boolean v1, v2, LJ1/H;->F:Z

    .line 28
    .line 29
    iget-object v4, v2, LJ1/H;->L:LJ1/K;

    .line 30
    .line 31
    iput-boolean v1, v4, LJ1/K;->g:Z

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    invoke-virtual {v2, v4}, LJ1/H;->t(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v2, v0, LJ1/u;->w:LJ1/H;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, LJ1/H;->y(Z)Z

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lh/h;->L:Landroidx/lifecycle/z;

    .line 43
    .line 44
    sget-object v3, Landroidx/lifecycle/o;->ON_START:Landroidx/lifecycle/o;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, LJ1/u;->w:LJ1/H;

    .line 50
    .line 51
    iput-boolean v1, v0, LJ1/H;->E:Z

    .line 52
    .line 53
    iput-boolean v1, v0, LJ1/H;->F:Z

    .line 54
    .line 55
    iget-object v2, v0, LJ1/H;->L:LJ1/K;

    .line 56
    .line 57
    iput-boolean v1, v2, LJ1/K;->g:Z

    .line 58
    .line 59
    const/4 v1, 0x5

    .line 60
    invoke-virtual {v0, v1}, LJ1/H;->t(I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final r()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lh/h;->O:Z

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, Lh/h;->K:Lk3/d;

    .line 8
    .line 9
    iget-object v2, v1, Lk3/d;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, LJ1/u;

    .line 12
    .line 13
    iget-object v2, v2, LJ1/u;->w:LJ1/H;

    .line 14
    .line 15
    invoke-static {v2}, Lh/h;->m(LJ1/H;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, Lk3/d;->r:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, LJ1/u;

    .line 24
    .line 25
    iget-object v1, v1, LJ1/u;->w:LJ1/H;

    .line 26
    .line 27
    iput-boolean v0, v1, LJ1/H;->F:Z

    .line 28
    .line 29
    iget-object v2, v1, LJ1/H;->L:LJ1/K;

    .line 30
    .line 31
    iput-boolean v0, v2, LJ1/K;->g:Z

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-virtual {v1, v0}, LJ1/H;->t(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lh/h;->L:Landroidx/lifecycle/z;

    .line 38
    .line 39
    sget-object v1, Landroidx/lifecycle/o;->ON_STOP:Landroidx/lifecycle/o;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb/l;->j()V

    .line 2
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/l;->h(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lb/l;->j()V

    .line 4
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/l;->j(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Lb/l;->j()V

    .line 6
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh/l;->k(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh/h;->l()Lh/l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh/y;

    .line 9
    .line 10
    iput p1, v0, Lh/y;->k0:I

    .line 11
    .line 12
    return-void
.end method
