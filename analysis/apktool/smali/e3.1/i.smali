.class public final Le3/i;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Landroid/graphics/Rect;

.field public final synthetic r:Landroid/graphics/Matrix;

.field public final synthetic s:La3/y;

.field public final synthetic t:La3/k;

.field public final synthetic u:Landroid/content/Context;

.field public final synthetic v:LB5/a;

.field public final synthetic w:LP/W;


# direct methods
.method public constructor <init>(Landroid/graphics/Rect;Landroid/graphics/Matrix;La3/y;La3/k;Landroid/content/Context;LB5/a;LP/W;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le3/i;->q:Landroid/graphics/Rect;

    .line 2
    .line 3
    iput-object p2, p0, Le3/i;->r:Landroid/graphics/Matrix;

    .line 4
    .line 5
    iput-object p3, p0, Le3/i;->s:La3/y;

    .line 6
    .line 7
    iput-object p4, p0, Le3/i;->t:La3/k;

    .line 8
    .line 9
    iput-object p5, p0, Le3/i;->u:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p6, p0, Le3/i;->v:LB5/a;

    .line 12
    .line 13
    iput-object p7, p0, Le3/i;->w:LP/W;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    check-cast v0, Ll0/d;

    .line 6
    .line 7
    const-string v2, "$this$Canvas"

    .line 8
    .line 9
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ll0/d;->z()LB0/G0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, LB0/G0;->t()Lj0/m;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, v1, Le3/i;->q:Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    int-to-float v4, v4

    .line 27
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    int-to-float v5, v5

    .line 32
    invoke-static {v4, v5}, Ln5/A;->g(FF)J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    invoke-interface {v0}, Ll0/d;->d()J

    .line 37
    .line 38
    .line 39
    move-result-wide v6

    .line 40
    invoke-static {v6, v7}, Li0/e;->d(J)F

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-static {v6}, LD5/a;->G(F)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    invoke-interface {v0}, Ll0/d;->d()J

    .line 49
    .line 50
    .line 51
    move-result-wide v7

    .line 52
    invoke-static {v7, v8}, Li0/e;->b(J)F

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    invoke-static {v7}, LD5/a;->G(F)I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    invoke-static {v6, v7}, Lcom/google/android/gms/internal/measurement/P1;->a(II)J

    .line 61
    .line 62
    .line 63
    move-result-wide v6

    .line 64
    invoke-interface {v0}, Ll0/d;->d()J

    .line 65
    .line 66
    .line 67
    move-result-wide v8

    .line 68
    invoke-static {v4, v5, v8, v9}, Lz0/O;->c(JJ)F

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    int-to-long v9, v9

    .line 77
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    int-to-long v11, v8

    .line 82
    const/16 v8, 0x20

    .line 83
    .line 84
    shl-long/2addr v9, v8

    .line 85
    const-wide v13, 0xffffffffL

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    and-long/2addr v11, v13

    .line 91
    or-long/2addr v9, v11

    .line 92
    sget v11, Lz0/N;->a:I

    .line 93
    .line 94
    invoke-static {v4, v5}, Li0/e;->d(J)F

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    sget v12, Lz0/N;->a:I

    .line 99
    .line 100
    move/from16 p1, v8

    .line 101
    .line 102
    move-wide v15, v9

    .line 103
    shr-long v8, v15, p1

    .line 104
    .line 105
    long-to-int v8, v8

    .line 106
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    mul-float/2addr v9, v11

    .line 111
    float-to-int v9, v9

    .line 112
    invoke-static {v4, v5}, Li0/e;->b(J)F

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    and-long v10, v15, v13

    .line 117
    .line 118
    long-to-int v5, v10

    .line 119
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    mul-float/2addr v10, v4

    .line 124
    float-to-int v4, v10

    .line 125
    invoke-static {v9, v4}, Lcom/google/android/gms/internal/measurement/P1;->a(II)J

    .line 126
    .line 127
    .line 128
    move-result-wide v9

    .line 129
    invoke-interface {v0}, Ll0/d;->getLayoutDirection()LW0/l;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    shr-long v11, v6, p1

    .line 134
    .line 135
    long-to-int v4, v11

    .line 136
    shr-long v11, v9, p1

    .line 137
    .line 138
    long-to-int v11, v11

    .line 139
    sub-int/2addr v4, v11

    .line 140
    int-to-float v4, v4

    .line 141
    const/high16 v11, 0x40000000    # 2.0f

    .line 142
    .line 143
    div-float/2addr v4, v11

    .line 144
    and-long/2addr v6, v13

    .line 145
    long-to-int v6, v6

    .line 146
    and-long/2addr v9, v13

    .line 147
    long-to-int v7, v9

    .line 148
    sub-int/2addr v6, v7

    .line 149
    int-to-float v6, v6

    .line 150
    div-float/2addr v6, v11

    .line 151
    sget-object v7, LW0/l;->q:LW0/l;

    .line 152
    .line 153
    const/4 v9, 0x0

    .line 154
    if-ne v0, v7, :cond_0

    .line 155
    .line 156
    move v0, v9

    .line 157
    goto :goto_0

    .line 158
    :cond_0
    const/4 v0, -0x1

    .line 159
    int-to-float v0, v0

    .line 160
    mul-float/2addr v0, v9

    .line 161
    :goto_0
    const/4 v7, 0x1

    .line 162
    int-to-float v10, v7

    .line 163
    add-float/2addr v0, v10

    .line 164
    mul-float/2addr v0, v4

    .line 165
    add-float/2addr v10, v9

    .line 166
    mul-float/2addr v10, v6

    .line 167
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    int-to-long v9, v0

    .line 176
    shl-long v9, v9, p1

    .line 177
    .line 178
    int-to-long v11, v4

    .line 179
    and-long/2addr v11, v13

    .line 180
    or-long/2addr v9, v11

    .line 181
    iget-object v0, v1, Le3/i;->r:Landroid/graphics/Matrix;

    .line 182
    .line 183
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 184
    .line 185
    .line 186
    shr-long v11, v9, p1

    .line 187
    .line 188
    long-to-int v4, v11

    .line 189
    int-to-float v4, v4

    .line 190
    and-long/2addr v9, v13

    .line 191
    long-to-int v6, v9

    .line 192
    int-to-float v6, v6

    .line 193
    invoke-virtual {v0, v4, v6}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 194
    .line 195
    .line 196
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    invoke-virtual {v0, v4, v5}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 205
    .line 206
    .line 207
    iget-object v4, v1, Le3/i;->s:La3/y;

    .line 208
    .line 209
    iget-object v5, v4, La3/y;->B:Lk3/d;

    .line 210
    .line 211
    iget-object v5, v5, Lk3/d;->r:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v5, Ljava/util/HashSet;

    .line 214
    .line 215
    sget-object v6, La3/z;->q:La3/z;

    .line 216
    .line 217
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    iget-object v6, v4, La3/y;->q:La3/k;

    .line 222
    .line 223
    if-eqz v6, :cond_1

    .line 224
    .line 225
    if-eqz v5, :cond_1

    .line 226
    .line 227
    invoke-virtual {v4}, La3/y;->c()V

    .line 228
    .line 229
    .line 230
    :cond_1
    const/4 v5, 0x0

    .line 231
    iput-boolean v5, v4, La3/y;->u:Z

    .line 232
    .line 233
    sget-object v6, La3/I;->q:La3/I;

    .line 234
    .line 235
    iput-object v6, v4, La3/y;->L:La3/I;

    .line 236
    .line 237
    invoke-virtual {v4}, La3/y;->e()V

    .line 238
    .line 239
    .line 240
    sget-object v6, La3/a;->q:La3/a;

    .line 241
    .line 242
    iput-object v6, v4, La3/y;->b0:La3/a;

    .line 243
    .line 244
    iget-object v8, v1, Le3/i;->t:La3/k;

    .line 245
    .line 246
    invoke-virtual {v4, v8}, La3/y;->n(La3/k;)Z

    .line 247
    .line 248
    .line 249
    iget-object v8, v4, La3/y;->z:Ljava/util/Map;

    .line 250
    .line 251
    const/4 v9, 0x0

    .line 252
    if-nez v8, :cond_2

    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_2
    iput-object v9, v4, La3/y;->z:Ljava/util/Map;

    .line 256
    .line 257
    invoke-virtual {v4}, La3/y;->invalidateSelf()V

    .line 258
    .line 259
    .line 260
    :goto_1
    iget-object v8, v1, Le3/i;->w:LP/W;

    .line 261
    .line 262
    invoke-interface {v8}, LP/S0;->getValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    if-nez v8, :cond_14

    .line 267
    .line 268
    iget-boolean v8, v4, La3/y;->H:Z

    .line 269
    .line 270
    if-nez v8, :cond_3

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_3
    iput-boolean v5, v4, La3/y;->H:Z

    .line 274
    .line 275
    iget-object v8, v4, La3/y;->E:Lj3/c;

    .line 276
    .line 277
    if-eqz v8, :cond_4

    .line 278
    .line 279
    invoke-virtual {v8, v5}, Lj3/c;->q(Z)V

    .line 280
    .line 281
    .line 282
    :cond_4
    :goto_2
    iput-boolean v5, v4, La3/y;->I:Z

    .line 283
    .line 284
    iput-boolean v7, v4, La3/y;->J:Z

    .line 285
    .line 286
    iput-boolean v5, v4, La3/y;->C:Z

    .line 287
    .line 288
    iget-boolean v8, v4, La3/y;->D:Z

    .line 289
    .line 290
    if-eq v7, v8, :cond_6

    .line 291
    .line 292
    iput-boolean v7, v4, La3/y;->D:Z

    .line 293
    .line 294
    iget-object v8, v4, La3/y;->E:Lj3/c;

    .line 295
    .line 296
    if-eqz v8, :cond_5

    .line 297
    .line 298
    iput-boolean v7, v8, Lj3/c;->L:Z

    .line 299
    .line 300
    :cond_5
    invoke-virtual {v4}, La3/y;->invalidateSelf()V

    .line 301
    .line 302
    .line 303
    :cond_6
    iget-boolean v8, v4, La3/y;->K:Z

    .line 304
    .line 305
    if-eqz v8, :cond_7

    .line 306
    .line 307
    iput-boolean v5, v4, La3/y;->K:Z

    .line 308
    .line 309
    invoke-virtual {v4}, La3/y;->invalidateSelf()V

    .line 310
    .line 311
    .line 312
    :cond_7
    sget-object v8, La3/y;->j0:Ljava/util/List;

    .line 313
    .line 314
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 315
    .line 316
    .line 317
    move-result-object v8

    .line 318
    move-object v10, v9

    .line 319
    :cond_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v11

    .line 323
    if-eqz v11, :cond_9

    .line 324
    .line 325
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v10

    .line 329
    check-cast v10, Ljava/lang/String;

    .line 330
    .line 331
    iget-object v11, v4, La3/y;->q:La3/k;

    .line 332
    .line 333
    invoke-virtual {v11, v10}, La3/k;->d(Ljava/lang/String;)Lg3/h;

    .line 334
    .line 335
    .line 336
    move-result-object v10

    .line 337
    if-eqz v10, :cond_8

    .line 338
    .line 339
    :cond_9
    iget-object v8, v1, Le3/i;->u:Landroid/content/Context;

    .line 340
    .line 341
    invoke-virtual {v4, v8}, La3/y;->b(Landroid/content/Context;)Z

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    if-nez v8, :cond_a

    .line 346
    .line 347
    if-eqz v10, :cond_a

    .line 348
    .line 349
    iget v8, v10, Lg3/h;->b:F

    .line 350
    .line 351
    invoke-virtual {v4, v8}, La3/y;->u(F)V

    .line 352
    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_a
    iget-object v8, v1, Le3/i;->v:LB5/a;

    .line 356
    .line 357
    invoke-interface {v8}, LB5/a;->invoke()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v8

    .line 361
    check-cast v8, Ljava/lang/Number;

    .line 362
    .line 363
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 364
    .line 365
    .line 366
    move-result v8

    .line 367
    invoke-virtual {v4, v8}, La3/y;->u(F)V

    .line 368
    .line 369
    .line 370
    :goto_3
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    invoke-virtual {v4, v5, v5, v8, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 379
    .line 380
    .line 381
    invoke-static {v2}, Lj0/c;->a(Lj0/m;)Landroid/graphics/Canvas;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    iget-object v3, v4, La3/y;->f0:La3/u;

    .line 386
    .line 387
    sget-object v8, La3/y;->k0:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 388
    .line 389
    iget-object v10, v4, La3/y;->r:Ln3/e;

    .line 390
    .line 391
    iget-object v11, v4, La3/y;->c0:Ljava/util/concurrent/Semaphore;

    .line 392
    .line 393
    iget-object v12, v4, La3/y;->E:Lj3/c;

    .line 394
    .line 395
    iget-object v13, v4, La3/y;->q:La3/k;

    .line 396
    .line 397
    if-eqz v12, :cond_13

    .line 398
    .line 399
    if-nez v13, :cond_b

    .line 400
    .line 401
    goto/16 :goto_9

    .line 402
    .line 403
    :cond_b
    iget-object v13, v4, La3/y;->b0:La3/a;

    .line 404
    .line 405
    if-eqz v13, :cond_c

    .line 406
    .line 407
    move-object v6, v13

    .line 408
    :cond_c
    sget-object v13, La3/a;->r:La3/a;

    .line 409
    .line 410
    if-ne v6, v13, :cond_d

    .line 411
    .line 412
    goto :goto_4

    .line 413
    :cond_d
    move v7, v5

    .line 414
    :goto_4
    if-eqz v7, :cond_e

    .line 415
    .line 416
    :try_start_0
    invoke-virtual {v11}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v4}, La3/y;->v()Z

    .line 420
    .line 421
    .line 422
    move-result v6

    .line 423
    if-eqz v6, :cond_e

    .line 424
    .line 425
    invoke-virtual {v10}, Ln3/e;->a()F

    .line 426
    .line 427
    .line 428
    move-result v6

    .line 429
    invoke-virtual {v4, v6}, La3/y;->u(F)V

    .line 430
    .line 431
    .line 432
    goto :goto_5

    .line 433
    :catchall_0
    move-exception v0

    .line 434
    goto :goto_8

    .line 435
    :cond_e
    :goto_5
    iget-boolean v6, v4, La3/y;->u:Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 436
    .line 437
    if-eqz v6, :cond_10

    .line 438
    .line 439
    :try_start_1
    iget v6, v4, La3/y;->F:I

    .line 440
    .line 441
    iget-boolean v13, v4, La3/y;->M:Z

    .line 442
    .line 443
    if-eqz v13, :cond_f

    .line 444
    .line 445
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v4, v2, v12}, La3/y;->l(Landroid/graphics/Canvas;Lj3/c;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 455
    .line 456
    .line 457
    goto :goto_6

    .line 458
    :cond_f
    invoke-virtual {v12, v2, v0, v6, v9}, Lj3/b;->g(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILn3/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 459
    .line 460
    .line 461
    goto :goto_6

    .line 462
    :catchall_1
    :try_start_2
    sget-object v0, Ln3/c;->a:Ln3/b;

    .line 463
    .line 464
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    goto :goto_6

    .line 468
    :cond_10
    iget v6, v4, La3/y;->F:I

    .line 469
    .line 470
    iget-boolean v13, v4, La3/y;->M:Z

    .line 471
    .line 472
    if-eqz v13, :cond_11

    .line 473
    .line 474
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v4, v2, v12}, La3/y;->l(Landroid/graphics/Canvas;Lj3/c;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 484
    .line 485
    .line 486
    goto :goto_6

    .line 487
    :cond_11
    invoke-virtual {v12, v2, v0, v6, v9}, Lj3/b;->g(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILn3/a;)V

    .line 488
    .line 489
    .line 490
    :goto_6
    iput-boolean v5, v4, La3/y;->a0:Z
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 491
    .line 492
    if-eqz v7, :cond_13

    .line 493
    .line 494
    invoke-virtual {v11}, Ljava/util/concurrent/Semaphore;->release()V

    .line 495
    .line 496
    .line 497
    iget v0, v12, Lj3/c;->K:F

    .line 498
    .line 499
    invoke-virtual {v10}, Ln3/e;->a()F

    .line 500
    .line 501
    .line 502
    move-result v2

    .line 503
    cmpl-float v0, v0, v2

    .line 504
    .line 505
    if-eqz v0, :cond_13

    .line 506
    .line 507
    :goto_7
    invoke-virtual {v8, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 508
    .line 509
    .line 510
    goto :goto_9

    .line 511
    :goto_8
    if-eqz v7, :cond_12

    .line 512
    .line 513
    invoke-virtual {v11}, Ljava/util/concurrent/Semaphore;->release()V

    .line 514
    .line 515
    .line 516
    iget v2, v12, Lj3/c;->K:F

    .line 517
    .line 518
    invoke-virtual {v10}, Ln3/e;->a()F

    .line 519
    .line 520
    .line 521
    move-result v4

    .line 522
    cmpl-float v2, v2, v4

    .line 523
    .line 524
    if-eqz v2, :cond_12

    .line 525
    .line 526
    invoke-virtual {v8, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 527
    .line 528
    .line 529
    :cond_12
    throw v0

    .line 530
    :catch_0
    if-eqz v7, :cond_13

    .line 531
    .line 532
    invoke-virtual {v11}, Ljava/util/concurrent/Semaphore;->release()V

    .line 533
    .line 534
    .line 535
    iget v0, v12, Lj3/c;->K:F

    .line 536
    .line 537
    invoke-virtual {v10}, Ln3/e;->a()F

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    cmpl-float v0, v0, v2

    .line 542
    .line 543
    if-eqz v0, :cond_13

    .line 544
    .line 545
    goto :goto_7

    .line 546
    :cond_13
    :goto_9
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 547
    .line 548
    return-object v0

    .line 549
    :cond_14
    new-instance v0, Ljava/lang/ClassCastException;

    .line 550
    .line 551
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 552
    .line 553
    .line 554
    throw v0
.end method
