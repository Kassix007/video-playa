.class public final synthetic LJ5/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LJ5/u;->q:I

    iput-object p3, p0, LJ5/u;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, LJ5/u;->q:I

    iput-object p2, p0, LJ5/u;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LJ5/u;->q:I

    .line 4
    .line 5
    const-string v2, "$this$DelimitedRangesSequence"

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    sget-object v6, Lm5/y;->a:Lm5/y;

    .line 10
    .line 11
    const/4 v7, 0x1

    .line 12
    iget-object v8, v0, LJ5/u;->r:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v8, LP/W;

    .line 18
    .line 19
    move-object/from16 v12, p1

    .line 20
    .line 21
    check-cast v12, LP/o;

    .line 22
    .line 23
    move-object/from16 v1, p2

    .line 24
    .line 25
    check-cast v1, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    and-int/lit8 v2, v1, 0x3

    .line 32
    .line 33
    if-eq v2, v3, :cond_0

    .line 34
    .line 35
    move v2, v7

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v2, v4

    .line 38
    :goto_0
    and-int/2addr v1, v7

    .line 39
    invoke-virtual {v12, v1, v2}, LP/o;->K(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_8

    .line 44
    .line 45
    sget-object v1, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 46
    .line 47
    sget-object v2, Lc0/b;->q:Lc0/e;

    .line 48
    .line 49
    invoke-static {v2, v4}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iget v9, v12, LP/o;->P:I

    .line 54
    .line 55
    invoke-virtual {v12}, LP/o;->m()LP/i0;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    invoke-static {v12, v1}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    sget-object v13, LB0/k;->a:LB0/j;

    .line 64
    .line 65
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    sget-object v13, LB0/j;->b:LB0/D;

    .line 69
    .line 70
    invoke-virtual {v12}, LP/o;->W()V

    .line 71
    .line 72
    .line 73
    iget-boolean v14, v12, LP/o;->O:Z

    .line 74
    .line 75
    if-eqz v14, :cond_1

    .line 76
    .line 77
    invoke-virtual {v12, v13}, LP/o;->l(LB5/a;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {v12}, LP/o;->g0()V

    .line 82
    .line 83
    .line 84
    :goto_1
    sget-object v14, LB0/j;->e:LB0/i;

    .line 85
    .line 86
    invoke-static {v14, v12, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sget-object v2, LB0/j;->d:LB0/i;

    .line 90
    .line 91
    invoke-static {v2, v12, v10}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object v10, LB0/j;->f:LB0/i;

    .line 95
    .line 96
    iget-boolean v15, v12, LP/o;->O:Z

    .line 97
    .line 98
    if-nez v15, :cond_2

    .line 99
    .line 100
    invoke-virtual {v12}, LP/o;->H()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v15

    .line 104
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-static {v15, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-nez v7, :cond_3

    .line 113
    .line 114
    :cond_2
    invoke-static {v9, v12, v9, v10}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    sget-object v7, LB0/j;->c:LB0/i;

    .line 118
    .line 119
    invoke-static {v7, v12, v11}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object v9, LA/i;->c:LA/b;

    .line 123
    .line 124
    sget-object v11, Lc0/b;->B:Lc0/c;

    .line 125
    .line 126
    invoke-static {v9, v11, v12, v4}, LA/r;->a(LA/g;Lc0/c;LP/o;I)LA/t;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    iget v11, v12, LP/o;->P:I

    .line 131
    .line 132
    invoke-virtual {v12}, LP/o;->m()LP/i0;

    .line 133
    .line 134
    .line 135
    move-result-object v15

    .line 136
    invoke-static {v12, v1}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {v12}, LP/o;->W()V

    .line 141
    .line 142
    .line 143
    iget-boolean v5, v12, LP/o;->O:Z

    .line 144
    .line 145
    if-eqz v5, :cond_4

    .line 146
    .line 147
    invoke-virtual {v12, v13}, LP/o;->l(LB5/a;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_4
    invoke-virtual {v12}, LP/o;->g0()V

    .line 152
    .line 153
    .line 154
    :goto_2
    invoke-static {v14, v12, v9}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v2, v12, v15}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-boolean v2, v12, LP/o;->O:Z

    .line 161
    .line 162
    if-nez v2, :cond_5

    .line 163
    .line 164
    invoke-virtual {v12}, LP/o;->H()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-static {v2, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-nez v2, :cond_6

    .line 177
    .line 178
    :cond_5
    invoke-static {v11, v12, v11, v10}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 179
    .line 180
    .line 181
    :cond_6
    invoke-static {v7, v12, v4}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const/4 v14, 0x7

    .line 186
    const/4 v9, 0x0

    .line 187
    const/4 v10, 0x0

    .line 188
    const/4 v11, 0x0

    .line 189
    invoke-static/range {v9 .. v14}, LU4/a;->t(ILjava/lang/String;ZLP/o;II)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12}, LP/o;->H()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    sget-object v4, LP/k;->a:LP/S;

    .line 197
    .line 198
    if-ne v2, v4, :cond_7

    .line 199
    .line 200
    new-instance v2, LU4/m;

    .line 201
    .line 202
    invoke-direct {v2, v8, v3}, LU4/m;-><init>(LP/W;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_7
    move-object v9, v2

    .line 209
    check-cast v9, LB5/c;

    .line 210
    .line 211
    const/16 v13, 0x36

    .line 212
    .line 213
    const/4 v14, 0x4

    .line 214
    const/4 v11, 0x0

    .line 215
    move-object v10, v1

    .line 216
    invoke-static/range {v9 .. v14}, Landroidx/compose/ui/viewinterop/a;->b(LB5/c;Lc0/m;LB5/c;LP/o;II)V

    .line 217
    .line 218
    .line 219
    const/4 v1, 0x3

    .line 220
    const/4 v2, 0x0

    .line 221
    const/4 v3, 0x0

    .line 222
    invoke-static {v3, v2, v12, v2, v1}, LU4/a;->m(Ljava/lang/String;ZLP/o;II)V

    .line 223
    .line 224
    .line 225
    const/4 v1, 0x1

    .line 226
    invoke-virtual {v12, v1}, LP/o;->p(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v1}, LP/o;->p(Z)V

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_8
    invoke-virtual {v12}, LP/o;->N()V

    .line 234
    .line 235
    .line 236
    :goto_3
    return-object v6

    .line 237
    :pswitch_0
    move v1, v7

    .line 238
    check-cast v8, LU1/r;

    .line 239
    .line 240
    move-object/from16 v2, p1

    .line 241
    .line 242
    check-cast v2, LP/o;

    .line 243
    .line 244
    move-object/from16 v3, p2

    .line 245
    .line 246
    check-cast v3, Ljava/lang/Integer;

    .line 247
    .line 248
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-static {v1}, LP/b;->w(I)I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    invoke-static {v8, v2, v1}, Lcom/google/android/gms/internal/measurement/I1;->C(LU1/r;LP/o;I)V

    .line 256
    .line 257
    .line 258
    return-object v6

    .line 259
    :pswitch_1
    move v1, v7

    .line 260
    check-cast v8, LB0/o;

    .line 261
    .line 262
    move-object/from16 v2, p1

    .line 263
    .line 264
    check-cast v2, LP/o;

    .line 265
    .line 266
    move-object/from16 v3, p2

    .line 267
    .line 268
    check-cast v3, Ljava/lang/Integer;

    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-static {v1}, LP/b;->w(I)I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    invoke-virtual {v8, v1, v2}, LB0/o;->k(ILP/o;)V

    .line 278
    .line 279
    .line 280
    return-object v6

    .line 281
    :pswitch_2
    move v1, v7

    .line 282
    check-cast v8, LR4/V;

    .line 283
    .line 284
    move-object/from16 v2, p1

    .line 285
    .line 286
    check-cast v2, LP/o;

    .line 287
    .line 288
    move-object/from16 v3, p2

    .line 289
    .line 290
    check-cast v3, Ljava/lang/Integer;

    .line 291
    .line 292
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-static {v1}, LP/b;->w(I)I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    invoke-virtual {v8, v1, v2}, LR4/V;->d(ILP/o;)V

    .line 300
    .line 301
    .line 302
    return-object v6

    .line 303
    :pswitch_3
    move v1, v7

    .line 304
    check-cast v8, LB0/o;

    .line 305
    .line 306
    move-object/from16 v2, p1

    .line 307
    .line 308
    check-cast v2, LP/o;

    .line 309
    .line 310
    move-object/from16 v3, p2

    .line 311
    .line 312
    check-cast v3, Ljava/lang/Integer;

    .line 313
    .line 314
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-static {v1}, LP/b;->w(I)I

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    invoke-virtual {v8, v1, v2}, LB0/o;->h(ILP/o;)V

    .line 322
    .line 323
    .line 324
    return-object v6

    .line 325
    :pswitch_4
    move v1, v7

    .line 326
    check-cast v8, LR4/V;

    .line 327
    .line 328
    move-object/from16 v2, p1

    .line 329
    .line 330
    check-cast v2, LP/o;

    .line 331
    .line 332
    move-object/from16 v3, p2

    .line 333
    .line 334
    check-cast v3, Ljava/lang/Integer;

    .line 335
    .line 336
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    invoke-static {v1}, LP/b;->w(I)I

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    invoke-virtual {v8, v1, v2}, LR4/V;->c(ILP/o;)V

    .line 344
    .line 345
    .line 346
    return-object v6

    .line 347
    :pswitch_5
    check-cast v8, Lcom/web2native/MainActivity;

    .line 348
    .line 349
    move-object/from16 v1, p1

    .line 350
    .line 351
    check-cast v1, LP/o;

    .line 352
    .line 353
    move-object/from16 v2, p2

    .line 354
    .line 355
    check-cast v2, Ljava/lang/Integer;

    .line 356
    .line 357
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    sget v4, Lcom/web2native/MainActivity;->U:I

    .line 362
    .line 363
    and-int/lit8 v4, v2, 0x3

    .line 364
    .line 365
    if-eq v4, v3, :cond_9

    .line 366
    .line 367
    const/4 v3, 0x1

    .line 368
    :goto_4
    const/16 v16, 0x1

    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_9
    const/4 v3, 0x0

    .line 372
    goto :goto_4

    .line 373
    :goto_5
    and-int/lit8 v2, v2, 0x1

    .line 374
    .line 375
    invoke-virtual {v1, v2, v3}, LP/o;->K(IZ)Z

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    if-eqz v2, :cond_b

    .line 380
    .line 381
    iget-object v2, v8, Lcom/web2native/MainActivity;->Q:LR4/k1;

    .line 382
    .line 383
    if-eqz v2, :cond_a

    .line 384
    .line 385
    const/4 v3, 0x0

    .line 386
    invoke-static {v2, v1, v3}, Ln5/A;->e(LR4/k1;LP/o;I)V

    .line 387
    .line 388
    .line 389
    goto :goto_6

    .line 390
    :cond_a
    const-string v1, "dataObject"

    .line 391
    .line 392
    invoke-static {v1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    const/16 v18, 0x0

    .line 396
    .line 397
    throw v18

    .line 398
    :cond_b
    invoke-virtual {v1}, LP/o;->N()V

    .line 399
    .line 400
    .line 401
    :goto_6
    return-object v6

    .line 402
    :pswitch_6
    check-cast v8, LR4/V;

    .line 403
    .line 404
    move-object/from16 v1, p1

    .line 405
    .line 406
    check-cast v1, LP/o;

    .line 407
    .line 408
    move-object/from16 v2, p2

    .line 409
    .line 410
    check-cast v2, Ljava/lang/Integer;

    .line 411
    .line 412
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    const/16 v16, 0x1

    .line 416
    .line 417
    invoke-static/range {v16 .. v16}, LP/b;->w(I)I

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    invoke-virtual {v8, v2, v1}, LR4/V;->b(ILP/o;)V

    .line 422
    .line 423
    .line 424
    return-object v6

    .line 425
    :pswitch_7
    const/16 v18, 0x0

    .line 426
    .line 427
    check-cast v8, LQ5/y;

    .line 428
    .line 429
    move-object/from16 v1, p1

    .line 430
    .line 431
    check-cast v1, Ljava/lang/Integer;

    .line 432
    .line 433
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    move-object/from16 v2, p2

    .line 438
    .line 439
    check-cast v2, Lq5/f;

    .line 440
    .line 441
    invoke-interface {v2}, Lq5/f;->getKey()Lq5/g;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    iget-object v4, v8, LQ5/y;->r:Lq5/h;

    .line 446
    .line 447
    invoke-interface {v4, v3}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    sget-object v5, LM5/t;->r:LM5/t;

    .line 452
    .line 453
    if-eq v3, v5, :cond_d

    .line 454
    .line 455
    if-eq v2, v4, :cond_c

    .line 456
    .line 457
    const/high16 v1, -0x80000000

    .line 458
    .line 459
    goto :goto_a

    .line 460
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 461
    .line 462
    goto :goto_a

    .line 463
    :cond_d
    check-cast v4, LM5/b0;

    .line 464
    .line 465
    check-cast v2, LM5/b0;

    .line 466
    .line 467
    :goto_7
    if-nez v2, :cond_e

    .line 468
    .line 469
    move-object/from16 v5, v18

    .line 470
    .line 471
    goto :goto_9

    .line 472
    :cond_e
    if-ne v2, v4, :cond_f

    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_f
    instance-of v3, v2, LR5/r;

    .line 476
    .line 477
    if-nez v3, :cond_11

    .line 478
    .line 479
    :goto_8
    move-object v5, v2

    .line 480
    :goto_9
    if-ne v5, v4, :cond_10

    .line 481
    .line 482
    if-nez v4, :cond_c

    .line 483
    .line 484
    :goto_a
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    return-object v1

    .line 489
    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 490
    .line 491
    new-instance v2, Ljava/lang/StringBuilder;

    .line 492
    .line 493
    const-string v3, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    .line 494
    .line 495
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    const-string v3, ", expected child of "

    .line 502
    .line 503
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    const-string v3, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    .line 510
    .line 511
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    throw v1

    .line 526
    :cond_11
    check-cast v2, LR5/r;

    .line 527
    .line 528
    sget-object v3, LM5/i0;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 529
    .line 530
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    check-cast v2, LM5/k;

    .line 535
    .line 536
    if-eqz v2, :cond_12

    .line 537
    .line 538
    invoke-interface {v2}, LM5/k;->getParent()LM5/b0;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    move-object v2, v3

    .line 543
    goto :goto_7

    .line 544
    :cond_12
    move-object/from16 v2, v18

    .line 545
    .line 546
    goto :goto_7

    .line 547
    :pswitch_8
    const/16 v18, 0x0

    .line 548
    .line 549
    check-cast v8, [C

    .line 550
    .line 551
    move-object/from16 v1, p1

    .line 552
    .line 553
    check-cast v1, Ljava/lang/CharSequence;

    .line 554
    .line 555
    move-object/from16 v3, p2

    .line 556
    .line 557
    check-cast v3, Ljava/lang/Integer;

    .line 558
    .line 559
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 560
    .line 561
    .line 562
    move-result v3

    .line 563
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    const/4 v2, 0x0

    .line 567
    invoke-static {v1, v8, v3, v2}, LJ5/m;->T0(Ljava/lang/CharSequence;[CIZ)I

    .line 568
    .line 569
    .line 570
    move-result v1

    .line 571
    if-gez v1, :cond_13

    .line 572
    .line 573
    move-object/from16 v5, v18

    .line 574
    .line 575
    goto :goto_b

    .line 576
    :cond_13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    const/16 v16, 0x1

    .line 581
    .line 582
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    new-instance v5, Lm5/j;

    .line 587
    .line 588
    invoke-direct {v5, v1, v2}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    :goto_b
    return-object v5

    .line 592
    :pswitch_9
    const/16 v18, 0x0

    .line 593
    .line 594
    check-cast v8, Ljava/util/List;

    .line 595
    .line 596
    move-object/from16 v11, p1

    .line 597
    .line 598
    check-cast v11, Ljava/lang/CharSequence;

    .line 599
    .line 600
    move-object/from16 v1, p2

    .line 601
    .line 602
    check-cast v1, Ljava/lang/Integer;

    .line 603
    .line 604
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 605
    .line 606
    .line 607
    move-result v1

    .line 608
    invoke-static {v11, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    check-cast v8, Ljava/util/Collection;

    .line 612
    .line 613
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 614
    .line 615
    .line 616
    move-result v2

    .line 617
    const/4 v3, 0x1

    .line 618
    if-ne v2, v3, :cond_1b

    .line 619
    .line 620
    check-cast v8, Ljava/lang/Iterable;

    .line 621
    .line 622
    instance-of v2, v8, Ljava/util/List;

    .line 623
    .line 624
    if-eqz v2, :cond_16

    .line 625
    .line 626
    check-cast v8, Ljava/util/List;

    .line 627
    .line 628
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 629
    .line 630
    .line 631
    move-result v2

    .line 632
    if-eqz v2, :cond_15

    .line 633
    .line 634
    if-ne v2, v3, :cond_14

    .line 635
    .line 636
    const/4 v2, 0x0

    .line 637
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    goto :goto_c

    .line 642
    :cond_14
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 643
    .line 644
    const-string v2, "List has more than one element."

    .line 645
    .line 646
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    throw v1

    .line 650
    :cond_15
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 651
    .line 652
    const-string v2, "List is empty."

    .line 653
    .line 654
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    throw v1

    .line 658
    :cond_16
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 663
    .line 664
    .line 665
    move-result v3

    .line 666
    if-eqz v3, :cond_1a

    .line 667
    .line 668
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v3

    .line 672
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    if-nez v2, :cond_19

    .line 677
    .line 678
    move-object v2, v3

    .line 679
    :goto_c
    check-cast v2, Ljava/lang/String;

    .line 680
    .line 681
    const/4 v3, 0x4

    .line 682
    invoke-static {v11, v2, v1, v3}, LJ5/m;->S0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    if-gez v1, :cond_18

    .line 687
    .line 688
    :cond_17
    move-object/from16 v3, v18

    .line 689
    .line 690
    goto/16 :goto_13

    .line 691
    .line 692
    :cond_18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    new-instance v3, Lm5/j;

    .line 697
    .line 698
    invoke-direct {v3, v1, v2}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    goto/16 :goto_13

    .line 702
    .line 703
    :cond_19
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 704
    .line 705
    const-string v2, "Collection has more than one element."

    .line 706
    .line 707
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    throw v1

    .line 711
    :cond_1a
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 712
    .line 713
    const-string v2, "Collection is empty."

    .line 714
    .line 715
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    throw v1

    .line 719
    :cond_1b
    const/4 v2, 0x0

    .line 720
    new-instance v3, LG5/d;

    .line 721
    .line 722
    if-gez v1, :cond_1c

    .line 723
    .line 724
    move v4, v2

    .line 725
    goto :goto_d

    .line 726
    :cond_1c
    move v4, v1

    .line 727
    :goto_d
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 728
    .line 729
    .line 730
    move-result v1

    .line 731
    const/4 v2, 0x1

    .line 732
    invoke-direct {v3, v4, v1, v2}, LG5/b;-><init>(III)V

    .line 733
    .line 734
    .line 735
    instance-of v1, v11, Ljava/lang/String;

    .line 736
    .line 737
    const/4 v14, 0x0

    .line 738
    iget v2, v3, LG5/b;->s:I

    .line 739
    .line 740
    iget v3, v3, LG5/b;->r:I

    .line 741
    .line 742
    if-eqz v1, :cond_22

    .line 743
    .line 744
    if-lez v2, :cond_1d

    .line 745
    .line 746
    if-le v4, v3, :cond_1e

    .line 747
    .line 748
    :cond_1d
    if-gez v2, :cond_17

    .line 749
    .line 750
    if-gt v3, v4, :cond_17

    .line 751
    .line 752
    :cond_1e
    move v13, v4

    .line 753
    :goto_e
    move-object v1, v8

    .line 754
    check-cast v1, Ljava/lang/Iterable;

    .line 755
    .line 756
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 761
    .line 762
    .line 763
    move-result v4

    .line 764
    if-eqz v4, :cond_20

    .line 765
    .line 766
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v4

    .line 770
    move-object v15, v4

    .line 771
    check-cast v15, Ljava/lang/String;

    .line 772
    .line 773
    move-object/from16 v16, v11

    .line 774
    .line 775
    check-cast v16, Ljava/lang/String;

    .line 776
    .line 777
    move/from16 v17, v14

    .line 778
    .line 779
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 780
    .line 781
    .line 782
    move-result v14

    .line 783
    const/4 v12, 0x0

    .line 784
    invoke-static/range {v12 .. v17}, LJ5/t;->D0(IIILjava/lang/String;Ljava/lang/String;Z)Z

    .line 785
    .line 786
    .line 787
    move-result v5

    .line 788
    if-eqz v5, :cond_1f

    .line 789
    .line 790
    goto :goto_10

    .line 791
    :cond_1f
    move/from16 v14, v17

    .line 792
    .line 793
    goto :goto_f

    .line 794
    :cond_20
    move/from16 v17, v14

    .line 795
    .line 796
    move-object/from16 v4, v18

    .line 797
    .line 798
    :goto_10
    check-cast v4, Ljava/lang/String;

    .line 799
    .line 800
    if-eqz v4, :cond_21

    .line 801
    .line 802
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    new-instance v3, Lm5/j;

    .line 807
    .line 808
    invoke-direct {v3, v1, v4}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 809
    .line 810
    .line 811
    goto :goto_13

    .line 812
    :cond_21
    if-eq v13, v3, :cond_17

    .line 813
    .line 814
    add-int/2addr v13, v2

    .line 815
    move/from16 v14, v17

    .line 816
    .line 817
    goto :goto_e

    .line 818
    :cond_22
    move/from16 v17, v14

    .line 819
    .line 820
    if-lez v2, :cond_23

    .line 821
    .line 822
    if-le v4, v3, :cond_24

    .line 823
    .line 824
    :cond_23
    if-gez v2, :cond_17

    .line 825
    .line 826
    if-gt v3, v4, :cond_17

    .line 827
    .line 828
    :cond_24
    move v12, v4

    .line 829
    :goto_11
    move-object v1, v8

    .line 830
    check-cast v1, Ljava/lang/Iterable;

    .line 831
    .line 832
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    :cond_25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 837
    .line 838
    .line 839
    move-result v4

    .line 840
    if-eqz v4, :cond_26

    .line 841
    .line 842
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v4

    .line 846
    move-object v9, v4

    .line 847
    check-cast v9, Ljava/lang/String;

    .line 848
    .line 849
    const/4 v10, 0x0

    .line 850
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 851
    .line 852
    .line 853
    move-result v13

    .line 854
    move/from16 v14, v17

    .line 855
    .line 856
    invoke-static/range {v9 .. v14}, LJ5/m;->Z0(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 857
    .line 858
    .line 859
    move-result v5

    .line 860
    if-eqz v5, :cond_25

    .line 861
    .line 862
    goto :goto_12

    .line 863
    :cond_26
    move-object/from16 v4, v18

    .line 864
    .line 865
    :goto_12
    check-cast v4, Ljava/lang/String;

    .line 866
    .line 867
    if-eqz v4, :cond_27

    .line 868
    .line 869
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 870
    .line 871
    .line 872
    move-result-object v1

    .line 873
    new-instance v3, Lm5/j;

    .line 874
    .line 875
    invoke-direct {v3, v1, v4}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 876
    .line 877
    .line 878
    goto :goto_13

    .line 879
    :cond_27
    if-eq v12, v3, :cond_17

    .line 880
    .line 881
    add-int/2addr v12, v2

    .line 882
    goto :goto_11

    .line 883
    :goto_13
    if-eqz v3, :cond_28

    .line 884
    .line 885
    iget-object v1, v3, Lm5/j;->q:Ljava/lang/Object;

    .line 886
    .line 887
    iget-object v2, v3, Lm5/j;->r:Ljava/lang/Object;

    .line 888
    .line 889
    check-cast v2, Ljava/lang/String;

    .line 890
    .line 891
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 892
    .line 893
    .line 894
    move-result v2

    .line 895
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    new-instance v5, Lm5/j;

    .line 900
    .line 901
    invoke-direct {v5, v1, v2}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 902
    .line 903
    .line 904
    goto :goto_14

    .line 905
    :cond_28
    move-object/from16 v5, v18

    .line 906
    .line 907
    :goto_14
    return-object v5

    .line 908
    nop

    .line 909
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
