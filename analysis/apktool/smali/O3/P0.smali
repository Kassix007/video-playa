.class public final LO3/P0;
.super LO3/o;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:LO3/b1;


# direct methods
.method public constructor <init>(LO3/b1;LO3/F0;I)V
    .locals 0

    .line 1
    iput p3, p0, LO3/P0;->e:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LO3/P0;->f:LO3/b1;

    .line 10
    .line 11
    invoke-direct {p0, p2}, LO3/o;-><init>(LO3/F0;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iput-object p1, p0, LO3/P0;->f:LO3/b1;

    .line 16
    .line 17
    invoke-direct {p0, p2}, LO3/o;-><init>(LO3/F0;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LO3/P0;->f:LO3/b1;

    .line 25
    .line 26
    invoke-direct {p0, p2}, LO3/o;-><init>(LO3/F0;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, LO3/P0;->f:LO3/b1;

    .line 34
    .line 35
    invoke-direct {p0, p2}, LO3/o;-><init>(LO3/F0;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LO3/P0;->e:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, LO3/P0;->f:LO3/b1;

    .line 9
    .line 10
    iget-object v0, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v0

    .line 13
    check-cast v3, LO3/t0;

    .line 14
    .line 15
    iget-object v4, v3, LO3/t0;->u:LO3/h0;

    .line 16
    .line 17
    iget-object v5, v3, LO3/t0;->v:LO3/X;

    .line 18
    .line 19
    iget-object v0, v3, LO3/t0;->w:LO3/p0;

    .line 20
    .line 21
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, LO3/p0;->o()V

    .line 25
    .line 26
    .line 27
    iget-object v7, v3, LO3/t0;->E:LO3/f1;

    .line 28
    .line 29
    invoke-static {v7}, LO3/t0;->l(LO3/E0;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v7, LO3/D0;->r:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v6, v0

    .line 35
    check-cast v6, LO3/t0;

    .line 36
    .line 37
    invoke-static {v7}, LO3/t0;->l(LO3/E0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, LO3/t0;->q()LO3/N;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, LO3/N;->u()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    iget-object v0, v3, LO3/t0;->t:LO3/g;

    .line 49
    .line 50
    const-string v9, "google_analytics_adid_collection_enabled"

    .line 51
    .line 52
    invoke-virtual {v0, v9}, LO3/g;->A(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v13, 0x0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-static {v5}, LO3/t0;->l(LO3/E0;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, v5, LO3/X;->E:LO3/V;

    .line 70
    .line 71
    const-string v3, "ADID collection is disabled from Manifest. Skipping"

    .line 72
    .line 73
    invoke-virtual {v0, v3}, LO3/V;->b(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_11

    .line 77
    .line 78
    :cond_1
    :goto_0
    invoke-static {v4}, LO3/t0;->j(LO3/D0;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v4, LO3/D0;->r:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v9, v0

    .line 84
    check-cast v9, LO3/t0;

    .line 85
    .line 86
    invoke-virtual {v4}, LO3/D0;->o()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, LO3/h0;->v()LO3/J0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v10, LO3/I0;->r:LO3/I0;

    .line 94
    .line 95
    invoke-virtual {v0, v10}, LO3/J0;->i(LO3/I0;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const-string v10, ""

    .line 100
    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    iget-object v0, v9, LO3/t0;->A:LB3/a;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 109
    .line 110
    .line 111
    move-result-wide v14

    .line 112
    iget-object v0, v4, LO3/h0;->y:Ljava/lang/String;

    .line 113
    .line 114
    const/16 v16, 0x1

    .line 115
    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    iget-wide v11, v4, LO3/h0;->A:J

    .line 119
    .line 120
    cmp-long v11, v14, v11

    .line 121
    .line 122
    if-ltz v11, :cond_2

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    new-instance v9, Landroid/util/Pair;

    .line 126
    .line 127
    iget-boolean v10, v4, LO3/h0;->z:Z

    .line 128
    .line 129
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-direct {v9, v0, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_3
    :goto_1
    iget-object v0, v9, LO3/t0;->t:LO3/g;

    .line 138
    .line 139
    sget-object v11, LO3/F;->b:LO3/E;

    .line 140
    .line 141
    invoke-virtual {v0, v8, v11}, LO3/g;->v(Ljava/lang/String;LO3/E;)J

    .line 142
    .line 143
    .line 144
    move-result-wide v11

    .line 145
    add-long/2addr v11, v14

    .line 146
    iput-wide v11, v4, LO3/h0;->A:J

    .line 147
    .line 148
    invoke-static/range {v16 .. v16}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->setShouldSkipGmsCoreVersionCheck(Z)V

    .line 149
    .line 150
    .line 151
    :try_start_0
    iget-object v0, v9, LO3/t0;->q:Landroid/content/Context;

    .line 152
    .line 153
    invoke-static {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iput-object v10, v4, LO3/h0;->y:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    if-eqz v11, :cond_4

    .line 164
    .line 165
    iput-object v11, v4, LO3/h0;->y:Ljava/lang/String;

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :catch_0
    move-exception v0

    .line 169
    goto :goto_3

    .line 170
    :cond_4
    :goto_2
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    iput-boolean v0, v4, LO3/h0;->z:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :goto_3
    iget-object v9, v9, LO3/t0;->v:LO3/X;

    .line 178
    .line 179
    invoke-static {v9}, LO3/t0;->l(LO3/E0;)V

    .line 180
    .line 181
    .line 182
    iget-object v9, v9, LO3/X;->D:LO3/V;

    .line 183
    .line 184
    const-string v11, "Unable to get advertising id"

    .line 185
    .line 186
    invoke-virtual {v9, v0, v11}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    iput-object v10, v4, LO3/h0;->y:Ljava/lang/String;

    .line 190
    .line 191
    :goto_4
    invoke-static {v13}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->setShouldSkipGmsCoreVersionCheck(Z)V

    .line 192
    .line 193
    .line 194
    new-instance v9, Landroid/util/Pair;

    .line 195
    .line 196
    iget-object v0, v4, LO3/h0;->y:Ljava/lang/String;

    .line 197
    .line 198
    iget-boolean v10, v4, LO3/h0;->z:Z

    .line 199
    .line 200
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    invoke-direct {v9, v0, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_5
    const/16 v16, 0x1

    .line 209
    .line 210
    new-instance v9, Landroid/util/Pair;

    .line 211
    .line 212
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 213
    .line 214
    invoke-direct {v9, v10, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :goto_5
    iget-object v0, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-nez v0, :cond_16

    .line 226
    .line 227
    iget-object v0, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, Ljava/lang/CharSequence;

    .line 230
    .line 231
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_6

    .line 236
    .line 237
    goto/16 :goto_10

    .line 238
    .line 239
    :cond_6
    invoke-static {v7}, LO3/t0;->l(LO3/E0;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v7}, LO3/E0;->q()V

    .line 243
    .line 244
    .line 245
    iget-object v0, v6, LO3/t0;->q:Landroid/content/Context;

    .line 246
    .line 247
    const-string v10, "connectivity"

    .line 248
    .line 249
    invoke-virtual {v0, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 254
    .line 255
    if-eqz v0, :cond_7

    .line 256
    .line 257
    :try_start_1
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 258
    .line 259
    .line 260
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 261
    goto :goto_6

    .line 262
    :catch_1
    :cond_7
    const/4 v0, 0x0

    .line 263
    :goto_6
    if-eqz v0, :cond_15

    .line 264
    .line 265
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_15

    .line 270
    .line 271
    new-instance v11, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3}, LO3/t0;->o()LO3/w1;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0}, LO3/C;->o()V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, LO3/H;->p()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0}, LO3/w1;->v()Z

    .line 287
    .line 288
    .line 289
    move-result v12

    .line 290
    if-nez v12, :cond_8

    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_8
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, LO3/t0;

    .line 296
    .line 297
    iget-object v0, v0, LO3/t0;->y:LO3/Y1;

    .line 298
    .line 299
    invoke-static {v0}, LO3/t0;->j(LO3/D0;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0}, LO3/Y1;->U()I

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    const v12, 0x392d8

    .line 307
    .line 308
    .line 309
    if-lt v0, v12, :cond_11

    .line 310
    .line 311
    :goto_7
    iget-object v0, v3, LO3/t0;->C:LO3/b1;

    .line 312
    .line 313
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 314
    .line 315
    .line 316
    iget-object v12, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v12, LO3/t0;

    .line 319
    .line 320
    invoke-virtual {v0}, LO3/C;->o()V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, LO3/t0;->o()LO3/w1;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    iget-object v12, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v12, LO3/t0;

    .line 330
    .line 331
    invoke-virtual {v0}, LO3/C;->o()V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, LO3/H;->p()V

    .line 335
    .line 336
    .line 337
    iget-object v14, v0, LO3/w1;->u:LO3/I;

    .line 338
    .line 339
    if-nez v14, :cond_9

    .line 340
    .line 341
    invoke-virtual {v0}, LO3/w1;->u()V

    .line 342
    .line 343
    .line 344
    iget-object v0, v12, LO3/t0;->v:LO3/X;

    .line 345
    .line 346
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 347
    .line 348
    .line 349
    iget-object v0, v0, LO3/X;->D:LO3/V;

    .line 350
    .line 351
    const-string v12, "Failed to get consents; not connected to service yet."

    .line 352
    .line 353
    invoke-virtual {v0, v12}, LO3/V;->b(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    :goto_8
    const/4 v14, 0x0

    .line 357
    goto :goto_9

    .line 358
    :cond_9
    invoke-virtual {v0, v13}, LO3/w1;->E(Z)LO3/a2;

    .line 359
    .line 360
    .line 361
    move-result-object v15

    .line 362
    :try_start_2
    invoke-interface {v14, v15}, LO3/I;->g(LO3/a2;)LO3/i;

    .line 363
    .line 364
    .line 365
    move-result-object v14

    .line 366
    invoke-virtual {v0}, LO3/w1;->B()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 367
    .line 368
    .line 369
    goto :goto_9

    .line 370
    :catch_2
    move-exception v0

    .line 371
    iget-object v12, v12, LO3/t0;->v:LO3/X;

    .line 372
    .line 373
    invoke-static {v12}, LO3/t0;->l(LO3/E0;)V

    .line 374
    .line 375
    .line 376
    iget-object v12, v12, LO3/X;->w:LO3/V;

    .line 377
    .line 378
    const-string v14, "Failed to get consents; remote exception"

    .line 379
    .line 380
    invoke-virtual {v12, v0, v14}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    goto :goto_8

    .line 384
    :goto_9
    if-eqz v14, :cond_a

    .line 385
    .line 386
    iget-object v0, v14, LO3/i;->q:Landroid/os/Bundle;

    .line 387
    .line 388
    goto :goto_a

    .line 389
    :cond_a
    const/4 v0, 0x0

    .line 390
    :goto_a
    if-nez v0, :cond_d

    .line 391
    .line 392
    iget v0, v3, LO3/t0;->R:I

    .line 393
    .line 394
    add-int/lit8 v4, v0, 0x1

    .line 395
    .line 396
    iput v4, v3, LO3/t0;->R:I

    .line 397
    .line 398
    const/16 v4, 0xa

    .line 399
    .line 400
    if-ge v0, v4, :cond_b

    .line 401
    .line 402
    move/from16 v13, v16

    .line 403
    .line 404
    :cond_b
    invoke-static {v5}, LO3/t0;->l(LO3/E0;)V

    .line 405
    .line 406
    .line 407
    if-ge v0, v4, :cond_c

    .line 408
    .line 409
    const-string v0, "Retrying."

    .line 410
    .line 411
    goto :goto_b

    .line 412
    :cond_c
    const-string v0, "Skipping."

    .line 413
    .line 414
    :goto_b
    iget-object v4, v5, LO3/X;->D:LO3/V;

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    new-instance v6, Ljava/lang/StringBuilder;

    .line 421
    .line 422
    add-int/lit8 v5, v5, 0x3c

    .line 423
    .line 424
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 425
    .line 426
    .line 427
    const-string v5, "Failed to retrieve DMA consent from the service, "

    .line 428
    .line 429
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    const-string v0, " retryCount"

    .line 436
    .line 437
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    iget v3, v3, LO3/t0;->R:I

    .line 445
    .line 446
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    invoke-virtual {v4, v3, v0}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    goto/16 :goto_11

    .line 454
    .line 455
    :cond_d
    const/16 v12, 0x64

    .line 456
    .line 457
    invoke-static {v12, v0}, LO3/J0;->b(ILandroid/os/Bundle;)LO3/J0;

    .line 458
    .line 459
    .line 460
    move-result-object v14

    .line 461
    const-string v15, "&gcs="

    .line 462
    .line 463
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v14}, LO3/J0;->f()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v14

    .line 470
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-static {v12, v0}, LO3/p;->c(ILandroid/os/Bundle;)LO3/p;

    .line 474
    .line 475
    .line 476
    move-result-object v12

    .line 477
    iget-object v14, v12, LO3/p;->d:Ljava/lang/String;

    .line 478
    .line 479
    const-string v15, "&dma="

    .line 480
    .line 481
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    iget-object v12, v12, LO3/p;->c:Ljava/lang/Boolean;

    .line 485
    .line 486
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 487
    .line 488
    invoke-static {v12, v15}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v12

    .line 492
    xor-int/lit8 v12, v12, 0x1

    .line 493
    .line 494
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 498
    .line 499
    .line 500
    move-result v12

    .line 501
    if-nez v12, :cond_e

    .line 502
    .line 503
    const-string v12, "&dma_cps="

    .line 504
    .line 505
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    :cond_e
    const-string v12, "ad_personalization"

    .line 512
    .line 513
    invoke-virtual {v0, v12}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-static {v0}, LO3/J0;->d(Ljava/lang/String;)LO3/G0;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    const/4 v12, 0x2

    .line 526
    if-eq v0, v12, :cond_10

    .line 527
    .line 528
    const/4 v12, 0x3

    .line 529
    if-eq v0, v12, :cond_f

    .line 530
    .line 531
    const/4 v15, 0x0

    .line 532
    goto :goto_c

    .line 533
    :cond_f
    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 534
    .line 535
    :cond_10
    :goto_c
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 536
    .line 537
    invoke-static {v15, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    xor-int/lit8 v0, v0, 0x1

    .line 542
    .line 543
    const-string v12, "&npa="

    .line 544
    .line 545
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    invoke-static {v5}, LO3/t0;->l(LO3/E0;)V

    .line 552
    .line 553
    .line 554
    iget-object v0, v5, LO3/X;->E:LO3/V;

    .line 555
    .line 556
    const-string v5, "Consent query parameters to Bow"

    .line 557
    .line 558
    invoke-virtual {v0, v11, v5}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    :cond_11
    iget-object v0, v3, LO3/t0;->y:LO3/Y1;

    .line 562
    .line 563
    invoke-static {v0}, LO3/t0;->j(LO3/D0;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v3}, LO3/t0;->q()LO3/N;

    .line 567
    .line 568
    .line 569
    move-result-object v5

    .line 570
    iget-object v5, v5, LO3/D0;->r:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v5, LO3/t0;

    .line 573
    .line 574
    iget-object v5, v5, LO3/t0;->t:LO3/g;

    .line 575
    .line 576
    invoke-virtual {v5}, LO3/g;->t()V

    .line 577
    .line 578
    .line 579
    iget-object v5, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v5, Ljava/lang/String;

    .line 582
    .line 583
    iget-object v4, v4, LO3/h0;->L:LO3/f0;

    .line 584
    .line 585
    invoke-virtual {v4}, LO3/f0;->a()J

    .line 586
    .line 587
    .line 588
    move-result-wide v14

    .line 589
    const-wide/16 v16, -0x1

    .line 590
    .line 591
    add-long v14, v14, v16

    .line 592
    .line 593
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v4

    .line 597
    iget-object v9, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v9, LO3/t0;

    .line 600
    .line 601
    const-string v11, "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version="

    .line 602
    .line 603
    const-string v12, "v130000."

    .line 604
    .line 605
    :try_start_3
    invoke-static {v5}, Lx3/A;->d(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    invoke-static {v8}, Lx3/A;->d(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0}, LO3/Y1;->U()I

    .line 612
    .line 613
    .line 614
    move-result v0

    .line 615
    new-instance v10, Ljava/lang/StringBuilder;

    .line 616
    .line 617
    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    new-instance v10, Ljava/lang/StringBuilder;

    .line 628
    .line 629
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    const-string v0, "&rdid="

    .line 636
    .line 637
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    const-string v0, "&bundleid="

    .line 644
    .line 645
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    const-string v0, "&retry="

    .line 652
    .line 653
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v10, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    iget-object v5, v9, LO3/t0;->t:LO3/g;

    .line 664
    .line 665
    const-string v10, "debug.deferred.deeplink"

    .line 666
    .line 667
    invoke-virtual {v5, v10}, LO3/g;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v5

    .line 671
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    if-eqz v5, :cond_12

    .line 676
    .line 677
    const-string v5, "&ddl_test=1"

    .line 678
    .line 679
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    goto :goto_d

    .line 684
    :catch_3
    move-exception v0

    .line 685
    goto :goto_e

    .line 686
    :catch_4
    move-exception v0

    .line 687
    goto :goto_e

    .line 688
    :cond_12
    :goto_d
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 689
    .line 690
    .line 691
    move-result v5

    .line 692
    if-nez v5, :cond_14

    .line 693
    .line 694
    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    .line 695
    .line 696
    .line 697
    move-result v5

    .line 698
    const/16 v10, 0x26

    .line 699
    .line 700
    if-eq v5, v10, :cond_13

    .line 701
    .line 702
    const-string v5, "&"

    .line 703
    .line 704
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    :cond_13
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    :cond_14
    new-instance v4, Ljava/net/URL;

    .line 713
    .line 714
    invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 715
    .line 716
    .line 717
    move-object v9, v4

    .line 718
    goto :goto_f

    .line 719
    :goto_e
    iget-object v4, v9, LO3/t0;->v:LO3/X;

    .line 720
    .line 721
    invoke-static {v4}, LO3/t0;->l(LO3/E0;)V

    .line 722
    .line 723
    .line 724
    iget-object v4, v4, LO3/X;->w:LO3/V;

    .line 725
    .line 726
    const-string v5, "Failed to create BOW URL for Deferred Deep Link. exception"

    .line 727
    .line 728
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    invoke-virtual {v4, v0, v5}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    const/4 v9, 0x0

    .line 736
    :goto_f
    if-eqz v9, :cond_17

    .line 737
    .line 738
    invoke-static {v7}, LO3/t0;->l(LO3/E0;)V

    .line 739
    .line 740
    .line 741
    new-instance v12, LO3/r0;

    .line 742
    .line 743
    invoke-direct {v12, v3}, LO3/r0;-><init>(LO3/t0;)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v7}, LO3/E0;->q()V

    .line 747
    .line 748
    .line 749
    iget-object v0, v6, LO3/t0;->w:LO3/p0;

    .line 750
    .line 751
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 752
    .line 753
    .line 754
    new-instance v6, LO3/a0;

    .line 755
    .line 756
    const/4 v10, 0x0

    .line 757
    const/4 v11, 0x0

    .line 758
    invoke-direct/range {v6 .. v12}, LO3/a0;-><init>(LO3/f1;Ljava/lang/String;Ljava/net/URL;[BLjava/util/HashMap;LO3/d1;)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v0, v6}, LO3/p0;->A(Ljava/lang/Runnable;)V

    .line 762
    .line 763
    .line 764
    goto :goto_11

    .line 765
    :cond_15
    invoke-static {v5}, LO3/t0;->l(LO3/E0;)V

    .line 766
    .line 767
    .line 768
    iget-object v0, v5, LO3/X;->z:LO3/V;

    .line 769
    .line 770
    const-string v3, "Network is not available for Deferred Deep Link request. Skipping"

    .line 771
    .line 772
    invoke-virtual {v0, v3}, LO3/V;->b(Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    goto :goto_11

    .line 776
    :cond_16
    :goto_10
    invoke-static {v5}, LO3/t0;->l(LO3/E0;)V

    .line 777
    .line 778
    .line 779
    iget-object v0, v5, LO3/X;->E:LO3/V;

    .line 780
    .line 781
    const-string v3, "ADID unavailable to retrieve Deferred Deep Link. Skipping"

    .line 782
    .line 783
    invoke-virtual {v0, v3}, LO3/V;->b(Ljava/lang/String;)V

    .line 784
    .line 785
    .line 786
    :cond_17
    :goto_11
    if-eqz v13, :cond_18

    .line 787
    .line 788
    iget-object v0, v2, LO3/b1;->K:LO3/P0;

    .line 789
    .line 790
    const-wide/16 v2, 0x7d0

    .line 791
    .line 792
    invoke-virtual {v0, v2, v3}, LO3/o;->b(J)V

    .line 793
    .line 794
    .line 795
    :cond_18
    return-void

    .line 796
    :pswitch_0
    iget-object v0, v1, LO3/P0;->f:LO3/b1;

    .line 797
    .line 798
    invoke-virtual {v0}, LO3/b1;->u()V

    .line 799
    .line 800
    .line 801
    return-void

    .line 802
    :pswitch_1
    iget-object v0, v1, LO3/P0;->f:LO3/b1;

    .line 803
    .line 804
    invoke-virtual {v0}, LO3/b1;->M()V

    .line 805
    .line 806
    .line 807
    return-void

    .line 808
    :pswitch_2
    new-instance v0, Ljava/lang/Thread;

    .line 809
    .line 810
    iget-object v2, v1, LO3/P0;->f:LO3/b1;

    .line 811
    .line 812
    iget-object v2, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 813
    .line 814
    check-cast v2, LO3/t0;

    .line 815
    .line 816
    iget-object v2, v2, LO3/t0;->C:LO3/b1;

    .line 817
    .line 818
    invoke-static {v2}, LO3/t0;->k(LO3/H;)V

    .line 819
    .line 820
    .line 821
    new-instance v3, LO3/O0;

    .line 822
    .line 823
    const/4 v4, 0x0

    .line 824
    invoke-direct {v3, v2, v4}, LO3/O0;-><init>(LO3/b1;I)V

    .line 825
    .line 826
    .line 827
    invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 831
    .line 832
    .line 833
    return-void

    .line 834
    nop

    .line 835
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
