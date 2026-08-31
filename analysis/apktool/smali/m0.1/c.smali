.class public final Lm0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm0/e;

.field public b:LW0/c;

.field public c:LW0/l;

.field public d:Lkotlin/jvm/internal/n;

.field public final e:Lm0/a;

.field public f:Landroid/graphics/Outline;

.field public g:Z

.field public h:J

.field public i:J

.field public j:F

.field public k:Lj0/B;

.field public l:Lj0/A;

.field public m:Lj0/g;

.field public n:Z

.field public o:Ll0/b;

.field public p:LW1/d;

.field public q:I

.field public final r:LL/s;

.field public s:Z

.field public t:J

.field public u:J

.field public v:J

.field public w:Z

.field public x:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lm0/k;->a:I

    .line 2
    .line 3
    sget v0, Lm0/k;->a:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Lm0/e;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/c;->a:Lm0/e;

    .line 5
    .line 6
    sget-object v0, Ll0/c;->a:LW0/d;

    .line 7
    .line 8
    iput-object v0, p0, Lm0/c;->b:LW0/c;

    .line 9
    .line 10
    sget-object v0, LW0/l;->q:LW0/l;

    .line 11
    .line 12
    iput-object v0, p0, Lm0/c;->c:LW0/l;

    .line 13
    .line 14
    sget-object v0, Lm0/b;->r:Lm0/b;

    .line 15
    .line 16
    iput-object v0, p0, Lm0/c;->d:Lkotlin/jvm/internal/n;

    .line 17
    .line 18
    new-instance v0, Lm0/a;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1, p0}, Lm0/a;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lm0/c;->e:Lm0/a;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lm0/c;->g:Z

    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    iput-wide v0, p0, Lm0/c;->h:J

    .line 32
    .line 33
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iput-wide v2, p0, Lm0/c;->i:J

    .line 39
    .line 40
    new-instance v4, LL/s;

    .line 41
    .line 42
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v4, p0, Lm0/c;->r:LL/s;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-interface {p1, v4}, Lm0/e;->u(Z)V

    .line 49
    .line 50
    .line 51
    iput-wide v0, p0, Lm0/c;->t:J

    .line 52
    .line 53
    iput-wide v0, p0, Lm0/c;->u:J

    .line 54
    .line 55
    iput-wide v2, p0, Lm0/c;->v:J

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lm0/c;->g:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_10

    .line 7
    .line 8
    iget-boolean v1, v0, Lm0/c;->w:Z

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    iget-object v4, v0, Lm0/c;->a:Lm0/e;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v4}, Lm0/e;->E()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v5, 0x0

    .line 20
    cmpl-float v1, v1, v5

    .line 21
    .line 22
    if-lez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {v4, v2}, Lm0/e;->u(Z)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    invoke-interface {v4, v3, v5, v6}, Lm0/e;->r(Landroid/graphics/Outline;J)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget-object v1, v0, Lm0/c;->l:Lj0/A;

    .line 36
    .line 37
    const-wide v5, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/16 v7, 0x20

    .line 43
    .line 44
    if-eqz v1, :cond_d

    .line 45
    .line 46
    iget-object v8, v0, Lm0/c;->x:Landroid/graphics/RectF;

    .line 47
    .line 48
    if-nez v8, :cond_2

    .line 49
    .line 50
    new-instance v8, Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v8, v0, Lm0/c;->x:Landroid/graphics/RectF;

    .line 56
    .line 57
    :cond_2
    instance-of v9, v1, Lj0/g;

    .line 58
    .line 59
    const-string v10, "Unable to obtain android.graphics.Path"

    .line 60
    .line 61
    if-eqz v9, :cond_c

    .line 62
    .line 63
    move-object v11, v1

    .line 64
    check-cast v11, Lj0/g;

    .line 65
    .line 66
    iget-object v11, v11, Lj0/g;->a:Landroid/graphics/Path;

    .line 67
    .line 68
    invoke-virtual {v11, v8, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 69
    .line 70
    .line 71
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v13, 0x1c

    .line 74
    .line 75
    const/4 v14, 0x1

    .line 76
    if-gt v12, v13, :cond_5

    .line 77
    .line 78
    move-object v13, v1

    .line 79
    check-cast v13, Lj0/g;

    .line 80
    .line 81
    iget-object v13, v13, Lj0/g;->a:Landroid/graphics/Path;

    .line 82
    .line 83
    invoke-virtual {v13}, Landroid/graphics/Path;->isConvex()Z

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    if-eqz v13, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    iget-object v9, v0, Lm0/c;->f:Landroid/graphics/Outline;

    .line 91
    .line 92
    if-eqz v9, :cond_4

    .line 93
    .line 94
    invoke-virtual {v9}, Landroid/graphics/Outline;->setEmpty()V

    .line 95
    .line 96
    .line 97
    :cond_4
    iput-boolean v14, v0, Lm0/c;->n:Z

    .line 98
    .line 99
    move-object v13, v3

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    :goto_1
    iget-object v13, v0, Lm0/c;->f:Landroid/graphics/Outline;

    .line 102
    .line 103
    if-nez v13, :cond_6

    .line 104
    .line 105
    new-instance v13, Landroid/graphics/Outline;

    .line 106
    .line 107
    invoke-direct {v13}, Landroid/graphics/Outline;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object v13, v0, Lm0/c;->f:Landroid/graphics/Outline;

    .line 111
    .line 112
    :cond_6
    const/16 v15, 0x1e

    .line 113
    .line 114
    if-lt v12, v15, :cond_8

    .line 115
    .line 116
    if-eqz v9, :cond_7

    .line 117
    .line 118
    invoke-static {v13, v11}, LC0/D0;->n(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_7
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 123
    .line 124
    invoke-direct {v1, v10}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v1

    .line 128
    :cond_8
    if-eqz v9, :cond_b

    .line 129
    .line 130
    invoke-virtual {v13, v11}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    .line 131
    .line 132
    .line 133
    :goto_2
    invoke-virtual {v13}, Landroid/graphics/Outline;->canClip()Z

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    xor-int/2addr v9, v14

    .line 138
    iput-boolean v9, v0, Lm0/c;->n:Z

    .line 139
    .line 140
    :goto_3
    iput-object v1, v0, Lm0/c;->l:Lj0/A;

    .line 141
    .line 142
    if-eqz v13, :cond_9

    .line 143
    .line 144
    invoke-interface {v4}, Lm0/e;->c()F

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-virtual {v13, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 149
    .line 150
    .line 151
    move-object v3, v13

    .line 152
    :cond_9
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    invoke-virtual {v8}, Landroid/graphics/RectF;->height()F

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    int-to-long v9, v1

    .line 169
    shl-long/2addr v9, v7

    .line 170
    int-to-long v7, v8

    .line 171
    and-long/2addr v5, v7

    .line 172
    or-long/2addr v5, v9

    .line 173
    invoke-interface {v4, v3, v5, v6}, Lm0/e;->r(Landroid/graphics/Outline;J)V

    .line 174
    .line 175
    .line 176
    iget-boolean v1, v0, Lm0/c;->n:Z

    .line 177
    .line 178
    if-eqz v1, :cond_a

    .line 179
    .line 180
    iget-boolean v1, v0, Lm0/c;->w:Z

    .line 181
    .line 182
    if-eqz v1, :cond_a

    .line 183
    .line 184
    invoke-interface {v4, v2}, Lm0/e;->u(Z)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v4}, Lm0/e;->i()V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_5

    .line 191
    .line 192
    :cond_a
    iget-boolean v1, v0, Lm0/c;->w:Z

    .line 193
    .line 194
    invoke-interface {v4, v1}, Lm0/e;->u(Z)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_5

    .line 198
    .line 199
    :cond_b
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 200
    .line 201
    invoke-direct {v1, v10}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v1

    .line 205
    :cond_c
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 206
    .line 207
    invoke-direct {v1, v10}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v1

    .line 211
    :cond_d
    iget-boolean v1, v0, Lm0/c;->w:Z

    .line 212
    .line 213
    invoke-interface {v4, v1}, Lm0/e;->u(Z)V

    .line 214
    .line 215
    .line 216
    iget-object v1, v0, Lm0/c;->f:Landroid/graphics/Outline;

    .line 217
    .line 218
    if-nez v1, :cond_e

    .line 219
    .line 220
    new-instance v1, Landroid/graphics/Outline;

    .line 221
    .line 222
    invoke-direct {v1}, Landroid/graphics/Outline;-><init>()V

    .line 223
    .line 224
    .line 225
    iput-object v1, v0, Lm0/c;->f:Landroid/graphics/Outline;

    .line 226
    .line 227
    :cond_e
    move-object v8, v1

    .line 228
    iget-wide v9, v0, Lm0/c;->u:J

    .line 229
    .line 230
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/measurement/P1;->d0(J)J

    .line 231
    .line 232
    .line 233
    move-result-wide v9

    .line 234
    iget-wide v11, v0, Lm0/c;->h:J

    .line 235
    .line 236
    iget-wide v13, v0, Lm0/c;->i:J

    .line 237
    .line 238
    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    cmp-long v1, v13, v15

    .line 244
    .line 245
    if-nez v1, :cond_f

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_f
    move-wide v9, v13

    .line 249
    :goto_4
    shr-long v13, v11, v7

    .line 250
    .line 251
    long-to-int v1, v13

    .line 252
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    and-long/2addr v11, v5

    .line 261
    long-to-int v11, v11

    .line 262
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 263
    .line 264
    .line 265
    move-result v12

    .line 266
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 267
    .line 268
    .line 269
    move-result v12

    .line 270
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    shr-long v13, v9, v7

    .line 275
    .line 276
    long-to-int v14, v13

    .line 277
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    add-float/2addr v13, v1

    .line 282
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    and-long/2addr v9, v5

    .line 291
    long-to-int v15, v9

    .line 292
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 293
    .line 294
    .line 295
    move-result v9

    .line 296
    add-float/2addr v9, v11

    .line 297
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    iget v13, v0, Lm0/c;->j:F

    .line 302
    .line 303
    move v11, v1

    .line 304
    move v10, v12

    .line 305
    move v12, v9

    .line 306
    move v9, v3

    .line 307
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 308
    .line 309
    .line 310
    invoke-interface {v4}, Lm0/e;->c()F

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    invoke-virtual {v8, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 315
    .line 316
    .line 317
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    int-to-long v9, v1

    .line 334
    shl-long/2addr v9, v7

    .line 335
    int-to-long v11, v3

    .line 336
    and-long/2addr v5, v11

    .line 337
    or-long/2addr v5, v9

    .line 338
    invoke-interface {v4, v8, v5, v6}, Lm0/e;->r(Landroid/graphics/Outline;J)V

    .line 339
    .line 340
    .line 341
    :cond_10
    :goto_5
    iput-boolean v2, v0, Lm0/c;->g:Z

    .line 342
    .line 343
    return-void
.end method

.method public final b()V
    .locals 15

    .line 1
    iget-boolean v0, p0, Lm0/c;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget v0, p0, Lm0/c;->q:I

    .line 6
    .line 7
    if-nez v0, :cond_6

    .line 8
    .line 9
    iget-object v0, p0, Lm0/c;->r:LL/s;

    .line 10
    .line 11
    iget-object v1, v0, LL/s;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lm0/c;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lm0/c;->e()V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-object v1, v0, LL/s;->b:Ljava/lang/Object;

    .line 22
    .line 23
    :cond_0
    iget-object v0, v0, LL/s;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lr/H;

    .line 26
    .line 27
    if-eqz v0, :cond_5

    .line 28
    .line 29
    iget-object v1, v0, Lr/H;->b:[Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v2, v0, Lr/H;->a:[J

    .line 32
    .line 33
    array-length v3, v2

    .line 34
    add-int/lit8 v3, v3, -0x2

    .line 35
    .line 36
    if-ltz v3, :cond_4

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    move v5, v4

    .line 40
    :goto_0
    aget-wide v6, v2, v5

    .line 41
    .line 42
    not-long v8, v6

    .line 43
    const/4 v10, 0x7

    .line 44
    shl-long/2addr v8, v10

    .line 45
    and-long/2addr v8, v6

    .line 46
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    and-long/2addr v8, v10

    .line 52
    cmp-long v8, v8, v10

    .line 53
    .line 54
    if-eqz v8, :cond_3

    .line 55
    .line 56
    sub-int v8, v5, v3

    .line 57
    .line 58
    not-int v8, v8

    .line 59
    ushr-int/lit8 v8, v8, 0x1f

    .line 60
    .line 61
    const/16 v9, 0x8

    .line 62
    .line 63
    rsub-int/lit8 v8, v8, 0x8

    .line 64
    .line 65
    move v10, v4

    .line 66
    :goto_1
    if-ge v10, v8, :cond_2

    .line 67
    .line 68
    const-wide/16 v11, 0xff

    .line 69
    .line 70
    and-long/2addr v11, v6

    .line 71
    const-wide/16 v13, 0x80

    .line 72
    .line 73
    cmp-long v11, v11, v13

    .line 74
    .line 75
    if-gez v11, :cond_1

    .line 76
    .line 77
    shl-int/lit8 v11, v5, 0x3

    .line 78
    .line 79
    add-int/2addr v11, v10

    .line 80
    aget-object v11, v1, v11

    .line 81
    .line 82
    check-cast v11, Lm0/c;

    .line 83
    .line 84
    invoke-virtual {v11}, Lm0/c;->e()V

    .line 85
    .line 86
    .line 87
    :cond_1
    shr-long/2addr v6, v9

    .line 88
    add-int/lit8 v10, v10, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    if-ne v8, v9, :cond_4

    .line 92
    .line 93
    :cond_3
    if-eq v5, v3, :cond_4

    .line 94
    .line 95
    add-int/lit8 v5, v5, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    invoke-virtual {v0}, Lr/H;->b()V

    .line 99
    .line 100
    .line 101
    :cond_5
    iget-object v0, p0, Lm0/c;->a:Lm0/e;

    .line 102
    .line 103
    invoke-interface {v0}, Lm0/e;->i()V

    .line 104
    .line 105
    .line 106
    :cond_6
    return-void
.end method

.method public final c(Ll0/d;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lm0/c;->r:LL/s;

    .line 2
    .line 3
    iget-object v1, v0, LL/s;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lm0/c;

    .line 6
    .line 7
    iput-object v1, v0, LL/s;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v1, v0, LL/s;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lr/H;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Lr/H;->h()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, v0, LL/s;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lr/H;

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    sget v2, Lr/P;->a:I

    .line 28
    .line 29
    new-instance v2, Lr/H;

    .line 30
    .line 31
    invoke-direct {v2}, Lr/H;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, v0, LL/s;->e:Ljava/lang/Object;

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v2, v1}, Lr/H;->k(Lr/H;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lr/H;->b()V

    .line 40
    .line 41
    .line 42
    :cond_1
    const/4 v1, 0x1

    .line 43
    iput-boolean v1, v0, LL/s;->a:Z

    .line 44
    .line 45
    iget-object v1, p0, Lm0/c;->d:Lkotlin/jvm/internal/n;

    .line 46
    .line 47
    invoke-interface {v1, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-boolean p1, v0, LL/s;->a:Z

    .line 52
    .line 53
    iget-object v1, v0, LL/s;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lm0/c;

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {v1}, Lm0/c;->e()V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v0, v0, LL/s;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lr/H;

    .line 65
    .line 66
    if-eqz v0, :cond_7

    .line 67
    .line 68
    invoke-virtual {v0}, Lr/H;->h()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_7

    .line 73
    .line 74
    iget-object v1, v0, Lr/H;->b:[Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v2, v0, Lr/H;->a:[J

    .line 77
    .line 78
    array-length v3, v2

    .line 79
    add-int/lit8 v3, v3, -0x2

    .line 80
    .line 81
    if-ltz v3, :cond_6

    .line 82
    .line 83
    move v4, p1

    .line 84
    :goto_0
    aget-wide v5, v2, v4

    .line 85
    .line 86
    not-long v7, v5

    .line 87
    const/4 v9, 0x7

    .line 88
    shl-long/2addr v7, v9

    .line 89
    and-long/2addr v7, v5

    .line 90
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    and-long/2addr v7, v9

    .line 96
    cmp-long v7, v7, v9

    .line 97
    .line 98
    if-eqz v7, :cond_5

    .line 99
    .line 100
    sub-int v7, v4, v3

    .line 101
    .line 102
    not-int v7, v7

    .line 103
    ushr-int/lit8 v7, v7, 0x1f

    .line 104
    .line 105
    const/16 v8, 0x8

    .line 106
    .line 107
    rsub-int/lit8 v7, v7, 0x8

    .line 108
    .line 109
    move v9, p1

    .line 110
    :goto_1
    if-ge v9, v7, :cond_4

    .line 111
    .line 112
    const-wide/16 v10, 0xff

    .line 113
    .line 114
    and-long/2addr v10, v5

    .line 115
    const-wide/16 v12, 0x80

    .line 116
    .line 117
    cmp-long v10, v10, v12

    .line 118
    .line 119
    if-gez v10, :cond_3

    .line 120
    .line 121
    shl-int/lit8 v10, v4, 0x3

    .line 122
    .line 123
    add-int/2addr v10, v9

    .line 124
    aget-object v10, v1, v10

    .line 125
    .line 126
    check-cast v10, Lm0/c;

    .line 127
    .line 128
    invoke-virtual {v10}, Lm0/c;->e()V

    .line 129
    .line 130
    .line 131
    :cond_3
    shr-long/2addr v5, v8

    .line 132
    add-int/lit8 v9, v9, 0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    if-ne v7, v8, :cond_6

    .line 136
    .line 137
    :cond_5
    if-eq v4, v3, :cond_6

    .line 138
    .line 139
    add-int/lit8 v4, v4, 0x1

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_6
    invoke-virtual {v0}, Lr/H;->b()V

    .line 143
    .line 144
    .line 145
    :cond_7
    return-void
.end method

.method public final d()Lj0/B;
    .locals 14

    .line 1
    iget-object v0, p0, Lm0/c;->k:Lj0/B;

    .line 2
    .line 3
    iget-object v1, p0, Lm0/c;->l:Lj0/A;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    if-eqz v1, :cond_1

    .line 9
    .line 10
    new-instance v0, Lj0/x;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lj0/x;-><init>(Lj0/A;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lm0/c;->k:Lj0/B;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    iget-wide v0, p0, Lm0/c;->u:J

    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->d0(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iget-wide v2, p0, Lm0/c;->h:J

    .line 25
    .line 26
    iget-wide v4, p0, Lm0/c;->i:J

    .line 27
    .line 28
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmp-long v6, v4, v6

    .line 34
    .line 35
    if-nez v6, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-wide v0, v4

    .line 39
    :goto_0
    const/16 v4, 0x20

    .line 40
    .line 41
    shr-long v5, v2, v4

    .line 42
    .line 43
    long-to-int v5, v5

    .line 44
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    const-wide v7, 0xffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long/2addr v2, v7

    .line 54
    long-to-int v2, v2

    .line 55
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    shr-long v9, v0, v4

    .line 60
    .line 61
    long-to-int v3, v9

    .line 62
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    add-float/2addr v3, v6

    .line 67
    and-long/2addr v0, v7

    .line 68
    long-to-int v0, v0

    .line 69
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    add-float v9, v0, v2

    .line 74
    .line 75
    iget v0, p0, Lm0/c;->j:F

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    cmpl-float v1, v0, v1

    .line 79
    .line 80
    if-lez v1, :cond_3

    .line 81
    .line 82
    new-instance v1, Lj0/z;

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    int-to-long v10, v5

    .line 89
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    int-to-long v12, v0

    .line 94
    shl-long v4, v10, v4

    .line 95
    .line 96
    and-long/2addr v7, v12

    .line 97
    or-long v10, v4, v7

    .line 98
    .line 99
    move v7, v2

    .line 100
    move v8, v3

    .line 101
    invoke-static/range {v6 .. v11}, Ll6/d;->h(FFFFJ)Li0/d;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-direct {v1, v0}, Lj0/z;-><init>(Li0/d;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    move v7, v2

    .line 110
    move v8, v3

    .line 111
    new-instance v1, Lj0/y;

    .line 112
    .line 113
    new-instance v0, Li0/c;

    .line 114
    .line 115
    invoke-direct {v0, v6, v7, v8, v9}, Li0/c;-><init>(FFFF)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v1, v0}, Lj0/y;-><init>(Li0/c;)V

    .line 119
    .line 120
    .line 121
    :goto_1
    iput-object v1, p0, Lm0/c;->k:Lj0/B;

    .line 122
    .line 123
    return-object v1
.end method

.method public final e()V
    .locals 1

    .line 1
    iget v0, p0, Lm0/c;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lm0/c;->q:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lm0/c;->b()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final f(FJJ)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lm0/c;->h:J

    .line 2
    .line 3
    invoke-static {v0, v1, p2, p3}, Li0/b;->b(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-wide v0, p0, Lm0/c;->i:J

    .line 10
    .line 11
    invoke-static {v0, v1, p4, p5}, Li0/e;->a(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v0, p0, Lm0/c;->j:F

    .line 18
    .line 19
    cmpg-float v0, v0, p1

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lm0/c;->l:Lj0/A;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lm0/c;->k:Lj0/B;

    .line 31
    .line 32
    iput-object v0, p0, Lm0/c;->l:Lj0/A;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lm0/c;->g:Z

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lm0/c;->n:Z

    .line 39
    .line 40
    iput-wide p2, p0, Lm0/c;->h:J

    .line 41
    .line 42
    iput-wide p4, p0, Lm0/c;->i:J

    .line 43
    .line 44
    iput p1, p0, Lm0/c;->j:F

    .line 45
    .line 46
    invoke-virtual {p0}, Lm0/c;->a()V

    .line 47
    .line 48
    .line 49
    return-void
.end method
