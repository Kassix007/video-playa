.class public final Lm0/a;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lm0/a;->q:I

    iput-object p2, p0, Lm0/a;->r:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 42

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lm0/a;->q:I

    .line 6
    .line 7
    const-string v3, "(this)"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    sget-object v7, Lm5/y;->a:Lm5/y;

    .line 13
    .line 14
    iget-object v8, v1, Lm0/a;->r:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v2, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v0, Li0/b;

    .line 20
    .line 21
    iget-wide v2, v0, Li0/b;->a:J

    .line 22
    .line 23
    check-cast v8, Lw/H0;

    .line 24
    .line 25
    iget-object v0, v8, Lw/H0;->j:Lw/i0;

    .line 26
    .line 27
    iget v4, v8, Lw/H0;->i:I

    .line 28
    .line 29
    invoke-static {v8, v0, v2, v3, v4}, Lw/H0;->a(Lw/H0;Lw/i0;JI)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    new-instance v0, Li0/b;

    .line 34
    .line 35
    invoke-direct {v0, v2, v3}, Li0/b;-><init>(J)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_0
    check-cast v0, Lz0/m;

    .line 40
    .line 41
    check-cast v8, Lw/z0;

    .line 42
    .line 43
    iget-object v2, v8, Lw/z0;->V:Lw/j;

    .line 44
    .line 45
    iput-object v0, v2, Lw/j;->J:Lz0/m;

    .line 46
    .line 47
    iget-boolean v0, v2, Lw/j;->L:Z

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    invoke-virtual {v2}, Lw/j;->y0()Li0/c;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    iget-wide v3, v2, Lw/j;->M:J

    .line 58
    .line 59
    invoke-virtual {v2, v0, v3, v4}, Lw/j;->z0(Li0/c;J)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_0

    .line 64
    .line 65
    iput-boolean v5, v2, Lw/j;->K:Z

    .line 66
    .line 67
    invoke-virtual {v2}, Lw/j;->A0()V

    .line 68
    .line 69
    .line 70
    :cond_0
    iput-boolean v6, v2, Lw/j;->L:Z

    .line 71
    .line 72
    return-object v7

    .line 73
    :pswitch_1
    check-cast v0, Ljava/lang/Throwable;

    .line 74
    .line 75
    check-cast v8, Lv0/y;

    .line 76
    .line 77
    iget-object v2, v8, Lv0/y;->s:LM5/h;

    .line 78
    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    invoke-virtual {v2, v0}, LM5/h;->g(Ljava/lang/Throwable;)Z

    .line 82
    .line 83
    .line 84
    :cond_1
    iput-object v4, v8, Lv0/y;->s:LM5/h;

    .line 85
    .line 86
    return-object v7

    .line 87
    :pswitch_2
    check-cast v0, Li0/b;

    .line 88
    .line 89
    iget-wide v2, v0, Li0/b;->a:J

    .line 90
    .line 91
    check-cast v8, Lv/x;

    .line 92
    .line 93
    iget-boolean v0, v8, Lv/x;->J:Z

    .line 94
    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    iget-object v0, v8, Lv/x;->K:LB5/a;

    .line 98
    .line 99
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :cond_2
    return-object v7

    .line 103
    :pswitch_3
    check-cast v0, Lg0/c;

    .line 104
    .line 105
    check-cast v8, Lv/v;

    .line 106
    .line 107
    iget v2, v8, Lv/v;->H:F

    .line 108
    .line 109
    invoke-virtual {v0}, Lg0/c;->b()F

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    mul-float/2addr v3, v2

    .line 114
    const/4 v2, 0x0

    .line 115
    cmpl-float v3, v3, v2

    .line 116
    .line 117
    if-ltz v3, :cond_1f

    .line 118
    .line 119
    iget-object v3, v0, Lg0/c;->q:Lg0/a;

    .line 120
    .line 121
    invoke-interface {v3}, Lg0/a;->d()J

    .line 122
    .line 123
    .line 124
    move-result-wide v9

    .line 125
    invoke-static {v9, v10}, Li0/e;->c(J)F

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    cmpl-float v3, v3, v2

    .line 130
    .line 131
    if-lez v3, :cond_1f

    .line 132
    .line 133
    iget v3, v8, Lv/v;->H:F

    .line 134
    .line 135
    invoke-static {v3, v2}, LW0/f;->a(FF)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    const/high16 v3, 0x3f800000    # 1.0f

    .line 140
    .line 141
    if-eqz v2, :cond_3

    .line 142
    .line 143
    move v2, v3

    .line 144
    goto :goto_0

    .line 145
    :cond_3
    iget v2, v8, Lv/v;->H:F

    .line 146
    .line 147
    invoke-virtual {v0}, Lg0/c;->b()F

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    mul-float/2addr v7, v2

    .line 152
    float-to-double v9, v7

    .line 153
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 154
    .line 155
    .line 156
    move-result-wide v9

    .line 157
    double-to-float v2, v9

    .line 158
    :goto_0
    iget-object v7, v0, Lg0/c;->q:Lg0/a;

    .line 159
    .line 160
    invoke-interface {v7}, Lg0/a;->d()J

    .line 161
    .line 162
    .line 163
    move-result-wide v9

    .line 164
    invoke-static {v9, v10}, Li0/e;->c(J)F

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    const/4 v9, 0x2

    .line 169
    int-to-float v9, v9

    .line 170
    div-float/2addr v7, v9

    .line 171
    float-to-double v10, v7

    .line 172
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 173
    .line 174
    .line 175
    move-result-wide v10

    .line 176
    double-to-float v7, v10

    .line 177
    invoke-static {v2, v7}, Ljava/lang/Math;->min(FF)F

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    div-float v2, v11, v9

    .line 182
    .line 183
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    int-to-long v12, v7

    .line 188
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    int-to-long v14, v7

    .line 193
    const/16 v7, 0x20

    .line 194
    .line 195
    shl-long/2addr v12, v7

    .line 196
    const-wide v16, 0xffffffffL

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    and-long v14, v14, v16

    .line 202
    .line 203
    or-long v18, v12, v14

    .line 204
    .line 205
    iget-object v10, v0, Lg0/c;->q:Lg0/a;

    .line 206
    .line 207
    invoke-interface {v10}, Lg0/a;->d()J

    .line 208
    .line 209
    .line 210
    move-result-wide v12

    .line 211
    shr-long/2addr v12, v7

    .line 212
    long-to-int v10, v12

    .line 213
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    sub-float/2addr v10, v11

    .line 218
    iget-object v12, v0, Lg0/c;->q:Lg0/a;

    .line 219
    .line 220
    invoke-interface {v12}, Lg0/a;->d()J

    .line 221
    .line 222
    .line 223
    move-result-wide v12

    .line 224
    and-long v12, v12, v16

    .line 225
    .line 226
    long-to-int v12, v12

    .line 227
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 228
    .line 229
    .line 230
    move-result v12

    .line 231
    sub-float/2addr v12, v11

    .line 232
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    int-to-long v13, v10

    .line 237
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    int-to-long v4, v10

    .line 242
    shl-long/2addr v13, v7

    .line 243
    and-long v4, v4, v16

    .line 244
    .line 245
    or-long/2addr v4, v13

    .line 246
    mul-float v21, v11, v9

    .line 247
    .line 248
    iget-object v9, v0, Lg0/c;->q:Lg0/a;

    .line 249
    .line 250
    invoke-interface {v9}, Lg0/a;->d()J

    .line 251
    .line 252
    .line 253
    move-result-wide v9

    .line 254
    invoke-static {v9, v10}, Li0/e;->c(J)F

    .line 255
    .line 256
    .line 257
    move-result v9

    .line 258
    cmpl-float v9, v21, v9

    .line 259
    .line 260
    if-lez v9, :cond_4

    .line 261
    .line 262
    const/4 v9, 0x1

    .line 263
    goto :goto_1

    .line 264
    :cond_4
    move v9, v6

    .line 265
    :goto_1
    iget-object v10, v8, Lv/v;->J:LH/d;

    .line 266
    .line 267
    iget-object v13, v0, Lg0/c;->q:Lg0/a;

    .line 268
    .line 269
    invoke-interface {v13}, Lg0/a;->d()J

    .line 270
    .line 271
    .line 272
    move-result-wide v13

    .line 273
    move/from16 p1, v7

    .line 274
    .line 275
    iget-object v7, v0, Lg0/c;->q:Lg0/a;

    .line 276
    .line 277
    invoke-interface {v7}, Lg0/a;->getLayoutDirection()LW0/l;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    invoke-virtual {v10, v13, v14, v7, v0}, LH/d;->e(JLW0/l;LW0/c;)Lj0/B;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    instance-of v10, v7, Lj0/x;

    .line 286
    .line 287
    if-eqz v10, :cond_15

    .line 288
    .line 289
    iget-object v2, v8, Lv/v;->I:Lj0/G;

    .line 290
    .line 291
    check-cast v7, Lj0/x;

    .line 292
    .line 293
    iget-object v4, v7, Lj0/x;->e:Lj0/A;

    .line 294
    .line 295
    if-eqz v9, :cond_5

    .line 296
    .line 297
    new-instance v3, LA/Y;

    .line 298
    .line 299
    const/16 v4, 0x1d

    .line 300
    .line 301
    invoke-direct {v3, v4, v7, v2}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v3}, Lg0/c;->a(LB5/c;)Lk3/d;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    goto/16 :goto_e

    .line 309
    .line 310
    :cond_5
    if-eqz v2, :cond_6

    .line 311
    .line 312
    iget-wide v9, v2, Lj0/G;->e:J

    .line 313
    .line 314
    invoke-static {v9, v10, v3}, Lj0/o;->b(JF)J

    .line 315
    .line 316
    .line 317
    move-result-wide v9

    .line 318
    new-instance v3, Lj0/j;

    .line 319
    .line 320
    const/4 v5, 0x5

    .line 321
    invoke-direct {v3, v9, v10, v5}, Lj0/j;-><init>(JI)V

    .line 322
    .line 323
    .line 324
    const/4 v5, 0x1

    .line 325
    goto :goto_2

    .line 326
    :cond_6
    move v5, v6

    .line 327
    const/4 v3, 0x0

    .line 328
    :goto_2
    move-object v9, v4

    .line 329
    check-cast v9, Lj0/g;

    .line 330
    .line 331
    invoke-virtual {v9}, Lj0/g;->b()Li0/c;

    .line 332
    .line 333
    .line 334
    move-result-object v9

    .line 335
    iget v10, v9, Li0/c;->b:F

    .line 336
    .line 337
    iget v11, v9, Li0/c;->a:F

    .line 338
    .line 339
    iget-object v13, v8, Lv/v;->G:Lv/q;

    .line 340
    .line 341
    if-nez v13, :cond_7

    .line 342
    .line 343
    new-instance v13, Lv/q;

    .line 344
    .line 345
    invoke-direct {v13}, Lv/q;-><init>()V

    .line 346
    .line 347
    .line 348
    iput-object v13, v8, Lv/v;->G:Lv/q;

    .line 349
    .line 350
    :cond_7
    iget-object v13, v8, Lv/v;->G:Lv/q;

    .line 351
    .line 352
    invoke-static {v13}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    iget-object v14, v13, Lv/q;->d:Lj0/g;

    .line 356
    .line 357
    if-nez v14, :cond_8

    .line 358
    .line 359
    invoke-static {}, Lj0/i;->a()Lj0/g;

    .line 360
    .line 361
    .line 362
    move-result-object v14

    .line 363
    iput-object v14, v13, Lv/q;->d:Lj0/g;

    .line 364
    .line 365
    :cond_8
    invoke-virtual {v14}, Lj0/g;->d()V

    .line 366
    .line 367
    .line 368
    iget v13, v9, Li0/c;->a:F

    .line 369
    .line 370
    iget v12, v9, Li0/c;->d:F

    .line 371
    .line 372
    iget v15, v9, Li0/c;->c:F

    .line 373
    .line 374
    iget v6, v9, Li0/c;->b:F

    .line 375
    .line 376
    invoke-static {v13}, Ljava/lang/Float;->isNaN(F)Z

    .line 377
    .line 378
    .line 379
    move-result v18

    .line 380
    if-nez v18, :cond_9

    .line 381
    .line 382
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 383
    .line 384
    .line 385
    move-result v18

    .line 386
    if-nez v18, :cond_9

    .line 387
    .line 388
    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    .line 389
    .line 390
    .line 391
    move-result v18

    .line 392
    if-nez v18, :cond_9

    .line 393
    .line 394
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    .line 395
    .line 396
    .line 397
    move-result v18

    .line 398
    if-eqz v18, :cond_a

    .line 399
    .line 400
    :cond_9
    const-string v18, "Invalid rectangle, make sure no value is NaN"

    .line 401
    .line 402
    invoke-static/range {v18 .. v18}, Lj0/i;->b(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    :cond_a
    iget-object v1, v14, Lj0/g;->b:Landroid/graphics/RectF;

    .line 406
    .line 407
    if-nez v1, :cond_b

    .line 408
    .line 409
    new-instance v1, Landroid/graphics/RectF;

    .line 410
    .line 411
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 412
    .line 413
    .line 414
    iput-object v1, v14, Lj0/g;->b:Landroid/graphics/RectF;

    .line 415
    .line 416
    :cond_b
    iget-object v1, v14, Lj0/g;->b:Landroid/graphics/RectF;

    .line 417
    .line 418
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v1, v13, v6, v15, v12}, Landroid/graphics/RectF;->set(FFFF)V

    .line 422
    .line 423
    .line 424
    iget-object v1, v14, Lj0/g;->a:Landroid/graphics/Path;

    .line 425
    .line 426
    iget-object v6, v14, Lj0/g;->b:Landroid/graphics/RectF;

    .line 427
    .line 428
    invoke-static {v6}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    sget-object v12, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 432
    .line 433
    invoke-virtual {v1, v6, v12}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 434
    .line 435
    .line 436
    const/4 v1, 0x0

    .line 437
    invoke-virtual {v14, v14, v4, v1}, Lj0/g;->c(Lj0/A;Lj0/A;I)Z

    .line 438
    .line 439
    .line 440
    new-instance v1, Lkotlin/jvm/internal/y;

    .line 441
    .line 442
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 443
    .line 444
    .line 445
    iget v4, v9, Li0/c;->c:F

    .line 446
    .line 447
    sub-float/2addr v4, v11

    .line 448
    float-to-double v12, v4

    .line 449
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 450
    .line 451
    .line 452
    move-result-wide v12

    .line 453
    double-to-float v4, v12

    .line 454
    float-to-int v4, v4

    .line 455
    iget v6, v9, Li0/c;->d:F

    .line 456
    .line 457
    sub-float/2addr v6, v10

    .line 458
    float-to-double v12, v6

    .line 459
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 460
    .line 461
    .line 462
    move-result-wide v12

    .line 463
    double-to-float v6, v12

    .line 464
    float-to-int v6, v6

    .line 465
    int-to-long v12, v4

    .line 466
    shl-long v12, v12, p1

    .line 467
    .line 468
    move-object v4, v2

    .line 469
    move-object v15, v3

    .line 470
    int-to-long v2, v6

    .line 471
    and-long v2, v2, v16

    .line 472
    .line 473
    or-long/2addr v2, v12

    .line 474
    iget-object v6, v8, Lv/v;->G:Lv/q;

    .line 475
    .line 476
    invoke-static {v6}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    iget-object v8, v6, Lv/q;->a:Lj0/e;

    .line 480
    .line 481
    iget-object v12, v6, Lv/q;->b:Lj0/b;

    .line 482
    .line 483
    if-eqz v8, :cond_c

    .line 484
    .line 485
    invoke-virtual {v8}, Lj0/e;->a()I

    .line 486
    .line 487
    .line 488
    move-result v13

    .line 489
    move-wide/from16 v18, v2

    .line 490
    .line 491
    new-instance v2, Lj0/v;

    .line 492
    .line 493
    invoke-direct {v2, v13}, Lj0/v;-><init>(I)V

    .line 494
    .line 495
    .line 496
    goto :goto_3

    .line 497
    :cond_c
    move-wide/from16 v18, v2

    .line 498
    .line 499
    const/4 v2, 0x0

    .line 500
    :goto_3
    if-nez v2, :cond_d

    .line 501
    .line 502
    goto :goto_4

    .line 503
    :cond_d
    iget v2, v2, Lj0/v;->a:I

    .line 504
    .line 505
    if-nez v2, :cond_e

    .line 506
    .line 507
    goto :goto_7

    .line 508
    :cond_e
    :goto_4
    if-eqz v8, :cond_f

    .line 509
    .line 510
    invoke-virtual {v8}, Lj0/e;->a()I

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    new-instance v3, Lj0/v;

    .line 515
    .line 516
    invoke-direct {v3, v2}, Lj0/v;-><init>(I)V

    .line 517
    .line 518
    .line 519
    goto :goto_5

    .line 520
    :cond_f
    const/4 v3, 0x0

    .line 521
    :goto_5
    if-nez v3, :cond_10

    .line 522
    .line 523
    goto :goto_6

    .line 524
    :cond_10
    iget v2, v3, Lj0/v;->a:I

    .line 525
    .line 526
    if-eq v5, v2, :cond_11

    .line 527
    .line 528
    :goto_6
    const/16 v23, 0x0

    .line 529
    .line 530
    goto :goto_8

    .line 531
    :cond_11
    :goto_7
    const/16 v23, 0x1

    .line 532
    .line 533
    :goto_8
    if-eqz v8, :cond_12

    .line 534
    .line 535
    if-eqz v12, :cond_12

    .line 536
    .line 537
    iget-object v2, v0, Lg0/c;->q:Lg0/a;

    .line 538
    .line 539
    invoke-interface {v2}, Lg0/a;->d()J

    .line 540
    .line 541
    .line 542
    move-result-wide v2

    .line 543
    shr-long v2, v2, p1

    .line 544
    .line 545
    long-to-int v2, v2

    .line 546
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    iget-object v3, v8, Lj0/e;->a:Landroid/graphics/Bitmap;

    .line 551
    .line 552
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 553
    .line 554
    .line 555
    move-result v13

    .line 556
    int-to-float v13, v13

    .line 557
    cmpl-float v2, v2, v13

    .line 558
    .line 559
    if-gtz v2, :cond_12

    .line 560
    .line 561
    iget-object v2, v0, Lg0/c;->q:Lg0/a;

    .line 562
    .line 563
    invoke-interface {v2}, Lg0/a;->d()J

    .line 564
    .line 565
    .line 566
    move-result-wide v24

    .line 567
    move-object v13, v3

    .line 568
    and-long v2, v24, v16

    .line 569
    .line 570
    long-to-int v2, v2

    .line 571
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 572
    .line 573
    .line 574
    move-result v2

    .line 575
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getHeight()I

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    int-to-float v3, v3

    .line 580
    cmpl-float v2, v2, v3

    .line 581
    .line 582
    if-gtz v2, :cond_12

    .line 583
    .line 584
    if-nez v23, :cond_13

    .line 585
    .line 586
    :cond_12
    shr-long v2, v18, p1

    .line 587
    .line 588
    long-to-int v2, v2

    .line 589
    and-long v12, v18, v16

    .line 590
    .line 591
    long-to-int v3, v12

    .line 592
    invoke-static {v2, v3, v5}, Lj0/B;->e(III)Lj0/e;

    .line 593
    .line 594
    .line 595
    move-result-object v8

    .line 596
    iput-object v8, v6, Lv/q;->a:Lj0/e;

    .line 597
    .line 598
    sget-object v2, Lj0/c;->a:Landroid/graphics/Canvas;

    .line 599
    .line 600
    new-instance v12, Lj0/b;

    .line 601
    .line 602
    invoke-direct {v12}, Lj0/b;-><init>()V

    .line 603
    .line 604
    .line 605
    new-instance v2, Landroid/graphics/Canvas;

    .line 606
    .line 607
    iget-object v3, v8, Lj0/e;->a:Landroid/graphics/Bitmap;

    .line 608
    .line 609
    invoke-direct {v2, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 610
    .line 611
    .line 612
    iput-object v2, v12, Lj0/b;->a:Landroid/graphics/Canvas;

    .line 613
    .line 614
    iput-object v12, v6, Lv/q;->b:Lj0/b;

    .line 615
    .line 616
    :cond_13
    iget-object v2, v6, Lv/q;->c:Ll0/b;

    .line 617
    .line 618
    if-nez v2, :cond_14

    .line 619
    .line 620
    new-instance v2, Ll0/b;

    .line 621
    .line 622
    invoke-direct {v2}, Ll0/b;-><init>()V

    .line 623
    .line 624
    .line 625
    iput-object v2, v6, Lv/q;->c:Ll0/b;

    .line 626
    .line 627
    :cond_14
    iget-object v3, v2, Ll0/b;->r:LB0/G0;

    .line 628
    .line 629
    iget-object v5, v2, Ll0/b;->q:Ll0/a;

    .line 630
    .line 631
    move-object v6, v14

    .line 632
    invoke-static/range {v18 .. v19}, Lcom/google/android/gms/internal/measurement/P1;->d0(J)J

    .line 633
    .line 634
    .line 635
    move-result-wide v13

    .line 636
    move-object/from16 v29, v2

    .line 637
    .line 638
    iget-object v2, v0, Lg0/c;->q:Lg0/a;

    .line 639
    .line 640
    invoke-interface {v2}, Lg0/a;->getLayoutDirection()LW0/l;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    move-object/from16 v26, v4

    .line 645
    .line 646
    iget-object v4, v5, Ll0/a;->a:LW0/c;

    .line 647
    .line 648
    move-object/from16 v38, v6

    .line 649
    .line 650
    iget-object v6, v5, Ll0/a;->b:LW0/l;

    .line 651
    .line 652
    move-object/from16 v39, v9

    .line 653
    .line 654
    iget-object v9, v5, Ll0/a;->c:Lj0/m;

    .line 655
    .line 656
    move-object/from16 v40, v8

    .line 657
    .line 658
    move-object/from16 v41, v9

    .line 659
    .line 660
    iget-wide v8, v5, Ll0/a;->d:J

    .line 661
    .line 662
    iput-object v0, v5, Ll0/a;->a:LW0/c;

    .line 663
    .line 664
    iput-object v2, v5, Ll0/a;->b:LW0/l;

    .line 665
    .line 666
    iput-object v12, v5, Ll0/a;->c:Lj0/m;

    .line 667
    .line 668
    iput-wide v13, v5, Ll0/a;->d:J

    .line 669
    .line 670
    invoke-virtual {v12}, Lj0/b;->k()V

    .line 671
    .line 672
    .line 673
    sget-wide v30, Lj0/o;->b:J

    .line 674
    .line 675
    const/16 v36, 0x0

    .line 676
    .line 677
    const/16 v37, 0x3a

    .line 678
    .line 679
    const-wide/16 v32, 0x0

    .line 680
    .line 681
    move-wide/from16 v34, v13

    .line 682
    .line 683
    invoke-static/range {v29 .. v37}, Ll0/d;->g0(Ll0/d;JJJFI)V

    .line 684
    .line 685
    .line 686
    neg-float v2, v11

    .line 687
    neg-float v10, v10

    .line 688
    iget-object v11, v3, LB0/G0;->r:Ljava/lang/Object;

    .line 689
    .line 690
    check-cast v11, Li1/a;

    .line 691
    .line 692
    invoke-virtual {v11, v2, v10}, Li1/a;->A(FF)V

    .line 693
    .line 694
    .line 695
    :try_start_0
    iget-object v7, v7, Lj0/x;->e:Lj0/A;

    .line 696
    .line 697
    new-instance v20, Ll0/g;

    .line 698
    .line 699
    const/16 v24, 0x0

    .line 700
    .line 701
    const/16 v25, 0x1e

    .line 702
    .line 703
    const/16 v22, 0x0

    .line 704
    .line 705
    const/16 v23, 0x0

    .line 706
    .line 707
    invoke-direct/range {v20 .. v25}, Ll0/g;-><init>(FFIII)V

    .line 708
    .line 709
    .line 710
    const/16 v27, 0x34

    .line 711
    .line 712
    const/16 v25, 0x0

    .line 713
    .line 714
    move-object/from16 v23, v7

    .line 715
    .line 716
    move-object/from16 v24, v26

    .line 717
    .line 718
    move-object/from16 v22, v29

    .line 719
    .line 720
    move-object/from16 v26, v20

    .line 721
    .line 722
    invoke-static/range {v22 .. v27}, Ll0/d;->j(Ll0/d;Lj0/A;Lj0/B;FLl0/g;I)V

    .line 723
    .line 724
    .line 725
    invoke-interface/range {v29 .. v29}, Ll0/d;->d()J

    .line 726
    .line 727
    .line 728
    move-result-wide v13

    .line 729
    shr-long v13, v13, p1

    .line 730
    .line 731
    long-to-int v7, v13

    .line 732
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 733
    .line 734
    .line 735
    move-result v7

    .line 736
    const/4 v11, 0x1

    .line 737
    int-to-float v11, v11

    .line 738
    add-float/2addr v7, v11

    .line 739
    invoke-interface/range {v29 .. v29}, Ll0/d;->d()J

    .line 740
    .line 741
    .line 742
    move-result-wide v13

    .line 743
    shr-long v13, v13, p1

    .line 744
    .line 745
    long-to-int v13, v13

    .line 746
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 747
    .line 748
    .line 749
    move-result v13

    .line 750
    div-float/2addr v7, v13

    .line 751
    invoke-interface/range {v29 .. v29}, Ll0/d;->d()J

    .line 752
    .line 753
    .line 754
    move-result-wide v13

    .line 755
    and-long v13, v13, v16

    .line 756
    .line 757
    long-to-int v13, v13

    .line 758
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 759
    .line 760
    .line 761
    move-result v13

    .line 762
    add-float/2addr v13, v11

    .line 763
    invoke-interface/range {v29 .. v29}, Ll0/d;->d()J

    .line 764
    .line 765
    .line 766
    move-result-wide v20

    .line 767
    move-object v14, v12

    .line 768
    and-long v11, v20, v16

    .line 769
    .line 770
    long-to-int v11, v11

    .line 771
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 772
    .line 773
    .line 774
    move-result v11

    .line 775
    div-float/2addr v13, v11

    .line 776
    invoke-interface/range {v29 .. v29}, Ll0/d;->M()J

    .line 777
    .line 778
    .line 779
    move-result-wide v11

    .line 780
    move-object/from16 v16, v14

    .line 781
    .line 782
    move-object/from16 p1, v15

    .line 783
    .line 784
    invoke-virtual {v3}, LB0/G0;->E()J

    .line 785
    .line 786
    .line 787
    move-result-wide v14

    .line 788
    invoke-virtual {v3}, LB0/G0;->t()Lj0/m;

    .line 789
    .line 790
    .line 791
    move-result-object v17

    .line 792
    invoke-interface/range {v17 .. v17}, Lj0/m;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 793
    .line 794
    .line 795
    move-object/from16 v28, v0

    .line 796
    .line 797
    :try_start_1
    iget-object v0, v3, LB0/G0;->r:Ljava/lang/Object;

    .line 798
    .line 799
    check-cast v0, Li1/a;

    .line 800
    .line 801
    invoke-virtual {v0, v7, v13, v11, v12}, Li1/a;->y(FFJ)V

    .line 802
    .line 803
    .line 804
    const/16 v26, 0x0

    .line 805
    .line 806
    const/16 v27, 0x1c

    .line 807
    .line 808
    const/16 v25, 0x0

    .line 809
    .line 810
    move-object/from16 v22, v29

    .line 811
    .line 812
    move-object/from16 v23, v38

    .line 813
    .line 814
    invoke-static/range {v22 .. v27}, Ll0/d;->j(Ll0/d;Lj0/A;Lj0/B;FLl0/g;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 815
    .line 816
    .line 817
    :try_start_2
    invoke-virtual {v3}, LB0/G0;->t()Lj0/m;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-interface {v0}, Lj0/m;->i()V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v3, v14, v15}, LB0/G0;->X(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 825
    .line 826
    .line 827
    iget-object v0, v3, LB0/G0;->r:Ljava/lang/Object;

    .line 828
    .line 829
    check-cast v0, Li1/a;

    .line 830
    .line 831
    neg-float v2, v2

    .line 832
    neg-float v3, v10

    .line 833
    invoke-virtual {v0, v2, v3}, Li1/a;->A(FF)V

    .line 834
    .line 835
    .line 836
    invoke-virtual/range {v16 .. v16}, Lj0/b;->i()V

    .line 837
    .line 838
    .line 839
    iput-object v4, v5, Ll0/a;->a:LW0/c;

    .line 840
    .line 841
    iput-object v6, v5, Ll0/a;->b:LW0/l;

    .line 842
    .line 843
    move-object/from16 v0, v41

    .line 844
    .line 845
    iput-object v0, v5, Ll0/a;->c:Lj0/m;

    .line 846
    .line 847
    iput-wide v8, v5, Ll0/a;->d:J

    .line 848
    .line 849
    move-object/from16 v8, v40

    .line 850
    .line 851
    iget-object v0, v8, Lj0/e;->a:Landroid/graphics/Bitmap;

    .line 852
    .line 853
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 854
    .line 855
    .line 856
    iput-object v8, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 857
    .line 858
    new-instance v22, Lv/s;

    .line 859
    .line 860
    move-object/from16 v27, p1

    .line 861
    .line 862
    move-object/from16 v24, v1

    .line 863
    .line 864
    move-wide/from16 v25, v18

    .line 865
    .line 866
    move-object/from16 v23, v39

    .line 867
    .line 868
    invoke-direct/range {v22 .. v27}, Lv/s;-><init>(Li0/c;Lkotlin/jvm/internal/y;JLj0/j;)V

    .line 869
    .line 870
    .line 871
    move-object/from16 v1, v22

    .line 872
    .line 873
    move-object/from16 v0, v28

    .line 874
    .line 875
    invoke-virtual {v0, v1}, Lg0/c;->a(LB5/c;)Lk3/d;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    goto/16 :goto_e

    .line 880
    .line 881
    :catchall_0
    move-exception v0

    .line 882
    goto :goto_9

    .line 883
    :catchall_1
    move-exception v0

    .line 884
    :try_start_3
    invoke-virtual {v3}, LB0/G0;->t()Lj0/m;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    invoke-interface {v1}, Lj0/m;->i()V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v3, v14, v15}, LB0/G0;->X(J)V

    .line 892
    .line 893
    .line 894
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 895
    :goto_9
    iget-object v1, v3, LB0/G0;->r:Ljava/lang/Object;

    .line 896
    .line 897
    check-cast v1, Li1/a;

    .line 898
    .line 899
    neg-float v2, v2

    .line 900
    neg-float v3, v10

    .line 901
    invoke-virtual {v1, v2, v3}, Li1/a;->A(FF)V

    .line 902
    .line 903
    .line 904
    throw v0

    .line 905
    :cond_15
    instance-of v1, v7, Lj0/z;

    .line 906
    .line 907
    if-eqz v1, :cond_1a

    .line 908
    .line 909
    iget-object v1, v8, Lv/v;->I:Lj0/G;

    .line 910
    .line 911
    check-cast v7, Lj0/z;

    .line 912
    .line 913
    iget-object v3, v7, Lj0/z;->e:Li0/d;

    .line 914
    .line 915
    invoke-static {v3}, Ll6/d;->w(Li0/d;)Z

    .line 916
    .line 917
    .line 918
    move-result v6

    .line 919
    if-eqz v6, :cond_16

    .line 920
    .line 921
    iget-wide v6, v3, Li0/d;->e:J

    .line 922
    .line 923
    new-instance v21, Ll0/g;

    .line 924
    .line 925
    const/4 v14, 0x0

    .line 926
    const/16 v15, 0x1e

    .line 927
    .line 928
    const/4 v12, 0x0

    .line 929
    const/4 v13, 0x0

    .line 930
    move-object/from16 v10, v21

    .line 931
    .line 932
    invoke-direct/range {v10 .. v15}, Ll0/g;-><init>(FFIII)V

    .line 933
    .line 934
    .line 935
    new-instance v10, Lv/t;

    .line 936
    .line 937
    move-object v12, v1

    .line 938
    move v15, v2

    .line 939
    move-wide v13, v6

    .line 940
    move/from16 v16, v11

    .line 941
    .line 942
    move-wide/from16 v17, v18

    .line 943
    .line 944
    move-wide/from16 v19, v4

    .line 945
    .line 946
    move v11, v9

    .line 947
    invoke-direct/range {v10 .. v21}, Lv/t;-><init>(ZLj0/G;JFFJJLl0/g;)V

    .line 948
    .line 949
    .line 950
    invoke-virtual {v0, v10}, Lg0/c;->a(LB5/c;)Lk3/d;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    goto/16 :goto_e

    .line 955
    .line 956
    :cond_16
    move v6, v9

    .line 957
    iget-object v2, v8, Lv/v;->G:Lv/q;

    .line 958
    .line 959
    if-nez v2, :cond_17

    .line 960
    .line 961
    new-instance v2, Lv/q;

    .line 962
    .line 963
    invoke-direct {v2}, Lv/q;-><init>()V

    .line 964
    .line 965
    .line 966
    iput-object v2, v8, Lv/v;->G:Lv/q;

    .line 967
    .line 968
    :cond_17
    iget-object v2, v8, Lv/v;->G:Lv/q;

    .line 969
    .line 970
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 971
    .line 972
    .line 973
    iget-object v4, v2, Lv/q;->d:Lj0/g;

    .line 974
    .line 975
    if-nez v4, :cond_18

    .line 976
    .line 977
    invoke-static {}, Lj0/i;->a()Lj0/g;

    .line 978
    .line 979
    .line 980
    move-result-object v4

    .line 981
    iput-object v4, v2, Lv/q;->d:Lj0/g;

    .line 982
    .line 983
    :cond_18
    invoke-virtual {v4}, Lj0/g;->d()V

    .line 984
    .line 985
    .line 986
    invoke-static {v4, v3}, Lj0/A;->a(Lj0/A;Li0/d;)V

    .line 987
    .line 988
    .line 989
    if-nez v6, :cond_19

    .line 990
    .line 991
    invoke-static {}, Lj0/i;->a()Lj0/g;

    .line 992
    .line 993
    .line 994
    move-result-object v2

    .line 995
    invoke-virtual {v3}, Li0/d;->b()F

    .line 996
    .line 997
    .line 998
    move-result v5

    .line 999
    sub-float v13, v5, v11

    .line 1000
    .line 1001
    invoke-virtual {v3}, Li0/d;->a()F

    .line 1002
    .line 1003
    .line 1004
    move-result v5

    .line 1005
    sub-float v14, v5, v11

    .line 1006
    .line 1007
    iget-wide v5, v3, Li0/d;->e:J

    .line 1008
    .line 1009
    invoke-static {v5, v6, v11}, Ll6/d;->E(JF)J

    .line 1010
    .line 1011
    .line 1012
    move-result-wide v15

    .line 1013
    iget-wide v5, v3, Li0/d;->f:J

    .line 1014
    .line 1015
    invoke-static {v5, v6, v11}, Ll6/d;->E(JF)J

    .line 1016
    .line 1017
    .line 1018
    move-result-wide v17

    .line 1019
    iget-wide v5, v3, Li0/d;->h:J

    .line 1020
    .line 1021
    invoke-static {v5, v6, v11}, Ll6/d;->E(JF)J

    .line 1022
    .line 1023
    .line 1024
    move-result-wide v21

    .line 1025
    iget-wide v5, v3, Li0/d;->g:J

    .line 1026
    .line 1027
    invoke-static {v5, v6, v11}, Ll6/d;->E(JF)J

    .line 1028
    .line 1029
    .line 1030
    move-result-wide v19

    .line 1031
    new-instance v10, Li0/d;

    .line 1032
    .line 1033
    move v12, v11

    .line 1034
    invoke-direct/range {v10 .. v22}, Li0/d;-><init>(FFFFJJJJ)V

    .line 1035
    .line 1036
    .line 1037
    invoke-static {v2, v10}, Lj0/A;->a(Lj0/A;Li0/d;)V

    .line 1038
    .line 1039
    .line 1040
    const/4 v3, 0x0

    .line 1041
    invoke-virtual {v4, v4, v2, v3}, Lj0/g;->c(Lj0/A;Lj0/A;I)Z

    .line 1042
    .line 1043
    .line 1044
    goto :goto_a

    .line 1045
    :cond_19
    const/4 v3, 0x0

    .line 1046
    :goto_a
    new-instance v2, Lv/u;

    .line 1047
    .line 1048
    invoke-direct {v2, v3, v4, v1}, Lv/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v0, v2}, Lg0/c;->a(LB5/c;)Lk3/d;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    goto :goto_e

    .line 1056
    :cond_1a
    move v6, v9

    .line 1057
    move-wide/from16 v17, v18

    .line 1058
    .line 1059
    move-wide/from16 v19, v4

    .line 1060
    .line 1061
    instance-of v1, v7, Lj0/y;

    .line 1062
    .line 1063
    if-eqz v1, :cond_1e

    .line 1064
    .line 1065
    iget-object v1, v8, Lv/v;->I:Lj0/G;

    .line 1066
    .line 1067
    if-eqz v6, :cond_1b

    .line 1068
    .line 1069
    const-wide/16 v2, 0x0

    .line 1070
    .line 1071
    move-wide/from16 v23, v2

    .line 1072
    .line 1073
    goto :goto_b

    .line 1074
    :cond_1b
    move-wide/from16 v23, v17

    .line 1075
    .line 1076
    :goto_b
    if-eqz v6, :cond_1c

    .line 1077
    .line 1078
    iget-object v2, v0, Lg0/c;->q:Lg0/a;

    .line 1079
    .line 1080
    invoke-interface {v2}, Lg0/a;->d()J

    .line 1081
    .line 1082
    .line 1083
    move-result-wide v4

    .line 1084
    move-wide/from16 v25, v4

    .line 1085
    .line 1086
    goto :goto_c

    .line 1087
    :cond_1c
    move-wide/from16 v25, v19

    .line 1088
    .line 1089
    :goto_c
    if-eqz v6, :cond_1d

    .line 1090
    .line 1091
    sget-object v2, Ll0/f;->b:Ll0/f;

    .line 1092
    .line 1093
    move-object/from16 v27, v2

    .line 1094
    .line 1095
    goto :goto_d

    .line 1096
    :cond_1d
    new-instance v10, Ll0/g;

    .line 1097
    .line 1098
    const/4 v14, 0x0

    .line 1099
    const/16 v15, 0x1e

    .line 1100
    .line 1101
    const/4 v12, 0x0

    .line 1102
    const/4 v13, 0x0

    .line 1103
    invoke-direct/range {v10 .. v15}, Ll0/g;-><init>(FFIII)V

    .line 1104
    .line 1105
    .line 1106
    move-object/from16 v27, v10

    .line 1107
    .line 1108
    :goto_d
    new-instance v21, Lt/A;

    .line 1109
    .line 1110
    const/16 v28, 0x1

    .line 1111
    .line 1112
    move-object/from16 v22, v1

    .line 1113
    .line 1114
    invoke-direct/range {v21 .. v28}, Lt/A;-><init>(Ljava/lang/Object;JJLjava/lang/Object;I)V

    .line 1115
    .line 1116
    .line 1117
    move-object/from16 v1, v21

    .line 1118
    .line 1119
    invoke-virtual {v0, v1}, Lg0/c;->a(LB5/c;)Lk3/d;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    goto :goto_e

    .line 1124
    :cond_1e
    new-instance v0, LC2/e;

    .line 1125
    .line 1126
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 1127
    .line 1128
    .line 1129
    throw v0

    .line 1130
    :cond_1f
    sget-object v1, Lv/r;->r:Lv/r;

    .line 1131
    .line 1132
    invoke-virtual {v0, v1}, Lg0/c;->a(LB5/c;)Lk3/d;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v0

    .line 1136
    :goto_e
    return-object v0

    .line 1137
    :pswitch_4
    check-cast v0, LP/F;

    .line 1138
    .line 1139
    check-cast v8, Lu/v0;

    .line 1140
    .line 1141
    new-instance v0, LC0/Y;

    .line 1142
    .line 1143
    const/16 v1, 0x8

    .line 1144
    .line 1145
    invoke-direct {v0, v1, v8}, LC0/Y;-><init>(ILjava/lang/Object;)V

    .line 1146
    .line 1147
    .line 1148
    return-object v0

    .line 1149
    :pswitch_5
    invoke-static {v0, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v0

    .line 1153
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v0

    .line 1157
    return-object v0

    .line 1158
    :pswitch_6
    check-cast v8, Lr/D;

    .line 1159
    .line 1160
    if-ne v0, v8, :cond_20

    .line 1161
    .line 1162
    goto :goto_f

    .line 1163
    :cond_20
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v3

    .line 1167
    :goto_f
    return-object v3

    .line 1168
    :pswitch_7
    check-cast v8, Lr/C;

    .line 1169
    .line 1170
    if-ne v0, v8, :cond_21

    .line 1171
    .line 1172
    goto :goto_10

    .line 1173
    :cond_21
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v3

    .line 1177
    :goto_10
    return-object v3

    .line 1178
    :pswitch_8
    check-cast v0, Lp0/B;

    .line 1179
    .line 1180
    check-cast v8, Lp0/c;

    .line 1181
    .line 1182
    invoke-virtual {v8, v0}, Lp0/c;->g(Lp0/B;)V

    .line 1183
    .line 1184
    .line 1185
    iget-object v1, v8, Lp0/c;->i:LB5/c;

    .line 1186
    .line 1187
    if-eqz v1, :cond_22

    .line 1188
    .line 1189
    invoke-interface {v1, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    :cond_22
    return-object v7

    .line 1193
    :pswitch_9
    check-cast v0, Ll0/d;

    .line 1194
    .line 1195
    check-cast v8, Lm0/c;

    .line 1196
    .line 1197
    iget-object v1, v8, Lm0/c;->l:Lj0/A;

    .line 1198
    .line 1199
    iget-boolean v2, v8, Lm0/c;->n:Z

    .line 1200
    .line 1201
    if-eqz v2, :cond_23

    .line 1202
    .line 1203
    iget-boolean v2, v8, Lm0/c;->w:Z

    .line 1204
    .line 1205
    if-eqz v2, :cond_23

    .line 1206
    .line 1207
    if-eqz v1, :cond_23

    .line 1208
    .line 1209
    invoke-interface {v0}, Ll0/d;->z()LB0/G0;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v2

    .line 1213
    invoke-virtual {v2}, LB0/G0;->E()J

    .line 1214
    .line 1215
    .line 1216
    move-result-wide v3

    .line 1217
    invoke-virtual {v2}, LB0/G0;->t()Lj0/m;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v5

    .line 1221
    invoke-interface {v5}, Lj0/m;->k()V

    .line 1222
    .line 1223
    .line 1224
    :try_start_4
    iget-object v5, v2, LB0/G0;->r:Ljava/lang/Object;

    .line 1225
    .line 1226
    check-cast v5, Li1/a;

    .line 1227
    .line 1228
    iget-object v5, v5, Li1/a;->r:Ljava/lang/Object;

    .line 1229
    .line 1230
    check-cast v5, LB0/G0;

    .line 1231
    .line 1232
    invoke-virtual {v5}, LB0/G0;->t()Lj0/m;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v5

    .line 1236
    invoke-interface {v5, v1}, Lj0/m;->a(Lj0/A;)V

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v8, v0}, Lm0/c;->c(Ll0/d;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v2}, LB0/G0;->t()Lj0/m;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v0

    .line 1246
    invoke-interface {v0}, Lj0/m;->i()V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v2, v3, v4}, LB0/G0;->X(J)V

    .line 1250
    .line 1251
    .line 1252
    goto :goto_11

    .line 1253
    :catchall_2
    move-exception v0

    .line 1254
    invoke-virtual {v2}, LB0/G0;->t()Lj0/m;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v1

    .line 1258
    invoke-interface {v1}, Lj0/m;->i()V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v2, v3, v4}, LB0/G0;->X(J)V

    .line 1262
    .line 1263
    .line 1264
    throw v0

    .line 1265
    :cond_23
    invoke-virtual {v8, v0}, Lm0/c;->c(Ll0/d;)V

    .line 1266
    .line 1267
    .line 1268
    :goto_11
    return-object v7

    .line 1269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
