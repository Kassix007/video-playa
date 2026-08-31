.class public final Lr2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final p:Landroid/graphics/Matrix;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Matrix;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/PathMeasure;

.field public final g:Lr2/i;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/Boolean;

.field public final o:Lr/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr2/l;->p:Landroid/graphics/Matrix;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lr2/l;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lr2/l;->h:F

    .line 4
    iput v0, p0, Lr2/l;->i:F

    .line 5
    iput v0, p0, Lr2/l;->j:F

    .line 6
    iput v0, p0, Lr2/l;->k:F

    const/16 v0, 0xff

    .line 7
    iput v0, p0, Lr2/l;->l:I

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lr2/l;->m:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lr2/l;->n:Ljava/lang/Boolean;

    .line 10
    new-instance v0, Lr/e;

    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lr/Q;-><init>(I)V

    .line 12
    iput-object v0, p0, Lr2/l;->o:Lr/e;

    .line 13
    new-instance v0, Lr2/i;

    invoke-direct {v0}, Lr2/i;-><init>()V

    iput-object v0, p0, Lr2/l;->g:Lr2/i;

    .line 14
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lr2/l;->a:Landroid/graphics/Path;

    .line 15
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lr2/l;->b:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Lr2/l;)V
    .locals 3

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lr2/l;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 18
    iput v0, p0, Lr2/l;->h:F

    .line 19
    iput v0, p0, Lr2/l;->i:F

    .line 20
    iput v0, p0, Lr2/l;->j:F

    .line 21
    iput v0, p0, Lr2/l;->k:F

    const/16 v0, 0xff

    .line 22
    iput v0, p0, Lr2/l;->l:I

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lr2/l;->m:Ljava/lang/String;

    .line 24
    iput-object v0, p0, Lr2/l;->n:Ljava/lang/Boolean;

    .line 25
    new-instance v0, Lr/e;

    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, v1}, Lr/Q;-><init>(I)V

    .line 27
    iput-object v0, p0, Lr2/l;->o:Lr/e;

    .line 28
    new-instance v1, Lr2/i;

    iget-object v2, p1, Lr2/l;->g:Lr2/i;

    invoke-direct {v1, v2, v0}, Lr2/i;-><init>(Lr2/i;Lr/e;)V

    iput-object v1, p0, Lr2/l;->g:Lr2/i;

    .line 29
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Lr2/l;->a:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Lr2/l;->a:Landroid/graphics/Path;

    .line 30
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Lr2/l;->b:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Lr2/l;->b:Landroid/graphics/Path;

    .line 31
    iget v1, p1, Lr2/l;->h:F

    iput v1, p0, Lr2/l;->h:F

    .line 32
    iget v1, p1, Lr2/l;->i:F

    iput v1, p0, Lr2/l;->i:F

    .line 33
    iget v1, p1, Lr2/l;->j:F

    iput v1, p0, Lr2/l;->j:F

    .line 34
    iget v1, p1, Lr2/l;->k:F

    iput v1, p0, Lr2/l;->k:F

    .line 35
    iget v1, p1, Lr2/l;->l:I

    iput v1, p0, Lr2/l;->l:I

    .line 36
    iget-object v1, p1, Lr2/l;->m:Ljava/lang/String;

    iput-object v1, p0, Lr2/l;->m:Ljava/lang/String;

    .line 37
    iget-object v1, p1, Lr2/l;->m:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 38
    invoke-virtual {v0, v1, p0}, Lr/Q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    :cond_0
    iget-object p1, p1, Lr2/l;->n:Ljava/lang/Boolean;

    iput-object p1, p0, Lr2/l;->n:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a(Lr2/i;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Lr2/i;->a:Landroid/graphics/Matrix;

    .line 4
    .line 5
    iget-object v6, v0, Lr2/i;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Lr2/i;->a:Landroid/graphics/Matrix;

    .line 13
    .line 14
    iget-object v0, v0, Lr2/i;->j:Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    .line 20
    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move v8, v7

    .line 24
    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ge v8, v0, :cond_16

    .line 29
    .line 30
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lr2/j;

    .line 35
    .line 36
    instance-of v1, v0, Lr2/i;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    move-object v1, v0

    .line 41
    check-cast v1, Lr2/i;

    .line 42
    .line 43
    move-object/from16 v0, p0

    .line 44
    .line 45
    move-object/from16 v3, p3

    .line 46
    .line 47
    move/from16 v4, p4

    .line 48
    .line 49
    move/from16 v5, p5

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v5}, Lr2/l;->a(Lr2/i;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    .line 52
    .line 53
    .line 54
    move-object v1, v0

    .line 55
    :goto_1
    move/from16 v9, p5

    .line 56
    .line 57
    move/from16 v18, v8

    .line 58
    .line 59
    goto/16 :goto_c

    .line 60
    .line 61
    :cond_0
    move-object/from16 v1, p0

    .line 62
    .line 63
    move-object/from16 v3, p3

    .line 64
    .line 65
    instance-of v4, v0, Lr2/k;

    .line 66
    .line 67
    if-eqz v4, :cond_14

    .line 68
    .line 69
    check-cast v0, Lr2/k;

    .line 70
    .line 71
    move/from16 v4, p4

    .line 72
    .line 73
    int-to-float v5, v4

    .line 74
    iget v9, v1, Lr2/l;->j:F

    .line 75
    .line 76
    div-float/2addr v5, v9

    .line 77
    move/from16 v9, p5

    .line 78
    .line 79
    int-to-float v10, v9

    .line 80
    iget v11, v1, Lr2/l;->k:F

    .line 81
    .line 82
    div-float/2addr v10, v11

    .line 83
    invoke-static {v5, v10}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    iget-object v12, v1, Lr2/l;->c:Landroid/graphics/Matrix;

    .line 88
    .line 89
    invoke-virtual {v12, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12, v5, v10}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 93
    .line 94
    .line 95
    const/4 v5, 0x4

    .line 96
    new-array v5, v5, [F

    .line 97
    .line 98
    fill-array-data v5, :array_0

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v5}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 102
    .line 103
    .line 104
    aget v10, v5, v7

    .line 105
    .line 106
    float-to-double v13, v10

    .line 107
    const/4 v10, 0x1

    .line 108
    aget v15, v5, v10

    .line 109
    .line 110
    move/from16 p2, v10

    .line 111
    .line 112
    move/from16 p1, v11

    .line 113
    .line 114
    float-to-double v10, v15

    .line 115
    invoke-static {v13, v14, v10, v11}, Ljava/lang/Math;->hypot(DD)D

    .line 116
    .line 117
    .line 118
    move-result-wide v10

    .line 119
    double-to-float v10, v10

    .line 120
    const/4 v11, 0x2

    .line 121
    aget v13, v5, v11

    .line 122
    .line 123
    float-to-double v13, v13

    .line 124
    const/4 v15, 0x3

    .line 125
    move/from16 v16, v11

    .line 126
    .line 127
    aget v11, v5, v15

    .line 128
    .line 129
    move/from16 v17, v7

    .line 130
    .line 131
    move/from16 v18, v8

    .line 132
    .line 133
    float-to-double v7, v11

    .line 134
    invoke-static {v13, v14, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    .line 135
    .line 136
    .line 137
    move-result-wide v7

    .line 138
    double-to-float v7, v7

    .line 139
    aget v8, v5, v17

    .line 140
    .line 141
    aget v11, v5, p2

    .line 142
    .line 143
    aget v13, v5, v16

    .line 144
    .line 145
    aget v5, v5, v15

    .line 146
    .line 147
    mul-float/2addr v8, v5

    .line 148
    mul-float/2addr v11, v13

    .line 149
    sub-float/2addr v8, v11

    .line 150
    invoke-static {v10, v7}, Ljava/lang/Math;->max(FF)F

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    const/4 v7, 0x0

    .line 155
    cmpl-float v10, v5, v7

    .line 156
    .line 157
    if-lez v10, :cond_1

    .line 158
    .line 159
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    div-float/2addr v8, v5

    .line 164
    goto :goto_2

    .line 165
    :cond_1
    move v8, v7

    .line 166
    :goto_2
    cmpl-float v5, v8, v7

    .line 167
    .line 168
    if-nez v5, :cond_2

    .line 169
    .line 170
    goto/16 :goto_c

    .line 171
    .line 172
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v5, v1, Lr2/l;->a:Landroid/graphics/Path;

    .line 176
    .line 177
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 178
    .line 179
    .line 180
    iget-object v10, v0, Lr2/k;->a:[Ln1/d;

    .line 181
    .line 182
    if-eqz v10, :cond_3

    .line 183
    .line 184
    invoke-static {v10, v5}, Ln1/d;->b([Ln1/d;Landroid/graphics/Path;)V

    .line 185
    .line 186
    .line 187
    :cond_3
    iget-object v10, v1, Lr2/l;->b:Landroid/graphics/Path;

    .line 188
    .line 189
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 190
    .line 191
    .line 192
    instance-of v11, v0, Lr2/g;

    .line 193
    .line 194
    if-eqz v11, :cond_5

    .line 195
    .line 196
    iget v0, v0, Lr2/k;->c:I

    .line 197
    .line 198
    if-nez v0, :cond_4

    .line 199
    .line 200
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_4
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 204
    .line 205
    :goto_3
    invoke-virtual {v10, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v10, v5, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3, v10}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 212
    .line 213
    .line 214
    goto/16 :goto_c

    .line 215
    .line 216
    :cond_5
    check-cast v0, Lr2/h;

    .line 217
    .line 218
    iget v11, v0, Lr2/h;->i:F

    .line 219
    .line 220
    cmpl-float v13, v11, v7

    .line 221
    .line 222
    const/high16 v14, 0x3f800000    # 1.0f

    .line 223
    .line 224
    if-nez v13, :cond_6

    .line 225
    .line 226
    iget v13, v0, Lr2/h;->j:F

    .line 227
    .line 228
    cmpl-float v13, v13, v14

    .line 229
    .line 230
    if-eqz v13, :cond_9

    .line 231
    .line 232
    :cond_6
    iget v13, v0, Lr2/h;->k:F

    .line 233
    .line 234
    add-float/2addr v11, v13

    .line 235
    rem-float/2addr v11, v14

    .line 236
    iget v15, v0, Lr2/h;->j:F

    .line 237
    .line 238
    add-float/2addr v15, v13

    .line 239
    rem-float/2addr v15, v14

    .line 240
    iget-object v13, v1, Lr2/l;->f:Landroid/graphics/PathMeasure;

    .line 241
    .line 242
    if-nez v13, :cond_7

    .line 243
    .line 244
    new-instance v13, Landroid/graphics/PathMeasure;

    .line 245
    .line 246
    invoke-direct {v13}, Landroid/graphics/PathMeasure;-><init>()V

    .line 247
    .line 248
    .line 249
    iput-object v13, v1, Lr2/l;->f:Landroid/graphics/PathMeasure;

    .line 250
    .line 251
    :cond_7
    iget-object v13, v1, Lr2/l;->f:Landroid/graphics/PathMeasure;

    .line 252
    .line 253
    move/from16 v14, v17

    .line 254
    .line 255
    invoke-virtual {v13, v5, v14}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 256
    .line 257
    .line 258
    iget-object v13, v1, Lr2/l;->f:Landroid/graphics/PathMeasure;

    .line 259
    .line 260
    invoke-virtual {v13}, Landroid/graphics/PathMeasure;->getLength()F

    .line 261
    .line 262
    .line 263
    move-result v13

    .line 264
    mul-float/2addr v11, v13

    .line 265
    mul-float/2addr v15, v13

    .line 266
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 267
    .line 268
    .line 269
    cmpl-float v16, v11, v15

    .line 270
    .line 271
    if-lez v16, :cond_8

    .line 272
    .line 273
    iget-object v14, v1, Lr2/l;->f:Landroid/graphics/PathMeasure;

    .line 274
    .line 275
    move/from16 v7, p2

    .line 276
    .line 277
    invoke-virtual {v14, v11, v13, v5, v7}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 278
    .line 279
    .line 280
    iget-object v11, v1, Lr2/l;->f:Landroid/graphics/PathMeasure;

    .line 281
    .line 282
    const/4 v13, 0x0

    .line 283
    invoke-virtual {v11, v13, v15, v5, v7}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 284
    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_8
    move v13, v7

    .line 288
    move/from16 v7, p2

    .line 289
    .line 290
    iget-object v14, v1, Lr2/l;->f:Landroid/graphics/PathMeasure;

    .line 291
    .line 292
    invoke-virtual {v14, v11, v15, v5, v7}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 293
    .line 294
    .line 295
    :goto_4
    invoke-virtual {v5, v13, v13}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 296
    .line 297
    .line 298
    :cond_9
    invoke-virtual {v10, v5, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 299
    .line 300
    .line 301
    iget-object v5, v0, Lr2/h;->f:LE/Y;

    .line 302
    .line 303
    iget-object v7, v5, LE/Y;->c:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v7, Landroid/graphics/Shader;

    .line 306
    .line 307
    const/4 v13, 0x0

    .line 308
    const/16 v14, 0xff

    .line 309
    .line 310
    const/high16 v15, 0x437f0000    # 255.0f

    .line 311
    .line 312
    if-eqz v7, :cond_a

    .line 313
    .line 314
    goto :goto_5

    .line 315
    :cond_a
    iget v7, v5, LE/Y;->b:I

    .line 316
    .line 317
    if-eqz v7, :cond_e

    .line 318
    .line 319
    :goto_5
    iget-object v7, v1, Lr2/l;->e:Landroid/graphics/Paint;

    .line 320
    .line 321
    if-nez v7, :cond_b

    .line 322
    .line 323
    new-instance v7, Landroid/graphics/Paint;

    .line 324
    .line 325
    const/4 v11, 0x1

    .line 326
    const v16, 0xffffff

    .line 327
    .line 328
    .line 329
    invoke-direct {v7, v11}, Landroid/graphics/Paint;-><init>(I)V

    .line 330
    .line 331
    .line 332
    iput-object v7, v1, Lr2/l;->e:Landroid/graphics/Paint;

    .line 333
    .line 334
    sget-object v11, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 335
    .line 336
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 337
    .line 338
    .line 339
    goto :goto_6

    .line 340
    :cond_b
    const v16, 0xffffff

    .line 341
    .line 342
    .line 343
    :goto_6
    iget-object v7, v1, Lr2/l;->e:Landroid/graphics/Paint;

    .line 344
    .line 345
    iget-object v11, v5, LE/Y;->c:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v11, Landroid/graphics/Shader;

    .line 348
    .line 349
    if-eqz v11, :cond_c

    .line 350
    .line 351
    invoke-virtual {v11, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 355
    .line 356
    .line 357
    iget v5, v0, Lr2/h;->h:F

    .line 358
    .line 359
    mul-float/2addr v5, v15

    .line 360
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 365
    .line 366
    .line 367
    move/from16 v19, v15

    .line 368
    .line 369
    goto :goto_7

    .line 370
    :cond_c
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v7, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 374
    .line 375
    .line 376
    iget v5, v5, LE/Y;->b:I

    .line 377
    .line 378
    iget v11, v0, Lr2/h;->h:F

    .line 379
    .line 380
    sget-object v19, Lr2/o;->z:Landroid/graphics/PorterDuff$Mode;

    .line 381
    .line 382
    move/from16 v19, v15

    .line 383
    .line 384
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 385
    .line 386
    .line 387
    move-result v15

    .line 388
    and-int v5, v5, v16

    .line 389
    .line 390
    int-to-float v15, v15

    .line 391
    mul-float/2addr v15, v11

    .line 392
    float-to-int v11, v15

    .line 393
    shl-int/lit8 v11, v11, 0x18

    .line 394
    .line 395
    or-int/2addr v5, v11

    .line 396
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 397
    .line 398
    .line 399
    :goto_7
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 400
    .line 401
    .line 402
    iget v5, v0, Lr2/k;->c:I

    .line 403
    .line 404
    if-nez v5, :cond_d

    .line 405
    .line 406
    sget-object v5, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 407
    .line 408
    goto :goto_8

    .line 409
    :cond_d
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 410
    .line 411
    :goto_8
    invoke-virtual {v10, v5}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v3, v10, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 415
    .line 416
    .line 417
    goto :goto_9

    .line 418
    :cond_e
    move/from16 v19, v15

    .line 419
    .line 420
    const v16, 0xffffff

    .line 421
    .line 422
    .line 423
    :goto_9
    iget-object v5, v0, Lr2/h;->d:LE/Y;

    .line 424
    .line 425
    iget-object v7, v5, LE/Y;->c:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v7, Landroid/graphics/Shader;

    .line 428
    .line 429
    if-eqz v7, :cond_f

    .line 430
    .line 431
    goto :goto_a

    .line 432
    :cond_f
    iget v7, v5, LE/Y;->b:I

    .line 433
    .line 434
    if-eqz v7, :cond_15

    .line 435
    .line 436
    :goto_a
    iget-object v7, v1, Lr2/l;->d:Landroid/graphics/Paint;

    .line 437
    .line 438
    if-nez v7, :cond_10

    .line 439
    .line 440
    new-instance v7, Landroid/graphics/Paint;

    .line 441
    .line 442
    const/4 v11, 0x1

    .line 443
    invoke-direct {v7, v11}, Landroid/graphics/Paint;-><init>(I)V

    .line 444
    .line 445
    .line 446
    iput-object v7, v1, Lr2/l;->d:Landroid/graphics/Paint;

    .line 447
    .line 448
    sget-object v11, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 449
    .line 450
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 451
    .line 452
    .line 453
    :cond_10
    iget-object v7, v1, Lr2/l;->d:Landroid/graphics/Paint;

    .line 454
    .line 455
    iget-object v11, v0, Lr2/h;->m:Landroid/graphics/Paint$Join;

    .line 456
    .line 457
    if-eqz v11, :cond_11

    .line 458
    .line 459
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 460
    .line 461
    .line 462
    :cond_11
    iget-object v11, v0, Lr2/h;->l:Landroid/graphics/Paint$Cap;

    .line 463
    .line 464
    if-eqz v11, :cond_12

    .line 465
    .line 466
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 467
    .line 468
    .line 469
    :cond_12
    iget v11, v0, Lr2/h;->n:F

    .line 470
    .line 471
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 472
    .line 473
    .line 474
    iget-object v11, v5, LE/Y;->c:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v11, Landroid/graphics/Shader;

    .line 477
    .line 478
    if-eqz v11, :cond_13

    .line 479
    .line 480
    invoke-virtual {v11, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 484
    .line 485
    .line 486
    iget v5, v0, Lr2/h;->g:F

    .line 487
    .line 488
    mul-float v5, v5, v19

    .line 489
    .line 490
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 491
    .line 492
    .line 493
    move-result v5

    .line 494
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 495
    .line 496
    .line 497
    goto :goto_b

    .line 498
    :cond_13
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v7, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 502
    .line 503
    .line 504
    iget v5, v5, LE/Y;->b:I

    .line 505
    .line 506
    iget v11, v0, Lr2/h;->g:F

    .line 507
    .line 508
    sget-object v12, Lr2/o;->z:Landroid/graphics/PorterDuff$Mode;

    .line 509
    .line 510
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 511
    .line 512
    .line 513
    move-result v12

    .line 514
    and-int v5, v5, v16

    .line 515
    .line 516
    int-to-float v12, v12

    .line 517
    mul-float/2addr v12, v11

    .line 518
    float-to-int v11, v12

    .line 519
    shl-int/lit8 v11, v11, 0x18

    .line 520
    .line 521
    or-int/2addr v5, v11

    .line 522
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 523
    .line 524
    .line 525
    :goto_b
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 526
    .line 527
    .line 528
    mul-float v11, p1, v8

    .line 529
    .line 530
    iget v0, v0, Lr2/h;->e:F

    .line 531
    .line 532
    mul-float/2addr v0, v11

    .line 533
    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v3, v10, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 537
    .line 538
    .line 539
    goto :goto_c

    .line 540
    :cond_14
    move/from16 v4, p4

    .line 541
    .line 542
    goto/16 :goto_1

    .line 543
    .line 544
    :cond_15
    :goto_c
    add-int/lit8 v8, v18, 0x1

    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    goto/16 :goto_0

    .line 548
    .line 549
    :cond_16
    move-object/from16 v1, p0

    .line 550
    .line 551
    move-object/from16 v3, p3

    .line 552
    .line 553
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    .line 554
    .line 555
    .line 556
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public getAlpha()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr2/l;->getRootAlpha()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/high16 v1, 0x437f0000    # 255.0f

    .line 7
    .line 8
    div-float/2addr v0, v1

    .line 9
    return v0
.end method

.method public getRootAlpha()I
    .locals 1

    .line 1
    iget v0, p0, Lr2/l;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public setAlpha(F)V
    .locals 1

    .line 1
    const/high16 v0, 0x437f0000    # 255.0f

    .line 2
    .line 3
    mul-float/2addr p1, v0

    .line 4
    float-to-int p1, p1

    .line 5
    invoke-virtual {p0, p1}, Lr2/l;->setRootAlpha(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setRootAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr2/l;->l:I

    .line 2
    .line 3
    return-void
.end method
