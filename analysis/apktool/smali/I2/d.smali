.class public final synthetic LI2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LI2/d;->q:I

    iput-object p2, p0, LI2/d;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LI2/d;->q:I

    .line 4
    .line 5
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 6
    .line 7
    const-string v12, "Orientation"

    .line 8
    .line 9
    const/high16 v16, 0x40000000    # 2.0f

    .line 10
    .line 11
    const-string v5, "image/jpeg"

    .line 12
    .line 13
    const/4 v7, 0x7

    .line 14
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 15
    .line 16
    const/4 v14, 0x0

    .line 17
    const/4 v15, 0x2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x1

    .line 20
    iget-object v6, v1, LI2/d;->r:Ljava/lang/Object;

    .line 21
    .line 22
    packed-switch v0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v6, Lv2/d;

    .line 26
    .line 27
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 28
    .line 29
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v2, v6, Lv2/d;->b:LD2/n;

    .line 33
    .line 34
    new-instance v11, LJ2/b;

    .line 35
    .line 36
    iget-object v10, v6, Lv2/d;->a:Ld6/w;

    .line 37
    .line 38
    invoke-virtual {v10}, Ld6/w;->O()Lq6/i;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    invoke-direct {v11, v9, v4}, LJ2/b;-><init>(Lq6/G;I)V

    .line 43
    .line 44
    .line 45
    invoke-static {v11}, La/a;->j(Lq6/G;)Lq6/A;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 50
    .line 51
    invoke-virtual {v9}, Lq6/A;->c()Lq6/A;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    new-instance v13, Lq6/f;

    .line 56
    .line 57
    invoke-direct {v13, v8, v4}, Lq6/f;-><init>(Lq6/i;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v13, v14, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 61
    .line 62
    .line 63
    iget-object v8, v11, LJ2/b;->s:Ljava/lang/Exception;

    .line 64
    .line 65
    if-nez v8, :cond_2c

    .line 66
    .line 67
    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 68
    .line 69
    sget-object v8, Lv2/i;->a:Landroid/graphics/Paint;

    .line 70
    .line 71
    iget-object v8, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v6, v6, Lv2/d;->d:Lv2/h;

    .line 74
    .line 75
    sget-object v13, Lv2/j;->a:Ljava/util/Set;

    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_5

    .line 82
    .line 83
    if-eq v6, v4, :cond_1

    .line 84
    .line 85
    if-ne v6, v15, :cond_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    new-instance v0, LC2/e;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_1
    if-eqz v8, :cond_5

    .line 95
    .line 96
    sget-object v6, Lv2/j;->a:Ljava/util/Set;

    .line 97
    .line 98
    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_5

    .line 103
    .line 104
    :goto_0
    new-instance v6, LH1/g;

    .line 105
    .line 106
    new-instance v8, LJ2/m;

    .line 107
    .line 108
    invoke-virtual {v9}, Lq6/A;->c()Lq6/A;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    new-instance v14, Lq6/f;

    .line 113
    .line 114
    invoke-direct {v14, v13, v4}, Lq6/f;-><init>(Lq6/i;I)V

    .line 115
    .line 116
    .line 117
    invoke-direct {v8, v14, v4}, LJ2/m;-><init>(Ljava/io/InputStream;I)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v6, v8}, LH1/g;-><init>(Ljava/io/InputStream;)V

    .line 121
    .line 122
    .line 123
    new-instance v8, Lv2/g;

    .line 124
    .line 125
    invoke-virtual {v6, v12}, LH1/g;->c(Ljava/lang/String;)LH1/c;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    if-nez v13, :cond_2

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    :try_start_0
    iget-object v14, v6, LH1/g;->f:Ljava/nio/ByteOrder;

    .line 133
    .line 134
    invoke-virtual {v13, v14}, LH1/c;->e(Ljava/nio/ByteOrder;)I

    .line 135
    .line 136
    .line 137
    move-result v13
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    goto :goto_2

    .line 139
    :catch_0
    :goto_1
    move v13, v4

    .line 140
    :goto_2
    if-eq v13, v15, :cond_3

    .line 141
    .line 142
    if-eq v13, v7, :cond_3

    .line 143
    .line 144
    const/4 v7, 0x4

    .line 145
    if-eq v13, v7, :cond_3

    .line 146
    .line 147
    const/4 v7, 0x5

    .line 148
    if-eq v13, v7, :cond_3

    .line 149
    .line 150
    move v7, v3

    .line 151
    goto :goto_3

    .line 152
    :cond_3
    move v7, v4

    .line 153
    :goto_3
    invoke-virtual {v6, v12}, LH1/g;->c(Ljava/lang/String;)LH1/c;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    if-nez v12, :cond_4

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_4
    :try_start_1
    iget-object v6, v6, LH1/g;->f:Ljava/nio/ByteOrder;

    .line 161
    .line 162
    invoke-virtual {v12, v6}, LH1/c;->e(Ljava/nio/ByteOrder;)I

    .line 163
    .line 164
    .line 165
    move-result v6
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 166
    goto :goto_5

    .line 167
    :catch_1
    :goto_4
    move v6, v4

    .line 168
    :goto_5
    packed-switch v6, :pswitch_data_1

    .line 169
    .line 170
    .line 171
    move v6, v3

    .line 172
    goto :goto_6

    .line 173
    :pswitch_0
    const/16 v6, 0x5a

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :pswitch_1
    const/16 v6, 0x10e

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :pswitch_2
    const/16 v6, 0xb4

    .line 180
    .line 181
    :goto_6
    invoke-direct {v8, v6, v7}, Lv2/g;-><init>(IZ)V

    .line 182
    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_5
    sget-object v8, Lv2/g;->c:Lv2/g;

    .line 186
    .line 187
    :goto_7
    iget v6, v8, Lv2/g;->b:I

    .line 188
    .line 189
    iget-boolean v7, v8, Lv2/g;->a:Z

    .line 190
    .line 191
    iget-object v8, v11, LJ2/b;->s:Ljava/lang/Exception;

    .line 192
    .line 193
    if-nez v8, :cond_2b

    .line 194
    .line 195
    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 196
    .line 197
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 198
    .line 199
    const/16 v12, 0x1a

    .line 200
    .line 201
    if-lt v8, v12, :cond_6

    .line 202
    .line 203
    iget-object v12, v2, LD2/n;->c:Landroid/graphics/ColorSpace;

    .line 204
    .line 205
    if-eqz v12, :cond_6

    .line 206
    .line 207
    invoke-static {v0, v12}, Ld0/l;->n(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 208
    .line 209
    .line 210
    :cond_6
    iget-boolean v12, v2, LD2/n;->h:Z

    .line 211
    .line 212
    iget-object v13, v2, LD2/n;->a:Landroid/content/Context;

    .line 213
    .line 214
    iget-object v14, v2, LD2/n;->d:LE2/h;

    .line 215
    .line 216
    iput-boolean v12, v0, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 217
    .line 218
    iget-object v12, v2, LD2/n;->b:Landroid/graphics/Bitmap$Config;

    .line 219
    .line 220
    if-nez v7, :cond_7

    .line 221
    .line 222
    if-lez v6, :cond_9

    .line 223
    .line 224
    :cond_7
    if-eqz v12, :cond_8

    .line 225
    .line 226
    invoke-static {v12}, La/a;->H(Landroid/graphics/Bitmap$Config;)Z

    .line 227
    .line 228
    .line 229
    move-result v15

    .line 230
    if-eqz v15, :cond_9

    .line 231
    .line 232
    :cond_8
    sget-object v12, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 233
    .line 234
    :cond_9
    iget-boolean v15, v2, LD2/n;->g:Z

    .line 235
    .line 236
    if-eqz v15, :cond_a

    .line 237
    .line 238
    sget-object v15, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 239
    .line 240
    if-ne v12, v15, :cond_a

    .line 241
    .line 242
    iget-object v15, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 243
    .line 244
    invoke-static {v15, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    if-eqz v5, :cond_a

    .line 249
    .line 250
    sget-object v12, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 251
    .line 252
    :cond_a
    const/16 v5, 0x1a

    .line 253
    .line 254
    if-lt v8, v5, :cond_b

    .line 255
    .line 256
    invoke-static {v0}, Ld0/l;->d(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    invoke-static {}, Ld0/l;->c()Landroid/graphics/Bitmap$Config;

    .line 261
    .line 262
    .line 263
    move-result-object v8

    .line 264
    if-ne v5, v8, :cond_b

    .line 265
    .line 266
    invoke-static {}, Ld0/l;->w()Landroid/graphics/Bitmap$Config;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    if-eq v12, v5, :cond_b

    .line 271
    .line 272
    invoke-static {}, Ld0/l;->c()Landroid/graphics/Bitmap$Config;

    .line 273
    .line 274
    .line 275
    move-result-object v12

    .line 276
    :cond_b
    iput-object v12, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 277
    .line 278
    invoke-virtual {v10}, Ld6/w;->c()La/a;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    instance-of v8, v5, Lv2/l;

    .line 283
    .line 284
    if-eqz v8, :cond_c

    .line 285
    .line 286
    sget-object v8, LE2/h;->c:LE2/h;

    .line 287
    .line 288
    invoke-static {v14, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v8

    .line 292
    if-eqz v8, :cond_c

    .line 293
    .line 294
    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 295
    .line 296
    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 297
    .line 298
    check-cast v5, Lv2/l;

    .line 299
    .line 300
    iget v2, v5, Lv2/l;->a:I

    .line 301
    .line 302
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 303
    .line 304
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    iget v2, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 313
    .line 314
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 315
    .line 316
    move v1, v4

    .line 317
    move v3, v7

    .line 318
    goto/16 :goto_13

    .line 319
    .line 320
    :cond_c
    iget v5, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 321
    .line 322
    if-lez v5, :cond_1d

    .line 323
    .line 324
    iget v8, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 325
    .line 326
    if-gtz v8, :cond_d

    .line 327
    .line 328
    move v1, v4

    .line 329
    move v3, v7

    .line 330
    goto/16 :goto_12

    .line 331
    .line 332
    :cond_d
    const/16 v10, 0x5a

    .line 333
    .line 334
    const/16 v12, 0x10e

    .line 335
    .line 336
    if-eq v6, v10, :cond_f

    .line 337
    .line 338
    if-ne v6, v12, :cond_e

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_e
    move v15, v5

    .line 342
    goto :goto_9

    .line 343
    :cond_f
    :goto_8
    move v15, v8

    .line 344
    :goto_9
    if-eq v6, v10, :cond_11

    .line 345
    .line 346
    if-ne v6, v12, :cond_10

    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_10
    move v5, v8

    .line 350
    :cond_11
    :goto_a
    iget-object v8, v2, LD2/n;->e:LE2/g;

    .line 351
    .line 352
    sget-object v10, LE2/h;->c:LE2/h;

    .line 353
    .line 354
    invoke-static {v14, v10}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v12

    .line 358
    if-eqz v12, :cond_12

    .line 359
    .line 360
    move v12, v15

    .line 361
    goto :goto_b

    .line 362
    :cond_12
    iget-object v12, v14, LE2/h;->a:LC3/a;

    .line 363
    .line 364
    invoke-static {v12, v8}, LH2/f;->e(LC3/a;LE2/g;)I

    .line 365
    .line 366
    .line 367
    move-result v12

    .line 368
    :goto_b
    invoke-static {v14, v10}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v10

    .line 372
    if-eqz v10, :cond_13

    .line 373
    .line 374
    move v10, v5

    .line 375
    goto :goto_c

    .line 376
    :cond_13
    iget-object v10, v14, LE2/h;->b:LC3/a;

    .line 377
    .line 378
    invoke-static {v10, v8}, LH2/f;->e(LC3/a;LE2/g;)I

    .line 379
    .line 380
    .line 381
    move-result v10

    .line 382
    :goto_c
    div-int v14, v15, v12

    .line 383
    .line 384
    invoke-static {v14}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 385
    .line 386
    .line 387
    move-result v14

    .line 388
    div-int v17, v5, v10

    .line 389
    .line 390
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    if-eqz v1, :cond_15

    .line 399
    .line 400
    if-ne v1, v4, :cond_14

    .line 401
    .line 402
    invoke-static {v14, v3}, Ljava/lang/Math;->max(II)I

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    goto :goto_d

    .line 407
    :cond_14
    new-instance v0, LC2/e;

    .line 408
    .line 409
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 410
    .line 411
    .line 412
    throw v0

    .line 413
    :cond_15
    invoke-static {v14, v3}, Ljava/lang/Math;->min(II)I

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    :goto_d
    if-ge v1, v4, :cond_16

    .line 418
    .line 419
    move v1, v4

    .line 420
    :cond_16
    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 421
    .line 422
    int-to-double v14, v15

    .line 423
    move v3, v7

    .line 424
    move-object/from16 v17, v8

    .line 425
    .line 426
    int-to-double v7, v1

    .line 427
    div-double/2addr v14, v7

    .line 428
    int-to-double v4, v5

    .line 429
    div-double/2addr v4, v7

    .line 430
    int-to-double v7, v12

    .line 431
    move-object/from16 v21, v2

    .line 432
    .line 433
    int-to-double v1, v10

    .line 434
    div-double/2addr v7, v14

    .line 435
    div-double v4, v1, v4

    .line 436
    .line 437
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    .line 438
    .line 439
    .line 440
    move-result v1

    .line 441
    if-eqz v1, :cond_18

    .line 442
    .line 443
    const/4 v12, 0x1

    .line 444
    if-ne v1, v12, :cond_17

    .line 445
    .line 446
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->min(DD)D

    .line 447
    .line 448
    .line 449
    move-result-wide v4

    .line 450
    :goto_e
    move-object/from16 v2, v21

    .line 451
    .line 452
    goto :goto_f

    .line 453
    :cond_17
    new-instance v0, LC2/e;

    .line 454
    .line 455
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 456
    .line 457
    .line 458
    throw v0

    .line 459
    :cond_18
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 460
    .line 461
    .line 462
    move-result-wide v4

    .line 463
    goto :goto_e

    .line 464
    :goto_f
    iget-boolean v2, v2, LD2/n;->f:Z

    .line 465
    .line 466
    if-eqz v2, :cond_19

    .line 467
    .line 468
    cmpl-double v2, v4, v18

    .line 469
    .line 470
    if-lez v2, :cond_19

    .line 471
    .line 472
    move-wide/from16 v4, v18

    .line 473
    .line 474
    :cond_19
    cmpg-double v2, v4, v18

    .line 475
    .line 476
    if-nez v2, :cond_1a

    .line 477
    .line 478
    const/4 v2, 0x1

    .line 479
    goto :goto_10

    .line 480
    :cond_1a
    const/4 v2, 0x0

    .line 481
    :goto_10
    xor-int/lit8 v7, v2, 0x1

    .line 482
    .line 483
    iput-boolean v7, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 484
    .line 485
    if-nez v2, :cond_1b

    .line 486
    .line 487
    cmpl-double v2, v4, v18

    .line 488
    .line 489
    if-lez v2, :cond_1c

    .line 490
    .line 491
    const v2, 0x7fffffff

    .line 492
    .line 493
    .line 494
    int-to-double v7, v2

    .line 495
    div-double/2addr v7, v4

    .line 496
    invoke-static {v7, v8}, LD5/a;->F(D)I

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 501
    .line 502
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 503
    .line 504
    :cond_1b
    :goto_11
    const/4 v1, 0x1

    .line 505
    goto :goto_13

    .line 506
    :cond_1c
    const v2, 0x7fffffff

    .line 507
    .line 508
    .line 509
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 510
    .line 511
    int-to-double v7, v2

    .line 512
    mul-double/2addr v7, v4

    .line 513
    invoke-static {v7, v8}, LD5/a;->F(D)I

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 518
    .line 519
    goto :goto_11

    .line 520
    :cond_1d
    move v3, v7

    .line 521
    move v1, v4

    .line 522
    :goto_12
    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 523
    .line 524
    const/4 v2, 0x0

    .line 525
    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 526
    .line 527
    :goto_13
    :try_start_2
    new-instance v2, Lq6/f;

    .line 528
    .line 529
    invoke-direct {v2, v9, v1}, Lq6/f;-><init>(Lq6/i;I)V

    .line 530
    .line 531
    .line 532
    const/4 v4, 0x0

    .line 533
    invoke-static {v2, v4, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 534
    .line 535
    .line 536
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 537
    invoke-virtual {v9}, Lq6/A;->close()V

    .line 538
    .line 539
    .line 540
    iget-object v4, v11, LJ2/b;->s:Ljava/lang/Exception;

    .line 541
    .line 542
    if-nez v4, :cond_2a

    .line 543
    .line 544
    if-eqz v2, :cond_29

    .line 545
    .line 546
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 551
    .line 552
    .line 553
    move-result-object v4

    .line 554
    iget v4, v4, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 555
    .line 556
    invoke-virtual {v2, v4}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 557
    .line 558
    .line 559
    if-nez v3, :cond_1e

    .line 560
    .line 561
    if-lez v6, :cond_26

    .line 562
    .line 563
    :cond_1e
    new-instance v4, Landroid/graphics/Matrix;

    .line 564
    .line 565
    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 569
    .line 570
    .line 571
    move-result v5

    .line 572
    int-to-float v5, v5

    .line 573
    div-float v5, v5, v16

    .line 574
    .line 575
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    int-to-float v7, v7

    .line 580
    div-float v7, v7, v16

    .line 581
    .line 582
    if-eqz v3, :cond_1f

    .line 583
    .line 584
    const/high16 v3, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/high16 v8, -0x40800000    # -1.0f

    .line 587
    .line 588
    invoke-virtual {v4, v8, v3, v5, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 589
    .line 590
    .line 591
    :cond_1f
    if-lez v6, :cond_20

    .line 592
    .line 593
    int-to-float v3, v6

    .line 594
    invoke-virtual {v4, v3, v5, v7}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 595
    .line 596
    .line 597
    :cond_20
    new-instance v3, Landroid/graphics/RectF;

    .line 598
    .line 599
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 600
    .line 601
    .line 602
    move-result v5

    .line 603
    int-to-float v5, v5

    .line 604
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 605
    .line 606
    .line 607
    move-result v7

    .line 608
    int-to-float v7, v7

    .line 609
    const/4 v8, 0x0

    .line 610
    invoke-direct {v3, v8, v8, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v4, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 614
    .line 615
    .line 616
    iget v5, v3, Landroid/graphics/RectF;->left:F

    .line 617
    .line 618
    cmpg-float v7, v5, v8

    .line 619
    .line 620
    if-nez v7, :cond_21

    .line 621
    .line 622
    iget v7, v3, Landroid/graphics/RectF;->top:F

    .line 623
    .line 624
    cmpg-float v7, v7, v8

    .line 625
    .line 626
    if-nez v7, :cond_21

    .line 627
    .line 628
    :goto_14
    const/16 v10, 0x5a

    .line 629
    .line 630
    goto :goto_15

    .line 631
    :cond_21
    neg-float v5, v5

    .line 632
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 633
    .line 634
    neg-float v3, v3

    .line 635
    invoke-virtual {v4, v5, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 636
    .line 637
    .line 638
    goto :goto_14

    .line 639
    :goto_15
    if-eq v6, v10, :cond_24

    .line 640
    .line 641
    const/16 v12, 0x10e

    .line 642
    .line 643
    if-ne v6, v12, :cond_22

    .line 644
    .line 645
    goto :goto_16

    .line 646
    :cond_22
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 647
    .line 648
    .line 649
    move-result v3

    .line 650
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 651
    .line 652
    .line 653
    move-result v5

    .line 654
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 655
    .line 656
    .line 657
    move-result-object v6

    .line 658
    if-nez v6, :cond_23

    .line 659
    .line 660
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 661
    .line 662
    :cond_23
    invoke-static {v3, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 663
    .line 664
    .line 665
    move-result-object v3

    .line 666
    goto :goto_17

    .line 667
    :cond_24
    :goto_16
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 668
    .line 669
    .line 670
    move-result v3

    .line 671
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 676
    .line 677
    .line 678
    move-result-object v6

    .line 679
    if-nez v6, :cond_25

    .line 680
    .line 681
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 682
    .line 683
    :cond_25
    invoke-static {v3, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    :goto_17
    new-instance v5, Landroid/graphics/Canvas;

    .line 688
    .line 689
    invoke-direct {v5, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 690
    .line 691
    .line 692
    sget-object v6, Lv2/i;->a:Landroid/graphics/Paint;

    .line 693
    .line 694
    invoke-virtual {v5, v2, v4, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 698
    .line 699
    .line 700
    move-object v2, v3

    .line 701
    :cond_26
    new-instance v3, Lv2/f;

    .line 702
    .line 703
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 704
    .line 705
    .line 706
    move-result-object v4

    .line 707
    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    .line 708
    .line 709
    invoke-direct {v5, v4, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 710
    .line 711
    .line 712
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 713
    .line 714
    const/4 v1, 0x1

    .line 715
    if-gt v2, v1, :cond_28

    .line 716
    .line 717
    iget-boolean v0, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 718
    .line 719
    if-eqz v0, :cond_27

    .line 720
    .line 721
    goto :goto_18

    .line 722
    :cond_27
    const/4 v1, 0x0

    .line 723
    goto :goto_19

    .line 724
    :cond_28
    :goto_18
    const/4 v1, 0x1

    .line 725
    :goto_19
    invoke-direct {v3, v5, v1}, Lv2/f;-><init>(Landroid/graphics/drawable/BitmapDrawable;Z)V

    .line 726
    .line 727
    .line 728
    return-object v3

    .line 729
    :cond_29
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 730
    .line 731
    const-string v1, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    .line 732
    .line 733
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    throw v0

    .line 737
    :cond_2a
    throw v4

    .line 738
    :catchall_0
    move-exception v0

    .line 739
    move-object v1, v0

    .line 740
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 741
    :catchall_1
    move-exception v0

    .line 742
    invoke-static {v9, v1}, Lcom/google/android/gms/internal/measurement/I1;->N(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 743
    .line 744
    .line 745
    throw v0

    .line 746
    :cond_2b
    throw v8

    .line 747
    :cond_2c
    throw v8

    .line 748
    :pswitch_3
    check-cast v6, Lu2/n;

    .line 749
    .line 750
    iget-object v0, v6, Lu2/n;->H:LP/f0;

    .line 751
    .line 752
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    check-cast v0, LD2/j;

    .line 757
    .line 758
    return-object v0

    .line 759
    :pswitch_4
    check-cast v6, Lr6/g;

    .line 760
    .line 761
    iget-object v0, v6, Lr6/g;->s:Ljava/lang/ClassLoader;

    .line 762
    .line 763
    iget-object v1, v6, Lr6/g;->t:Lq6/l;

    .line 764
    .line 765
    const-string v2, ""

    .line 766
    .line 767
    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    const-string v3, "getResources(...)"

    .line 772
    .line 773
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    invoke-static {v2}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    const-string v4, "list(...)"

    .line 781
    .line 782
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    new-instance v5, Ljava/util/ArrayList;

    .line 786
    .line 787
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 788
    .line 789
    .line 790
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 791
    .line 792
    .line 793
    move-result v6

    .line 794
    const/4 v8, 0x0

    .line 795
    :cond_2d
    :goto_1a
    if-ge v8, v6, :cond_2f

    .line 796
    .line 797
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v9

    .line 801
    add-int/lit8 v8, v8, 0x1

    .line 802
    .line 803
    check-cast v9, Ljava/net/URL;

    .line 804
    .line 805
    invoke-static {v9}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 806
    .line 807
    .line 808
    invoke-virtual {v9}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v10

    .line 812
    const-string v11, "file"

    .line 813
    .line 814
    invoke-static {v10, v11}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 815
    .line 816
    .line 817
    move-result v10

    .line 818
    if-nez v10, :cond_2e

    .line 819
    .line 820
    const/4 v10, 0x0

    .line 821
    goto :goto_1b

    .line 822
    :cond_2e
    sget-object v10, Lq6/x;->r:Ljava/lang/String;

    .line 823
    .line 824
    new-instance v10, Ljava/io/File;

    .line 825
    .line 826
    invoke-virtual {v9}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 827
    .line 828
    .line 829
    move-result-object v9

    .line 830
    invoke-direct {v10, v9}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 831
    .line 832
    .line 833
    invoke-static {v10}, LO3/D;->s(Ljava/io/File;)Lq6/x;

    .line 834
    .line 835
    .line 836
    move-result-object v9

    .line 837
    new-instance v10, Lm5/j;

    .line 838
    .line 839
    invoke-direct {v10, v1, v9}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 840
    .line 841
    .line 842
    :goto_1b
    if-eqz v10, :cond_2d

    .line 843
    .line 844
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    goto :goto_1a

    .line 848
    :cond_2f
    const-string v2, "META-INF/MANIFEST.MF"

    .line 849
    .line 850
    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    invoke-static {v0, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    new-instance v2, Ljava/util/ArrayList;

    .line 865
    .line 866
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 870
    .line 871
    .line 872
    move-result v3

    .line 873
    const/4 v4, 0x0

    .line 874
    :cond_30
    :goto_1c
    if-ge v4, v3, :cond_33

    .line 875
    .line 876
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v6

    .line 880
    add-int/lit8 v4, v4, 0x1

    .line 881
    .line 882
    check-cast v6, Ljava/net/URL;

    .line 883
    .line 884
    invoke-static {v6}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v6}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v6

    .line 891
    const-string v8, "toString(...)"

    .line 892
    .line 893
    invoke-static {v6, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 894
    .line 895
    .line 896
    const-string v8, "jar:file:"

    .line 897
    .line 898
    const/4 v9, 0x0

    .line 899
    invoke-static {v6, v8, v9}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 900
    .line 901
    .line 902
    move-result v8

    .line 903
    if-nez v8, :cond_31

    .line 904
    .line 905
    :goto_1d
    const/4 v9, 0x0

    .line 906
    goto :goto_1e

    .line 907
    :cond_31
    const-string v8, "!"

    .line 908
    .line 909
    const/4 v9, 0x6

    .line 910
    invoke-static {v9, v6, v8}, LJ5/m;->W0(ILjava/lang/CharSequence;Ljava/lang/String;)I

    .line 911
    .line 912
    .line 913
    move-result v8

    .line 914
    const/4 v9, -0x1

    .line 915
    if-ne v8, v9, :cond_32

    .line 916
    .line 917
    goto :goto_1d

    .line 918
    :cond_32
    sget-object v9, Lq6/x;->r:Ljava/lang/String;

    .line 919
    .line 920
    new-instance v9, Ljava/io/File;

    .line 921
    .line 922
    const/4 v10, 0x4

    .line 923
    invoke-virtual {v6, v10, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v6

    .line 927
    const-string v8, "substring(...)"

    .line 928
    .line 929
    invoke-static {v6, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    invoke-static {v6}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 933
    .line 934
    .line 935
    move-result-object v6

    .line 936
    invoke-direct {v9, v6}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 937
    .line 938
    .line 939
    invoke-static {v9}, LO3/D;->s(Ljava/io/File;)Lq6/x;

    .line 940
    .line 941
    .line 942
    move-result-object v6

    .line 943
    new-instance v8, LZ4/G;

    .line 944
    .line 945
    invoke-direct {v8, v7}, LZ4/G;-><init>(I)V

    .line 946
    .line 947
    .line 948
    invoke-static {v6, v1, v8}, Lr6/b;->d(Lq6/x;Lq6/l;LB5/c;)Lq6/J;

    .line 949
    .line 950
    .line 951
    move-result-object v6

    .line 952
    sget-object v8, Lr6/g;->v:Lq6/x;

    .line 953
    .line 954
    new-instance v9, Lm5/j;

    .line 955
    .line 956
    invoke-direct {v9, v6, v8}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    :goto_1e
    if-eqz v9, :cond_30

    .line 960
    .line 961
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 962
    .line 963
    .line 964
    goto :goto_1c

    .line 965
    :cond_33
    invoke-static {v5, v2}, Ln5/l;->u0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    return-object v0

    .line 970
    :pswitch_5
    check-cast v6, Lq3/b;

    .line 971
    .line 972
    new-instance v0, Lq3/a;

    .line 973
    .line 974
    const/4 v2, 0x0

    .line 975
    invoke-direct {v0, v2, v6}, Lq3/a;-><init>(ILjava/lang/Object;)V

    .line 976
    .line 977
    .line 978
    return-object v0

    .line 979
    :pswitch_6
    check-cast v6, [Ljava/lang/Object;

    .line 980
    .line 981
    invoke-static {v6}, Lkotlin/jvm/internal/m;->h([Ljava/lang/Object;)Lkotlin/jvm/internal/b;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    return-object v0

    .line 986
    :pswitch_7
    check-cast v6, Lg5/h;

    .line 987
    .line 988
    iget-object v0, v6, Lg5/h;->t:Ljava/lang/String;

    .line 989
    .line 990
    invoke-virtual {v6, v0}, Lg5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    return-object v2

    .line 994
    :pswitch_8
    check-cast v6, Lg2/e;

    .line 995
    .line 996
    invoke-interface {v6}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    new-instance v1, Lg2/b;

    .line 1001
    .line 1002
    const/4 v9, 0x0

    .line 1003
    invoke-direct {v1, v6, v9}, Lg2/b;-><init>(Lg2/e;I)V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v0, v1}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 1007
    .line 1008
    .line 1009
    return-object v2

    .line 1010
    :pswitch_9
    check-cast v6, LP/c0;

    .line 1011
    .line 1012
    invoke-virtual {v6}, LP/c0;->e()I

    .line 1013
    .line 1014
    .line 1015
    move-result v0

    .line 1016
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    return-object v0

    .line 1021
    :pswitch_a
    check-cast v6, Landroidx/work/impl/WorkManagerImpl;

    .line 1022
    .line 1023
    invoke-static {v6}, Landroidx/work/impl/WorkManagerImpl;->a(Landroidx/work/impl/WorkManagerImpl;)Lm5/y;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    return-object v0

    .line 1028
    :pswitch_b
    check-cast v6, Landroidx/work/impl/utils/PreferenceUtils;

    .line 1029
    .line 1030
    invoke-virtual {v6}, Landroidx/work/impl/utils/PreferenceUtils;->getLastCancelAllTimeMillis()J

    .line 1031
    .line 1032
    .line 1033
    move-result-wide v0

    .line 1034
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    return-object v0

    .line 1039
    :pswitch_c
    check-cast v6, Landroidx/work/impl/WorkContinuationImpl;

    .line 1040
    .line 1041
    invoke-static {v6}, Landroidx/work/impl/WorkContinuationImpl;->a(Landroidx/work/impl/WorkContinuationImpl;)Lm5/y;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    return-object v0

    .line 1046
    :pswitch_d
    check-cast v6, Landroidx/lifecycle/l0;

    .line 1047
    .line 1048
    invoke-static {v6}, Landroidx/lifecycle/X;->g(Landroidx/lifecycle/l0;)Landroidx/lifecycle/Z;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    return-object v0

    .line 1053
    :pswitch_e
    check-cast v6, LX5/g;

    .line 1054
    .line 1055
    iget-object v0, v6, LX5/g;->j:[LX5/f;

    .line 1056
    .line 1057
    invoke-static {v6, v0}, LZ5/N;->d(LX5/f;[LX5/f;)I

    .line 1058
    .line 1059
    .line 1060
    move-result v0

    .line 1061
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    return-object v0

    .line 1066
    :pswitch_f
    check-cast v6, LW2/d;

    .line 1067
    .line 1068
    iget-object v0, v6, LW2/d;->a:LJ2/q;

    .line 1069
    .line 1070
    iget-object v2, v6, LW2/d;->b:LU2/n;

    .line 1071
    .line 1072
    invoke-interface {v0}, LJ2/q;->O()Lq6/i;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v3

    .line 1076
    :try_start_4
    invoke-static {v3}, LD5/a;->z(Lq6/i;)LB0/o;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 1080
    :try_start_5
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1081
    .line 1082
    .line 1083
    const/4 v0, 0x0

    .line 1084
    goto :goto_20

    .line 1085
    :catchall_2
    move-exception v0

    .line 1086
    goto :goto_20

    .line 1087
    :catchall_3
    move-exception v0

    .line 1088
    move-object v4, v0

    .line 1089
    :try_start_6
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 1090
    .line 1091
    .line 1092
    goto :goto_1f

    .line 1093
    :catchall_4
    move-exception v0

    .line 1094
    invoke-static {v4, v0}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 1095
    .line 1096
    .line 1097
    :goto_1f
    move-object v0, v4

    .line 1098
    const/4 v4, 0x0

    .line 1099
    :goto_20
    if-nez v0, :cond_44

    .line 1100
    .line 1101
    iget-object v0, v4, LB0/o;->q:Ljava/lang/Object;

    .line 1102
    .line 1103
    check-cast v0, LB0/G0;

    .line 1104
    .line 1105
    iget-object v3, v0, LB0/G0;->r:Ljava/lang/Object;

    .line 1106
    .line 1107
    check-cast v3, Lp3/T;

    .line 1108
    .line 1109
    const-string v5, "SVG document is empty"

    .line 1110
    .line 1111
    if-eqz v3, :cond_43

    .line 1112
    .line 1113
    iget-object v3, v3, Lp3/e0;->o:Li0/a;

    .line 1114
    .line 1115
    if-nez v3, :cond_34

    .line 1116
    .line 1117
    const/4 v6, 0x0

    .line 1118
    goto :goto_21

    .line 1119
    :cond_34
    new-instance v6, Landroid/graphics/RectF;

    .line 1120
    .line 1121
    iget v7, v3, Li0/a;->b:F

    .line 1122
    .line 1123
    iget v8, v3, Li0/a;->c:F

    .line 1124
    .line 1125
    invoke-virtual {v3}, Li0/a;->c()F

    .line 1126
    .line 1127
    .line 1128
    move-result v9

    .line 1129
    invoke-virtual {v3}, Li0/a;->d()F

    .line 1130
    .line 1131
    .line 1132
    move-result v3

    .line 1133
    invoke-direct {v6, v7, v8, v9, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1134
    .line 1135
    .line 1136
    :goto_21
    const/4 v3, 0x3

    .line 1137
    if-eqz v6, :cond_35

    .line 1138
    .line 1139
    const/4 v7, 0x4

    .line 1140
    new-array v14, v7, [F

    .line 1141
    .line 1142
    iget v7, v6, Landroid/graphics/RectF;->left:F

    .line 1143
    .line 1144
    const/16 v23, 0x0

    .line 1145
    .line 1146
    aput v7, v14, v23

    .line 1147
    .line 1148
    iget v7, v6, Landroid/graphics/RectF;->top:F

    .line 1149
    .line 1150
    const/4 v1, 0x1

    .line 1151
    aput v7, v14, v1

    .line 1152
    .line 1153
    iget v7, v6, Landroid/graphics/RectF;->right:F

    .line 1154
    .line 1155
    aput v7, v14, v15

    .line 1156
    .line 1157
    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    .line 1158
    .line 1159
    aput v6, v14, v3

    .line 1160
    .line 1161
    goto :goto_22

    .line 1162
    :cond_35
    const/16 v23, 0x0

    .line 1163
    .line 1164
    const/4 v14, 0x0

    .line 1165
    :goto_22
    if-eqz v14, :cond_36

    .line 1166
    .line 1167
    aget v6, v14, v15

    .line 1168
    .line 1169
    aget v7, v14, v23

    .line 1170
    .line 1171
    sub-float/2addr v6, v7

    .line 1172
    aget v7, v14, v3

    .line 1173
    .line 1174
    const/4 v1, 0x1

    .line 1175
    aget v8, v14, v1

    .line 1176
    .line 1177
    sub-float/2addr v7, v8

    .line 1178
    :goto_23
    const/16 v20, 0x0

    .line 1179
    .line 1180
    goto :goto_24

    .line 1181
    :cond_36
    iget-object v6, v0, LB0/G0;->r:Ljava/lang/Object;

    .line 1182
    .line 1183
    check-cast v6, Lp3/T;

    .line 1184
    .line 1185
    if-eqz v6, :cond_42

    .line 1186
    .line 1187
    invoke-virtual {v0}, LB0/G0;->x()Li0/a;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v6

    .line 1191
    iget v6, v6, Li0/a;->d:F

    .line 1192
    .line 1193
    iget-object v7, v0, LB0/G0;->r:Ljava/lang/Object;

    .line 1194
    .line 1195
    check-cast v7, Lp3/T;

    .line 1196
    .line 1197
    if-eqz v7, :cond_41

    .line 1198
    .line 1199
    invoke-virtual {v0}, LB0/G0;->x()Li0/a;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v7

    .line 1203
    iget v7, v7, Li0/a;->e:F

    .line 1204
    .line 1205
    goto :goto_23

    .line 1206
    :goto_24
    cmpl-float v8, v6, v20

    .line 1207
    .line 1208
    const/16 v9, 0x200

    .line 1209
    .line 1210
    if-lez v8, :cond_37

    .line 1211
    .line 1212
    invoke-static {v6}, LD5/a;->G(F)I

    .line 1213
    .line 1214
    .line 1215
    move-result v10

    .line 1216
    goto :goto_25

    .line 1217
    :cond_37
    move v10, v9

    .line 1218
    :goto_25
    cmpl-float v11, v7, v20

    .line 1219
    .line 1220
    if-lez v11, :cond_38

    .line 1221
    .line 1222
    invoke-static {v7}, LD5/a;->G(F)I

    .line 1223
    .line 1224
    .line 1225
    move-result v9

    .line 1226
    :cond_38
    iget-object v12, v2, LU2/n;->b:LV2/h;

    .line 1227
    .line 1228
    iget-object v13, v2, LU2/n;->c:LV2/g;

    .line 1229
    .line 1230
    sget-object v1, LU2/h;->b:LI2/l;

    .line 1231
    .line 1232
    invoke-static {v2, v1}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v1

    .line 1236
    check-cast v1, LV2/h;

    .line 1237
    .line 1238
    invoke-static {v10, v9, v12, v13, v1}, LD5/a;->t(IILV2/h;LV2/g;LV2/h;)J

    .line 1239
    .line 1240
    .line 1241
    move-result-wide v9

    .line 1242
    const/16 v1, 0x20

    .line 1243
    .line 1244
    move/from16 v17, v3

    .line 1245
    .line 1246
    move-object v12, v4

    .line 1247
    shr-long v3, v9, v1

    .line 1248
    .line 1249
    long-to-int v3, v3

    .line 1250
    const-wide v18, 0xffffffffL

    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    and-long v9, v9, v18

    .line 1256
    .line 1257
    long-to-int v4, v9

    .line 1258
    if-lez v8, :cond_3d

    .line 1259
    .line 1260
    if-lez v11, :cond_3d

    .line 1261
    .line 1262
    int-to-float v1, v3

    .line 1263
    int-to-float v3, v4

    .line 1264
    div-float v4, v1, v6

    .line 1265
    .line 1266
    div-float/2addr v3, v7

    .line 1267
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 1268
    .line 1269
    .line 1270
    move-result v1

    .line 1271
    if-eqz v1, :cond_3a

    .line 1272
    .line 1273
    const/4 v8, 0x1

    .line 1274
    if-ne v1, v8, :cond_39

    .line 1275
    .line 1276
    invoke-static {v4, v3}, Ljava/lang/Math;->min(FF)F

    .line 1277
    .line 1278
    .line 1279
    move-result v3

    .line 1280
    goto :goto_26

    .line 1281
    :cond_39
    new-instance v0, LC2/e;

    .line 1282
    .line 1283
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 1284
    .line 1285
    .line 1286
    throw v0

    .line 1287
    :cond_3a
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 1288
    .line 1289
    .line 1290
    move-result v3

    .line 1291
    :goto_26
    mul-float v4, v3, v6

    .line 1292
    .line 1293
    float-to-int v4, v4

    .line 1294
    mul-float/2addr v3, v7

    .line 1295
    float-to-int v3, v3

    .line 1296
    if-nez v14, :cond_3c

    .line 1297
    .line 1298
    const/4 v10, 0x4

    .line 1299
    new-array v8, v10, [F

    .line 1300
    .line 1301
    const/16 v20, 0x0

    .line 1302
    .line 1303
    const/16 v23, 0x0

    .line 1304
    .line 1305
    aput v20, v8, v23

    .line 1306
    .line 1307
    const/4 v1, 0x1

    .line 1308
    aput v20, v8, v1

    .line 1309
    .line 1310
    aput v6, v8, v15

    .line 1311
    .line 1312
    aput v7, v8, v17

    .line 1313
    .line 1314
    aget v6, v8, v23

    .line 1315
    .line 1316
    aget v7, v8, v1

    .line 1317
    .line 1318
    aget v9, v8, v15

    .line 1319
    .line 1320
    sub-float/2addr v9, v6

    .line 1321
    aget v8, v8, v17

    .line 1322
    .line 1323
    sub-float/2addr v8, v7

    .line 1324
    iget-object v10, v0, LB0/G0;->r:Ljava/lang/Object;

    .line 1325
    .line 1326
    check-cast v10, Lp3/T;

    .line 1327
    .line 1328
    if-eqz v10, :cond_3b

    .line 1329
    .line 1330
    new-instance v11, Li0/a;

    .line 1331
    .line 1332
    invoke-direct {v11, v6, v7, v9, v8}, Li0/a;-><init>(FFFF)V

    .line 1333
    .line 1334
    .line 1335
    iput-object v11, v10, Lp3/e0;->o:Li0/a;

    .line 1336
    .line 1337
    goto :goto_27

    .line 1338
    :cond_3b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1339
    .line 1340
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1341
    .line 1342
    .line 1343
    throw v0

    .line 1344
    :cond_3c
    :goto_27
    move/from16 v24, v4

    .line 1345
    .line 1346
    move v4, v3

    .line 1347
    move/from16 v3, v24

    .line 1348
    .line 1349
    :cond_3d
    iget-object v6, v0, LB0/G0;->r:Ljava/lang/Object;

    .line 1350
    .line 1351
    check-cast v6, Lp3/T;

    .line 1352
    .line 1353
    if-eqz v6, :cond_40

    .line 1354
    .line 1355
    const-string v7, "100%"

    .line 1356
    .line 1357
    invoke-static {v7}, Lp3/J0;->s(Ljava/lang/String;)Lp3/C;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v8

    .line 1361
    iput-object v8, v6, Lp3/T;->r:Lp3/C;

    .line 1362
    .line 1363
    iget-object v6, v0, LB0/G0;->r:Ljava/lang/Object;

    .line 1364
    .line 1365
    check-cast v6, Lp3/T;

    .line 1366
    .line 1367
    if-eqz v6, :cond_3f

    .line 1368
    .line 1369
    invoke-static {v7}, Lp3/J0;->s(Ljava/lang/String;)Lp3/C;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v5

    .line 1373
    iput-object v5, v6, Lp3/T;->s:Lp3/C;

    .line 1374
    .line 1375
    sget-object v5, LW2/b;->a:LI2/l;

    .line 1376
    .line 1377
    invoke-static {v2, v5}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v2

    .line 1381
    check-cast v2, Ljava/lang/String;

    .line 1382
    .line 1383
    if-eqz v2, :cond_3e

    .line 1384
    .line 1385
    new-instance v5, LZ/m;

    .line 1386
    .line 1387
    const/16 v6, 0x16

    .line 1388
    .line 1389
    invoke-direct {v5, v6}, LZ/m;-><init>(I)V

    .line 1390
    .line 1391
    .line 1392
    new-instance v6, LC/a;

    .line 1393
    .line 1394
    invoke-direct {v6, v15}, LC/a;-><init>(I)V

    .line 1395
    .line 1396
    .line 1397
    new-instance v7, Lp3/c;

    .line 1398
    .line 1399
    invoke-direct {v7, v2}, Lp3/c;-><init>(Ljava/lang/String;)V

    .line 1400
    .line 1401
    .line 1402
    invoke-virtual {v7}, Lp3/J;->y()V

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual {v6, v7}, LC/a;->h(Lp3/c;)LF3/c;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v2

    .line 1409
    iput-object v2, v5, LZ/m;->r:Ljava/lang/Object;

    .line 1410
    .line 1411
    iput-object v5, v12, LB0/o;->r:Ljava/lang/Object;

    .line 1412
    .line 1413
    :cond_3e
    new-instance v2, LW2/e;

    .line 1414
    .line 1415
    iget-object v5, v12, LB0/o;->r:Ljava/lang/Object;

    .line 1416
    .line 1417
    check-cast v5, LZ/m;

    .line 1418
    .line 1419
    invoke-direct {v2, v0, v5, v3, v4}, LW2/e;-><init>(LB0/G0;LZ/m;II)V

    .line 1420
    .line 1421
    .line 1422
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1423
    .line 1424
    invoke-static {v3, v4, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v0

    .line 1428
    new-instance v3, Landroid/graphics/Canvas;

    .line 1429
    .line 1430
    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v2, v3}, LW2/e;->e(Landroid/graphics/Canvas;)V

    .line 1434
    .line 1435
    .line 1436
    new-instance v2, LI2/a;

    .line 1437
    .line 1438
    invoke-direct {v2, v0}, LI2/a;-><init>(Landroid/graphics/Bitmap;)V

    .line 1439
    .line 1440
    .line 1441
    new-instance v0, LJ2/i;

    .line 1442
    .line 1443
    const/4 v1, 0x1

    .line 1444
    invoke-direct {v0, v2, v1}, LJ2/i;-><init>(LI2/n;Z)V

    .line 1445
    .line 1446
    .line 1447
    return-object v0

    .line 1448
    :cond_3f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1449
    .line 1450
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1451
    .line 1452
    .line 1453
    throw v0

    .line 1454
    :cond_40
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1455
    .line 1456
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1457
    .line 1458
    .line 1459
    throw v0

    .line 1460
    :cond_41
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1461
    .line 1462
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1463
    .line 1464
    .line 1465
    throw v0

    .line 1466
    :cond_42
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1467
    .line 1468
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1469
    .line 1470
    .line 1471
    throw v0

    .line 1472
    :cond_43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1473
    .line 1474
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1475
    .line 1476
    .line 1477
    throw v0

    .line 1478
    :cond_44
    throw v0

    .line 1479
    :pswitch_10
    check-cast v6, Ljava/lang/String;

    .line 1480
    .line 1481
    new-instance v0, LT1/n;

    .line 1482
    .line 1483
    invoke-direct {v0, v6}, LT1/n;-><init>(Ljava/lang/String;)V

    .line 1484
    .line 1485
    .line 1486
    return-object v0

    .line 1487
    :pswitch_11
    check-cast v6, LP/S0;

    .line 1488
    .line 1489
    invoke-interface {v6}, LP/S0;->getValue()Ljava/lang/Object;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v0

    .line 1493
    check-cast v0, Ljava/util/List;

    .line 1494
    .line 1495
    check-cast v0, Ljava/lang/Iterable;

    .line 1496
    .line 1497
    new-instance v1, Ljava/util/ArrayList;

    .line 1498
    .line 1499
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1500
    .line 1501
    .line 1502
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v0

    .line 1506
    :cond_45
    :goto_28
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1507
    .line 1508
    .line 1509
    move-result v2

    .line 1510
    if-eqz v2, :cond_46

    .line 1511
    .line 1512
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v2

    .line 1516
    move-object v3, v2

    .line 1517
    check-cast v3, LT1/d;

    .line 1518
    .line 1519
    iget-object v3, v3, LT1/d;->r:LT1/p;

    .line 1520
    .line 1521
    iget-object v3, v3, LT1/p;->q:Ljava/lang/String;

    .line 1522
    .line 1523
    const-string v4, "composable"

    .line 1524
    .line 1525
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    move-result v3

    .line 1529
    if-eqz v3, :cond_45

    .line 1530
    .line 1531
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1532
    .line 1533
    .line 1534
    goto :goto_28

    .line 1535
    :cond_46
    return-object v1

    .line 1536
    :pswitch_12
    check-cast v6, Landroid/content/Context;

    .line 1537
    .line 1538
    invoke-static {v6}, Lcom/google/android/gms/internal/measurement/n2;->l(Landroid/content/Context;)LT1/u;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    return-object v0

    .line 1543
    :pswitch_13
    check-cast v6, LT1/d;

    .line 1544
    .line 1545
    iget-object v0, v6, LT1/d;->x:LW1/c;

    .line 1546
    .line 1547
    iget-boolean v1, v0, LW1/c;->i:Z

    .line 1548
    .line 1549
    if-eqz v1, :cond_49

    .line 1550
    .line 1551
    iget-object v1, v0, LW1/c;->j:Landroidx/lifecycle/z;

    .line 1552
    .line 1553
    iget-object v1, v1, Landroidx/lifecycle/z;->d:Landroidx/lifecycle/p;

    .line 1554
    .line 1555
    sget-object v2, Landroidx/lifecycle/p;->q:Landroidx/lifecycle/p;

    .line 1556
    .line 1557
    if-eq v1, v2, :cond_48

    .line 1558
    .line 1559
    iget-object v1, v0, LW1/c;->a:LT1/d;

    .line 1560
    .line 1561
    iget-object v0, v0, LW1/c;->m:Lm5/o;

    .line 1562
    .line 1563
    invoke-virtual {v0}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    check-cast v0, Landroidx/lifecycle/h0;

    .line 1568
    .line 1569
    const/4 v7, 0x4

    .line 1570
    invoke-static {v1, v0, v7}, LO3/D;->p(Landroidx/lifecycle/l0;Landroidx/lifecycle/h0;I)Landroidx/lifecycle/j0;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v0

    .line 1574
    const-class v1, LW1/b;

    .line 1575
    .line 1576
    invoke-static {v1}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v1

    .line 1580
    iget-object v0, v0, Landroidx/lifecycle/j0;->a:Ljava/lang/Object;

    .line 1581
    .line 1582
    check-cast v0, LE/c0;

    .line 1583
    .line 1584
    invoke-virtual {v1}, Lkotlin/jvm/internal/f;->b()Ljava/lang/String;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v2

    .line 1588
    if-eqz v2, :cond_47

    .line 1589
    .line 1590
    const-string v3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 1591
    .line 1592
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v2

    .line 1596
    invoke-virtual {v0, v2, v1}, LE/c0;->v(Ljava/lang/String;Lkotlin/jvm/internal/f;)Landroidx/lifecycle/f0;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v0

    .line 1600
    check-cast v0, LW1/b;

    .line 1601
    .line 1602
    iget-object v0, v0, LW1/b;->b:Landroidx/lifecycle/U;

    .line 1603
    .line 1604
    return-object v0

    .line 1605
    :cond_47
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1606
    .line 1607
    const-string v1, "Local and anonymous classes can not be ViewModels"

    .line 1608
    .line 1609
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1610
    .line 1611
    .line 1612
    throw v0

    .line 1613
    :cond_48
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1614
    .line 1615
    const-string v1, "You cannot access the NavBackStackEntry\'s SavedStateHandle after the NavBackStackEntry is destroyed."

    .line 1616
    .line 1617
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1618
    .line 1619
    .line 1620
    throw v0

    .line 1621
    :cond_49
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1622
    .line 1623
    const-string v1, "You cannot access the NavBackStackEntry\'s SavedStateHandle until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."

    .line 1624
    .line 1625
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1626
    .line 1627
    .line 1628
    throw v0

    .line 1629
    :pswitch_14
    check-cast v6, LI2/y;

    .line 1630
    .line 1631
    iget-object v0, v6, LI2/y;->a:LI2/t;

    .line 1632
    .line 1633
    iget-object v0, v0, LI2/t;->d:Lm5/o;

    .line 1634
    .line 1635
    invoke-virtual {v0}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v0

    .line 1639
    check-cast v0, LK2/i;

    .line 1640
    .line 1641
    return-object v0

    .line 1642
    :pswitch_15
    check-cast v6, LJ2/e;

    .line 1643
    .line 1644
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 1645
    .line 1646
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1647
    .line 1648
    .line 1649
    iget-object v2, v6, LJ2/e;->b:LU2/n;

    .line 1650
    .line 1651
    new-instance v3, LJ2/b;

    .line 1652
    .line 1653
    iget-object v4, v6, LJ2/e;->d:Ljava/lang/Object;

    .line 1654
    .line 1655
    check-cast v4, LJ2/q;

    .line 1656
    .line 1657
    invoke-interface {v4}, LJ2/q;->O()Lq6/i;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v4

    .line 1661
    const/4 v9, 0x0

    .line 1662
    invoke-direct {v3, v4, v9}, LJ2/b;-><init>(Lq6/G;I)V

    .line 1663
    .line 1664
    .line 1665
    invoke-static {v3}, La/a;->j(Lq6/G;)Lq6/A;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v4

    .line 1669
    const/4 v1, 0x1

    .line 1670
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1671
    .line 1672
    invoke-virtual {v4}, Lq6/A;->c()Lq6/A;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v8

    .line 1676
    new-instance v10, Lq6/f;

    .line 1677
    .line 1678
    invoke-direct {v10, v8, v1}, Lq6/f;-><init>(Lq6/i;I)V

    .line 1679
    .line 1680
    .line 1681
    const/4 v8, 0x0

    .line 1682
    invoke-static {v10, v8, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1683
    .line 1684
    .line 1685
    iget-object v8, v3, LJ2/b;->s:Ljava/lang/Exception;

    .line 1686
    .line 1687
    if-nez v8, :cond_73

    .line 1688
    .line 1689
    iput-boolean v9, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1690
    .line 1691
    sget-object v8, LJ2/o;->a:Landroid/graphics/Paint;

    .line 1692
    .line 1693
    iget-object v8, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 1694
    .line 1695
    iget-object v6, v6, LJ2/e;->e:Ljava/lang/Object;

    .line 1696
    .line 1697
    check-cast v6, LJ2/n;

    .line 1698
    .line 1699
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1700
    .line 1701
    .line 1702
    if-eqz v8, :cond_4b

    .line 1703
    .line 1704
    invoke-virtual {v8, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1705
    .line 1706
    .line 1707
    move-result v6

    .line 1708
    if-nez v6, :cond_4a

    .line 1709
    .line 1710
    const-string v6, "image/webp"

    .line 1711
    .line 1712
    invoke-virtual {v8, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1713
    .line 1714
    .line 1715
    move-result v6

    .line 1716
    if-nez v6, :cond_4a

    .line 1717
    .line 1718
    const-string v6, "image/heic"

    .line 1719
    .line 1720
    invoke-virtual {v8, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1721
    .line 1722
    .line 1723
    move-result v6

    .line 1724
    if-nez v6, :cond_4a

    .line 1725
    .line 1726
    const-string v6, "image/heif"

    .line 1727
    .line 1728
    invoke-virtual {v8, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1729
    .line 1730
    .line 1731
    move-result v6

    .line 1732
    if-eqz v6, :cond_4b

    .line 1733
    .line 1734
    :cond_4a
    const/4 v6, 0x1

    .line 1735
    goto :goto_29

    .line 1736
    :cond_4b
    const/4 v6, 0x0

    .line 1737
    :goto_29
    if-eqz v6, :cond_4f

    .line 1738
    .line 1739
    new-instance v6, LH1/g;

    .line 1740
    .line 1741
    new-instance v8, LJ2/m;

    .line 1742
    .line 1743
    invoke-virtual {v4}, Lq6/A;->c()Lq6/A;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v9

    .line 1747
    new-instance v10, Lq6/f;

    .line 1748
    .line 1749
    const/4 v1, 0x1

    .line 1750
    invoke-direct {v10, v9, v1}, Lq6/f;-><init>(Lq6/i;I)V

    .line 1751
    .line 1752
    .line 1753
    const/4 v9, 0x0

    .line 1754
    invoke-direct {v8, v10, v9}, LJ2/m;-><init>(Ljava/io/InputStream;I)V

    .line 1755
    .line 1756
    .line 1757
    invoke-direct {v6, v8}, LH1/g;-><init>(Ljava/io/InputStream;)V

    .line 1758
    .line 1759
    .line 1760
    new-instance v8, LJ2/l;

    .line 1761
    .line 1762
    invoke-virtual {v6, v12}, LH1/g;->c(Ljava/lang/String;)LH1/c;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v9

    .line 1766
    if-nez v9, :cond_4c

    .line 1767
    .line 1768
    goto :goto_2a

    .line 1769
    :cond_4c
    :try_start_7
    iget-object v10, v6, LH1/g;->f:Ljava/nio/ByteOrder;

    .line 1770
    .line 1771
    invoke-virtual {v9, v10}, LH1/c;->e(Ljava/nio/ByteOrder;)I

    .line 1772
    .line 1773
    .line 1774
    move-result v9
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_2

    .line 1775
    goto :goto_2b

    .line 1776
    :catch_2
    :goto_2a
    const/4 v9, 0x1

    .line 1777
    :goto_2b
    if-eq v9, v15, :cond_4d

    .line 1778
    .line 1779
    if-eq v9, v7, :cond_4d

    .line 1780
    .line 1781
    const/4 v7, 0x4

    .line 1782
    if-eq v9, v7, :cond_4d

    .line 1783
    .line 1784
    const/4 v7, 0x5

    .line 1785
    if-eq v9, v7, :cond_4d

    .line 1786
    .line 1787
    const/4 v7, 0x0

    .line 1788
    goto :goto_2c

    .line 1789
    :cond_4d
    const/4 v7, 0x1

    .line 1790
    :goto_2c
    invoke-virtual {v6, v12}, LH1/g;->c(Ljava/lang/String;)LH1/c;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v9

    .line 1794
    if-nez v9, :cond_4e

    .line 1795
    .line 1796
    goto :goto_2d

    .line 1797
    :cond_4e
    :try_start_8
    iget-object v6, v6, LH1/g;->f:Ljava/nio/ByteOrder;

    .line 1798
    .line 1799
    invoke-virtual {v9, v6}, LH1/c;->e(Ljava/nio/ByteOrder;)I

    .line 1800
    .line 1801
    .line 1802
    move-result v6
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_3

    .line 1803
    goto :goto_2e

    .line 1804
    :catch_3
    :goto_2d
    const/4 v6, 0x1

    .line 1805
    :goto_2e
    packed-switch v6, :pswitch_data_2

    .line 1806
    .line 1807
    .line 1808
    const/4 v6, 0x0

    .line 1809
    goto :goto_2f

    .line 1810
    :pswitch_16
    const/16 v6, 0x5a

    .line 1811
    .line 1812
    goto :goto_2f

    .line 1813
    :pswitch_17
    const/16 v6, 0x10e

    .line 1814
    .line 1815
    goto :goto_2f

    .line 1816
    :pswitch_18
    const/16 v6, 0xb4

    .line 1817
    .line 1818
    :goto_2f
    invoke-direct {v8, v6, v7}, LJ2/l;-><init>(IZ)V

    .line 1819
    .line 1820
    .line 1821
    goto :goto_30

    .line 1822
    :cond_4f
    sget-object v8, LJ2/l;->c:LJ2/l;

    .line 1823
    .line 1824
    :goto_30
    iget v6, v8, LJ2/l;->b:I

    .line 1825
    .line 1826
    iget-boolean v7, v8, LJ2/l;->a:Z

    .line 1827
    .line 1828
    iget-object v8, v3, LJ2/b;->s:Ljava/lang/Exception;

    .line 1829
    .line 1830
    if-nez v8, :cond_72

    .line 1831
    .line 1832
    const/4 v9, 0x0

    .line 1833
    iput-boolean v9, v0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 1834
    .line 1835
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1836
    .line 1837
    const/16 v12, 0x1a

    .line 1838
    .line 1839
    if-lt v8, v12, :cond_50

    .line 1840
    .line 1841
    sget-object v9, LU2/i;->b:LI2/l;

    .line 1842
    .line 1843
    invoke-static {v2, v9}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v10

    .line 1847
    invoke-static {v10}, LC0/U;->g(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v10

    .line 1851
    if-eqz v10, :cond_50

    .line 1852
    .line 1853
    invoke-static {v2, v9}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v9

    .line 1857
    invoke-static {v9}, LC0/U;->g(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v9

    .line 1861
    invoke-static {v0, v9}, Ld0/l;->n(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 1862
    .line 1863
    .line 1864
    :cond_50
    sget-object v9, LU2/i;->c:LI2/l;

    .line 1865
    .line 1866
    invoke-static {v2, v9}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v9

    .line 1870
    check-cast v9, Ljava/lang/Boolean;

    .line 1871
    .line 1872
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1873
    .line 1874
    .line 1875
    move-result v9

    .line 1876
    iget-object v10, v2, LU2/n;->a:Landroid/content/Context;

    .line 1877
    .line 1878
    iput-boolean v9, v0, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 1879
    .line 1880
    sget-object v9, LU2/i;->a:LI2/l;

    .line 1881
    .line 1882
    invoke-static {v2, v9}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v9

    .line 1886
    check-cast v9, Landroid/graphics/Bitmap$Config;

    .line 1887
    .line 1888
    if-nez v7, :cond_51

    .line 1889
    .line 1890
    if-lez v6, :cond_53

    .line 1891
    .line 1892
    :cond_51
    if-eqz v9, :cond_52

    .line 1893
    .line 1894
    invoke-static {v9}, Ll6/d;->v(Landroid/graphics/Bitmap$Config;)Z

    .line 1895
    .line 1896
    .line 1897
    move-result v11

    .line 1898
    if-eqz v11, :cond_53

    .line 1899
    .line 1900
    :cond_52
    sget-object v9, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1901
    .line 1902
    :cond_53
    sget-object v11, LU2/i;->f:LI2/l;

    .line 1903
    .line 1904
    invoke-static {v2, v11}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v11

    .line 1908
    check-cast v11, Ljava/lang/Boolean;

    .line 1909
    .line 1910
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1911
    .line 1912
    .line 1913
    move-result v11

    .line 1914
    if-eqz v11, :cond_54

    .line 1915
    .line 1916
    sget-object v11, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1917
    .line 1918
    if-ne v9, v11, :cond_54

    .line 1919
    .line 1920
    iget-object v11, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 1921
    .line 1922
    invoke-static {v11, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1923
    .line 1924
    .line 1925
    move-result v5

    .line 1926
    if-eqz v5, :cond_54

    .line 1927
    .line 1928
    sget-object v9, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 1929
    .line 1930
    :cond_54
    const/16 v12, 0x1a

    .line 1931
    .line 1932
    if-lt v8, v12, :cond_55

    .line 1933
    .line 1934
    invoke-static {v0}, Ld0/l;->d(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v5

    .line 1938
    invoke-static {}, Ld0/l;->c()Landroid/graphics/Bitmap$Config;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v8

    .line 1942
    if-ne v5, v8, :cond_55

    .line 1943
    .line 1944
    invoke-static {}, Ld0/l;->w()Landroid/graphics/Bitmap$Config;

    .line 1945
    .line 1946
    .line 1947
    move-result-object v5

    .line 1948
    if-eq v9, v5, :cond_55

    .line 1949
    .line 1950
    invoke-static {}, Ld0/l;->c()Landroid/graphics/Bitmap$Config;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v9

    .line 1954
    :cond_55
    iput-object v9, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 1955
    .line 1956
    iget v5, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 1957
    .line 1958
    if-lez v5, :cond_56

    .line 1959
    .line 1960
    iget v8, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 1961
    .line 1962
    if-gtz v8, :cond_57

    .line 1963
    .line 1964
    :cond_56
    const/4 v1, 0x1

    .line 1965
    goto/16 :goto_38

    .line 1966
    .line 1967
    :cond_57
    const/16 v9, 0x5a

    .line 1968
    .line 1969
    const/16 v12, 0x10e

    .line 1970
    .line 1971
    if-eq v6, v9, :cond_59

    .line 1972
    .line 1973
    if-ne v6, v12, :cond_58

    .line 1974
    .line 1975
    goto :goto_31

    .line 1976
    :cond_58
    move v11, v5

    .line 1977
    goto :goto_32

    .line 1978
    :cond_59
    :goto_31
    move v11, v8

    .line 1979
    :goto_32
    if-eq v6, v9, :cond_5b

    .line 1980
    .line 1981
    if-ne v6, v12, :cond_5a

    .line 1982
    .line 1983
    goto :goto_33

    .line 1984
    :cond_5a
    move v5, v8

    .line 1985
    :cond_5b
    :goto_33
    iget-object v8, v2, LU2/n;->b:LV2/h;

    .line 1986
    .line 1987
    iget-object v9, v2, LU2/n;->c:LV2/g;

    .line 1988
    .line 1989
    sget-object v12, LU2/h;->b:LI2/l;

    .line 1990
    .line 1991
    invoke-static {v2, v12}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v12

    .line 1995
    check-cast v12, LV2/h;

    .line 1996
    .line 1997
    invoke-static {v11, v5, v8, v9, v12}, LD5/a;->t(IILV2/h;LV2/g;LV2/h;)J

    .line 1998
    .line 1999
    .line 2000
    move-result-wide v12

    .line 2001
    const/16 v8, 0x20

    .line 2002
    .line 2003
    shr-long v14, v12, v8

    .line 2004
    .line 2005
    long-to-int v8, v14

    .line 2006
    const-wide v14, 0xffffffffL

    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    and-long/2addr v12, v14

    .line 2012
    long-to-int v12, v12

    .line 2013
    div-int v13, v11, v8

    .line 2014
    .line 2015
    invoke-static {v13}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 2016
    .line 2017
    .line 2018
    move-result v13

    .line 2019
    div-int v14, v5, v12

    .line 2020
    .line 2021
    invoke-static {v14}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 2022
    .line 2023
    .line 2024
    move-result v14

    .line 2025
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 2026
    .line 2027
    .line 2028
    move-result v15

    .line 2029
    if-eqz v15, :cond_5d

    .line 2030
    .line 2031
    const/4 v1, 0x1

    .line 2032
    if-ne v15, v1, :cond_5c

    .line 2033
    .line 2034
    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    .line 2035
    .line 2036
    .line 2037
    move-result v13

    .line 2038
    goto :goto_34

    .line 2039
    :cond_5c
    new-instance v0, LC2/e;

    .line 2040
    .line 2041
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2042
    .line 2043
    .line 2044
    throw v0

    .line 2045
    :cond_5d
    const/4 v1, 0x1

    .line 2046
    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    .line 2047
    .line 2048
    .line 2049
    move-result v13

    .line 2050
    :goto_34
    if-ge v13, v1, :cond_5e

    .line 2051
    .line 2052
    const/4 v13, 0x1

    .line 2053
    :cond_5e
    iput v13, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2054
    .line 2055
    int-to-double v14, v11

    .line 2056
    move-object v11, v2

    .line 2057
    int-to-double v1, v13

    .line 2058
    div-double/2addr v14, v1

    .line 2059
    move-wide/from16 v21, v1

    .line 2060
    .line 2061
    int-to-double v1, v5

    .line 2062
    div-double v1, v1, v21

    .line 2063
    .line 2064
    move-wide/from16 v21, v1

    .line 2065
    .line 2066
    int-to-double v1, v8

    .line 2067
    int-to-double v12, v12

    .line 2068
    div-double v14, v1, v14

    .line 2069
    .line 2070
    div-double v12, v12, v21

    .line 2071
    .line 2072
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 2073
    .line 2074
    .line 2075
    move-result v1

    .line 2076
    if-eqz v1, :cond_60

    .line 2077
    .line 2078
    const/4 v8, 0x1

    .line 2079
    if-ne v1, v8, :cond_5f

    .line 2080
    .line 2081
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->min(DD)D

    .line 2082
    .line 2083
    .line 2084
    move-result-wide v8

    .line 2085
    goto :goto_35

    .line 2086
    :cond_5f
    new-instance v0, LC2/e;

    .line 2087
    .line 2088
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2089
    .line 2090
    .line 2091
    throw v0

    .line 2092
    :cond_60
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->max(DD)D

    .line 2093
    .line 2094
    .line 2095
    move-result-wide v8

    .line 2096
    :goto_35
    iget-object v2, v11, LU2/n;->d:LV2/d;

    .line 2097
    .line 2098
    sget-object v5, LV2/d;->r:LV2/d;

    .line 2099
    .line 2100
    if-ne v2, v5, :cond_61

    .line 2101
    .line 2102
    cmpl-double v2, v8, v18

    .line 2103
    .line 2104
    if-lez v2, :cond_61

    .line 2105
    .line 2106
    move-wide/from16 v8, v18

    .line 2107
    .line 2108
    :cond_61
    cmpg-double v2, v8, v18

    .line 2109
    .line 2110
    if-nez v2, :cond_62

    .line 2111
    .line 2112
    const/4 v2, 0x1

    .line 2113
    goto :goto_36

    .line 2114
    :cond_62
    const/4 v2, 0x0

    .line 2115
    :goto_36
    xor-int/lit8 v5, v2, 0x1

    .line 2116
    .line 2117
    iput-boolean v5, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 2118
    .line 2119
    if-nez v2, :cond_63

    .line 2120
    .line 2121
    cmpl-double v2, v8, v18

    .line 2122
    .line 2123
    if-lez v2, :cond_64

    .line 2124
    .line 2125
    const v2, 0x7fffffff

    .line 2126
    .line 2127
    .line 2128
    int-to-double v11, v2

    .line 2129
    div-double/2addr v11, v8

    .line 2130
    invoke-static {v11, v12}, LD5/a;->F(D)I

    .line 2131
    .line 2132
    .line 2133
    move-result v5

    .line 2134
    iput v5, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 2135
    .line 2136
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 2137
    .line 2138
    :cond_63
    :goto_37
    const/4 v1, 0x1

    .line 2139
    const/4 v9, 0x0

    .line 2140
    goto :goto_39

    .line 2141
    :cond_64
    const v2, 0x7fffffff

    .line 2142
    .line 2143
    .line 2144
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 2145
    .line 2146
    int-to-double v11, v2

    .line 2147
    mul-double/2addr v11, v8

    .line 2148
    invoke-static {v11, v12}, LD5/a;->F(D)I

    .line 2149
    .line 2150
    .line 2151
    move-result v2

    .line 2152
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 2153
    .line 2154
    goto :goto_37

    .line 2155
    :goto_38
    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2156
    .line 2157
    const/4 v9, 0x0

    .line 2158
    iput-boolean v9, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 2159
    .line 2160
    :goto_39
    :try_start_9
    new-instance v2, Lq6/f;

    .line 2161
    .line 2162
    invoke-direct {v2, v4, v1}, Lq6/f;-><init>(Lq6/i;I)V

    .line 2163
    .line 2164
    .line 2165
    const/4 v8, 0x0

    .line 2166
    invoke-static {v2, v8, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 2167
    .line 2168
    .line 2169
    move-result-object v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 2170
    invoke-virtual {v4}, Lq6/A;->close()V

    .line 2171
    .line 2172
    .line 2173
    iget-object v3, v3, LJ2/b;->s:Ljava/lang/Exception;

    .line 2174
    .line 2175
    if-nez v3, :cond_71

    .line 2176
    .line 2177
    if-eqz v2, :cond_70

    .line 2178
    .line 2179
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v3

    .line 2183
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 2184
    .line 2185
    .line 2186
    move-result-object v3

    .line 2187
    iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 2188
    .line 2189
    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 2190
    .line 2191
    .line 2192
    if-nez v7, :cond_65

    .line 2193
    .line 2194
    if-lez v6, :cond_6d

    .line 2195
    .line 2196
    :cond_65
    new-instance v3, Landroid/graphics/Matrix;

    .line 2197
    .line 2198
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 2199
    .line 2200
    .line 2201
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2202
    .line 2203
    .line 2204
    move-result v4

    .line 2205
    int-to-float v4, v4

    .line 2206
    div-float v4, v4, v16

    .line 2207
    .line 2208
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 2209
    .line 2210
    .line 2211
    move-result v5

    .line 2212
    int-to-float v5, v5

    .line 2213
    div-float v5, v5, v16

    .line 2214
    .line 2215
    if-eqz v7, :cond_66

    .line 2216
    .line 2217
    const/high16 v7, 0x3f800000    # 1.0f

    .line 2218
    .line 2219
    const/high16 v8, -0x40800000    # -1.0f

    .line 2220
    .line 2221
    invoke-virtual {v3, v8, v7, v4, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 2222
    .line 2223
    .line 2224
    :cond_66
    if-lez v6, :cond_67

    .line 2225
    .line 2226
    int-to-float v7, v6

    .line 2227
    invoke-virtual {v3, v7, v4, v5}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 2228
    .line 2229
    .line 2230
    :cond_67
    new-instance v4, Landroid/graphics/RectF;

    .line 2231
    .line 2232
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2233
    .line 2234
    .line 2235
    move-result v5

    .line 2236
    int-to-float v5, v5

    .line 2237
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 2238
    .line 2239
    .line 2240
    move-result v7

    .line 2241
    int-to-float v7, v7

    .line 2242
    const/4 v8, 0x0

    .line 2243
    invoke-direct {v4, v8, v8, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 2244
    .line 2245
    .line 2246
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 2247
    .line 2248
    .line 2249
    iget v5, v4, Landroid/graphics/RectF;->left:F

    .line 2250
    .line 2251
    cmpg-float v7, v5, v8

    .line 2252
    .line 2253
    if-nez v7, :cond_68

    .line 2254
    .line 2255
    iget v7, v4, Landroid/graphics/RectF;->top:F

    .line 2256
    .line 2257
    cmpg-float v7, v7, v8

    .line 2258
    .line 2259
    if-nez v7, :cond_68

    .line 2260
    .line 2261
    :goto_3a
    const/16 v4, 0x5a

    .line 2262
    .line 2263
    goto :goto_3b

    .line 2264
    :cond_68
    neg-float v5, v5

    .line 2265
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 2266
    .line 2267
    neg-float v4, v4

    .line 2268
    invoke-virtual {v3, v5, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 2269
    .line 2270
    .line 2271
    goto :goto_3a

    .line 2272
    :goto_3b
    if-eq v6, v4, :cond_6b

    .line 2273
    .line 2274
    const/16 v12, 0x10e

    .line 2275
    .line 2276
    if-ne v6, v12, :cond_69

    .line 2277
    .line 2278
    goto :goto_3c

    .line 2279
    :cond_69
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2280
    .line 2281
    .line 2282
    move-result v4

    .line 2283
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 2284
    .line 2285
    .line 2286
    move-result v5

    .line 2287
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v6

    .line 2291
    if-nez v6, :cond_6a

    .line 2292
    .line 2293
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 2294
    .line 2295
    :cond_6a
    invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v4

    .line 2299
    goto :goto_3d

    .line 2300
    :cond_6b
    :goto_3c
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 2301
    .line 2302
    .line 2303
    move-result v4

    .line 2304
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2305
    .line 2306
    .line 2307
    move-result v5

    .line 2308
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 2309
    .line 2310
    .line 2311
    move-result-object v6

    .line 2312
    if-nez v6, :cond_6c

    .line 2313
    .line 2314
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 2315
    .line 2316
    :cond_6c
    invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v4

    .line 2320
    :goto_3d
    new-instance v5, Landroid/graphics/Canvas;

    .line 2321
    .line 2322
    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 2323
    .line 2324
    .line 2325
    sget-object v6, LJ2/o;->a:Landroid/graphics/Paint;

    .line 2326
    .line 2327
    invoke-virtual {v5, v2, v3, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 2328
    .line 2329
    .line 2330
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 2331
    .line 2332
    .line 2333
    move-object v2, v4

    .line 2334
    :cond_6d
    new-instance v3, LJ2/i;

    .line 2335
    .line 2336
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2337
    .line 2338
    .line 2339
    move-result-object v4

    .line 2340
    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    .line 2341
    .line 2342
    invoke-direct {v5, v4, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 2343
    .line 2344
    .line 2345
    invoke-static {v5}, LI2/q;->c(Landroid/graphics/drawable/Drawable;)LI2/n;

    .line 2346
    .line 2347
    .line 2348
    move-result-object v2

    .line 2349
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2350
    .line 2351
    const/4 v1, 0x1

    .line 2352
    if-gt v4, v1, :cond_6f

    .line 2353
    .line 2354
    iget-boolean v0, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 2355
    .line 2356
    if-eqz v0, :cond_6e

    .line 2357
    .line 2358
    goto :goto_3e

    .line 2359
    :cond_6e
    move v1, v9

    .line 2360
    goto :goto_3f

    .line 2361
    :cond_6f
    :goto_3e
    const/4 v1, 0x1

    .line 2362
    :goto_3f
    invoke-direct {v3, v2, v1}, LJ2/i;-><init>(LI2/n;Z)V

    .line 2363
    .line 2364
    .line 2365
    return-object v3

    .line 2366
    :cond_70
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2367
    .line 2368
    const-string v1, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    .line 2369
    .line 2370
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2371
    .line 2372
    .line 2373
    throw v0

    .line 2374
    :cond_71
    throw v3

    .line 2375
    :catchall_5
    move-exception v0

    .line 2376
    move-object v1, v0

    .line 2377
    :try_start_a
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 2378
    :catchall_6
    move-exception v0

    .line 2379
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/measurement/I1;->N(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 2380
    .line 2381
    .line 2382
    throw v0

    .line 2383
    :cond_72
    throw v8

    .line 2384
    :cond_73
    throw v8

    .line 2385
    :pswitch_19
    return-object v6

    .line 2386
    :pswitch_1a
    check-cast v6, LE/c0;

    .line 2387
    .line 2388
    const-class v0, Landroid/app/ActivityManager;

    .line 2389
    .line 2390
    iget-object v2, v6, LE/c0;->q:Ljava/lang/Object;

    .line 2391
    .line 2392
    check-cast v2, Landroid/content/Context;

    .line 2393
    .line 2394
    const-wide v3, 0x3fc999999999999aL    # 0.2

    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    :try_start_b
    invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 2400
    .line 2401
    .line 2402
    move-result-object v5

    .line 2403
    invoke-static {v5}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 2404
    .line 2405
    .line 2406
    check-cast v5, Landroid/app/ActivityManager;

    .line 2407
    .line 2408
    invoke-virtual {v5}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 2409
    .line 2410
    .line 2411
    move-result v5
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4

    .line 2412
    if-eqz v5, :cond_74

    .line 2413
    .line 2414
    const-wide v3, 0x3fc3333333333333L    # 0.15

    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    :catch_4
    :cond_74
    const-wide/16 v5, 0x0

    .line 2420
    .line 2421
    cmpg-double v5, v5, v3

    .line 2422
    .line 2423
    if-gtz v5, :cond_77

    .line 2424
    .line 2425
    cmpg-double v5, v3, v18

    .line 2426
    .line 2427
    if-gtz v5, :cond_77

    .line 2428
    .line 2429
    new-instance v5, LB2/g;

    .line 2430
    .line 2431
    const/4 v1, 0x1

    .line 2432
    invoke-direct {v5, v1}, LB2/g;-><init>(I)V

    .line 2433
    .line 2434
    .line 2435
    :try_start_c
    invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 2436
    .line 2437
    .line 2438
    move-result-object v0

    .line 2439
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 2440
    .line 2441
    .line 2442
    check-cast v0, Landroid/app/ActivityManager;

    .line 2443
    .line 2444
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 2445
    .line 2446
    .line 2447
    move-result-object v1

    .line 2448
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 2449
    .line 2450
    const/high16 v2, 0x100000

    .line 2451
    .line 2452
    and-int/2addr v1, v2

    .line 2453
    if-eqz v1, :cond_75

    .line 2454
    .line 2455
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getLargeMemoryClass()I

    .line 2456
    .line 2457
    .line 2458
    move-result v0

    .line 2459
    goto :goto_40

    .line 2460
    :cond_75
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 2461
    .line 2462
    .line 2463
    move-result v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_5

    .line 2464
    goto :goto_40

    .line 2465
    :catch_5
    const/16 v0, 0x100

    .line 2466
    .line 2467
    :goto_40
    int-to-long v0, v0

    .line 2468
    const-wide/32 v6, 0x100000

    .line 2469
    .line 2470
    .line 2471
    mul-long/2addr v0, v6

    .line 2472
    long-to-double v0, v0

    .line 2473
    mul-double/2addr v3, v0

    .line 2474
    double-to-long v0, v3

    .line 2475
    const-wide/16 v2, 0x0

    .line 2476
    .line 2477
    cmp-long v2, v0, v2

    .line 2478
    .line 2479
    if-lez v2, :cond_76

    .line 2480
    .line 2481
    new-instance v2, LB0/o;

    .line 2482
    .line 2483
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 2484
    .line 2485
    .line 2486
    iput-object v5, v2, LB0/o;->q:Ljava/lang/Object;

    .line 2487
    .line 2488
    new-instance v3, LO3/D1;

    .line 2489
    .line 2490
    invoke-direct {v3, v0, v1, v2}, LO3/D1;-><init>(JLB0/o;)V

    .line 2491
    .line 2492
    .line 2493
    iput-object v3, v2, LB0/o;->r:Ljava/lang/Object;

    .line 2494
    .line 2495
    goto :goto_41

    .line 2496
    :cond_76
    new-instance v2, Lk3/d;

    .line 2497
    .line 2498
    const/16 v0, 0xf

    .line 2499
    .line 2500
    invoke-direct {v2, v0, v5}, Lk3/d;-><init>(ILjava/lang/Object;)V

    .line 2501
    .line 2502
    .line 2503
    :goto_41
    new-instance v0, LP2/c;

    .line 2504
    .line 2505
    invoke-direct {v0, v2, v5}, LP2/c;-><init>(LP2/f;LB2/g;)V

    .line 2506
    .line 2507
    .line 2508
    return-object v0

    .line 2509
    :cond_77
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2510
    .line 2511
    const-string v1, "percent must be in the range [0.0, 1.0]."

    .line 2512
    .line 2513
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2514
    .line 2515
    .line 2516
    throw v0

    .line 2517
    :pswitch_1b
    check-cast v6, Lm5/j;

    .line 2518
    .line 2519
    invoke-static {v6}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 2520
    .line 2521
    .line 2522
    move-result-object v0

    .line 2523
    return-object v0

    .line 2524
    nop

    .line 2525
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    :pswitch_data_2
    .packed-switch 0x3
        :pswitch_18
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_16
        :pswitch_17
    .end packed-switch
.end method
