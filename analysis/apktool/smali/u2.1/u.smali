.class public abstract Lu2/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu2/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu2/t;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu2/u;->a:Lu2/t;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(Lu2/o;Ljava/lang/String;Lc0/m;LB5/c;Lc0/e;Lz0/j;LP/o;II)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v9, p5

    .line 8
    .line 9
    move-object/from16 v10, p6

    .line 10
    .line 11
    move/from16 v0, p7

    .line 12
    .line 13
    const v2, -0x1920fec5

    .line 14
    .line 15
    .line 16
    invoke-virtual {v10, v2}, LP/o;->U(I)LP/o;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v10, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v5, 0x4

    .line 24
    const/4 v6, 0x2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    move v2, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v6

    .line 30
    :goto_0
    or-int/2addr v2, v0

    .line 31
    and-int/lit16 v7, v0, 0x380

    .line 32
    .line 33
    if-nez v7, :cond_2

    .line 34
    .line 35
    invoke-virtual {v10, v3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_1

    .line 40
    .line 41
    const/16 v7, 0x100

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/16 v7, 0x80

    .line 45
    .line 46
    :goto_1
    or-int/2addr v2, v7

    .line 47
    :cond_2
    and-int/lit16 v7, v0, 0x1c00

    .line 48
    .line 49
    if-nez v7, :cond_4

    .line 50
    .line 51
    invoke-virtual {v10, v4}, LP/o;->i(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_3

    .line 56
    .line 57
    const/16 v7, 0x800

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    const/16 v7, 0x400

    .line 61
    .line 62
    :goto_2
    or-int/2addr v2, v7

    .line 63
    :cond_4
    const v7, 0xe000

    .line 64
    .line 65
    .line 66
    and-int v8, v0, v7

    .line 67
    .line 68
    const/4 v11, 0x0

    .line 69
    if-nez v8, :cond_6

    .line 70
    .line 71
    invoke-virtual {v10, v11}, LP/o;->i(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-eqz v8, :cond_5

    .line 76
    .line 77
    const/16 v8, 0x4000

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    const/16 v8, 0x2000

    .line 81
    .line 82
    :goto_3
    or-int/2addr v2, v8

    .line 83
    :cond_6
    const/high16 v8, 0x70000

    .line 84
    .line 85
    and-int v12, v0, v8

    .line 86
    .line 87
    if-nez v12, :cond_8

    .line 88
    .line 89
    move-object/from16 v12, p4

    .line 90
    .line 91
    invoke-virtual {v10, v12}, LP/o;->g(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    if-eqz v13, :cond_7

    .line 96
    .line 97
    const/high16 v13, 0x20000

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_7
    const/high16 v13, 0x10000

    .line 101
    .line 102
    :goto_4
    or-int/2addr v2, v13

    .line 103
    goto :goto_5

    .line 104
    :cond_8
    move-object/from16 v12, p4

    .line 105
    .line 106
    :goto_5
    const/high16 v13, 0x380000

    .line 107
    .line 108
    and-int v14, v0, v13

    .line 109
    .line 110
    if-nez v14, :cond_a

    .line 111
    .line 112
    invoke-virtual {v10, v9}, LP/o;->g(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v14

    .line 116
    if-eqz v14, :cond_9

    .line 117
    .line 118
    const/high16 v14, 0x100000

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_9
    const/high16 v14, 0x80000

    .line 122
    .line 123
    :goto_6
    or-int/2addr v2, v14

    .line 124
    :cond_a
    const/high16 v14, 0x1c00000

    .line 125
    .line 126
    and-int v15, v0, v14

    .line 127
    .line 128
    if-nez v15, :cond_c

    .line 129
    .line 130
    const/high16 v15, 0x3f800000    # 1.0f

    .line 131
    .line 132
    invoke-virtual {v10, v15}, LP/o;->d(F)Z

    .line 133
    .line 134
    .line 135
    move-result v15

    .line 136
    if-eqz v15, :cond_b

    .line 137
    .line 138
    const/high16 v15, 0x800000

    .line 139
    .line 140
    goto :goto_7

    .line 141
    :cond_b
    const/high16 v15, 0x400000

    .line 142
    .line 143
    :goto_7
    or-int/2addr v2, v15

    .line 144
    :cond_c
    const/high16 v15, 0xe000000

    .line 145
    .line 146
    and-int/2addr v15, v0

    .line 147
    if-nez v15, :cond_e

    .line 148
    .line 149
    invoke-virtual {v10, v11}, LP/o;->g(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    if-eqz v11, :cond_d

    .line 154
    .line 155
    const/high16 v11, 0x4000000

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :cond_d
    const/high16 v11, 0x2000000

    .line 159
    .line 160
    :goto_8
    or-int/2addr v2, v11

    .line 161
    :cond_e
    const/high16 v11, 0x70000000

    .line 162
    .line 163
    and-int/2addr v11, v0

    .line 164
    const/4 v15, 0x1

    .line 165
    if-nez v11, :cond_10

    .line 166
    .line 167
    invoke-virtual {v10, v15}, LP/o;->e(I)Z

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-eqz v11, :cond_f

    .line 172
    .line 173
    const/high16 v11, 0x20000000

    .line 174
    .line 175
    goto :goto_9

    .line 176
    :cond_f
    const/high16 v11, 0x10000000

    .line 177
    .line 178
    :goto_9
    or-int/2addr v2, v11

    .line 179
    :cond_10
    and-int/lit8 v11, p8, 0xe

    .line 180
    .line 181
    if-nez v11, :cond_12

    .line 182
    .line 183
    invoke-virtual {v10, v15}, LP/o;->h(Z)Z

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    if-eqz v11, :cond_11

    .line 188
    .line 189
    goto :goto_a

    .line 190
    :cond_11
    move v5, v6

    .line 191
    :goto_a
    or-int v5, p8, v5

    .line 192
    .line 193
    goto :goto_b

    .line 194
    :cond_12
    move/from16 v5, p8

    .line 195
    .line 196
    :goto_b
    const v11, 0x5b6db6db

    .line 197
    .line 198
    .line 199
    and-int/2addr v11, v2

    .line 200
    const v15, 0x12492492

    .line 201
    .line 202
    .line 203
    if-ne v11, v15, :cond_14

    .line 204
    .line 205
    and-int/lit8 v11, v5, 0xb

    .line 206
    .line 207
    if-ne v11, v6, :cond_14

    .line 208
    .line 209
    invoke-virtual {v10}, LP/o;->x()Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-nez v6, :cond_13

    .line 214
    .line 215
    goto :goto_c

    .line 216
    :cond_13
    invoke-virtual {v10}, LP/o;->N()V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_11

    .line 220
    .line 221
    :cond_14
    :goto_c
    iget-object v6, v1, Lu2/o;->a:Ljava/lang/Object;

    .line 222
    .line 223
    sget-object v11, Lu2/w;->b:LE2/e;

    .line 224
    .line 225
    const v11, 0x63ff5e82

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10, v11}, LP/o;->T(I)V

    .line 229
    .line 230
    .line 231
    instance-of v11, v6, LD2/j;

    .line 232
    .line 233
    const/4 v15, 0x0

    .line 234
    move/from16 v16, v7

    .line 235
    .line 236
    if-eqz v11, :cond_15

    .line 237
    .line 238
    move-object v7, v6

    .line 239
    check-cast v7, LD2/j;

    .line 240
    .line 241
    move/from16 v17, v8

    .line 242
    .line 243
    iget-object v8, v7, LD2/j;->z:LD2/d;

    .line 244
    .line 245
    iget-object v8, v8, LD2/d;->a:LE2/i;

    .line 246
    .line 247
    if-eqz v8, :cond_16

    .line 248
    .line 249
    invoke-virtual {v10, v15}, LP/o;->p(Z)V

    .line 250
    .line 251
    .line 252
    move/from16 v18, v13

    .line 253
    .line 254
    :goto_d
    move/from16 v19, v14

    .line 255
    .line 256
    goto/16 :goto_f

    .line 257
    .line 258
    :cond_15
    move/from16 v17, v8

    .line 259
    .line 260
    :cond_16
    const v7, 0x1856439f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v10, v7}, LP/o;->T(I)V

    .line 264
    .line 265
    .line 266
    sget-object v7, Lz0/i;->c:Lz0/k;

    .line 267
    .line 268
    invoke-static {v9, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    sget-object v8, LP/k;->a:LP/S;

    .line 273
    .line 274
    if-eqz v7, :cond_17

    .line 275
    .line 276
    sget-object v7, Lu2/w;->b:LE2/e;

    .line 277
    .line 278
    goto :goto_e

    .line 279
    :cond_17
    const v7, 0x18564e9e

    .line 280
    .line 281
    .line 282
    invoke-virtual {v10, v7}, LP/o;->T(I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    if-ne v7, v8, :cond_18

    .line 290
    .line 291
    new-instance v7, Lu2/r;

    .line 292
    .line 293
    invoke-direct {v7}, Lu2/r;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v10, v7}, LP/o;->d0(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    :cond_18
    check-cast v7, Lu2/r;

    .line 300
    .line 301
    invoke-virtual {v10, v15}, LP/o;->p(Z)V

    .line 302
    .line 303
    .line 304
    :goto_e
    invoke-virtual {v10, v15}, LP/o;->p(Z)V

    .line 305
    .line 306
    .line 307
    if-eqz v11, :cond_1b

    .line 308
    .line 309
    const v11, -0xd8b4232

    .line 310
    .line 311
    .line 312
    invoke-virtual {v10, v11}, LP/o;->T(I)V

    .line 313
    .line 314
    .line 315
    check-cast v6, LD2/j;

    .line 316
    .line 317
    const v11, 0x18565abd

    .line 318
    .line 319
    .line 320
    invoke-virtual {v10, v11}, LP/o;->T(I)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v10, v6}, LP/o;->g(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    invoke-virtual {v10, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v18

    .line 331
    or-int v11, v11, v18

    .line 332
    .line 333
    move/from16 v18, v13

    .line 334
    .line 335
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v13

    .line 339
    if-nez v11, :cond_19

    .line 340
    .line 341
    if-ne v13, v8, :cond_1a

    .line 342
    .line 343
    :cond_19
    invoke-static {v6}, LD2/j;->a(LD2/j;)LD2/h;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    iput-object v7, v6, LD2/h;->m:LE2/i;

    .line 348
    .line 349
    invoke-virtual {v6}, LD2/h;->b()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v6}, LD2/h;->a()LD2/j;

    .line 353
    .line 354
    .line 355
    move-result-object v13

    .line 356
    invoke-virtual {v10, v13}, LP/o;->d0(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    :cond_1a
    move-object v7, v13

    .line 360
    check-cast v7, LD2/j;

    .line 361
    .line 362
    invoke-virtual {v10, v15}, LP/o;->p(Z)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v10, v15}, LP/o;->p(Z)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v10, v15}, LP/o;->p(Z)V

    .line 369
    .line 370
    .line 371
    goto :goto_d

    .line 372
    :cond_1b
    move/from16 v18, v13

    .line 373
    .line 374
    const v11, -0xd88c34e

    .line 375
    .line 376
    .line 377
    invoke-virtual {v10, v11}, LP/o;->T(I)V

    .line 378
    .line 379
    .line 380
    sget-object v11, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LP/T0;

    .line 381
    .line 382
    invoke-virtual {v10, v11}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v11

    .line 386
    check-cast v11, Landroid/content/Context;

    .line 387
    .line 388
    const v13, 0x1856748e

    .line 389
    .line 390
    .line 391
    invoke-virtual {v10, v13}, LP/o;->T(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v10, v11}, LP/o;->g(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v13

    .line 398
    invoke-virtual {v10, v6}, LP/o;->g(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v19

    .line 402
    or-int v13, v13, v19

    .line 403
    .line 404
    invoke-virtual {v10, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v19

    .line 408
    or-int v13, v13, v19

    .line 409
    .line 410
    move/from16 v19, v14

    .line 411
    .line 412
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v14

    .line 416
    if-nez v13, :cond_1c

    .line 417
    .line 418
    if-ne v14, v8, :cond_1d

    .line 419
    .line 420
    :cond_1c
    new-instance v8, LD2/h;

    .line 421
    .line 422
    invoke-direct {v8, v11}, LD2/h;-><init>(Landroid/content/Context;)V

    .line 423
    .line 424
    .line 425
    iput-object v6, v8, LD2/h;->c:Ljava/lang/Object;

    .line 426
    .line 427
    iput-object v7, v8, LD2/h;->m:LE2/i;

    .line 428
    .line 429
    invoke-virtual {v8}, LD2/h;->b()V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v8}, LD2/h;->a()LD2/j;

    .line 433
    .line 434
    .line 435
    move-result-object v14

    .line 436
    invoke-virtual {v10, v14}, LP/o;->d0(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    :cond_1d
    move-object v7, v14

    .line 440
    check-cast v7, LD2/j;

    .line 441
    .line 442
    invoke-virtual {v10, v15}, LP/o;->p(Z)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v10, v15}, LP/o;->p(Z)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v10, v15}, LP/o;->p(Z)V

    .line 449
    .line 450
    .line 451
    :goto_f
    iget-object v6, v1, Lu2/o;->c:Lt2/l;

    .line 452
    .line 453
    shr-int/lit8 v2, v2, 0x6

    .line 454
    .line 455
    and-int v8, v2, v16

    .line 456
    .line 457
    invoke-static {v7, v6, v4, v9, v10}, Lu2/u;->d(Ljava/lang/Object;Lt2/l;LB5/c;Lz0/j;LP/o;)Lu2/n;

    .line 458
    .line 459
    .line 460
    move-result-object v6

    .line 461
    iget-object v7, v7, LD2/j;->w:LE2/i;

    .line 462
    .line 463
    instance-of v11, v7, Lu2/r;

    .line 464
    .line 465
    if-eqz v11, :cond_1e

    .line 466
    .line 467
    check-cast v7, Lc0/m;

    .line 468
    .line 469
    invoke-interface {v3, v7}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 470
    .line 471
    .line 472
    move-result-object v7

    .line 473
    goto :goto_10

    .line 474
    :cond_1e
    move-object v7, v3

    .line 475
    :goto_10
    const/16 v11, 0x180

    .line 476
    .line 477
    and-int/lit16 v13, v2, 0x1c00

    .line 478
    .line 479
    or-int/2addr v11, v13

    .line 480
    or-int/2addr v8, v11

    .line 481
    and-int v11, v2, v17

    .line 482
    .line 483
    or-int/2addr v8, v11

    .line 484
    and-int v2, v2, v18

    .line 485
    .line 486
    or-int/2addr v2, v8

    .line 487
    shl-int/lit8 v5, v5, 0x15

    .line 488
    .line 489
    and-int v5, v5, v19

    .line 490
    .line 491
    or-int v11, v2, v5

    .line 492
    .line 493
    move-object v5, v7

    .line 494
    move-object v8, v12

    .line 495
    move-object/from16 v7, p1

    .line 496
    .line 497
    invoke-static/range {v5 .. v11}, Lu2/u;->c(Lc0/m;Lu2/n;Ljava/lang/String;Lc0/e;Lz0/j;LP/o;I)V

    .line 498
    .line 499
    .line 500
    :goto_11
    invoke-virtual/range {p6 .. p6}, LP/o;->r()LP/o0;

    .line 501
    .line 502
    .line 503
    move-result-object v9

    .line 504
    if-eqz v9, :cond_1f

    .line 505
    .line 506
    new-instance v0, Lu2/a;

    .line 507
    .line 508
    move-object/from16 v2, p1

    .line 509
    .line 510
    move-object/from16 v5, p4

    .line 511
    .line 512
    move-object/from16 v6, p5

    .line 513
    .line 514
    move/from16 v7, p7

    .line 515
    .line 516
    move/from16 v8, p8

    .line 517
    .line 518
    invoke-direct/range {v0 .. v8}, Lu2/a;-><init>(Lu2/o;Ljava/lang/String;Lc0/m;LB5/c;Lc0/e;Lz0/j;II)V

    .line 519
    .line 520
    .line 521
    iput-object v0, v9, LP/o0;->d:LB5/e;

    .line 522
    .line 523
    :cond_1f
    return-void
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;Lc0/m;LP/o;)V
    .locals 10

    .line 1
    const v0, 0x567d9ae5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, LP/o;->T(I)V

    .line 5
    .line 6
    .line 7
    sget-object v5, Lc0/b;->u:Lc0/e;

    .line 8
    .line 9
    sget-object v0, Lu2/v;->a:LP/T0;

    .line 10
    .line 11
    invoke-virtual {p3, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lt2/l;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LP/T0;

    .line 20
    .line 21
    invoke-virtual {p3, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {v0}, Lt2/a;->a(Landroid/content/Context;)Lt2/l;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_0
    const v1, 0x791ea4c2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, v1}, LP/o;->T(I)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Lu2/o;

    .line 38
    .line 39
    sget-object v2, Lu2/u;->a:Lu2/t;

    .line 40
    .line 41
    invoke-direct {v1, p0, v2, v0}, Lu2/o;-><init>(Ljava/lang/Object;Lu2/t;Lt2/l;)V

    .line 42
    .line 43
    .line 44
    const v8, 0x1801b0

    .line 45
    .line 46
    .line 47
    const/4 v9, 0x0

    .line 48
    sget-object v4, Lu2/n;->J:LZ4/G;

    .line 49
    .line 50
    sget-object v6, Lz0/i;->a:Lz0/F;

    .line 51
    .line 52
    move-object v2, p1

    .line 53
    move-object v3, p2

    .line 54
    move-object v7, p3

    .line 55
    invoke-static/range {v1 .. v9}, Lu2/u;->a(Lu2/o;Ljava/lang/String;Lc0/m;LB5/c;Lc0/e;Lz0/j;LP/o;II)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    invoke-virtual {v7, p0}, LP/o;->p(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, p0}, LP/o;->p(Z)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static final c(Lc0/m;Lu2/n;Ljava/lang/String;Lc0/e;Lz0/j;LP/o;I)V
    .locals 8

    .line 1
    const v0, 0x2e5be4e8    # 4.9998145E-11f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5, v0}, LP/o;->U(I)LP/o;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p6, 0xe

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p5, p0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move v0, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x2

    .line 21
    :goto_0
    or-int/2addr v0, p6

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, p6

    .line 24
    :goto_1
    and-int/lit8 v2, p6, 0x70

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-virtual {p5, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v0, v2

    .line 40
    :cond_3
    and-int/lit16 v2, p6, 0x380

    .line 41
    .line 42
    if-nez v2, :cond_5

    .line 43
    .line 44
    invoke-virtual {p5, p2}, LP/o;->g(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    const/16 v2, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v2, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr v0, v2

    .line 56
    :cond_5
    and-int/lit16 v2, p6, 0x1c00

    .line 57
    .line 58
    if-nez v2, :cond_7

    .line 59
    .line 60
    invoke-virtual {p5, p3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_6

    .line 65
    .line 66
    const/16 v2, 0x800

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    const/16 v2, 0x400

    .line 70
    .line 71
    :goto_4
    or-int/2addr v0, v2

    .line 72
    :cond_7
    const v2, 0xe000

    .line 73
    .line 74
    .line 75
    and-int/2addr v2, p6

    .line 76
    if-nez v2, :cond_9

    .line 77
    .line 78
    invoke-virtual {p5, p4}, LP/o;->g(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_8

    .line 83
    .line 84
    const/16 v2, 0x4000

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_8
    const/16 v2, 0x2000

    .line 88
    .line 89
    :goto_5
    or-int/2addr v0, v2

    .line 90
    :cond_9
    const/high16 v2, 0x70000

    .line 91
    .line 92
    and-int/2addr v2, p6

    .line 93
    if-nez v2, :cond_b

    .line 94
    .line 95
    const/high16 v2, 0x3f800000    # 1.0f

    .line 96
    .line 97
    invoke-virtual {p5, v2}, LP/o;->d(F)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_a

    .line 102
    .line 103
    const/high16 v2, 0x20000

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_a
    const/high16 v2, 0x10000

    .line 107
    .line 108
    :goto_6
    or-int/2addr v0, v2

    .line 109
    :cond_b
    const/high16 v2, 0x380000

    .line 110
    .line 111
    and-int/2addr v2, p6

    .line 112
    if-nez v2, :cond_d

    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    invoke-virtual {p5, v2}, LP/o;->g(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_c

    .line 120
    .line 121
    const/high16 v2, 0x100000

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_c
    const/high16 v2, 0x80000

    .line 125
    .line 126
    :goto_7
    or-int/2addr v0, v2

    .line 127
    :cond_d
    const/high16 v2, 0x1c00000

    .line 128
    .line 129
    and-int/2addr v2, p6

    .line 130
    const/4 v3, 0x1

    .line 131
    if-nez v2, :cond_f

    .line 132
    .line 133
    invoke-virtual {p5, v3}, LP/o;->h(Z)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_e

    .line 138
    .line 139
    const/high16 v2, 0x800000

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_e
    const/high16 v2, 0x400000

    .line 143
    .line 144
    :goto_8
    or-int/2addr v0, v2

    .line 145
    :cond_f
    const v2, 0x16db6db

    .line 146
    .line 147
    .line 148
    and-int/2addr v0, v2

    .line 149
    const v2, 0x492492

    .line 150
    .line 151
    .line 152
    if-ne v0, v2, :cond_11

    .line 153
    .line 154
    invoke-virtual {p5}, LP/o;->x()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-nez v0, :cond_10

    .line 159
    .line 160
    goto :goto_9

    .line 161
    :cond_10
    invoke-virtual {p5}, LP/o;->N()V

    .line 162
    .line 163
    .line 164
    goto/16 :goto_b

    .line 165
    .line 166
    :cond_11
    :goto_9
    sget-object v0, Lu2/w;->b:LE2/e;

    .line 167
    .line 168
    new-instance v0, LJ5/i;

    .line 169
    .line 170
    const/16 v2, 0xd

    .line 171
    .line 172
    invoke-direct {v0, v2, p2}, LJ5/i;-><init>(ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    const/4 v2, 0x0

    .line 176
    invoke-static {p0, v2, v0}, LI0/j;->a(Lc0/m;ZLB5/c;)Lc0/m;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, La/a;->o(Lc0/m;)Lc0/m;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    new-instance v4, Lcoil/compose/ContentPainterElement;

    .line 185
    .line 186
    invoke-direct {v4, p1, p3, p4}, Lcoil/compose/ContentPainterElement;-><init>(Lu2/n;Lc0/e;Lz0/j;)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v0, v4}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const v4, 0x207baf9a

    .line 194
    .line 195
    .line 196
    invoke-virtual {p5, v4}, LP/o;->T(I)V

    .line 197
    .line 198
    .line 199
    iget v4, p5, LP/o;->P:I

    .line 200
    .line 201
    invoke-static {p5, v0}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {p5}, LP/o;->m()LP/i0;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    sget-object v6, LB0/k;->a:LB0/j;

    .line 210
    .line 211
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    sget-object v6, LB0/j;->b:LB0/D;

    .line 215
    .line 216
    const v7, 0x53ca7ea5

    .line 217
    .line 218
    .line 219
    invoke-virtual {p5, v7}, LP/o;->T(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p5}, LP/o;->W()V

    .line 223
    .line 224
    .line 225
    iget-boolean v7, p5, LP/o;->O:Z

    .line 226
    .line 227
    if-eqz v7, :cond_12

    .line 228
    .line 229
    new-instance v7, LF/Q;

    .line 230
    .line 231
    invoke-direct {v7, v6, v1}, LF/Q;-><init>(LB5/a;I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p5, v7}, LP/o;->l(LB5/a;)V

    .line 235
    .line 236
    .line 237
    goto :goto_a

    .line 238
    :cond_12
    invoke-virtual {p5}, LP/o;->g0()V

    .line 239
    .line 240
    .line 241
    :goto_a
    sget-object v1, LB0/j;->e:LB0/i;

    .line 242
    .line 243
    sget-object v6, Lu2/b;->a:Lu2/b;

    .line 244
    .line 245
    invoke-static {v1, p5, v6}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    sget-object v1, LB0/j;->d:LB0/i;

    .line 249
    .line 250
    invoke-static {v1, p5, v5}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    sget-object v1, LB0/j;->c:LB0/i;

    .line 254
    .line 255
    invoke-static {v1, p5, v0}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    sget-object v0, LB0/j;->f:LB0/i;

    .line 259
    .line 260
    iget-boolean v1, p5, LP/o;->O:Z

    .line 261
    .line 262
    if-nez v1, :cond_13

    .line 263
    .line 264
    invoke-virtual {p5}, LP/o;->H()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    invoke-static {v1, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-nez v1, :cond_14

    .line 277
    .line 278
    :cond_13
    invoke-static {v4, p5, v4, v0}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 279
    .line 280
    .line 281
    :cond_14
    invoke-virtual {p5, v3}, LP/o;->p(Z)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p5, v2}, LP/o;->p(Z)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p5, v2}, LP/o;->p(Z)V

    .line 288
    .line 289
    .line 290
    :goto_b
    invoke-virtual {p5}, LP/o;->r()LP/o0;

    .line 291
    .line 292
    .line 293
    move-result-object p5

    .line 294
    if-eqz p5, :cond_15

    .line 295
    .line 296
    new-instance v0, Lf5/b;

    .line 297
    .line 298
    move-object v1, p0

    .line 299
    move-object v2, p1

    .line 300
    move-object v3, p2

    .line 301
    move-object v4, p3

    .line 302
    move-object v5, p4

    .line 303
    move v6, p6

    .line 304
    invoke-direct/range {v0 .. v6}, Lf5/b;-><init>(Lc0/m;Lu2/n;Ljava/lang/String;Lc0/e;Lz0/j;I)V

    .line 305
    .line 306
    .line 307
    iput-object v0, p5, LP/o0;->d:LB5/e;

    .line 308
    .line 309
    :cond_15
    return-void
.end method

.method public static final d(Ljava/lang/Object;Lt2/l;LB5/c;Lz0/j;LP/o;)Lu2/n;
    .locals 2

    .line 1
    const v0, 0x62169369

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, LP/o;->T(I)V

    .line 5
    .line 6
    .line 7
    const v0, 0x38ccb86a

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4, v0}, LP/o;->T(I)V

    .line 11
    .line 12
    .line 13
    const-string v0, "rememberAsyncImagePainter"

    .line 14
    .line 15
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-static {p0, p4}, Lu2/w;->a(Ljava/lang/Object;LP/o;)LD2/j;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lu2/u;->g(LD2/j;)V

    .line 23
    .line 24
    .line 25
    const v0, 0x413fabbd

    .line 26
    .line 27
    .line 28
    invoke-virtual {p4, v0}, LP/o;->T(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p4}, LP/o;->H()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, LP/k;->a:LP/S;

    .line 36
    .line 37
    if-ne v0, v1, :cond_0

    .line 38
    .line 39
    new-instance v0, Lu2/n;

    .line 40
    .line 41
    invoke-direct {v0, p0, p1}, Lu2/n;-><init>(LD2/j;Lt2/l;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p4, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    check-cast v0, Lu2/n;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {p4, v1}, LP/o;->p(Z)V

    .line 51
    .line 52
    .line 53
    iput-object p2, v0, Lu2/n;->C:LB5/c;

    .line 54
    .line 55
    iput-object p3, v0, Lu2/n;->D:Lz0/j;

    .line 56
    .line 57
    const/4 p2, 0x1

    .line 58
    iput p2, v0, Lu2/n;->E:I

    .line 59
    .line 60
    sget-object p2, LC0/G0;->a:LP/T0;

    .line 61
    .line 62
    invoke-virtual {p4, p2}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    check-cast p2, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    iput-boolean p2, v0, Lu2/n;->F:Z

    .line 73
    .line 74
    iget-object p2, v0, Lu2/n;->I:LP/f0;

    .line 75
    .line 76
    invoke-virtual {p2, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, v0, Lu2/n;->H:LP/f0;

    .line 80
    .line 81
    invoke-virtual {p1, p0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lu2/n;->b()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p4, v1}, LP/o;->p(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p4, v1}, LP/o;->p(Z)V

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 99
    .line 100
    .line 101
    throw p0
.end method

.method public static final e(Ljava/lang/Object;LP/o;)Lu2/n;
    .locals 3

    .line 1
    const v0, 0xe138316

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, LP/o;->T(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lu2/v;->a:LP/T0;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lt2/l;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LP/T0;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {v0}, Lt2/a;->a(Landroid/content/Context;)Lt2/l;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_0
    sget-object v1, Lu2/n;->J:LZ4/G;

    .line 30
    .line 31
    sget-object v2, Lz0/i;->a:Lz0/F;

    .line 32
    .line 33
    invoke-static {p0, v0, v1, v2, p1}, Lu2/u;->d(Ljava/lang/Object;Lt2/l;LB5/c;Lz0/j;LP/o;)Lu2/n;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p1, v0}, LP/o;->p(Z)V

    .line 39
    .line 40
    .line 41
    return-object p0
.end method

.method public static f(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "If you wish to display this "

    .line 2
    .line 3
    const-string v1, ", use androidx.compose.foundation.Image."

    .line 4
    .line 5
    invoke-static {v0, p0, v1}, LC0/S;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "Unsupported type: "

    .line 14
    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p0, ". "

    .line 22
    .line 23
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1
.end method

.method public static final g(LD2/j;)V
    .locals 3

    .line 1
    iget-object v0, p0, LD2/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, LD2/h;

    .line 4
    .line 5
    if-nez v1, :cond_4

    .line 6
    .line 7
    instance-of v1, v0, Lj0/e;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    instance-of v1, v0, Lp0/e;

    .line 13
    .line 14
    if-nez v1, :cond_2

    .line 15
    .line 16
    instance-of v0, v0, Lo0/b;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object p0, p0, LD2/j;->c:LF2/b;

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    const-string v0, "request.target must be null."

    .line 28
    .line 29
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0

    .line 33
    :cond_1
    const-string p0, "Painter"

    .line 34
    .line 35
    invoke-static {p0}, Lu2/u;->f(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v2

    .line 39
    :cond_2
    const-string p0, "ImageVector"

    .line 40
    .line 41
    invoke-static {p0}, Lu2/u;->f(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v2

    .line 45
    :cond_3
    const-string p0, "ImageBitmap"

    .line 46
    .line 47
    invoke-static {p0}, Lu2/u;->f(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v2

    .line 51
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    const-string v0, "Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?"

    .line 54
    .line 55
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0
.end method
