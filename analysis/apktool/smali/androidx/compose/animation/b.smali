.class public abstract Landroidx/compose/animation/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lu/v0;LB5/c;Lc0/m;Lt/D;Lt/E;LB5/e;LX/e;LP/o;I)V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v10, p7

    .line 14
    .line 15
    const v0, -0x352a56be    # -7001249.0f

    .line 16
    .line 17
    .line 18
    invoke-virtual {v10, v0}, LP/o;->U(I)LP/o;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v10, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v7, 0x4

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    move v0, v7

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x2

    .line 31
    :goto_0
    or-int v0, p8, v0

    .line 32
    .line 33
    invoke-virtual {v10, v2}, LP/o;->i(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    if-eqz v8, :cond_1

    .line 38
    .line 39
    const/16 v8, 0x20

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/16 v8, 0x10

    .line 43
    .line 44
    :goto_1
    or-int/2addr v0, v8

    .line 45
    invoke-virtual {v10, v3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-eqz v8, :cond_2

    .line 50
    .line 51
    const/16 v8, 0x100

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v8, 0x80

    .line 55
    .line 56
    :goto_2
    or-int/2addr v0, v8

    .line 57
    invoke-virtual {v10, v4}, LP/o;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_3

    .line 62
    .line 63
    const/16 v8, 0x800

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    const/16 v8, 0x400

    .line 67
    .line 68
    :goto_3
    or-int/2addr v0, v8

    .line 69
    invoke-virtual {v10, v5}, LP/o;->g(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_4

    .line 74
    .line 75
    const/16 v8, 0x4000

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    const/16 v8, 0x2000

    .line 79
    .line 80
    :goto_4
    or-int/2addr v0, v8

    .line 81
    invoke-virtual {v10, v6}, LP/o;->i(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_5

    .line 86
    .line 87
    const/high16 v8, 0x20000

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_5
    const/high16 v8, 0x10000

    .line 91
    .line 92
    :goto_5
    or-int/2addr v0, v8

    .line 93
    const/high16 v8, 0x180000

    .line 94
    .line 95
    or-int/2addr v0, v8

    .line 96
    const v8, 0x492493

    .line 97
    .line 98
    .line 99
    and-int/2addr v8, v0

    .line 100
    const v11, 0x492492

    .line 101
    .line 102
    .line 103
    const/4 v13, 0x0

    .line 104
    if-eq v8, v11, :cond_6

    .line 105
    .line 106
    const/4 v8, 0x1

    .line 107
    goto :goto_6

    .line 108
    :cond_6
    move v8, v13

    .line 109
    :goto_6
    and-int/lit8 v11, v0, 0x1

    .line 110
    .line 111
    invoke-virtual {v10, v11, v8}, LP/o;->K(IZ)Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-eqz v8, :cond_3e

    .line 116
    .line 117
    iget-object v8, v1, Lu/v0;->d:LP/f0;

    .line 118
    .line 119
    iget-object v11, v1, Lu/v0;->a:LO3/D0;

    .line 120
    .line 121
    invoke-virtual {v8}, LP/f0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-interface {v2, v8}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    check-cast v8, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    if-nez v8, :cond_8

    .line 136
    .line 137
    invoke-virtual {v11}, LO3/D0;->j()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-interface {v2, v8}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    check-cast v8, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-nez v8, :cond_8

    .line 152
    .line 153
    invoke-virtual {v1}, Lu/v0;->g()Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-nez v8, :cond_8

    .line 158
    .line 159
    invoke-virtual {v1}, Lu/v0;->d()Z

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-eqz v8, :cond_7

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_7
    const v0, 0x6abbd55a

    .line 167
    .line 168
    .line 169
    invoke-virtual {v10, v0}, LP/o;->S(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v10, v13}, LP/o;->p(Z)V

    .line 173
    .line 174
    .line 175
    move-object/from16 v7, p6

    .line 176
    .line 177
    goto/16 :goto_1b

    .line 178
    .line 179
    :cond_8
    :goto_7
    const v8, 0x6a9ab186

    .line 180
    .line 181
    .line 182
    invoke-virtual {v10, v8}, LP/o;->S(I)V

    .line 183
    .line 184
    .line 185
    and-int/lit8 v0, v0, 0xe

    .line 186
    .line 187
    or-int/lit8 v8, v0, 0x30

    .line 188
    .line 189
    and-int/lit8 v12, v8, 0xe

    .line 190
    .line 191
    xor-int/lit8 v15, v12, 0x6

    .line 192
    .line 193
    if-le v15, v7, :cond_9

    .line 194
    .line 195
    invoke-virtual {v10, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v15

    .line 199
    if-nez v15, :cond_a

    .line 200
    .line 201
    :cond_9
    and-int/lit8 v8, v8, 0x6

    .line 202
    .line 203
    if-ne v8, v7, :cond_b

    .line 204
    .line 205
    :cond_a
    const/4 v8, 0x1

    .line 206
    goto :goto_8

    .line 207
    :cond_b
    move v8, v13

    .line 208
    :goto_8
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v15

    .line 212
    sget-object v14, LP/k;->a:LP/S;

    .line 213
    .line 214
    if-nez v8, :cond_c

    .line 215
    .line 216
    if-ne v15, v14, :cond_d

    .line 217
    .line 218
    :cond_c
    invoke-virtual {v11}, LO3/D0;->j()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    invoke-virtual {v10, v15}, LP/o;->d0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_d
    invoke-virtual {v1}, Lu/v0;->g()Z

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    if-eqz v8, :cond_e

    .line 230
    .line 231
    invoke-virtual {v11}, LO3/D0;->j()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v15

    .line 235
    :cond_e
    const v8, -0x1bd001fd

    .line 236
    .line 237
    .line 238
    invoke-virtual {v10, v8}, LP/o;->S(I)V

    .line 239
    .line 240
    .line 241
    invoke-static {v1, v2, v15, v10}, Landroidx/compose/animation/b;->b(Lu/v0;LB5/c;Ljava/lang/Object;LP/o;)Lt/t;

    .line 242
    .line 243
    .line 244
    move-result-object v11

    .line 245
    invoke-virtual {v10, v13}, LP/o;->p(Z)V

    .line 246
    .line 247
    .line 248
    iget-object v15, v1, Lu/v0;->d:LP/f0;

    .line 249
    .line 250
    invoke-virtual {v15}, LP/f0;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v15

    .line 254
    invoke-virtual {v10, v8}, LP/o;->S(I)V

    .line 255
    .line 256
    .line 257
    invoke-static {v1, v2, v15, v10}, Landroidx/compose/animation/b;->b(Lu/v0;LB5/c;Ljava/lang/Object;LP/o;)Lt/t;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    invoke-virtual {v10, v13}, LP/o;->p(Z)V

    .line 262
    .line 263
    .line 264
    or-int/lit16 v12, v12, 0xc00

    .line 265
    .line 266
    sget-object v15, Lu/y0;->a:Ljava/lang/Object;

    .line 267
    .line 268
    and-int/lit8 v15, v12, 0xe

    .line 269
    .line 270
    xor-int/lit8 v15, v15, 0x6

    .line 271
    .line 272
    if-le v15, v7, :cond_f

    .line 273
    .line 274
    invoke-virtual {v10, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v16

    .line 278
    if-nez v16, :cond_10

    .line 279
    .line 280
    :cond_f
    and-int/lit8 v9, v12, 0x6

    .line 281
    .line 282
    if-ne v9, v7, :cond_11

    .line 283
    .line 284
    :cond_10
    const/4 v9, 0x1

    .line 285
    goto :goto_9

    .line 286
    :cond_11
    move v9, v13

    .line 287
    :goto_9
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v13

    .line 291
    if-nez v9, :cond_13

    .line 292
    .line 293
    if-ne v13, v14, :cond_12

    .line 294
    .line 295
    goto :goto_a

    .line 296
    :cond_12
    move/from16 v17, v12

    .line 297
    .line 298
    goto :goto_b

    .line 299
    :cond_13
    :goto_a
    new-instance v13, Lu/v0;

    .line 300
    .line 301
    new-instance v9, Lu/K;

    .line 302
    .line 303
    invoke-direct {v9, v11}, Lu/K;-><init>(Lt/t;)V

    .line 304
    .line 305
    .line 306
    new-instance v7, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 309
    .line 310
    .line 311
    iget-object v2, v1, Lu/v0;->c:Ljava/lang/String;

    .line 312
    .line 313
    move/from16 v17, v12

    .line 314
    .line 315
    const-string v12, " > EnterExitTransition"

    .line 316
    .line 317
    invoke-static {v7, v2, v12}, Lk1/i;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-direct {v13, v9, v1, v2}, Lu/v0;-><init>(LO3/D0;Lu/v0;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v10, v13}, LP/o;->d0(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :goto_b
    move-object v7, v13

    .line 328
    check-cast v7, Lu/v0;

    .line 329
    .line 330
    const/4 v2, 0x4

    .line 331
    if-le v15, v2, :cond_14

    .line 332
    .line 333
    invoke-virtual {v10, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v9

    .line 337
    if-nez v9, :cond_15

    .line 338
    .line 339
    :cond_14
    and-int/lit8 v9, v17, 0x6

    .line 340
    .line 341
    if-ne v9, v2, :cond_16

    .line 342
    .line 343
    :cond_15
    const/4 v2, 0x1

    .line 344
    goto :goto_c

    .line 345
    :cond_16
    const/4 v2, 0x0

    .line 346
    :goto_c
    invoke-virtual {v10, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v9

    .line 350
    or-int/2addr v2, v9

    .line 351
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    if-nez v2, :cond_17

    .line 356
    .line 357
    if-ne v9, v14, :cond_18

    .line 358
    .line 359
    :cond_17
    new-instance v9, LA/Y;

    .line 360
    .line 361
    const/16 v2, 0x1b

    .line 362
    .line 363
    invoke-direct {v9, v2, v1, v7}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v10, v9}, LP/o;->d0(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    :cond_18
    check-cast v9, LB5/c;

    .line 370
    .line 371
    invoke-static {v7, v9, v10}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1}, Lu/v0;->g()Z

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    if-eqz v2, :cond_19

    .line 379
    .line 380
    invoke-virtual {v7, v11, v8}, Lu/v0;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    goto :goto_d

    .line 384
    :cond_19
    invoke-virtual {v7, v8}, Lu/v0;->p(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    iget-object v2, v7, Lu/v0;->k:LP/f0;

    .line 388
    .line 389
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 390
    .line 391
    invoke-virtual {v2, v8}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    :goto_d
    invoke-static {v6, v10}, LP/b;->t(Ljava/lang/Object;LP/o;)LP/W;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    iget-object v8, v7, Lu/v0;->a:LO3/D0;

    .line 399
    .line 400
    iget-object v9, v7, Lu/v0;->a:LO3/D0;

    .line 401
    .line 402
    iget-object v11, v7, Lu/v0;->d:LP/f0;

    .line 403
    .line 404
    invoke-virtual {v8}, LO3/D0;->j()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    invoke-virtual {v11}, LP/f0;->getValue()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v12

    .line 412
    invoke-interface {v6, v8, v12}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    invoke-virtual {v10, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v12

    .line 420
    invoke-virtual {v10, v2}, LP/o;->g(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v13

    .line 424
    or-int/2addr v12, v13

    .line 425
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v13

    .line 429
    const/4 v15, 0x0

    .line 430
    if-nez v12, :cond_1a

    .line 431
    .line 432
    if-ne v13, v14, :cond_1b

    .line 433
    .line 434
    :cond_1a
    new-instance v13, Lt/o;

    .line 435
    .line 436
    invoke-direct {v13, v7, v2, v15}, Lt/o;-><init>(Lu/v0;LP/W;Lq5/c;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v10, v13}, LP/o;->d0(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    :cond_1b
    check-cast v13, LB5/e;

    .line 443
    .line 444
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    if-ne v2, v14, :cond_1c

    .line 449
    .line 450
    invoke-static {v8}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-virtual {v10, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    :cond_1c
    check-cast v2, LP/W;

    .line 458
    .line 459
    invoke-virtual {v10, v13}, LP/o;->i(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v8

    .line 463
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v12

    .line 467
    if-nez v8, :cond_1d

    .line 468
    .line 469
    if-ne v12, v14, :cond_1e

    .line 470
    .line 471
    :cond_1d
    new-instance v12, LP/K0;

    .line 472
    .line 473
    invoke-direct {v12, v13, v2, v15}, LP/K0;-><init>(LB5/e;LP/W;Lq5/c;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v10, v12}, LP/o;->d0(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    :cond_1e
    check-cast v12, LB5/e;

    .line 480
    .line 481
    sget-object v8, Lm5/y;->a:Lm5/y;

    .line 482
    .line 483
    invoke-static {v12, v10, v8}, LP/b;->e(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v9}, LO3/D0;->j()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v8

    .line 490
    sget-object v12, Lt/t;->s:Lt/t;

    .line 491
    .line 492
    if-ne v8, v12, :cond_20

    .line 493
    .line 494
    invoke-virtual {v11}, LP/f0;->getValue()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v8

    .line 498
    if-ne v8, v12, :cond_20

    .line 499
    .line 500
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    check-cast v2, Ljava/lang/Boolean;

    .line 505
    .line 506
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    if-nez v2, :cond_1f

    .line 511
    .line 512
    goto :goto_e

    .line 513
    :cond_1f
    const v0, 0x6abbbe1a

    .line 514
    .line 515
    .line 516
    invoke-virtual {v10, v0}, LP/o;->S(I)V

    .line 517
    .line 518
    .line 519
    const/4 v0, 0x0

    .line 520
    invoke-virtual {v10, v0}, LP/o;->p(Z)V

    .line 521
    .line 522
    .line 523
    move-object/from16 v7, p6

    .line 524
    .line 525
    move v8, v0

    .line 526
    goto/16 :goto_1a

    .line 527
    .line 528
    :cond_20
    :goto_e
    const v2, 0x6aaa653b

    .line 529
    .line 530
    .line 531
    invoke-virtual {v10, v2}, LP/o;->S(I)V

    .line 532
    .line 533
    .line 534
    const/4 v2, 0x4

    .line 535
    if-ne v0, v2, :cond_21

    .line 536
    .line 537
    const/4 v0, 0x1

    .line 538
    goto :goto_f

    .line 539
    :cond_21
    const/4 v0, 0x0

    .line 540
    :goto_f
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    if-nez v0, :cond_22

    .line 545
    .line 546
    if-ne v2, v14, :cond_23

    .line 547
    .line 548
    :cond_22
    new-instance v2, Lt/q;

    .line 549
    .line 550
    invoke-direct {v2}, Lt/q;-><init>()V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v10, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    :cond_23
    check-cast v2, Lt/q;

    .line 557
    .line 558
    sget-object v0, Lt/z;->a:LZ/m;

    .line 559
    .line 560
    invoke-virtual {v10, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v8

    .line 568
    if-nez v0, :cond_24

    .line 569
    .line 570
    if-ne v8, v14, :cond_25

    .line 571
    .line 572
    :cond_24
    invoke-static {v4}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 573
    .line 574
    .line 575
    move-result-object v8

    .line 576
    invoke-virtual {v10, v8}, LP/o;->d0(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    :cond_25
    check-cast v8, LP/W;

    .line 580
    .line 581
    invoke-virtual {v9}, LO3/D0;->j()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-virtual {v11}, LP/f0;->getValue()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v12

    .line 589
    sget-object v15, Lt/t;->r:Lt/t;

    .line 590
    .line 591
    if-ne v0, v12, :cond_27

    .line 592
    .line 593
    invoke-virtual {v9}, LO3/D0;->j()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    if-ne v0, v15, :cond_27

    .line 598
    .line 599
    invoke-virtual {v7}, Lu/v0;->g()Z

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    if-eqz v0, :cond_26

    .line 604
    .line 605
    invoke-interface {v8, v4}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    goto :goto_10

    .line 609
    :cond_26
    sget-object v0, Lt/D;->b:Lt/D;

    .line 610
    .line 611
    invoke-interface {v8, v0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    goto :goto_10

    .line 615
    :cond_27
    invoke-virtual {v11}, LP/f0;->getValue()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    if-ne v0, v15, :cond_29

    .line 620
    .line 621
    invoke-interface {v8}, LP/S0;->getValue()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    check-cast v0, Lt/D;

    .line 626
    .line 627
    iget-object v0, v0, Lt/D;->a:Lt/L;

    .line 628
    .line 629
    new-instance v12, Lt/D;

    .line 630
    .line 631
    new-instance v13, Lt/L;

    .line 632
    .line 633
    iget-object v1, v4, Lt/D;->a:Lt/L;

    .line 634
    .line 635
    iget-object v4, v1, Lt/L;->a:Lt/F;

    .line 636
    .line 637
    if-nez v4, :cond_28

    .line 638
    .line 639
    iget-object v4, v0, Lt/L;->a:Lt/F;

    .line 640
    .line 641
    :cond_28
    iget-object v0, v0, Lt/L;->c:Ljava/util/Map;

    .line 642
    .line 643
    iget-object v1, v1, Lt/L;->c:Ljava/util/Map;

    .line 644
    .line 645
    invoke-static {v0, v1}, Ln5/x;->K(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    const/4 v1, 0x0

    .line 650
    const/16 v6, 0x10

    .line 651
    .line 652
    invoke-direct {v13, v4, v1, v0, v6}, Lt/L;-><init>(Lt/F;LD5/a;Ljava/util/LinkedHashMap;I)V

    .line 653
    .line 654
    .line 655
    invoke-direct {v12, v13}, Lt/D;-><init>(Lt/L;)V

    .line 656
    .line 657
    .line 658
    invoke-interface {v8, v12}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    :cond_29
    :goto_10
    invoke-interface {v8}, LP/S0;->getValue()Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    check-cast v0, Lt/D;

    .line 666
    .line 667
    invoke-virtual {v10, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    move-result v1

    .line 671
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v4

    .line 675
    if-nez v1, :cond_2a

    .line 676
    .line 677
    if-ne v4, v14, :cond_2b

    .line 678
    .line 679
    :cond_2a
    invoke-static {v5}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 680
    .line 681
    .line 682
    move-result-object v4

    .line 683
    invoke-virtual {v10, v4}, LP/o;->d0(Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    :cond_2b
    check-cast v4, LP/W;

    .line 687
    .line 688
    invoke-virtual {v9}, LO3/D0;->j()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    invoke-virtual {v11}, LP/f0;->getValue()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v6

    .line 696
    if-ne v1, v6, :cond_2d

    .line 697
    .line 698
    invoke-virtual {v9}, LO3/D0;->j()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v1

    .line 702
    if-ne v1, v15, :cond_2d

    .line 703
    .line 704
    invoke-virtual {v7}, Lu/v0;->g()Z

    .line 705
    .line 706
    .line 707
    move-result v1

    .line 708
    if-eqz v1, :cond_2c

    .line 709
    .line 710
    invoke-interface {v4, v5}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    goto :goto_13

    .line 714
    :cond_2c
    sget-object v1, Lt/E;->b:Lt/E;

    .line 715
    .line 716
    invoke-interface {v4, v1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    goto :goto_13

    .line 720
    :cond_2d
    invoke-virtual {v11}, LP/f0;->getValue()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    if-eq v1, v15, :cond_31

    .line 725
    .line 726
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    check-cast v1, Lt/E;

    .line 731
    .line 732
    iget-object v1, v1, Lt/E;->a:Lt/L;

    .line 733
    .line 734
    new-instance v6, Lt/E;

    .line 735
    .line 736
    new-instance v8, Lt/L;

    .line 737
    .line 738
    iget-object v9, v5, Lt/E;->a:Lt/L;

    .line 739
    .line 740
    iget-object v11, v9, Lt/L;->a:Lt/F;

    .line 741
    .line 742
    if-nez v11, :cond_2e

    .line 743
    .line 744
    iget-object v11, v1, Lt/L;->a:Lt/F;

    .line 745
    .line 746
    :cond_2e
    iget-boolean v12, v9, Lt/L;->b:Z

    .line 747
    .line 748
    if-nez v12, :cond_30

    .line 749
    .line 750
    iget-boolean v12, v1, Lt/L;->b:Z

    .line 751
    .line 752
    if-eqz v12, :cond_2f

    .line 753
    .line 754
    goto :goto_11

    .line 755
    :cond_2f
    const/4 v12, 0x0

    .line 756
    goto :goto_12

    .line 757
    :cond_30
    :goto_11
    const/4 v12, 0x1

    .line 758
    :goto_12
    iget-object v1, v1, Lt/L;->c:Ljava/util/Map;

    .line 759
    .line 760
    iget-object v9, v9, Lt/L;->c:Ljava/util/Map;

    .line 761
    .line 762
    invoke-static {v1, v9}, Ln5/x;->K(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    const/4 v9, 0x0

    .line 767
    invoke-direct {v8, v11, v9, v12, v1}, Lt/L;-><init>(Lt/F;LD5/a;ZLjava/util/Map;)V

    .line 768
    .line 769
    .line 770
    invoke-direct {v6, v8}, Lt/E;-><init>(Lt/L;)V

    .line 771
    .line 772
    .line 773
    invoke-interface {v4, v6}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 774
    .line 775
    .line 776
    :cond_31
    :goto_13
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v1

    .line 780
    check-cast v1, Lt/E;

    .line 781
    .line 782
    iget-object v4, v0, Lt/D;->a:Lt/L;

    .line 783
    .line 784
    iget-object v6, v1, Lt/E;->a:Lt/L;

    .line 785
    .line 786
    const v8, -0x30f048d8

    .line 787
    .line 788
    .line 789
    invoke-virtual {v10, v8}, LP/o;->S(I)V

    .line 790
    .line 791
    .line 792
    const/4 v8, 0x0

    .line 793
    invoke-virtual {v10, v8}, LP/o;->p(Z)V

    .line 794
    .line 795
    .line 796
    const v9, -0x30ed3161

    .line 797
    .line 798
    .line 799
    invoke-virtual {v10, v9}, LP/o;->S(I)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v10, v8}, LP/o;->p(Z)V

    .line 803
    .line 804
    .line 805
    const v9, -0x30e97c01

    .line 806
    .line 807
    .line 808
    invoke-virtual {v10, v9}, LP/o;->S(I)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v10, v8}, LP/o;->p(Z)V

    .line 812
    .line 813
    .line 814
    iget-object v4, v4, Lt/L;->a:Lt/F;

    .line 815
    .line 816
    if-nez v4, :cond_33

    .line 817
    .line 818
    iget-object v4, v6, Lt/L;->a:Lt/F;

    .line 819
    .line 820
    if-eqz v4, :cond_32

    .line 821
    .line 822
    goto :goto_14

    .line 823
    :cond_32
    const/4 v4, 0x0

    .line 824
    goto :goto_15

    .line 825
    :cond_33
    :goto_14
    const/4 v4, 0x1

    .line 826
    :goto_15
    if-eqz v4, :cond_35

    .line 827
    .line 828
    const v4, -0x283c14b5

    .line 829
    .line 830
    .line 831
    invoke-virtual {v10, v4}, LP/o;->S(I)V

    .line 832
    .line 833
    .line 834
    sget-object v8, Lu/A0;->a:LZ/m;

    .line 835
    .line 836
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v4

    .line 840
    if-ne v4, v14, :cond_34

    .line 841
    .line 842
    const-string v4, "Built-in alpha"

    .line 843
    .line 844
    invoke-virtual {v10, v4}, LP/o;->d0(Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    :cond_34
    move-object v9, v4

    .line 848
    check-cast v9, Ljava/lang/String;

    .line 849
    .line 850
    const/16 v11, 0x180

    .line 851
    .line 852
    const/4 v12, 0x0

    .line 853
    invoke-static/range {v7 .. v12}, Lu/y0;->a(Lu/v0;LZ/m;Ljava/lang/String;LP/o;II)Lu/p0;

    .line 854
    .line 855
    .line 856
    move-result-object v4

    .line 857
    const/4 v8, 0x0

    .line 858
    invoke-virtual {v10, v8}, LP/o;->p(Z)V

    .line 859
    .line 860
    .line 861
    goto :goto_16

    .line 862
    :cond_35
    const/4 v8, 0x0

    .line 863
    const v4, -0x28398291

    .line 864
    .line 865
    .line 866
    invoke-virtual {v10, v4}, LP/o;->S(I)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v10, v8}, LP/o;->p(Z)V

    .line 870
    .line 871
    .line 872
    const/4 v4, 0x0

    .line 873
    :goto_16
    const v6, -0x2835e851

    .line 874
    .line 875
    .line 876
    invoke-virtual {v10, v6}, LP/o;->S(I)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v10, v8}, LP/o;->p(Z)V

    .line 880
    .line 881
    .line 882
    const v6, -0x28321bb1

    .line 883
    .line 884
    .line 885
    invoke-virtual {v10, v6}, LP/o;->S(I)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v10, v8}, LP/o;->p(Z)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v10, v4}, LP/o;->i(Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    move-result v6

    .line 895
    invoke-virtual {v10, v0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v8

    .line 899
    or-int/2addr v6, v8

    .line 900
    invoke-virtual {v10, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v8

    .line 904
    or-int/2addr v6, v8

    .line 905
    const/4 v8, 0x0

    .line 906
    invoke-virtual {v10, v8}, LP/o;->i(Ljava/lang/Object;)Z

    .line 907
    .line 908
    .line 909
    move-result v9

    .line 910
    or-int/2addr v6, v9

    .line 911
    invoke-virtual {v10, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v9

    .line 915
    or-int/2addr v6, v9

    .line 916
    invoke-virtual {v10, v8}, LP/o;->i(Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    move-result v9

    .line 920
    or-int/2addr v6, v9

    .line 921
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v9

    .line 925
    if-nez v6, :cond_37

    .line 926
    .line 927
    if-ne v9, v14, :cond_36

    .line 928
    .line 929
    goto :goto_17

    .line 930
    :cond_36
    move-object/from16 v20, v0

    .line 931
    .line 932
    move-object/from16 v21, v1

    .line 933
    .line 934
    goto :goto_18

    .line 935
    :cond_37
    :goto_17
    new-instance v18, Lt/u;

    .line 936
    .line 937
    move-object/from16 v24, v8

    .line 938
    .line 939
    move-object/from16 v22, v0

    .line 940
    .line 941
    move-object/from16 v23, v1

    .line 942
    .line 943
    move-object/from16 v19, v4

    .line 944
    .line 945
    move-object/from16 v21, v7

    .line 946
    .line 947
    move-object/from16 v20, v8

    .line 948
    .line 949
    invoke-direct/range {v18 .. v24}, Lt/u;-><init>(Lu/p0;Lu/p0;Lu/v0;Lt/D;Lt/E;Lu/p0;)V

    .line 950
    .line 951
    .line 952
    move-object/from16 v9, v18

    .line 953
    .line 954
    move-object/from16 v20, v22

    .line 955
    .line 956
    move-object/from16 v21, v23

    .line 957
    .line 958
    invoke-virtual {v10, v9}, LP/o;->d0(Ljava/lang/Object;)V

    .line 959
    .line 960
    .line 961
    :goto_18
    move-object/from16 v23, v9

    .line 962
    .line 963
    check-cast v23, Lt/u;

    .line 964
    .line 965
    const/4 v0, 0x1

    .line 966
    invoke-virtual {v10, v0}, LP/o;->h(Z)Z

    .line 967
    .line 968
    .line 969
    move-result v1

    .line 970
    sget-object v4, Lt/x;->q:Lt/x;

    .line 971
    .line 972
    invoke-virtual {v10, v4}, LP/o;->g(Ljava/lang/Object;)Z

    .line 973
    .line 974
    .line 975
    move-result v6

    .line 976
    or-int/2addr v1, v6

    .line 977
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v6

    .line 981
    if-nez v1, :cond_38

    .line 982
    .line 983
    if-ne v6, v14, :cond_39

    .line 984
    .line 985
    :cond_38
    new-instance v6, Lt/y;

    .line 986
    .line 987
    invoke-direct {v6, v0, v4}, Lt/y;-><init>(ZLB5/a;)V

    .line 988
    .line 989
    .line 990
    invoke-virtual {v10, v6}, LP/o;->d0(Ljava/lang/Object;)V

    .line 991
    .line 992
    .line 993
    :cond_39
    check-cast v6, LB5/c;

    .line 994
    .line 995
    sget-object v0, Lc0/j;->q:Lc0/j;

    .line 996
    .line 997
    invoke-static {v0, v6}, Landroidx/compose/ui/graphics/a;->a(Lc0/m;LB5/c;)Lc0/m;

    .line 998
    .line 999
    .line 1000
    move-result-object v1

    .line 1001
    new-instance v18, Landroidx/compose/animation/EnterExitTransitionElement;

    .line 1002
    .line 1003
    move-object/from16 v22, v4

    .line 1004
    .line 1005
    move-object/from16 v19, v7

    .line 1006
    .line 1007
    invoke-direct/range {v18 .. v23}, Landroidx/compose/animation/EnterExitTransitionElement;-><init>(Lu/v0;Lt/D;Lt/E;LB5/a;Lt/u;)V

    .line 1008
    .line 1009
    .line 1010
    move-object/from16 v4, v18

    .line 1011
    .line 1012
    invoke-interface {v1, v4}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v1

    .line 1016
    const v4, 0x5e4809f0

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v10, v4}, LP/o;->S(I)V

    .line 1020
    .line 1021
    .line 1022
    const/4 v8, 0x0

    .line 1023
    invoke-virtual {v10, v8}, LP/o;->p(Z)V

    .line 1024
    .line 1025
    .line 1026
    invoke-interface {v1, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    invoke-interface {v3, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v1

    .line 1038
    if-ne v1, v14, :cond_3a

    .line 1039
    .line 1040
    new-instance v1, Lt/m;

    .line 1041
    .line 1042
    invoke-direct {v1, v2}, Lt/m;-><init>(Lt/q;)V

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v10, v1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 1046
    .line 1047
    .line 1048
    :cond_3a
    check-cast v1, Lt/m;

    .line 1049
    .line 1050
    iget v4, v10, LP/o;->P:I

    .line 1051
    .line 1052
    invoke-virtual {v10}, LP/o;->m()LP/i0;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v6

    .line 1056
    invoke-static {v10, v0}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    sget-object v7, LB0/k;->a:LB0/j;

    .line 1061
    .line 1062
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1063
    .line 1064
    .line 1065
    sget-object v7, LB0/j;->b:LB0/D;

    .line 1066
    .line 1067
    invoke-virtual {v10}, LP/o;->W()V

    .line 1068
    .line 1069
    .line 1070
    iget-boolean v8, v10, LP/o;->O:Z

    .line 1071
    .line 1072
    if-eqz v8, :cond_3b

    .line 1073
    .line 1074
    invoke-virtual {v10, v7}, LP/o;->l(LB5/a;)V

    .line 1075
    .line 1076
    .line 1077
    goto :goto_19

    .line 1078
    :cond_3b
    invoke-virtual {v10}, LP/o;->g0()V

    .line 1079
    .line 1080
    .line 1081
    :goto_19
    sget-object v7, LB0/j;->e:LB0/i;

    .line 1082
    .line 1083
    invoke-static {v7, v10, v1}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    sget-object v1, LB0/j;->d:LB0/i;

    .line 1087
    .line 1088
    invoke-static {v1, v10, v6}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 1089
    .line 1090
    .line 1091
    sget-object v1, LB0/j;->f:LB0/i;

    .line 1092
    .line 1093
    iget-boolean v6, v10, LP/o;->O:Z

    .line 1094
    .line 1095
    if-nez v6, :cond_3c

    .line 1096
    .line 1097
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v6

    .line 1101
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v7

    .line 1105
    invoke-static {v6, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v6

    .line 1109
    if-nez v6, :cond_3d

    .line 1110
    .line 1111
    :cond_3c
    invoke-static {v4, v10, v4, v1}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 1112
    .line 1113
    .line 1114
    :cond_3d
    sget-object v1, LB0/j;->c:LB0/i;

    .line 1115
    .line 1116
    invoke-static {v1, v10, v0}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 1117
    .line 1118
    .line 1119
    const/16 v0, 0x30

    .line 1120
    .line 1121
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v0

    .line 1125
    move-object/from16 v7, p6

    .line 1126
    .line 1127
    invoke-virtual {v7, v2, v10, v0}, LX/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1128
    .line 1129
    .line 1130
    const/4 v0, 0x1

    .line 1131
    invoke-virtual {v10, v0}, LP/o;->p(Z)V

    .line 1132
    .line 1133
    .line 1134
    const/4 v8, 0x0

    .line 1135
    invoke-virtual {v10, v8}, LP/o;->p(Z)V

    .line 1136
    .line 1137
    .line 1138
    :goto_1a
    invoke-virtual {v10, v8}, LP/o;->p(Z)V

    .line 1139
    .line 1140
    .line 1141
    goto :goto_1b

    .line 1142
    :cond_3e
    move-object/from16 v7, p6

    .line 1143
    .line 1144
    invoke-virtual {v10}, LP/o;->N()V

    .line 1145
    .line 1146
    .line 1147
    :goto_1b
    invoke-virtual {v10}, LP/o;->r()LP/o0;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v9

    .line 1151
    if-eqz v9, :cond_3f

    .line 1152
    .line 1153
    new-instance v0, LC/o;

    .line 1154
    .line 1155
    move-object/from16 v1, p0

    .line 1156
    .line 1157
    move-object/from16 v2, p1

    .line 1158
    .line 1159
    move-object/from16 v4, p3

    .line 1160
    .line 1161
    move-object/from16 v6, p5

    .line 1162
    .line 1163
    move/from16 v8, p8

    .line 1164
    .line 1165
    invoke-direct/range {v0 .. v8}, LC/o;-><init>(Lu/v0;LB5/c;Lc0/m;Lt/D;Lt/E;LB5/e;LX/e;I)V

    .line 1166
    .line 1167
    .line 1168
    iput-object v0, v9, LP/o0;->d:LB5/e;

    .line 1169
    .line 1170
    :cond_3f
    return-void
.end method

.method public static final b(Lu/v0;LB5/c;Ljava/lang/Object;LP/o;)Lt/t;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, -0x35c3ee3d

    .line 3
    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {p3, v1, v2, p0, v0}, LP/o;->O(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lu/v0;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p0, p0, Lu/v0;->a:LO3/D0;

    .line 14
    .line 15
    sget-object v1, Lt/t;->q:Lt/t;

    .line 16
    .line 17
    sget-object v3, Lt/t;->s:Lt/t;

    .line 18
    .line 19
    sget-object v4, Lt/t;->r:Lt/t;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const v0, 0x7d467783

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3, v0}, LP/o;->S(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, v2}, LP/o;->p(Z)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, p2}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_0

    .line 43
    .line 44
    move-object v1, v4

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-virtual {p0}, LO3/D0;->j()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-interface {p1, p0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_6

    .line 61
    .line 62
    move-object v1, v3

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const v0, 0x7d4aa658

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3, v0}, LP/o;->S(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3}, LP/o;->H()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget-object v5, LP/k;->a:LP/S;

    .line 75
    .line 76
    if-ne v0, v5, :cond_2

    .line 77
    .line 78
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-static {v0}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p3, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    check-cast v0, LP/W;

    .line 88
    .line 89
    invoke-virtual {p0}, LO3/D0;->j()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-interface {p1, p0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_3

    .line 104
    .line 105
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-interface {v0, p0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-interface {p1, p2}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-eqz p0, :cond_4

    .line 121
    .line 122
    move-object v1, v4

    .line 123
    goto :goto_0

    .line 124
    :cond_4
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-eqz p0, :cond_5

    .line 135
    .line 136
    move-object v1, v3

    .line 137
    :cond_5
    :goto_0
    invoke-virtual {p3, v2}, LP/o;->p(Z)V

    .line 138
    .line 139
    .line 140
    :cond_6
    :goto_1
    invoke-virtual {p3, v2}, LP/o;->p(Z)V

    .line 141
    .line 142
    .line 143
    return-object v1
.end method
