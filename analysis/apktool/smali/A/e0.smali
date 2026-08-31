.class public final LA/e0;
.super Lkotlin/jvm/internal/n;
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
    iput p2, p0, LA/e0;->q:I

    iput-object p3, p0, LA/e0;->r:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, LA/e0;->q:I

    iput-object p2, p0, LA/e0;->r:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LB5/e;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, LA/e0;->q:I

    .line 3
    check-cast p1, Lkotlin/jvm/internal/n;

    iput-object p1, p0, LA/e0;->r:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    iget v2, v1, LA/e0;->q:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p1

    .line 11
    .line 12
    check-cast v2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    check-cast v0, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v3, v1, LA/e0;->r:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lw/z0;

    .line 27
    .line 28
    invoke-virtual {v3}, Lc0/l;->l0()LM5/w;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v5, Lw/x0;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    invoke-direct {v5, v3, v2, v0, v6}, Lw/x0;-><init>(Lw/z0;FFLq5/c;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x3

    .line 39
    invoke-static {v4, v6, v6, v5, v0}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 40
    .line 41
    .line 42
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_0
    move-object/from16 v2, p1

    .line 46
    .line 47
    check-cast v2, LP/o;

    .line 48
    .line 49
    check-cast v0, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 52
    .line 53
    .line 54
    iget-object v0, v1, LA/e0;->r:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lu/H;

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    invoke-static {v3}, LP/b;->w(I)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-virtual {v0, v3, v2}, Lu/H;->a(ILP/o;)V

    .line 64
    .line 65
    .line 66
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_1
    move-object/from16 v2, p1

    .line 70
    .line 71
    check-cast v2, Lt/t;

    .line 72
    .line 73
    check-cast v0, Lt/t;

    .line 74
    .line 75
    sget-object v3, Lt/t;->s:Lt/t;

    .line 76
    .line 77
    if-ne v2, v3, :cond_0

    .line 78
    .line 79
    if-ne v0, v3, :cond_0

    .line 80
    .line 81
    iget-object v0, v1, LA/e0;->r:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lt/E;

    .line 84
    .line 85
    iget-object v0, v0, Lt/E;->a:Lt/L;

    .line 86
    .line 87
    iget-boolean v0, v0, Lt/L;->b:Z

    .line 88
    .line 89
    if-nez v0, :cond_0

    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    const/4 v0, 0x0

    .line 94
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0

    .line 99
    :pswitch_2
    move-object/from16 v2, p1

    .line 100
    .line 101
    check-cast v2, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    check-cast v0, LI0/m;

    .line 108
    .line 109
    iget-object v3, v1, LA/e0;->r:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Le0/c;

    .line 112
    .line 113
    invoke-virtual {v3, v2, v0}, Le0/c;->m(ILI0/m;)V

    .line 114
    .line 115
    .line 116
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_3
    move-object/from16 v2, p1

    .line 120
    .line 121
    check-cast v2, Lc0/m;

    .line 122
    .line 123
    check-cast v0, Lc0/k;

    .line 124
    .line 125
    iget-object v3, v1, LA/e0;->r:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v3, LP/o;

    .line 128
    .line 129
    instance-of v4, v0, Lc0/h;

    .line 130
    .line 131
    if-eqz v4, :cond_1

    .line 132
    .line 133
    check-cast v0, Lc0/h;

    .line 134
    .line 135
    iget-object v0, v0, Lc0/h;->q:Lkotlin/jvm/internal/n;

    .line 136
    .line 137
    const/4 v4, 0x3

    .line 138
    invoke-static {v4, v0}, Lkotlin/jvm/internal/B;->b(ILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    sget-object v4, Lc0/j;->q:Lc0/j;

    .line 142
    .line 143
    const/4 v5, 0x0

    .line 144
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-interface {v0, v4, v3, v5}, LB5/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Lc0/m;

    .line 153
    .line 154
    invoke-static {v3, v0}, Lc0/o;->b(LP/o;Lc0/m;)Lc0/m;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    :cond_1
    invoke-interface {v2, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0

    .line 163
    :pswitch_4
    move-object/from16 v2, p1

    .line 164
    .line 165
    check-cast v2, Ljava/util/Set;

    .line 166
    .line 167
    check-cast v0, La0/h;

    .line 168
    .line 169
    iget-object v0, v1, LA/e0;->r:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, La0/t;

    .line 172
    .line 173
    iget-object v3, v0, La0/t;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 174
    .line 175
    :goto_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    if-nez v4, :cond_2

    .line 180
    .line 181
    move-object v5, v2

    .line 182
    check-cast v5, Ljava/util/Collection;

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_2
    instance-of v5, v4, Ljava/util/Set;

    .line 186
    .line 187
    if-eqz v5, :cond_3

    .line 188
    .line 189
    const/4 v5, 0x2

    .line 190
    new-array v5, v5, [Ljava/util/Set;

    .line 191
    .line 192
    const/4 v6, 0x0

    .line 193
    aput-object v4, v5, v6

    .line 194
    .line 195
    const/4 v6, 0x1

    .line 196
    aput-object v2, v5, v6

    .line 197
    .line 198
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/n2;->A([Ljava/lang/Object;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    check-cast v5, Ljava/util/Collection;

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_3
    instance-of v5, v4, Ljava/util/List;

    .line 206
    .line 207
    if-eqz v5, :cond_7

    .line 208
    .line 209
    move-object v5, v4

    .line 210
    check-cast v5, Ljava/util/Collection;

    .line 211
    .line 212
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    check-cast v6, Ljava/lang/Iterable;

    .line 217
    .line 218
    invoke-static {v5, v6}, Ln5/l;->u0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    :cond_4
    :goto_2
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-eqz v6, :cond_6

    .line 227
    .line 228
    invoke-static {v0}, La0/t;->a(La0/t;)Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-eqz v2, :cond_5

    .line 233
    .line 234
    iget-object v2, v0, La0/t;->a:Lkotlin/jvm/internal/n;

    .line 235
    .line 236
    new-instance v3, LA0/d;

    .line 237
    .line 238
    const/16 v4, 0x11

    .line 239
    .line 240
    invoke-direct {v3, v4, v0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v2, v3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    :cond_5
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 247
    .line 248
    return-object v0

    .line 249
    :cond_6
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    if-eq v6, v4, :cond_4

    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_7
    const-string v0, "Unexpected notification"

    .line 257
    .line 258
    invoke-static {v0}, LP/p;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 259
    .line 260
    .line 261
    new-instance v0, LC2/e;

    .line 262
    .line 263
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 264
    .line 265
    .line 266
    throw v0

    .line 267
    :pswitch_5
    move-object/from16 v2, p1

    .line 268
    .line 269
    check-cast v2, LZ/b;

    .line 270
    .line 271
    iget-object v3, v1, LA/e0;->r:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v3, Lkotlin/jvm/internal/n;

    .line 274
    .line 275
    invoke-interface {v3, v2, v0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    check-cast v0, Ljava/util/List;

    .line 280
    .line 281
    move-object v3, v0

    .line 282
    check-cast v3, Ljava/util/Collection;

    .line 283
    .line 284
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    const/4 v5, 0x0

    .line 289
    :goto_3
    if-ge v5, v4, :cond_a

    .line 290
    .line 291
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    if-eqz v6, :cond_9

    .line 296
    .line 297
    iget-object v7, v2, LZ/b;->r:LZ/i;

    .line 298
    .line 299
    if-eqz v7, :cond_9

    .line 300
    .line 301
    invoke-interface {v7, v6}, LZ/i;->a(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-eqz v6, :cond_8

    .line 306
    .line 307
    goto :goto_4

    .line 308
    :cond_8
    const-string v0, "item can\'t be saved"

    .line 309
    .line 310
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 311
    .line 312
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    throw v2

    .line 316
    :cond_9
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 317
    .line 318
    goto :goto_3

    .line 319
    :cond_a
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-nez v0, :cond_b

    .line 324
    .line 325
    new-instance v0, Ljava/util/ArrayList;

    .line 326
    .line 327
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 328
    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_b
    const/4 v0, 0x0

    .line 332
    :goto_5
    return-object v0

    .line 333
    :pswitch_6
    move-object/from16 v2, p1

    .line 334
    .line 335
    check-cast v2, Ljava/util/Set;

    .line 336
    .line 337
    check-cast v0, La0/h;

    .line 338
    .line 339
    instance-of v0, v2, LR/h;

    .line 340
    .line 341
    const/4 v3, 0x4

    .line 342
    if-eqz v0, :cond_f

    .line 343
    .line 344
    move-object v0, v2

    .line 345
    check-cast v0, LR/h;

    .line 346
    .line 347
    iget-object v0, v0, LR/h;->q:Lr/H;

    .line 348
    .line 349
    iget-object v4, v0, Lr/H;->b:[Ljava/lang/Object;

    .line 350
    .line 351
    iget-object v0, v0, Lr/H;->a:[J

    .line 352
    .line 353
    array-length v5, v0

    .line 354
    add-int/lit8 v5, v5, -0x2

    .line 355
    .line 356
    if-ltz v5, :cond_13

    .line 357
    .line 358
    const/4 v6, 0x0

    .line 359
    move v7, v6

    .line 360
    :goto_6
    aget-wide v8, v0, v7

    .line 361
    .line 362
    not-long v10, v8

    .line 363
    const/4 v12, 0x7

    .line 364
    shl-long/2addr v10, v12

    .line 365
    and-long/2addr v10, v8

    .line 366
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    and-long/2addr v10, v12

    .line 372
    cmp-long v10, v10, v12

    .line 373
    .line 374
    if-eqz v10, :cond_e

    .line 375
    .line 376
    sub-int v10, v7, v5

    .line 377
    .line 378
    not-int v10, v10

    .line 379
    ushr-int/lit8 v10, v10, 0x1f

    .line 380
    .line 381
    const/16 v11, 0x8

    .line 382
    .line 383
    rsub-int/lit8 v10, v10, 0x8

    .line 384
    .line 385
    move v12, v6

    .line 386
    :goto_7
    if-ge v12, v10, :cond_d

    .line 387
    .line 388
    const-wide/16 v13, 0xff

    .line 389
    .line 390
    and-long/2addr v13, v8

    .line 391
    const-wide/16 v15, 0x80

    .line 392
    .line 393
    cmp-long v13, v13, v15

    .line 394
    .line 395
    if-gez v13, :cond_c

    .line 396
    .line 397
    shl-int/lit8 v13, v7, 0x3

    .line 398
    .line 399
    add-int/2addr v13, v12

    .line 400
    aget-object v13, v4, v13

    .line 401
    .line 402
    instance-of v14, v13, La0/v;

    .line 403
    .line 404
    if-eqz v14, :cond_12

    .line 405
    .line 406
    check-cast v13, La0/v;

    .line 407
    .line 408
    invoke-virtual {v13, v3}, La0/v;->b(I)Z

    .line 409
    .line 410
    .line 411
    move-result v13

    .line 412
    if-eqz v13, :cond_c

    .line 413
    .line 414
    goto :goto_8

    .line 415
    :cond_c
    shr-long/2addr v8, v11

    .line 416
    add-int/lit8 v12, v12, 0x1

    .line 417
    .line 418
    goto :goto_7

    .line 419
    :cond_d
    if-ne v10, v11, :cond_13

    .line 420
    .line 421
    :cond_e
    if-eq v7, v5, :cond_13

    .line 422
    .line 423
    add-int/lit8 v7, v7, 0x1

    .line 424
    .line 425
    goto :goto_6

    .line 426
    :cond_f
    move-object v0, v2

    .line 427
    check-cast v0, Ljava/lang/Iterable;

    .line 428
    .line 429
    instance-of v4, v0, Ljava/util/Collection;

    .line 430
    .line 431
    if-eqz v4, :cond_10

    .line 432
    .line 433
    move-object v4, v0

    .line 434
    check-cast v4, Ljava/util/Collection;

    .line 435
    .line 436
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    if-eqz v4, :cond_10

    .line 441
    .line 442
    goto :goto_9

    .line 443
    :cond_10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    if-eqz v4, :cond_13

    .line 452
    .line 453
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    instance-of v5, v4, La0/v;

    .line 458
    .line 459
    if-eqz v5, :cond_12

    .line 460
    .line 461
    check-cast v4, La0/v;

    .line 462
    .line 463
    invoke-virtual {v4, v3}, La0/v;->b(I)Z

    .line 464
    .line 465
    .line 466
    move-result v4

    .line 467
    if-eqz v4, :cond_11

    .line 468
    .line 469
    :cond_12
    :goto_8
    iget-object v0, v1, LA/e0;->r:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v0, LO5/e;

    .line 472
    .line 473
    invoke-interface {v0, v2}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    :cond_13
    :goto_9
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 477
    .line 478
    return-object v0

    .line 479
    :pswitch_7
    move-object/from16 v2, p1

    .line 480
    .line 481
    check-cast v2, Ljava/util/Set;

    .line 482
    .line 483
    check-cast v0, La0/h;

    .line 484
    .line 485
    iget-object v0, v1, LA/e0;->r:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v0, LP/v0;

    .line 488
    .line 489
    iget-object v3, v0, LP/v0;->b:Ljava/lang/Object;

    .line 490
    .line 491
    monitor-enter v3

    .line 492
    :try_start_0
    iget-object v4, v0, LP/v0;->t:LP5/S;

    .line 493
    .line 494
    invoke-virtual {v4}, LP5/S;->getValue()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    check-cast v4, LP/p0;

    .line 499
    .line 500
    sget-object v5, LP/p0;->u:LP/p0;

    .line 501
    .line 502
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    if-ltz v4, :cond_1b

    .line 507
    .line 508
    iget-object v4, v0, LP/v0;->g:Lr/H;

    .line 509
    .line 510
    instance-of v5, v2, LR/h;

    .line 511
    .line 512
    const/4 v6, 0x1

    .line 513
    if-eqz v5, :cond_18

    .line 514
    .line 515
    check-cast v2, LR/h;

    .line 516
    .line 517
    iget-object v2, v2, LR/h;->q:Lr/H;

    .line 518
    .line 519
    iget-object v5, v2, Lr/H;->b:[Ljava/lang/Object;

    .line 520
    .line 521
    iget-object v2, v2, Lr/H;->a:[J

    .line 522
    .line 523
    array-length v7, v2

    .line 524
    add-int/lit8 v7, v7, -0x2

    .line 525
    .line 526
    if-ltz v7, :cond_1a

    .line 527
    .line 528
    const/4 v9, 0x0

    .line 529
    :goto_a
    aget-wide v10, v2, v9

    .line 530
    .line 531
    not-long v12, v10

    .line 532
    const/4 v14, 0x7

    .line 533
    shl-long/2addr v12, v14

    .line 534
    and-long/2addr v12, v10

    .line 535
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    and-long/2addr v12, v14

    .line 541
    cmp-long v12, v12, v14

    .line 542
    .line 543
    if-eqz v12, :cond_17

    .line 544
    .line 545
    sub-int v12, v9, v7

    .line 546
    .line 547
    not-int v12, v12

    .line 548
    ushr-int/lit8 v12, v12, 0x1f

    .line 549
    .line 550
    const/16 v13, 0x8

    .line 551
    .line 552
    rsub-int/lit8 v12, v12, 0x8

    .line 553
    .line 554
    const/4 v14, 0x0

    .line 555
    :goto_b
    if-ge v14, v12, :cond_16

    .line 556
    .line 557
    const-wide/16 v15, 0xff

    .line 558
    .line 559
    and-long/2addr v15, v10

    .line 560
    const-wide/16 v17, 0x80

    .line 561
    .line 562
    cmp-long v15, v15, v17

    .line 563
    .line 564
    if-gez v15, :cond_15

    .line 565
    .line 566
    shl-int/lit8 v15, v9, 0x3

    .line 567
    .line 568
    add-int/2addr v15, v14

    .line 569
    aget-object v15, v5, v15

    .line 570
    .line 571
    instance-of v8, v15, La0/v;

    .line 572
    .line 573
    if-eqz v8, :cond_14

    .line 574
    .line 575
    move-object v8, v15

    .line 576
    check-cast v8, La0/v;

    .line 577
    .line 578
    invoke-virtual {v8, v6}, La0/v;->b(I)Z

    .line 579
    .line 580
    .line 581
    move-result v8

    .line 582
    if-nez v8, :cond_14

    .line 583
    .line 584
    goto :goto_c

    .line 585
    :catchall_0
    move-exception v0

    .line 586
    goto :goto_f

    .line 587
    :cond_14
    invoke-virtual {v4, v15}, Lr/H;->a(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    :cond_15
    :goto_c
    shr-long/2addr v10, v13

    .line 591
    add-int/lit8 v14, v14, 0x1

    .line 592
    .line 593
    goto :goto_b

    .line 594
    :cond_16
    if-ne v12, v13, :cond_1a

    .line 595
    .line 596
    :cond_17
    if-eq v9, v7, :cond_1a

    .line 597
    .line 598
    add-int/lit8 v9, v9, 0x1

    .line 599
    .line 600
    goto :goto_a

    .line 601
    :cond_18
    check-cast v2, Ljava/lang/Iterable;

    .line 602
    .line 603
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 608
    .line 609
    .line 610
    move-result v5

    .line 611
    if-eqz v5, :cond_1a

    .line 612
    .line 613
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v5

    .line 617
    instance-of v7, v5, La0/v;

    .line 618
    .line 619
    if-eqz v7, :cond_19

    .line 620
    .line 621
    move-object v7, v5

    .line 622
    check-cast v7, La0/v;

    .line 623
    .line 624
    invoke-virtual {v7, v6}, La0/v;->b(I)Z

    .line 625
    .line 626
    .line 627
    move-result v7

    .line 628
    if-nez v7, :cond_19

    .line 629
    .line 630
    goto :goto_d

    .line 631
    :cond_19
    invoke-virtual {v4, v5}, Lr/H;->a(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    goto :goto_d

    .line 635
    :cond_1a
    invoke-virtual {v0}, LP/v0;->u()LM5/f;

    .line 636
    .line 637
    .line 638
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 639
    goto :goto_e

    .line 640
    :cond_1b
    const/4 v0, 0x0

    .line 641
    :goto_e
    monitor-exit v3

    .line 642
    if-eqz v0, :cond_1c

    .line 643
    .line 644
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 645
    .line 646
    check-cast v0, LM5/h;

    .line 647
    .line 648
    invoke-virtual {v0, v2}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    :cond_1c
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 652
    .line 653
    return-object v0

    .line 654
    :goto_f
    monitor-exit v3

    .line 655
    throw v0

    .line 656
    :pswitch_8
    move-object/from16 v2, p1

    .line 657
    .line 658
    check-cast v2, LP/o;

    .line 659
    .line 660
    check-cast v0, Ljava/lang/Number;

    .line 661
    .line 662
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 663
    .line 664
    .line 665
    move-result v0

    .line 666
    and-int/lit8 v3, v0, 0x3

    .line 667
    .line 668
    const/4 v4, 0x2

    .line 669
    const/4 v5, 0x1

    .line 670
    if-eq v3, v4, :cond_1d

    .line 671
    .line 672
    move v3, v5

    .line 673
    goto :goto_10

    .line 674
    :cond_1d
    const/4 v3, 0x0

    .line 675
    :goto_10
    and-int/2addr v0, v5

    .line 676
    invoke-virtual {v2, v0, v3}, LP/o;->K(IZ)Z

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    if-nez v0, :cond_1e

    .line 681
    .line 682
    invoke-virtual {v2}, LP/o;->N()V

    .line 683
    .line 684
    .line 685
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 686
    .line 687
    return-object v0

    .line 688
    :cond_1e
    const/4 v0, 0x0

    .line 689
    throw v0

    .line 690
    :pswitch_9
    move-object/from16 v2, p1

    .line 691
    .line 692
    check-cast v2, LP/o;

    .line 693
    .line 694
    check-cast v0, Ljava/lang/Number;

    .line 695
    .line 696
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 697
    .line 698
    .line 699
    move-result v0

    .line 700
    and-int/lit8 v0, v0, 0x3

    .line 701
    .line 702
    const/4 v3, 0x2

    .line 703
    if-ne v0, v3, :cond_20

    .line 704
    .line 705
    invoke-virtual {v2}, LP/o;->x()Z

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-nez v0, :cond_1f

    .line 710
    .line 711
    goto :goto_11

    .line 712
    :cond_1f
    invoke-virtual {v2}, LP/o;->N()V

    .line 713
    .line 714
    .line 715
    goto :goto_12

    .line 716
    :cond_20
    :goto_11
    iget-object v0, v1, LA/e0;->r:Ljava/lang/Object;

    .line 717
    .line 718
    check-cast v0, LB5/e;

    .line 719
    .line 720
    const/4 v3, 0x0

    .line 721
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    invoke-interface {v0, v2, v3}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    :goto_12
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 729
    .line 730
    return-object v0

    .line 731
    :pswitch_a
    move-object/from16 v2, p1

    .line 732
    .line 733
    check-cast v2, LW0/k;

    .line 734
    .line 735
    iget-wide v2, v2, LW0/k;->a:J

    .line 736
    .line 737
    check-cast v0, LW0/a;

    .line 738
    .line 739
    iget-wide v4, v0, LW0/a;->a:J

    .line 740
    .line 741
    sget-object v0, LM/J0;->q:LM/J0;

    .line 742
    .line 743
    invoke-static {v4, v5}, LW0/a;->g(J)I

    .line 744
    .line 745
    .line 746
    move-result v4

    .line 747
    int-to-float v4, v4

    .line 748
    new-instance v5, LM/Z;

    .line 749
    .line 750
    iget-object v6, v1, LA/e0;->r:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v6, LM/I0;

    .line 753
    .line 754
    invoke-direct {v5, v4, v2, v3, v6}, LM/Z;-><init>(FJLM/I0;)V

    .line 755
    .line 756
    .line 757
    new-instance v2, LN/y;

    .line 758
    .line 759
    new-instance v3, LN/t;

    .line 760
    .line 761
    invoke-direct {v3}, LN/t;-><init>()V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v5, v3}, LM/Z;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    iget-object v3, v3, LN/t;->a:Ljava/util/LinkedHashMap;

    .line 768
    .line 769
    invoke-direct {v2, v3}, LN/y;-><init>(Ljava/util/Map;)V

    .line 770
    .line 771
    .line 772
    iget-object v4, v6, LM/I0;->c:LN/r;

    .line 773
    .line 774
    iget-object v4, v4, LN/r;->h:LP/C;

    .line 775
    .line 776
    invoke-virtual {v4}, LP/C;->getValue()Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v4

    .line 780
    check-cast v4, LM/J0;

    .line 781
    .line 782
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 783
    .line 784
    .line 785
    move-result v4

    .line 786
    if-eqz v4, :cond_24

    .line 787
    .line 788
    const/4 v5, 0x1

    .line 789
    if-eq v4, v5, :cond_22

    .line 790
    .line 791
    const/4 v5, 0x2

    .line 792
    if-ne v4, v5, :cond_21

    .line 793
    .line 794
    goto :goto_13

    .line 795
    :cond_21
    new-instance v0, LC2/e;

    .line 796
    .line 797
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 798
    .line 799
    .line 800
    throw v0

    .line 801
    :cond_22
    :goto_13
    sget-object v4, LM/J0;->s:LM/J0;

    .line 802
    .line 803
    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    move-result v5

    .line 807
    if-eqz v5, :cond_23

    .line 808
    .line 809
    :goto_14
    move-object v0, v4

    .line 810
    goto :goto_15

    .line 811
    :cond_23
    sget-object v4, LM/J0;->r:LM/J0;

    .line 812
    .line 813
    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    move-result v3

    .line 817
    if-eqz v3, :cond_24

    .line 818
    .line 819
    goto :goto_14

    .line 820
    :cond_24
    :goto_15
    new-instance v3, Lm5/j;

    .line 821
    .line 822
    invoke-direct {v3, v2, v0}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 823
    .line 824
    .line 825
    return-object v3

    .line 826
    :pswitch_b
    move-object/from16 v2, p1

    .line 827
    .line 828
    check-cast v2, LP/o;

    .line 829
    .line 830
    check-cast v0, Ljava/lang/Number;

    .line 831
    .line 832
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 833
    .line 834
    .line 835
    iget-object v0, v1, LA/e0;->r:Ljava/lang/Object;

    .line 836
    .line 837
    check-cast v0, LM/K;

    .line 838
    .line 839
    const/4 v3, 0x1

    .line 840
    invoke-static {v3}, LP/b;->w(I)I

    .line 841
    .line 842
    .line 843
    move-result v3

    .line 844
    invoke-virtual {v0, v3, v2}, LM/K;->a(ILP/o;)V

    .line 845
    .line 846
    .line 847
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 848
    .line 849
    return-object v0

    .line 850
    :pswitch_c
    move-object/from16 v2, p1

    .line 851
    .line 852
    check-cast v2, Lw/i0;

    .line 853
    .line 854
    check-cast v0, Ljava/lang/Number;

    .line 855
    .line 856
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 857
    .line 858
    .line 859
    move-result v0

    .line 860
    iget-object v2, v1, LA/e0;->r:Ljava/lang/Object;

    .line 861
    .line 862
    check-cast v2, LF/N;

    .line 863
    .line 864
    invoke-virtual {v2, v0}, LF/N;->i(I)I

    .line 865
    .line 866
    .line 867
    move-result v0

    .line 868
    iget-object v2, v2, LF/N;->s:LP/c0;

    .line 869
    .line 870
    invoke-virtual {v2, v0}, LP/c0;->f(I)V

    .line 871
    .line 872
    .line 873
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 874
    .line 875
    return-object v0

    .line 876
    :pswitch_d
    move-object/from16 v2, p1

    .line 877
    .line 878
    check-cast v2, LP/o;

    .line 879
    .line 880
    check-cast v0, Ljava/lang/Number;

    .line 881
    .line 882
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 883
    .line 884
    .line 885
    move-result v0

    .line 886
    and-int/lit8 v3, v0, 0x3

    .line 887
    .line 888
    const/4 v4, 0x2

    .line 889
    const/4 v5, 0x0

    .line 890
    const/4 v6, 0x1

    .line 891
    if-eq v3, v4, :cond_25

    .line 892
    .line 893
    move v3, v6

    .line 894
    goto :goto_16

    .line 895
    :cond_25
    move v3, v5

    .line 896
    :goto_16
    and-int/2addr v0, v6

    .line 897
    invoke-virtual {v2, v0, v3}, LP/o;->K(IZ)Z

    .line 898
    .line 899
    .line 900
    move-result v0

    .line 901
    if-eqz v0, :cond_26

    .line 902
    .line 903
    iget-object v0, v1, LA/e0;->r:Ljava/lang/Object;

    .line 904
    .line 905
    check-cast v0, LC0/a;

    .line 906
    .line 907
    invoke-virtual {v0, v5, v2}, LC0/a;->a(ILP/o;)V

    .line 908
    .line 909
    .line 910
    goto :goto_17

    .line 911
    :cond_26
    invoke-virtual {v2}, LP/o;->N()V

    .line 912
    .line 913
    .line 914
    :goto_17
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 915
    .line 916
    return-object v0

    .line 917
    :pswitch_e
    move-object/from16 v2, p1

    .line 918
    .line 919
    check-cast v2, LW0/k;

    .line 920
    .line 921
    iget-wide v2, v2, LW0/k;->a:J

    .line 922
    .line 923
    check-cast v0, LW0/l;

    .line 924
    .line 925
    iget-object v4, v1, LA/e0;->r:Ljava/lang/Object;

    .line 926
    .line 927
    check-cast v4, Lc0/c;

    .line 928
    .line 929
    const/16 v5, 0x20

    .line 930
    .line 931
    shr-long/2addr v2, v5

    .line 932
    long-to-int v2, v2

    .line 933
    const/4 v3, 0x0

    .line 934
    invoke-virtual {v4, v3, v2, v0}, Lc0/c;->a(IILW0/l;)I

    .line 935
    .line 936
    .line 937
    move-result v0

    .line 938
    int-to-long v6, v0

    .line 939
    shl-long v4, v6, v5

    .line 940
    .line 941
    int-to-long v2, v3

    .line 942
    const-wide v6, 0xffffffffL

    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    and-long/2addr v2, v6

    .line 948
    or-long/2addr v2, v4

    .line 949
    new-instance v0, LW0/i;

    .line 950
    .line 951
    invoke-direct {v0, v2, v3}, LW0/i;-><init>(J)V

    .line 952
    .line 953
    .line 954
    return-object v0

    .line 955
    :pswitch_f
    move-object/from16 v2, p1

    .line 956
    .line 957
    check-cast v2, LW0/k;

    .line 958
    .line 959
    iget-wide v6, v2, LW0/k;->a:J

    .line 960
    .line 961
    move-object v8, v0

    .line 962
    check-cast v8, LW0/l;

    .line 963
    .line 964
    iget-object v0, v1, LA/e0;->r:Ljava/lang/Object;

    .line 965
    .line 966
    move-object v3, v0

    .line 967
    check-cast v3, Lc0/e;

    .line 968
    .line 969
    const-wide/16 v4, 0x0

    .line 970
    .line 971
    invoke-virtual/range {v3 .. v8}, Lc0/e;->a(JJLW0/l;)J

    .line 972
    .line 973
    .line 974
    move-result-wide v2

    .line 975
    new-instance v0, LW0/i;

    .line 976
    .line 977
    invoke-direct {v0, v2, v3}, LW0/i;-><init>(J)V

    .line 978
    .line 979
    .line 980
    return-object v0

    .line 981
    :pswitch_10
    move-object/from16 v2, p1

    .line 982
    .line 983
    check-cast v2, LW0/k;

    .line 984
    .line 985
    iget-wide v2, v2, LW0/k;->a:J

    .line 986
    .line 987
    check-cast v0, LW0/l;

    .line 988
    .line 989
    iget-object v0, v1, LA/e0;->r:Ljava/lang/Object;

    .line 990
    .line 991
    check-cast v0, Lc0/d;

    .line 992
    .line 993
    const-wide v4, 0xffffffffL

    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    and-long/2addr v2, v4

    .line 999
    long-to-int v2, v2

    .line 1000
    const/4 v3, 0x0

    .line 1001
    invoke-virtual {v0, v3, v2}, Lc0/d;->a(II)I

    .line 1002
    .line 1003
    .line 1004
    move-result v0

    .line 1005
    int-to-long v2, v3

    .line 1006
    const/16 v6, 0x20

    .line 1007
    .line 1008
    shl-long/2addr v2, v6

    .line 1009
    int-to-long v6, v0

    .line 1010
    and-long/2addr v4, v6

    .line 1011
    or-long/2addr v2, v4

    .line 1012
    new-instance v0, LW0/i;

    .line 1013
    .line 1014
    invoke-direct {v0, v2, v3}, LW0/i;-><init>(J)V

    .line 1015
    .line 1016
    .line 1017
    return-object v0

    .line 1018
    nop

    .line 1019
    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
