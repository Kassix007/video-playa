.class public final LJ/f;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LJ/g;


# direct methods
.method public synthetic constructor <init>(LJ/g;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ/f;->q:I

    iput-object p1, p0, LJ/f;->r:LJ/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LJ/f;->q:I

    .line 4
    .line 5
    iget-object v2, v0, LJ/f;->r:LJ/g;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v3, v2, LJ/g;->O:LJ/e;

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iput-boolean v1, v3, LJ/e;->c:Z

    .line 26
    .line 27
    invoke-static {v2}, LB0/g;->n(LB0/A0;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, LB0/g;->m(LB0/z;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, LB0/g;->l(LB0/p;)V

    .line 34
    .line 35
    .line 36
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 37
    .line 38
    :goto_0
    return-object v1

    .line 39
    :pswitch_0
    move-object/from16 v1, p1

    .line 40
    .line 41
    check-cast v1, LL0/d;

    .line 42
    .line 43
    iget-object v4, v1, LL0/d;->r:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v1, v2, LJ/g;->O:LJ/e;

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iget-object v3, v1, LJ/e;->b:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v4, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    iput-object v4, v1, LJ/e;->b:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v1, v1, LJ/e;->d:LJ/d;

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    iget-object v3, v2, LJ/g;->F:LL0/F;

    .line 65
    .line 66
    iget-object v5, v2, LJ/g;->G:LO0/d;

    .line 67
    .line 68
    iget v6, v2, LJ/g;->H:I

    .line 69
    .line 70
    iget-boolean v7, v2, LJ/g;->I:Z

    .line 71
    .line 72
    iget v8, v2, LJ/g;->J:I

    .line 73
    .line 74
    iget v9, v2, LJ/g;->K:I

    .line 75
    .line 76
    iput-object v4, v1, LJ/d;->a:Ljava/lang/String;

    .line 77
    .line 78
    iput-object v3, v1, LJ/d;->b:LL0/F;

    .line 79
    .line 80
    iput-object v5, v1, LJ/d;->c:LO0/d;

    .line 81
    .line 82
    iput v6, v1, LJ/d;->d:I

    .line 83
    .line 84
    iput-boolean v7, v1, LJ/d;->e:Z

    .line 85
    .line 86
    iput v8, v1, LJ/d;->f:I

    .line 87
    .line 88
    iput v9, v1, LJ/d;->g:I

    .line 89
    .line 90
    invoke-virtual {v1}, LJ/d;->a()V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    new-instance v1, LJ/e;

    .line 95
    .line 96
    iget-object v3, v2, LJ/g;->E:Ljava/lang/String;

    .line 97
    .line 98
    invoke-direct {v1, v3, v4}, LJ/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    new-instance v3, LJ/d;

    .line 102
    .line 103
    iget-object v5, v2, LJ/g;->F:LL0/F;

    .line 104
    .line 105
    iget-object v6, v2, LJ/g;->G:LO0/d;

    .line 106
    .line 107
    iget v7, v2, LJ/g;->H:I

    .line 108
    .line 109
    iget-boolean v8, v2, LJ/g;->I:Z

    .line 110
    .line 111
    iget v9, v2, LJ/g;->J:I

    .line 112
    .line 113
    iget v10, v2, LJ/g;->K:I

    .line 114
    .line 115
    invoke-direct/range {v3 .. v10}, LJ/d;-><init>(Ljava/lang/String;LL0/F;LO0/d;IZII)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, LJ/g;->x0()LJ/d;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    iget-object v4, v4, LJ/d;->i:LW0/c;

    .line 123
    .line 124
    invoke-virtual {v3, v4}, LJ/d;->b(LW0/c;)V

    .line 125
    .line 126
    .line 127
    iput-object v3, v1, LJ/e;->d:LJ/d;

    .line 128
    .line 129
    iput-object v1, v2, LJ/g;->O:LJ/e;

    .line 130
    .line 131
    :cond_3
    :goto_1
    invoke-static {v2}, LB0/g;->n(LB0/A0;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v2}, LB0/g;->m(LB0/z;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v2}, LB0/g;->l(LB0/p;)V

    .line 138
    .line 139
    .line 140
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 141
    .line 142
    return-object v1

    .line 143
    :pswitch_1
    move-object/from16 v1, p1

    .line 144
    .line 145
    check-cast v1, Ljava/util/List;

    .line 146
    .line 147
    invoke-virtual {v2}, LJ/g;->x0()LJ/d;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    iget-object v4, v2, LJ/g;->F:LL0/F;

    .line 152
    .line 153
    sget-wide v5, Lj0/o;->g:J

    .line 154
    .line 155
    const-wide/16 v13, 0x0

    .line 156
    .line 157
    const v15, 0xfffffe

    .line 158
    .line 159
    .line 160
    const-wide/16 v7, 0x0

    .line 161
    .line 162
    const/4 v9, 0x0

    .line 163
    const-wide/16 v10, 0x0

    .line 164
    .line 165
    const/4 v12, 0x0

    .line 166
    invoke-static/range {v4 .. v15}, LL0/F;->c(LL0/F;JJLO0/j;JIJI)LL0/F;

    .line 167
    .line 168
    .line 169
    move-result-object v18

    .line 170
    iget-object v2, v3, LJ/d;->o:LW0/l;

    .line 171
    .line 172
    const/4 v5, 0x0

    .line 173
    const/4 v6, 0x1

    .line 174
    if-nez v2, :cond_4

    .line 175
    .line 176
    :goto_2
    move-object/from16 v29, v1

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    const/4 v14, 0x0

    .line 180
    goto/16 :goto_22

    .line 181
    .line 182
    :cond_4
    iget-object v13, v3, LJ/d;->i:LW0/c;

    .line 183
    .line 184
    if-nez v13, :cond_5

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_5
    new-instance v7, LL0/d;

    .line 188
    .line 189
    iget-object v8, v3, LJ/d;->a:Ljava/lang/String;

    .line 190
    .line 191
    invoke-direct {v7, v8}, LL0/d;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-object v8, v3, LJ/d;->j:LL0/a;

    .line 195
    .line 196
    if-nez v8, :cond_6

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_6
    iget-object v8, v3, LJ/d;->n:LL0/p;

    .line 200
    .line 201
    if-nez v8, :cond_7

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_7
    iget-wide v8, v3, LJ/d;->p:J

    .line 205
    .line 206
    const-wide v10, -0x1fffffffdL

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    and-long v26, v8, v10

    .line 212
    .line 213
    new-instance v14, LL0/C;

    .line 214
    .line 215
    new-instance v16, LL0/B;

    .line 216
    .line 217
    iget v8, v3, LJ/d;->f:I

    .line 218
    .line 219
    iget-boolean v9, v3, LJ/d;->e:Z

    .line 220
    .line 221
    iget v10, v3, LJ/d;->d:I

    .line 222
    .line 223
    iget-object v12, v3, LJ/d;->c:LO0/d;

    .line 224
    .line 225
    sget-object v19, Ln5/s;->q:Ln5/s;

    .line 226
    .line 227
    move-object/from16 v24, v2

    .line 228
    .line 229
    move-object/from16 v17, v7

    .line 230
    .line 231
    move/from16 v20, v8

    .line 232
    .line 233
    move/from16 v21, v9

    .line 234
    .line 235
    move/from16 v22, v10

    .line 236
    .line 237
    move-object/from16 v25, v12

    .line 238
    .line 239
    move-object/from16 v23, v13

    .line 240
    .line 241
    invoke-direct/range {v16 .. v27}, LL0/B;-><init>(LL0/d;LL0/F;Ljava/util/List;IZILW0/c;LW0/l;LO0/d;J)V

    .line 242
    .line 243
    .line 244
    move-object/from16 v15, v17

    .line 245
    .line 246
    move-object/from16 v2, v18

    .line 247
    .line 248
    move-object/from16 v7, v19

    .line 249
    .line 250
    new-instance v8, LE/a0;

    .line 251
    .line 252
    new-instance v9, LL0/l;

    .line 253
    .line 254
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 255
    .line 256
    .line 257
    iput-object v15, v9, LL0/l;->b:Ljava/lang/Object;

    .line 258
    .line 259
    iput-object v7, v9, LL0/l;->c:Ljava/lang/Object;

    .line 260
    .line 261
    new-instance v7, LL0/k;

    .line 262
    .line 263
    invoke-direct {v7, v9, v6}, LL0/k;-><init>(LL0/l;I)V

    .line 264
    .line 265
    .line 266
    sget-object v10, Lm5/i;->r:Lm5/i;

    .line 267
    .line 268
    invoke-static {v10, v7}, Lm5/a;->c(Lm5/i;LB5/a;)Lm5/h;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    iput-object v7, v9, LL0/l;->d:Ljava/lang/Object;

    .line 273
    .line 274
    new-instance v7, LL0/k;

    .line 275
    .line 276
    invoke-direct {v7, v9, v5}, LL0/k;-><init>(LL0/l;I)V

    .line 277
    .line 278
    .line 279
    invoke-static {v10, v7}, Lm5/a;->c(Lm5/i;LB5/a;)Lm5/h;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    iput-object v7, v9, LL0/l;->e:Ljava/lang/Object;

    .line 284
    .line 285
    iget-object v7, v2, LL0/F;->b:LL0/q;

    .line 286
    .line 287
    sget v10, LL0/e;->a:I

    .line 288
    .line 289
    sget-object v17, Ln5/s;->q:Ln5/s;

    .line 290
    .line 291
    iget-object v10, v15, LL0/d;->t:Ljava/util/ArrayList;

    .line 292
    .line 293
    if-eqz v10, :cond_8

    .line 294
    .line 295
    new-instance v11, LI2/A;

    .line 296
    .line 297
    const/4 v12, 0x3

    .line 298
    invoke-direct {v11, v12}, LI2/A;-><init>(I)V

    .line 299
    .line 300
    .line 301
    invoke-static {v10, v11}, Ln5/l;->x0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object v10

    .line 305
    goto :goto_3

    .line 306
    :cond_8
    move-object/from16 v10, v17

    .line 307
    .line 308
    :goto_3
    new-instance v11, Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 311
    .line 312
    .line 313
    new-instance v12, Ln5/j;

    .line 314
    .line 315
    invoke-direct {v12}, Ln5/j;-><init>()V

    .line 316
    .line 317
    .line 318
    move-object v13, v10

    .line 319
    check-cast v13, Ljava/util/Collection;

    .line 320
    .line 321
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    move v6, v5

    .line 326
    move/from16 v18, v6

    .line 327
    .line 328
    :goto_4
    if-ge v6, v13, :cond_12

    .line 329
    .line 330
    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v19

    .line 334
    move-object/from16 v4, v19

    .line 335
    .line 336
    check-cast v4, LL0/c;

    .line 337
    .line 338
    iget-object v5, v4, LL0/c;->a:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v5, LL0/q;

    .line 341
    .line 342
    invoke-virtual {v7, v5}, LL0/q;->a(LL0/q;)LL0/q;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    iget v0, v4, LL0/c;->b:I

    .line 347
    .line 348
    iget v4, v4, LL0/c;->c:I

    .line 349
    .line 350
    if-gt v0, v4, :cond_9

    .line 351
    .line 352
    goto :goto_5

    .line 353
    :cond_9
    const-string v21, "Reversed range is not supported"

    .line 354
    .line 355
    invoke-static/range {v21 .. v21}, LQ0/a;->a(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    :goto_5
    move/from16 v21, v6

    .line 359
    .line 360
    move/from16 v6, v18

    .line 361
    .line 362
    :goto_6
    if-ge v6, v0, :cond_c

    .line 363
    .line 364
    invoke-virtual {v12}, Ln5/j;->isEmpty()Z

    .line 365
    .line 366
    .line 367
    move-result v18

    .line 368
    if-nez v18, :cond_c

    .line 369
    .line 370
    invoke-virtual {v12}, Ln5/j;->last()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v18

    .line 374
    move-object/from16 v22, v8

    .line 375
    .line 376
    move-object/from16 v8, v18

    .line 377
    .line 378
    check-cast v8, LL0/c;

    .line 379
    .line 380
    move-object/from16 v24, v10

    .line 381
    .line 382
    iget v10, v8, LL0/c;->c:I

    .line 383
    .line 384
    move/from16 v28, v13

    .line 385
    .line 386
    iget-object v13, v8, LL0/c;->a:Ljava/lang/Object;

    .line 387
    .line 388
    if-ge v0, v10, :cond_a

    .line 389
    .line 390
    new-instance v8, LL0/c;

    .line 391
    .line 392
    invoke-direct {v8, v6, v0, v13}, LL0/c;-><init>(IILjava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move v6, v0

    .line 399
    move-object/from16 v8, v22

    .line 400
    .line 401
    move-object/from16 v10, v24

    .line 402
    .line 403
    move/from16 v13, v28

    .line 404
    .line 405
    goto :goto_6

    .line 406
    :cond_a
    move-object/from16 v29, v1

    .line 407
    .line 408
    new-instance v1, LL0/c;

    .line 409
    .line 410
    invoke-direct {v1, v6, v10, v13}, LL0/c;-><init>(IILjava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    iget v6, v8, LL0/c;->c:I

    .line 417
    .line 418
    :goto_7
    invoke-virtual {v12}, Ln5/j;->isEmpty()Z

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-nez v1, :cond_b

    .line 423
    .line 424
    invoke-virtual {v12}, Ln5/j;->last()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    check-cast v1, LL0/c;

    .line 429
    .line 430
    iget v1, v1, LL0/c;->c:I

    .line 431
    .line 432
    if-ne v6, v1, :cond_b

    .line 433
    .line 434
    invoke-virtual {v12}, Ln5/j;->removeLast()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    goto :goto_7

    .line 438
    :cond_b
    move-object/from16 v8, v22

    .line 439
    .line 440
    move-object/from16 v10, v24

    .line 441
    .line 442
    move/from16 v13, v28

    .line 443
    .line 444
    move-object/from16 v1, v29

    .line 445
    .line 446
    goto :goto_6

    .line 447
    :cond_c
    move-object/from16 v29, v1

    .line 448
    .line 449
    move-object/from16 v22, v8

    .line 450
    .line 451
    move-object/from16 v24, v10

    .line 452
    .line 453
    move/from16 v28, v13

    .line 454
    .line 455
    if-ge v6, v0, :cond_d

    .line 456
    .line 457
    new-instance v1, LL0/c;

    .line 458
    .line 459
    invoke-direct {v1, v6, v0, v7}, LL0/c;-><init>(IILjava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move/from16 v18, v0

    .line 466
    .line 467
    goto :goto_8

    .line 468
    :cond_d
    move/from16 v18, v6

    .line 469
    .line 470
    :goto_8
    invoke-virtual {v12}, Ln5/j;->l()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    check-cast v1, LL0/c;

    .line 475
    .line 476
    if-eqz v1, :cond_11

    .line 477
    .line 478
    iget v6, v1, LL0/c;->c:I

    .line 479
    .line 480
    iget-object v8, v1, LL0/c;->a:Ljava/lang/Object;

    .line 481
    .line 482
    iget v1, v1, LL0/c;->b:I

    .line 483
    .line 484
    if-ne v1, v0, :cond_e

    .line 485
    .line 486
    if-ne v6, v4, :cond_e

    .line 487
    .line 488
    invoke-virtual {v12}, Ln5/j;->removeLast()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    new-instance v1, LL0/c;

    .line 492
    .line 493
    check-cast v8, LL0/q;

    .line 494
    .line 495
    invoke-virtual {v8, v5}, LL0/q;->a(LL0/q;)LL0/q;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    invoke-direct {v1, v0, v4, v5}, LL0/c;-><init>(IILjava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v1}, Ln5/j;->addLast(Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    goto :goto_9

    .line 506
    :cond_e
    if-ne v1, v6, :cond_f

    .line 507
    .line 508
    new-instance v10, LL0/c;

    .line 509
    .line 510
    invoke-direct {v10, v1, v6, v8}, LL0/c;-><init>(IILjava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12}, Ln5/j;->removeLast()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    new-instance v1, LL0/c;

    .line 520
    .line 521
    invoke-direct {v1, v0, v4, v5}, LL0/c;-><init>(IILjava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v1}, Ln5/j;->addLast(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    goto :goto_9

    .line 528
    :cond_f
    if-lt v6, v4, :cond_10

    .line 529
    .line 530
    new-instance v1, LL0/c;

    .line 531
    .line 532
    check-cast v8, LL0/q;

    .line 533
    .line 534
    invoke-virtual {v8, v5}, LL0/q;->a(LL0/q;)LL0/q;

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    invoke-direct {v1, v0, v4, v5}, LL0/c;-><init>(IILjava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12, v1}, Ln5/j;->addLast(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    goto :goto_9

    .line 545
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 546
    .line 547
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 548
    .line 549
    .line 550
    throw v0

    .line 551
    :cond_11
    new-instance v1, LL0/c;

    .line 552
    .line 553
    invoke-direct {v1, v0, v4, v5}, LL0/c;-><init>(IILjava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v1}, Ln5/j;->addLast(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    :goto_9
    add-int/lit8 v6, v21, 0x1

    .line 560
    .line 561
    move-object/from16 v0, p0

    .line 562
    .line 563
    move-object/from16 v8, v22

    .line 564
    .line 565
    move-object/from16 v10, v24

    .line 566
    .line 567
    move/from16 v13, v28

    .line 568
    .line 569
    move-object/from16 v1, v29

    .line 570
    .line 571
    const/4 v5, 0x0

    .line 572
    goto/16 :goto_4

    .line 573
    .line 574
    :cond_12
    move-object/from16 v29, v1

    .line 575
    .line 576
    move-object/from16 v22, v8

    .line 577
    .line 578
    move/from16 v0, v18

    .line 579
    .line 580
    :goto_a
    iget-object v1, v15, LL0/d;->r:Ljava/lang/String;

    .line 581
    .line 582
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 583
    .line 584
    .line 585
    move-result v4

    .line 586
    if-gt v0, v4, :cond_14

    .line 587
    .line 588
    invoke-virtual {v12}, Ln5/j;->isEmpty()Z

    .line 589
    .line 590
    .line 591
    move-result v4

    .line 592
    if-nez v4, :cond_14

    .line 593
    .line 594
    invoke-virtual {v12}, Ln5/j;->last()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    check-cast v1, LL0/c;

    .line 599
    .line 600
    new-instance v4, LL0/c;

    .line 601
    .line 602
    iget-object v5, v1, LL0/c;->a:Ljava/lang/Object;

    .line 603
    .line 604
    iget v1, v1, LL0/c;->c:I

    .line 605
    .line 606
    invoke-direct {v4, v0, v1, v5}, LL0/c;-><init>(IILjava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    :goto_b
    invoke-virtual {v12}, Ln5/j;->isEmpty()Z

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    if-nez v0, :cond_13

    .line 617
    .line 618
    invoke-virtual {v12}, Ln5/j;->last()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    check-cast v0, LL0/c;

    .line 623
    .line 624
    iget v0, v0, LL0/c;->c:I

    .line 625
    .line 626
    if-ne v1, v0, :cond_13

    .line 627
    .line 628
    invoke-virtual {v12}, Ln5/j;->removeLast()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    goto :goto_b

    .line 632
    :cond_13
    move v0, v1

    .line 633
    goto :goto_a

    .line 634
    :cond_14
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 635
    .line 636
    .line 637
    move-result v4

    .line 638
    if-ge v0, v4, :cond_15

    .line 639
    .line 640
    new-instance v4, LL0/c;

    .line 641
    .line 642
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 643
    .line 644
    .line 645
    move-result v5

    .line 646
    invoke-direct {v4, v0, v5, v7}, LL0/c;-><init>(IILjava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    :cond_15
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    if-eqz v0, :cond_16

    .line 657
    .line 658
    new-instance v0, LL0/c;

    .line 659
    .line 660
    const/4 v4, 0x0

    .line 661
    invoke-direct {v0, v4, v4, v7}, LL0/c;-><init>(IILjava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    goto :goto_c

    .line 668
    :cond_16
    const/4 v4, 0x0

    .line 669
    :goto_c
    new-instance v0, Ljava/util/ArrayList;

    .line 670
    .line 671
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 679
    .line 680
    .line 681
    move-result v5

    .line 682
    move v6, v4

    .line 683
    :goto_d
    if-ge v6, v5, :cond_24

    .line 684
    .line 685
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v8

    .line 689
    check-cast v8, LL0/c;

    .line 690
    .line 691
    iget v10, v8, LL0/c;->b:I

    .line 692
    .line 693
    iget v12, v8, LL0/c;->c:I

    .line 694
    .line 695
    new-instance v13, LL0/d;

    .line 696
    .line 697
    if-eq v10, v12, :cond_17

    .line 698
    .line 699
    invoke-virtual {v1, v10, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v4

    .line 703
    move-object/from16 v18, v1

    .line 704
    .line 705
    const-string v1, "substring(...)"

    .line 706
    .line 707
    invoke-static {v4, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    goto :goto_e

    .line 711
    :cond_17
    move-object/from16 v18, v1

    .line 712
    .line 713
    const-string v4, ""

    .line 714
    .line 715
    :goto_e
    if-ne v10, v12, :cond_18

    .line 716
    .line 717
    :goto_f
    move/from16 v21, v5

    .line 718
    .line 719
    move/from16 v24, v6

    .line 720
    .line 721
    move-object/from16 v28, v11

    .line 722
    .line 723
    move-object/from16 v32, v14

    .line 724
    .line 725
    move-object/from16 v34, v15

    .line 726
    .line 727
    const/4 v5, 0x0

    .line 728
    goto/16 :goto_13

    .line 729
    .line 730
    :cond_18
    iget-object v1, v15, LL0/d;->q:Ljava/util/List;

    .line 731
    .line 732
    if-nez v1, :cond_19

    .line 733
    .line 734
    goto :goto_f

    .line 735
    :cond_19
    move/from16 v21, v5

    .line 736
    .line 737
    if-nez v10, :cond_1c

    .line 738
    .line 739
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 740
    .line 741
    .line 742
    move-result v5

    .line 743
    if-lt v12, v5, :cond_1c

    .line 744
    .line 745
    new-instance v5, Ljava/util/ArrayList;

    .line 746
    .line 747
    move/from16 v24, v6

    .line 748
    .line 749
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 750
    .line 751
    .line 752
    move-result v6

    .line 753
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 754
    .line 755
    .line 756
    move-object v6, v1

    .line 757
    check-cast v6, Ljava/util/Collection;

    .line 758
    .line 759
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 760
    .line 761
    .line 762
    move-result v6

    .line 763
    move-object/from16 v28, v11

    .line 764
    .line 765
    const/4 v11, 0x0

    .line 766
    :goto_10
    if-ge v11, v6, :cond_1b

    .line 767
    .line 768
    move/from16 v30, v6

    .line 769
    .line 770
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v6

    .line 774
    move/from16 v31, v11

    .line 775
    .line 776
    move-object v11, v6

    .line 777
    check-cast v11, LL0/c;

    .line 778
    .line 779
    iget-object v11, v11, LL0/c;->a:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v11, LL0/b;

    .line 782
    .line 783
    instance-of v11, v11, LL0/q;

    .line 784
    .line 785
    if-nez v11, :cond_1a

    .line 786
    .line 787
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 788
    .line 789
    .line 790
    :cond_1a
    add-int/lit8 v11, v31, 0x1

    .line 791
    .line 792
    move/from16 v6, v30

    .line 793
    .line 794
    goto :goto_10

    .line 795
    :cond_1b
    move-object/from16 v32, v14

    .line 796
    .line 797
    move-object/from16 v34, v15

    .line 798
    .line 799
    goto :goto_13

    .line 800
    :cond_1c
    move/from16 v24, v6

    .line 801
    .line 802
    move-object/from16 v28, v11

    .line 803
    .line 804
    new-instance v5, Ljava/util/ArrayList;

    .line 805
    .line 806
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 807
    .line 808
    .line 809
    move-result v6

    .line 810
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 811
    .line 812
    .line 813
    move-object v6, v1

    .line 814
    check-cast v6, Ljava/util/Collection;

    .line 815
    .line 816
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 817
    .line 818
    .line 819
    move-result v6

    .line 820
    const/4 v11, 0x0

    .line 821
    :goto_11
    if-ge v11, v6, :cond_1b

    .line 822
    .line 823
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v30

    .line 827
    move-object/from16 v31, v1

    .line 828
    .line 829
    move-object/from16 v1, v30

    .line 830
    .line 831
    check-cast v1, LL0/c;

    .line 832
    .line 833
    move/from16 v30, v6

    .line 834
    .line 835
    iget-object v6, v1, LL0/c;->a:Ljava/lang/Object;

    .line 836
    .line 837
    move-object/from16 v32, v6

    .line 838
    .line 839
    iget v6, v1, LL0/c;->c:I

    .line 840
    .line 841
    move/from16 v33, v11

    .line 842
    .line 843
    iget v11, v1, LL0/c;->b:I

    .line 844
    .line 845
    move-object/from16 v34, v15

    .line 846
    .line 847
    move-object/from16 v15, v32

    .line 848
    .line 849
    check-cast v15, LL0/b;

    .line 850
    .line 851
    instance-of v15, v15, LL0/q;

    .line 852
    .line 853
    if-nez v15, :cond_1d

    .line 854
    .line 855
    invoke-static {v10, v12, v11, v6}, LL0/e;->a(IIII)Z

    .line 856
    .line 857
    .line 858
    move-result v15

    .line 859
    if-eqz v15, :cond_1d

    .line 860
    .line 861
    iget-object v15, v1, LL0/c;->d:Ljava/lang/String;

    .line 862
    .line 863
    iget-object v1, v1, LL0/c;->a:Ljava/lang/Object;

    .line 864
    .line 865
    check-cast v1, LL0/b;

    .line 866
    .line 867
    invoke-static {v11, v10, v12}, LD5/a;->q(III)I

    .line 868
    .line 869
    .line 870
    move-result v11

    .line 871
    sub-int/2addr v11, v10

    .line 872
    invoke-static {v6, v10, v12}, LD5/a;->q(III)I

    .line 873
    .line 874
    .line 875
    move-result v6

    .line 876
    sub-int/2addr v6, v10

    .line 877
    move-object/from16 v32, v14

    .line 878
    .line 879
    new-instance v14, LL0/c;

    .line 880
    .line 881
    invoke-direct {v14, v1, v11, v6, v15}, LL0/c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 885
    .line 886
    .line 887
    goto :goto_12

    .line 888
    :cond_1d
    move-object/from16 v32, v14

    .line 889
    .line 890
    :goto_12
    add-int/lit8 v11, v33, 0x1

    .line 891
    .line 892
    move/from16 v6, v30

    .line 893
    .line 894
    move-object/from16 v1, v31

    .line 895
    .line 896
    move-object/from16 v14, v32

    .line 897
    .line 898
    move-object/from16 v15, v34

    .line 899
    .line 900
    goto :goto_11

    .line 901
    :goto_13
    if-nez v5, :cond_1e

    .line 902
    .line 903
    move-object/from16 v5, v17

    .line 904
    .line 905
    :cond_1e
    invoke-direct {v13, v4, v5}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 906
    .line 907
    .line 908
    iget-object v1, v8, LL0/c;->a:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v1, LL0/q;

    .line 911
    .line 912
    iget v5, v1, LL0/q;->b:I

    .line 913
    .line 914
    const/high16 v6, -0x80000000

    .line 915
    .line 916
    if-ne v5, v6, :cond_1f

    .line 917
    .line 918
    iget v5, v7, LL0/q;->b:I

    .line 919
    .line 920
    iget v6, v1, LL0/q;->a:I

    .line 921
    .line 922
    iget-wide v14, v1, LL0/q;->c:J

    .line 923
    .line 924
    iget-object v8, v1, LL0/q;->d:LV0/r;

    .line 925
    .line 926
    iget-object v11, v1, LL0/q;->e:LL0/s;

    .line 927
    .line 928
    move-object/from16 v30, v4

    .line 929
    .line 930
    iget-object v4, v1, LL0/q;->f:LV0/i;

    .line 931
    .line 932
    move-object/from16 v42, v4

    .line 933
    .line 934
    iget v4, v1, LL0/q;->g:I

    .line 935
    .line 936
    move/from16 v43, v4

    .line 937
    .line 938
    iget v4, v1, LL0/q;->h:I

    .line 939
    .line 940
    iget-object v1, v1, LL0/q;->i:LV0/t;

    .line 941
    .line 942
    new-instance v35, LL0/q;

    .line 943
    .line 944
    move-object/from16 v45, v1

    .line 945
    .line 946
    move/from16 v44, v4

    .line 947
    .line 948
    move/from16 v37, v5

    .line 949
    .line 950
    move/from16 v36, v6

    .line 951
    .line 952
    move-object/from16 v40, v8

    .line 953
    .line 954
    move-object/from16 v41, v11

    .line 955
    .line 956
    move-wide/from16 v38, v14

    .line 957
    .line 958
    invoke-direct/range {v35 .. v45}, LL0/q;-><init>(IIJLV0/r;LL0/s;LV0/i;IILV0/t;)V

    .line 959
    .line 960
    .line 961
    move-object/from16 v1, v35

    .line 962
    .line 963
    goto :goto_14

    .line 964
    :cond_1f
    move-object/from16 v30, v4

    .line 965
    .line 966
    :goto_14
    new-instance v4, LL0/o;

    .line 967
    .line 968
    new-instance v5, LL0/F;

    .line 969
    .line 970
    iget-object v6, v2, LL0/F;->a:LL0/y;

    .line 971
    .line 972
    invoke-virtual {v7, v1}, LL0/q;->a(LL0/q;)LL0/q;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    invoke-direct {v5, v6, v1}, LL0/F;-><init>(LL0/y;LL0/q;)V

    .line 977
    .line 978
    .line 979
    iget-object v1, v13, LL0/d;->q:Ljava/util/List;

    .line 980
    .line 981
    if-nez v1, :cond_20

    .line 982
    .line 983
    move-object/from16 v1, v17

    .line 984
    .line 985
    :cond_20
    iget-object v6, v9, LL0/l;->c:Ljava/lang/Object;

    .line 986
    .line 987
    check-cast v6, Ljava/util/List;

    .line 988
    .line 989
    new-instance v11, Ljava/util/ArrayList;

    .line 990
    .line 991
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 992
    .line 993
    .line 994
    move-result v8

    .line 995
    invoke-direct {v11, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 996
    .line 997
    .line 998
    move-object v8, v6

    .line 999
    check-cast v8, Ljava/util/Collection;

    .line 1000
    .line 1001
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 1002
    .line 1003
    .line 1004
    move-result v8

    .line 1005
    const/4 v13, 0x0

    .line 1006
    :goto_15
    if-ge v13, v8, :cond_23

    .line 1007
    .line 1008
    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v14

    .line 1012
    check-cast v14, LL0/c;

    .line 1013
    .line 1014
    iget v15, v14, LL0/c;->b:I

    .line 1015
    .line 1016
    move-object/from16 v31, v1

    .line 1017
    .line 1018
    iget v1, v14, LL0/c;->c:I

    .line 1019
    .line 1020
    invoke-static {v10, v12, v15, v1}, LL0/e;->a(IIII)Z

    .line 1021
    .line 1022
    .line 1023
    move-result v33

    .line 1024
    if-eqz v33, :cond_22

    .line 1025
    .line 1026
    if-gt v10, v15, :cond_21

    .line 1027
    .line 1028
    if-gt v1, v12, :cond_21

    .line 1029
    .line 1030
    :goto_16
    move/from16 v33, v1

    .line 1031
    .line 1032
    goto :goto_17

    .line 1033
    :cond_21
    const-string v33, "placeholder can not overlap with paragraph."

    .line 1034
    .line 1035
    invoke-static/range {v33 .. v33}, LQ0/a;->a(Ljava/lang/String;)V

    .line 1036
    .line 1037
    .line 1038
    goto :goto_16

    .line 1039
    :goto_17
    new-instance v1, LL0/c;

    .line 1040
    .line 1041
    iget-object v14, v14, LL0/c;->a:Ljava/lang/Object;

    .line 1042
    .line 1043
    sub-int/2addr v15, v10

    .line 1044
    move-object/from16 v35, v2

    .line 1045
    .line 1046
    sub-int v2, v33, v10

    .line 1047
    .line 1048
    invoke-direct {v1, v15, v2, v14}, LL0/c;-><init>(IILjava/lang/Object;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1052
    .line 1053
    .line 1054
    goto :goto_18

    .line 1055
    :cond_22
    move-object/from16 v35, v2

    .line 1056
    .line 1057
    :goto_18
    add-int/lit8 v13, v13, 0x1

    .line 1058
    .line 1059
    move-object/from16 v1, v31

    .line 1060
    .line 1061
    move-object/from16 v2, v35

    .line 1062
    .line 1063
    goto :goto_15

    .line 1064
    :cond_23
    move-object/from16 v31, v1

    .line 1065
    .line 1066
    move-object/from16 v35, v2

    .line 1067
    .line 1068
    new-instance v1, LS0/d;

    .line 1069
    .line 1070
    move-object v2, v9

    .line 1071
    move-object v9, v5

    .line 1072
    move-object v5, v2

    .line 1073
    move-object v6, v7

    .line 1074
    move v14, v10

    .line 1075
    move v15, v12

    .line 1076
    move-object/from16 v2, v22

    .line 1077
    .line 1078
    move-object/from16 v13, v23

    .line 1079
    .line 1080
    move-object/from16 v12, v25

    .line 1081
    .line 1082
    move-object/from16 v8, v30

    .line 1083
    .line 1084
    move-object/from16 v10, v31

    .line 1085
    .line 1086
    move-object v7, v1

    .line 1087
    move-object/from16 v1, v16

    .line 1088
    .line 1089
    invoke-direct/range {v7 .. v13}, LS0/d;-><init>(Ljava/lang/String;LL0/F;Ljava/util/List;Ljava/util/List;LO0/d;LW0/c;)V

    .line 1090
    .line 1091
    .line 1092
    invoke-direct {v4, v7, v14, v15}, LL0/o;-><init>(LS0/d;II)V

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1096
    .line 1097
    .line 1098
    add-int/lit8 v4, v24, 0x1

    .line 1099
    .line 1100
    move-object v9, v5

    .line 1101
    move-object v7, v6

    .line 1102
    move-object/from16 v1, v18

    .line 1103
    .line 1104
    move/from16 v5, v21

    .line 1105
    .line 1106
    move-object/from16 v11, v28

    .line 1107
    .line 1108
    move-object/from16 v14, v32

    .line 1109
    .line 1110
    move-object/from16 v15, v34

    .line 1111
    .line 1112
    move-object/from16 v2, v35

    .line 1113
    .line 1114
    move v6, v4

    .line 1115
    const/4 v4, 0x0

    .line 1116
    goto/16 :goto_d

    .line 1117
    .line 1118
    :cond_24
    move-object v5, v9

    .line 1119
    move-object/from16 v32, v14

    .line 1120
    .line 1121
    move-object/from16 v1, v16

    .line 1122
    .line 1123
    move-object/from16 v2, v22

    .line 1124
    .line 1125
    iput-object v0, v5, LL0/l;->a:Ljava/lang/Object;

    .line 1126
    .line 1127
    iget v0, v3, LJ/d;->f:I

    .line 1128
    .line 1129
    iget v9, v3, LJ/d;->d:I

    .line 1130
    .line 1131
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1132
    .line 1133
    .line 1134
    iput-object v5, v2, LE/a0;->c:Ljava/lang/Object;

    .line 1135
    .line 1136
    iput v0, v2, LE/a0;->a:I

    .line 1137
    .line 1138
    invoke-static/range {v26 .. v27}, LW0/a;->j(J)I

    .line 1139
    .line 1140
    .line 1141
    move-result v0

    .line 1142
    if-nez v0, :cond_25

    .line 1143
    .line 1144
    invoke-static/range {v26 .. v27}, LW0/a;->i(J)I

    .line 1145
    .line 1146
    .line 1147
    move-result v0

    .line 1148
    if-nez v0, :cond_25

    .line 1149
    .line 1150
    goto :goto_19

    .line 1151
    :cond_25
    const-string v0, "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."

    .line 1152
    .line 1153
    invoke-static {v0}, LQ0/a;->a(Ljava/lang/String;)V

    .line 1154
    .line 1155
    .line 1156
    :goto_19
    new-instance v0, Ljava/util/ArrayList;

    .line 1157
    .line 1158
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1159
    .line 1160
    .line 1161
    iget-object v4, v5, LL0/l;->a:Ljava/lang/Object;

    .line 1162
    .line 1163
    check-cast v4, Ljava/util/ArrayList;

    .line 1164
    .line 1165
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1166
    .line 1167
    .line 1168
    move-result v5

    .line 1169
    const/4 v12, 0x0

    .line 1170
    move v14, v12

    .line 1171
    const/4 v13, 0x0

    .line 1172
    const/16 v37, 0x0

    .line 1173
    .line 1174
    :goto_1a
    if-ge v13, v5, :cond_29

    .line 1175
    .line 1176
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v6

    .line 1180
    move-object v15, v6

    .line 1181
    check-cast v15, LL0/o;

    .line 1182
    .line 1183
    iget-object v7, v15, LL0/o;->a:LS0/d;

    .line 1184
    .line 1185
    invoke-static/range {v26 .. v27}, LW0/a;->h(J)I

    .line 1186
    .line 1187
    .line 1188
    move-result v6

    .line 1189
    invoke-static/range {v26 .. v27}, LW0/a;->c(J)Z

    .line 1190
    .line 1191
    .line 1192
    move-result v8

    .line 1193
    if-eqz v8, :cond_26

    .line 1194
    .line 1195
    invoke-static/range {v26 .. v27}, LW0/a;->g(J)I

    .line 1196
    .line 1197
    .line 1198
    move-result v8

    .line 1199
    float-to-double v10, v14

    .line 1200
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 1201
    .line 1202
    .line 1203
    move-result-wide v10

    .line 1204
    double-to-float v10, v10

    .line 1205
    float-to-int v10, v10

    .line 1206
    sub-int/2addr v8, v10

    .line 1207
    if-gez v8, :cond_27

    .line 1208
    .line 1209
    const/4 v8, 0x0

    .line 1210
    goto :goto_1b

    .line 1211
    :cond_26
    invoke-static/range {v26 .. v27}, LW0/a;->g(J)I

    .line 1212
    .line 1213
    .line 1214
    move-result v8

    .line 1215
    :cond_27
    :goto_1b
    const/4 v10, 0x5

    .line 1216
    invoke-static {v6, v8, v10}, LW0/b;->b(III)J

    .line 1217
    .line 1218
    .line 1219
    move-result-wide v10

    .line 1220
    iget v6, v2, LE/a0;->a:I

    .line 1221
    .line 1222
    sub-int v8, v6, v37

    .line 1223
    .line 1224
    new-instance v34, LL0/a;

    .line 1225
    .line 1226
    move-object/from16 v6, v34

    .line 1227
    .line 1228
    invoke-direct/range {v6 .. v11}, LL0/a;-><init>(LS0/d;IIJ)V

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v6}, LL0/a;->b()F

    .line 1232
    .line 1233
    .line 1234
    move-result v7

    .line 1235
    add-float v40, v7, v14

    .line 1236
    .line 1237
    iget-object v7, v6, LL0/a;->d:LM0/j;

    .line 1238
    .line 1239
    iget v8, v7, LM0/j;->f:I

    .line 1240
    .line 1241
    add-int v38, v37, v8

    .line 1242
    .line 1243
    new-instance v33, LL0/n;

    .line 1244
    .line 1245
    iget v8, v15, LL0/o;->b:I

    .line 1246
    .line 1247
    iget v10, v15, LL0/o;->c:I

    .line 1248
    .line 1249
    move/from16 v35, v8

    .line 1250
    .line 1251
    move/from16 v36, v10

    .line 1252
    .line 1253
    move/from16 v39, v14

    .line 1254
    .line 1255
    invoke-direct/range {v33 .. v40}, LL0/n;-><init>(LL0/a;IIIIFF)V

    .line 1256
    .line 1257
    .line 1258
    move-object/from16 v8, v33

    .line 1259
    .line 1260
    move/from16 v6, v38

    .line 1261
    .line 1262
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1263
    .line 1264
    .line 1265
    iget-boolean v7, v7, LM0/j;->d:Z

    .line 1266
    .line 1267
    if-nez v7, :cond_2a

    .line 1268
    .line 1269
    iget v7, v2, LE/a0;->a:I

    .line 1270
    .line 1271
    if-ne v6, v7, :cond_28

    .line 1272
    .line 1273
    iget-object v7, v2, LE/a0;->c:Ljava/lang/Object;

    .line 1274
    .line 1275
    check-cast v7, LL0/l;

    .line 1276
    .line 1277
    iget-object v7, v7, LL0/l;->a:Ljava/lang/Object;

    .line 1278
    .line 1279
    check-cast v7, Ljava/util/ArrayList;

    .line 1280
    .line 1281
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 1282
    .line 1283
    .line 1284
    move-result v7

    .line 1285
    if-eq v13, v7, :cond_28

    .line 1286
    .line 1287
    goto :goto_1c

    .line 1288
    :cond_28
    add-int/lit8 v13, v13, 0x1

    .line 1289
    .line 1290
    move/from16 v37, v6

    .line 1291
    .line 1292
    move/from16 v14, v40

    .line 1293
    .line 1294
    goto :goto_1a

    .line 1295
    :cond_29
    move/from16 v6, v37

    .line 1296
    .line 1297
    :cond_2a
    :goto_1c
    iput v6, v2, LE/a0;->b:I

    .line 1298
    .line 1299
    iput-object v0, v2, LE/a0;->e:Ljava/lang/Object;

    .line 1300
    .line 1301
    new-instance v4, Ljava/util/ArrayList;

    .line 1302
    .line 1303
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1304
    .line 1305
    .line 1306
    move-result v5

    .line 1307
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1311
    .line 1312
    .line 1313
    move-result v5

    .line 1314
    const/4 v6, 0x0

    .line 1315
    :goto_1d
    if-ge v6, v5, :cond_2d

    .line 1316
    .line 1317
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v7

    .line 1321
    check-cast v7, LL0/n;

    .line 1322
    .line 1323
    iget-object v8, v7, LL0/n;->a:LL0/a;

    .line 1324
    .line 1325
    iget-object v8, v8, LL0/a;->f:Ljava/lang/Object;

    .line 1326
    .line 1327
    new-instance v9, Ljava/util/ArrayList;

    .line 1328
    .line 1329
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1330
    .line 1331
    .line 1332
    move-result v10

    .line 1333
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 1334
    .line 1335
    .line 1336
    move-object v10, v8

    .line 1337
    check-cast v10, Ljava/util/Collection;

    .line 1338
    .line 1339
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 1340
    .line 1341
    .line 1342
    move-result v10

    .line 1343
    const/4 v11, 0x0

    .line 1344
    :goto_1e
    if-ge v11, v10, :cond_2c

    .line 1345
    .line 1346
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v13

    .line 1350
    check-cast v13, Li0/c;

    .line 1351
    .line 1352
    if-eqz v13, :cond_2b

    .line 1353
    .line 1354
    iget v14, v7, LL0/n;->f:F

    .line 1355
    .line 1356
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1357
    .line 1358
    .line 1359
    move-result v15

    .line 1360
    move-object/from16 v17, v13

    .line 1361
    .line 1362
    int-to-long v12, v15

    .line 1363
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1364
    .line 1365
    .line 1366
    move-result v14

    .line 1367
    int-to-long v14, v14

    .line 1368
    const/16 v18, 0x20

    .line 1369
    .line 1370
    shl-long v12, v12, v18

    .line 1371
    .line 1372
    const-wide v21, 0xffffffffL

    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    and-long v14, v14, v21

    .line 1378
    .line 1379
    or-long/2addr v12, v14

    .line 1380
    move-object/from16 v14, v17

    .line 1381
    .line 1382
    invoke-virtual {v14, v12, v13}, Li0/c;->e(J)Li0/c;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v12

    .line 1386
    goto :goto_1f

    .line 1387
    :cond_2b
    const/4 v12, 0x0

    .line 1388
    :goto_1f
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1389
    .line 1390
    .line 1391
    add-int/lit8 v11, v11, 0x1

    .line 1392
    .line 1393
    const/4 v12, 0x0

    .line 1394
    goto :goto_1e

    .line 1395
    :cond_2c
    invoke-static {v4, v9}, Ln5/q;->e0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1396
    .line 1397
    .line 1398
    add-int/lit8 v6, v6, 0x1

    .line 1399
    .line 1400
    const/4 v12, 0x0

    .line 1401
    goto :goto_1d

    .line 1402
    :cond_2d
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1403
    .line 1404
    .line 1405
    move-result v0

    .line 1406
    iget-object v5, v2, LE/a0;->c:Ljava/lang/Object;

    .line 1407
    .line 1408
    check-cast v5, LL0/l;

    .line 1409
    .line 1410
    iget-object v5, v5, LL0/l;->c:Ljava/lang/Object;

    .line 1411
    .line 1412
    check-cast v5, Ljava/util/List;

    .line 1413
    .line 1414
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1415
    .line 1416
    .line 1417
    move-result v5

    .line 1418
    if-ge v0, v5, :cond_2f

    .line 1419
    .line 1420
    iget-object v0, v2, LE/a0;->c:Ljava/lang/Object;

    .line 1421
    .line 1422
    check-cast v0, LL0/l;

    .line 1423
    .line 1424
    iget-object v0, v0, LL0/l;->c:Ljava/lang/Object;

    .line 1425
    .line 1426
    check-cast v0, Ljava/util/List;

    .line 1427
    .line 1428
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1429
    .line 1430
    .line 1431
    move-result v0

    .line 1432
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1433
    .line 1434
    .line 1435
    move-result v5

    .line 1436
    sub-int/2addr v0, v5

    .line 1437
    new-instance v5, Ljava/util/ArrayList;

    .line 1438
    .line 1439
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1440
    .line 1441
    .line 1442
    const/4 v6, 0x0

    .line 1443
    :goto_20
    const/4 v7, 0x0

    .line 1444
    if-ge v6, v0, :cond_2e

    .line 1445
    .line 1446
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1447
    .line 1448
    .line 1449
    add-int/lit8 v6, v6, 0x1

    .line 1450
    .line 1451
    goto :goto_20

    .line 1452
    :cond_2e
    invoke-static {v4, v5}, Ln5/l;->u0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v4

    .line 1456
    goto :goto_21

    .line 1457
    :cond_2f
    const/4 v7, 0x0

    .line 1458
    :goto_21
    iput-object v4, v2, LE/a0;->d:Ljava/lang/Object;

    .line 1459
    .line 1460
    iget-wide v3, v3, LJ/d;->l:J

    .line 1461
    .line 1462
    move-object/from16 v0, v32

    .line 1463
    .line 1464
    invoke-direct {v0, v1, v2, v3, v4}, LL0/C;-><init>(LL0/B;LE/a0;J)V

    .line 1465
    .line 1466
    .line 1467
    move-object v14, v0

    .line 1468
    :goto_22
    if-eqz v14, :cond_30

    .line 1469
    .line 1470
    move-object/from16 v0, v29

    .line 1471
    .line 1472
    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1473
    .line 1474
    .line 1475
    move-object v4, v14

    .line 1476
    goto :goto_23

    .line 1477
    :cond_30
    move-object v4, v7

    .line 1478
    :goto_23
    if-eqz v4, :cond_31

    .line 1479
    .line 1480
    const/4 v5, 0x1

    .line 1481
    goto :goto_24

    .line 1482
    :cond_31
    const/4 v5, 0x0

    .line 1483
    :goto_24
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v0

    .line 1487
    return-object v0

    .line 1488
    nop

    .line 1489
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
