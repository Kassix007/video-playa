.class public final LP/t0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:LP/v0;

.field public final synthetic r:Lr/H;

.field public final synthetic s:Lr/H;

.field public final synthetic t:Ljava/util/List;

.field public final synthetic u:Ljava/util/List;

.field public final synthetic v:Lr/H;

.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:Lr/H;

.field public final synthetic y:Ljava/util/Set;


# direct methods
.method public constructor <init>(LP/v0;Lr/H;Lr/H;Ljava/util/List;Ljava/util/List;Lr/H;Ljava/util/List;Lr/H;Ljava/util/Set;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/t0;->q:LP/v0;

    .line 2
    .line 3
    iput-object p2, p0, LP/t0;->r:Lr/H;

    .line 4
    .line 5
    iput-object p3, p0, LP/t0;->s:Lr/H;

    .line 6
    .line 7
    iput-object p4, p0, LP/t0;->t:Ljava/util/List;

    .line 8
    .line 9
    iput-object p5, p0, LP/t0;->u:Ljava/util/List;

    .line 10
    .line 11
    iput-object p6, p0, LP/t0;->v:Lr/H;

    .line 12
    .line 13
    iput-object p7, p0, LP/t0;->w:Ljava/util/List;

    .line 14
    .line 15
    iput-object p8, p0, LP/t0;->x:Lr/H;

    .line 16
    .line 17
    iput-object p9, p0, LP/t0;->y:Ljava/util/Set;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    check-cast v0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    iget-object v0, v1, LP/t0;->q:LP/v0;

    .line 12
    .line 13
    iget-object v4, v0, LP/v0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v4

    .line 16
    :try_start_0
    invoke-virtual {v0}, LP/v0;->v()Z

    .line 17
    .line 18
    .line 19
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_f

    .line 20
    monitor-exit v4

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v0, "Recomposer:animation"

    .line 24
    .line 25
    iget-object v5, v1, LP/t0;->q:LP/v0;

    .line 26
    .line 27
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :try_start_1
    iget-object v0, v5, LP/v0;->a:LP/e;

    .line 31
    .line 32
    invoke-virtual {v0, v2, v3}, LP/e;->d(J)V

    .line 33
    .line 34
    .line 35
    sget-object v2, La0/n;->b:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    :try_start_2
    sget-object v0, La0/n;->i:La0/c;

    .line 39
    .line 40
    iget-object v0, v0, La0/d;->h:Lr/H;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0}, Lr/H;->h()Z

    .line 45
    .line 46
    .line 47
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    const/4 v3, 0x1

    .line 49
    if-ne v0, v3, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v3, 0x0

    .line 53
    :goto_0
    :try_start_3
    monitor-exit v2

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    invoke-static {}, La0/n;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    :try_start_4
    monitor-exit v2

    .line 65
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 66
    :catchall_1
    move-exception v0

    .line 67
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 68
    .line 69
    .line 70
    throw v0

    .line 71
    :cond_2
    :goto_1
    const-string v0, "Recomposer:recompose"

    .line 72
    .line 73
    iget-object v5, v1, LP/t0;->q:LP/v0;

    .line 74
    .line 75
    iget-object v11, v1, LP/t0;->r:Lr/H;

    .line 76
    .line 77
    iget-object v12, v1, LP/t0;->s:Lr/H;

    .line 78
    .line 79
    iget-object v6, v1, LP/t0;->t:Ljava/util/List;

    .line 80
    .line 81
    iget-object v7, v1, LP/t0;->u:Ljava/util/List;

    .line 82
    .line 83
    iget-object v9, v1, LP/t0;->v:Lr/H;

    .line 84
    .line 85
    iget-object v8, v1, LP/t0;->w:Ljava/util/List;

    .line 86
    .line 87
    iget-object v10, v1, LP/t0;->x:Lr/H;

    .line 88
    .line 89
    iget-object v2, v1, LP/t0;->y:Ljava/util/Set;

    .line 90
    .line 91
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :try_start_5
    invoke-static {v5}, LP/v0;->r(LP/v0;)Z

    .line 95
    .line 96
    .line 97
    iget-object v3, v5, LP/v0;->b:Ljava/lang/Object;

    .line 98
    .line 99
    monitor-enter v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 100
    :try_start_6
    iget-object v0, v5, LP/v0;->h:LR/e;

    .line 101
    .line 102
    iget-object v13, v0, LR/e;->q:[Ljava/lang/Object;

    .line 103
    .line 104
    iget v0, v0, LR/e;->s:I

    .line 105
    .line 106
    const/4 v14, 0x0

    .line 107
    :goto_2
    if-ge v14, v0, :cond_3

    .line 108
    .line 109
    aget-object v15, v13, v14

    .line 110
    .line 111
    check-cast v15, LP/u;

    .line 112
    .line 113
    move-object v4, v6

    .line 114
    check-cast v4, Ljava/util/Collection;

    .line 115
    .line 116
    invoke-interface {v4, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    add-int/lit8 v14, v14, 0x1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :catchall_2
    move-exception v0

    .line 123
    goto/16 :goto_21

    .line 124
    .line 125
    :cond_3
    iget-object v0, v5, LP/v0;->h:LR/e;

    .line 126
    .line 127
    invoke-virtual {v0}, LR/e;->i()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 128
    .line 129
    .line 130
    :try_start_7
    monitor-exit v3

    .line 131
    invoke-virtual {v11}, Lr/H;->b()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12}, Lr/H;->b()V

    .line 135
    .line 136
    .line 137
    :goto_3
    move-object v0, v6

    .line 138
    check-cast v0, Ljava/util/Collection;

    .line 139
    .line 140
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    const/4 v3, 0x0

    .line 145
    if-eqz v0, :cond_12

    .line 146
    .line 147
    move-object v0, v7

    .line 148
    check-cast v0, Ljava/util/Collection;

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-nez v0, :cond_4

    .line 155
    .line 156
    goto/16 :goto_14

    .line 157
    .line 158
    :cond_4
    move-object v0, v8

    .line 159
    check-cast v0, Ljava/util/Collection;

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 165
    if-nez v0, :cond_7

    .line 166
    .line 167
    :try_start_8
    move-object v0, v8

    .line 168
    check-cast v0, Ljava/util/Collection;

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    const/4 v2, 0x0

    .line 175
    :goto_4
    if-ge v2, v0, :cond_5

    .line 176
    .line 177
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    check-cast v4, LP/u;

    .line 182
    .line 183
    invoke-virtual {v10, v4}, Lr/H;->a(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    add-int/lit8 v2, v2, 0x1

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :catchall_3
    move-exception v0

    .line 190
    goto :goto_6

    .line 191
    :cond_5
    move-object v0, v8

    .line 192
    check-cast v0, Ljava/util/Collection;

    .line 193
    .line 194
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    const/4 v2, 0x0

    .line 199
    :goto_5
    if-ge v2, v0, :cond_6

    .line 200
    .line 201
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    check-cast v4, LP/u;

    .line 206
    .line 207
    invoke-virtual {v4}, LP/u;->d()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 208
    .line 209
    .line 210
    add-int/lit8 v2, v2, 0x1

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_6
    :try_start_9
    invoke-interface {v8}, Ljava/util/List;->clear()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 214
    .line 215
    .line 216
    goto :goto_8

    .line 217
    :catchall_4
    move-exception v0

    .line 218
    goto/16 :goto_22

    .line 219
    .line 220
    :goto_6
    :try_start_a
    invoke-virtual {v5, v0, v3}, LP/v0;->A(Ljava/lang/Throwable;LP/u;)V

    .line 221
    .line 222
    .line 223
    invoke-static/range {v5 .. v12}, LP/u0;->a(LP/v0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lr/H;Lr/H;Lr/H;Lr/H;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 224
    .line 225
    .line 226
    :try_start_b
    invoke-interface {v8}, Ljava/util/List;->clear()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 227
    .line 228
    .line 229
    :goto_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_20

    .line 233
    .line 234
    :catchall_5
    move-exception v0

    .line 235
    :try_start_c
    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 236
    .line 237
    .line 238
    throw v0

    .line 239
    :cond_7
    :goto_8
    invoke-virtual {v9}, Lr/H;->h()Z

    .line 240
    .line 241
    .line 242
    move-result v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 243
    const-wide/16 v15, 0xff

    .line 244
    .line 245
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    if-eqz v0, :cond_c

    .line 251
    .line 252
    :try_start_d
    invoke-virtual {v10, v9}, Lr/H;->k(Lr/H;)V

    .line 253
    .line 254
    .line 255
    iget-object v0, v9, Lr/H;->b:[Ljava/lang/Object;

    .line 256
    .line 257
    const/16 v19, 0x7

    .line 258
    .line 259
    iget-object v2, v9, Lr/H;->a:[J

    .line 260
    .line 261
    const-wide/16 v20, 0x80

    .line 262
    .line 263
    array-length v13, v2

    .line 264
    add-int/lit8 v13, v13, -0x2

    .line 265
    .line 266
    if-ltz v13, :cond_b

    .line 267
    .line 268
    const/4 v14, 0x0

    .line 269
    :goto_9
    const/16 v22, 0x8

    .line 270
    .line 271
    aget-wide v3, v2, v14

    .line 272
    .line 273
    move-object/from16 v23, v0

    .line 274
    .line 275
    not-long v0, v3

    .line 276
    shl-long v0, v0, v19

    .line 277
    .line 278
    and-long/2addr v0, v3

    .line 279
    and-long v0, v0, v17

    .line 280
    .line 281
    cmp-long v0, v0, v17

    .line 282
    .line 283
    if-eqz v0, :cond_a

    .line 284
    .line 285
    sub-int v0, v14, v13

    .line 286
    .line 287
    not-int v0, v0

    .line 288
    ushr-int/lit8 v0, v0, 0x1f

    .line 289
    .line 290
    rsub-int/lit8 v0, v0, 0x8

    .line 291
    .line 292
    const/4 v1, 0x0

    .line 293
    :goto_a
    if-ge v1, v0, :cond_9

    .line 294
    .line 295
    and-long v24, v3, v15

    .line 296
    .line 297
    cmp-long v24, v24, v20

    .line 298
    .line 299
    if-gez v24, :cond_8

    .line 300
    .line 301
    shl-int/lit8 v24, v14, 0x3

    .line 302
    .line 303
    add-int v24, v24, v1

    .line 304
    .line 305
    aget-object v24, v23, v24

    .line 306
    .line 307
    check-cast v24, LP/u;

    .line 308
    .line 309
    invoke-virtual/range {v24 .. v24}, LP/u;->f()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 310
    .line 311
    .line 312
    goto :goto_b

    .line 313
    :catchall_6
    move-exception v0

    .line 314
    const/4 v1, 0x0

    .line 315
    goto :goto_c

    .line 316
    :cond_8
    :goto_b
    shr-long v3, v3, v22

    .line 317
    .line 318
    add-int/lit8 v1, v1, 0x1

    .line 319
    .line 320
    goto :goto_a

    .line 321
    :cond_9
    move/from16 v1, v22

    .line 322
    .line 323
    if-ne v0, v1, :cond_b

    .line 324
    .line 325
    :cond_a
    if-eq v14, v13, :cond_b

    .line 326
    .line 327
    add-int/lit8 v14, v14, 0x1

    .line 328
    .line 329
    move-object/from16 v1, p0

    .line 330
    .line 331
    move-object/from16 v0, v23

    .line 332
    .line 333
    goto :goto_9

    .line 334
    :cond_b
    :try_start_e
    invoke-virtual {v9}, Lr/H;->b()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 335
    .line 336
    .line 337
    goto :goto_d

    .line 338
    :goto_c
    :try_start_f
    invoke-virtual {v5, v0, v1}, LP/v0;->A(Ljava/lang/Throwable;LP/u;)V

    .line 339
    .line 340
    .line 341
    invoke-static/range {v5 .. v12}, LP/u0;->a(LP/v0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lr/H;Lr/H;Lr/H;Lr/H;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 342
    .line 343
    .line 344
    :try_start_10
    invoke-virtual {v9}, Lr/H;->b()V

    .line 345
    .line 346
    .line 347
    goto :goto_7

    .line 348
    :catchall_7
    move-exception v0

    .line 349
    invoke-virtual {v9}, Lr/H;->b()V

    .line 350
    .line 351
    .line 352
    throw v0

    .line 353
    :cond_c
    const/16 v19, 0x7

    .line 354
    .line 355
    const-wide/16 v20, 0x80

    .line 356
    .line 357
    :goto_d
    invoke-virtual {v10}, Lr/H;->h()Z

    .line 358
    .line 359
    .line 360
    move-result v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 361
    if-eqz v0, :cond_11

    .line 362
    .line 363
    :try_start_11
    iget-object v0, v10, Lr/H;->b:[Ljava/lang/Object;

    .line 364
    .line 365
    iget-object v1, v10, Lr/H;->a:[J

    .line 366
    .line 367
    array-length v2, v1

    .line 368
    add-int/lit8 v2, v2, -0x2

    .line 369
    .line 370
    if-ltz v2, :cond_10

    .line 371
    .line 372
    const/4 v3, 0x0

    .line 373
    :goto_e
    aget-wide v13, v1, v3

    .line 374
    .line 375
    move-object v4, v0

    .line 376
    move-object/from16 v23, v1

    .line 377
    .line 378
    not-long v0, v13

    .line 379
    shl-long v0, v0, v19

    .line 380
    .line 381
    and-long/2addr v0, v13

    .line 382
    and-long v0, v0, v17

    .line 383
    .line 384
    cmp-long v0, v0, v17

    .line 385
    .line 386
    if-eqz v0, :cond_f

    .line 387
    .line 388
    sub-int v0, v3, v2

    .line 389
    .line 390
    not-int v0, v0

    .line 391
    ushr-int/lit8 v0, v0, 0x1f

    .line 392
    .line 393
    const/16 v22, 0x8

    .line 394
    .line 395
    rsub-int/lit8 v0, v0, 0x8

    .line 396
    .line 397
    const/4 v1, 0x0

    .line 398
    :goto_f
    if-ge v1, v0, :cond_e

    .line 399
    .line 400
    and-long v24, v13, v15

    .line 401
    .line 402
    cmp-long v24, v24, v20

    .line 403
    .line 404
    if-gez v24, :cond_d

    .line 405
    .line 406
    shl-int/lit8 v24, v3, 0x3

    .line 407
    .line 408
    add-int v24, v24, v1

    .line 409
    .line 410
    aget-object v24, v4, v24

    .line 411
    .line 412
    check-cast v24, LP/u;

    .line 413
    .line 414
    invoke-virtual/range {v24 .. v24}, LP/u;->g()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 415
    .line 416
    .line 417
    :cond_d
    const/16 v15, 0x8

    .line 418
    .line 419
    goto :goto_10

    .line 420
    :catchall_8
    move-exception v0

    .line 421
    const/4 v1, 0x0

    .line 422
    goto :goto_12

    .line 423
    :goto_10
    shr-long/2addr v13, v15

    .line 424
    add-int/lit8 v1, v1, 0x1

    .line 425
    .line 426
    const-wide/16 v15, 0xff

    .line 427
    .line 428
    goto :goto_f

    .line 429
    :cond_e
    const/16 v15, 0x8

    .line 430
    .line 431
    if-ne v0, v15, :cond_10

    .line 432
    .line 433
    goto :goto_11

    .line 434
    :cond_f
    const/16 v15, 0x8

    .line 435
    .line 436
    :goto_11
    if-eq v3, v2, :cond_10

    .line 437
    .line 438
    add-int/lit8 v3, v3, 0x1

    .line 439
    .line 440
    move-object v0, v4

    .line 441
    move-object/from16 v1, v23

    .line 442
    .line 443
    const-wide/16 v15, 0xff

    .line 444
    .line 445
    goto :goto_e

    .line 446
    :cond_10
    :try_start_12
    invoke-virtual {v10}, Lr/H;->b()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 447
    .line 448
    .line 449
    goto :goto_13

    .line 450
    :goto_12
    :try_start_13
    invoke-virtual {v5, v0, v1}, LP/v0;->A(Ljava/lang/Throwable;LP/u;)V

    .line 451
    .line 452
    .line 453
    invoke-static/range {v5 .. v12}, LP/u0;->a(LP/v0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lr/H;Lr/H;Lr/H;Lr/H;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 454
    .line 455
    .line 456
    :try_start_14
    invoke-virtual {v10}, Lr/H;->b()V

    .line 457
    .line 458
    .line 459
    goto/16 :goto_7

    .line 460
    .line 461
    :catchall_9
    move-exception v0

    .line 462
    invoke-virtual {v10}, Lr/H;->b()V

    .line 463
    .line 464
    .line 465
    throw v0

    .line 466
    :cond_11
    :goto_13
    iget-object v1, v5, LP/v0;->b:Ljava/lang/Object;

    .line 467
    .line 468
    monitor-enter v1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 469
    :try_start_15
    invoke-virtual {v5}, LP/v0;->u()LM5/f;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 470
    .line 471
    .line 472
    :try_start_16
    monitor-exit v1

    .line 473
    invoke-static {}, La0/n;->k()La0/h;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {v0}, La0/h;->m()V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Lr/H;->b()V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v11}, Lr/H;->b()V

    .line 484
    .line 485
    .line 486
    const/4 v1, 0x0

    .line 487
    iput-object v1, v5, LP/v0;->p:Ljava/util/LinkedHashSet;

    .line 488
    .line 489
    goto/16 :goto_7

    .line 490
    .line 491
    :catchall_a
    move-exception v0

    .line 492
    monitor-exit v1

    .line 493
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 494
    :cond_12
    :goto_14
    :try_start_17
    move-object v0, v6

    .line 495
    check-cast v0, Ljava/util/Collection;

    .line 496
    .line 497
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    const/4 v1, 0x0

    .line 502
    :goto_15
    if-ge v1, v0, :cond_14

    .line 503
    .line 504
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    check-cast v3, LP/u;

    .line 509
    .line 510
    invoke-static {v5, v3, v11}, LP/v0;->q(LP/v0;LP/u;Lr/H;)LP/u;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    if-eqz v4, :cond_13

    .line 515
    .line 516
    move-object v13, v8

    .line 517
    check-cast v13, Ljava/util/Collection;

    .line 518
    .line 519
    invoke-interface {v13, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    goto :goto_16

    .line 523
    :catchall_b
    move-exception v0

    .line 524
    const/4 v1, 0x0

    .line 525
    goto/16 :goto_1f

    .line 526
    .line 527
    :cond_13
    :goto_16
    invoke-virtual {v12, v3}, Lr/H;->a(Ljava/lang/Object;)Z
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    .line 528
    .line 529
    .line 530
    add-int/lit8 v1, v1, 0x1

    .line 531
    .line 532
    goto :goto_15

    .line 533
    :cond_14
    :try_start_18
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v11}, Lr/H;->h()Z

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    if-nez v0, :cond_15

    .line 541
    .line 542
    iget-object v0, v5, LP/v0;->h:LR/e;

    .line 543
    .line 544
    iget v0, v0, LR/e;->s:I

    .line 545
    .line 546
    if-eqz v0, :cond_1b

    .line 547
    .line 548
    :cond_15
    iget-object v1, v5, LP/v0;->b:Ljava/lang/Object;

    .line 549
    .line 550
    monitor-enter v1
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_4

    .line 551
    :try_start_19
    invoke-virtual {v5}, LP/v0;->x()Ljava/util/List;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    move-object v3, v0

    .line 556
    check-cast v3, Ljava/util/Collection;

    .line 557
    .line 558
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    const/4 v4, 0x0

    .line 563
    :goto_17
    if-ge v4, v3, :cond_17

    .line 564
    .line 565
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v13

    .line 569
    check-cast v13, LP/u;

    .line 570
    .line 571
    invoke-virtual {v12, v13}, Lr/H;->c(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v14

    .line 575
    if-nez v14, :cond_16

    .line 576
    .line 577
    invoke-virtual {v13, v2}, LP/u;->u(Ljava/util/Set;)Z

    .line 578
    .line 579
    .line 580
    move-result v14

    .line 581
    if-eqz v14, :cond_16

    .line 582
    .line 583
    move-object v14, v6

    .line 584
    check-cast v14, Ljava/util/Collection;

    .line 585
    .line 586
    invoke-interface {v14, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    goto :goto_18

    .line 590
    :catchall_c
    move-exception v0

    .line 591
    goto/16 :goto_1e

    .line 592
    .line 593
    :cond_16
    :goto_18
    add-int/lit8 v4, v4, 0x1

    .line 594
    .line 595
    goto :goto_17

    .line 596
    :cond_17
    iget-object v0, v5, LP/v0;->h:LR/e;

    .line 597
    .line 598
    iget v3, v0, LR/e;->s:I

    .line 599
    .line 600
    const/4 v4, 0x0

    .line 601
    const/4 v13, 0x0

    .line 602
    :goto_19
    if-ge v4, v3, :cond_1a

    .line 603
    .line 604
    iget-object v14, v0, LR/e;->q:[Ljava/lang/Object;

    .line 605
    .line 606
    aget-object v14, v14, v4

    .line 607
    .line 608
    check-cast v14, LP/u;

    .line 609
    .line 610
    invoke-virtual {v12, v14}, Lr/H;->c(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v15

    .line 614
    if-nez v15, :cond_18

    .line 615
    .line 616
    invoke-interface {v6, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v15

    .line 620
    if-nez v15, :cond_18

    .line 621
    .line 622
    move-object v15, v6

    .line 623
    check-cast v15, Ljava/util/Collection;

    .line 624
    .line 625
    invoke-interface {v15, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    add-int/lit8 v13, v13, 0x1

    .line 629
    .line 630
    goto :goto_1a

    .line 631
    :cond_18
    if-lez v13, :cond_19

    .line 632
    .line 633
    iget-object v14, v0, LR/e;->q:[Ljava/lang/Object;

    .line 634
    .line 635
    sub-int v15, v4, v13

    .line 636
    .line 637
    aget-object v16, v14, v4

    .line 638
    .line 639
    aput-object v16, v14, v15

    .line 640
    .line 641
    :cond_19
    :goto_1a
    add-int/lit8 v4, v4, 0x1

    .line 642
    .line 643
    goto :goto_19

    .line 644
    :cond_1a
    iget-object v4, v0, LR/e;->q:[Ljava/lang/Object;

    .line 645
    .line 646
    sub-int v13, v3, v13

    .line 647
    .line 648
    const/4 v14, 0x0

    .line 649
    invoke-static {v4, v13, v3, v14}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    iput v13, v0, LR/e;->s:I
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_c

    .line 653
    .line 654
    :try_start_1a
    monitor-exit v1

    .line 655
    :cond_1b
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 656
    .line 657
    .line 658
    move-result v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_4

    .line 659
    if-eqz v0, :cond_1d

    .line 660
    .line 661
    :try_start_1b
    invoke-static {v7, v5}, LP/u0;->b(Ljava/util/List;LP/v0;)V

    .line 662
    .line 663
    .line 664
    :goto_1b
    move-object v0, v7

    .line 665
    check-cast v0, Ljava/util/Collection;

    .line 666
    .line 667
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 668
    .line 669
    .line 670
    move-result v0

    .line 671
    if-nez v0, :cond_1d

    .line 672
    .line 673
    invoke-virtual {v5, v7, v11}, LP/v0;->z(Ljava/util/List;Lr/H;)Ljava/util/List;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    check-cast v0, Ljava/lang/Iterable;

    .line 678
    .line 679
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 687
    .line 688
    .line 689
    move-result v1

    .line 690
    if-eqz v1, :cond_1c

    .line 691
    .line 692
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    invoke-virtual {v9, v1}, Lr/H;->j(Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    goto :goto_1c

    .line 700
    :cond_1c
    invoke-static {v7, v5}, LP/u0;->b(Ljava/util/List;LP/v0;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_d

    .line 701
    .line 702
    .line 703
    goto :goto_1b

    .line 704
    :catchall_d
    move-exception v0

    .line 705
    const/4 v1, 0x0

    .line 706
    goto :goto_1d

    .line 707
    :cond_1d
    move-object/from16 v1, p0

    .line 708
    .line 709
    goto/16 :goto_3

    .line 710
    .line 711
    :goto_1d
    :try_start_1c
    invoke-virtual {v5, v0, v1}, LP/v0;->A(Ljava/lang/Throwable;LP/u;)V

    .line 712
    .line 713
    .line 714
    invoke-static/range {v5 .. v12}, LP/u0;->a(LP/v0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lr/H;Lr/H;Lr/H;Lr/H;)V

    .line 715
    .line 716
    .line 717
    goto/16 :goto_7

    .line 718
    .line 719
    :goto_1e
    monitor-exit v1

    .line 720
    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_4

    .line 721
    :goto_1f
    :try_start_1d
    invoke-virtual {v5, v0, v1}, LP/v0;->A(Ljava/lang/Throwable;LP/u;)V

    .line 722
    .line 723
    .line 724
    invoke-static/range {v5 .. v12}, LP/u0;->a(LP/v0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lr/H;Lr/H;Lr/H;Lr/H;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_e

    .line 725
    .line 726
    .line 727
    :try_start_1e
    invoke-interface {v6}, Ljava/util/List;->clear()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_4

    .line 728
    .line 729
    .line 730
    goto/16 :goto_7

    .line 731
    .line 732
    :goto_20
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 733
    .line 734
    return-object v0

    .line 735
    :catchall_e
    move-exception v0

    .line 736
    :try_start_1f
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 737
    .line 738
    .line 739
    throw v0

    .line 740
    :goto_21
    monitor-exit v3

    .line 741
    throw v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_4

    .line 742
    :goto_22
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 743
    .line 744
    .line 745
    throw v0

    .line 746
    :catchall_f
    move-exception v0

    .line 747
    monitor-exit v4

    .line 748
    throw v0
.end method
