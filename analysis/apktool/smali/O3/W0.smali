.class public final LO3/W0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Landroid/os/Bundle;

.field public final synthetic s:LO3/b1;


# direct methods
.method public synthetic constructor <init>(LO3/b1;Landroid/os/Bundle;I)V
    .locals 0

    .line 1
    iput p3, p0, LO3/W0;->q:I

    iput-object p2, p0, LO3/W0;->r:Landroid/os/Bundle;

    iput-object p1, p0, LO3/W0;->s:LO3/b1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LO3/W0;->q:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LO3/W0;->s:LO3/b1;

    .line 9
    .line 10
    iget-object v2, v1, LO3/b1;->N:Lk3/c;

    .line 11
    .line 12
    iget-object v1, v1, LO3/D0;->r:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LO3/t0;

    .line 15
    .line 16
    iget-object v8, v0, LO3/W0;->r:Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-virtual {v8}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    move-object v9, v8

    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    new-instance v9, Landroid/os/Bundle;

    .line 28
    .line 29
    iget-object v3, v1, LO3/t0;->u:LO3/h0;

    .line 30
    .line 31
    iget-object v10, v1, LO3/t0;->y:LO3/Y1;

    .line 32
    .line 33
    iget-object v11, v1, LO3/t0;->t:LO3/g;

    .line 34
    .line 35
    iget-object v12, v1, LO3/t0;->v:LO3/X;

    .line 36
    .line 37
    invoke-static {v3}, LO3/t0;->j(LO3/D0;)V

    .line 38
    .line 39
    .line 40
    iget-object v3, v3, LO3/h0;->P:LE/c0;

    .line 41
    .line 42
    invoke-virtual {v3}, LE/c0;->B()Landroid/os/Bundle;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-direct {v9, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v8}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v13

    .line 57
    :cond_1
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_6

    .line 62
    .line 63
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    move-object v14, v3

    .line 68
    check-cast v14, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v8, v14}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v15

    .line 74
    if-eqz v15, :cond_3

    .line 75
    .line 76
    instance-of v3, v15, Ljava/lang/String;

    .line 77
    .line 78
    if-nez v3, :cond_3

    .line 79
    .line 80
    instance-of v3, v15, Ljava/lang/Long;

    .line 81
    .line 82
    if-nez v3, :cond_3

    .line 83
    .line 84
    instance-of v3, v15, Ljava/lang/Double;

    .line 85
    .line 86
    if-nez v3, :cond_3

    .line 87
    .line 88
    invoke-static {v10}, LO3/t0;->j(LO3/D0;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v15}, LO3/Y1;->w0(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_2

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    const/4 v7, 0x0

    .line 99
    const/4 v3, 0x0

    .line 100
    const/16 v4, 0x1b

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    invoke-static/range {v2 .. v7}, LO3/Y1;->E(LO3/X1;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-static {v12}, LO3/t0;->l(LO3/E0;)V

    .line 107
    .line 108
    .line 109
    iget-object v3, v12, LO3/X;->B:LO3/V;

    .line 110
    .line 111
    const-string v4, "Invalid default event parameter type. Name, value"

    .line 112
    .line 113
    invoke-virtual {v3, v14, v15, v4}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    invoke-static {v14}, LO3/Y1;->M(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    invoke-static {v12}, LO3/t0;->l(LO3/E0;)V

    .line 124
    .line 125
    .line 126
    iget-object v3, v12, LO3/X;->B:LO3/V;

    .line 127
    .line 128
    const-string v4, "Invalid default event parameter name. Name"

    .line 129
    .line 130
    invoke-virtual {v3, v14, v4}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_4
    if-nez v15, :cond_5

    .line 135
    .line 136
    invoke-virtual {v9, v14}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_5
    invoke-static {v10}, LO3/t0;->j(LO3/D0;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    const/16 v3, 0x1f4

    .line 147
    .line 148
    const-string v4, "param"

    .line 149
    .line 150
    invoke-virtual {v10, v4, v14, v3, v15}, LO3/Y1;->x0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_1

    .line 155
    .line 156
    invoke-virtual {v10, v9, v14, v15}, LO3/Y1;->D(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_6
    invoke-static {v10}, LO3/t0;->j(LO3/D0;)V

    .line 161
    .line 162
    .line 163
    iget-object v3, v11, LO3/D0;->r:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v3, LO3/t0;

    .line 166
    .line 167
    iget-object v3, v3, LO3/t0;->y:LO3/Y1;

    .line 168
    .line 169
    invoke-static {v3}, LO3/t0;->j(LO3/D0;)V

    .line 170
    .line 171
    .line 172
    const v4, 0xc02a560

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v4}, LO3/Y1;->T(I)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_7

    .line 180
    .line 181
    const/16 v3, 0x64

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_7
    const/16 v3, 0x19

    .line 185
    .line 186
    :goto_1
    invoke-virtual {v9}, Landroid/os/BaseBundle;->size()I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-gt v4, v3, :cond_8

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_8
    new-instance v4, Ljava/util/TreeSet;

    .line 194
    .line 195
    invoke-virtual {v9}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-direct {v4, v5}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    const/4 v5, 0x0

    .line 207
    :cond_9
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    if-eqz v6, :cond_a

    .line 212
    .line 213
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    check-cast v6, Ljava/lang/String;

    .line 218
    .line 219
    add-int/lit8 v5, v5, 0x1

    .line 220
    .line 221
    if-le v5, v3, :cond_9

    .line 222
    .line 223
    invoke-virtual {v9, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_a
    invoke-static {v10}, LO3/t0;->j(LO3/D0;)V

    .line 228
    .line 229
    .line 230
    const/4 v6, 0x0

    .line 231
    const/4 v7, 0x0

    .line 232
    const/4 v3, 0x0

    .line 233
    const/16 v4, 0x1a

    .line 234
    .line 235
    const/4 v5, 0x0

    .line 236
    invoke-static/range {v2 .. v7}, LO3/Y1;->E(LO3/X1;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 237
    .line 238
    .line 239
    invoke-static {v12}, LO3/t0;->l(LO3/E0;)V

    .line 240
    .line 241
    .line 242
    iget-object v2, v12, LO3/X;->B:LO3/V;

    .line 243
    .line 244
    const-string v3, "Too many default event parameters set. Discarding beyond event parameter limit"

    .line 245
    .line 246
    invoke-virtual {v2, v3}, LO3/V;->b(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    :goto_3
    iget-object v2, v1, LO3/t0;->u:LO3/h0;

    .line 250
    .line 251
    invoke-static {v2}, LO3/t0;->j(LO3/D0;)V

    .line 252
    .line 253
    .line 254
    iget-object v2, v2, LO3/h0;->P:LE/c0;

    .line 255
    .line 256
    invoke-virtual {v2, v9}, LE/c0;->F(Landroid/os/Bundle;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v8}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    if-eqz v2, :cond_b

    .line 264
    .line 265
    iget-object v2, v1, LO3/t0;->t:LO3/g;

    .line 266
    .line 267
    const/4 v3, 0x0

    .line 268
    sget-object v4, LO3/F;->W0:LO3/E;

    .line 269
    .line 270
    invoke-virtual {v2, v3, v4}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-eqz v2, :cond_c

    .line 275
    .line 276
    :cond_b
    invoke-virtual {v1}, LO3/t0;->o()LO3/w1;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v1, v9}, LO3/w1;->t(Landroid/os/Bundle;)V

    .line 281
    .line 282
    .line 283
    :cond_c
    return-void

    .line 284
    :pswitch_0
    const-string v1, "creation_timestamp"

    .line 285
    .line 286
    const-string v2, "app_id"

    .line 287
    .line 288
    iget-object v3, v0, LO3/W0;->s:LO3/b1;

    .line 289
    .line 290
    invoke-virtual {v3}, LO3/C;->o()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v3}, LO3/H;->p()V

    .line 294
    .line 295
    .line 296
    const-string v4, "name"

    .line 297
    .line 298
    iget-object v5, v0, LO3/W0;->r:Landroid/os/Bundle;

    .line 299
    .line 300
    invoke-virtual {v5, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-static {v10}, Lx3/A;->d(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    iget-object v3, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v3, LO3/t0;

    .line 310
    .line 311
    invoke-virtual {v3}, LO3/t0;->a()Z

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-nez v4, :cond_d

    .line 316
    .line 317
    iget-object v1, v3, LO3/t0;->v:LO3/X;

    .line 318
    .line 319
    invoke-static {v1}, LO3/t0;->l(LO3/E0;)V

    .line 320
    .line 321
    .line 322
    iget-object v1, v1, LO3/X;->E:LO3/V;

    .line 323
    .line 324
    const-string v2, "Conditional property not cleared since app measurement is disabled"

    .line 325
    .line 326
    invoke-virtual {v1, v2}, LO3/V;->b(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_d
    new-instance v6, LO3/V1;

    .line 331
    .line 332
    const-wide/16 v7, 0x0

    .line 333
    .line 334
    const/4 v9, 0x0

    .line 335
    const-string v11, ""

    .line 336
    .line 337
    invoke-direct/range {v6 .. v11}, LO3/V1;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    :try_start_0
    iget-object v7, v3, LO3/t0;->y:LO3/Y1;

    .line 341
    .line 342
    invoke-static {v7}, LO3/t0;->j(LO3/D0;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v5, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    const-string v4, "expired_event_name"

    .line 349
    .line 350
    invoke-virtual {v5, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    const-string v4, "expired_event_params"

    .line 355
    .line 356
    invoke-virtual {v5, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 357
    .line 358
    .line 359
    move-result-object v9

    .line 360
    const-string v10, ""

    .line 361
    .line 362
    invoke-virtual {v5, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 363
    .line 364
    .line 365
    move-result-wide v11

    .line 366
    const/4 v13, 0x1

    .line 367
    invoke-virtual/range {v7 .. v13}, LO3/Y1;->Q(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)LO3/v;

    .line 368
    .line 369
    .line 370
    move-result-object v18
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 371
    new-instance v4, LO3/e;

    .line 372
    .line 373
    invoke-virtual {v5, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-virtual {v5, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 378
    .line 379
    .line 380
    move-result-wide v8

    .line 381
    const-string v1, "active"

    .line 382
    .line 383
    invoke-virtual {v5, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 384
    .line 385
    .line 386
    move-result v10

    .line 387
    const-string v1, "trigger_event_name"

    .line 388
    .line 389
    invoke-virtual {v5, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v11

    .line 393
    const-string v1, "trigger_timeout"

    .line 394
    .line 395
    invoke-virtual {v5, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 396
    .line 397
    .line 398
    move-result-wide v13

    .line 399
    const-string v1, "time_to_live"

    .line 400
    .line 401
    invoke-virtual {v5, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 402
    .line 403
    .line 404
    move-result-wide v16

    .line 405
    const/4 v12, 0x0

    .line 406
    const/4 v15, 0x0

    .line 407
    move-object v7, v6

    .line 408
    const-string v6, ""

    .line 409
    .line 410
    move-object v5, v2

    .line 411
    invoke-direct/range {v4 .. v18}, LO3/e;-><init>(Ljava/lang/String;Ljava/lang/String;LO3/V1;JZLjava/lang/String;LO3/v;JLO3/v;JLO3/v;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v3}, LO3/t0;->o()LO3/w1;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    invoke-virtual {v1, v4}, LO3/w1;->H(LO3/e;)V

    .line 419
    .line 420
    .line 421
    :catch_0
    :goto_4
    return-void

    .line 422
    :pswitch_1
    const-string v1, "app_id"

    .line 423
    .line 424
    iget-object v2, v0, LO3/W0;->s:LO3/b1;

    .line 425
    .line 426
    invoke-virtual {v2}, LO3/C;->o()V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2}, LO3/H;->p()V

    .line 430
    .line 431
    .line 432
    const-string v3, "name"

    .line 433
    .line 434
    iget-object v4, v0, LO3/W0;->r:Landroid/os/Bundle;

    .line 435
    .line 436
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v9

    .line 440
    const-string v3, "origin"

    .line 441
    .line 442
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v13

    .line 446
    invoke-static {v9}, Lx3/A;->d(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-static {v13}, Lx3/A;->d(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    const-string v3, "value"

    .line 453
    .line 454
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    invoke-static {v5}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    iget-object v2, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v2, LO3/t0;

    .line 464
    .line 465
    invoke-virtual {v2}, LO3/t0;->a()Z

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    if-nez v5, :cond_e

    .line 470
    .line 471
    iget-object v1, v2, LO3/t0;->v:LO3/X;

    .line 472
    .line 473
    invoke-static {v1}, LO3/t0;->l(LO3/E0;)V

    .line 474
    .line 475
    .line 476
    iget-object v1, v1, LO3/X;->E:LO3/V;

    .line 477
    .line 478
    const-string v2, "Conditional property not set since app measurement is disabled"

    .line 479
    .line 480
    invoke-virtual {v1, v2}, LO3/V;->b(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_5

    .line 484
    .line 485
    :cond_e
    new-instance v5, LO3/V1;

    .line 486
    .line 487
    const-string v6, "triggered_timestamp"

    .line 488
    .line 489
    invoke-virtual {v4, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 490
    .line 491
    .line 492
    move-result-wide v6

    .line 493
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v8

    .line 497
    move-object v10, v13

    .line 498
    invoke-direct/range {v5 .. v10}, LO3/V1;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    :try_start_1
    iget-object v10, v2, LO3/t0;->y:LO3/Y1;

    .line 502
    .line 503
    invoke-static {v10}, LO3/t0;->j(LO3/D0;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    const-string v3, "triggered_event_name"

    .line 510
    .line 511
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v11

    .line 515
    const-string v3, "triggered_event_params"

    .line 516
    .line 517
    invoke-virtual {v4, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 518
    .line 519
    .line 520
    move-result-object v12

    .line 521
    const-wide/16 v14, 0x0

    .line 522
    .line 523
    const/16 v16, 0x1

    .line 524
    .line 525
    invoke-virtual/range {v10 .. v16}, LO3/Y1;->Q(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)LO3/v;

    .line 526
    .line 527
    .line 528
    move-result-object v21

    .line 529
    invoke-static {v10}, LO3/t0;->j(LO3/D0;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    const-string v3, "timed_out_event_name"

    .line 536
    .line 537
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v11

    .line 541
    const-string v3, "timed_out_event_params"

    .line 542
    .line 543
    invoke-virtual {v4, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 544
    .line 545
    .line 546
    move-result-object v12

    .line 547
    const-wide/16 v14, 0x0

    .line 548
    .line 549
    const/16 v16, 0x1

    .line 550
    .line 551
    invoke-virtual/range {v10 .. v16}, LO3/Y1;->Q(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)LO3/v;

    .line 552
    .line 553
    .line 554
    move-result-object v18

    .line 555
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    const-string v3, "expired_event_name"

    .line 559
    .line 560
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v11

    .line 564
    const-string v3, "expired_event_params"

    .line 565
    .line 566
    invoke-virtual {v4, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 567
    .line 568
    .line 569
    move-result-object v12

    .line 570
    const-wide/16 v14, 0x0

    .line 571
    .line 572
    const/16 v16, 0x1

    .line 573
    .line 574
    invoke-virtual/range {v10 .. v16}, LO3/Y1;->Q(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)LO3/v;

    .line 575
    .line 576
    .line 577
    move-result-object v24
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 578
    new-instance v10, LO3/e;

    .line 579
    .line 580
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v11

    .line 584
    const-string v1, "creation_timestamp"

    .line 585
    .line 586
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 587
    .line 588
    .line 589
    move-result-wide v14

    .line 590
    const-string v1, "trigger_event_name"

    .line 591
    .line 592
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v17

    .line 596
    const-string v1, "trigger_timeout"

    .line 597
    .line 598
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 599
    .line 600
    .line 601
    move-result-wide v19

    .line 602
    const-string v1, "time_to_live"

    .line 603
    .line 604
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 605
    .line 606
    .line 607
    move-result-wide v22

    .line 608
    const/16 v16, 0x0

    .line 609
    .line 610
    move-object v12, v13

    .line 611
    move-object v13, v5

    .line 612
    invoke-direct/range {v10 .. v24}, LO3/e;-><init>(Ljava/lang/String;Ljava/lang/String;LO3/V1;JZLjava/lang/String;LO3/v;JLO3/v;JLO3/v;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v2}, LO3/t0;->o()LO3/w1;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    invoke-virtual {v1, v10}, LO3/w1;->H(LO3/e;)V

    .line 620
    .line 621
    .line 622
    :catch_1
    :goto_5
    return-void

    .line 623
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
