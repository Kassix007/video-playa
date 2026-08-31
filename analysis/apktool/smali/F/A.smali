.class public final LF/A;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LF/e;

.field public final synthetic r:LA/L;

.field public final synthetic s:F

.field public final synthetic t:LB5/a;

.field public final synthetic u:LB5/a;

.field public final synthetic v:Lc0/d;

.field public final synthetic w:Lx/m;

.field public final synthetic x:LM5/w;


# direct methods
.method public constructor <init>(LF/e;LA/L;FLH5/h;LB5/a;Lc0/d;Lx/m;LM5/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/A;->q:LF/e;

    .line 2
    .line 3
    iput-object p2, p0, LF/A;->r:LA/L;

    .line 4
    .line 5
    iput p3, p0, LF/A;->s:F

    .line 6
    .line 7
    iput-object p4, p0, LF/A;->t:LB5/a;

    .line 8
    .line 9
    iput-object p5, p0, LF/A;->u:LB5/a;

    .line 10
    .line 11
    iput-object p6, p0, LF/A;->v:Lc0/d;

    .line 12
    .line 13
    iput-object p7, p0, LF/A;->w:Lx/m;

    .line 14
    .line 15
    iput-object p8, p0, LF/A;->x:LM5/w;

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 51

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    check-cast v3, LE/A;

    .line 6
    .line 7
    move-object/from16 v0, p2

    .line 8
    .line 9
    check-cast v0, LW0/a;

    .line 10
    .line 11
    iget-wide v4, v0, LW0/a;->a:J

    .line 12
    .line 13
    iget-object v0, v1, LF/A;->q:LF/e;

    .line 14
    .line 15
    iget-object v2, v0, LF/N;->C:LP/W;

    .line 16
    .line 17
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object v9, Lw/d0;->r:Lw/d0;

    .line 21
    .line 22
    invoke-static {v4, v5, v9}, Ly4/b;->j(JLw/d0;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, v3, LE/A;->r:Lz0/T;

    .line 26
    .line 27
    invoke-interface {v2}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v6, v1, LF/A;->r:LA/L;

    .line 32
    .line 33
    sget-object v15, LW0/l;->q:LW0/l;

    .line 34
    .line 35
    if-ne v2, v15, :cond_0

    .line 36
    .line 37
    invoke-virtual {v6, v2}, LA/L;->b(LW0/l;)F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v6, v2}, LA/L;->c(LW0/l;)F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    :goto_0
    iget-object v7, v3, LE/A;->r:Lz0/T;

    .line 47
    .line 48
    invoke-interface {v7, v2}, LW0/c;->G(F)I

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    iget-object v2, v3, LE/A;->r:Lz0/T;

    .line 53
    .line 54
    invoke-interface {v2}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-ne v2, v15, :cond_1

    .line 59
    .line 60
    invoke-virtual {v6, v2}, LA/L;->c(LW0/l;)F

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {v6, v2}, LA/L;->b(LW0/l;)F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    :goto_1
    iget-object v7, v3, LE/A;->r:Lz0/T;

    .line 70
    .line 71
    invoke-interface {v7, v2}, LW0/c;->G(F)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {v6}, LA/L;->d()F

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    iget-object v8, v3, LE/A;->r:Lz0/T;

    .line 80
    .line 81
    invoke-interface {v8, v7}, LW0/c;->G(F)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-virtual {v6}, LA/L;->a()F

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    iget-object v11, v3, LE/A;->r:Lz0/T;

    .line 90
    .line 91
    invoke-interface {v11, v6}, LW0/c;->G(F)I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    add-int/2addr v6, v7

    .line 96
    add-int/2addr v2, v10

    .line 97
    sub-int v19, v2, v10

    .line 98
    .line 99
    neg-int v8, v2

    .line 100
    neg-int v12, v6

    .line 101
    invoke-static {v8, v12, v4, v5}, LW0/b;->h(IIJ)J

    .line 102
    .line 103
    .line 104
    move-result-wide v12

    .line 105
    iput-object v3, v0, LF/N;->q:LW0/c;

    .line 106
    .line 107
    iget v8, v1, LF/A;->s:F

    .line 108
    .line 109
    invoke-interface {v11, v8}, LW0/c;->G(F)I

    .line 110
    .line 111
    .line 112
    move-result v18

    .line 113
    invoke-static {v4, v5}, LW0/a;->h(J)I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    sub-int v14, v8, v2

    .line 118
    .line 119
    move/from16 p2, v2

    .line 120
    .line 121
    move-object/from16 p1, v3

    .line 122
    .line 123
    int-to-long v2, v10

    .line 124
    const/16 v8, 0x20

    .line 125
    .line 126
    shl-long/2addr v2, v8

    .line 127
    int-to-long v7, v7

    .line 128
    const-wide v16, 0xffffffffL

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    and-long v7, v7, v16

    .line 134
    .line 135
    or-long v16, v2, v7

    .line 136
    .line 137
    if-gez v14, :cond_2

    .line 138
    .line 139
    const/4 v3, 0x0

    .line 140
    goto :goto_2

    .line 141
    :cond_2
    move v3, v14

    .line 142
    :goto_2
    invoke-static {v12, v13}, LW0/a;->g(J)I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    const/4 v8, 0x5

    .line 147
    move-wide/from16 v20, v4

    .line 148
    .line 149
    invoke-static {v3, v7, v8}, LW0/b;->b(III)J

    .line 150
    .line 151
    .line 152
    move-result-wide v4

    .line 153
    iput-wide v4, v0, LF/N;->z:J

    .line 154
    .line 155
    iget-object v4, v1, LF/A;->t:LB5/a;

    .line 156
    .line 157
    invoke-interface {v4}, LB5/a;->invoke()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    check-cast v4, LF/x;

    .line 162
    .line 163
    iget-object v5, v1, LF/A;->w:Lx/m;

    .line 164
    .line 165
    invoke-static {}, La0/r;->c()La0/h;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    move-wide/from16 v22, v12

    .line 170
    .line 171
    if-eqz v7, :cond_3

    .line 172
    .line 173
    invoke-virtual {v7}, La0/h;->e()LB5/c;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    goto :goto_3

    .line 178
    :cond_3
    const/4 v12, 0x0

    .line 179
    :goto_3
    invoke-static {v7}, La0/r;->d(La0/h;)La0/h;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    :try_start_0
    invoke-virtual {v0}, LF/N;->j()I

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    iget-object v2, v0, LF/N;->d:LF/D;

    .line 188
    .line 189
    move/from16 v27, v3

    .line 190
    .line 191
    iget-object v3, v2, LF/D;->u:Ljava/lang/Object;

    .line 192
    .line 193
    invoke-static {v13, v4, v3}, LE/C;->i(ILE/x;Ljava/lang/Object;)I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eq v13, v3, :cond_4

    .line 198
    .line 199
    move-object/from16 v28, v5

    .line 200
    .line 201
    iget-object v5, v2, LF/D;->s:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v5, LP/c0;

    .line 204
    .line 205
    invoke-virtual {v5, v3}, LP/c0;->f(I)V

    .line 206
    .line 207
    .line 208
    iget-object v5, v2, LF/D;->v:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v5, LE/F;

    .line 211
    .line 212
    invoke-virtual {v5, v13}, LE/F;->b(I)V

    .line 213
    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_4
    move-object/from16 v28, v5

    .line 217
    .line 218
    :goto_4
    invoke-virtual {v0}, LF/N;->j()I

    .line 219
    .line 220
    .line 221
    iget-object v2, v2, LF/D;->t:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v2, LP/b0;

    .line 224
    .line 225
    invoke-virtual {v2}, LP/b0;->e()F

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    invoke-virtual {v0}, LF/e;->l()I

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    const/4 v5, 0x0

    .line 236
    int-to-float v13, v5

    .line 237
    move/from16 v26, v13

    .line 238
    .line 239
    add-int v13, v27, v18

    .line 240
    .line 241
    int-to-float v5, v13

    .line 242
    mul-float/2addr v2, v5

    .line 243
    sub-float v2, v26, v2

    .line 244
    .line 245
    invoke-static {v2}, LD5/a;->G(F)I

    .line 246
    .line 247
    .line 248
    move-result v29
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    invoke-static {v7, v8, v12}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 250
    .line 251
    .line 252
    iget-object v2, v0, LF/N;->A:LE/H;

    .line 253
    .line 254
    iget-object v5, v0, LF/N;->v:LE/k;

    .line 255
    .line 256
    invoke-static {v4, v2, v5}, LE/C;->g(LE/x;LE/H;LE/k;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v12

    .line 260
    iget-object v2, v1, LF/A;->u:LB5/a;

    .line 261
    .line 262
    invoke-interface {v2}, LB5/a;->invoke()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    check-cast v2, Ljava/lang/Number;

    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    iget-object v5, v0, LF/N;->B:LP/W;

    .line 273
    .line 274
    sget-object v30, Lc0/b;->C:Lc0/c;

    .line 275
    .line 276
    move v7, v2

    .line 277
    new-instance v2, LC/m;

    .line 278
    .line 279
    const/4 v8, 0x2

    .line 280
    move-object/from16 v24, v9

    .line 281
    .line 282
    const/4 v9, 0x5

    .line 283
    move/from16 v48, v3

    .line 284
    .line 285
    move-object/from16 v3, p1

    .line 286
    .line 287
    move/from16 p1, v13

    .line 288
    .line 289
    move v13, v7

    .line 290
    move v7, v6

    .line 291
    move/from16 v6, p2

    .line 292
    .line 293
    move-object/from16 p2, v15

    .line 294
    .line 295
    move-object v15, v5

    .line 296
    move-wide/from16 v49, v20

    .line 297
    .line 298
    move/from16 v20, v48

    .line 299
    .line 300
    move-object/from16 v21, v4

    .line 301
    .line 302
    move-wide/from16 v4, v49

    .line 303
    .line 304
    invoke-direct/range {v2 .. v8}, LC/m;-><init>(LE/A;JIII)V

    .line 305
    .line 306
    .line 307
    if-ltz v10, :cond_5

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_5
    const-string v4, "negative beforeContentPadding"

    .line 311
    .line 312
    invoke-static {v4}, Lz/a;->a(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    :goto_5
    if-ltz v19, :cond_6

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_6
    const-string v4, "negative afterContentPadding"

    .line 319
    .line 320
    invoke-static {v4}, Lz/a;->a(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    :goto_6
    if-gez p1, :cond_7

    .line 324
    .line 325
    const/4 v4, 0x0

    .line 326
    goto :goto_7

    .line 327
    :cond_7
    move/from16 v4, p1

    .line 328
    .line 329
    :goto_7
    iget-object v5, v1, LF/A;->w:Lx/m;

    .line 330
    .line 331
    iget-object v6, v1, LF/A;->x:LM5/w;

    .line 332
    .line 333
    if-gtz v13, :cond_8

    .line 334
    .line 335
    neg-int v3, v10

    .line 336
    add-int v21, v14, v19

    .line 337
    .line 338
    invoke-static/range {v22 .. v23}, LW0/a;->j(J)I

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    invoke-static/range {v22 .. v23}, LW0/a;->i(J)I

    .line 347
    .line 348
    .line 349
    move-result v7

    .line 350
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 351
    .line 352
    .line 353
    move-result-object v7

    .line 354
    sget-object v8, LF/d;->s:LF/d;

    .line 355
    .line 356
    invoke-virtual {v2, v4, v7, v8}, LC/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    move-object/from16 v23, v2

    .line 361
    .line 362
    check-cast v23, Lz0/D;

    .line 363
    .line 364
    new-instance v16, LF/B;

    .line 365
    .line 366
    move/from16 v20, v3

    .line 367
    .line 368
    move-object/from16 v22, v5

    .line 369
    .line 370
    move-object/from16 v24, v6

    .line 371
    .line 372
    move/from16 v17, v27

    .line 373
    .line 374
    invoke-direct/range {v16 .. v24}, LF/B;-><init>(IIIIILx/m;Lz0/D;LM5/w;)V

    .line 375
    .line 376
    .line 377
    move-object/from16 v25, v0

    .line 378
    .line 379
    move-object/from16 v34, v11

    .line 380
    .line 381
    move-object/from16 v6, v16

    .line 382
    .line 383
    const/4 v3, 0x0

    .line 384
    goto/16 :goto_3e

    .line 385
    .line 386
    :cond_8
    move/from16 v8, v27

    .line 387
    .line 388
    move-object/from16 v27, v5

    .line 389
    .line 390
    move-object/from16 v5, v24

    .line 391
    .line 392
    move-object/from16 v24, v6

    .line 393
    .line 394
    invoke-static/range {v22 .. v23}, LW0/a;->g(J)I

    .line 395
    .line 396
    .line 397
    move-result v6

    .line 398
    invoke-static {v8, v6, v9}, LW0/b;->b(III)J

    .line 399
    .line 400
    .line 401
    move-result-wide v6

    .line 402
    move/from16 v9, v20

    .line 403
    .line 404
    :goto_8
    if-lez v9, :cond_9

    .line 405
    .line 406
    if-lez v29, :cond_9

    .line 407
    .line 408
    add-int/lit8 v9, v9, -0x1

    .line 409
    .line 410
    sub-int v29, v29, v4

    .line 411
    .line 412
    goto :goto_8

    .line 413
    :cond_9
    mul-int/lit8 v20, v29, -0x1

    .line 414
    .line 415
    if-lt v9, v13, :cond_a

    .line 416
    .line 417
    add-int/lit8 v9, v13, -0x1

    .line 418
    .line 419
    const/16 v20, 0x0

    .line 420
    .line 421
    :cond_a
    move/from16 v28, v13

    .line 422
    .line 423
    new-instance v13, Ln5/j;

    .line 424
    .line 425
    invoke-direct {v13}, Ln5/j;-><init>()V

    .line 426
    .line 427
    .line 428
    move-object/from16 v29, v13

    .line 429
    .line 430
    neg-int v13, v10

    .line 431
    if-gez v18, :cond_b

    .line 432
    .line 433
    move/from16 v32, v18

    .line 434
    .line 435
    :goto_9
    move/from16 v33, v13

    .line 436
    .line 437
    goto :goto_a

    .line 438
    :cond_b
    const/16 v32, 0x0

    .line 439
    .line 440
    goto :goto_9

    .line 441
    :goto_a
    add-int v13, v33, v32

    .line 442
    .line 443
    add-int v20, v20, v13

    .line 444
    .line 445
    move-object/from16 v34, v11

    .line 446
    .line 447
    move/from16 v32, v13

    .line 448
    .line 449
    move/from16 v13, v20

    .line 450
    .line 451
    move/from16 v20, v9

    .line 452
    .line 453
    const/4 v9, 0x0

    .line 454
    :goto_b
    iget-object v11, v1, LF/A;->v:Lc0/d;

    .line 455
    .line 456
    move/from16 v35, v13

    .line 457
    .line 458
    const/4 v13, 0x0

    .line 459
    if-gez v35, :cond_c

    .line 460
    .line 461
    if-lez v20, :cond_c

    .line 462
    .line 463
    add-int/lit8 v20, v20, -0x1

    .line 464
    .line 465
    move-object/from16 v36, v12

    .line 466
    .line 467
    invoke-interface/range {v34 .. v34}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 468
    .line 469
    .line 470
    move-result-object v12

    .line 471
    move-object/from16 v25, v0

    .line 472
    .line 473
    move-object/from16 v41, v2

    .line 474
    .line 475
    move-object v2, v3

    .line 476
    move v1, v9

    .line 477
    move/from16 v39, v18

    .line 478
    .line 479
    move/from16 v3, v20

    .line 480
    .line 481
    move-wide/from16 v37, v22

    .line 482
    .line 483
    move/from16 v0, v35

    .line 484
    .line 485
    move-object/from16 v40, v36

    .line 486
    .line 487
    move/from16 v22, v4

    .line 488
    .line 489
    move-object v9, v5

    .line 490
    move-wide v4, v6

    .line 491
    move/from16 v18, v10

    .line 492
    .line 493
    move-object/from16 v6, v21

    .line 494
    .line 495
    move-object/from16 v10, v30

    .line 496
    .line 497
    move/from16 v21, p1

    .line 498
    .line 499
    move/from16 p1, v14

    .line 500
    .line 501
    move v14, v8

    .line 502
    move-wide/from16 v7, v16

    .line 503
    .line 504
    move-object/from16 v16, v15

    .line 505
    .line 506
    move-object/from16 v15, v29

    .line 507
    .line 508
    invoke-static/range {v2 .. v14}, La/a;->z(LE/A;IJLF/x;JLw/d0;Lc0/c;Lc0/d;LW0/l;ZI)LF/l;

    .line 509
    .line 510
    .line 511
    move-result-object v11

    .line 512
    move-object v12, v9

    .line 513
    const/4 v9, 0x0

    .line 514
    invoke-virtual {v15, v9, v11}, Ln5/j;->add(ILjava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    iget v11, v11, LF/l;->j:I

    .line 518
    .line 519
    invoke-static {v1, v11}, Ljava/lang/Math;->max(II)I

    .line 520
    .line 521
    .line 522
    move-result v1

    .line 523
    add-int v13, v0, v22

    .line 524
    .line 525
    move v9, v1

    .line 526
    move-object/from16 v15, v16

    .line 527
    .line 528
    move/from16 v10, v18

    .line 529
    .line 530
    move-object/from16 v0, v25

    .line 531
    .line 532
    move/from16 v18, v39

    .line 533
    .line 534
    move-object/from16 v1, p0

    .line 535
    .line 536
    move-object v3, v2

    .line 537
    move-wide/from16 v16, v7

    .line 538
    .line 539
    move v8, v14

    .line 540
    move-object/from16 v2, v41

    .line 541
    .line 542
    move/from16 v14, p1

    .line 543
    .line 544
    move/from16 p1, v21

    .line 545
    .line 546
    move-object/from16 v21, v6

    .line 547
    .line 548
    move-wide v6, v4

    .line 549
    move-object v5, v12

    .line 550
    move/from16 v4, v22

    .line 551
    .line 552
    move-wide/from16 v22, v37

    .line 553
    .line 554
    move-object/from16 v12, v40

    .line 555
    .line 556
    goto :goto_b

    .line 557
    :cond_c
    move-object/from16 v25, v0

    .line 558
    .line 559
    move-object/from16 v41, v2

    .line 560
    .line 561
    move-object v2, v3

    .line 562
    move v1, v9

    .line 563
    move-object/from16 v40, v12

    .line 564
    .line 565
    move/from16 v39, v18

    .line 566
    .line 567
    move-wide/from16 v37, v22

    .line 568
    .line 569
    move/from16 v0, v35

    .line 570
    .line 571
    const/4 v9, 0x0

    .line 572
    move/from16 v22, v4

    .line 573
    .line 574
    move-object v12, v5

    .line 575
    move-wide v4, v6

    .line 576
    move/from16 v18, v10

    .line 577
    .line 578
    move-object/from16 v6, v21

    .line 579
    .line 580
    move-object/from16 v10, v30

    .line 581
    .line 582
    move/from16 v21, p1

    .line 583
    .line 584
    move/from16 p1, v14

    .line 585
    .line 586
    move v14, v8

    .line 587
    move-wide/from16 v7, v16

    .line 588
    .line 589
    move-object/from16 v16, v15

    .line 590
    .line 591
    move-object/from16 v15, v29

    .line 592
    .line 593
    move/from16 v3, v32

    .line 594
    .line 595
    if-ge v0, v3, :cond_d

    .line 596
    .line 597
    move v0, v3

    .line 598
    :cond_d
    sub-int/2addr v0, v3

    .line 599
    add-int v23, p1, v19

    .line 600
    .line 601
    if-gez v23, :cond_e

    .line 602
    .line 603
    move v13, v9

    .line 604
    goto :goto_c

    .line 605
    :cond_e
    move/from16 v13, v23

    .line 606
    .line 607
    :goto_c
    neg-int v9, v0

    .line 608
    move/from16 v32, v0

    .line 609
    .line 610
    move/from16 v36, v1

    .line 611
    .line 612
    move v0, v9

    .line 613
    move/from16 v35, v20

    .line 614
    .line 615
    const/4 v9, 0x0

    .line 616
    const/16 v30, 0x0

    .line 617
    .line 618
    :goto_d
    iget v1, v15, Ln5/j;->s:I

    .line 619
    .line 620
    move-object/from16 v42, v2

    .line 621
    .line 622
    const/4 v2, 0x1

    .line 623
    if-ge v9, v1, :cond_10

    .line 624
    .line 625
    if-lt v0, v13, :cond_f

    .line 626
    .line 627
    invoke-virtual {v15, v9}, Ln5/j;->g(I)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move/from16 v30, v2

    .line 631
    .line 632
    :goto_e
    move-object/from16 v2, v42

    .line 633
    .line 634
    goto :goto_d

    .line 635
    :cond_f
    add-int/lit8 v35, v35, 0x1

    .line 636
    .line 637
    add-int v0, v0, v22

    .line 638
    .line 639
    add-int/lit8 v9, v9, 0x1

    .line 640
    .line 641
    goto :goto_e

    .line 642
    :cond_10
    move/from16 v9, v28

    .line 643
    .line 644
    move/from16 v1, v36

    .line 645
    .line 646
    move/from16 v28, v3

    .line 647
    .line 648
    move/from16 v3, v35

    .line 649
    .line 650
    :goto_f
    if-ge v3, v9, :cond_12

    .line 651
    .line 652
    if-lt v0, v13, :cond_11

    .line 653
    .line 654
    if-lez v0, :cond_11

    .line 655
    .line 656
    invoke-virtual {v15}, Ln5/j;->isEmpty()Z

    .line 657
    .line 658
    .line 659
    move-result v35

    .line 660
    if-eqz v35, :cond_12

    .line 661
    .line 662
    :cond_11
    move/from16 v35, v9

    .line 663
    .line 664
    move-object v9, v12

    .line 665
    goto :goto_10

    .line 666
    :cond_12
    move v2, v3

    .line 667
    move/from16 v35, v9

    .line 668
    .line 669
    move-object v9, v12

    .line 670
    move v3, v0

    .line 671
    move/from16 v0, p1

    .line 672
    .line 673
    goto :goto_14

    .line 674
    :goto_10
    invoke-interface/range {v34 .. v34}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 675
    .line 676
    .line 677
    move-result-object v12

    .line 678
    move/from16 v2, v28

    .line 679
    .line 680
    move/from16 v28, v0

    .line 681
    .line 682
    move v0, v2

    .line 683
    move/from16 v29, v13

    .line 684
    .line 685
    move-object/from16 v2, v42

    .line 686
    .line 687
    const/4 v13, 0x0

    .line 688
    invoke-static/range {v2 .. v14}, La/a;->z(LE/A;IJLF/x;JLw/d0;Lc0/c;Lc0/d;LW0/l;ZI)LF/l;

    .line 689
    .line 690
    .line 691
    move-result-object v12

    .line 692
    move/from16 v48, v3

    .line 693
    .line 694
    move-object v3, v2

    .line 695
    move/from16 v2, v48

    .line 696
    .line 697
    add-int/lit8 v13, v35, -0x1

    .line 698
    .line 699
    if-ne v2, v13, :cond_13

    .line 700
    .line 701
    move/from16 v36, v14

    .line 702
    .line 703
    :goto_11
    move-object/from16 v42, v3

    .line 704
    .line 705
    goto :goto_12

    .line 706
    :cond_13
    move/from16 v36, v22

    .line 707
    .line 708
    goto :goto_11

    .line 709
    :goto_12
    add-int v3, v28, v36

    .line 710
    .line 711
    if-gt v3, v0, :cond_14

    .line 712
    .line 713
    if-eq v2, v13, :cond_14

    .line 714
    .line 715
    add-int/lit8 v12, v2, 0x1

    .line 716
    .line 717
    sub-int v32, v32, v22

    .line 718
    .line 719
    move/from16 v20, v12

    .line 720
    .line 721
    const/16 v30, 0x1

    .line 722
    .line 723
    goto :goto_13

    .line 724
    :cond_14
    iget v13, v12, LF/l;->j:I

    .line 725
    .line 726
    invoke-static {v1, v13}, Ljava/lang/Math;->max(II)I

    .line 727
    .line 728
    .line 729
    move-result v1

    .line 730
    invoke-virtual {v15, v12}, Ln5/j;->addLast(Ljava/lang/Object;)V

    .line 731
    .line 732
    .line 733
    :goto_13
    add-int/lit8 v2, v2, 0x1

    .line 734
    .line 735
    move/from16 v28, v0

    .line 736
    .line 737
    move v0, v3

    .line 738
    move-object v12, v9

    .line 739
    move/from16 v13, v29

    .line 740
    .line 741
    move/from16 v9, v35

    .line 742
    .line 743
    move v3, v2

    .line 744
    const/4 v2, 0x1

    .line 745
    goto :goto_f

    .line 746
    :goto_14
    if-ge v3, v0, :cond_17

    .line 747
    .line 748
    sub-int v12, v0, v3

    .line 749
    .line 750
    sub-int v32, v32, v12

    .line 751
    .line 752
    add-int v28, v3, v12

    .line 753
    .line 754
    move/from16 v3, v32

    .line 755
    .line 756
    :goto_15
    move/from16 v12, v18

    .line 757
    .line 758
    if-ge v3, v12, :cond_15

    .line 759
    .line 760
    if-lez v20, :cond_15

    .line 761
    .line 762
    add-int/lit8 v20, v20, -0x1

    .line 763
    .line 764
    move/from16 v18, v12

    .line 765
    .line 766
    invoke-interface/range {v34 .. v34}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 767
    .line 768
    .line 769
    move-result-object v12

    .line 770
    move/from16 v44, v2

    .line 771
    .line 772
    move/from16 v32, v3

    .line 773
    .line 774
    move/from16 v3, v20

    .line 775
    .line 776
    move-object/from16 v2, v42

    .line 777
    .line 778
    const/4 v13, 0x0

    .line 779
    invoke-static/range {v2 .. v14}, La/a;->z(LE/A;IJLF/x;JLw/d0;Lc0/c;Lc0/d;LW0/l;ZI)LF/l;

    .line 780
    .line 781
    .line 782
    move-result-object v12

    .line 783
    move-object/from16 v29, v9

    .line 784
    .line 785
    move/from16 v31, v13

    .line 786
    .line 787
    const/4 v13, 0x0

    .line 788
    invoke-virtual {v15, v13, v12}, Ln5/j;->add(ILjava/lang/Object;)V

    .line 789
    .line 790
    .line 791
    iget v9, v12, LF/l;->j:I

    .line 792
    .line 793
    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    .line 794
    .line 795
    .line 796
    move-result v1

    .line 797
    add-int v9, v32, v22

    .line 798
    .line 799
    move v3, v9

    .line 800
    move-object/from16 v9, v29

    .line 801
    .line 802
    move/from16 v2, v44

    .line 803
    .line 804
    goto :goto_15

    .line 805
    :cond_15
    move/from16 v44, v2

    .line 806
    .line 807
    move/from16 v32, v3

    .line 808
    .line 809
    move-object/from16 v29, v9

    .line 810
    .line 811
    move/from16 v18, v12

    .line 812
    .line 813
    move-object/from16 v2, v42

    .line 814
    .line 815
    const/4 v13, 0x0

    .line 816
    if-gez v32, :cond_16

    .line 817
    .line 818
    add-int v3, v28, v32

    .line 819
    .line 820
    move v12, v1

    .line 821
    move v1, v3

    .line 822
    move v3, v13

    .line 823
    goto :goto_17

    .line 824
    :cond_16
    move v12, v1

    .line 825
    move/from16 v1, v28

    .line 826
    .line 827
    :goto_16
    move/from16 v3, v32

    .line 828
    .line 829
    goto :goto_17

    .line 830
    :cond_17
    move/from16 v44, v2

    .line 831
    .line 832
    move-object/from16 v29, v9

    .line 833
    .line 834
    move-object/from16 v2, v42

    .line 835
    .line 836
    const/4 v13, 0x0

    .line 837
    move v12, v1

    .line 838
    move v1, v3

    .line 839
    goto :goto_16

    .line 840
    :goto_17
    if-ltz v3, :cond_18

    .line 841
    .line 842
    goto :goto_18

    .line 843
    :cond_18
    const-string v9, "invalid currentFirstPageScrollOffset"

    .line 844
    .line 845
    invoke-static {v9}, Lz/a;->a(Ljava/lang/String;)V

    .line 846
    .line 847
    .line 848
    :goto_18
    neg-int v9, v3

    .line 849
    invoke-virtual {v15}, Ln5/j;->first()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v10

    .line 853
    check-cast v10, LF/l;

    .line 854
    .line 855
    move/from16 v13, v39

    .line 856
    .line 857
    if-gtz v18, :cond_19

    .line 858
    .line 859
    if-gez v13, :cond_1a

    .line 860
    .line 861
    :cond_19
    move-object/from16 p1, v2

    .line 862
    .line 863
    goto :goto_19

    .line 864
    :cond_1a
    move/from16 p1, v14

    .line 865
    .line 866
    move-object v14, v10

    .line 867
    move/from16 v10, p1

    .line 868
    .line 869
    move-object/from16 p1, v2

    .line 870
    .line 871
    move/from16 v18, v3

    .line 872
    .line 873
    move-object/from16 v31, v11

    .line 874
    .line 875
    move/from16 v11, v22

    .line 876
    .line 877
    goto :goto_1b

    .line 878
    :goto_19
    invoke-virtual {v15}, Ln5/j;->d()I

    .line 879
    .line 880
    .line 881
    move-result v2

    .line 882
    move-object/from16 v18, v10

    .line 883
    .line 884
    move v10, v3

    .line 885
    const/4 v3, 0x0

    .line 886
    :goto_1a
    if-ge v3, v2, :cond_1b

    .line 887
    .line 888
    if-eqz v10, :cond_1b

    .line 889
    .line 890
    move-object/from16 v31, v11

    .line 891
    .line 892
    move/from16 v11, v22

    .line 893
    .line 894
    if-gt v11, v10, :cond_1c

    .line 895
    .line 896
    move/from16 v22, v2

    .line 897
    .line 898
    invoke-static {v15}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 899
    .line 900
    .line 901
    move-result v2

    .line 902
    if-eq v3, v2, :cond_1c

    .line 903
    .line 904
    sub-int/2addr v10, v11

    .line 905
    add-int/lit8 v3, v3, 0x1

    .line 906
    .line 907
    invoke-virtual {v15, v3}, Ln5/j;->get(I)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v2

    .line 911
    move-object/from16 v18, v2

    .line 912
    .line 913
    check-cast v18, LF/l;

    .line 914
    .line 915
    move/from16 v2, v22

    .line 916
    .line 917
    move/from16 v22, v11

    .line 918
    .line 919
    move-object/from16 v11, v31

    .line 920
    .line 921
    goto :goto_1a

    .line 922
    :cond_1b
    move-object/from16 v31, v11

    .line 923
    .line 924
    move/from16 v11, v22

    .line 925
    .line 926
    :cond_1c
    move-object/from16 v48, v18

    .line 927
    .line 928
    move/from16 v18, v10

    .line 929
    .line 930
    move v10, v14

    .line 931
    move-object/from16 v14, v48

    .line 932
    .line 933
    :goto_1b
    new-instance v2, LF/z;

    .line 934
    .line 935
    move/from16 v22, v11

    .line 936
    .line 937
    const/4 v11, 0x1

    .line 938
    move/from16 v3, v20

    .line 939
    .line 940
    move-object/from16 v20, v15

    .line 941
    .line 942
    move v15, v3

    .line 943
    move-object/from16 v3, p1

    .line 944
    .line 945
    move/from16 v32, v12

    .line 946
    .line 947
    move/from16 v45, v22

    .line 948
    .line 949
    move v12, v9

    .line 950
    move-object/from16 v9, v31

    .line 951
    .line 952
    invoke-direct/range {v2 .. v11}, LF/z;-><init>(LE/A;JLF/x;JLc0/d;II)V

    .line 953
    .line 954
    .line 955
    move-object v11, v9

    .line 956
    const/4 v9, 0x0

    .line 957
    invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I

    .line 958
    .line 959
    .line 960
    move-result v3

    .line 961
    const/16 v43, 0x1

    .line 962
    .line 963
    add-int/lit8 v9, v15, -0x1

    .line 964
    .line 965
    if-gt v3, v9, :cond_1f

    .line 966
    .line 967
    const/4 v15, 0x0

    .line 968
    :goto_1c
    if-nez v15, :cond_1d

    .line 969
    .line 970
    new-instance v15, Ljava/util/ArrayList;

    .line 971
    .line 972
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 973
    .line 974
    .line 975
    :cond_1d
    move-wide/from16 v46, v4

    .line 976
    .line 977
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 978
    .line 979
    .line 980
    move-result-object v4

    .line 981
    invoke-virtual {v2, v4}, LF/z;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v4

    .line 985
    invoke-interface {v15, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    if-eq v9, v3, :cond_1e

    .line 989
    .line 990
    add-int/lit8 v9, v9, -0x1

    .line 991
    .line 992
    move-wide/from16 v4, v46

    .line 993
    .line 994
    goto :goto_1c

    .line 995
    :cond_1e
    :goto_1d
    move-object/from16 v4, v40

    .line 996
    .line 997
    goto :goto_1e

    .line 998
    :cond_1f
    move-wide/from16 v46, v4

    .line 999
    .line 1000
    const/4 v15, 0x0

    .line 1001
    goto :goto_1d

    .line 1002
    :goto_1e
    move-object/from16 v22, v4

    .line 1003
    .line 1004
    check-cast v22, Ljava/util/Collection;

    .line 1005
    .line 1006
    invoke-interface/range {v22 .. v22}, Ljava/util/Collection;->size()I

    .line 1007
    .line 1008
    .line 1009
    move-result v5

    .line 1010
    const/4 v9, 0x0

    .line 1011
    :goto_1f
    if-ge v9, v5, :cond_22

    .line 1012
    .line 1013
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v31

    .line 1017
    check-cast v31, Ljava/lang/Number;

    .line 1018
    .line 1019
    move-object/from16 v36, v4

    .line 1020
    .line 1021
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Number;->intValue()I

    .line 1022
    .line 1023
    .line 1024
    move-result v4

    .line 1025
    if-ge v4, v3, :cond_21

    .line 1026
    .line 1027
    if-nez v15, :cond_20

    .line 1028
    .line 1029
    new-instance v15, Ljava/util/ArrayList;

    .line 1030
    .line 1031
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1032
    .line 1033
    .line 1034
    :cond_20
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v4

    .line 1038
    invoke-virtual {v2, v4}, LF/z;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v4

    .line 1042
    invoke-interface {v15, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    :cond_21
    add-int/lit8 v9, v9, 0x1

    .line 1046
    .line 1047
    move-object/from16 v4, v36

    .line 1048
    .line 1049
    goto :goto_1f

    .line 1050
    :cond_22
    move-object/from16 v36, v4

    .line 1051
    .line 1052
    sget-object v31, Ln5/s;->q:Ln5/s;

    .line 1053
    .line 1054
    if-nez v15, :cond_23

    .line 1055
    .line 1056
    move-object/from16 v15, v31

    .line 1057
    .line 1058
    :cond_23
    move-object/from16 v39, v15

    .line 1059
    .line 1060
    check-cast v39, Ljava/util/Collection;

    .line 1061
    .line 1062
    invoke-interface/range {v39 .. v39}, Ljava/util/Collection;->size()I

    .line 1063
    .line 1064
    .line 1065
    move-result v2

    .line 1066
    move/from16 v4, v32

    .line 1067
    .line 1068
    const/4 v3, 0x0

    .line 1069
    :goto_20
    if-ge v3, v2, :cond_24

    .line 1070
    .line 1071
    invoke-interface {v15, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v5

    .line 1075
    check-cast v5, LF/l;

    .line 1076
    .line 1077
    iget v5, v5, LF/l;->j:I

    .line 1078
    .line 1079
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 1080
    .line 1081
    .line 1082
    move-result v4

    .line 1083
    add-int/lit8 v3, v3, 0x1

    .line 1084
    .line 1085
    goto :goto_20

    .line 1086
    :cond_24
    invoke-virtual/range {v20 .. v20}, Ln5/j;->last()Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v2

    .line 1090
    check-cast v2, LF/l;

    .line 1091
    .line 1092
    iget v2, v2, LF/l;->a:I

    .line 1093
    .line 1094
    move v3, v2

    .line 1095
    new-instance v2, LF/z;

    .line 1096
    .line 1097
    move-object v9, v11

    .line 1098
    const/4 v11, 0x0

    .line 1099
    move v5, v3

    .line 1100
    move-object/from16 v3, p1

    .line 1101
    .line 1102
    move-object/from16 p1, v15

    .line 1103
    .line 1104
    move-object/from16 v15, v36

    .line 1105
    .line 1106
    move/from16 v36, v13

    .line 1107
    .line 1108
    move v13, v5

    .line 1109
    move/from16 v32, v4

    .line 1110
    .line 1111
    move/from16 v40, v12

    .line 1112
    .line 1113
    move/from16 v12, v43

    .line 1114
    .line 1115
    move-wide/from16 v4, v46

    .line 1116
    .line 1117
    invoke-direct/range {v2 .. v11}, LF/z;-><init>(LE/A;JLF/x;JLc0/d;II)V

    .line 1118
    .line 1119
    .line 1120
    add-int/lit8 v4, v35, -0x1

    .line 1121
    .line 1122
    invoke-static {v13, v4}, Ljava/lang/Math;->min(II)I

    .line 1123
    .line 1124
    .line 1125
    move-result v4

    .line 1126
    add-int/lit8 v5, v13, 0x1

    .line 1127
    .line 1128
    const/4 v13, 0x0

    .line 1129
    if-gt v5, v4, :cond_26

    .line 1130
    .line 1131
    :goto_21
    if-nez v13, :cond_25

    .line 1132
    .line 1133
    new-instance v6, Ljava/util/ArrayList;

    .line 1134
    .line 1135
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1136
    .line 1137
    .line 1138
    move-object v13, v6

    .line 1139
    :cond_25
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v6

    .line 1143
    invoke-virtual {v2, v6}, LF/z;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v6

    .line 1147
    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1148
    .line 1149
    .line 1150
    if-eq v5, v4, :cond_26

    .line 1151
    .line 1152
    add-int/lit8 v5, v5, 0x1

    .line 1153
    .line 1154
    goto :goto_21

    .line 1155
    :cond_26
    invoke-interface/range {v22 .. v22}, Ljava/util/Collection;->size()I

    .line 1156
    .line 1157
    .line 1158
    move-result v5

    .line 1159
    const/4 v6, 0x0

    .line 1160
    :goto_22
    if-ge v6, v5, :cond_29

    .line 1161
    .line 1162
    invoke-interface {v15, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v7

    .line 1166
    check-cast v7, Ljava/lang/Number;

    .line 1167
    .line 1168
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 1169
    .line 1170
    .line 1171
    move-result v7

    .line 1172
    add-int/lit8 v8, v4, 0x1

    .line 1173
    .line 1174
    move/from16 v9, v35

    .line 1175
    .line 1176
    if-gt v8, v7, :cond_28

    .line 1177
    .line 1178
    if-ge v7, v9, :cond_28

    .line 1179
    .line 1180
    if-nez v13, :cond_27

    .line 1181
    .line 1182
    new-instance v13, Ljava/util/ArrayList;

    .line 1183
    .line 1184
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1185
    .line 1186
    .line 1187
    :cond_27
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v7

    .line 1191
    invoke-virtual {v2, v7}, LF/z;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v7

    .line 1195
    invoke-interface {v13, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1196
    .line 1197
    .line 1198
    :cond_28
    add-int/lit8 v6, v6, 0x1

    .line 1199
    .line 1200
    move/from16 v35, v9

    .line 1201
    .line 1202
    goto :goto_22

    .line 1203
    :cond_29
    move/from16 v9, v35

    .line 1204
    .line 1205
    if-nez v13, :cond_2a

    .line 1206
    .line 1207
    move-object/from16 v13, v31

    .line 1208
    .line 1209
    :cond_2a
    move-object v2, v13

    .line 1210
    check-cast v2, Ljava/util/Collection;

    .line 1211
    .line 1212
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1213
    .line 1214
    .line 1215
    move-result v4

    .line 1216
    move/from16 v6, v32

    .line 1217
    .line 1218
    const/4 v5, 0x0

    .line 1219
    :goto_23
    if-ge v5, v4, :cond_2b

    .line 1220
    .line 1221
    invoke-interface {v13, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v7

    .line 1225
    check-cast v7, LF/l;

    .line 1226
    .line 1227
    iget v7, v7, LF/l;->j:I

    .line 1228
    .line 1229
    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    .line 1230
    .line 1231
    .line 1232
    move-result v6

    .line 1233
    add-int/lit8 v5, v5, 0x1

    .line 1234
    .line 1235
    goto :goto_23

    .line 1236
    :cond_2b
    invoke-virtual/range {v20 .. v20}, Ln5/j;->first()Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v4

    .line 1240
    invoke-static {v14, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1241
    .line 1242
    .line 1243
    move-result v4

    .line 1244
    if-eqz v4, :cond_2c

    .line 1245
    .line 1246
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 1247
    .line 1248
    .line 1249
    move-result v4

    .line 1250
    if-eqz v4, :cond_2c

    .line 1251
    .line 1252
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 1253
    .line 1254
    .line 1255
    move-result v4

    .line 1256
    if-eqz v4, :cond_2c

    .line 1257
    .line 1258
    move v8, v12

    .line 1259
    :goto_24
    move-wide/from16 v4, v37

    .line 1260
    .line 1261
    goto :goto_25

    .line 1262
    :cond_2c
    const/4 v8, 0x0

    .line 1263
    goto :goto_24

    .line 1264
    :goto_25
    invoke-static {v1, v4, v5}, LW0/b;->f(IJ)I

    .line 1265
    .line 1266
    .line 1267
    move-result v7

    .line 1268
    invoke-static {v6, v4, v5}, LW0/b;->e(IJ)I

    .line 1269
    .line 1270
    .line 1271
    move-result v11

    .line 1272
    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    .line 1273
    .line 1274
    .line 1275
    move-result v4

    .line 1276
    if-ge v1, v4, :cond_2d

    .line 1277
    .line 1278
    move v4, v12

    .line 1279
    goto :goto_26

    .line 1280
    :cond_2d
    const/4 v4, 0x0

    .line 1281
    :goto_26
    if-eqz v4, :cond_2f

    .line 1282
    .line 1283
    if-nez v40, :cond_2e

    .line 1284
    .line 1285
    goto :goto_27

    .line 1286
    :cond_2e
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1287
    .line 1288
    const-string v6, "non-zero pagesScrollOffset="

    .line 1289
    .line 1290
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1291
    .line 1292
    .line 1293
    move/from16 v6, v40

    .line 1294
    .line 1295
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v5

    .line 1302
    invoke-static {v5}, Lz/a;->c(Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    goto :goto_28

    .line 1306
    :cond_2f
    :goto_27
    move/from16 v6, v40

    .line 1307
    .line 1308
    :goto_28
    new-instance v15, Ljava/util/ArrayList;

    .line 1309
    .line 1310
    invoke-virtual/range {v20 .. v20}, Ln5/j;->d()I

    .line 1311
    .line 1312
    .line 1313
    move-result v5

    .line 1314
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 1315
    .line 1316
    .line 1317
    move-result v22

    .line 1318
    add-int v22, v22, v5

    .line 1319
    .line 1320
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 1321
    .line 1322
    .line 1323
    move-result v5

    .line 1324
    add-int v5, v5, v22

    .line 1325
    .line 1326
    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1327
    .line 1328
    .line 1329
    if-eqz v4, :cond_36

    .line 1330
    .line 1331
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 1332
    .line 1333
    .line 1334
    move-result v2

    .line 1335
    if-eqz v2, :cond_30

    .line 1336
    .line 1337
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 1338
    .line 1339
    .line 1340
    move-result v2

    .line 1341
    if-eqz v2, :cond_30

    .line 1342
    .line 1343
    goto :goto_29

    .line 1344
    :cond_30
    const-string v2, "No extra pages"

    .line 1345
    .line 1346
    invoke-static {v2}, Lz/a;->a(Ljava/lang/String;)V

    .line 1347
    .line 1348
    .line 1349
    :goto_29
    invoke-virtual/range {v20 .. v20}, Ln5/j;->d()I

    .line 1350
    .line 1351
    .line 1352
    move-result v2

    .line 1353
    new-array v5, v2, [I

    .line 1354
    .line 1355
    const/4 v4, 0x0

    .line 1356
    :goto_2a
    if-ge v4, v2, :cond_31

    .line 1357
    .line 1358
    aput v10, v5, v4

    .line 1359
    .line 1360
    add-int/lit8 v4, v4, 0x1

    .line 1361
    .line 1362
    goto :goto_2a

    .line 1363
    :cond_31
    new-array v2, v2, [I

    .line 1364
    .line 1365
    move-object/from16 v4, v34

    .line 1366
    .line 1367
    move/from16 v6, v36

    .line 1368
    .line 1369
    invoke-interface {v4, v6}, LW0/c;->f0(I)F

    .line 1370
    .line 1371
    .line 1372
    move-result v12

    .line 1373
    move v4, v7

    .line 1374
    move-object v7, v2

    .line 1375
    new-instance v2, LA/f;

    .line 1376
    .line 1377
    move-object/from16 v42, v3

    .line 1378
    .line 1379
    move/from16 v22, v8

    .line 1380
    .line 1381
    const/4 v3, 0x0

    .line 1382
    const/4 v8, 0x0

    .line 1383
    invoke-direct {v2, v12, v3, v8}, LA/f;-><init>(FZLA/h;)V

    .line 1384
    .line 1385
    .line 1386
    move-object/from16 v3, v42

    .line 1387
    .line 1388
    move-object/from16 v6, p2

    .line 1389
    .line 1390
    invoke-virtual/range {v2 .. v7}, LA/f;->c(LW0/c;I[ILW0/l;[I)V

    .line 1391
    .line 1392
    .line 1393
    invoke-static {v7}, Ln5/k;->N0([I)LG5/d;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v2

    .line 1397
    iget v3, v2, LG5/b;->q:I

    .line 1398
    .line 1399
    iget v5, v2, LG5/b;->r:I

    .line 1400
    .line 1401
    iget v2, v2, LG5/b;->s:I

    .line 1402
    .line 1403
    if-lez v2, :cond_32

    .line 1404
    .line 1405
    if-le v3, v5, :cond_33

    .line 1406
    .line 1407
    :cond_32
    if-gez v2, :cond_35

    .line 1408
    .line 1409
    if-gt v5, v3, :cond_35

    .line 1410
    .line 1411
    :cond_33
    :goto_2b
    aget v6, v7, v3

    .line 1412
    .line 1413
    move-object/from16 v12, v20

    .line 1414
    .line 1415
    invoke-virtual {v12, v3}, Ln5/j;->get(I)Ljava/lang/Object;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v17

    .line 1419
    move-object/from16 v8, v17

    .line 1420
    .line 1421
    check-cast v8, LF/l;

    .line 1422
    .line 1423
    invoke-virtual {v8, v6, v4, v11}, LF/l;->b(III)V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1427
    .line 1428
    .line 1429
    if-eq v3, v5, :cond_34

    .line 1430
    .line 1431
    add-int/2addr v3, v2

    .line 1432
    move-object/from16 v20, v12

    .line 1433
    .line 1434
    const/4 v8, 0x0

    .line 1435
    goto :goto_2b

    .line 1436
    :cond_34
    :goto_2c
    move-object/from16 v8, p1

    .line 1437
    .line 1438
    goto :goto_30

    .line 1439
    :cond_35
    move-object/from16 v12, v20

    .line 1440
    .line 1441
    goto :goto_2c

    .line 1442
    :cond_36
    move v4, v7

    .line 1443
    move/from16 v22, v8

    .line 1444
    .line 1445
    move-object/from16 v12, v20

    .line 1446
    .line 1447
    invoke-interface/range {v39 .. v39}, Ljava/util/Collection;->size()I

    .line 1448
    .line 1449
    .line 1450
    move-result v3

    .line 1451
    move v7, v6

    .line 1452
    const/4 v5, 0x0

    .line 1453
    :goto_2d
    if-ge v5, v3, :cond_37

    .line 1454
    .line 1455
    move-object/from16 v8, p1

    .line 1456
    .line 1457
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v17

    .line 1461
    move-object/from16 p1, v2

    .line 1462
    .line 1463
    move-object/from16 v2, v17

    .line 1464
    .line 1465
    check-cast v2, LF/l;

    .line 1466
    .line 1467
    sub-int v7, v7, v21

    .line 1468
    .line 1469
    invoke-virtual {v2, v7, v4, v11}, LF/l;->b(III)V

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1473
    .line 1474
    .line 1475
    add-int/lit8 v5, v5, 0x1

    .line 1476
    .line 1477
    move-object/from16 v2, p1

    .line 1478
    .line 1479
    move-object/from16 p1, v8

    .line 1480
    .line 1481
    goto :goto_2d

    .line 1482
    :cond_37
    move-object/from16 v8, p1

    .line 1483
    .line 1484
    move-object/from16 p1, v2

    .line 1485
    .line 1486
    invoke-virtual {v12}, Ln5/j;->d()I

    .line 1487
    .line 1488
    .line 1489
    move-result v2

    .line 1490
    const/4 v3, 0x0

    .line 1491
    :goto_2e
    if-ge v3, v2, :cond_38

    .line 1492
    .line 1493
    invoke-virtual {v12, v3}, Ln5/j;->get(I)Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v5

    .line 1497
    check-cast v5, LF/l;

    .line 1498
    .line 1499
    invoke-virtual {v5, v6, v4, v11}, LF/l;->b(III)V

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1503
    .line 1504
    .line 1505
    add-int v6, v6, v21

    .line 1506
    .line 1507
    add-int/lit8 v3, v3, 0x1

    .line 1508
    .line 1509
    goto :goto_2e

    .line 1510
    :cond_38
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    .line 1511
    .line 1512
    .line 1513
    move-result v2

    .line 1514
    const/4 v3, 0x0

    .line 1515
    :goto_2f
    if-ge v3, v2, :cond_39

    .line 1516
    .line 1517
    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v5

    .line 1521
    check-cast v5, LF/l;

    .line 1522
    .line 1523
    invoke-virtual {v5, v6, v4, v11}, LF/l;->b(III)V

    .line 1524
    .line 1525
    .line 1526
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1527
    .line 1528
    .line 1529
    add-int v6, v6, v21

    .line 1530
    .line 1531
    add-int/lit8 v3, v3, 0x1

    .line 1532
    .line 1533
    goto :goto_2f

    .line 1534
    :cond_39
    :goto_30
    if-eqz v22, :cond_3a

    .line 1535
    .line 1536
    move-object v7, v15

    .line 1537
    :goto_31
    move/from16 v21, v4

    .line 1538
    .line 1539
    goto :goto_33

    .line 1540
    :cond_3a
    new-instance v2, Ljava/util/ArrayList;

    .line 1541
    .line 1542
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1543
    .line 1544
    .line 1545
    move-result v3

    .line 1546
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1547
    .line 1548
    .line 1549
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1550
    .line 1551
    .line 1552
    move-result v3

    .line 1553
    const/4 v5, 0x0

    .line 1554
    :goto_32
    if-ge v5, v3, :cond_3c

    .line 1555
    .line 1556
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v6

    .line 1560
    move-object v7, v6

    .line 1561
    check-cast v7, LF/l;

    .line 1562
    .line 1563
    move/from16 p1, v3

    .line 1564
    .line 1565
    iget v3, v7, LF/l;->a:I

    .line 1566
    .line 1567
    invoke-virtual {v12}, Ln5/j;->first()Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v17

    .line 1571
    move/from16 v21, v4

    .line 1572
    .line 1573
    move-object/from16 v4, v17

    .line 1574
    .line 1575
    check-cast v4, LF/l;

    .line 1576
    .line 1577
    iget v4, v4, LF/l;->a:I

    .line 1578
    .line 1579
    if-lt v3, v4, :cond_3b

    .line 1580
    .line 1581
    iget v3, v7, LF/l;->a:I

    .line 1582
    .line 1583
    invoke-virtual {v12}, Ln5/j;->last()Ljava/lang/Object;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v4

    .line 1587
    check-cast v4, LF/l;

    .line 1588
    .line 1589
    iget v4, v4, LF/l;->a:I

    .line 1590
    .line 1591
    if-gt v3, v4, :cond_3b

    .line 1592
    .line 1593
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1594
    .line 1595
    .line 1596
    :cond_3b
    add-int/lit8 v5, v5, 0x1

    .line 1597
    .line 1598
    move/from16 v3, p1

    .line 1599
    .line 1600
    move/from16 v4, v21

    .line 1601
    .line 1602
    goto :goto_32

    .line 1603
    :cond_3c
    move-object v7, v2

    .line 1604
    goto :goto_31

    .line 1605
    :goto_33
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 1606
    .line 1607
    .line 1608
    move-result v2

    .line 1609
    if-eqz v2, :cond_3d

    .line 1610
    .line 1611
    move-object/from16 v22, v31

    .line 1612
    .line 1613
    goto :goto_35

    .line 1614
    :cond_3d
    new-instance v2, Ljava/util/ArrayList;

    .line 1615
    .line 1616
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1617
    .line 1618
    .line 1619
    move-result v3

    .line 1620
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1621
    .line 1622
    .line 1623
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1624
    .line 1625
    .line 1626
    move-result v3

    .line 1627
    const/4 v4, 0x0

    .line 1628
    :goto_34
    if-ge v4, v3, :cond_3f

    .line 1629
    .line 1630
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v5

    .line 1634
    move-object v6, v5

    .line 1635
    check-cast v6, LF/l;

    .line 1636
    .line 1637
    iget v6, v6, LF/l;->a:I

    .line 1638
    .line 1639
    invoke-virtual {v12}, Ln5/j;->first()Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v8

    .line 1643
    check-cast v8, LF/l;

    .line 1644
    .line 1645
    iget v8, v8, LF/l;->a:I

    .line 1646
    .line 1647
    if-ge v6, v8, :cond_3e

    .line 1648
    .line 1649
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1650
    .line 1651
    .line 1652
    :cond_3e
    add-int/lit8 v4, v4, 0x1

    .line 1653
    .line 1654
    goto :goto_34

    .line 1655
    :cond_3f
    move-object/from16 v22, v2

    .line 1656
    .line 1657
    :goto_35
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 1658
    .line 1659
    .line 1660
    move-result v2

    .line 1661
    if-eqz v2, :cond_40

    .line 1662
    .line 1663
    goto :goto_37

    .line 1664
    :cond_40
    new-instance v2, Ljava/util/ArrayList;

    .line 1665
    .line 1666
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1667
    .line 1668
    .line 1669
    move-result v3

    .line 1670
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1671
    .line 1672
    .line 1673
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1674
    .line 1675
    .line 1676
    move-result v3

    .line 1677
    const/4 v4, 0x0

    .line 1678
    :goto_36
    if-ge v4, v3, :cond_42

    .line 1679
    .line 1680
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v5

    .line 1684
    move-object v6, v5

    .line 1685
    check-cast v6, LF/l;

    .line 1686
    .line 1687
    iget v6, v6, LF/l;->a:I

    .line 1688
    .line 1689
    invoke-virtual {v12}, Ln5/j;->last()Ljava/lang/Object;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v8

    .line 1693
    check-cast v8, LF/l;

    .line 1694
    .line 1695
    iget v8, v8, LF/l;->a:I

    .line 1696
    .line 1697
    if-le v6, v8, :cond_41

    .line 1698
    .line 1699
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1700
    .line 1701
    .line 1702
    :cond_41
    add-int/lit8 v4, v4, 0x1

    .line 1703
    .line 1704
    goto :goto_36

    .line 1705
    :cond_42
    move-object/from16 v31, v2

    .line 1706
    .line 1707
    :goto_37
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 1708
    .line 1709
    .line 1710
    move-result v2

    .line 1711
    if-eqz v2, :cond_43

    .line 1712
    .line 1713
    const/4 v12, 0x1

    .line 1714
    const/4 v13, 0x0

    .line 1715
    goto :goto_39

    .line 1716
    :cond_43
    const/4 v13, 0x0

    .line 1717
    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v2

    .line 1721
    move-object v3, v2

    .line 1722
    check-cast v3, LF/l;

    .line 1723
    .line 1724
    iget v3, v3, LF/l;->l:I

    .line 1725
    .line 1726
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1727
    .line 1728
    .line 1729
    int-to-float v3, v3

    .line 1730
    sub-float v3, v3, v26

    .line 1731
    .line 1732
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 1733
    .line 1734
    .line 1735
    move-result v3

    .line 1736
    neg-float v3, v3

    .line 1737
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 1738
    .line 1739
    .line 1740
    move-result v4

    .line 1741
    const/4 v12, 0x1

    .line 1742
    if-gt v12, v4, :cond_46

    .line 1743
    .line 1744
    move v5, v3

    .line 1745
    move-object v3, v2

    .line 1746
    move v2, v12

    .line 1747
    :goto_38
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v6

    .line 1751
    move-object v8, v6

    .line 1752
    check-cast v8, LF/l;

    .line 1753
    .line 1754
    iget v8, v8, LF/l;->l:I

    .line 1755
    .line 1756
    int-to-float v8, v8

    .line 1757
    sub-float v8, v8, v26

    .line 1758
    .line 1759
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 1760
    .line 1761
    .line 1762
    move-result v8

    .line 1763
    neg-float v8, v8

    .line 1764
    invoke-static {v5, v8}, Ljava/lang/Float;->compare(FF)I

    .line 1765
    .line 1766
    .line 1767
    move-result v13

    .line 1768
    if-gez v13, :cond_44

    .line 1769
    .line 1770
    move-object v3, v6

    .line 1771
    move v5, v8

    .line 1772
    :cond_44
    if-eq v2, v4, :cond_45

    .line 1773
    .line 1774
    add-int/lit8 v2, v2, 0x1

    .line 1775
    .line 1776
    goto :goto_38

    .line 1777
    :cond_45
    move-object v13, v3

    .line 1778
    goto :goto_39

    .line 1779
    :cond_46
    move-object v13, v2

    .line 1780
    :goto_39
    check-cast v13, LF/l;

    .line 1781
    .line 1782
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1783
    .line 1784
    .line 1785
    if-eqz v13, :cond_47

    .line 1786
    .line 1787
    iget v2, v13, LF/l;->l:I

    .line 1788
    .line 1789
    :goto_3a
    move/from16 v3, v45

    .line 1790
    .line 1791
    goto :goto_3b

    .line 1792
    :cond_47
    const/4 v2, 0x0

    .line 1793
    goto :goto_3a

    .line 1794
    :goto_3b
    if-nez v3, :cond_48

    .line 1795
    .line 1796
    const/4 v2, 0x0

    .line 1797
    const/16 v28, 0x0

    .line 1798
    .line 1799
    goto :goto_3c

    .line 1800
    :cond_48
    const/16 v28, 0x0

    .line 1801
    .line 1802
    rsub-int/lit8 v2, v2, 0x0

    .line 1803
    .line 1804
    int-to-float v2, v2

    .line 1805
    int-to-float v3, v3

    .line 1806
    div-float/2addr v2, v3

    .line 1807
    const/high16 v3, -0x41000000    # -0.5f

    .line 1808
    .line 1809
    const/high16 v4, 0x3f000000    # 0.5f

    .line 1810
    .line 1811
    invoke-static {v2, v3, v4}, LD5/a;->p(FFF)F

    .line 1812
    .line 1813
    .line 1814
    move-result v2

    .line 1815
    :goto_3c
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v3

    .line 1819
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v4

    .line 1823
    new-instance v5, LA/Y;

    .line 1824
    .line 1825
    const/16 v6, 0xa

    .line 1826
    .line 1827
    move-object/from16 v8, v16

    .line 1828
    .line 1829
    invoke-direct {v5, v6, v8, v15}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1830
    .line 1831
    .line 1832
    move-object/from16 v6, v41

    .line 1833
    .line 1834
    invoke-virtual {v6, v3, v4, v5}, LC/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v3

    .line 1838
    move-object/from16 v20, v3

    .line 1839
    .line 1840
    check-cast v20, Lz0/D;

    .line 1841
    .line 1842
    move/from16 v3, v44

    .line 1843
    .line 1844
    if-lt v3, v9, :cond_4a

    .line 1845
    .line 1846
    if-le v1, v0, :cond_49

    .line 1847
    .line 1848
    goto :goto_3d

    .line 1849
    :cond_49
    move/from16 v12, v28

    .line 1850
    .line 1851
    :cond_4a
    :goto_3d
    new-instance v6, LF/B;

    .line 1852
    .line 1853
    move/from16 v16, v2

    .line 1854
    .line 1855
    move v8, v10

    .line 1856
    move-object v15, v13

    .line 1857
    move/from16 v17, v18

    .line 1858
    .line 1859
    move/from16 v10, v19

    .line 1860
    .line 1861
    move/from16 v13, v23

    .line 1862
    .line 1863
    move-object/from16 v19, v27

    .line 1864
    .line 1865
    move/from16 v3, v28

    .line 1866
    .line 1867
    move-object/from16 v11, v29

    .line 1868
    .line 1869
    move/from16 v21, v30

    .line 1870
    .line 1871
    move-object/from16 v23, v31

    .line 1872
    .line 1873
    move/from16 v9, v36

    .line 1874
    .line 1875
    move/from16 v18, v12

    .line 1876
    .line 1877
    move/from16 v12, v33

    .line 1878
    .line 1879
    invoke-direct/range {v6 .. v24}, LF/B;-><init>(Ljava/util/List;IIILw/d0;IILF/l;LF/l;FIZLx/m;Lz0/D;ZLjava/util/List;Ljava/util/List;LM5/w;)V

    .line 1880
    .line 1881
    .line 1882
    :goto_3e
    invoke-interface/range {v34 .. v34}, Lz0/E;->r()Z

    .line 1883
    .line 1884
    .line 1885
    move-result v0

    .line 1886
    move-object/from16 v1, v25

    .line 1887
    .line 1888
    invoke-virtual {v1, v6, v0, v3}, LF/N;->h(LF/B;ZZ)V

    .line 1889
    .line 1890
    .line 1891
    return-object v6

    .line 1892
    :catchall_0
    move-exception v0

    .line 1893
    invoke-static {v7, v8, v12}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 1894
    .line 1895
    .line 1896
    throw v0
.end method
