.class public final LD2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:LD2/c;

.field public c:Ljava/lang/Object;

.field public d:LF2/b;

.field public e:LD2/i;

.field public f:LE2/d;

.field public final g:Ljava/util/List;

.field public final h:Lc3/c;

.field public final i:Ljava/util/LinkedHashMap;

.field public final j:Z

.field public final k:Z

.field public final l:LD2/o;

.field public m:LE2/i;

.field public n:LE2/g;

.field public o:Landroidx/lifecycle/q;

.field public p:LE2/i;

.field public q:LE2/g;


# direct methods
.method public constructor <init>(LD2/j;Landroid/content/Context;)V
    .locals 3

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p2, p0, LD2/h;->a:Landroid/content/Context;

    .line 22
    iget-object v0, p1, LD2/j;->A:LD2/c;

    .line 23
    iput-object v0, p0, LD2/h;->b:LD2/c;

    .line 24
    iget-object v0, p1, LD2/j;->b:Ljava/lang/Object;

    .line 25
    iput-object v0, p0, LD2/h;->c:Ljava/lang/Object;

    .line 26
    iget-object v0, p1, LD2/j;->c:LF2/b;

    .line 27
    iput-object v0, p0, LD2/h;->d:LF2/b;

    .line 28
    iget-object v0, p1, LD2/j;->d:LD2/i;

    .line 29
    iput-object v0, p0, LD2/h;->e:LD2/i;

    .line 30
    iget-object v0, p1, LD2/j;->z:LD2/d;

    .line 31
    iget-object v1, v0, LD2/d;->c:LE2/d;

    .line 32
    iput-object v1, p0, LD2/h;->f:LE2/d;

    .line 33
    iget-object v1, p1, LD2/j;->g:Ljava/util/List;

    .line 34
    iput-object v1, p0, LD2/h;->g:Ljava/util/List;

    .line 35
    iget-object v1, p1, LD2/j;->i:Ld6/l;

    .line 36
    invoke-virtual {v1}, Ld6/l;->h()Lc3/c;

    move-result-object v1

    iput-object v1, p0, LD2/h;->h:Lc3/c;

    .line 37
    iget-object v1, p1, LD2/j;->j:LD2/s;

    .line 38
    iget-object v1, v1, LD2/s;->a:Ljava/util/Map;

    .line 39
    invoke-static {v1}, Ln5/x;->P(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    iput-object v1, p0, LD2/h;->i:Ljava/util/LinkedHashMap;

    .line 40
    iget-boolean v1, p1, LD2/j;->k:Z

    .line 41
    iput-boolean v1, p0, LD2/h;->j:Z

    .line 42
    iget-boolean v1, p1, LD2/j;->n:Z

    .line 43
    iput-boolean v1, p0, LD2/h;->k:Z

    .line 44
    iget-object v1, p1, LD2/j;->y:LD2/p;

    .line 45
    new-instance v2, LD2/o;

    invoke-direct {v2, v1}, LD2/o;-><init>(LD2/p;)V

    .line 46
    iput-object v2, p0, LD2/h;->l:LD2/o;

    .line 47
    iget-object v1, v0, LD2/d;->a:LE2/i;

    .line 48
    iput-object v1, p0, LD2/h;->m:LE2/i;

    .line 49
    iget-object v0, v0, LD2/d;->b:LE2/g;

    .line 50
    iput-object v0, p0, LD2/h;->n:LE2/g;

    .line 51
    iget-object v0, p1, LD2/j;->a:Landroid/content/Context;

    if-ne v0, p2, :cond_0

    .line 52
    iget-object p2, p1, LD2/j;->v:Landroidx/lifecycle/q;

    .line 53
    iput-object p2, p0, LD2/h;->o:Landroidx/lifecycle/q;

    .line 54
    iget-object p2, p1, LD2/j;->w:LE2/i;

    .line 55
    iput-object p2, p0, LD2/h;->p:LE2/i;

    .line 56
    iget-object p1, p1, LD2/j;->x:LE2/g;

    .line 57
    iput-object p1, p0, LD2/h;->q:LE2/g;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 58
    iput-object p1, p0, LD2/h;->o:Landroidx/lifecycle/q;

    .line 59
    iput-object p1, p0, LD2/h;->p:LE2/i;

    .line 60
    iput-object p1, p0, LD2/h;->q:LE2/g;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LD2/h;->a:Landroid/content/Context;

    .line 3
    sget-object p1, LH2/d;->a:LD2/c;

    .line 4
    iput-object p1, p0, LD2/h;->b:LD2/c;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, LD2/h;->c:Ljava/lang/Object;

    .line 6
    iput-object p1, p0, LD2/h;->d:LF2/b;

    .line 7
    iput-object p1, p0, LD2/h;->e:LD2/i;

    .line 8
    iput-object p1, p0, LD2/h;->f:LE2/d;

    .line 9
    sget-object v0, Ln5/s;->q:Ln5/s;

    iput-object v0, p0, LD2/h;->g:Ljava/util/List;

    .line 10
    iput-object p1, p0, LD2/h;->h:Lc3/c;

    .line 11
    iput-object p1, p0, LD2/h;->i:Ljava/util/LinkedHashMap;

    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, LD2/h;->j:Z

    .line 13
    iput-boolean v0, p0, LD2/h;->k:Z

    .line 14
    iput-object p1, p0, LD2/h;->l:LD2/o;

    .line 15
    iput-object p1, p0, LD2/h;->m:LE2/i;

    .line 16
    iput-object p1, p0, LD2/h;->n:LE2/g;

    .line 17
    iput-object p1, p0, LD2/h;->o:Landroidx/lifecycle/q;

    .line 18
    iput-object p1, p0, LD2/h;->p:LE2/i;

    .line 19
    iput-object p1, p0, LD2/h;->q:LE2/g;

    return-void
.end method


# virtual methods
.method public final a()LD2/j;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LD2/h;->c:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v1, LD2/l;->b:LD2/l;

    .line 8
    .line 9
    :cond_0
    move-object v4, v1

    .line 10
    iget-object v5, v0, LD2/h;->d:LF2/b;

    .line 11
    .line 12
    iget-object v6, v0, LD2/h;->e:LD2/i;

    .line 13
    .line 14
    iget-object v1, v0, LD2/h;->b:LD2/c;

    .line 15
    .line 16
    iget-object v7, v1, LD2/c;->g:Landroid/graphics/Bitmap$Config;

    .line 17
    .line 18
    iget-object v2, v0, LD2/h;->f:LE2/d;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    iget-object v2, v1, LD2/c;->f:LE2/d;

    .line 23
    .line 24
    :cond_1
    move-object v8, v2

    .line 25
    iget-object v10, v1, LD2/c;->e:LG2/a;

    .line 26
    .line 27
    iget-object v2, v0, LD2/h;->h:Lc3/c;

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v2}, Lc3/c;->d()Ld6/l;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 v2, 0x0

    .line 37
    :goto_0
    if-nez v2, :cond_3

    .line 38
    .line 39
    sget-object v2, LH2/f;->c:Ld6/l;

    .line 40
    .line 41
    :goto_1
    move-object v11, v2

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    sget-object v3, LH2/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :goto_2
    iget-object v2, v0, LD2/h;->i:Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    new-instance v3, LD2/s;

    .line 51
    .line 52
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/I1;->F0(Ljava/util/Map;)Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-direct {v3, v2}, LD2/s;-><init>(Ljava/util/Map;)V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    const/4 v3, 0x0

    .line 61
    :goto_3
    if-nez v3, :cond_5

    .line 62
    .line 63
    sget-object v3, LD2/s;->b:LD2/s;

    .line 64
    .line 65
    :cond_5
    move-object v12, v3

    .line 66
    iget-object v2, v0, LD2/h;->b:LD2/c;

    .line 67
    .line 68
    iget-boolean v14, v2, LD2/c;->h:Z

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v2, v0, LD2/h;->b:LD2/c;

    .line 74
    .line 75
    iget-object v3, v2, LD2/c;->i:LD2/b;

    .line 76
    .line 77
    iget-object v9, v2, LD2/c;->j:LD2/b;

    .line 78
    .line 79
    iget-object v13, v2, LD2/c;->k:LD2/b;

    .line 80
    .line 81
    iget-object v15, v2, LD2/c;->a:LM5/s;

    .line 82
    .line 83
    iget-object v1, v2, LD2/c;->b:LM5/s;

    .line 84
    .line 85
    move-object/from16 v21, v1

    .line 86
    .line 87
    iget-object v1, v2, LD2/c;->c:LM5/s;

    .line 88
    .line 89
    iget-object v2, v2, LD2/c;->d:LM5/s;

    .line 90
    .line 91
    move-object/from16 v22, v1

    .line 92
    .line 93
    iget-object v1, v0, LD2/h;->o:Landroidx/lifecycle/q;

    .line 94
    .line 95
    move-object/from16 v17, v3

    .line 96
    .line 97
    iget-object v3, v0, LD2/h;->a:Landroid/content/Context;

    .line 98
    .line 99
    if-nez v1, :cond_a

    .line 100
    .line 101
    iget-object v1, v0, LD2/h;->d:LF2/b;

    .line 102
    .line 103
    move-object/from16 v23, v2

    .line 104
    .line 105
    instance-of v2, v1, LF2/a;

    .line 106
    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    check-cast v1, LF2/a;

    .line 110
    .line 111
    iget-object v1, v1, LF2/a;->r:Landroid/widget/ImageView;

    .line 112
    .line 113
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    goto :goto_4

    .line 118
    :cond_6
    move-object v1, v3

    .line 119
    :goto_4
    instance-of v2, v1, Landroidx/lifecycle/x;

    .line 120
    .line 121
    if-eqz v2, :cond_7

    .line 122
    .line 123
    check-cast v1, Landroidx/lifecycle/x;

    .line 124
    .line 125
    invoke-interface {v1}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    goto :goto_5

    .line 130
    :cond_7
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 131
    .line 132
    if-nez v2, :cond_9

    .line 133
    .line 134
    const/4 v1, 0x0

    .line 135
    :goto_5
    if-nez v1, :cond_8

    .line 136
    .line 137
    sget-object v1, LD2/g;->b:LD2/g;

    .line 138
    .line 139
    :cond_8
    :goto_6
    move-object/from16 v24, v1

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_9
    check-cast v1, Landroid/content/ContextWrapper;

    .line 143
    .line 144
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    goto :goto_4

    .line 149
    :cond_a
    move-object/from16 v23, v2

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :goto_7
    iget-object v1, v0, LD2/h;->m:LE2/i;

    .line 153
    .line 154
    if-nez v1, :cond_e

    .line 155
    .line 156
    iget-object v1, v0, LD2/h;->p:LE2/i;

    .line 157
    .line 158
    if-nez v1, :cond_e

    .line 159
    .line 160
    iget-object v1, v0, LD2/h;->d:LF2/b;

    .line 161
    .line 162
    instance-of v2, v1, LF2/a;

    .line 163
    .line 164
    if-eqz v2, :cond_d

    .line 165
    .line 166
    check-cast v1, LF2/a;

    .line 167
    .line 168
    iget-object v1, v1, LF2/a;->r:Landroid/widget/ImageView;

    .line 169
    .line 170
    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    move-object/from16 v18, v4

    .line 175
    .line 176
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 177
    .line 178
    if-eq v2, v4, :cond_c

    .line 179
    .line 180
    sget-object v4, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 181
    .line 182
    if-ne v2, v4, :cond_b

    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_b
    new-instance v2, LE2/f;

    .line 186
    .line 187
    invoke-direct {v2, v1}, LE2/f;-><init>(Landroid/widget/ImageView;)V

    .line 188
    .line 189
    .line 190
    move-object v1, v2

    .line 191
    goto :goto_9

    .line 192
    :cond_c
    :goto_8
    sget-object v1, LE2/h;->c:LE2/h;

    .line 193
    .line 194
    new-instance v1, LE2/e;

    .line 195
    .line 196
    invoke-direct {v1}, LE2/e;-><init>()V

    .line 197
    .line 198
    .line 199
    goto :goto_9

    .line 200
    :cond_d
    move-object/from16 v18, v4

    .line 201
    .line 202
    new-instance v1, LE2/c;

    .line 203
    .line 204
    invoke-direct {v1, v3}, LE2/c;-><init>(Landroid/content/Context;)V

    .line 205
    .line 206
    .line 207
    :goto_9
    move-object/from16 v25, v1

    .line 208
    .line 209
    goto :goto_a

    .line 210
    :cond_e
    move-object/from16 v18, v4

    .line 211
    .line 212
    goto :goto_9

    .line 213
    :goto_a
    iget-object v1, v0, LD2/h;->n:LE2/g;

    .line 214
    .line 215
    if-nez v1, :cond_15

    .line 216
    .line 217
    iget-object v1, v0, LD2/h;->q:LE2/g;

    .line 218
    .line 219
    if-nez v1, :cond_15

    .line 220
    .line 221
    iget-object v1, v0, LD2/h;->m:LE2/i;

    .line 222
    .line 223
    instance-of v2, v1, LE2/f;

    .line 224
    .line 225
    if-eqz v2, :cond_f

    .line 226
    .line 227
    check-cast v1, LE2/f;

    .line 228
    .line 229
    goto :goto_b

    .line 230
    :cond_f
    const/4 v1, 0x0

    .line 231
    :goto_b
    if-eqz v1, :cond_10

    .line 232
    .line 233
    iget-object v1, v1, LE2/f;->q:Landroid/widget/ImageView;

    .line 234
    .line 235
    goto :goto_d

    .line 236
    :cond_10
    iget-object v1, v0, LD2/h;->d:LF2/b;

    .line 237
    .line 238
    instance-of v2, v1, LF2/a;

    .line 239
    .line 240
    if-eqz v2, :cond_11

    .line 241
    .line 242
    check-cast v1, LF2/a;

    .line 243
    .line 244
    goto :goto_c

    .line 245
    :cond_11
    const/4 v1, 0x0

    .line 246
    :goto_c
    if-eqz v1, :cond_12

    .line 247
    .line 248
    iget-object v1, v1, LF2/a;->r:Landroid/widget/ImageView;

    .line 249
    .line 250
    goto :goto_d

    .line 251
    :cond_12
    const/4 v1, 0x0

    .line 252
    :goto_d
    sget-object v2, LE2/g;->r:LE2/g;

    .line 253
    .line 254
    if-eqz v1, :cond_14

    .line 255
    .line 256
    sget-object v4, LH2/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 257
    .line 258
    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    if-nez v1, :cond_13

    .line 263
    .line 264
    const/4 v1, -0x1

    .line 265
    goto :goto_e

    .line 266
    :cond_13
    sget-object v4, LH2/e;->a:[I

    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    aget v1, v4, v1

    .line 273
    .line 274
    :goto_e
    const/4 v4, 0x1

    .line 275
    if-eq v1, v4, :cond_14

    .line 276
    .line 277
    const/4 v4, 0x2

    .line 278
    if-eq v1, v4, :cond_14

    .line 279
    .line 280
    const/4 v4, 0x3

    .line 281
    if-eq v1, v4, :cond_14

    .line 282
    .line 283
    const/4 v4, 0x4

    .line 284
    if-eq v1, v4, :cond_14

    .line 285
    .line 286
    sget-object v1, LE2/g;->q:LE2/g;

    .line 287
    .line 288
    goto :goto_f

    .line 289
    :cond_14
    move-object v1, v2

    .line 290
    :cond_15
    :goto_f
    move-object/from16 v26, v1

    .line 291
    .line 292
    iget-object v1, v0, LD2/h;->l:LD2/o;

    .line 293
    .line 294
    if-eqz v1, :cond_16

    .line 295
    .line 296
    new-instance v2, LD2/p;

    .line 297
    .line 298
    iget-object v1, v1, LD2/o;->a:Ljava/util/LinkedHashMap;

    .line 299
    .line 300
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/I1;->F0(Ljava/util/Map;)Ljava/util/Map;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-direct {v2, v1}, LD2/p;-><init>(Ljava/util/Map;)V

    .line 305
    .line 306
    .line 307
    move-object v1, v2

    .line 308
    goto :goto_10

    .line 309
    :cond_16
    const/4 v1, 0x0

    .line 310
    :goto_10
    if-nez v1, :cond_17

    .line 311
    .line 312
    sget-object v1, LD2/p;->r:LD2/p;

    .line 313
    .line 314
    :cond_17
    move-object/from16 v27, v1

    .line 315
    .line 316
    new-instance v1, LD2/d;

    .line 317
    .line 318
    iget-object v2, v0, LD2/h;->m:LE2/i;

    .line 319
    .line 320
    iget-object v4, v0, LD2/h;->n:LE2/g;

    .line 321
    .line 322
    move-object/from16 v16, v3

    .line 323
    .line 324
    iget-object v3, v0, LD2/h;->f:LE2/d;

    .line 325
    .line 326
    invoke-direct {v1, v2, v4, v3}, LD2/d;-><init>(LE2/i;LE2/g;LE2/d;)V

    .line 327
    .line 328
    .line 329
    iget-object v2, v0, LD2/h;->b:LD2/c;

    .line 330
    .line 331
    move-object/from16 v29, v2

    .line 332
    .line 333
    new-instance v2, LD2/j;

    .line 334
    .line 335
    move-object/from16 v4, v18

    .line 336
    .line 337
    move-object/from16 v18, v9

    .line 338
    .line 339
    iget-object v9, v0, LD2/h;->g:Ljava/util/List;

    .line 340
    .line 341
    move-object/from16 v19, v13

    .line 342
    .line 343
    iget-boolean v13, v0, LD2/h;->j:Z

    .line 344
    .line 345
    move-object/from16 v20, v15

    .line 346
    .line 347
    const/4 v15, 0x0

    .line 348
    iget-boolean v3, v0, LD2/h;->k:Z

    .line 349
    .line 350
    move-object/from16 v28, v16

    .line 351
    .line 352
    move/from16 v16, v3

    .line 353
    .line 354
    move-object/from16 v3, v28

    .line 355
    .line 356
    move-object/from16 v28, v1

    .line 357
    .line 358
    invoke-direct/range {v2 .. v29}, LD2/j;-><init>(Landroid/content/Context;Ljava/lang/Object;LF2/b;LD2/i;Landroid/graphics/Bitmap$Config;LE2/d;Ljava/util/List;LG2/a;Ld6/l;LD2/s;ZZZZLD2/b;LD2/b;LD2/b;LM5/s;LM5/s;LM5/s;LM5/s;Landroidx/lifecycle/q;LE2/i;LE2/g;LD2/p;LD2/d;LD2/c;)V

    .line 359
    .line 360
    .line 361
    return-object v2
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LD2/h;->o:Landroidx/lifecycle/q;

    .line 3
    .line 4
    iput-object v0, p0, LD2/h;->p:LE2/i;

    .line 5
    .line 6
    iput-object v0, p0, LD2/h;->q:LE2/g;

    .line 7
    .line 8
    return-void
.end method
