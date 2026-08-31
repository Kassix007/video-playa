.class public final LO3/T0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Z

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LO3/Y0;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LO3/T0;->q:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, LO3/T0;->t:Z

    iput-object p3, p0, LO3/T0;->u:Ljava/lang/Object;

    iput-object p4, p0, LO3/T0;->r:Ljava/lang/Object;

    iput-object p5, p0, LO3/T0;->s:Ljava/lang/Object;

    iput-object p1, p0, LO3/T0;->v:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LO3/b1;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LO3/T0;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/T0;->u:Ljava/lang/Object;

    iput-object p3, p0, LO3/T0;->r:Ljava/lang/Object;

    iput-object p4, p0, LO3/T0;->s:Ljava/lang/Object;

    iput-boolean p5, p0, LO3/T0;->t:Z

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/T0;->v:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LO3/w1;LO3/a2;ZLO3/u;Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LO3/T0;->q:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/T0;->u:Ljava/lang/Object;

    iput-boolean p3, p0, LO3/T0;->t:Z

    iput-object p4, p0, LO3/T0;->r:Ljava/lang/Object;

    iput-object p5, p0, LO3/T0;->s:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/T0;->v:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/L;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LO3/T0;->q:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/T0;->u:Ljava/lang/Object;

    iput-object p3, p0, LO3/T0;->r:Ljava/lang/Object;

    iput-object p4, p0, LO3/T0;->s:Ljava/lang/Object;

    iput-boolean p5, p0, LO3/T0;->t:Z

    iput-object p1, p0, LO3/T0;->v:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LO3/T0;->q:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, LO3/T0;->u:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LO3/a2;

    .line 11
    .line 12
    iget-object v2, v1, LO3/T0;->v:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, LO3/w1;

    .line 15
    .line 16
    iget-object v3, v2, LO3/w1;->u:LO3/I;

    .line 17
    .line 18
    iget-object v4, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, LO3/t0;

    .line 21
    .line 22
    const-string v5, "Failed to send default event parameters to service"

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    iget-object v0, v4, LO3/t0;->v:LO3/X;

    .line 27
    .line 28
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 32
    .line 33
    invoke-virtual {v0, v5}, LO3/V;->b(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget-object v6, v4, LO3/t0;->t:LO3/g;

    .line 38
    .line 39
    sget-object v7, LO3/F;->c1:LO3/E;

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    invoke-virtual {v6, v8, v7}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    iget-boolean v4, v1, LO3/T0;->t:Z

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object v4, v1, LO3/T0;->r:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v8, v4

    .line 56
    check-cast v8, LO3/u;

    .line 57
    .line 58
    :goto_0
    invoke-virtual {v2, v3, v8, v0}, LO3/w1;->G(LO3/I;Ly3/a;LO3/a2;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    :try_start_0
    iget-object v6, v1, LO3/T0;->s:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v6, Landroid/os/Bundle;

    .line 65
    .line 66
    invoke-interface {v3, v0, v6}, LO3/I;->E(LO3/a2;Landroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, LO3/w1;->B()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catch_0
    move-exception v0

    .line 74
    iget-object v2, v4, LO3/t0;->v:LO3/X;

    .line 75
    .line 76
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 77
    .line 78
    .line 79
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 80
    .line 81
    invoke-virtual {v2, v0, v5}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    return-void

    .line 85
    :pswitch_0
    const-string v0, "gclid="

    .line 86
    .line 87
    iget-object v2, v1, LO3/T0;->v:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v2, LO3/Y0;

    .line 90
    .line 91
    iget-object v3, v2, LO3/Y0;->q:LO3/b1;

    .line 92
    .line 93
    invoke-virtual {v3}, LO3/C;->o()V

    .line 94
    .line 95
    .line 96
    iget-object v4, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, LO3/t0;

    .line 99
    .line 100
    iget-object v5, v3, LO3/b1;->I:LO3/r0;

    .line 101
    .line 102
    iget-object v6, v1, LO3/T0;->s:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v6, Ljava/lang/String;

    .line 105
    .line 106
    iget-object v7, v1, LO3/T0;->u:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v7, Landroid/net/Uri;

    .line 109
    .line 110
    :try_start_1
    iget-object v8, v4, LO3/t0;->y:LO3/Y1;

    .line 111
    .line 112
    iget-object v9, v4, LO3/t0;->v:LO3/X;

    .line 113
    .line 114
    invoke-static {v8}, LO3/t0;->j(LO3/D0;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3

    .line 115
    .line 116
    .line 117
    :try_start_2
    const-string v10, "https://google.com/search?"

    .line 118
    .line 119
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v11
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 123
    const-string v12, "_cis"

    .line 124
    .line 125
    const-string v13, "Activity created with data \'referrer\' without required params"

    .line 126
    .line 127
    const-string v14, "utm_medium"

    .line 128
    .line 129
    const-string v15, "utm_source"

    .line 130
    .line 131
    move/from16 v16, v11

    .line 132
    .line 133
    const-string v11, "utm_campaign"

    .line 134
    .line 135
    move-object/from16 v17, v2

    .line 136
    .line 137
    const-string v2, "gclid"

    .line 138
    .line 139
    if-eqz v16, :cond_3

    .line 140
    .line 141
    move-object/from16 v16, v9

    .line 142
    .line 143
    :goto_2
    const/4 v8, 0x0

    .line 144
    goto :goto_4

    .line 145
    :cond_3
    :try_start_3
    invoke-virtual {v6, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v16

    .line 149
    if-nez v16, :cond_4

    .line 150
    .line 151
    move-object/from16 v16, v9

    .line 152
    .line 153
    const-string v9, "gbraid"

    .line 154
    .line 155
    invoke-virtual {v6, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-nez v9, :cond_5

    .line 160
    .line 161
    invoke-virtual {v6, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    if-nez v9, :cond_5

    .line 166
    .line 167
    invoke-virtual {v6, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-nez v9, :cond_5

    .line 172
    .line 173
    invoke-virtual {v6, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    if-nez v9, :cond_5

    .line 178
    .line 179
    const-string v9, "utm_id"

    .line 180
    .line 181
    invoke-virtual {v6, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    if-nez v9, :cond_5

    .line 186
    .line 187
    const-string v9, "dclid"

    .line 188
    .line 189
    invoke-virtual {v6, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    if-nez v9, :cond_5

    .line 194
    .line 195
    const-string v9, "srsltid"

    .line 196
    .line 197
    invoke-virtual {v6, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    if-nez v9, :cond_5

    .line 202
    .line 203
    const-string v9, "sfmc_id"

    .line 204
    .line 205
    invoke-virtual {v6, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    if-nez v9, :cond_5

    .line 210
    .line 211
    iget-object v8, v8, LO3/D0;->r:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v8, LO3/t0;

    .line 214
    .line 215
    iget-object v8, v8, LO3/t0;->v:LO3/X;

    .line 216
    .line 217
    invoke-static {v8}, LO3/t0;->l(LO3/E0;)V

    .line 218
    .line 219
    .line 220
    iget-object v8, v8, LO3/X;->D:LO3/V;

    .line 221
    .line 222
    invoke-virtual {v8, v13}, LO3/V;->b(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :catch_1
    move-exception v0

    .line 227
    :goto_3
    move-object/from16 v2, v17

    .line 228
    .line 229
    goto/16 :goto_8

    .line 230
    .line 231
    :cond_4
    move-object/from16 v16, v9

    .line 232
    .line 233
    :cond_5
    invoke-virtual {v10, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    invoke-virtual {v8, v9}, LO3/Y1;->n0(Landroid/net/Uri;)Landroid/os/Bundle;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    if-eqz v8, :cond_6

    .line 246
    .line 247
    const-string v9, "referrer"

    .line 248
    .line 249
    invoke-virtual {v8, v12, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 250
    .line 251
    .line 252
    :cond_6
    :goto_4
    iget-object v9, v1, LO3/T0;->r:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v9, Ljava/lang/String;

    .line 255
    .line 256
    iget-boolean v10, v1, LO3/T0;->t:Z

    .line 257
    .line 258
    move/from16 v18, v10

    .line 259
    .line 260
    const-string v10, "_cmp"

    .line 261
    .line 262
    if-eqz v18, :cond_8

    .line 263
    .line 264
    :try_start_4
    iget-object v1, v4, LO3/t0;->y:LO3/Y1;

    .line 265
    .line 266
    invoke-static {v1}, LO3/t0;->j(LO3/D0;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v7}, LO3/Y1;->n0(Landroid/net/Uri;)Landroid/os/Bundle;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    if-eqz v1, :cond_8

    .line 274
    .line 275
    const-string v7, "intent"

    .line 276
    .line 277
    invoke-virtual {v1, v12, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    if-nez v7, :cond_7

    .line 285
    .line 286
    if-eqz v8, :cond_7

    .line 287
    .line 288
    invoke-virtual {v8, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    if-eqz v7, :cond_7

    .line 293
    .line 294
    const-string v7, "_cer"

    .line 295
    .line 296
    invoke-virtual {v8, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    move-object/from16 v18, v13

    .line 301
    .line 302
    new-instance v13, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v13, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v1, v7, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_7
    move-object/from16 v18, v13

    .line 319
    .line 320
    :goto_5
    invoke-virtual {v3, v9, v10, v1}, LO3/b1;->v(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v5, v9, v1}, LO3/r0;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 324
    .line 325
    .line 326
    goto :goto_6

    .line 327
    :cond_8
    move-object/from16 v18, v13

    .line 328
    .line 329
    :goto_6
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_9

    .line 334
    .line 335
    goto/16 :goto_9

    .line 336
    .line 337
    :cond_9
    invoke-static/range {v16 .. v16}, LO3/t0;->l(LO3/E0;)V

    .line 338
    .line 339
    .line 340
    move-object/from16 v0, v16

    .line 341
    .line 342
    iget-object v1, v0, LO3/X;->D:LO3/V;

    .line 343
    .line 344
    const-string v7, "Activity created with referrer"

    .line 345
    .line 346
    invoke-virtual {v1, v6, v7}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    iget-object v7, v4, LO3/t0;->t:LO3/g;

    .line 350
    .line 351
    sget-object v12, LO3/F;->G0:LO3/E;

    .line 352
    .line 353
    const/4 v13, 0x0

    .line 354
    invoke-virtual {v7, v13, v12}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 355
    .line 356
    .line 357
    move-result v7

    .line 358
    if-eqz v7, :cond_b

    .line 359
    .line 360
    if-eqz v8, :cond_a

    .line 361
    .line 362
    invoke-virtual {v3, v9, v10, v8}, LO3/b1;->v(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v5, v9, v8}, LO3/r0;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 366
    .line 367
    .line 368
    goto :goto_7

    .line 369
    :cond_a
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 370
    .line 371
    .line 372
    const-string v0, "Referrer does not contain valid parameters"

    .line 373
    .line 374
    invoke-virtual {v1, v6, v0}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    :goto_7
    iget-object v0, v4, LO3/t0;->A:LB3/a;

    .line 378
    .line 379
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 383
    .line 384
    .line 385
    move-result-wide v8

    .line 386
    const-string v4, "auto"

    .line 387
    .line 388
    const-string v5, "_ldl"

    .line 389
    .line 390
    const/4 v7, 0x1

    .line 391
    move-object v6, v13

    .line 392
    invoke-virtual/range {v3 .. v9}, LO3/b1;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    .line 393
    .line 394
    .line 395
    goto :goto_9

    .line 396
    :cond_b
    invoke-virtual {v6, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    if-eqz v2, :cond_d

    .line 401
    .line 402
    invoke-virtual {v6, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    if-nez v2, :cond_c

    .line 407
    .line 408
    invoke-virtual {v6, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    if-nez v2, :cond_c

    .line 413
    .line 414
    invoke-virtual {v6, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    if-nez v2, :cond_c

    .line 419
    .line 420
    const-string v2, "utm_term"

    .line 421
    .line 422
    invoke-virtual {v6, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    if-nez v2, :cond_c

    .line 427
    .line 428
    const-string v2, "utm_content"

    .line 429
    .line 430
    invoke-virtual {v6, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    if-eqz v2, :cond_d

    .line 435
    .line 436
    :cond_c
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    if-nez v0, :cond_e

    .line 441
    .line 442
    iget-object v0, v4, LO3/t0;->A:LB3/a;

    .line 443
    .line 444
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 448
    .line 449
    .line 450
    move-result-wide v8

    .line 451
    const-string v4, "auto"

    .line 452
    .line 453
    const-string v5, "_ldl"

    .line 454
    .line 455
    const/4 v7, 0x1

    .line 456
    invoke-virtual/range {v3 .. v9}, LO3/b1;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    .line 457
    .line 458
    .line 459
    goto :goto_9

    .line 460
    :cond_d
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 461
    .line 462
    .line 463
    move-object/from16 v0, v18

    .line 464
    .line 465
    invoke-virtual {v1, v0}, LO3/V;->b(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    .line 466
    .line 467
    .line 468
    goto :goto_9

    .line 469
    :catch_2
    move-exception v0

    .line 470
    move-object/from16 v17, v2

    .line 471
    .line 472
    goto :goto_8

    .line 473
    :catch_3
    move-exception v0

    .line 474
    move-object/from16 v17, v2

    .line 475
    .line 476
    goto/16 :goto_3

    .line 477
    .line 478
    :goto_8
    iget-object v1, v2, LO3/Y0;->q:LO3/b1;

    .line 479
    .line 480
    iget-object v1, v1, LO3/D0;->r:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v1, LO3/t0;

    .line 483
    .line 484
    iget-object v1, v1, LO3/t0;->v:LO3/X;

    .line 485
    .line 486
    invoke-static {v1}, LO3/t0;->l(LO3/E0;)V

    .line 487
    .line 488
    .line 489
    iget-object v1, v1, LO3/X;->w:LO3/V;

    .line 490
    .line 491
    const-string v2, "Throwable caught in handleReferrerForOnActivityCreated"

    .line 492
    .line 493
    invoke-virtual {v1, v0, v2}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    :cond_e
    :goto_9
    return-void

    .line 497
    :pswitch_1
    iget-object v0, v1, LO3/T0;->r:Ljava/lang/Object;

    .line 498
    .line 499
    move-object v5, v0

    .line 500
    check-cast v5, Ljava/lang/String;

    .line 501
    .line 502
    iget-object v0, v1, LO3/T0;->s:Ljava/lang/Object;

    .line 503
    .line 504
    move-object v6, v0

    .line 505
    check-cast v6, Ljava/lang/String;

    .line 506
    .line 507
    iget-object v0, v1, LO3/T0;->v:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v0, LO3/b1;

    .line 510
    .line 511
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v0, LO3/t0;

    .line 514
    .line 515
    invoke-virtual {v0}, LO3/t0;->o()LO3/w1;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    iget-object v0, v1, LO3/T0;->u:Ljava/lang/Object;

    .line 520
    .line 521
    move-object v4, v0

    .line 522
    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 523
    .line 524
    invoke-virtual {v3}, LO3/C;->o()V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v3}, LO3/H;->p()V

    .line 528
    .line 529
    .line 530
    const/4 v0, 0x0

    .line 531
    invoke-virtual {v3, v0}, LO3/w1;->E(Z)LO3/a2;

    .line 532
    .line 533
    .line 534
    move-result-object v7

    .line 535
    new-instance v2, LO3/n1;

    .line 536
    .line 537
    iget-boolean v8, v1, LO3/T0;->t:Z

    .line 538
    .line 539
    invoke-direct/range {v2 .. v8}, LO3/n1;-><init>(LO3/w1;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;LO3/a2;Z)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v3, v2}, LO3/w1;->C(Ljava/lang/Runnable;)V

    .line 543
    .line 544
    .line 545
    return-void

    .line 546
    :pswitch_2
    iget-object v0, v1, LO3/T0;->v:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 549
    .line 550
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c:LO3/t0;

    .line 551
    .line 552
    invoke-virtual {v0}, LO3/t0;->o()LO3/w1;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    iget-object v0, v1, LO3/T0;->u:Ljava/lang/Object;

    .line 557
    .line 558
    move-object v8, v0

    .line 559
    check-cast v8, Lcom/google/android/gms/internal/measurement/L;

    .line 560
    .line 561
    iget-object v0, v1, LO3/T0;->r:Ljava/lang/Object;

    .line 562
    .line 563
    move-object v4, v0

    .line 564
    check-cast v4, Ljava/lang/String;

    .line 565
    .line 566
    iget-object v0, v1, LO3/T0;->s:Ljava/lang/Object;

    .line 567
    .line 568
    move-object v5, v0

    .line 569
    check-cast v5, Ljava/lang/String;

    .line 570
    .line 571
    invoke-virtual {v3}, LO3/C;->o()V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v3}, LO3/H;->p()V

    .line 575
    .line 576
    .line 577
    const/4 v0, 0x0

    .line 578
    invoke-virtual {v3, v0}, LO3/w1;->E(Z)LO3/a2;

    .line 579
    .line 580
    .line 581
    move-result-object v6

    .line 582
    new-instance v2, LO3/n1;

    .line 583
    .line 584
    iget-boolean v7, v1, LO3/T0;->t:Z

    .line 585
    .line 586
    invoke-direct/range {v2 .. v8}, LO3/n1;-><init>(LO3/w1;Ljava/lang/String;Ljava/lang/String;LO3/a2;ZLcom/google/android/gms/internal/measurement/L;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v3, v2}, LO3/w1;->C(Ljava/lang/Runnable;)V

    .line 590
    .line 591
    .line 592
    return-void

    .line 593
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
