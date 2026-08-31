.class public final LA0/d;
.super Lkotlin/jvm/internal/n;
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
    iput p1, p0, LA0/d;->q:I

    iput-object p2, p0, LA0/d;->r:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LB5/a;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, LA0/d;->q:I

    .line 2
    check-cast p1, Lkotlin/jvm/internal/n;

    iput-object p1, p0, LA0/d;->r:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LP/o;LP/V;)V
    .locals 0

    const/16 p2, 0x9

    iput p2, p0, LA0/d;->q:I

    .line 3
    iput-object p1, p0, LA0/d;->r:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lj0/B;J)V
    .locals 0

    const/16 p2, 0xe

    iput p2, p0, LA0/d;->q:I

    .line 4
    iput-object p1, p0, LA0/d;->r:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LA0/d;->q:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lv/x;

    .line 14
    .line 15
    iget-object v0, v0, Lv/x;->K:LB5/a;

    .line 16
    .line 17
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lu0/g;

    .line 26
    .line 27
    invoke-virtual {v0}, Lu0/g;->x0()LM5/w;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :pswitch_1
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lu0/d;

    .line 35
    .line 36
    iget-object v0, v0, Lu0/d;->d:LM5/w;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_2
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lu/d0;

    .line 42
    .line 43
    iget-object v2, v0, Lu/d0;->v:Lu/v0;

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    iget-object v2, v2, Lu/v0;->l:LP/C;

    .line 48
    .line 49
    invoke-virtual {v2}, LP/C;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/Number;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const-wide/16 v2, 0x0

    .line 61
    .line 62
    :goto_0
    iput-wide v2, v0, Lu/d0;->w:J

    .line 63
    .line 64
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_3
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, LM5/w;

    .line 70
    .line 71
    invoke-interface {v0}, LM5/w;->d()Lq5/h;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Lu/d;->m(Lq5/h;)F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    :pswitch_4
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lp0/H;

    .line 87
    .line 88
    iget v2, v0, Lp0/H;->B:I

    .line 89
    .line 90
    iget-object v0, v0, Lp0/H;->y:LP/c0;

    .line 91
    .line 92
    invoke-virtual {v0}, LP/c0;->e()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-ne v2, v3, :cond_1

    .line 97
    .line 98
    invoke-virtual {v0}, LP/c0;->e()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    add-int/2addr v2, v5

    .line 103
    invoke-virtual {v0, v2}, LP/c0;->f(I)V

    .line 104
    .line 105
    .line 106
    :cond_1
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_5
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, Lk2/g;

    .line 112
    .line 113
    iget-object v3, v0, Lk2/g;->q:Landroid/content/Context;

    .line 114
    .line 115
    iget-object v2, v0, Lk2/g;->r:Ljava/lang/String;

    .line 116
    .line 117
    if-eqz v2, :cond_2

    .line 118
    .line 119
    iget-boolean v4, v0, Lk2/g;->t:Z

    .line 120
    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    new-instance v4, Ljava/io/File;

    .line 124
    .line 125
    invoke-virtual {v3}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    const-string v6, "context.noBackupFilesDir"

    .line 130
    .line 131
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-direct {v4, v5, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v2, Lk2/f;

    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    new-instance v5, Lk2/c;

    .line 144
    .line 145
    invoke-direct {v5}, Lk2/c;-><init>()V

    .line 146
    .line 147
    .line 148
    iget-object v6, v0, Lk2/g;->s:LE/Y;

    .line 149
    .line 150
    iget-boolean v7, v0, Lk2/g;->u:Z

    .line 151
    .line 152
    invoke-direct/range {v2 .. v7}, Lk2/f;-><init>(Landroid/content/Context;Ljava/lang/String;Lk2/c;LE/Y;Z)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_2
    new-instance v2, Lk2/f;

    .line 157
    .line 158
    iget-object v4, v0, Lk2/g;->r:Ljava/lang/String;

    .line 159
    .line 160
    new-instance v5, Lk2/c;

    .line 161
    .line 162
    invoke-direct {v5}, Lk2/c;-><init>()V

    .line 163
    .line 164
    .line 165
    iget-object v6, v0, Lk2/g;->s:LE/Y;

    .line 166
    .line 167
    iget-boolean v7, v0, Lk2/g;->u:Z

    .line 168
    .line 169
    invoke-direct/range {v2 .. v7}, Lk2/f;-><init>(Landroid/content/Context;Ljava/lang/String;Lk2/c;LE/Y;Z)V

    .line 170
    .line 171
    .line 172
    :goto_1
    iget-boolean v0, v0, Lk2/g;->w:Z

    .line 173
    .line 174
    invoke-virtual {v2, v0}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 175
    .line 176
    .line 177
    return-object v2

    .line 178
    :pswitch_6
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Lh6/j;

    .line 181
    .line 182
    iget-object v0, v0, Lh6/j;->e:Ld6/k;

    .line 183
    .line 184
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Ld6/k;->a()Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Ljava/lang/Iterable;

    .line 192
    .line 193
    new-instance v2, Ljava/util/ArrayList;

    .line 194
    .line 195
    const/16 v3, 0xa

    .line 196
    .line 197
    invoke-static {v0, v3}, Ln5/m;->c0(Ljava/lang/Iterable;I)I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_3

    .line 213
    .line 214
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    check-cast v3, Ljava/security/cert/Certificate;

    .line 219
    .line 220
    const-string v4, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 221
    .line 222
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    check-cast v3, Ljava/security/cert/X509Certificate;

    .line 226
    .line 227
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_3
    return-object v2

    .line 232
    :pswitch_7
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, Lh0/o;

    .line 235
    .line 236
    invoke-virtual {v0}, Lh0/o;->y0()Lh0/k;

    .line 237
    .line 238
    .line 239
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_8
    :try_start_0
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Lkotlin/jvm/internal/n;

    .line 245
    .line 246
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :catch_0
    sget-object v0, Ln5/s;->q:Ln5/s;

    .line 254
    .line 255
    :goto_3
    return-object v0

    .line 256
    :pswitch_9
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, Lc/b;

    .line 259
    .line 260
    iput-boolean v5, v0, Lb/u;->a:Z

    .line 261
    .line 262
    iget-object v0, v0, Lb/u;->c:Lkotlin/jvm/internal/k;

    .line 263
    .line 264
    if-eqz v0, :cond_4

    .line 265
    .line 266
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    :cond_4
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_a
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, Landroidx/room/D;

    .line 275
    .line 276
    invoke-static {v0}, Landroidx/room/D;->access$createNewStatement(Landroidx/room/D;)Lj2/g;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    return-object v0

    .line 281
    :goto_4
    :pswitch_b
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 282
    .line 283
    move-object v4, v0

    .line 284
    check-cast v4, La0/t;

    .line 285
    .line 286
    iget-object v6, v4, La0/t;->g:Ljava/lang/Object;

    .line 287
    .line 288
    monitor-enter v6

    .line 289
    :try_start_1
    iget-boolean v0, v4, La0/t;->c:Z

    .line 290
    .line 291
    if-nez v0, :cond_b

    .line 292
    .line 293
    iput-boolean v5, v4, La0/t;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 294
    .line 295
    :try_start_2
    iget-object v0, v4, La0/t;->f:LR/e;

    .line 296
    .line 297
    iget-object v7, v0, LR/e;->q:[Ljava/lang/Object;

    .line 298
    .line 299
    iget v0, v0, LR/e;->s:I

    .line 300
    .line 301
    const/4 v8, 0x0

    .line 302
    :goto_5
    if-ge v8, v0, :cond_a

    .line 303
    .line 304
    aget-object v9, v7, v8

    .line 305
    .line 306
    check-cast v9, La0/s;

    .line 307
    .line 308
    iget-object v10, v9, La0/s;->g:Lr/H;

    .line 309
    .line 310
    iget-object v9, v9, La0/s;->a:LB5/c;

    .line 311
    .line 312
    iget-object v11, v10, Lr/H;->b:[Ljava/lang/Object;

    .line 313
    .line 314
    iget-object v12, v10, Lr/H;->a:[J

    .line 315
    .line 316
    array-length v13, v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 317
    sub-int/2addr v13, v2

    .line 318
    if-ltz v13, :cond_8

    .line 319
    .line 320
    move v15, v5

    .line 321
    move-object/from16 v16, v6

    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    :goto_6
    :try_start_3
    aget-wide v5, v12, v14

    .line 325
    .line 326
    not-long v2, v5

    .line 327
    const/16 v17, 0x7

    .line 328
    .line 329
    shl-long v2, v2, v17

    .line 330
    .line 331
    and-long/2addr v2, v5

    .line 332
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    and-long v2, v2, v17

    .line 338
    .line 339
    cmp-long v2, v2, v17

    .line 340
    .line 341
    if-eqz v2, :cond_7

    .line 342
    .line 343
    sub-int v2, v14, v13

    .line 344
    .line 345
    not-int v2, v2

    .line 346
    ushr-int/lit8 v2, v2, 0x1f

    .line 347
    .line 348
    const/16 v3, 0x8

    .line 349
    .line 350
    rsub-int/lit8 v2, v2, 0x8

    .line 351
    .line 352
    move/from16 v17, v15

    .line 353
    .line 354
    const/4 v15, 0x0

    .line 355
    :goto_7
    if-ge v15, v2, :cond_6

    .line 356
    .line 357
    const-wide/16 v18, 0xff

    .line 358
    .line 359
    and-long v18, v5, v18

    .line 360
    .line 361
    const-wide/16 v20, 0x80

    .line 362
    .line 363
    cmp-long v18, v18, v20

    .line 364
    .line 365
    if-gez v18, :cond_5

    .line 366
    .line 367
    shl-int/lit8 v18, v14, 0x3

    .line 368
    .line 369
    add-int v18, v18, v15

    .line 370
    .line 371
    move/from16 v19, v3

    .line 372
    .line 373
    aget-object v3, v11, v18

    .line 374
    .line 375
    invoke-interface {v9, v3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    goto :goto_8

    .line 379
    :catchall_0
    move-exception v0

    .line 380
    goto :goto_a

    .line 381
    :cond_5
    move/from16 v19, v3

    .line 382
    .line 383
    :goto_8
    shr-long v5, v5, v19

    .line 384
    .line 385
    add-int/lit8 v15, v15, 0x1

    .line 386
    .line 387
    move/from16 v3, v19

    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_6
    if-ne v2, v3, :cond_9

    .line 391
    .line 392
    goto :goto_9

    .line 393
    :cond_7
    move/from16 v17, v15

    .line 394
    .line 395
    :goto_9
    if-eq v14, v13, :cond_9

    .line 396
    .line 397
    add-int/lit8 v14, v14, 0x1

    .line 398
    .line 399
    move/from16 v15, v17

    .line 400
    .line 401
    const/4 v2, 0x2

    .line 402
    goto :goto_6

    .line 403
    :cond_8
    move/from16 v17, v5

    .line 404
    .line 405
    move-object/from16 v16, v6

    .line 406
    .line 407
    :cond_9
    invoke-virtual {v10}, Lr/H;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 408
    .line 409
    .line 410
    add-int/lit8 v8, v8, 0x1

    .line 411
    .line 412
    move-object/from16 v6, v16

    .line 413
    .line 414
    move/from16 v5, v17

    .line 415
    .line 416
    const/4 v2, 0x2

    .line 417
    goto :goto_5

    .line 418
    :goto_a
    const/4 v2, 0x0

    .line 419
    goto :goto_b

    .line 420
    :catchall_1
    move-exception v0

    .line 421
    move-object/from16 v16, v6

    .line 422
    .line 423
    goto :goto_a

    .line 424
    :cond_a
    move/from16 v17, v5

    .line 425
    .line 426
    move-object/from16 v16, v6

    .line 427
    .line 428
    const/4 v2, 0x0

    .line 429
    :try_start_4
    iput-boolean v2, v4, La0/t;->c:Z

    .line 430
    .line 431
    goto :goto_c

    .line 432
    :catchall_2
    move-exception v0

    .line 433
    goto :goto_d

    .line 434
    :goto_b
    iput-boolean v2, v4, La0/t;->c:Z

    .line 435
    .line 436
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 437
    :catchall_3
    move-exception v0

    .line 438
    move-object/from16 v16, v6

    .line 439
    .line 440
    goto :goto_d

    .line 441
    :cond_b
    move/from16 v17, v5

    .line 442
    .line 443
    move-object/from16 v16, v6

    .line 444
    .line 445
    :goto_c
    monitor-exit v16

    .line 446
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v0, La0/t;

    .line 449
    .line 450
    invoke-static {v0}, La0/t;->a(La0/t;)Z

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    if-nez v0, :cond_c

    .line 455
    .line 456
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 457
    .line 458
    return-object v0

    .line 459
    :cond_c
    move/from16 v5, v17

    .line 460
    .line 461
    const/4 v2, 0x2

    .line 462
    goto/16 :goto_4

    .line 463
    .line 464
    :goto_d
    monitor-exit v16

    .line 465
    throw v0

    .line 466
    :pswitch_c
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v0, LZ/b;

    .line 469
    .line 470
    iget-object v2, v0, LZ/b;->q:LZ/l;

    .line 471
    .line 472
    iget-object v3, v0, LZ/b;->t:Ljava/lang/Object;

    .line 473
    .line 474
    if-eqz v3, :cond_d

    .line 475
    .line 476
    invoke-interface {v2, v0, v3}, LZ/l;->b(LZ/b;Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    return-object v0

    .line 481
    :cond_d
    const-string v0, "Value should be initialized"

    .line 482
    .line 483
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 484
    .line 485
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    throw v2

    .line 489
    :pswitch_d
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v0, LU0/b;

    .line 492
    .line 493
    iget-object v2, v0, LU0/b;->s:LP/f0;

    .line 494
    .line 495
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v3

    .line 499
    check-cast v3, Li0/e;

    .line 500
    .line 501
    iget-wide v5, v3, Li0/e;->a:J

    .line 502
    .line 503
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    cmp-long v3, v5, v7

    .line 509
    .line 510
    if-nez v3, :cond_e

    .line 511
    .line 512
    goto :goto_e

    .line 513
    :cond_e
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    check-cast v3, Li0/e;

    .line 518
    .line 519
    iget-wide v5, v3, Li0/e;->a:J

    .line 520
    .line 521
    invoke-static {v5, v6}, Li0/e;->e(J)Z

    .line 522
    .line 523
    .line 524
    move-result v3

    .line 525
    if-eqz v3, :cond_f

    .line 526
    .line 527
    goto :goto_e

    .line 528
    :cond_f
    iget-object v0, v0, LU0/b;->q:Lj0/l;

    .line 529
    .line 530
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    check-cast v2, Li0/e;

    .line 535
    .line 536
    iget-wide v2, v2, Li0/e;->a:J

    .line 537
    .line 538
    iget-object v4, v0, Lj0/l;->g:Landroid/graphics/Shader;

    .line 539
    .line 540
    :goto_e
    return-object v4

    .line 541
    :pswitch_e
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v0, Lj0/B;

    .line 544
    .line 545
    check-cast v0, Lj0/l;

    .line 546
    .line 547
    iget-object v0, v0, Lj0/l;->g:Landroid/graphics/Shader;

    .line 548
    .line 549
    return-object v0

    .line 550
    :pswitch_f
    new-instance v0, Landroid/view/inputmethod/BaseInputConnection;

    .line 551
    .line 552
    iget-object v2, v1, LA0/d;->r:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v2, LP0/c;

    .line 555
    .line 556
    iget-object v2, v2, LP0/c;->a:Landroid/view/View;

    .line 557
    .line 558
    const/4 v3, 0x0

    .line 559
    invoke-direct {v0, v2, v3}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 560
    .line 561
    .line 562
    return-object v0

    .line 563
    :pswitch_10
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v0, LP0/c;

    .line 566
    .line 567
    iget-object v0, v0, LP0/c;->a:Landroid/view/View;

    .line 568
    .line 569
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    const-string v2, "input_method"

    .line 574
    .line 575
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    const-string v2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    .line 580
    .line 581
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 585
    .line 586
    return-object v0

    .line 587
    :pswitch_11
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 588
    .line 589
    check-cast v0, LP/v0;

    .line 590
    .line 591
    iget-object v2, v0, LP/v0;->b:Ljava/lang/Object;

    .line 592
    .line 593
    monitor-enter v2

    .line 594
    :try_start_5
    invoke-virtual {v0}, LP/v0;->u()LM5/f;

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    iget-object v4, v0, LP/v0;->t:LP5/S;

    .line 599
    .line 600
    invoke-virtual {v4}, LP5/S;->getValue()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v4

    .line 604
    check-cast v4, LP/p0;

    .line 605
    .line 606
    sget-object v5, LP/p0;->r:LP/p0;

    .line 607
    .line 608
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 609
    .line 610
    .line 611
    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 612
    if-lez v4, :cond_11

    .line 613
    .line 614
    monitor-exit v2

    .line 615
    if-eqz v3, :cond_10

    .line 616
    .line 617
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 618
    .line 619
    check-cast v3, LM5/h;

    .line 620
    .line 621
    invoke-virtual {v3, v0}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    :cond_10
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 625
    .line 626
    return-object v0

    .line 627
    :cond_11
    :try_start_6
    const-string v3, "Recomposer shutdown; frame clock awaiter will never resume"

    .line 628
    .line 629
    iget-object v0, v0, LP/v0;->d:Ljava/lang/Throwable;

    .line 630
    .line 631
    new-instance v4, Ljava/util/concurrent/CancellationException;

    .line 632
    .line 633
    invoke-direct {v4, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 637
    .line 638
    .line 639
    throw v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 640
    :catchall_4
    move-exception v0

    .line 641
    monitor-exit v2

    .line 642
    throw v0

    .line 643
    :pswitch_12
    move/from16 v17, v5

    .line 644
    .line 645
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v0, LP/h0;

    .line 648
    .line 649
    iget-object v0, v0, LP/h0;->a:Ljava/util/ArrayList;

    .line 650
    .line 651
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 652
    .line 653
    .line 654
    move-result v2

    .line 655
    new-instance v3, Lr/G;

    .line 656
    .line 657
    invoke-direct {v3, v2}, Lr/G;-><init>(I)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 661
    .line 662
    .line 663
    move-result v2

    .line 664
    const/4 v5, 0x0

    .line 665
    :goto_f
    if-ge v5, v2, :cond_18

    .line 666
    .line 667
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v6

    .line 671
    check-cast v6, LP/O;

    .line 672
    .line 673
    iget-object v7, v6, LP/O;->b:Ljava/lang/Object;

    .line 674
    .line 675
    iget v8, v6, LP/O;->a:I

    .line 676
    .line 677
    if-eqz v7, :cond_12

    .line 678
    .line 679
    new-instance v7, LP/N;

    .line 680
    .line 681
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 682
    .line 683
    .line 684
    move-result-object v8

    .line 685
    iget-object v9, v6, LP/O;->b:Ljava/lang/Object;

    .line 686
    .line 687
    invoke-direct {v7, v8, v9}, LP/N;-><init>(Ljava/lang/Integer;Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    goto :goto_10

    .line 691
    :cond_12
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 692
    .line 693
    .line 694
    move-result-object v7

    .line 695
    :goto_10
    invoke-virtual {v3, v7}, Lr/G;->f(Ljava/lang/Object;)I

    .line 696
    .line 697
    .line 698
    move-result v8

    .line 699
    if-gez v8, :cond_13

    .line 700
    .line 701
    move/from16 v9, v17

    .line 702
    .line 703
    goto :goto_11

    .line 704
    :cond_13
    const/4 v9, 0x0

    .line 705
    :goto_11
    if-eqz v9, :cond_14

    .line 706
    .line 707
    move-object v10, v4

    .line 708
    goto :goto_12

    .line 709
    :cond_14
    iget-object v10, v3, Lr/G;->c:[Ljava/lang/Object;

    .line 710
    .line 711
    aget-object v10, v10, v8

    .line 712
    .line 713
    :goto_12
    if-nez v10, :cond_15

    .line 714
    .line 715
    :goto_13
    const/4 v12, 0x2

    .line 716
    goto :goto_14

    .line 717
    :cond_15
    instance-of v11, v10, Lr/C;

    .line 718
    .line 719
    if-eqz v11, :cond_16

    .line 720
    .line 721
    check-cast v10, Lr/C;

    .line 722
    .line 723
    invoke-virtual {v10, v6}, Lr/C;->a(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    move-object v6, v10

    .line 727
    goto :goto_13

    .line 728
    :cond_16
    sget-object v11, Lr/M;->a:[Ljava/lang/Object;

    .line 729
    .line 730
    new-instance v11, Lr/C;

    .line 731
    .line 732
    const/4 v12, 0x2

    .line 733
    invoke-direct {v11, v12}, Lr/C;-><init>(I)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v11, v10}, Lr/C;->a(Ljava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v11, v6}, Lr/C;->a(Ljava/lang/Object;)V

    .line 740
    .line 741
    .line 742
    move-object v6, v11

    .line 743
    :goto_14
    if-eqz v9, :cond_17

    .line 744
    .line 745
    not-int v8, v8

    .line 746
    iget-object v9, v3, Lr/G;->b:[Ljava/lang/Object;

    .line 747
    .line 748
    aput-object v7, v9, v8

    .line 749
    .line 750
    iget-object v7, v3, Lr/G;->c:[Ljava/lang/Object;

    .line 751
    .line 752
    aput-object v6, v7, v8

    .line 753
    .line 754
    goto :goto_15

    .line 755
    :cond_17
    iget-object v7, v3, Lr/G;->c:[Ljava/lang/Object;

    .line 756
    .line 757
    aput-object v6, v7, v8

    .line 758
    .line 759
    :goto_15
    add-int/lit8 v5, v5, 0x1

    .line 760
    .line 761
    goto :goto_f

    .line 762
    :cond_18
    new-instance v0, LR/a;

    .line 763
    .line 764
    invoke-direct {v0, v3}, LR/a;-><init>(Lr/G;)V

    .line 765
    .line 766
    .line 767
    return-object v0

    .line 768
    :pswitch_13
    throw v4

    .line 769
    :pswitch_14
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v0, LW0/c;

    .line 772
    .line 773
    const/16 v2, 0x7d

    .line 774
    .line 775
    int-to-float v2, v2

    .line 776
    invoke-interface {v0, v2}, LW0/c;->u(F)F

    .line 777
    .line 778
    .line 779
    move-result v0

    .line 780
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    return-object v0

    .line 785
    :pswitch_15
    new-instance v0, LL4/i;

    .line 786
    .line 787
    iget-object v2, v1, LA0/d;->r:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v2, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    .line 790
    .line 791
    invoke-direct {v0, v2}, LL4/i;-><init>(Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;)V

    .line 792
    .line 793
    .line 794
    return-object v0

    .line 795
    :pswitch_16
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v0, LL/b;

    .line 798
    .line 799
    invoke-static {v0}, LB0/g;->l(LB0/p;)V

    .line 800
    .line 801
    .line 802
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 803
    .line 804
    return-object v0

    .line 805
    :pswitch_17
    move/from16 v17, v5

    .line 806
    .line 807
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v0, LL/a;

    .line 810
    .line 811
    iget-object v0, v0, LL/a;->z:LP/f0;

    .line 812
    .line 813
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    check-cast v2, Ljava/lang/Boolean;

    .line 818
    .line 819
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 820
    .line 821
    .line 822
    move-result v2

    .line 823
    xor-int/lit8 v2, v2, 0x1

    .line 824
    .line 825
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    invoke-virtual {v0, v2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 830
    .line 831
    .line 832
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 833
    .line 834
    return-object v0

    .line 835
    :pswitch_18
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 836
    .line 837
    check-cast v0, LJ0/a;

    .line 838
    .line 839
    iput-object v4, v0, LJ0/a;->g:LC0/z;

    .line 840
    .line 841
    const-string v2, "OnPositionedDispatch"

    .line 842
    .line 843
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    :try_start_7
    invoke-virtual {v0}, LJ0/a;->a()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 847
    .line 848
    .line 849
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 850
    .line 851
    .line 852
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 853
    .line 854
    return-object v0

    .line 855
    :catchall_5
    move-exception v0

    .line 856
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 857
    .line 858
    .line 859
    throw v0

    .line 860
    :pswitch_19
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 861
    .line 862
    check-cast v0, LJ/g;

    .line 863
    .line 864
    iput-object v4, v0, LJ/g;->O:LJ/e;

    .line 865
    .line 866
    invoke-static {v0}, LB0/g;->n(LB0/A0;)V

    .line 867
    .line 868
    .line 869
    invoke-static {v0}, LB0/g;->m(LB0/z;)V

    .line 870
    .line 871
    .line 872
    invoke-static {v0}, LB0/g;->l(LB0/p;)V

    .line 873
    .line 874
    .line 875
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 876
    .line 877
    return-object v0

    .line 878
    :pswitch_1a
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 879
    .line 880
    check-cast v0, LB5/c;

    .line 881
    .line 882
    sget-object v2, LB0/n0;->W:Lj0/C;

    .line 883
    .line 884
    invoke-interface {v0, v2}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    iget-object v0, v2, Lj0/C;->z:Lj0/E;

    .line 888
    .line 889
    iget-wide v3, v2, Lj0/C;->B:J

    .line 890
    .line 891
    iget-object v5, v2, Lj0/C;->D:LW0/l;

    .line 892
    .line 893
    iget-object v6, v2, Lj0/C;->C:LW0/c;

    .line 894
    .line 895
    invoke-interface {v0, v3, v4, v5, v6}, Lj0/E;->e(JLW0/l;LW0/c;)Lj0/B;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    iput-object v0, v2, Lj0/C;->E:Lj0/B;

    .line 900
    .line 901
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 902
    .line 903
    return-object v0

    .line 904
    :pswitch_1b
    move/from16 v17, v5

    .line 905
    .line 906
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 907
    .line 908
    check-cast v0, LB0/L;

    .line 909
    .line 910
    iget-object v0, v0, LB0/L;->V:LB0/P;

    .line 911
    .line 912
    iget-object v2, v0, LB0/P;->p:LB0/c0;

    .line 913
    .line 914
    move/from16 v15, v17

    .line 915
    .line 916
    iput-boolean v15, v2, LB0/c0;->O:Z

    .line 917
    .line 918
    iget-object v0, v0, LB0/P;->q:LB0/Y;

    .line 919
    .line 920
    if-eqz v0, :cond_19

    .line 921
    .line 922
    iput-boolean v15, v0, LB0/Y;->I:Z

    .line 923
    .line 924
    :cond_19
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 925
    .line 926
    return-object v0

    .line 927
    :pswitch_1c
    iget-object v0, v1, LA0/d;->r:Ljava/lang/Object;

    .line 928
    .line 929
    check-cast v0, LA0/e;

    .line 930
    .line 931
    iget-object v2, v0, LA0/e;->c:LR/e;

    .line 932
    .line 933
    iget-object v3, v0, LA0/e;->b:LR/e;

    .line 934
    .line 935
    iget-object v4, v0, LA0/e;->e:LR/e;

    .line 936
    .line 937
    const/4 v5, 0x0

    .line 938
    iput-boolean v5, v0, LA0/e;->f:Z

    .line 939
    .line 940
    new-instance v6, Ljava/util/HashSet;

    .line 941
    .line 942
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 943
    .line 944
    .line 945
    iget-object v0, v0, LA0/e;->d:LR/e;

    .line 946
    .line 947
    iget-object v7, v0, LR/e;->q:[Ljava/lang/Object;

    .line 948
    .line 949
    iget v8, v0, LR/e;->s:I

    .line 950
    .line 951
    move v9, v5

    .line 952
    :goto_16
    if-ge v9, v8, :cond_1b

    .line 953
    .line 954
    aget-object v10, v7, v9

    .line 955
    .line 956
    check-cast v10, LB0/L;

    .line 957
    .line 958
    iget-object v11, v4, LR/e;->q:[Ljava/lang/Object;

    .line 959
    .line 960
    aget-object v11, v11, v9

    .line 961
    .line 962
    check-cast v11, LA0/h;

    .line 963
    .line 964
    iget-object v10, v10, LB0/L;->U:LB0/g0;

    .line 965
    .line 966
    iget-object v10, v10, LB0/g0;->e:Lc0/l;

    .line 967
    .line 968
    iget-boolean v12, v10, Lc0/l;->D:Z

    .line 969
    .line 970
    if-eqz v12, :cond_1a

    .line 971
    .line 972
    invoke-static {v10, v11, v6}, LA0/e;->b(Lc0/l;LA0/h;Ljava/util/HashSet;)V

    .line 973
    .line 974
    .line 975
    :cond_1a
    add-int/lit8 v9, v9, 0x1

    .line 976
    .line 977
    goto :goto_16

    .line 978
    :cond_1b
    invoke-virtual {v0}, LR/e;->i()V

    .line 979
    .line 980
    .line 981
    invoke-virtual {v4}, LR/e;->i()V

    .line 982
    .line 983
    .line 984
    iget-object v0, v3, LR/e;->q:[Ljava/lang/Object;

    .line 985
    .line 986
    iget v4, v3, LR/e;->s:I

    .line 987
    .line 988
    :goto_17
    if-ge v5, v4, :cond_1d

    .line 989
    .line 990
    aget-object v7, v0, v5

    .line 991
    .line 992
    check-cast v7, LB0/d;

    .line 993
    .line 994
    iget-object v8, v2, LR/e;->q:[Ljava/lang/Object;

    .line 995
    .line 996
    aget-object v8, v8, v5

    .line 997
    .line 998
    check-cast v8, LA0/h;

    .line 999
    .line 1000
    iget-boolean v9, v7, Lc0/l;->D:Z

    .line 1001
    .line 1002
    if-eqz v9, :cond_1c

    .line 1003
    .line 1004
    invoke-static {v7, v8, v6}, LA0/e;->b(Lc0/l;LA0/h;Ljava/util/HashSet;)V

    .line 1005
    .line 1006
    .line 1007
    :cond_1c
    add-int/lit8 v5, v5, 0x1

    .line 1008
    .line 1009
    goto :goto_17

    .line 1010
    :cond_1d
    invoke-virtual {v3}, LR/e;->i()V

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v2}, LR/e;->i()V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1021
    .line 1022
    .line 1023
    move-result v2

    .line 1024
    if-eqz v2, :cond_1e

    .line 1025
    .line 1026
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v2

    .line 1030
    check-cast v2, LB0/d;

    .line 1031
    .line 1032
    invoke-virtual {v2}, LB0/d;->A0()V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_18

    .line 1036
    :cond_1e
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 1037
    .line 1038
    return-object v0

    .line 1039
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
